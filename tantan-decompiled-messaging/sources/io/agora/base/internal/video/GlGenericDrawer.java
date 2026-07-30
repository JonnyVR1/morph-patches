package io.agora.base.internal.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final String ALPHA_VERTEX_SHADER_STRING = "varying vec2 tc;\nvarying vec2 channelCoordinates[4];\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nuniform float texelWidthOffset;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n  vec2 singleStepOffset = vec2(texelWidthOffset, 0.0);\n  channelCoordinates[0] = tc - 1.5 * singleStepOffset;\n  channelCoordinates[1] = channelCoordinates[0] + singleStepOffset;\n  channelCoordinates[2] = channelCoordinates[1] + singleStepOffset;\n  channelCoordinates[3] = channelCoordinates[2] + singleStepOffset;\n}\n";
    private static final String DEBANDING_FUNCTION = "float oetf_hlg(float x) \n{ \n  x = max(x, 0.0); \n  if (x <= (1.0/2.0)) \n{ \n    x = (x * x) * (1.0 / 3.0); \n} \n  else \n{ \n    x = (exp((x - 0.55991073) / 0.17883277) + 0.28466892) / 12.0; \n} \n  return x; \n} \nvec3 debanding() {\n  vec3 rgb_origin = sample(tc).rgb;\n  vec3 rgb_l1 = sample(texBlurShift_l1).rgb;\n  vec3 rgb_l2 = sample(texBlurShift_l2).rgb;\n  vec3 rgb_r1 = sample(texBlurShift_r1).rgb;\n  vec3 rgb_r2 = sample(texBlurShift_r2).rgb;\n  vec3 rgb_u1 = sample(texBlurShift_u1).rgb;\n  vec3 rgb_u2 = sample(texBlurShift_u2).rgb;\n  vec3 rgb_d1 = sample(texBlurShift_d1).rgb;\n  vec3 rgb_d2 = sample(texBlurShift_d2).rgb;\n  float y_origin = clamp(rgb_origin.r * 0.2627 + rgb_origin.g * 0.678 + rgb_origin.b * 0.0593, 0.0, 1.0); \n  float y_l1 = clamp(rgb_l1.r * 0.2627 + rgb_l1.g * 0.678 + rgb_l1.b * 0.0593, 0.0, 1.0); \n  float y_l2 = clamp(rgb_l2.r * 0.2627 + rgb_l2.g * 0.678 + rgb_l2.b * 0.0593, 0.0, 1.0); \n  float y_r1 = clamp(rgb_r1.r * 0.2627 + rgb_r1.g * 0.678 + rgb_r1.b * 0.0593, 0.0, 1.0); \n  float y_r2 = clamp(rgb_r2.r * 0.2627 + rgb_r2.g * 0.678 + rgb_r2.b * 0.0593, 0.0, 1.0); \n  float y_u1 = clamp(rgb_u1.r * 0.2627 + rgb_u1.g * 0.678 + rgb_u1.b * 0.0593, 0.0, 1.0); \n  float y_u2 = clamp(rgb_u2.r * 0.2627 + rgb_u2.g * 0.678 + rgb_u2.b * 0.0593, 0.0, 1.0); \n  float y_d1 = clamp(rgb_d1.r * 0.2627 + rgb_d1.g * 0.678 + rgb_d1.b * 0.0593, 0.0, 1.0); \n  float y_d2 = clamp(rgb_d2.r * 0.2627 + rgb_d2.g * 0.678 + rgb_d2.b * 0.0593, 0.0, 1.0); \n  float y_temp = y_origin - 1.0 / 255.0; \n  float y_delta = 2.0 * (oetf_hlg(y_origin) - oetf_hlg(y_temp)); \n  float diff_l1 = abs(y_origin - y_l1); \n  float diff_l2 = abs(y_origin - y_l2); \n  float diff_r1 = abs(y_origin - y_r1); \n  float diff_r2 = abs(y_origin - y_r2); \n  float diff_u1 = abs(y_origin - y_u1); \n  float diff_u2 = abs(y_origin - y_u2); \n  float diff_d1 = abs(y_origin - y_d1); \n  float diff_d2 = abs(y_origin - y_d2); \n  float is_less_than_delta = step(y_delta, max(max(max(max(max(max(max(diff_l1, diff_l2), diff_r1), diff_r2), diff_u1), diff_u2), diff_d1), diff_d2)); \n  highp vec3 sum = rgb_origin; \n  sum += rgb_l1; \n  sum += rgb_r1; \n  sum += rgb_u1; \n  sum += rgb_d1; \n  vec3 rgbOut = mix(rgb_origin, sum * 0.2, 1.0 - is_less_than_delta); \n  return rgbOut; \n}\n";
    private static final String DEFAULT_VERTEX_SHADER_STRING = "precision mediump float;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvarying vec2 tc;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final String HLG_TO_LINEAR = "highp vec3 HLGToLinear(highp vec3 rgb) {\n  rgb = inverse_HLG(rgb);\n  highp vec3 ootf_2020 = vec3(0.2627, 0.6780, 0.0593);\n  highp float ootf_ys = 2000.0 * dot(ootf_2020, rgb);\n  return rgb *= pow(ootf_ys, 0.2);\n}\n";
    private static final String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final String INVERSE_HLG = "highp vec3 inverse_HLG(highp vec3 rgb) {\n  const highp float B67_a = 0.17883277;\n  const highp float B67_b = 0.28466892;\n  const highp float B67_c = 0.55991073;\n  if (rgb.x <= 0.5) rgb.x=(rgb.x * 2.0) * (rgb.x * 2.0);\n  else rgb.x = exp((rgb.x - B67_c) / B67_a) + B67_b;\n  if (rgb.y <= 0.5) rgb.y=(rgb.y * 2.0) * (rgb.y * 2.0);\n  else rgb.y = exp((rgb.y - B67_c) / B67_a) + B67_b;\n  if (rgb.z <= 0.5) rgb.z=(rgb.z * 2.0) * (rgb.z * 2.0);\n  else rgb.z = exp((rgb.z - B67_c) / B67_a) + B67_b;\n  return rgb;\n}\n";
    private static final String LINEAR_TO_PQ = "highp vec3 LinearToPQ(highp vec3 rgb, highp float divider) {\n  const highp float ST2084_m1 =  2610.0 / (4096.0 * 4.0);\n  const highp float ST2084_m2 = (2523.0 / 4096.0) * 128.0;\n  const highp float ST2084_c1 =  3424.0 / 4096.0;\n  const highp float ST2084_c2 = (2413.0 / 4096.0) * 32.0;\n  const highp float ST2084_c3 = (2392.0 / 4096.0) * 32.0;\n  rgb /= divider;\n  rgb = pow(rgb, vec3(ST2084_m1));\n  rgb = (ST2084_c1 + ST2084_c2 * rgb) / (1.0 + ST2084_c3 * rgb);\n  return rgb = pow(rgb, vec3(ST2084_m2));\n}\n";
    private static final String LUT_FUNCTION = "vec4 getLutRgb(vec3 yuv_in) {\nvec2 r_floor;\nvec2 r_ceil;\nvec3 Pos = yuv_in * 63.0;\nr_floor.y = floor(floor(Pos.x) * 0.125);\nr_floor.x = floor(Pos.x) - (r_floor.y * 8.0);\nfloat g_floor = floor(Pos.y);\nfloat b_floor = floor(Pos.z);\nr_ceil.y = floor(ceil(Pos.x) * 0.125);\nr_ceil.x = ceil(Pos.x) - (r_ceil.y * 8.0);\nfloat g_ceil = ceil(Pos.y);\nfloat b_ceil = ceil(Pos.z);\nfloat r_fract = fract(Pos.x);\nfloat g_fract = fract(Pos.y);\nfloat b_fract = fract(Pos.z);\nvec4 c000 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c001 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c010 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c011 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c100 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c101 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c110 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c111 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c00 = mix(c000, c100, r_fract);\nvec4 c01 = mix(c001, c101, r_fract);\nvec4 c10 = mix(c010, c110, r_fract);\nvec4 c11 = mix(c011, c111, r_fract);\nvec4 c0 = mix(c00, c10, b_fract);\nvec4 c1 = mix(c01, c11, b_fract);\nreturn mix(c0, c1, g_fract).bgra;\n}\n";
    private static final String LUT_FUNCTION_SIMPLE = "vec4 getLutRgb(vec3 yuv_in) {\nfloat yColor = yuv_in.r * 63.0;\nvec2 quad1;\nquad1.y = floor(floor(yColor) * 0.125);\nquad1.x = floor(yColor) - (quad1.y * 8.0);\nvec2 quad2;\nquad2.y = floor(ceil(yColor) * 0.125);\nquad2.x = ceil(yColor) - (quad2.y * 8.0);\nvec2 texPos1;\ntexPos1 = (quad1 * 0.125) + 0.0009766 + (0.123047 * yuv_in.gb);\nvec2 texPos2;\ntexPos2 = (quad2 * 0.125) + 0.0009766 + (0.123047 * yuv_in.gb);\nvec3 rgb1 = texture2D(lutTex, texPos1).rgb;\nvec3 rgb2 = texture2D(lutTex, texPos2).rgb;\nvec3 lutrgb = mix(rgb1, rgb2, fract(yColor));\nreturn vec4(lutrgb, 1.0);\n}\n";
    private static final String RGB2YUV_2020 = "vec3 rgb2yuv_2020(vec3 rgb) {\n  vec3 yuv;\n  yuv.x = 0.2627 * rgb.x + 0.678 * rgb.y + 0.0593 * rgb.z;\n  yuv.y = -0.1396 * rgb.x - 0.3604 * rgb.y + 0.5 * rgb.z + 0.5;\n  yuv.z = 0.5 * rgb.x - 0.4598 * rgb.y - 0.0402 * rgb.z + 0.5;\n  return yuv;\n}\n";
    private static final String RGB2YUV_709 = "vec3 rgb2yuv_709(vec3 rgb) {\n  vec3 yuv;\n  yuv.x = 0.2126 * rgb.x + 0.7152 * rgb.y + 0.0722 * rgb.z;\n  yuv.y = -0.1146 * rgb.x - 0.3854 * rgb.y + 0.5 * rgb.z + 0.5;\n  yuv.z = 0.5 * rgb.x - 0.4542 * rgb.y - 0.0458 * rgb.z + 0.5;\n  return yuv;\n}\n";
    private static final String SDR2HDR_VERTEX_SHADER_STRING = "precision mediump float;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nuniform float texBlurWidthOffset;\nuniform float texBlurHeightOffset;\nvarying vec2 tc;\nvarying vec2 texBlurShift_l1;\nvarying vec2 texBlurShift_l2;\nvarying vec2 texBlurShift_r1;\nvarying vec2 texBlurShift_r2;\nvarying vec2 texBlurShift_u1;\nvarying vec2 texBlurShift_u2;\nvarying vec2 texBlurShift_d1;\nvarying vec2 texBlurShift_d2;\nvoid main() {\n  gl_Position = in_pos;\n  vec2 attUV = (tex_mat * in_tc).xy;\n  tc = attUV;\n  texBlurShift_l1 = vec2(attUV.x, abs(attUV.y - texBlurHeightOffset * 11.0));\n  texBlurShift_l2 = vec2(attUV.x, abs(attUV.y - texBlurHeightOffset * 21.0));\n  texBlurShift_r1 = vec2(attUV.x, attUV.y + texBlurHeightOffset * 11.0);\n  texBlurShift_r2 = vec2(attUV.x, attUV.y + texBlurHeightOffset * 21.0);\n  texBlurShift_u1 = vec2(attUV.x + texBlurWidthOffset * 11.0, attUV.y);\n  texBlurShift_u2 = vec2(attUV.x + texBlurWidthOffset * 21.0, attUV.y);\n  texBlurShift_d1 = vec2(abs(attUV.x - texBlurWidthOffset * 11.0), attUV.y);\n  texBlurShift_d2 = vec2(abs(attUV.x - texBlurWidthOffset * 21.0), attUV.y);\n}\n";
    private static final String TAG = "GlGenericDrawer";
    private static final String TEXTURE_MATRIX_NAME = "tex_mat";

    @Nullable
    private GlShader currentShader;

    @Nullable
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private int lutTextureId;
    private final ShaderCallbacks shaderCallbacks;
    private int texHOffsetLocation;
    private int texMatrixLocation;
    private int texWOffsetLocation;
    private FloatBuffer textureCropCoord;
    private String vertexShader;
    private static float[] g_color601_full = {1.0f, 1.0f, 1.0f, 0.0f, -0.344136f, 1.772f, 1.402f, -0.714136f, 0.0f};
    private static float[] g_color601_limit = {1.164384f, 1.164384f, 1.164384f, 0.0f, -0.391762f, 2.017232f, 1.596027f, -0.812968f, 0.0f};
    private static float[] g_color709_full = {1.0f, 1.0f, 1.0f, 0.0f, -0.187324f, 1.8556f, 1.5748f, -0.468124f, 0.0f};
    private static float[] g_color709_limit = {1.164384f, 1.164384f, 1.164384f, 0.0f, -0.213249f, 2.112402f, 1.792741f, -0.532909f, 0.0f};
    private static float[] g_color2020_full = {1.0f, 1.0f, 1.0f, 0.0f, -0.164553f, 1.8814f, 1.4746f, -0.571353f, 0.0f};
    private static float[] g_color2020_limit = {1.167808f, 1.167808f, 1.167808f, 0.0f, -0.187877f, 2.148072f, 1.683611f, -0.652337f, 0.0f};
    static String alphaYuvGraphFragmentString = "precision mediump float;\nvarying vec2 tc;\nuniform mat3 colorMatrix;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform int alphaStitchMode;\nuniform float colorRangeOffset;\n#define STITCH_MODE_UP   1\n#define STITCH_MODE_DOWN   2\n#define STITCH_MODE_LEFT   3\n#define STITCH_MODE_RIGHT   4\nhighp vec3 yuv,yuv_stitch,rgb;\nvec4 convertTexCoord(vec2 coord, int mode) {\n  if (mode == STITCH_MODE_UP) {\n    return vec4(coord.x, coord.y * 0.5 + 0.5, coord.x, coord.y * 0.5);\n  } else if (mode == STITCH_MODE_DOWN) {\n    return vec4(coord.x, coord.y * 0.5, coord.x, coord.y * 0.5 + 0.5);\n  } else if (mode == STITCH_MODE_LEFT) {\n    return vec4(coord.x * 0.5 + 0.5, coord.y, coord.x * 0.5, coord.y);\n  } else if (mode == STITCH_MODE_RIGHT) {\n    return vec4(coord.x * 0.5, coord.y, coord.x * 0.5 + 0.5, coord.y);\n  } else {\n    return vec4(coord.x, coord.y, coord.x, coord.y);\n  }\n}\nvec4 sample(vec2 p) {\n  vec4 coord = convertTexCoord(p, alphaStitchMode);\n  yuv[0] = clamp(texture2D(y_tex, coord.xy).r, 0.0, 1.0) - colorRangeOffset;\n  yuv[1] = clamp(texture2D(u_tex, coord.xy).r - 0.5, -0.5, 0.5);\n  yuv[2] = clamp(texture2D(v_tex, coord.xy).r - 0.5, -0.5, 0.5);\n  yuv_stitch[0] = clamp(texture2D(y_tex, coord.zw).r, 0.0, 1.0) - colorRangeOffset;\n  yuv_stitch[1] = clamp(texture2D(u_tex, coord.zw).r - 0.5, -0.5, 0.5);\n  yuv_stitch[2] = clamp(texture2D(v_tex, coord.zw).r - 0.5, -0.5, 0.5);\n  rgb = colorMatrix * yuv;\n  rgb = clamp(rgb, 0.0, 1.0);\n  float alpha = clamp((colorMatrix * yuv_stitch).r, 0.0, 1.0);\n  return vec4(rgb, alpha);\n}\nvoid main() {\n  gl_FragColor = sample(tc);\n}\n";
    static String alphaRgbTextureGraphFragmentString = "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D tex;\nuniform int alphaStitchMode;\n#define STITCH_MODE_UP   1\n#define STITCH_MODE_DOWN   2\n#define STITCH_MODE_LEFT   3\n#define STITCH_MODE_RIGHT   4\nvec4 convertTexCoord(vec2 coord, int mode) {\n  if (mode == STITCH_MODE_UP) {\n    return vec4(coord.x, coord.y * 0.5 + 0.5, coord.x, coord.y * 0.5);\n  } else if (mode == STITCH_MODE_DOWN) {\n    return vec4(coord.x, coord.y * 0.5, coord.x, coord.y * 0.5 + 0.5);\n  } else if (mode == STITCH_MODE_LEFT) {\n    return vec4(coord.x * 0.5 + 0.5, coord.y, coord.x * 0.5, coord.y);\n  } else if (mode == STITCH_MODE_RIGHT) {\n    return vec4(coord.x * 0.5, coord.y, coord.x * 0.5 + 0.5, coord.y);\n  } else {\n    return vec4(coord.x, coord.y, coord.x, coord.y);\n  }\n}\nvec4 sample(vec2 p) {\n  vec4 coord = convertTexCoord(p, alphaStitchMode);\n  vec3 rgb = clamp(texture2D(tex, coord.xy).rgb, 0.0, 1.0);\n  float alpha = clamp(texture2D(tex, coord.zw).r, 0.0, 1.0);\n  return vec4(rgb, alpha);\n}\nvoid main() {\n  gl_FragColor = sample(tc);\n}";
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    /* JADX INFO: renamed from: io.agora.base.internal.video.GlGenericDrawer$1 */
    public static /* synthetic */ class C149621 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix;

        static {
            int[] iArr = new int[VideoFrame.ColorSpace.Matrix.values().length];
            $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix = iArr;
            try {
                iArr[VideoFrame.ColorSpace.Matrix.SMPTE170M.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix[VideoFrame.ColorSpace.Matrix.BT470BG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix[VideoFrame.ColorSpace.Matrix.BT709.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix[VideoFrame.ColorSpace.Matrix.BT2020_NCL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix[VideoFrame.ColorSpace.Matrix.BT2020_CL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix[VideoFrame.ColorSpace.Matrix.Unspecified.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4);
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV,
        ALPHA,
        OESA,
        RGBA,
        ALPAH_YUV_STITCH_GRAPH,
        ALPAH_OES_STITCH_GRAPH,
        ALPAH_RGBA_STITCH_GRAPH
    }

    public GlGenericDrawer(String str, String str2, FloatBuffer floatBuffer, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.textureCropCoord = floatBuffer;
        this.shaderCallbacks = shaderCallbacks;
    }

    public static String createFragmentShaderString(String str, ShaderType shaderType, VideoFrame.ColorSpace colorSpace, boolean z, int i, boolean z2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (shaderType == ShaderType.ALPAH_YUV_STITCH_GRAPH) {
            sb.append(alphaYuvGraphFragmentString);
            return sb.toString();
        }
        if (shaderType == ShaderType.ALPAH_RGBA_STITCH_GRAPH) {
            sb.append(alphaRgbTextureGraphFragmentString);
            return sb.toString();
        }
        ShaderType shaderType2 = ShaderType.OES;
        if (shaderType == shaderType2 || shaderType == ShaderType.OESA) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision highp float;\nvarying vec2 tc;\n");
        if (shaderType == ShaderType.ALPHA) {
            sb.append("varying vec2 channelCoordinates[4];\nuniform sampler2D tex;\nhighp vec4 outData;\nvec4 sample(vec2 p) {\n  outData[0] = clamp(texture2D(tex, channelCoordinates[0]).a, 0.0, 1.0);\n  outData[1] = clamp(texture2D(tex, channelCoordinates[1]).a, 0.0, 1.0);\n  outData[2] = clamp(texture2D(tex, channelCoordinates[2]).a, 0.0, 1.0);\n  outData[3] = clamp(texture2D(tex, channelCoordinates[3]).a, 0.0, 1.0);\n  return outData;\n}\n");
            sb.append(str);
            return sb.toString();
        }
        ShaderType shaderType3 = ShaderType.YUV;
        if (shaderType == shaderType3) {
            if (!HdrUtil.isNeedHdrSdrTrans(i)) {
                sb.append("uniform mat3 colorMatrix;\n");
            }
            sb.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform sampler2D a_tex;\nhighp vec3 yuv,rgb;\n");
        } else {
            ShaderType shaderType4 = ShaderType.OESA;
            if (shaderType == shaderType4 || shaderType == ShaderType.RGBA) {
                str2 = shaderType == shaderType4 ? "samplerExternalOES" : "sampler2D";
                sb.append("uniform ");
                sb.append(str2);
                sb.append(" tex;\nuniform sampler2D a_tex;\nhighp vec4 outData;\n");
            } else {
                str2 = shaderType == shaderType2 ? "samplerExternalOES" : "sampler2D";
                sb.append("uniform ");
                sb.append(str2);
                sb.append(" tex;\nhighp vec4 outData;\n");
            }
        }
        if (HdrUtil.isNeedTransToSdrVision(i) && z2) {
            sb.append("uniform highp sampler2D lutTex;\nvec4 getLutRgb(vec3 yuv_in) {\nvec2 r_floor;\nvec2 r_ceil;\nvec3 Pos = yuv_in * 63.0;\nr_floor.y = floor(floor(Pos.x) * 0.125);\nr_floor.x = floor(Pos.x) - (r_floor.y * 8.0);\nfloat g_floor = floor(Pos.y);\nfloat b_floor = floor(Pos.z);\nr_ceil.y = floor(ceil(Pos.x) * 0.125);\nr_ceil.x = ceil(Pos.x) - (r_ceil.y * 8.0);\nfloat g_ceil = ceil(Pos.y);\nfloat b_ceil = ceil(Pos.z);\nfloat r_fract = fract(Pos.x);\nfloat g_fract = fract(Pos.y);\nfloat b_fract = fract(Pos.z);\nvec4 c000 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c001 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c010 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c011 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c100 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c101 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c110 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c111 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c00 = mix(c000, c100, r_fract);\nvec4 c01 = mix(c001, c101, r_fract);\nvec4 c10 = mix(c010, c110, r_fract);\nvec4 c11 = mix(c011, c111, r_fract);\nvec4 c0 = mix(c00, c10, b_fract);\nvec4 c1 = mix(c01, c11, b_fract);\nreturn mix(c0, c1, g_fract).bgra;\n}\n");
            if (shaderType != shaderType3) {
                sb.append(RGB2YUV_2020);
            }
        } else if (HdrUtil.isNeedTransToHdrVision(i) && z2) {
            sb.append("varying vec2 texBlurShift_l1;\nvarying vec2 texBlurShift_l2;\nvarying vec2 texBlurShift_r1;\nvarying vec2 texBlurShift_r2;\nvarying vec2 texBlurShift_u1;\nvarying vec2 texBlurShift_u2;\nvarying vec2 texBlurShift_d1;\nvarying vec2 texBlurShift_d2;\nuniform highp sampler2D lutTex;\nvec4 getLutRgb(vec3 yuv_in) {\nvec2 r_floor;\nvec2 r_ceil;\nvec3 Pos = yuv_in * 63.0;\nr_floor.y = floor(floor(Pos.x) * 0.125);\nr_floor.x = floor(Pos.x) - (r_floor.y * 8.0);\nfloat g_floor = floor(Pos.y);\nfloat b_floor = floor(Pos.z);\nr_ceil.y = floor(ceil(Pos.x) * 0.125);\nr_ceil.x = ceil(Pos.x) - (r_ceil.y * 8.0);\nfloat g_ceil = ceil(Pos.y);\nfloat b_ceil = ceil(Pos.z);\nfloat r_fract = fract(Pos.x);\nfloat g_fract = fract(Pos.y);\nfloat b_fract = fract(Pos.z);\nvec4 c000 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c001 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c010 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c011 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c100 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c101 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c110 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c111 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c00 = mix(c000, c100, r_fract);\nvec4 c01 = mix(c001, c101, r_fract);\nvec4 c10 = mix(c010, c110, r_fract);\nvec4 c11 = mix(c011, c111, r_fract);\nvec4 c0 = mix(c00, c10, b_fract);\nvec4 c1 = mix(c01, c11, b_fract);\nreturn mix(c0, c1, g_fract).bgra;\n}\n");
            if (shaderType != shaderType3) {
                sb.append(RGB2YUV_709);
            }
        }
        if (shaderType != shaderType3) {
            VideoFrame.ColorSpace.Transfer transfer = VideoFrame.ColorSpace.Transfer.ARIB_STD_B67;
            if (i == transfer.getTransfer() || (HdrUtil.isNeedTransToHdrVision(i) && z2)) {
                sb.append("highp vec3 inverse_HLG(highp vec3 rgb) {\n  const highp float B67_a = 0.17883277;\n  const highp float B67_b = 0.28466892;\n  const highp float B67_c = 0.55991073;\n  if (rgb.x <= 0.5) rgb.x=(rgb.x * 2.0) * (rgb.x * 2.0);\n  else rgb.x = exp((rgb.x - B67_c) / B67_a) + B67_b;\n  if (rgb.y <= 0.5) rgb.y=(rgb.y * 2.0) * (rgb.y * 2.0);\n  else rgb.y = exp((rgb.y - B67_c) / B67_a) + B67_b;\n  if (rgb.z <= 0.5) rgb.z=(rgb.z * 2.0) * (rgb.z * 2.0);\n  else rgb.z = exp((rgb.z - B67_c) / B67_a) + B67_b;\n  return rgb;\n}\nhighp vec3 HLGToLinear(highp vec3 rgb) {\n  rgb = inverse_HLG(rgb);\n  highp vec3 ootf_2020 = vec3(0.2627, 0.6780, 0.0593);\n  highp float ootf_ys = 2000.0 * dot(ootf_2020, rgb);\n  return rgb *= pow(ootf_ys, 0.2);\n}\nhighp vec3 LinearToPQ(highp vec3 rgb, highp float divider) {\n  const highp float ST2084_m1 =  2610.0 / (4096.0 * 4.0);\n  const highp float ST2084_m2 = (2523.0 / 4096.0) * 128.0;\n  const highp float ST2084_c1 =  3424.0 / 4096.0;\n  const highp float ST2084_c2 = (2413.0 / 4096.0) * 32.0;\n  const highp float ST2084_c3 = (2392.0 / 4096.0) * 32.0;\n  rgb /= divider;\n  rgb = pow(rgb, vec3(ST2084_m1));\n  rgb = (ST2084_c1 + ST2084_c2 * rgb) / (1.0 + ST2084_c3 * rgb);\n  return rgb = pow(rgb, vec3(ST2084_m2));\n}\n");
            }
            if (HdrUtil.isNeedTransToSdrVision(i) && z2) {
                sb.append("vec4 sample(vec2 p) {\n  vec3 rgb = texture2D(tex, p).rgb;\n  vec3 yuv = rgb2yuv_2020(rgb);\n  outData = getLutRgb(yuv);\n");
                if (shaderType == ShaderType.OESA || shaderType == ShaderType.RGBA) {
                    sb.append("  outData[3] = clamp(texture2D(a_tex, p).a, 0.0, 1.0);\n");
                }
                sb.append("  return outData;\n}\n");
                sb.append(str);
            } else if (HdrUtil.isNeedTransToHdrVision(i) && z2) {
                sb.append("vec4 sample(vec2 p) {\n  vec3 rgb = texture2D(tex, p).rgb;\n  vec3 yuv = rgb2yuv_709(rgb);\n  yuv = clamp(yuv, 0.0, 1.0);\n  return getLutRgb(yuv);\n}\nfloat oetf_hlg(float x) \n{ \n  x = max(x, 0.0); \n  if (x <= (1.0/2.0)) \n{ \n    x = (x * x) * (1.0 / 3.0); \n} \n  else \n{ \n    x = (exp((x - 0.55991073) / 0.17883277) + 0.28466892) / 12.0; \n} \n  return x; \n} \nvec3 debanding() {\n  vec3 rgb_origin = sample(tc).rgb;\n  vec3 rgb_l1 = sample(texBlurShift_l1).rgb;\n  vec3 rgb_l2 = sample(texBlurShift_l2).rgb;\n  vec3 rgb_r1 = sample(texBlurShift_r1).rgb;\n  vec3 rgb_r2 = sample(texBlurShift_r2).rgb;\n  vec3 rgb_u1 = sample(texBlurShift_u1).rgb;\n  vec3 rgb_u2 = sample(texBlurShift_u2).rgb;\n  vec3 rgb_d1 = sample(texBlurShift_d1).rgb;\n  vec3 rgb_d2 = sample(texBlurShift_d2).rgb;\n  float y_origin = clamp(rgb_origin.r * 0.2627 + rgb_origin.g * 0.678 + rgb_origin.b * 0.0593, 0.0, 1.0); \n  float y_l1 = clamp(rgb_l1.r * 0.2627 + rgb_l1.g * 0.678 + rgb_l1.b * 0.0593, 0.0, 1.0); \n  float y_l2 = clamp(rgb_l2.r * 0.2627 + rgb_l2.g * 0.678 + rgb_l2.b * 0.0593, 0.0, 1.0); \n  float y_r1 = clamp(rgb_r1.r * 0.2627 + rgb_r1.g * 0.678 + rgb_r1.b * 0.0593, 0.0, 1.0); \n  float y_r2 = clamp(rgb_r2.r * 0.2627 + rgb_r2.g * 0.678 + rgb_r2.b * 0.0593, 0.0, 1.0); \n  float y_u1 = clamp(rgb_u1.r * 0.2627 + rgb_u1.g * 0.678 + rgb_u1.b * 0.0593, 0.0, 1.0); \n  float y_u2 = clamp(rgb_u2.r * 0.2627 + rgb_u2.g * 0.678 + rgb_u2.b * 0.0593, 0.0, 1.0); \n  float y_d1 = clamp(rgb_d1.r * 0.2627 + rgb_d1.g * 0.678 + rgb_d1.b * 0.0593, 0.0, 1.0); \n  float y_d2 = clamp(rgb_d2.r * 0.2627 + rgb_d2.g * 0.678 + rgb_d2.b * 0.0593, 0.0, 1.0); \n  float y_temp = y_origin - 1.0 / 255.0; \n  float y_delta = 2.0 * (oetf_hlg(y_origin) - oetf_hlg(y_temp)); \n  float diff_l1 = abs(y_origin - y_l1); \n  float diff_l2 = abs(y_origin - y_l2); \n  float diff_r1 = abs(y_origin - y_r1); \n  float diff_r2 = abs(y_origin - y_r2); \n  float diff_u1 = abs(y_origin - y_u1); \n  float diff_u2 = abs(y_origin - y_u2); \n  float diff_d1 = abs(y_origin - y_d1); \n  float diff_d2 = abs(y_origin - y_d2); \n  float is_less_than_delta = step(y_delta, max(max(max(max(max(max(max(diff_l1, diff_l2), diff_r1), diff_r2), diff_u1), diff_u2), diff_d1), diff_d2)); \n  highp vec3 sum = rgb_origin; \n  sum += rgb_l1; \n  sum += rgb_r1; \n  sum += rgb_u1; \n  sum += rgb_d1; \n  vec3 rgbOut = mix(rgb_origin, sum * 0.2, 1.0 - is_less_than_delta); \n  return rgbOut; \n}\nvoid main() {\nvec3 rgbOut = debanding();\nrgbOut = HLGToLinear(rgbOut);\nrgbOut = LinearToPQ(rgbOut, 1000.0);\n");
                if (shaderType == ShaderType.OESA || shaderType == ShaderType.RGBA) {
                    sb.append("  gl_FragColor = vec4(rgbOut,clamp(texture2D(a_tex, p).a, 0.0, 1.0));\n");
                } else {
                    sb.append("  gl_FragColor = vec4(rgbOut, 1.0);\n");
                }
                sb.append("}\n");
            } else {
                ShaderType shaderType5 = ShaderType.OESA;
                if (shaderType == shaderType5 || shaderType == ShaderType.RGBA) {
                    sb.append("vec4 sample(vec2 p) {\n  outData = texture2D(tex, p);\n");
                    if (i == transfer.getTransfer()) {
                        sb.append("  outData.xyz = HLGToLinear(outData.xyz);\n  outData.xyz = LinearToPQ(outData.xyz, 1000.0);\n");
                    }
                    if (shaderType == shaderType5 || shaderType == ShaderType.RGBA) {
                        sb.append("  outData[3] = clamp(texture2D(a_tex, p).a, 0.0, 1.0);\n");
                    }
                    sb.append("  return outData;\n}\n");
                    sb.append(str);
                } else if (z) {
                    sb.append(str.replace("gl_FragColor = sample(tc);", "float gamma = 2.2;\nvec4 fragColor = texture2D(tex, tc);\nfragColor.rgb = pow(fragColor.rgb, vec3(1.0/gamma));\ngl_FragColor = fragColor;"));
                } else {
                    sb.append("vec4 sample(vec2 p) {\n  outData = texture2D(tex, p);\n");
                    if (i == transfer.getTransfer()) {
                        sb.append("  outData.xyz = HLGToLinear(outData.xyz);\n  outData.xyz = LinearToPQ(outData.xyz, 1000.0);\n");
                    }
                    sb.append("  outData[3] = 1.0;\n  return outData;\n}\n");
                    sb.append(str);
                }
            }
        } else if (HdrUtil.is10BitLumaDepth(i)) {
            VideoFrame.ColorSpace.Transfer transfer2 = VideoFrame.ColorSpace.Transfer.ARIB_STD_B67;
            if (i == transfer2.getTransfer()) {
                sb.append("highp vec3 inverse_HLG(highp vec3 rgb) {\n  const highp float B67_a = 0.17883277;\n  const highp float B67_b = 0.28466892;\n  const highp float B67_c = 0.55991073;\n  if (rgb.x <= 0.5) rgb.x=(rgb.x * 2.0) * (rgb.x * 2.0);\n  else rgb.x = exp((rgb.x - B67_c) / B67_a) + B67_b;\n  if (rgb.y <= 0.5) rgb.y=(rgb.y * 2.0) * (rgb.y * 2.0);\n  else rgb.y = exp((rgb.y - B67_c) / B67_a) + B67_b;\n  if (rgb.z <= 0.5) rgb.z=(rgb.z * 2.0) * (rgb.z * 2.0);\n  else rgb.z = exp((rgb.z - B67_c) / B67_a) + B67_b;\n  return rgb;\n}\nhighp vec3 HLGToLinear(highp vec3 rgb) {\n  rgb = inverse_HLG(rgb);\n  highp vec3 ootf_2020 = vec3(0.2627, 0.6780, 0.0593);\n  highp float ootf_ys = 2000.0 * dot(ootf_2020, rgb);\n  return rgb *= pow(ootf_ys, 0.2);\n}\nhighp vec3 LinearToPQ(highp vec3 rgb, highp float divider) {\n  const highp float ST2084_m1 =  2610.0 / (4096.0 * 4.0);\n  const highp float ST2084_m2 = (2523.0 / 4096.0) * 128.0;\n  const highp float ST2084_c1 =  3424.0 / 4096.0;\n  const highp float ST2084_c2 = (2413.0 / 4096.0) * 32.0;\n  const highp float ST2084_c3 = (2392.0 / 4096.0) * 32.0;\n  rgb /= divider;\n  rgb = pow(rgb, vec3(ST2084_m1));\n  rgb = (ST2084_c1 + ST2084_c2 * rgb) / (1.0 + ST2084_c3 * rgb);\n  return rgb = pow(rgb, vec3(ST2084_m2));\n}\n");
            }
            sb.append("vec4 sample(vec2 p) {\n  vec2 y, u, v;\n  y = texture2D(y_tex, p).ra;\n  u = texture2D(u_tex, p).ra;\n  v = texture2D(v_tex, p).ra;\n  yuv.x = y.x * 0.249266862170088 + y.y * 63.81231671554252;\n  yuv.y = u.x * 0.249266862170088 + u.y * 63.81231671554252;\n  yuv.z = v.x * 0.249266862170088 + v.y * 63.81231671554252;\n");
            if (colorSpace == null || colorSpace.getRange() != VideoFrame.ColorSpace.Range.Full) {
                sb.append("  yuv.x = clamp((yuv.x - 0.062561) * 1.167808, 0.0, 1.0);\n  yuv.yz = clamp((yuv.yz - 0.5) * 1.141741 + 0.5, 0.0, 1.0);\n");
            } else {
                sb.append("  yuv = clamp(yuv, 0.0, 1.0);\n");
            }
            if (HdrUtil.isNeedTransToSdrVision(i) && z2) {
                sb.append("  rgb = getLutRgb(yuv).xyz;\n");
            } else {
                sb.append("  yuv.yz = yuv.yz - 0.5;\n  rgb = colorMatrix * yuv;\n");
                if (i == transfer2.getTransfer()) {
                    sb.append("  rgb = HLGToLinear(rgb);\n  rgb = LinearToPQ(rgb, 1000.0);\n");
                }
            }
            sb.append("  return vec4(rgb, clamp(texture2D(a_tex, p).a, 0.0, 1.0));\n}\n");
            sb.append(str);
        } else {
            if (HdrUtil.isNeedTransToHdrVision(i) && z2) {
                sb.append("highp vec3 inverse_HLG(highp vec3 rgb) {\n  const highp float B67_a = 0.17883277;\n  const highp float B67_b = 0.28466892;\n  const highp float B67_c = 0.55991073;\n  if (rgb.x <= 0.5) rgb.x=(rgb.x * 2.0) * (rgb.x * 2.0);\n  else rgb.x = exp((rgb.x - B67_c) / B67_a) + B67_b;\n  if (rgb.y <= 0.5) rgb.y=(rgb.y * 2.0) * (rgb.y * 2.0);\n  else rgb.y = exp((rgb.y - B67_c) / B67_a) + B67_b;\n  if (rgb.z <= 0.5) rgb.z=(rgb.z * 2.0) * (rgb.z * 2.0);\n  else rgb.z = exp((rgb.z - B67_c) / B67_a) + B67_b;\n  return rgb;\n}\nhighp vec3 HLGToLinear(highp vec3 rgb) {\n  rgb = inverse_HLG(rgb);\n  highp vec3 ootf_2020 = vec3(0.2627, 0.6780, 0.0593);\n  highp float ootf_ys = 2000.0 * dot(ootf_2020, rgb);\n  return rgb *= pow(ootf_ys, 0.2);\n}\nhighp vec3 LinearToPQ(highp vec3 rgb, highp float divider) {\n  const highp float ST2084_m1 =  2610.0 / (4096.0 * 4.0);\n  const highp float ST2084_m2 = (2523.0 / 4096.0) * 128.0;\n  const highp float ST2084_c1 =  3424.0 / 4096.0;\n  const highp float ST2084_c2 = (2413.0 / 4096.0) * 32.0;\n  const highp float ST2084_c3 = (2392.0 / 4096.0) * 32.0;\n  rgb /= divider;\n  rgb = pow(rgb, vec3(ST2084_m1));\n  rgb = (ST2084_c1 + ST2084_c2 * rgb) / (1.0 + ST2084_c3 * rgb);\n  return rgb = pow(rgb, vec3(ST2084_m2));\n}\n");
            }
            sb.append("vec4 sample(vec2 p) {\n");
            if (colorSpace != null && colorSpace.getRange() == VideoFrame.ColorSpace.Range.Full) {
                sb.append("  yuv[0] = clamp(texture2D(y_tex, p).r, 0.0, 1.0);\n");
            } else if (HdrUtil.isNeedTransToHdrVision(i) && z2) {
                sb.append("  yuv[0] = clamp(1.164384 * (texture2D(y_tex, p).r - 0.0627), 0.0, 1.0);\n");
            } else {
                sb.append("  yuv[0] = clamp(texture2D(y_tex, p).r, 0.0, 1.0) - 0.0627;\n");
            }
            sb.append("  yuv[1] = clamp(texture2D(u_tex, p).r - 0.5, -0.5, 0.5);\n  yuv[2] = clamp(texture2D(v_tex, p).r - 0.5, -0.5, 0.5);\n");
            if (HdrUtil.isNeedTransToHdrVision(i) && z2) {
                sb.append("  yuv[1] = yuv[1] + 0.5;\n  yuv[2] = yuv[2] + 0.5;\n  rgb = getLutRgb(yuv).xyz;\n  rgb = HLGToLinear(rgb);\n  return vec4(LinearToPQ(rgb, 1000.0), 1.0);\n}\nfloat oetf_hlg(float x) \n{ \n  x = max(x, 0.0); \n  if (x <= (1.0/2.0)) \n{ \n    x = (x * x) * (1.0 / 3.0); \n} \n  else \n{ \n    x = (exp((x - 0.55991073) / 0.17883277) + 0.28466892) / 12.0; \n} \n  return x; \n} \nvec3 debanding() {\n  vec3 rgb_origin = sample(tc).rgb;\n  vec3 rgb_l1 = sample(texBlurShift_l1).rgb;\n  vec3 rgb_l2 = sample(texBlurShift_l2).rgb;\n  vec3 rgb_r1 = sample(texBlurShift_r1).rgb;\n  vec3 rgb_r2 = sample(texBlurShift_r2).rgb;\n  vec3 rgb_u1 = sample(texBlurShift_u1).rgb;\n  vec3 rgb_u2 = sample(texBlurShift_u2).rgb;\n  vec3 rgb_d1 = sample(texBlurShift_d1).rgb;\n  vec3 rgb_d2 = sample(texBlurShift_d2).rgb;\n  float y_origin = clamp(rgb_origin.r * 0.2627 + rgb_origin.g * 0.678 + rgb_origin.b * 0.0593, 0.0, 1.0); \n  float y_l1 = clamp(rgb_l1.r * 0.2627 + rgb_l1.g * 0.678 + rgb_l1.b * 0.0593, 0.0, 1.0); \n  float y_l2 = clamp(rgb_l2.r * 0.2627 + rgb_l2.g * 0.678 + rgb_l2.b * 0.0593, 0.0, 1.0); \n  float y_r1 = clamp(rgb_r1.r * 0.2627 + rgb_r1.g * 0.678 + rgb_r1.b * 0.0593, 0.0, 1.0); \n  float y_r2 = clamp(rgb_r2.r * 0.2627 + rgb_r2.g * 0.678 + rgb_r2.b * 0.0593, 0.0, 1.0); \n  float y_u1 = clamp(rgb_u1.r * 0.2627 + rgb_u1.g * 0.678 + rgb_u1.b * 0.0593, 0.0, 1.0); \n  float y_u2 = clamp(rgb_u2.r * 0.2627 + rgb_u2.g * 0.678 + rgb_u2.b * 0.0593, 0.0, 1.0); \n  float y_d1 = clamp(rgb_d1.r * 0.2627 + rgb_d1.g * 0.678 + rgb_d1.b * 0.0593, 0.0, 1.0); \n  float y_d2 = clamp(rgb_d2.r * 0.2627 + rgb_d2.g * 0.678 + rgb_d2.b * 0.0593, 0.0, 1.0); \n  float y_temp = y_origin - 1.0 / 255.0; \n  float y_delta = 2.0 * (oetf_hlg(y_origin) - oetf_hlg(y_temp)); \n  float diff_l1 = abs(y_origin - y_l1); \n  float diff_l2 = abs(y_origin - y_l2); \n  float diff_r1 = abs(y_origin - y_r1); \n  float diff_r2 = abs(y_origin - y_r2); \n  float diff_u1 = abs(y_origin - y_u1); \n  float diff_u2 = abs(y_origin - y_u2); \n  float diff_d1 = abs(y_origin - y_d1); \n  float diff_d2 = abs(y_origin - y_d2); \n  float is_less_than_delta = step(y_delta, max(max(max(max(max(max(max(diff_l1, diff_l2), diff_r1), diff_r2), diff_u1), diff_u2), diff_d1), diff_d2)); \n  highp vec3 sum = rgb_origin; \n  sum += rgb_l1; \n  sum += rgb_r1; \n  sum += rgb_u1; \n  sum += rgb_d1; \n  vec3 rgbOut = mix(rgb_origin, sum * 0.2, 1.0 - is_less_than_delta); \n  return rgbOut; \n}\nvoid main() {\n  gl_FragColor = vec4(debanding(),clamp(texture2D(a_tex, tc).a, 0.0, 1.0));\n}\n");
            } else {
                sb.append("  rgb = colorMatrix * yuv;\n  return vec4(rgb, clamp(texture2D(a_tex, p).a, 0.0, 1.0));\n}\n");
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i, int i2, int i3, int i4, VideoFrame.ColorSpace colorSpace, boolean z, int i5, int i6) {
        FloatBuffer floatBufferWrap;
        GlShader glShader;
        int i7;
        if (shaderType.equals(this.currentShaderType)) {
            glShader = this.currentShader;
        } else {
            this.currentShaderType = shaderType;
            GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
            }
            ShaderType shaderType2 = ShaderType.ALPHA;
            if (shaderType == shaderType2) {
                this.vertexShader = ALPHA_VERTEX_SHADER_STRING;
            } else if (HdrUtil.isNeedTransToHdrVision(i5) && hasLutTexId()) {
                this.vertexShader = SDR2HDR_VERTEX_SHADER_STRING;
            } else {
                this.vertexShader = DEFAULT_VERTEX_SHADER_STRING;
            }
            GlShader glShaderCreateShader = createShader(shaderType, colorSpace, z, i5, hasLutTexId());
            this.currentShader = glShaderCreateShader;
            glShaderCreateShader.useProgram();
            ShaderType shaderType3 = ShaderType.YUV;
            if (shaderType == shaderType3 || shaderType == ShaderType.ALPAH_YUV_STITCH_GRAPH) {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("v_tex"), 2);
                if (shaderType == shaderType3) {
                    GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("a_tex"), 3);
                }
                if (HdrUtil.isNeedHdrSdrTrans(i5)) {
                    GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("lutTex"), 4);
                }
                if (colorSpace != null) {
                    VideoFrame.ColorSpace.Range range = colorSpace.getRange();
                    switch (C149621.$SwitchMap$io$agora$base$VideoFrame$ColorSpace$Matrix[colorSpace.getMatrix().ordinal()]) {
                        case 1:
                        case 2:
                            floatBufferWrap = range != VideoFrame.ColorSpace.Range.Full ? FloatBuffer.wrap(g_color601_limit) : FloatBuffer.wrap(g_color601_full);
                            break;
                        case 3:
                            floatBufferWrap = range != VideoFrame.ColorSpace.Range.Full ? FloatBuffer.wrap(g_color709_limit) : FloatBuffer.wrap(g_color709_full);
                            break;
                        case 4:
                        case 5:
                            floatBufferWrap = FloatBuffer.wrap(g_color2020_full);
                            break;
                        case 6:
                            floatBufferWrap = range != VideoFrame.ColorSpace.Range.Full ? FloatBuffer.wrap(g_color601_limit) : FloatBuffer.wrap(g_color601_full);
                            break;
                        default:
                            floatBufferWrap = range != VideoFrame.ColorSpace.Range.Full ? FloatBuffer.wrap(g_color709_limit) : FloatBuffer.wrap(g_color709_full);
                            break;
                    }
                } else {
                    floatBufferWrap = FloatBuffer.wrap(g_color601_limit);
                }
                if (!HdrUtil.isNeedHdrSdrTrans(i5)) {
                    GLES20.glUniformMatrix3fv(glShaderCreateShader.getUniformLocation("colorMatrix"), 1, false, floatBufferWrap);
                }
                if (shaderType == ShaderType.ALPAH_YUV_STITCH_GRAPH) {
                    GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("alphaStitchMode"), i6);
                    if (colorSpace == null || colorSpace.getRange() != VideoFrame.ColorSpace.Range.Full) {
                        GLES20.glUniform1f(glShaderCreateShader.getUniformLocation("colorRangeOffset"), 0.0627f);
                    } else {
                        GLES20.glUniform1f(glShaderCreateShader.getUniformLocation("colorRangeOffset"), 0.0f);
                    }
                }
            } else if (shaderType == shaderType2) {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("tex"), 0);
                GLES20.glUniform1f(glShaderCreateShader.getUniformLocation("texelWidthOffset"), 1.0f / i);
            } else {
                if (shaderType == ShaderType.ALPAH_RGBA_STITCH_GRAPH || shaderType == ShaderType.ALPAH_OES_STITCH_GRAPH) {
                    GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("alphaStitchMode"), i6);
                }
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("tex"), 0);
                if (shaderType == ShaderType.OESA || shaderType == ShaderType.RGBA) {
                    GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("a_tex"), 3);
                }
                if (HdrUtil.isNeedHdrSdrTrans(i5) && hasLutTexId()) {
                    GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("lutTex"), 4);
                }
            }
            GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(glShaderCreateShader);
            this.texMatrixLocation = glShaderCreateShader.getUniformLocation(TEXTURE_MATRIX_NAME);
            this.inPosLocation = glShaderCreateShader.getAttribLocation(INPUT_VERTEX_COORDINATE_NAME);
            this.inTcLocation = glShaderCreateShader.getAttribLocation(INPUT_TEXTURE_COORDINATE_NAME);
            if (HdrUtil.isNeedTransToHdrVision(i5) && hasLutTexId()) {
                this.texWOffsetLocation = glShaderCreateShader.getUniformLocation("texBlurWidthOffset");
                this.texHOffsetLocation = glShaderCreateShader.getUniformLocation("texBlurHeightOffset");
            }
            glShader = glShaderCreateShader;
        }
        glShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        FloatBuffer floatBuffer = this.textureCropCoord;
        int i8 = this.inTcLocation;
        if (floatBuffer != null) {
            GLES20.glVertexAttribPointer(i8, 2, 5126, false, 0, (Buffer) floatBuffer);
        } else {
            GLES20.glVertexAttribPointer(i8, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        }
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        if (HdrUtil.isNeedTransToHdrVision(i5) && hasLutTexId()) {
            i7 = i2;
            GLES20.glUniform1f(this.texWOffsetLocation, 1.0f / i);
            GLES20.glUniform1f(this.texHOffsetLocation, 1.0f / i7);
        } else {
            i7 = i2;
        }
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i, i7, i3, i4);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public GlShader createShader(ShaderType shaderType, VideoFrame.ColorSpace colorSpace, boolean z, int i, boolean z2) {
        String strCreateFragmentShaderString = createFragmentShaderString(this.genericFragmentSource, shaderType, colorSpace, z, i, z2);
        Logging.m87211i(TAG, "shaderType: " + shaderType + " transfer: " + i + " hasLutTexId: " + z2 + " shader: " + strCreateFragmentShaderString);
        return new GlShader(this.vertexShader, strCreateFragmentShaderString);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawAlpha(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader(ShaderType.ALPHA, fArr, i2, i3, i6, i7, false, 0, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawAlphaStitchGraph(int[] iArr, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, VideoFrame.ColorSpace colorSpace, int i8, int i9) {
        prepareShader(ShaderType.ALPAH_YUV_STITCH_GRAPH, fArr, i2, i3, i6, i7, colorSpace, false, i8, i9);
        for (int i10 = 0; i10 < 3; i10++) {
            GLES20.glActiveTexture(33984 + i10);
            GLES20.glBindTexture(3553, iArr[i10]);
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i11 = 0; i11 < 3; i11++) {
            GLES20.glActiveTexture(i11 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawOes(int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        prepareShader(i2 > 0 ? ShaderType.OESA : ShaderType.OES, fArr, i3, i4, i7, i8, false, i9, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        if (i2 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i2);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i9) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, getLutTexId());
        }
        GLES20.glViewport(i5, i6, i7, i8);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        if (i2 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i9) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, int i10) {
        ShaderType shaderType = i2 > 0 ? ShaderType.RGBA : ShaderType.RGB;
        if (i10 > 0) {
            shaderType = ShaderType.ALPAH_RGBA_STITCH_GRAPH;
        }
        prepareShader(shaderType, fArr, i3, i4, i7, i8, z, i9, i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        if (i2 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i2);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i9) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, getLutTexId());
        }
        GLES20.glViewport(i5, i6, i7, i8);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        if (i2 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i9) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, VideoFrame.ColorSpace colorSpace, int i8) {
        prepareShader(ShaderType.YUV, fArr, i2, i3, i6, i7, colorSpace, false, i8, 0);
        for (int i9 = 0; i9 < 3; i9++) {
            GLES20.glActiveTexture(33984 + i9);
            GLES20.glBindTexture(3553, iArr[i9]);
        }
        if (i > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i8) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, getLutTexId());
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i10 = 0; i10 < 3; i10++) {
            GLES20.glActiveTexture(i10 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
        if (i > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i8) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public int getLutTexId() {
        return this.lutTextureId;
    }

    public boolean hasLutTexId() {
        return this.lutTextureId != 0;
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void setLut10Texture(byte[] bArr) {
        Logging.m87211i(TAG, "setLut10Texture()");
        Bitmap bitmapDecodeByteArray = null;
        try {
            if (bArr.length != 0) {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
        }
        if (bitmapDecodeByteArray == null) {
            return;
        }
        this.lutTextureId = GlUtil.generateTexture(3553);
        GlUtil.checkNoGLES2Error("glGenTextures");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.lutTextureId);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, bitmapDecodeByteArray, 0);
        GlUtil.checkNoGLES2Error("loadImageTexture");
        GLES20.glBindTexture(3553, 0);
        bitmapDecodeByteArray.recycle();
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void setTextureCropCoord(FloatBuffer floatBuffer) {
        if (floatBuffer != null) {
            this.textureCropCoord = floatBuffer;
        }
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this(DEFAULT_VERTEX_SHADER_STRING, str, shaderCallbacks);
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        prepareShader(shaderType, fArr, i, i2, i3, i4, null, z, i5, i6);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawOes(int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        drawOes(i, i2, fArr, i3, i4, i5, i6, i7, i8, i9, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        drawRgb(i, i2, fArr, i3, i4, i5, i6, i7, i8, false, i9, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i, int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        drawRgb(i, i2, fArr, i3, i4, i5, i6, i7, i8, false, i9, i10);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        drawRgb(i, 0, fArr, i2, i3, i4, i5, i6, i7, false, 0, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawYuv(iArr, i, fArr, i2, i3, i4, i5, i6, i7, null, i8);
    }
}

package com.momo.mcamera.mask;

import android.opengl.GLES20;
import p153l.nuf;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class FaceLightingFilter extends FaceDetectFilter {
    private int[] skinDefaultRGB;
    private int skinDefaultRGBHandle;
    public float skinLightingScale;
    private int skinLightingScaleHandle;
    private WhiteningVersionEnum version;

    /* JADX INFO: renamed from: com.momo.mcamera.mask.FaceLightingFilter$1 */
    public static /* synthetic */ class C41791 {

        /* JADX INFO: renamed from: $SwitchMap$com$momo$mcamera$mask$FaceLightingFilter$WhiteningVersionEnum */
        static final /* synthetic */ int[] f14964xcb10be36;

        static {
            int[] iArr = new int[WhiteningVersionEnum.values().length];
            f14964xcb10be36 = iArr;
            try {
                iArr[WhiteningVersionEnum.originWhiten.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14964xcb10be36[WhiteningVersionEnum._8version.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum WhiteningVersionEnum {
        originWhiten,
        _8version
    }

    public FaceLightingFilter() {
        this.skinLightingScale = 0.0f;
        this.skinDefaultRGB = new int[]{0, 0, 0};
        this.version = WhiteningVersionEnum.originWhiten;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p153l.gfj
    public void drawSub() {
        super.drawSub();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        int i = C41791.f14964xcb10be36[this.version.ordinal()];
        if (i != 1) {
            return i != 2 ? "" : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float skinLightingScale;\nuniform vec3 skinDefaultRGB;\nvec3 rgb2yuv(vec3 c)\n{\n    return clamp(vec3(0.299 * c.r + 0.587 * c.g + 0.114 * c.b, -0.169 * c.r - 0.331 * c.g + 0.499 * c.b + 0.5, 0.499 * c.r - 0.418 * c.g - 0.0813* c.b + 0.5), 0., 1.);\n}\nvec3 yuv2rgb(vec3 c)\n{\n    return clamp(vec3(c.r + 1.402 * (c.b - 0.5), c.r - 0.344 * (c.g - 0.5) - 0.714 * (c.b - 0.5), c.r + 1.772 * (c.g - 0.5)), 0., 1.);\n}\nvec3 adjustYUV(vec3 c, float highThreshold)\n{\n    if(c.x < 0.1){\n        c.x = 0.;\n    }else if (c.x > highThreshold){\n        c.x = 1.;\n    }else{\n        c.x = (c.x - 0.1)/(highThreshold - 0.1);\n    }\n    return c;\n}\nvoid main() {\n    vec4 source = texture2D(inputImageTexture0, textureCoordinate);\n    gl_FragColor = source;\n    if(abs(skinLightingScale - 0.1) < 0.05)\n    {\n        return;\n    }\n    vec3 faceYUV = rgb2yuv(skinDefaultRGB);\n    float lightScale = clamp((faceYUV.r - 0.32) * 2.55, 0.6, 1.);\n    vec3 relation = vec3(1.0) - max(skinDefaultRGB - source.xyz, vec3(0.));\n    relation = 1./(1. + exp(24. - 30. * relation));\n    vec3 relation2 = vec3(1.0) - abs(skinDefaultRGB - source.xyz);\n    relation2 = 1./(1. + exp(24. - 30. * relation2));\nfloat minColor = min(min(source.x, source.y), source.z);\ngl_FragColor.xyz = gl_FragColor.xyz - minColor;\nif(gl_FragColor.r > 0. && gl_FragColor.g > 0.){\n    minColor = min(gl_FragColor.g, gl_FragColor.r);\n    gl_FragColor.r = gl_FragColor.r - minColor;\n    gl_FragColor.g = gl_FragColor.g - minColor;\n}\nif(gl_FragColor.b > 0. && gl_FragColor.g > 0.){\n    minColor = min(gl_FragColor.g, gl_FragColor.b);\n    gl_FragColor.b = gl_FragColor.b - minColor;\n    gl_FragColor.g = gl_FragColor.g - minColor;\n}\nif(gl_FragColor.b > 0. && gl_FragColor.r > 0.){\n    minColor = min(gl_FragColor.r, gl_FragColor.b);\n    gl_FragColor.b = gl_FragColor.b - minColor;\n    gl_FragColor.r = gl_FragColor.r - minColor;\n}\nvec3 parameters = lightScale * vec3(1., 0.5, 0.4);\nvec3 delta = gl_FragColor.r * vec3((1.-source.x) * parameters.x, source.y * parameters.y, (1.-source.z) * parameters.z);\ndelta = 0.8 * delta * relation * relation;\ngl_FragColor.xyz = vec3(source.x + delta.x, source.y - delta.y, source.z + delta.z);\n    float param = relation2.x * relation2.y * relation2.z * skinLightingScale;\n    vec3 paramVec = vec3(param*1.4 + 1.05, param*1.2 + 1.05, param + 1.05);\n    vec3 a = log(gl_FragColor.rgb  * (paramVec - vec3(1.)) + vec3(1., 1., 1.));\n    gl_FragColor.rgb = a / log(paramVec);\n}\n";
        }
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float skinLightingScale;\nvoid main() {\n    vec4 source = texture2D( inputImageTexture0, textureCoordinate);\n    gl_FragColor = source;\n    if(abs(skinLightingScale - 1.) < 0.01)\n    {\n        return;\n    }\n    vec3 a = log(gl_FragColor.rgb * (skinLightingScale - 1.) + vec3(1., 1., 1.));\n    float b = log(skinLightingScale);\n    gl_FragColor.rgb = a / b;\n}\n";
    }

    public float getSkinLightLevel() {
        return this.skinLightingScale;
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return super.getVertexShader();
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.skinLightingScaleHandle = GLES20.glGetUniformLocation(this.programHandle, "skinLightingScale");
        this.skinDefaultRGBHandle = GLES20.glGetUniformLocation(this.programHandle, "skinDefaultRGB");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.skinLightingScale < 0.0f) {
            this.skinLightingScale = 0.0f;
        }
        int i = C41791.f14964xcb10be36[this.version.ordinal()];
        if (i == 1) {
            GLES20.glUniform1f(this.skinLightingScaleHandle, (this.skinLightingScale * 5.0f) + 1.0f);
        } else {
            if (i != 2) {
                return;
            }
            GLES20.glUniform1f(this.skinLightingScaleHandle, this.skinLightingScale + 0.1f);
            int i2 = this.skinDefaultRGBHandle;
            int[] iArr = this.skinDefaultRGB;
            GLES20.glUniform3f(i2, iArr[0] / 255.0f, iArr[1] / 255.0f, (iArr[2] - 10) / 255.0f);
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        nuf nufVarM168295j = omwVar.m168295j(0);
        int[] iArrM164792w = nufVarM168295j == null ? null : nufVarM168295j.m164792w();
        if (iArrM164792w == null || iArrM164792w.length < 6) {
            int[] iArr = this.skinDefaultRGB;
            iArr[0] = 128;
            iArr[1] = 128;
            iArr[2] = 128;
            return;
        }
        int[] iArr2 = this.skinDefaultRGB;
        iArr2[0] = iArrM164792w[6];
        iArr2[1] = iArrM164792w[7];
        iArr2[2] = iArrM164792w[8];
    }

    public void setSkinLightingScale(float f) {
        synchronized (getLockObject()) {
            this.skinLightingScale = f;
        }
    }

    public FaceLightingFilter(WhiteningVersionEnum whiteningVersionEnum) {
        this.skinLightingScale = 0.0f;
        this.skinDefaultRGB = new int[]{0, 0, 0};
        this.version = whiteningVersionEnum;
    }
}

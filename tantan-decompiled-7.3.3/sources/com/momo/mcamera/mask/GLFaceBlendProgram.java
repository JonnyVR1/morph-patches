package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class GLFaceBlendProgram extends GLProgram {
    private static final String BLEND_KEY_ADD = "Add";
    private static final String BLEND_KEY_COLOR = "Color";
    private static final String BLEND_KEY_COLOR_BURN = "ColorBurn";
    private static final String BLEND_KEY_COLOR_DODGE = "ColorDodge";
    private static final String BLEND_KEY_DARKEN = "Darken";
    private static final String BLEND_KEY_DIFFERENCE = "Difference";
    private static final String BLEND_KEY_DIVIDE = "Divide";
    private static final String BLEND_KEY_EXCLUSION = "Exclusion";
    private static final String BLEND_KEY_HARDLIGHT = "HardLight";
    private static final String BLEND_KEY_HUE = "Hue";
    private static final String BLEND_KEY_LIGHTEN = "Lighten";
    private static final String BLEND_KEY_LINEARBURN = "LinearBurn";
    private static final String BLEND_KEY_LUMINOSITY = "Luminosity";
    private static final String BLEND_KEY_MASK = "Mask";
    private static final String BLEND_KEY_MULTIPLY = "Multiply";
    private static final String BLEND_KEY_NORMAL = "Normal";
    private static final String BLEND_KEY_OVERLAY = "Overlay";
    private static final String BLEND_KEY_SATURATION = "Saturation";
    private static final String BLEND_KEY_SCREEN_BLEND = "Screen";
    private static final String BLEND_KEY_SOFT_LIGHT = "SoftLight";
    private static final String BLEND_KEY_SOURCE_OVER = "SourceOver";
    private static final String BLEND_KEY_SUBTRACT = "Subtract";
    private static final String INTENSITY = "intensity";
    private float BLEND_RATIO;
    private HashMap<String, String> blendFragmentShaderMap;
    private String mBlendType;
    private int mHandleIntensity;
    private float mIntensity;
    protected String multiplyFragmentShader;
    private String normalFragmentShader;
    protected String overlayFragmentShader;
    protected String subtractFragmentShader;

    public GLFaceBlendProgram() {
        super(2, 2);
        this.blendFragmentShaderMap = new HashMap<>();
        this.mIntensity = 0.0f;
        this.mHandleIntensity = 0;
        this.BLEND_RATIO = 0.8f;
        this.mBlendType = BLEND_KEY_NORMAL;
        this.normalFragmentShader = "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate0;\nvarying vec2 textureCoordinate1;\nuniform float intensity;\n\n" + premultiply() + unpremultiply() + normalBlend() + "void main(){\n  vec4 uCb = texture2D(inputImageTexture0, textureCoordinate0);\n  vec4 uCf = texture2D(inputImageTexture1, textureCoordinate1);\n  vec4 blendedColor = normalBlend(uCb, uCf);\n  gl_FragColor = mix(uCb,blendedColor,intensity);\n}";
        this.multiplyFragmentShader = "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate0;\nvarying vec2 textureCoordinate1;\nuniform float intensity;\n\n" + premultiply() + unpremultiply() + normalBlend() + blendBaseAlpha() + multiplayBlend() + "void main(){\n  vec4 uCb = texture2D(inputImageTexture0, textureCoordinate0);\n  vec4 uCf = texture2D(inputImageTexture1, textureCoordinate1);\n  vec4 blendedColor = multiplyBlend(uCb, uCf);\n  gl_FragColor = mix(uCb,blendedColor,intensity);\n}";
        this.overlayFragmentShader = "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate0;\nvarying vec2 textureCoordinate1;\nuniform float intensity;\n\n" + premultiply() + unpremultiply() + normalBlend() + blendBaseAlpha() + overlayBlendSingleChannel() + overlayBlend() + "void main(){\n  vec4 uCb = texture2D(inputImageTexture0, textureCoordinate0);\n  vec4 uCf = texture2D(inputImageTexture1, textureCoordinate1);\n  vec4 blendedColor = overlayBlend(uCb, uCf);\n  gl_FragColor = mix(uCb,blendedColor,intensity);\n}";
        this.subtractFragmentShader = "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate0;\nvarying vec2 textureCoordinate1;\nuniform float intensity;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate0);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate1);\n   gl_FragColor = mix(vec4(color1.rgb - color2.rgb, color1.a), color1, intensity);\n}\n";
        this.blendFragmentShaderMap.put(BLEND_KEY_MULTIPLY, this.multiplyFragmentShader);
        this.blendFragmentShaderMap.put(BLEND_KEY_NORMAL, this.normalFragmentShader);
        this.blendFragmentShaderMap.put(BLEND_KEY_OVERLAY, this.overlayFragmentShader);
    }

    private String blendBaseAlpha() {
        return "vec4 blendBaseAlpha(vec4 cb, vec4 cs, vec4 b){\n  vec4 cr = vec4((1.0 - cb.a) * cs.rgb + cb.a * clamp(b.rgb, vec3(0.0), vec3(1.0)), cs.a);\n  return normalBlend(cb, cr);\n}\n";
    }

    private String multiplayBlend() {
        return "vec4 multiplyBlend(vec4 cb, vec4 cs){\n  vec4 B = clamp(vec4(cb.rgb * cs.rgb, cs.a), vec4(0), vec4(1));\n  return blendBaseAlpha(cb, cs, B);\n}\n";
    }

    private String normalBlend() {
        return "vec4 normalBlend(vec4 cb, vec4 cs){\n  vec4 dst = premultiply(cb);\n  vec4 src = premultiply(cs);\n  return unpremultiply(src + dst * (1.0 - src.a));\n}\n";
    }

    private String overlayBlend() {
        return "\nvec4 overlayBlend(vec4 cb, vec4 cs){\n  vec4 b = vec4(overlayBlendSingleChannel(cb.r, cs.r), overlayBlendSingleChannel(cb.g, cs.g), overlayBlendSingleChannel(cb.b, cs.b), cs.a);\n  return blendBaseAlpha(cb, cs, b);\n}\n";
    }

    private String overlayBlendSingleChannel() {
        return "float overlayBlendSingleChannel(float b, float s){\n  return b < 0.5 ? (2.0 * s * b) : (1.0 - 2.0 * (1.0 - b) * (1.0 - s));\n}\n";
    }

    private String premultiply() {
        return "vec4 premultiply(vec4 s){\n  return vec4(s.rgb * s.a, s.a);\n}\n";
    }

    private String unpremultiply() {
        return "vec4 unpremultiply(vec4 s){\n  return vec4(s.rgb/max(s.a, 0.00001), s.a);\n}\n";
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public void destroy() {
        super.destroy();
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public void drawFrame(float[][] fArr, int[] iArr) {
        super.drawFrame(fArr, iArr);
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public String getSubFrameShader() {
        if (TextUtils.isEmpty(this.mBlendType) || !this.blendFragmentShaderMap.containsKey(this.mBlendType)) {
            this.mBlendType = BLEND_KEY_NORMAL;
        }
        return this.blendFragmentShaderMap.get(this.mBlendType);
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public String getSubVertexShader() {
        return super.getSubVertexShader();
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public void initShaderHandles() {
        super.initShaderHandles();
        this.mHandleIntensity = GLES20.glGetUniformLocation(this.programHandle, INTENSITY);
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public void passShaderValues(float[][] fArr, int[] iArr) {
        super.passShaderValues(fArr, iArr);
        GLES20.glUniform1f(this.mHandleIntensity, this.mIntensity * this.BLEND_RATIO);
    }

    public void setBlendType(String str) {
        if (this.mBlendType == str) {
            return;
        }
        this.mBlendType = str;
        this.initialized = false;
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public void setDrawType(int i) {
        super.setDrawType(i);
    }

    public void setIntensity(float f) {
        this.mIntensity = f;
    }

    @Override // com.momo.mcamera.mask.GLProgram
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }
}

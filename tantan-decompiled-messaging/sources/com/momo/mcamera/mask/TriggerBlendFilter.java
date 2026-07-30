package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.text.TextUtils;
import p149l.etf;
import p149l.m33;
import p149l.pjw;
import p149l.xj10;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class TriggerBlendFilter extends xj10 implements etf {
    private static final String UNIFORM_BLEND = "blend";
    protected static final String UNIFORM_TEXTURE_ALPHA = "inputImageTexture2";
    private int alphaTexture;
    private int blendHandler;
    private String blendType;
    protected float intensity;
    private int intensityHandle;
    protected int isBlend;
    protected boolean isSegmentBody;
    protected boolean isStroke;
    private pjw mmcvInfo;
    private int strokeColorHandler;
    private int strokeEnabled;
    private int strokeEnabledHandler;
    protected int strokeRadius;
    private int strokeRadiusHandler;
    protected float[] strokeRgbaColor;
    private int texelHeightHandler;
    private int texelWidthHandler;

    public TriggerBlendFilter() {
        super(2);
        this.isBlend = 1;
        this.isSegmentBody = false;
        this.isStroke = false;
        this.strokeRadius = 5;
        this.alphaTexture = 0;
        this.strokeEnabled = 1;
        this.intensity = 1.0f;
    }

    @Override // p149l.xj10, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        if (this.isSegmentBody) {
            return this.isStroke ? "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform int blend;\nvarying vec2 textureCoordinate;\n\nuniform float texelWidth;\nuniform float texelHeight;\n\nuniform int strokeRadius;\nuniform vec4 strokeColor;\nuniform int strokeEnabled;\nfloat stepWidth = 1.0;\n\nfloat intensityForEdge(vec2 center, vec2 step1) {\n    //bool isIntensity = false;\n    vec4 centerTex = texture2D(inputImageTexture3, center);\n    float intensity = centerTex.r;\n    for (int i = 0; i < strokeRadius; i++) {\n        vec2 left = center + vec2(step1.x * float(i), 0.0);\n        vec2 right = center + vec2(step1.x * -float(i), 0.0);\n        vec2 top = center + vec2(0.0, -step1.y * float(i));\n        vec2 bottom = center + vec2(0.0, +step1.y * float(i));\n        vec4 leftTex = texture2D( inputImageTexture3, left);\n        vec4 rightTex = texture2D( inputImageTexture3, right);\n        vec4 topTex = texture2D( inputImageTexture3, top);\n        vec4 bottomTex = texture2D( inputImageTexture3, bottom);\n        intensity = (intensity+(leftTex.r+rightTex.r+ topTex.r+ bottomTex.r)*(1.0-float(i)/float(strokeRadius)));\n    }\n    return intensity*float(strokeRadius);\n}\n\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {\n   gl_FragColor = color2;\n} else {   \n   vec2 step1 = vec2(stepWidth*texelWidth, stepWidth*texelHeight);\n   vec4 picture = texture2D(inputImageTexture1, textureCoordinate);\n\n   vec4 color1;\n   float intensity = intensityForEdge(textureCoordinate, step1);\n   //if (intensity > 0.0) {\n   //   color1 = strokeColor;\n   //} else {\n   //   color1 = picture;\n   //}\n   color1 = mix(strokeColor, picture , step(0.0, -intensity));\n   color1 = mix(picture, color1, float(strokeEnabled));\n   //vec4 colorSobel = texture2D(inputImageTexture3,textureCoordinate);\n   //float c1AlphaDivisor = color1.a + step(color1.a, 0.0);\n   //color1.rgb = color1.rgb/c1AlphaDivisor;\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   vec4 colorAlpha = texture2D(inputImageTexture2, textureCoordinate);\n   color1 = vec4(color1.rgb, color1.a * (colorAlpha.r > 0.9 ? 0.0 : (1.0 - colorAlpha.r * colorAlpha.r* colorAlpha.r)));\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n   }\n }" : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   vec4 colorAlpha = texture2D(inputImageTexture2, textureCoordinate);\n   color1 = vec4(color1.rgb, color1.a * (colorAlpha.r > 0.9 ? 0.0 : (1.0 - colorAlpha.r * colorAlpha.r* colorAlpha.r)));\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        if (TextUtils.isEmpty(this.blendType)) {
            return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        String strM152810b = m33.m152810b(this.blendType);
        return !TextUtils.isEmpty(strM152810b) ? strM152810b : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.blendHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_BLEND);
        if (this.isSegmentBody && this.isStroke) {
            this.texelWidthHandler = GLES20.glGetUniformLocation(this.programHandle, "texelWidth");
            this.texelHeightHandler = GLES20.glGetUniformLocation(this.programHandle, "texelHeight");
            this.strokeRadiusHandler = GLES20.glGetUniformLocation(this.programHandle, "strokeRadius");
            this.strokeColorHandler = GLES20.glGetUniformLocation(this.programHandle, "strokeColor");
            this.strokeEnabledHandler = GLES20.glGetUniformLocation(this.programHandle, "strokeEnabled");
        }
        this.intensityHandle = GLES20.glGetUniformLocation(this.programHandle, "intensity");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1i(this.blendHandler, this.isBlend);
        if (this.isSegmentBody && this.isStroke) {
            GLES20.glUniform1f(this.texelWidthHandler, 1.0f / getWidth());
            GLES20.glUniform1f(this.texelHeightHandler, 1.0f / getHeight());
            GLES20.glUniform1i(this.strokeRadiusHandler, this.strokeRadius);
            int i = this.strokeColorHandler;
            float[] fArr = this.strokeRgbaColor;
            GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], fArr[3]);
            GLES20.glUniform1i(this.strokeEnabledHandler, this.strokeEnabled);
        }
        GLES20.glUniform1f(this.intensityHandle, this.intensity);
    }

    public void setBlend(int i) {
        synchronized (this.listLock) {
            this.isBlend = i;
        }
    }

    public void setBlendType(String str) {
        this.blendType = str;
    }

    public void setIntensity(float f) {
        this.intensity = f;
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        if (pjwVar == null) {
            return;
        }
        this.mmcvInfo = pjwVar;
        zsf zsfVarM169946j = pjwVar.m169946j(0);
        if (zsfVarM169946j == null || zsfVarM169946j.m220021o() == null || zsfVarM169946j.m220028v() == null) {
            setStrokeEnabled(false);
        } else {
            setStrokeEnabled(true);
        }
    }

    public void setSegmentBody(boolean z) {
        this.isSegmentBody = z;
    }

    public void setSegmentStrokeColor(float[] fArr) {
        if (fArr == null || fArr.length < 3) {
            this.isStroke = false;
            return;
        }
        this.isStroke = true;
        if (fArr.length == 3) {
            this.strokeRgbaColor = new float[]{fArr[0], fArr[1], fArr[2], 1.0f};
        } else {
            this.strokeRgbaColor = fArr;
        }
    }

    public void setSegmentStrokeRadius(int i) {
        if (i > 0) {
            this.strokeRadius = i;
        }
    }

    public void setStrokeEnabled(boolean z) {
        this.strokeEnabled = z ? 1 : 0;
    }

    public void setBlend(boolean z) {
        synchronized (this.listLock) {
            this.isBlend = z ? 1 : 0;
        }
    }

    public TriggerBlendFilter(int i) {
        super(i);
        this.isBlend = 1;
        this.isSegmentBody = false;
        this.isStroke = false;
        this.strokeRadius = 5;
        this.alphaTexture = 0;
        this.strokeEnabled = 1;
        this.intensity = 1.0f;
    }
}

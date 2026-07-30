package com.momo.mcamera.mask;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import p149l.pjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class FaceSkinSmoothFilter extends FaceDetectFilter {
    protected static final String UNIFORM_TEXELHEIGHT = "texelHeightOffset";
    protected static final String UNIFORM_TEXELWIDTH = "texelWidthOffset";
    private int defaultSkinThresholdHandle;
    private edgePassFilterVersion edgePassFilterType_;
    protected int height;
    private int highSkinThresholdHandle;
    private int lowSkinThresholdHandle;
    private int skinSmoothScaleHanle;
    protected float texelHeight;
    private int texelHeightHandle;
    protected float texelWidth;
    private int texelWidthHandle;
    protected int width;
    private boolean bSkinDetect_ = false;
    private int winsize_ = 4;
    private float skinSmoothScale = 0.0f;
    private int[] lowSkinThreshold = {0, 0, 0};
    private int[] highSkinThreshold = {255, 255, 255};
    private int[] defaultSkinThreshold = {160, 120, 110};

    /* JADX INFO: renamed from: com.momo.mcamera.mask.FaceSkinSmoothFilter$1 */
    public static /* synthetic */ class C40301 {

        /* JADX INFO: renamed from: $SwitchMap$com$momo$mcamera$mask$FaceSkinSmoothFilter$edgePassFilterVersion */
        static final /* synthetic */ int[] f14246x4e718477;

        static {
            int[] iArr = new int[edgePassFilterVersion.values().length];
            f14246x4e718477 = iArr;
            try {
                iArr[edgePassFilterVersion.surfaceFilter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14246x4e718477[edgePassFilterVersion.guidedFilter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14246x4e718477[edgePassFilterVersion.transitionalGuidedFilter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum edgePassFilterVersion {
        surfaceFilter,
        guidedFilter,
        transitionalGuidedFilter
    }

    public FaceSkinSmoothFilter(edgePassFilterVersion edgepassfilterversion) {
        int i = C40301.f14246x4e718477[edgepassfilterversion.ordinal()];
        if (i == 1) {
            init(edgePassFilterVersion.surfaceFilter, 3, true);
        } else if (i == 2) {
            init(edgePassFilterVersion.guidedFilter, 4, true);
        } else {
            if (i != 3) {
                return;
            }
            init(edgePassFilterVersion.transitionalGuidedFilter, 4, true);
        }
    }

    private String getGuidedFilterFragmentShaderString(int i, boolean z) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                str = str + "         tmpVec4 = texture2D(inputImageTexture0, vec2( textureCoordinate.x + (-float(" + Integer.toString(i) + ") * 0.5 * xInc) + float(" + Integer.toString(i2) + ") * xInc, textureCoordinate.y + (-float(" + Integer.toString(i) + ") * 0.5 * yInc) + float(" + Integer.toString(i3) + ") * yInc));\n        meanI += tmpVec4;\n        meanII += tmpVec4 * tmpVec4;\n";
            }
        }
        String str2 = str + "        meanI /= float(" + Integer.toString(i) + " * " + Integer.toString(i) + ");\n        meanII /= float(" + Integer.toString(i) + " * " + Integer.toString(i) + ");\n";
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform mediump float parameter;\nuniform mediump vec3 lowSkinThreshold;\nuniform mediump vec3 highSkinThreshold;\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nmediump float minstep = 3.5;\nvoid main() {\n    float xInc = minstep * texelWidthOffset;\n    float yInc = minstep * texelHeightOffset;\n    float epslone = 0.004*parameter*parameter;\n    vec4 eps = vec4(epslone, epslone, epslone, epslone);\n    vec4 meanI = vec4(0., 0., 0., 0.);\n    vec4 meanII = vec4(0., 0., 0., 0.);\n    vec4 tmpVec4;\n    mediump vec4 sourceColorVec4 = texture2D(inputImageTexture0,textureCoordinate);\n    if (parameter < 0.01 || epslone <=0.){\n         gl_FragColor = sourceColorVec4;\n         return;\n    }\n" + (z ? "mediump   float m_r = sourceColorVec4.r;\nmediump   float m_g = sourceColorVec4.g;\nmediump    float m_b = sourceColorVec4.b;\nmediump    float m_max = max(m_r, max(m_g, m_b));\nmediump    float m_min = min(m_r, min(m_g, m_b));\nmediump    float r_low = lowSkinThreshold.x;\nmediump    float g_low = lowSkinThreshold.y;\nmediump    float b_low = lowSkinThreshold.z;\nmediump    float r_high = highSkinThreshold.x;\nmediump    float g_high = highSkinThreshold.y;\nmediump    float b_high = highSkinThreshold.z;\n    if(!(r_low<=m_r  && g_low<=m_g &&  b_low<=m_b)) {\n        gl_FragColor = sourceColorVec4 ;\n        return;\n    }\n" : "") + str2 + "    tmpVec4 = meanII - meanI * meanI;\n    vec4 temp2 = tmpVec4 + eps;\n    if (temp2.x <= 0. || temp2.y <= 0. || temp2.z <= 0. || temp2.x > 1.0 || temp2.y > 1.0 || temp2.z > 1.0 ){\n            gl_FragColor = sourceColorVec4 ;\n            return;\n    }\n    else {\n        vec4 a = tmpVec4 /temp2;\n        vec4 b = meanI - a * meanI;\n        gl_FragColor = a * sourceColorVec4 + b;\n        gl_FragColor.w = sourceColorVec4.w;\n        return;\n    }\n}\n";
    }

    private String getSurfaceFilterFragmentShaderString(int i, boolean z) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                str = str + "                tmpVec4 = texture2D(inputImageTexture0, vec2( textureCoordinate.x + (-float(" + Integer.toString(i) + ")  * 0.5 * xInc) + float(" + Integer.toString(i2) + ") * xInc, textureCoordinate.y + (-float(" + Integer.toString(i) + ") * 0.5 * yInc) + float(" + Integer.toString(i3) + ") * yInc));\n                w = 1. - abs(tmpVec4.xyz - sourceColorVec4.xyz)/(2.5*threshold);\n                if (w.x < 0.|| w.y < 0. || w.z < 0.) {\n                    w.x = 0.;\n                    w.y = 0.;\n                    w.z = 0.;\n                }\n                sumW = sumW +w;\n                sum = sum + w*tmpVec4.xyz;\n";
            }
        }
        return "    precision mediump float;\n    uniform sampler2D inputImageTexture0;\n    varying vec2 textureCoordinate;\n    uniform float parameter;\n    uniform vec3 lowSkinThreshold;\n    uniform vec3 highSkinThreshold;\n    uniform float texelWidthOffset; \n    uniform float texelHeightOffset; \n    vec4 a;\n    vec4 b;\n    void main() {\n        float minstep = 5.0;\n        float xInc = minstep * texelWidthOffset;\n        float yInc = minstep * texelHeightOffset;\n        vec4 tmpVec4;\n        mediump vec4 tmpMediump4;\n        mediump vec4 sourceColorVec4 = texture2D(inputImageTexture0,textureCoordinate);\n        if (parameter <0.001 ) {\n            gl_FragColor = sourceColorVec4;\n            return;\n        }\n        float threshold = parameter*20./255.;\n        vec3 sum = vec3(0.,0.,0.);\n        vec3 sumW = vec3(0.,0.,0.);\n        vec3 w;" + (z ? "    float m_r = sourceColorVec4.r;\n    float m_g = sourceColorVec4.g;\n    float m_b = sourceColorVec4.b;\n    float m_max = max(m_r, max(m_g, m_b));\n    float m_min = min(m_r, min(m_g, m_b));\n    float r_low = lowSkinThreshold.x;\n    float g_low = lowSkinThreshold.y;\n    float b_low = lowSkinThreshold.z;\n    float r_high = highSkinThreshold.x;\n    float g_high = highSkinThreshold.y;\n    float b_high = highSkinThreshold.z;\n    if(!(r_low<=m_r &&  g_low<=m_g && b_low<=m_b ) ) {\n        gl_FragColor = sourceColorVec4 ;\n        return;\n    }\n" : "") + str + "        if (sumW.x == 0. || sumW.y == 0. || sumW.z == 0.){\n            gl_FragColor = sourceColorVec4;\n        }\n        else {\n            gl_FragColor.xyz = sum/sumW;\n            gl_FragColor.w = sourceColorVec4.w;\n        }\n    }\n";
    }

    private String getTransitionalGuidedFilterFragmentShaderString(int i, boolean z) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                str = str + "        tmpVec4 = texture2D(inputImageTexture0, vec2( textureCoordinate.x + (-float(" + Integer.toString(i) + ") * 0.5 * xInc) + float(" + Integer.toString(i2) + ") * xInc, textureCoordinate.y + (-float(" + Integer.toString(i) + ") * 0.5 * yInc) + float(" + Integer.toString(i3) + ") * yInc));\n        meanI += tmpVec4;\n        meanII += tmpVec4 * tmpVec4;\n";
            }
        }
        String str2 = str + "        meanI /= float(" + Integer.toString(i) + " * " + Integer.toString(i) + ");\n        meanII /= float(" + Integer.toString(i) + " * " + Integer.toString(i) + ");\n";
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform mediump float parameter;\nuniform mediump vec3 lowSkinThreshold;\nuniform mediump vec3 highSkinThreshold;\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nmediump float minstep = 3.5;\nuniform vec3 skinDefaultRGB;\nvoid main() {\n    float xInc = minstep * texelWidthOffset;\n    float yInc = minstep * texelHeightOffset;\n    float epslone = 0.004*parameter*parameter;\n    vec4 eps = vec4(epslone, epslone, epslone, epslone);\n    vec4 meanI = vec4(0., 0., 0., 0.);\n    vec4 meanII = vec4(0., 0., 0., 0.);\n    vec4 tmpVec4;\n    mediump vec4 sourceColorVec4 = texture2D(inputImageTexture0,textureCoordinate);\n    if (parameter < 0.01 || epslone <=0.){\n         gl_FragColor = sourceColorVec4;\n         return;\n    }\n" + (z ? "vec3 relation = vec3(1.0) + min((sourceColorVec4.xyz - skinDefaultRGB),vec3(0.0));\nrelation = vec3((relation.x+relation.y+relation.z)/3.0);\nrelation = 1./(1. + exp(24. - 30. * relation));\neps = vec4(epslone * relation, epslone);\nif (any(lessThan(eps, vec4(0.000001)))) {\n     gl_FragColor = sourceColorVec4;\n     return;\n}\n" : "") + str2 + "    tmpVec4 = meanII - meanI * meanI;\n    vec4 temp2 = tmpVec4 + eps;\n    if (temp2.x <= 0. || temp2.y <= 0. || temp2.z <= 0. || temp2.x > 1.0 || temp2.y > 1.0 || temp2.z > 1.0 ){\n            gl_FragColor = sourceColorVec4 ;\n            return;\n    }\n    else {\n        vec4 a = tmpVec4 /temp2;\n        vec4 b = meanI - a * meanI;\n        gl_FragColor = a * sourceColorVec4 + b;\n        gl_FragColor.w = sourceColorVec4.w;\n        return;\n    }\n}\n";
    }

    private void init(edgePassFilterVersion edgepassfilterversion, int i, boolean z) {
        this.winsize_ = i;
        this.edgePassFilterType_ = edgepassfilterversion;
        this.bSkinDetect_ = z;
        int[] iArr = this.lowSkinThreshold;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int[] iArr2 = this.highSkinThreshold;
        iArr2[0] = 255;
        iArr2[1] = 255;
        iArr2[2] = 255;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p149l.mcj
    public void drawSub() {
        super.drawSub();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        this.width = getWidth();
        this.height = getHeight();
        int i = C40301.f14246x4e718477[this.edgePassFilterType_.ordinal()];
        if (i == 1) {
            return getSurfaceFilterFragmentShaderString(this.winsize_, this.bSkinDetect_);
        }
        if (i == 2) {
            return getGuidedFilterFragmentShaderString(this.winsize_, this.bSkinDetect_);
        }
        if (i == 3) {
            return getTransitionalGuidedFilterFragmentShaderString(this.winsize_, this.bSkinDetect_);
        }
        MDLog.m7391e("Beauty log", "Parameters Error: Invalid filter type!");
        return "";
    }

    public float getSkinSmoothScale() {
        return this.skinSmoothScale;
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return super.getVertexShader();
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        this.texelWidth = 1.0f / getWidth();
        this.texelHeight = 1.0f / getHeight();
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.skinSmoothScaleHanle = GLES20.glGetUniformLocation(this.programHandle, "parameter");
        this.lowSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "lowSkinThreshold");
        this.highSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "highSkinThreshold");
        this.defaultSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "skinDefaultRGB");
        this.texelWidthHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXELWIDTH);
        this.texelHeightHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXELHEIGHT);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.width = getWidth();
        int height = getHeight();
        this.height = height;
        this.texelWidth = 1.0f / this.width;
        this.texelHeight = 1.0f / height;
        super.passShaderValues();
        GLES20.glUniform1f(this.skinSmoothScaleHanle, this.skinSmoothScale);
        int i = this.lowSkinThresholdHandle;
        int[] iArr = this.lowSkinThreshold;
        GLES20.glUniform3f(i, iArr[0] / 255.0f, iArr[1] / 255.0f, (iArr[2] - 10) / 255.0f);
        int i2 = this.highSkinThresholdHandle;
        int[] iArr2 = this.highSkinThreshold;
        GLES20.glUniform3f(i2, iArr2[0] / 255.0f, iArr2[1] / 255.0f, iArr2[2] / 255.0f);
        int i3 = this.defaultSkinThresholdHandle;
        int[] iArr3 = this.defaultSkinThreshold;
        GLES20.glUniform3f(i3, iArr3[0] / 255.0f, iArr3[1] / 255.0f, iArr3[2] / 255.0f);
        GLES20.glUniform1f(this.texelWidthHandle, this.texelWidth);
        GLES20.glUniform1f(this.texelHeightHandle, this.texelHeight);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        zsf zsfVarM169946j = pjwVar.m169946j(0);
        int[] iArrM220029w = zsfVarM169946j == null ? null : zsfVarM169946j.m220029w();
        if (iArrM220029w == null || iArrM220029w.length < 9) {
            int[] iArr = this.lowSkinThreshold;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int[] iArr2 = this.highSkinThreshold;
            iArr2[0] = 255;
            iArr2[1] = 255;
            iArr2[2] = 255;
            int[] iArr3 = this.defaultSkinThreshold;
            iArr3[0] = 160;
            iArr3[1] = 120;
            iArr3[2] = 110;
            return;
        }
        int[] iArr4 = this.lowSkinThreshold;
        iArr4[0] = iArrM220029w[0];
        iArr4[1] = iArrM220029w[1];
        iArr4[2] = iArrM220029w[2];
        int[] iArr5 = this.highSkinThreshold;
        iArr5[0] = iArrM220029w[3];
        iArr5[1] = iArrM220029w[4];
        iArr5[2] = iArrM220029w[5];
        int[] iArr6 = this.defaultSkinThreshold;
        iArr6[0] = iArrM220029w[6];
        iArr6[1] = iArrM220029w[7];
        iArr6[2] = iArrM220029w[8];
    }

    public void setSkinSmoothScale(float f) {
        synchronized (getLockObject()) {
            this.skinSmoothScale = f;
        }
    }

    public FaceSkinSmoothFilter() {
        init(edgePassFilterVersion.guidedFilter, 4, true);
    }
}

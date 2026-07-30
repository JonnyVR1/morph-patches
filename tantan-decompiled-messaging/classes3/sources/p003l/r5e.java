package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class r5e extends ts2 {

    /* JADX INFO: renamed from: a */
    final String f6780a = "textureSize";

    /* JADX INFO: renamed from: b */
    final String f6781b = "scale";

    /* JADX INFO: renamed from: c */
    final String f6782c = "angles";

    /* JADX INFO: renamed from: d */
    final String f6783d = "singleAngleMode";

    /* JADX INFO: renamed from: e */
    private float f6784e = 9.0f;

    /* JADX INFO: renamed from: f */
    private float f6785f = 0.7853982f;

    /* JADX INFO: renamed from: g */
    private int f6786g;

    /* JADX INFO: renamed from: i */
    private int f6787i;

    /* JADX INFO: renamed from: j */
    private int f6788j;

    /* JADX INFO: renamed from: k */
    private int f6789k;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform vec2 textureSize;\nuniform float scale;\nuniform float angles;\n mat2 rotm(float r) {\n        float cr = cos(r);\n        float sr = sin(r);\n        return mat2(vec2(cr, -sr), vec2(sr, cr));\n    }\n\n    vec2 samplePosition(vec2 textureCoordinate, mat2 m, float scale){\n        vec2 rotatedTextureCoordinate = m * textureCoordinate;\n        return (rotatedTextureCoordinate - mod(textureCoordinate, vec2(scale)) + scale * 0.5) * m;\n    }\n\n    float halftoneIntensity(vec2 textureCoordinate, vec2 samplePos, float scale, vec3 grayColorTransform, vec4 color){\n        float grayscale = dot(color.rgb, grayColorTransform);\n        float d = scale * 1.414214 * (1.0 - grayscale);\n        float d1 = distance(textureCoordinate + vec2(-0.25), samplePos);\n        float d2 = distance(textureCoordinate + vec2(0.25, -0.25), samplePos);\n        float d3 = distance(textureCoordinate + vec2(-0.25, 0.25), samplePos);\n        float d4 = distance(textureCoordinate + vec2(0.25), samplePos);\n        return dot(vec4(lessThan(vec4(d1, d2, d3, d4), vec4(d/2.0))), vec4(0.25));\n    }\n\n    vec2 neighborSamplePosition(vec2 textureCoordinate, vec2 samplePosition, float scale, mat2 m){\n        vec2 p = (textureCoordinate - samplePosition) * m;\n        vec2 direction = (p.y > p.x) ? (-p.x > p.y ? vec2(-1, 0) :vec2(0, 1)) : (-p.y > p.x ? vec2(0, -1):vec2(1, 0));\n        return samplePosition + (m * direction) * scale;\n\n    }\n\n    void main(){\n        vec2 textureCoordinatePos = textureCoordinate * textureSize;\n        vec4 texCoordColor =texture2D(inputImageTexture0, textureCoordinate);\n        vec3 gray = vec3(0.299, 0.587, 0.114);\n        mat2 m = rotm(angles);\n        vec2 rotatedTextureCoordinate = m * textureCoordinatePos;\n        vec2 samplePos = (rotatedTextureCoordinate - mod(rotatedTextureCoordinate, vec2(scale)) + scale*0.5)*m;\n        vec4 color = texture2D(inputImageTexture0,  samplePos/textureSize);\n        float intensity = halftoneIntensity(textureCoordinatePos, samplePos, scale, gray, color);\n        vec2 samplePosNeighbor =  neighborSamplePosition(textureCoordinatePos, samplePos, scale, m);\n color = texture2D(inputImageTexture0,  samplePosNeighbor/textureSize);\n        float intensityNeighbor = halftoneIntensity(textureCoordinatePos, samplePosNeighbor, scale, gray, color);\n        float i = (1.0 - intensity) * (1.0 - intensityNeighbor);\n        gl_FragColor = vec4(vec3(i), texCoordColor.a);\n    }\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f6786g = GLES20.glGetUniformLocation(this.programHandle, "textureSize");
        this.f6787i = GLES20.glGetUniformLocation(this.programHandle, "scale");
        this.f6788j = GLES20.glGetUniformLocation(this.programHandle, "angles");
        this.f6789k = GLES20.glGetUniformLocation(this.programHandle, "singleAngleMode");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform2f(this.f6786g, getWidth(), getHeight());
        GLES20.glUniform1f(this.f6787i, this.f6784e);
        GLES20.glUniform1f(this.f6788j, this.f6785f);
    }
}

package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class be5 extends ts2 {

    /* JADX INFO: renamed from: a */
    final String f2376a = "textureSize";

    /* JADX INFO: renamed from: b */
    final String f2377b = "scale";

    /* JADX INFO: renamed from: c */
    final String f2378c = "angles";

    /* JADX INFO: renamed from: d */
    final String f2379d = "singleAngleMode";

    /* JADX INFO: renamed from: e */
    private float f2380e = 20.0f;

    /* JADX INFO: renamed from: f */
    private float[] f2381f = {0.7853982f, 0.7853982f, 0.7853982f, 0.0f};

    /* JADX INFO: renamed from: g */
    private int f2382g;

    /* JADX INFO: renamed from: i */
    private int f2383i;

    /* JADX INFO: renamed from: j */
    private int f2384j;

    /* JADX INFO: renamed from: k */
    private int f2385k;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n uniform vec2 textureSize;\nuniform float scale;\nuniform vec4 angles;\nuniform int singleAngleMode;\n mat2 rotm(float r) {\n        float cr = cos(r);\n        float sr = sin(r);\n        return mat2(vec2(cr, -sr), vec2(sr, cr));\n    }\n\n    vec2 samplePosition(vec2 textureCoordinate, mat2 m, float scale){\n        vec2 rotatedTextureCoordinate = m * textureCoordinate;\n        return (rotatedTextureCoordinate - mod(textureCoordinate, vec2(scale)) + scale * 0.5) * m;\n    }\n\n    float halftoneIntensity(vec2 textureCoordinate, vec2 samplePos, float scale, vec3 grayColorTransform, vec4 color){\n        float grayscale = dot(color.rgb, grayColorTransform);\n        float d = scale * 1.414214 * (1.0 - grayscale);\n        float d1 = distance(textureCoordinate + vec2(-0.25), samplePos);\n        float d2 = distance(textureCoordinate + vec2(0.25, -0.25), samplePos);\n        float d3 = distance(textureCoordinate + vec2(-0.25, 0.25), samplePos);\n        float d4 = distance(textureCoordinate + vec2(0.25), samplePos);\n        return dot(vec4(lessThan(vec4(d1, d2, d3, d4), vec4(d/2.0))), vec4(0.25));\n    }\n\n    vec3 halftoneIntensityRGB(vec2 textureCoordinate, vec2 samplePos, vec4 color, float scale){\n        vec3 d = scale * 1.414214 * (1.0 - color.rgb);\n        float d1 = distance(textureCoordinate + vec2(-0.25), samplePos);\n        float d2 = distance(textureCoordinate + vec2(0.25, -0.25), samplePos);\n        float d3 = distance(textureCoordinate + vec2(-0.25, 0.25), samplePos);\n        float d4 = distance(textureCoordinate + vec2(0.25), samplePos);\n        vec4 dis = vec4(d1, d2, d3, d4);\n        vec4 ra = vec4(0.25);\n        return vec3(dot(vec4(lessThan(dis, vec4(d.r/2.0))), ra),\n        dot(vec4(lessThan(dis, vec4(d.g/2.0))), ra),\n        dot(vec4(lessThan(dis, vec4(d.b/2.0))), ra));\n    }\n\n    vec2 neighborSamplePosition(vec2 textureCoordinate, vec2 samplePosition, float scale, mat2 m){\n        vec2 p = (textureCoordinate - samplePosition) * m;\n        vec2 direction = (p.y > p.x) ? (-p.x > p.y ? vec2(-1, 0) :vec2(0, 1)) : (-p.y > p.x ? vec2(0, -1):vec2(1, 0));\n        return samplePosition + (m * direction) * scale;\n\n    }\n\n    void main(){\n        vec3 intensityRGB;\n        vec3 intensityNeighborRGB;\n        vec2 textureCoordinatePos = textureCoordinate * textureSize;\n        vec4 texCoordColor =texture2D(inputImageTexture0, textureCoordinate);\n        if(singleAngleMode == 1){\n            mat2 m = rotm(angles.x);\n            vec2 samplePos = samplePosition(textureCoordinatePos, m, scale);\n            vec4 color =texture2D(inputImageTexture0, samplePos/textureSize);\n            intensityRGB = halftoneIntensityRGB(textureCoordinatePos, samplePos, color, scale);\n            samplePos = neighborSamplePosition(textureCoordinatePos, samplePos, scale, m);            color = texture2D(inputImageTexture0, samplePos/textureSize);\n            intensityNeighborRGB = halftoneIntensityRGB(textureCoordinatePos, samplePos, color, scale);\n        }else{\n            mat2 mr = rotm(angles.x);\n            mat2 mg = rotm(angles.y);\n            mat2 mb = rotm(angles.z);\n            vec2 samplePositionR = samplePosition(textureCoordinatePos, mr, scale);\n            vec2 samplePositionG = samplePosition(textureCoordinatePos, mg, scale);\n            vec2 samplePositionB = samplePosition(textureCoordinatePos, mb, scale);\n\n            vec4 color1 = texture2D(inputImageTexture0, samplePositionR/textureSize);\n            vec4 color2 = texture2D(inputImageTexture0, samplePositionG/textureSize);\n            vec4 color3 = texture2D(inputImageTexture0, samplePositionB/textureSize);\n\n            intensityRGB = vec3(halftoneIntensityRGB(textureCoordinatePos, samplePositionR, color1, scale).r,\n                                halftoneIntensityRGB(textureCoordinatePos, samplePositionG, color2, scale).g,\n                                halftoneIntensityRGB(textureCoordinatePos, samplePositionB, color3, scale).b);\n\n            samplePositionR = neighborSamplePosition(textureCoordinatePos, samplePositionR, scale, mr);\n            samplePositionG = neighborSamplePosition(textureCoordinatePos, samplePositionG, scale, mg);\n            samplePositionB = neighborSamplePosition(textureCoordinatePos, samplePositionB, scale, mb);\n\n            color1 = texture2D(inputImageTexture0, samplePositionR/textureSize);\n            color2 = texture2D(inputImageTexture0, samplePositionG/textureSize);\n            color3 = texture2D(inputImageTexture0, samplePositionB/textureSize);\n\n            intensityNeighborRGB = vec3(halftoneIntensityRGB(textureCoordinatePos, samplePositionR, color1, scale).r,\n                                        halftoneIntensityRGB(textureCoordinatePos, samplePositionG, color2, scale).g,\n                                        halftoneIntensityRGB(textureCoordinatePos, samplePositionB, color3, scale).b);\n        }\n        vec3 i = (1.0 - intensityRGB) * (1.0 - intensityNeighborRGB);\n        gl_FragColor = vec4(i, texCoordColor.a);\n    }\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f2382g = GLES20.glGetUniformLocation(this.programHandle, "textureSize");
        this.f2383i = GLES20.glGetUniformLocation(this.programHandle, "scale");
        this.f2384j = GLES20.glGetUniformLocation(this.programHandle, "angles");
        this.f2385k = GLES20.glGetUniformLocation(this.programHandle, "singleAngleMode");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform2f(this.f2382g, getWidth(), getHeight());
        GLES20.glUniform1f(this.f2383i, this.f2380e);
        float[] fArr = this.f2381f;
        if (fArr.length > 0) {
            float f = fArr[0];
            float f2 = fArr[1];
            if (f == f2 && f2 == fArr[2]) {
                GLES20.glUniform1i(this.f2385k, 1);
            } else {
                GLES20.glUniform1i(this.f2385k, 0);
            }
        } else {
            GLES20.glUniform1i(this.f2385k, 0);
        }
        int i = this.f2384j;
        float[] fArr2 = this.f2381f;
        GLES20.glUniform4f(i, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }
}

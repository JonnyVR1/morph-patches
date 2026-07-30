package p153l;

import android.opengl.GLES20;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes3.dex */
public class g7e extends jt2 {

    /* JADX INFO: renamed from: a */
    final String f102527a = BigEyeFilter.UNIFORM_TEXTURE_SIZE;

    /* JADX INFO: renamed from: b */
    final String f102528b = BigEyeFilter.UNIFORM_SCALE;

    /* JADX INFO: renamed from: c */
    final String f102529c = "angles";

    /* JADX INFO: renamed from: d */
    final String f102530d = "singleAngleMode";

    /* JADX INFO: renamed from: e */
    private float f102531e = 9.0f;

    /* JADX INFO: renamed from: f */
    private float f102532f = 0.7853982f;

    /* JADX INFO: renamed from: g */
    private int f102533g;

    /* JADX INFO: renamed from: i */
    private int f102534i;

    /* JADX INFO: renamed from: j */
    private int f102535j;

    /* JADX INFO: renamed from: k */
    private int f102536k;

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform vec2 textureSize;\nuniform float scale;\nuniform float angles;\n mat2 rotm(float r) {\n        float cr = cos(r);\n        float sr = sin(r);\n        return mat2(vec2(cr, -sr), vec2(sr, cr));\n    }\n\n    vec2 samplePosition(vec2 textureCoordinate, mat2 m, float scale){\n        vec2 rotatedTextureCoordinate = m * textureCoordinate;\n        return (rotatedTextureCoordinate - mod(textureCoordinate, vec2(scale)) + scale * 0.5) * m;\n    }\n\n    float halftoneIntensity(vec2 textureCoordinate, vec2 samplePos, float scale, vec3 grayColorTransform, vec4 color){\n        float grayscale = dot(color.rgb, grayColorTransform);\n        float d = scale * 1.414214 * (1.0 - grayscale);\n        float d1 = distance(textureCoordinate + vec2(-0.25), samplePos);\n        float d2 = distance(textureCoordinate + vec2(0.25, -0.25), samplePos);\n        float d3 = distance(textureCoordinate + vec2(-0.25, 0.25), samplePos);\n        float d4 = distance(textureCoordinate + vec2(0.25), samplePos);\n        return dot(vec4(lessThan(vec4(d1, d2, d3, d4), vec4(d/2.0))), vec4(0.25));\n    }\n\n    vec2 neighborSamplePosition(vec2 textureCoordinate, vec2 samplePosition, float scale, mat2 m){\n        vec2 p = (textureCoordinate - samplePosition) * m;\n        vec2 direction = (p.y > p.x) ? (-p.x > p.y ? vec2(-1, 0) :vec2(0, 1)) : (-p.y > p.x ? vec2(0, -1):vec2(1, 0));\n        return samplePosition + (m * direction) * scale;\n\n    }\n\n    void main(){\n        vec2 textureCoordinatePos = textureCoordinate * textureSize;\n        vec4 texCoordColor =texture2D(inputImageTexture0, textureCoordinate);\n        vec3 gray = vec3(0.299, 0.587, 0.114);\n        mat2 m = rotm(angles);\n        vec2 rotatedTextureCoordinate = m * textureCoordinatePos;\n        vec2 samplePos = (rotatedTextureCoordinate - mod(rotatedTextureCoordinate, vec2(scale)) + scale*0.5)*m;\n        vec4 color = texture2D(inputImageTexture0,  samplePos/textureSize);\n        float intensity = halftoneIntensity(textureCoordinatePos, samplePos, scale, gray, color);\n        vec2 samplePosNeighbor =  neighborSamplePosition(textureCoordinatePos, samplePos, scale, m);\n color = texture2D(inputImageTexture0,  samplePosNeighbor/textureSize);\n        float intensityNeighbor = halftoneIntensity(textureCoordinatePos, samplePosNeighbor, scale, gray, color);\n        float i = (1.0 - intensity) * (1.0 - intensityNeighbor);\n        gl_FragColor = vec4(vec3(i), texCoordColor.a);\n    }\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f102533g = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_TEXTURE_SIZE);
        this.f102534i = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_SCALE);
        this.f102535j = GLES20.glGetUniformLocation(this.programHandle, "angles");
        this.f102536k = GLES20.glGetUniformLocation(this.programHandle, "singleAngleMode");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform2f(this.f102533g, getWidth(), getHeight());
        GLES20.glUniform1f(this.f102534i, this.f102531e);
        GLES20.glUniform1f(this.f102535j, this.f102532f);
    }
}

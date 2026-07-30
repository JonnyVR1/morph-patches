package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class duf0 extends rt2 implements gam {

    /* JADX INFO: renamed from: a */
    private int f90792a;

    /* JADX INFO: renamed from: b */
    private float f90793b = 0.0f;

    /* JADX INFO: renamed from: c */
    private long f90794c = 100000;

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float time;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 st = textureCoordinate;\n  \n    float scale = 1.0 - mod(time * 1.3, 0.8) + 0.1;\n    if (scale < 0.0) {\n    gl_FragColor = texture2D(inputImageTexture0, st);\n    return;\n    }\n    vec2 newCoord = scaleFromCenter(st, scale);\n    float colorScale = scale * 0.5;\n    vec4 resultColor = texture2D(inputImageTexture0, st) * (1.0 - colorScale + 0.2);\n    vec4 newCoordColor = texture2D(inputImageTexture0, newCoord) * (colorScale - 0.2);\n    vec4 result = (resultColor + newCoordColor);\n    gl_FragColor = result;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f90792a = GLES20.glGetUniformLocation(this.programHandle, "time");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f90792a, this.f90793b);
    }

    @Override // p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f90793b = j / 1200.0f;
    }
}

package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ulf0 extends bt2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f8007a;

    /* JADX INFO: renamed from: b */
    private float f8008b = 0.0f;

    /* JADX INFO: renamed from: c */
    private long f8009c = 100000;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float time;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 st = textureCoordinate;\n  \n    float scale = 1.0 - mod(time * 1.3, 0.8) + 0.1;\n    if (scale < 0.0) {\n    gl_FragColor = texture2D(inputImageTexture0, st);\n    return;\n    }\n    vec2 newCoord = scaleFromCenter(st, scale);\n    float colorScale = scale * 0.5;\n    vec4 resultColor = texture2D(inputImageTexture0, st) * (1.0 - colorScale + 0.2);\n    vec4 newCoordColor = texture2D(inputImageTexture0, newCoord) * (colorScale - 0.2);\n    vec4 result = (resultColor + newCoordColor);\n    gl_FragColor = result;\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f8007a = GLES20.glGetUniformLocation(this.programHandle, "time");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f8007a, this.f8008b);
    }

    @Override // p003l.uff0, p003l.AbstractC0341i4, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f8008b = j / 1200.0f;
    }
}

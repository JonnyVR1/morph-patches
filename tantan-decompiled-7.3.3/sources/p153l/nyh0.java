package p153l;

import android.opengl.GLES20;
import com.p051p1.mobile.putong.data.OMSWidgeAnimationType;

/* JADX INFO: loaded from: classes3.dex */
public class nyh0 extends rt2 implements gam {

    /* JADX INFO: renamed from: a */
    private int f144310a;

    /* JADX INFO: renamed from: b */
    private int f144311b;

    /* JADX INFO: renamed from: c */
    private int f144312c;

    /* JADX INFO: renamed from: d */
    private int f144313d;

    /* JADX INFO: renamed from: e */
    private int f144314e;

    /* JADX INFO: renamed from: f */
    private float f144315f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f144316g = 1.0f;

    /* JADX INFO: renamed from: i */
    private float f144317i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f144318j = 1.0f;

    /* JADX INFO: renamed from: k */
    private float f144319k = 0.0f;

    /* JADX INFO: renamed from: l */
    private long f144320l = 100000;

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform float colorization;\nuniform float noise;\nuniform float parasite;\nuniform float fade;\nuniform float time;\nvarying vec2 textureCoordinate;\nfloat rng2(vec2 seed, float time)\n{\n    return fract(sin(dot(seed * floor(time * 12.0), vec2(12.9898,78.233))) * 43758.5453123);\n}\nfloat rng(float seed, float time)\n{\n    return rng2(vec2(seed, 1.0), time);\n}\nvoid main(){\n   vec2 uv = textureCoordinate;\n   vec2 blockS = floor(uv * vec2(24.0,9.0));\n   vec2 blockL = floor(uv * vec2(8.0,4.0));\n   float r = rng2(uv,time);\n   vec3 noise_ = (vec3(r, 1. - r * colorization, r / 2.0 + 0.5) * 1.0 * noise - 2.0) * 0.08;\n   float lineNoise = pow(rng2(blockS, time), 8.0) * parasite * pow(rng2(blockL, time), 3.0) - pow(rng(7.2341, time), 17.0) * 2.0;\n   vec4 col1 = texture2D(inputImageTexture0,uv).rgba;\n   vec4 col2 = texture2D(inputImageTexture0,uv + vec2(lineNoise * 0.05 * rng(5.0, time), 0)).rgba;\n   vec4 col3 = texture2D(inputImageTexture0,uv - vec2(lineNoise * 0.05 * rng(31.0, time), 0)).rgba;\n   vec4 result = vec4(vec3(col1.x, col2.y, col3.z) + noise_, 1.0);\n   result = mix(col1,result,fade);\n   gl_FragColor = result;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f144310a = GLES20.glGetUniformLocation(this.programHandle, "colorization");
        this.f144311b = GLES20.glGetUniformLocation(this.programHandle, "noise");
        this.f144312c = GLES20.glGetUniformLocation(this.programHandle, "parasite");
        this.f144313d = GLES20.glGetUniformLocation(this.programHandle, OMSWidgeAnimationType.fade);
        this.f144314e = GLES20.glGetUniformLocation(this.programHandle, "time");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f144310a, this.f144315f);
        GLES20.glUniform1f(this.f144311b, this.f144316g);
        GLES20.glUniform1f(this.f144312c, this.f144317i);
        GLES20.glUniform1f(this.f144313d, this.f144318j);
        GLES20.glUniform1f(this.f144314e, this.f144319k);
    }

    @Override // p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f144319k = j / 1200.0f;
    }
}

package p149l;

import android.opengl.GLES20;
import com.p046p1.mobile.putong.data.OMSWidgeAnimationType;

/* JADX INFO: loaded from: classes3.dex */
public class gqh0 extends bt2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f103941a;

    /* JADX INFO: renamed from: b */
    private int f103942b;

    /* JADX INFO: renamed from: c */
    private int f103943c;

    /* JADX INFO: renamed from: d */
    private int f103944d;

    /* JADX INFO: renamed from: e */
    private int f103945e;

    /* JADX INFO: renamed from: f */
    private float f103946f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f103947g = 1.0f;

    /* JADX INFO: renamed from: i */
    private float f103948i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f103949j = 1.0f;

    /* JADX INFO: renamed from: k */
    private float f103950k = 0.0f;

    /* JADX INFO: renamed from: l */
    private long f103951l = 100000;

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform float colorization;\nuniform float noise;\nuniform float parasite;\nuniform float fade;\nuniform float time;\nvarying vec2 textureCoordinate;\nfloat rng2(vec2 seed, float time)\n{\n    return fract(sin(dot(seed * floor(time * 12.0), vec2(12.9898,78.233))) * 43758.5453123);\n}\nfloat rng(float seed, float time)\n{\n    return rng2(vec2(seed, 1.0), time);\n}\nvoid main(){\n   vec2 uv = textureCoordinate;\n   vec2 blockS = floor(uv * vec2(24.0,9.0));\n   vec2 blockL = floor(uv * vec2(8.0,4.0));\n   float r = rng2(uv,time);\n   vec3 noise_ = (vec3(r, 1. - r * colorization, r / 2.0 + 0.5) * 1.0 * noise - 2.0) * 0.08;\n   float lineNoise = pow(rng2(blockS, time), 8.0) * parasite * pow(rng2(blockL, time), 3.0) - pow(rng(7.2341, time), 17.0) * 2.0;\n   vec4 col1 = texture2D(inputImageTexture0,uv).rgba;\n   vec4 col2 = texture2D(inputImageTexture0,uv + vec2(lineNoise * 0.05 * rng(5.0, time), 0)).rgba;\n   vec4 col3 = texture2D(inputImageTexture0,uv - vec2(lineNoise * 0.05 * rng(31.0, time), 0)).rgba;\n   vec4 result = vec4(vec3(col1.x, col2.y, col3.z) + noise_, 1.0);\n   result = mix(col1,result,fade);\n   gl_FragColor = result;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f103941a = GLES20.glGetUniformLocation(this.programHandle, "colorization");
        this.f103942b = GLES20.glGetUniformLocation(this.programHandle, "noise");
        this.f103943c = GLES20.glGetUniformLocation(this.programHandle, "parasite");
        this.f103944d = GLES20.glGetUniformLocation(this.programHandle, OMSWidgeAnimationType.fade);
        this.f103945e = GLES20.glGetUniformLocation(this.programHandle, "time");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f103941a, this.f103946f);
        GLES20.glUniform1f(this.f103942b, this.f103947g);
        GLES20.glUniform1f(this.f103943c, this.f103948i);
        GLES20.glUniform1f(this.f103944d, this.f103949j);
        GLES20.glUniform1f(this.f103945e, this.f103950k);
    }

    @Override // p149l.uff0, p149l.AbstractC17477i4, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f103950k = j / 1200.0f;
    }
}

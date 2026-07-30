package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gqh0 extends bt2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f3973a;

    /* JADX INFO: renamed from: b */
    private int f3974b;

    /* JADX INFO: renamed from: c */
    private int f3975c;

    /* JADX INFO: renamed from: d */
    private int f3976d;

    /* JADX INFO: renamed from: e */
    private int f3977e;

    /* JADX INFO: renamed from: f */
    private float f3978f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f3979g = 1.0f;

    /* JADX INFO: renamed from: i */
    private float f3980i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f3981j = 1.0f;

    /* JADX INFO: renamed from: k */
    private float f3982k = 0.0f;

    /* JADX INFO: renamed from: l */
    private long f3983l = 100000;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform float colorization;\nuniform float noise;\nuniform float parasite;\nuniform float fade;\nuniform float time;\nvarying vec2 textureCoordinate;\nfloat rng2(vec2 seed, float time)\n{\n    return fract(sin(dot(seed * floor(time * 12.0), vec2(12.9898,78.233))) * 43758.5453123);\n}\nfloat rng(float seed, float time)\n{\n    return rng2(vec2(seed, 1.0), time);\n}\nvoid main(){\n   vec2 uv = textureCoordinate;\n   vec2 blockS = floor(uv * vec2(24.0,9.0));\n   vec2 blockL = floor(uv * vec2(8.0,4.0));\n   float r = rng2(uv,time);\n   vec3 noise_ = (vec3(r, 1. - r * colorization, r / 2.0 + 0.5) * 1.0 * noise - 2.0) * 0.08;\n   float lineNoise = pow(rng2(blockS, time), 8.0) * parasite * pow(rng2(blockL, time), 3.0) - pow(rng(7.2341, time), 17.0) * 2.0;\n   vec4 col1 = texture2D(inputImageTexture0,uv).rgba;\n   vec4 col2 = texture2D(inputImageTexture0,uv + vec2(lineNoise * 0.05 * rng(5.0, time), 0)).rgba;\n   vec4 col3 = texture2D(inputImageTexture0,uv - vec2(lineNoise * 0.05 * rng(31.0, time), 0)).rgba;\n   vec4 result = vec4(vec3(col1.x, col2.y, col3.z) + noise_, 1.0);\n   result = mix(col1,result,fade);\n   gl_FragColor = result;\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f3973a = GLES20.glGetUniformLocation(this.programHandle, "colorization");
        this.f3974b = GLES20.glGetUniformLocation(this.programHandle, "noise");
        this.f3975c = GLES20.glGetUniformLocation(this.programHandle, "parasite");
        this.f3976d = GLES20.glGetUniformLocation(this.programHandle, "fade");
        this.f3977e = GLES20.glGetUniformLocation(this.programHandle, "time");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f3973a, this.f3978f);
        GLES20.glUniform1f(this.f3974b, this.f3979g);
        GLES20.glUniform1f(this.f3975c, this.f3980i);
        GLES20.glUniform1f(this.f3976d, this.f3981j);
        GLES20.glUniform1f(this.f3977e, this.f3982k);
    }

    @Override // p003l.uff0, p003l.AbstractC0341i4, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f3982k = j / 1200.0f;
    }
}

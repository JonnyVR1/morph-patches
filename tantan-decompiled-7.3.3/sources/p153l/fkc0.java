package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class fkc0 extends rt2 {

    /* JADX INFO: renamed from: a */
    private int f99494a;

    /* JADX INFO: renamed from: b */
    private float f99495b = 0.0f;

    /* JADX INFO: renamed from: c */
    private long f99496c = 100000;

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float iTime;\n#define S(a, b, t) smoothstep(a, b, t)\n #define CHEAP_NORMALS\n #define USE_POST_PROCESSING\nvec3 N13(float p) {\n   vec3 p3 = fract(vec3(p) * vec3(.1031,.11369,.13787));\n   p3 += dot(p3, p3.yzx + 19.19);\n   return fract(vec3((p3.x + p3.y)*p3.z, (p3.x+p3.z)*p3.y, (p3.y+p3.z)*p3.x));\n}\nvec4 N14(float t) {\n\treturn fract(sin(t*vec4(123., 1024., 1456., 264.))*vec4(6547., 345., 8799., 1564.));\n}\nfloat N(float t) {\n    return fract(sin(t*12345.564)*7658.76);\n}\nfloat Saw(float b, float t) {\n\treturn S(0., b, t)*S(1., b, t);\n}\nfloat StaticDrops(vec2 uv, float t) {\n\tuv *= 40.;\n    \n    vec2 id = floor(uv);\n    uv = fract(uv)-.5;\n    vec3 n = N13(id.x*107.45+id.y*3543.654);\n    vec2 p = (n.xy-.5)*.7;\n    float d = length(uv-p);\n    \n    float fade = Saw(.025, fract(t+n.z));\n    float c = S(.3, 0., d)*fract(n.z*20.)*fade;\n    return c;\n}\n\nvec2 Drops(vec2 uv, float t, float l0, float l1, float l2) {\n    float s = StaticDrops(uv, t)*l0; \n    vec2 m1 = vec2(0.0,0.0);\n    vec2 m2 = vec2(0.0,0.0);\n    \n    float c = s+m1.x+m2.x;\n    c = S(.3, 1.0, c);\n    \n    return vec2(c, max(m1.y*l0, m2.y*l1));\n}void main(){\n    vec2 uv = textureCoordinate - vec2(0.5,0.5);\n    vec2 UV = textureCoordinate;\n    float T = iTime; \n    float t = T*0.5;    \n    float rainAmount = sin(T*.05)*.3+1.5;   \n    float staticDrops = S(.1, 1., rainAmount)*2.;\n    float layer1 = S(.25, .75, rainAmount);\n    float layer2 = S(.0, .5, rainAmount);\n    vec2 c = Drops(uv, t, staticDrops, layer1, layer2);\n    vec2 e = vec2(0.001, 0.);\n    float cx = Drops(uv+e, t, staticDrops, layer1, layer2).x;\n    float cy = Drops(uv+e.yx, t, staticDrops, layer1, layer2).x;\n    vec2 n = vec2(cx-c.x, cy-c.x);\n    vec3 col = texture2D(inputImageTexture0, UV-n).rgb; \n    gl_FragColor = vec4(col, 1.);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f99494a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f99494a, this.f99495b);
    }

    @Override // p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f99495b = j / 1200.0f;
    }
}

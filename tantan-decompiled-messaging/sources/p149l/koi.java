package p149l;

import android.opengl.GLES20;
import com.p046p1.mobile.putong.data.OMSSizeType;
import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class koi extends AbstractC17477i4 {

    /* JADX INFO: renamed from: a */
    private String[] f124018a = new String[2];

    /* JADX INFO: renamed from: b */
    private int f124019b;

    /* JADX INFO: renamed from: c */
    private int f124020c;

    /* JADX INFO: renamed from: d */
    private int f124021d;

    /* JADX INFO: renamed from: e */
    private int f124022e;

    /* JADX INFO: renamed from: f */
    private int f124023f;

    /* JADX INFO: renamed from: Q1 */
    private void m146714Q1() {
        int i = this.f124023f;
        if (i > 0 || this.f124022e > 0) {
            GLES20.glDeleteTextures(2, new int[]{i, this.f124022e}, 0);
            this.f124023f = 0;
            this.f124022e = 0;
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        m146714Q1();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D boxTexture;\nuniform sampler2D bottomTexture;\nuniform vec2 ratio;\nfloat PI = 3.14159265358979323846;\n\nfloat rand(vec2 co) {\n    return fract(sin(dot(co.xy, vec2(12.9898, 78.233))) * 43758.5453);\n}\n\nvec4 getBg(sampler2D texture, vec2 uv) {\n    vec2 center = vec2(0.5, 0.5);\n    vec2 rr = uv + 0.01 * 1.4 * (uv - center);\n    vec2 bb = uv - 0.02 * 1.4 * (uv - center);\n\n    float r = texture2D(texture, clamp(rr, 0.0, 1.0)).r;\n    float g = texture2D(texture, uv).g;\n    float b = texture2D(texture, clamp(bb, 0.0, 1.0)).b;\n\n    return vec4(r, g, b, 1.0);\n}\n\nvec3 checker(vec2 uv) {\n    return getBg(inputImageTexture, uv).rgb;\n}\n\nvec3 checker2(vec2 uv) {\n    return vec3(0.0);\n}\n\nvec4 getColor(vec2 uv) {\n    float d = length(uv);\n    if (d > 1.0) return vec4(checker2(uv), 1.0);\n    float z = sqrt(1.0 - 1.0 * d * d); //0.8->radius\n    float r = atan(d, z) / PI; //main deform fuction -> 1.0 / (PI/2) for normalization, then /2 for scale to [0,0.5]\n\n    float phi = atan(uv.y, uv.x);\n    uv = vec2(r * cos(phi), r * sin(phi) * ratio.x);\n    uv *= 1.8;//intensity\n    uv += vec2(0.5);\n    return vec4(checker(uv), 1.0);\n}\n\nvec4 reverse(sampler2D texture) {\n    vec2 tex = textureCoordinate;\n    tex.y = 1. - tex.y;\n    return texture2D(texture, tex);\n}\n\nvec4 blend_normal(vec4 base, vec4 overlay) {\n    return base + overlay * (1.0 - base.a);\n}\n\nvoid main() {\n    vec2 uv = textureCoordinate.xy * 2. - vec2(1.);\n    uv /= 1.4;//radius of visible\n    uv /= vec2(1., ratio.x);\n\n    vec4 fragColor = getColor(uv);\n    vec4 boxColor = texture2D(boxTexture, textureCoordinate);\n    vec4 bottomColor = texture2D(bottomTexture, textureCoordinate);\n\n    fragColor = blend_normal(bottomColor, fragColor);\n    fragColor = blend_normal(boxColor, fragColor);\n    gl_FragColor = fragColor;\n}";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f124019b = GLES20.glGetUniformLocation(this.programHandle, "boxTexture");
        this.f124020c = GLES20.glGetUniformLocation(this.programHandle, "bottomTexture");
        this.f124021d = GLES20.glGetUniformLocation(this.programHandle, OMSSizeType.ratio);
    }

    @Override // p149l.AbstractC17477i4, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f124022e == 0) {
            this.f124022e = lgm.m149781a(lgm.m149783c(this.f124018a[0]));
        }
        if (this.f124023f == 0) {
            this.f124023f = lgm.m149781a(lgm.m149783c(this.f124018a[1]));
        }
        float width = getWidth() / getHeight();
        GLES20.glUniform2f(this.f124021d, width, 1.0f / width);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f124023f);
        GLES20.glUniform1i(this.f124020c, 1);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.f124022e);
        GLES20.glUniform1i(this.f124019b, 2);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        m146714Q1();
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        String[] strArr = this.f124018a;
        StringBuilder sb = new StringBuilder();
        sb.append(filterOptions.getFolder());
        String str = File.separator;
        sb.append(str);
        sb.append("box.png");
        strArr[0] = sb.toString();
        this.f124018a[1] = filterOptions.getFolder() + str + "bottom.png";
    }
}

package p007l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 K2\u00020\u0001:\u0001\nB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b#\u0010\u0019R\"\u0010&\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b%\u0010\u0019R\"\u0010*\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\"\u0010.\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\"\u00101\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0015\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\"\u00103\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b2\u0010\u0019R\"\u00105\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0015\u001a\u0004\b\n\u0010\u0017\"\u0004\b4\u0010\u0019R\"\u00107\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017\"\u0004\b6\u0010\u0019R\"\u0010=\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\b\u001f\u0010:\"\u0004\b;\u0010<R\"\u0010C\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010?\u001a\u0004\b+\u0010@\"\u0004\bA\u0010BR*\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bF\u0010H\"\u0004\bI\u0010J¨\u0006L"}, d2 = {"Ll/y8j0;", "", "", "vertexShader", "fragmentShader", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "o", "()V", "a", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "setVertexShader", "(Ljava/lang/String;)V", "b", "getFragmentShader", "setFragmentShader", "", "c", "I", "g", "()I", "t", "(I)V", "positionAttr", "d", "m", "y", "textureCoordinateAttr", "e", "f", "s", "mvpMatrixUniform", "r", "flipYUniform", "q", "flipXUniform", "h", "j", "v", "ratioUniform", "i", "k", "w", "texture1Uniform", "l", "x", "texture2Uniform", "u", "progressUniform", "setFlipX", "flipX", "setFlipY", "flipY", "", "[F", "()[F", "setMvpMatrix", "([F)V", "mvpMatrix", "", "F", "()F", "setRatio", "(F)V", "ratio", "", "value", "isFlipVertical", "Z", "()Z", "p", "(Z)V", "Companion", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class y8j0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String vertexShader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String fragmentShader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int positionAttr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int textureCoordinateAttr;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int mvpMatrixUniform;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int flipYUniform;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int flipXUniform;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int ratioUniform;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int texture1Uniform;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int texture2Uniform;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int progressUniform;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int flipX;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int flipY;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public float[] mvpMatrix;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float ratio;

    public y8j0(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.vertexShader = str;
        this.fragmentShader = str2;
        this.mvpMatrix = new float[16];
        this.ratio = 1.0f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFlipX() {
        return this.flipX;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFlipXUniform() {
        return this.flipXUniform;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFlipY() {
        return this.flipY;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFlipYUniform() {
        return this.flipYUniform;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final float[] getMvpMatrix() {
        return this.mvpMatrix;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMvpMatrixUniform() {
        return this.mvpMatrixUniform;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPositionAttr() {
        return this.positionAttr;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getProgressUniform() {
        return this.progressUniform;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getRatio() {
        return this.ratio;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getRatioUniform() {
        return this.ratioUniform;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTexture1Uniform() {
        return this.texture1Uniform;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getTexture2Uniform() {
        return this.texture2Uniform;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getTextureCoordinateAttr() {
        return this.textureCoordinateAttr;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getVertexShader() {
        return this.vertexShader;
    }

    /* JADX INFO: renamed from: p */
    public final void m11896p(boolean z) {
        this.flipY = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m11897q(int i) {
        this.flipXUniform = i;
    }

    /* JADX INFO: renamed from: r */
    public final void m11898r(int i) {
        this.flipYUniform = i;
    }

    /* JADX INFO: renamed from: s */
    public final void m11899s(int i) {
        this.mvpMatrixUniform = i;
    }

    /* JADX INFO: renamed from: t */
    public final void m11900t(int i) {
        this.positionAttr = i;
    }

    /* JADX INFO: renamed from: u */
    public final void m11901u(int i) {
        this.progressUniform = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m11902v(int i) {
        this.ratioUniform = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m11903w(int i) {
        this.texture1Uniform = i;
    }

    /* JADX INFO: renamed from: x */
    public final void m11904x(int i) {
        this.texture2Uniform = i;
    }

    /* JADX INFO: renamed from: y */
    public final void m11905y(int i) {
        this.textureCoordinateAttr = i;
    }

    /* JADX INFO: renamed from: l.y8j0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Ll/y8j0$a;", "", "<init>", "()V", "Ll/w7j0;", "transition", "Ll/z8j0;", "a", "(Ll/w7j0;)Ll/z8j0;", "", "TAG", "Ljava/lang/String;", "VERTEX_SHADER", "FRAGMENT_SHADER", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final z8j0 m11906a(@NotNull w7j0 transition) {
            transition.getClass();
            return new z8j0(transition);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: o */
    public void m11895o() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y8j0() {
        String str = null;
        this(str, str, 3, str);
    }

    public /* synthetic */ y8j0(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "\nprecision mediump float;\n\nattribute vec4 vPosition;\nattribute vec2 vTextureCoordinate;\n\nvarying vec2 texCoord;\n\nuniform mat4 mvpMatrix;\nuniform bool flipY;\nuniform bool flipX;\n\nvoid main() {\n    gl_Position = mvpMatrix * vPosition;\n    texCoord = vTextureCoordinate;\n\n    if (flipY) {\n        texCoord.y = 1.0 - texCoord.y;\n    }\n\n    if (flipX) {\n        texCoord.x = 1.0 - texCoord.x;\n    }\n}\n        " : str, (i & 2) != 0 ? "\nprecision mediump float;\n\nuniform sampler2D texture1;\nuniform sampler2D texture2;\n\nuniform float progress;\nuniform float ratio;\n\nvarying vec2 texCoord;\n\nvec4 getFromColor(vec2 uv) {\n  return texture2D(texture1, uv);\n}\n\nvec4 getToColor(vec2 uv) {\n  return texture2D(texture2, uv);\n}\n\nvec4 transition(vec2 uv);\n\nvoid main() {\n  gl_FragColor = transition(texCoord);\n}\n        " : str2);
    }
}

package p153l;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C2079b;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c5b0 {

    /* JADX INFO: renamed from: j */
    public static final float[] f79823j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f79824k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l */
    public static final float[] f79825l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m */
    public static final float[] f79826m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n */
    public static final float[] f79827n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f79828a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C16191a f79829b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C16191a f79830c;

    /* JADX INFO: renamed from: d */
    public C2079b f79831d;

    /* JADX INFO: renamed from: e */
    public int f79832e;

    /* JADX INFO: renamed from: f */
    public int f79833f;

    /* JADX INFO: renamed from: g */
    public int f79834g;

    /* JADX INFO: renamed from: h */
    public int f79835h;

    /* JADX INFO: renamed from: i */
    public int f79836i;

    /* JADX INFO: renamed from: l.c5b0$a */
    public static class C16191a {

        /* JADX INFO: renamed from: a */
        public final int f79837a;

        /* JADX INFO: renamed from: b */
        public final FloatBuffer f79838b;

        /* JADX INFO: renamed from: c */
        public final FloatBuffer f79839c;

        /* JADX INFO: renamed from: d */
        public final int f79840d;

        public C16191a(a5b0.C15650b c15650b) {
            this.f79837a = c15650b.m96046a();
            this.f79838b = GlUtil.m12186e(c15650b.f68539c);
            this.f79839c = GlUtil.m12186e(c15650b.f68540d);
            int i = c15650b.f68538b;
            if (i == 1) {
                this.f79840d = 5;
            } else if (i != 2) {
                this.f79840d = 4;
            } else {
                this.f79840d = 6;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m108023c(a5b0 a5b0Var) {
        a5b0.C15649a c15649a = a5b0Var.f68532a;
        a5b0.C15649a c15649a2 = a5b0Var.f68533b;
        return c15649a.m96045b() == 1 && c15649a.m96044a(0).f68537a == 0 && c15649a2.m96045b() == 1 && c15649a2.m96044a(0).f68537a == 0;
    }

    /* JADX INFO: renamed from: a */
    public void m108024a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        C16191a c16191a = z ? this.f79830c : this.f79829b;
        if (c16191a == null) {
            return;
        }
        int i2 = this.f79828a;
        if (i2 == 1) {
            fArr2 = z ? f79825l : f79824k;
        } else if (i2 == 2) {
            fArr2 = z ? f79827n : f79826m;
        } else {
            fArr2 = f79823j;
        }
        GLES20.glUniformMatrix3fv(this.f79833f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f79832e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f79836i, 0);
        try {
            GlUtil.m12183b();
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.f79834g, 3, 5126, false, 12, (Buffer) c16191a.f79838b);
        try {
            GlUtil.m12183b();
        } catch (GlUtil.GlException e2) {
            Log.e("ProjectionRenderer", "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.f79835h, 2, 5126, false, 8, (Buffer) c16191a.f79839c);
        try {
            GlUtil.m12183b();
        } catch (GlUtil.GlException e3) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(c16191a.f79840d, 0, c16191a.f79837a);
        try {
            GlUtil.m12183b();
        } catch (GlUtil.GlException e4) {
            Log.e("ProjectionRenderer", "Failed to render", e4);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m108025b() {
        try {
            C2079b c2079b = new C2079b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f79831d = c2079b;
            this.f79832e = c2079b.m12224j("uMvpMatrix");
            this.f79833f = this.f79831d.m12224j("uTexMatrix");
            this.f79834g = this.f79831d.m12222e("aPosition");
            this.f79835h = this.f79831d.m12222e("aTexCoords");
            this.f79836i = this.f79831d.m12224j("uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m108026d(a5b0 a5b0Var) {
        if (m108023c(a5b0Var)) {
            this.f79828a = a5b0Var.f68534c;
            C16191a c16191a = new C16191a(a5b0Var.f68532a.m96044a(0));
            this.f79829b = c16191a;
            if (!a5b0Var.f68535d) {
                c16191a = new C16191a(a5b0Var.f68533b.m96044a(0));
            }
            this.f79830c = c16191a;
        }
    }
}

package p149l;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C2056b;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ywa0 {

    /* JADX INFO: renamed from: j */
    public static final float[] f200394j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f200395k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l */
    public static final float[] f200396l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m */
    public static final float[] f200397m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n */
    public static final float[] f200398n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f200399a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C21555a f200400b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C21555a f200401c;

    /* JADX INFO: renamed from: d */
    public C2056b f200402d;

    /* JADX INFO: renamed from: e */
    public int f200403e;

    /* JADX INFO: renamed from: f */
    public int f200404f;

    /* JADX INFO: renamed from: g */
    public int f200405g;

    /* JADX INFO: renamed from: h */
    public int f200406h;

    /* JADX INFO: renamed from: i */
    public int f200407i;

    /* JADX INFO: renamed from: l.ywa0$a */
    public static class C21555a {

        /* JADX INFO: renamed from: a */
        public final int f200408a;

        /* JADX INFO: renamed from: b */
        public final FloatBuffer f200409b;

        /* JADX INFO: renamed from: c */
        public final FloatBuffer f200410c;

        /* JADX INFO: renamed from: d */
        public final int f200411d;

        public C21555a(wwa0.C20984b c20984b) {
            this.f200408a = c20984b.m205851a();
            this.f200409b = GlUtil.m12132e(c20984b.f188364c);
            this.f200410c = GlUtil.m12132e(c20984b.f188365d);
            int i = c20984b.f188363b;
            if (i == 1) {
                this.f200411d = 5;
            } else if (i != 2) {
                this.f200411d = 4;
            } else {
                this.f200411d = 6;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216300c(wwa0 wwa0Var) {
        wwa0.C20983a c20983a = wwa0Var.f188357a;
        wwa0.C20983a c20983a2 = wwa0Var.f188358b;
        return c20983a.m205850b() == 1 && c20983a.m205849a(0).f188362a == 0 && c20983a2.m205850b() == 1 && c20983a2.m205849a(0).f188362a == 0;
    }

    /* JADX INFO: renamed from: a */
    public void m216301a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        C21555a c21555a = z ? this.f200401c : this.f200400b;
        if (c21555a == null) {
            return;
        }
        int i2 = this.f200399a;
        if (i2 == 1) {
            fArr2 = z ? f200396l : f200395k;
        } else if (i2 == 2) {
            fArr2 = z ? f200398n : f200397m;
        } else {
            fArr2 = f200394j;
        }
        GLES20.glUniformMatrix3fv(this.f200404f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f200403e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f200407i, 0);
        try {
            GlUtil.m12129b();
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.f200405g, 3, 5126, false, 12, (Buffer) c21555a.f200409b);
        try {
            GlUtil.m12129b();
        } catch (GlUtil.GlException e2) {
            Log.e("ProjectionRenderer", "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.f200406h, 2, 5126, false, 8, (Buffer) c21555a.f200410c);
        try {
            GlUtil.m12129b();
        } catch (GlUtil.GlException e3) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(c21555a.f200411d, 0, c21555a.f200408a);
        try {
            GlUtil.m12129b();
        } catch (GlUtil.GlException e4) {
            Log.e("ProjectionRenderer", "Failed to render", e4);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m216302b() {
        try {
            C2056b c2056b = new C2056b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f200402d = c2056b;
            this.f200403e = c2056b.m12170j("uMvpMatrix");
            this.f200404f = this.f200402d.m12170j("uTexMatrix");
            this.f200405g = this.f200402d.m12168e("aPosition");
            this.f200406h = this.f200402d.m12168e("aTexCoords");
            this.f200407i = this.f200402d.m12170j("uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m216303d(wwa0 wwa0Var) {
        if (m216300c(wwa0Var)) {
            this.f200399a = wwa0Var.f188359c;
            C21555a c21555a = new C21555a(wwa0Var.f188357a.m205849a(0));
            this.f200400b = c21555a;
            if (!wwa0Var.f188360d) {
                c21555a = new C21555a(wwa0Var.f188358b.m205849a(0));
            }
            this.f200401c = c21555a;
        }
    }
}

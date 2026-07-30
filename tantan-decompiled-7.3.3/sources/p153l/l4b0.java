package p153l;

import android.opengl.GLES20;
import com.immomo.moment.opengl.Drawable2d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l4b0 {

    /* JADX INFO: renamed from: f */
    private static final String f129953f = z3k.f202834a;

    /* JADX INFO: renamed from: a */
    protected int f129954a;

    /* JADX INFO: renamed from: c */
    protected int[] f129956c;

    /* JADX INFO: renamed from: d */
    protected int[] f129957d;

    /* JADX INFO: renamed from: e */
    protected int f129958e = 1;

    /* JADX INFO: renamed from: b */
    protected Drawable2d f129955b = mo20010b();

    public l4b0(String str, String str2) {
        this.f129954a = z3k.m218486d(str, str2);
        mo20011c();
    }

    /* JADX INFO: renamed from: a */
    private void m152749a() {
        int[] iArr = this.f129957d;
        if (iArr != null) {
            GLES20.glDeleteTextures(this.f129958e, iArr, 0);
            this.f129957d = null;
        }
        int[] iArr2 = this.f129956c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(this.f129958e, iArr2, 0);
            this.f129956c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Drawable2d mo20010b();

    /* JADX INFO: renamed from: c */
    public abstract void mo20011c();

    /* JADX INFO: renamed from: d */
    public void m152750d() {
        m152749a();
        GLES20.glDeleteProgram(this.f129954a);
        this.f129954a = -1;
    }
}

package p149l;

import android.opengl.GLES20;
import com.immomo.moment.opengl.Drawable2d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hwa0 {

    /* JADX INFO: renamed from: f */
    private static final String f109743f = j1k.f115819a;

    /* JADX INFO: renamed from: a */
    protected int f109744a;

    /* JADX INFO: renamed from: c */
    protected int[] f109746c;

    /* JADX INFO: renamed from: d */
    protected int[] f109747d;

    /* JADX INFO: renamed from: e */
    protected int f109748e = 1;

    /* JADX INFO: renamed from: b */
    protected Drawable2d f109745b = mo19030b();

    public hwa0(String str, String str2) {
        this.f109744a = j1k.m139327d(str, str2);
        mo19031c();
    }

    /* JADX INFO: renamed from: a */
    private void m133239a() {
        int[] iArr = this.f109747d;
        if (iArr != null) {
            GLES20.glDeleteTextures(this.f109748e, iArr, 0);
            this.f109747d = null;
        }
        int[] iArr2 = this.f109746c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(this.f109748e, iArr2, 0);
            this.f109746c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Drawable2d mo19030b();

    /* JADX INFO: renamed from: c */
    public abstract void mo19031c();

    /* JADX INFO: renamed from: d */
    public void m133240d() {
        m133239a();
        GLES20.glDeleteProgram(this.f109744a);
        this.f109744a = -1;
    }
}

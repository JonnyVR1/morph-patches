package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class oej {

    /* JADX INFO: renamed from: b */
    protected volatile boolean f146997b;

    /* JADX INFO: renamed from: c */
    private final Object f146998c = new Object();

    /* JADX INFO: renamed from: a */
    int[] f146996a = {0};

    /* JADX INFO: renamed from: a */
    public void m167368a() {
        synchronized (this.f146998c) {
            try {
                this.f146997b = true;
                int[] iArr = this.f146996a;
                if (iArr[0] > 0) {
                    GLES20.glDeleteFramebuffers(1, iArr, 0);
                    this.f146996a[0] = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

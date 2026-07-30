package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class ubj {

    /* JADX INFO: renamed from: b */
    protected volatile boolean f175701b;

    /* JADX INFO: renamed from: c */
    private final Object f175702c = new Object();

    /* JADX INFO: renamed from: a */
    int[] f175700a = {0};

    /* JADX INFO: renamed from: a */
    public void m192834a() {
        synchronized (this.f175702c) {
            try {
                this.f175701b = true;
                int[] iArr = this.f175700a;
                if (iArr[0] > 0) {
                    GLES20.glDeleteFramebuffers(1, iArr, 0);
                    this.f175700a[0] = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

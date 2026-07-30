package p149l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yj10 extends us2 {

    /* JADX INFO: renamed from: D */
    protected int[] f198571D;

    /* JADX INFO: renamed from: E */
    protected List<ncj> f198572E;

    /* JADX INFO: renamed from: F */
    protected List<ncj> f198573F;

    /* JADX INFO: renamed from: G */
    private int f198574G;

    /* JADX INFO: renamed from: H */
    private int[] f198575H;

    public yj10(int i) {
        this.f198574G = i;
        int i2 = i - 1;
        this.f198575H = new int[i2];
        this.f198571D = new int[i2];
        this.f198572E = new ArrayList(i);
        this.f198573F = new ArrayList(i);
    }

    /* JADX INFO: renamed from: O */
    public void m215027O() {
        this.f198573F.clear();
    }

    /* JADX INFO: renamed from: P */
    public void m215028P() {
        int i = 0;
        int i2 = 0;
        while (i < this.f198574G - 1) {
            switch (i) {
                case 0:
                    i2 = 33985;
                    break;
                case 1:
                    i2 = 33986;
                    break;
                case 2:
                    i2 = 33987;
                    break;
                case 3:
                    i2 = 33988;
                    break;
                case 4:
                    i2 = 33989;
                    break;
                case 5:
                    i2 = 33990;
                    break;
                case 6:
                    i2 = 33991;
                    break;
                case 7:
                    i2 = 33992;
                    break;
                case 8:
                    i2 = 33993;
                    break;
            }
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, this.f198571D[i]);
            int i3 = this.f198575H[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m215029Q(ncj ncjVar, int i) {
        if (this.f198573F.contains(ncjVar)) {
            this.f198573F.remove(ncjVar);
        }
        this.f198573F.add(i, ncjVar);
    }

    @Override // p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public synchronized void mo102037c(int i, ncj ncjVar, boolean z) {
        try {
            if (!this.f198572E.contains(ncjVar)) {
                this.f198572E.add(ncjVar);
                if (z) {
                    m158950L();
                }
            }
            int iLastIndexOf = this.f198573F.lastIndexOf(ncjVar);
            if (iLastIndexOf == 0) {
                this.f85422h = i;
            } else {
                this.f198571D[iLastIndexOf - 1] = i;
            }
            if (this.f198572E.size() == this.f198574G) {
                m110693B(ncjVar.m110705r());
                m110712y(ncjVar.m110701n());
                mo110709v();
                this.f198572E.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        int[] iArr = this.f198571D;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.f198571D;
            if (i >= iArr2.length) {
                return;
            }
            int i2 = iArr2[i];
            if (i2 > 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            }
            i++;
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        int i = 0;
        while (i < this.f198574G - 1) {
            int[] iArr = this.f198575H;
            int i2 = this.f85418d;
            StringBuilder sb = new StringBuilder("inputImageTexture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        m215028P();
    }
}

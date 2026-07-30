package p153l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gs10 extends it2 {

    /* JADX INFO: renamed from: E */
    protected int[] f106218E;

    /* JADX INFO: renamed from: F */
    protected List<ffj> f106219F;

    /* JADX INFO: renamed from: G */
    protected List<ffj> f106220G;

    /* JADX INFO: renamed from: H */
    private int f106221H;

    /* JADX INFO: renamed from: I */
    private int[] f106222I;

    public gs10(int i) {
        this.f106221H = i;
        int i2 = i - 1;
        this.f106222I = new int[i2];
        this.f106218E = new int[i2];
        this.f106219F = new ArrayList(i);
        this.f106220G = new ArrayList(i);
    }

    /* JADX INFO: renamed from: Q */
    public void m131953Q() {
        int i = 0;
        int i2 = 0;
        while (i < this.f106221H - 1) {
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
            GLES20.glBindTexture(3553, this.f106218E[i]);
            int i3 = this.f106222I[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m131954R(ffj ffjVar, int i) {
        if (this.f106220G.contains(ffjVar)) {
            this.f106220G.remove(ffjVar);
        }
        this.f106220G.add(i, ffjVar);
    }

    @Override // p153l.it2, p153l.cfj
    /* JADX INFO: renamed from: b */
    public synchronized void mo109544b(int i, ffj ffjVar, boolean z) {
        try {
            if (!this.f106219F.contains(ffjVar)) {
                this.f106219F.add(ffjVar);
                if (z) {
                    m125380N();
                }
            }
            int iLastIndexOf = this.f106220G.lastIndexOf(ffjVar);
            if (iLastIndexOf == 0) {
                this.f183786h = i;
            } else {
                this.f106218E[iLastIndexOf - 1] = i;
            }
            if (this.f106219F.size() == this.f106221H) {
                m201057G(ffjVar.m201064s());
                m201055D(ffjVar.m201063q());
                mo141810w();
                this.f106219F.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
        int[] iArr = this.f106218E;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.f106218E;
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

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        int i = 0;
        while (i < this.f106221H - 1) {
            int[] iArr = this.f106222I;
            int i2 = this.f183782d;
            StringBuilder sb = new StringBuilder("inputImageTexture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        super.mo97359x();
        m131953Q();
    }
}

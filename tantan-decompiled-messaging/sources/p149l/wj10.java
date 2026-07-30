package p149l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wj10 extends ss2 {

    /* JADX INFO: renamed from: E */
    protected int[] f186592E;

    /* JADX INFO: renamed from: F */
    protected List<lcj> f186593F;

    /* JADX INFO: renamed from: G */
    protected List<lcj> f186594G;

    /* JADX INFO: renamed from: H */
    private int f186595H;

    /* JADX INFO: renamed from: I */
    private int[] f186596I;

    public wj10(int i) {
        this.f186595H = i;
        int i2 = i - 1;
        this.f186596I = new int[i2];
        this.f186592E = new int[i2];
        this.f186593F = new ArrayList(i);
        this.f186594G = new ArrayList(i);
    }

    /* JADX INFO: renamed from: Q */
    public void m203360Q() {
        int i = 0;
        int i2 = 0;
        while (i < this.f186595H - 1) {
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
            GLES20.glBindTexture(3553, this.f186592E[i]);
            int i3 = this.f186596I[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m203361R(lcj lcjVar, int i) {
        if (this.f186594G.contains(lcjVar)) {
            this.f186594G.remove(lcjVar);
        }
        this.f186594G.add(i, lcjVar);
    }

    @Override // p149l.ss2, p149l.icj
    /* JADX INFO: renamed from: b */
    public synchronized void mo95681b(int i, lcj lcjVar, boolean z) {
        try {
            if (!this.f186593F.contains(lcjVar)) {
                this.f186593F.add(lcjVar);
                if (z) {
                    m149304N();
                }
            }
            int iLastIndexOf = this.f186594G.lastIndexOf(lcjVar);
            if (iLastIndexOf == 0) {
                this.f74928h = i;
            } else {
                this.f186592E[iLastIndexOf - 1] = i;
            }
            if (this.f186593F.size() == this.f186595H) {
                m101077G(lcjVar.m101085s());
                m101074D(lcjVar.m101084q());
                mo101088w();
                this.f186593F.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
        int[] iArr = this.f186592E;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.f186592E;
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

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        int i = 0;
        while (i < this.f186595H - 1) {
            int[] iArr = this.f186596I;
            int i2 = this.f74924d;
            StringBuilder sb = new StringBuilder("inputImageTexture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        super.mo101089x();
        m203360Q();
    }
}

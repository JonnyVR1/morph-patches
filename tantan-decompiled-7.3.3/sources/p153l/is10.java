package p153l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class is10 extends kt2 {

    /* JADX INFO: renamed from: D */
    protected int[] f116618D;

    /* JADX INFO: renamed from: E */
    protected List<hfj> f116619E;

    /* JADX INFO: renamed from: F */
    protected List<hfj> f116620F;

    /* JADX INFO: renamed from: G */
    private int f116621G;

    /* JADX INFO: renamed from: H */
    private int[] f116622H;

    public is10(int i) {
        this.f116621G = i;
        int i2 = i - 1;
        this.f116622H = new int[i2];
        this.f116618D = new int[i2];
        this.f116619E = new ArrayList(i);
        this.f116620F = new ArrayList(i);
    }

    /* JADX INFO: renamed from: O */
    public void m141853O() {
        this.f116620F.clear();
    }

    /* JADX INFO: renamed from: P */
    public void m141854P() {
        int i = 0;
        int i2 = 0;
        while (i < this.f116621G - 1) {
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
            GLES20.glBindTexture(3553, this.f116618D[i]);
            int i3 = this.f116622H[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m141855Q(hfj hfjVar, int i) {
        if (this.f116620F.contains(hfjVar)) {
            this.f116620F.remove(hfjVar);
        }
        this.f116620F.add(i, hfjVar);
    }

    @Override // p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public synchronized void mo96079c(int i, hfj hfjVar, boolean z) {
        try {
            if (!this.f116619E.contains(hfjVar)) {
                this.f116619E.add(hfjVar);
                if (z) {
                    m134802L();
                }
            }
            int iLastIndexOf = this.f116620F.lastIndexOf(hfjVar);
            if (iLastIndexOf == 0) {
                this.f193947h = i;
            } else {
                this.f116618D[iLastIndexOf - 1] = i;
            }
            if (this.f116619E.size() == this.f116621G) {
                m210695B(hfjVar.m210702r());
                m210704y(hfjVar.m210701n());
                mo134345v();
                this.f116619E.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        int[] iArr = this.f116618D;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.f116618D;
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

    @Override // p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        int i = 0;
        while (i < this.f116621G - 1) {
            int[] iArr = this.f116622H;
            int i2 = this.f193943d;
            StringBuilder sb = new StringBuilder("inputImageTexture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        m141854P();
    }
}

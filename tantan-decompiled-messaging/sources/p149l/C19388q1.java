package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.q1 */
/* JADX INFO: loaded from: classes3.dex */
public class C19388q1 extends xo0 {

    /* JADX INFO: renamed from: d */
    public int f152093d;

    /* JADX INFO: renamed from: e */
    public int f152094e;

    /* JADX INFO: renamed from: f */
    public int f152095f;

    /* JADX INFO: renamed from: g */
    public int f152096g;

    /* JADX INFO: renamed from: h */
    public int f152097h;

    /* JADX INFO: renamed from: i */
    public int f152098i;

    /* JADX INFO: renamed from: j */
    public int f152099j;

    /* JADX INFO: renamed from: k */
    public boolean f152100k;

    /* JADX INFO: renamed from: a */
    public void m172363a(byte b) {
        if (b == 0) {
            this.f152098i = 0;
        } else {
            if (b != 1) {
                return;
            }
            this.f152098i = 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m172364b(short s, short s2) {
        if (s2 == 1000) {
            this.f193771b = s;
            return;
        }
        if (s2 == 0) {
            s2 = 100;
        }
        this.f193771b = (int) ((s * 1000.0f) / s2);
    }

    /* JADX INFO: renamed from: c */
    public void m172365c(byte b) {
        if (b == 0) {
            this.f193770a = 1;
            return;
        }
        if (b == 1) {
            this.f193770a = 2;
        } else if (b != 2) {
            this.f193770a = 0;
        } else {
            this.f193770a = 3;
        }
    }

    @NonNull
    public String toString() {
        return "sequenceNumber:" + this.f152093d + ",width:" + this.f152094e + ",height:" + this.f152095f + ", xOffset:" + this.f152096g + ",yOffset:" + this.f152097h + ",blendOp:" + this.f152098i + ",dispose:" + this.f193770a + ",length:" + this.f152099j + ",isFdAT:" + this.f152100k;
    }
}

package p003l;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.q1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0489q1 extends xo0 {

    /* JADX INFO: renamed from: d */
    public int f6569d;

    /* JADX INFO: renamed from: e */
    public int f6570e;

    /* JADX INFO: renamed from: f */
    public int f6571f;

    /* JADX INFO: renamed from: g */
    public int f6572g;

    /* JADX INFO: renamed from: h */
    public int f6573h;

    /* JADX INFO: renamed from: i */
    public int f6574i;

    /* JADX INFO: renamed from: j */
    public int f6575j;

    /* JADX INFO: renamed from: k */
    public boolean f6576k;

    /* JADX INFO: renamed from: a */
    public void m6979a(byte b) {
        if (b == 0) {
            this.f6574i = 0;
        } else {
            if (b != 1) {
                return;
            }
            this.f6574i = 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6980b(short s, short s2) {
        if (s2 == 1000) {
            this.f8808b = s;
            return;
        }
        if (s2 == 0) {
            s2 = 100;
        }
        this.f8808b = (int) ((s * 1000.0f) / s2);
    }

    /* JADX INFO: renamed from: c */
    public void m6981c(byte b) {
        if (b == 0) {
            this.f8807a = 1;
            return;
        }
        if (b == 1) {
            this.f8807a = 2;
        } else if (b != 2) {
            this.f8807a = 0;
        } else {
            this.f8807a = 3;
        }
    }

    @NonNull
    public String toString() {
        return "sequenceNumber:" + this.f6569d + ",width:" + this.f6570e + ",height:" + this.f6571f + ", xOffset:" + this.f6572g + ",yOffset:" + this.f6573h + ",blendOp:" + this.f6574i + ",dispose:" + this.f8807a + ",length:" + this.f6575j + ",isFdAT:" + this.f6576k;
    }
}

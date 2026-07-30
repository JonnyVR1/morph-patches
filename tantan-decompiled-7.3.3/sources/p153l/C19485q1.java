package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.q1 */
/* JADX INFO: loaded from: classes3.dex */
public class C19485q1 extends to0 {

    /* JADX INFO: renamed from: d */
    public int f155126d;

    /* JADX INFO: renamed from: e */
    public int f155127e;

    /* JADX INFO: renamed from: f */
    public int f155128f;

    /* JADX INFO: renamed from: g */
    public int f155129g;

    /* JADX INFO: renamed from: h */
    public int f155130h;

    /* JADX INFO: renamed from: i */
    public int f155131i;

    /* JADX INFO: renamed from: j */
    public int f155132j;

    /* JADX INFO: renamed from: k */
    public boolean f155133k;

    /* JADX INFO: renamed from: a */
    public void m174800a(byte b) {
        if (b == 0) {
            this.f155131i = 0;
        } else {
            if (b != 1) {
                return;
            }
            this.f155131i = 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m174801b(short s, short s2) {
        if (s2 == 1000) {
            this.f175344b = s;
            return;
        }
        if (s2 == 0) {
            s2 = 100;
        }
        this.f175344b = (int) ((s * 1000.0f) / s2);
    }

    /* JADX INFO: renamed from: c */
    public void m174802c(byte b) {
        if (b == 0) {
            this.f175343a = 1;
            return;
        }
        if (b == 1) {
            this.f175343a = 2;
        } else if (b != 2) {
            this.f175343a = 0;
        } else {
            this.f175343a = 3;
        }
    }

    @NonNull
    public String toString() {
        return "sequenceNumber:" + this.f155126d + ",width:" + this.f155127e + ",height:" + this.f155128f + ", xOffset:" + this.f155129g + ",yOffset:" + this.f155130h + ",blendOp:" + this.f155131i + ",dispose:" + this.f175343a + ",length:" + this.f155132j + ",isFdAT:" + this.f155133k;
    }
}

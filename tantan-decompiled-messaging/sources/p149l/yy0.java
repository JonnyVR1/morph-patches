package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSSizeType;

/* JADX INFO: loaded from: classes13.dex */
public class yy0 {

    /* JADX INFO: renamed from: a */
    public boolean f200684a = false;

    /* JADX INFO: renamed from: b */
    public int f200685b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f200686c = false;

    /* JADX INFO: renamed from: d */
    public int f200687d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f200688e = false;

    /* JADX INFO: renamed from: f */
    public int f200689f = 100;

    /* JADX INFO: renamed from: g */
    public int f200690g = 100;

    /* JADX INFO: renamed from: h */
    private fa80<Integer> f200691h = new fa80<>(0, 0);

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Integer] */
    /* JADX INFO: renamed from: a */
    public fa80<Integer> m216493a(ttd0 ttd0Var) {
        int iM216495c = m216495c(ttd0Var);
        int iM216496d = m216496d(ttd0Var, iM216495c);
        this.f200691h.f96575a = Integer.valueOf(iM216495c + ((int) (((double) iM216496d) * Math.random())));
        this.f200691h.f96576b = Integer.valueOf(this.f200687d + ((int) (((double) this.f200690g) * Math.random())));
        return this.f200691h;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Integer] */
    /* JADX INFO: renamed from: b */
    public fa80<Integer> m216494b(ttd0 ttd0Var, int i, int i2) {
        m216493a(ttd0Var);
        if (this.f200686c) {
            fa80<Integer> fa80Var = this.f200691h;
            fa80Var.f96575a = Integer.valueOf(fa80Var.f96575a.intValue() + i);
        }
        if (this.f200688e) {
            fa80<Integer> fa80Var2 = this.f200691h;
            fa80Var2.f96576b = Integer.valueOf(fa80Var2.f96576b.intValue() + i2);
        }
        return this.f200691h;
    }

    /* JADX INFO: renamed from: c */
    public int m216495c(ttd0 ttd0Var) {
        return this.f200689f == -1 ? ((int) ((ttd0Var.f55661i.f200685b - ttd0Var.f55662j.f200685b) / ttd0Var.f55659g)) + this.f200685b : this.f200685b;
    }

    /* JADX INFO: renamed from: d */
    public int m216496d(ttd0 ttd0Var, int i) {
        int i2 = this.f200689f;
        return i2 == -1 ? (int) (ttd0Var.f55661i.f200689f / ttd0Var.f55659g) : i2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f200686c) {
            stringBuffer.append("offset:");
        }
        stringBuffer.append(this.f200685b);
        stringBuffer.append(Constants.SEPARATOR_COMMA);
        if (this.f200688e) {
            stringBuffer.append("offset:");
        }
        stringBuffer.append(this.f200687d);
        stringBuffer.append(Constants.SEPARATOR_COMMA);
        int i = this.f200689f;
        if (i == -1) {
            stringBuffer.append(OMSSizeType.match_parent);
        } else {
            stringBuffer.append(i);
        }
        stringBuffer.append(Constants.SEPARATOR_COMMA);
        stringBuffer.append(this.f200690g);
        return stringBuffer.toString();
    }
}

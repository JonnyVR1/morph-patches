package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSSizeType;

/* JADX INFO: loaded from: classes11.dex */
public class fz0 {

    /* JADX INFO: renamed from: a */
    public boolean f101430a = false;

    /* JADX INFO: renamed from: b */
    public int f101431b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f101432c = false;

    /* JADX INFO: renamed from: d */
    public int f101433d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f101434e = false;

    /* JADX INFO: renamed from: f */
    public int f101435f = 100;

    /* JADX INFO: renamed from: g */
    public int f101436g = 100;

    /* JADX INFO: renamed from: h */
    private li80<Integer> f101437h = new li80<>(0, 0);

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Integer] */
    /* JADX INFO: renamed from: a */
    public li80<Integer> m128143a(v1e0 v1e0Var) {
        int iM128145c = m128145c(v1e0Var);
        int iM128146d = m128146d(v1e0Var, iM128145c);
        this.f101437h.f132192a = Integer.valueOf(iM128145c + ((int) (((double) iM128146d) * Math.random())));
        this.f101437h.f132193b = Integer.valueOf(this.f101433d + ((int) (((double) this.f101436g) * Math.random())));
        return this.f101437h;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Integer] */
    /* JADX INFO: renamed from: b */
    public li80<Integer> m128144b(v1e0 v1e0Var, int i, int i2) {
        m128143a(v1e0Var);
        if (this.f101432c) {
            li80<Integer> li80Var = this.f101437h;
            li80Var.f132192a = Integer.valueOf(li80Var.f132192a.intValue() + i);
        }
        if (this.f101434e) {
            li80<Integer> li80Var2 = this.f101437h;
            li80Var2.f132193b = Integer.valueOf(li80Var2.f132193b.intValue() + i2);
        }
        return this.f101437h;
    }

    /* JADX INFO: renamed from: c */
    public int m128145c(v1e0 v1e0Var) {
        return this.f101435f == -1 ? ((int) ((v1e0Var.f56509i.f101431b - v1e0Var.f56510j.f101431b) / v1e0Var.f56507g)) + this.f101431b : this.f101431b;
    }

    /* JADX INFO: renamed from: d */
    public int m128146d(v1e0 v1e0Var, int i) {
        int i2 = this.f101435f;
        return i2 == -1 ? (int) (v1e0Var.f56509i.f101435f / v1e0Var.f56507g) : i2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f101432c) {
            stringBuffer.append("offset:");
        }
        stringBuffer.append(this.f101431b);
        stringBuffer.append(Constants.SEPARATOR_COMMA);
        if (this.f101434e) {
            stringBuffer.append("offset:");
        }
        stringBuffer.append(this.f101433d);
        stringBuffer.append(Constants.SEPARATOR_COMMA);
        int i = this.f101435f;
        if (i == -1) {
            stringBuffer.append(OMSSizeType.match_parent);
        } else {
            stringBuffer.append(i);
        }
        stringBuffer.append(Constants.SEPARATOR_COMMA);
        stringBuffer.append(this.f101436g);
        return stringBuffer.toString();
    }
}

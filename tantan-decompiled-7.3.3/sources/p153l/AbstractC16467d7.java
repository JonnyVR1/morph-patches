package p153l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.tencent.connect.common.Constants;

/* JADX INFO: renamed from: l.d7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC16467d7 {

    /* JADX INFO: renamed from: a */
    public final b13 f85435a;

    /* JADX INFO: renamed from: b */
    public final slj f85436b;

    public AbstractC16467d7(b13 b13Var) {
        this.f85435a = b13Var;
        this.f85436b = new slj(b13Var);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC16467d7 m114572a(b13 b13Var) {
        if (b13Var.m101398f(1)) {
            return new C19480q(b13Var);
        }
        if (!b13Var.m101398f(2)) {
            return new jt0(b13Var);
        }
        int iM186575g = slj.m186575g(b13Var, 1, 4);
        if (iM186575g == 4) {
            return new C18068k(b13Var);
        }
        if (iM186575g == 5) {
            return new C18317l(b13Var);
        }
        int iM186575g2 = slj.m186575g(b13Var, 1, 5);
        if (iM186575g2 == 12) {
            return new C18517m(b13Var);
        }
        if (iM186575g2 == 13) {
            return new C18750n(b13Var);
        }
        switch (slj.m186575g(b13Var, 1, 7)) {
            case 56:
                return new C18998o(b13Var, "310", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            case 57:
                return new C18998o(b13Var, "320", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            case 58:
                return new C18998o(b13Var, "310", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
            case 59:
                return new C18998o(b13Var, "320", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
            case 60:
                return new C18998o(b13Var, "310", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 61:
                return new C18998o(b13Var, "320", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 62:
                return new C18998o(b13Var, "310", Constants.VIA_REPORT_TYPE_START_GROUP);
            case 63:
                return new C18998o(b13Var, "320", Constants.VIA_REPORT_TYPE_START_GROUP);
            default:
                wtq0.m207906a("unknown decoder: ".concat(String.valueOf(b13Var)));
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final slj m114573b() {
        return this.f85436b;
    }

    /* JADX INFO: renamed from: c */
    public final b13 m114574c() {
        return this.f85435a;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo114575d() throws NotFoundException, FormatException;
}

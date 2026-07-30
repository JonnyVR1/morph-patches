package p149l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.tencent.connect.common.Constants;

/* JADX INFO: renamed from: l.i7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17501i7 {

    /* JADX INFO: renamed from: a */
    public final m03 f111817a;

    /* JADX INFO: renamed from: b */
    public final zij f111818b;

    public AbstractC17501i7(m03 m03Var) {
        this.f111817a = m03Var;
        this.f111818b = new zij(m03Var);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC17501i7 m134716a(m03 m03Var) {
        if (m03Var.m152490f(1)) {
            return new C19381q(m03Var);
        }
        if (!m03Var.m152490f(2)) {
            return new et0(m03Var);
        }
        int iM219029g = zij.m219029g(m03Var, 1, 4);
        if (iM219029g == 4) {
            return new C17896k(m03Var);
        }
        if (iM219029g == 5) {
            return new C18119l(m03Var);
        }
        int iM219029g2 = zij.m219029g(m03Var, 1, 5);
        if (iM219029g2 == 12) {
            return new C18362m(m03Var);
        }
        if (iM219029g2 == 13) {
            return new C18595n(m03Var);
        }
        switch (zij.m219029g(m03Var, 1, 7)) {
            case 56:
                return new C18807o(m03Var, "310", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            case 57:
                return new C18807o(m03Var, "320", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
            case 58:
                return new C18807o(m03Var, "310", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
            case 59:
                return new C18807o(m03Var, "320", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
            case 60:
                return new C18807o(m03Var, "310", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 61:
                return new C18807o(m03Var, "320", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 62:
                return new C18807o(m03Var, "310", Constants.VIA_REPORT_TYPE_START_GROUP);
            case 63:
                return new C18807o(m03Var, "320", Constants.VIA_REPORT_TYPE_START_GROUP);
            default:
                qkq0.m175383a("unknown decoder: ".concat(String.valueOf(m03Var)));
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zij m134717b() {
        return this.f111818b;
    }

    /* JADX INFO: renamed from: c */
    public final m03 m134718c() {
        return this.f111817a;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo117968d() throws NotFoundException, FormatException;
}

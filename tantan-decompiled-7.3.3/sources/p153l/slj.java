package p153l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;
import com.tantanapp.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes7.dex */
public final class slj {

    /* JADX INFO: renamed from: a */
    public final b13 f169386a;

    /* JADX INFO: renamed from: b */
    public final CurrentParsingState f169387b = new CurrentParsingState();

    /* JADX INFO: renamed from: c */
    public final StringBuilder f169388c = new StringBuilder();

    public slj(b13 b13Var) {
        this.f169386a = b13Var;
    }

    /* JADX INFO: renamed from: g */
    public static int m186575g(b13 b13Var, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (b13Var.m101398f(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public String m186576a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            zhd zhdVarM186578c = m186578c(i, str);
            String strM125681a = fii.m125681a(zhdVarM186578c.m219685b());
            if (strM125681a != null) {
                sb.append(strM125681a);
            }
            String strValueOf = zhdVarM186578c.m219687d() ? String.valueOf(zhdVarM186578c.m219686c()) : null;
            if (i == zhdVarM186578c.m104427a()) {
                return sb.toString();
            }
            i = zhdVarM186578c.m104427a();
            str = strValueOf;
        }
    }

    /* JADX INFO: renamed from: b */
    public final xhd m186577b(int i) {
        char c;
        int iM186581f = m186581f(i, 5);
        if (iM186581f == 15) {
            return new xhd(i + 5, '$');
        }
        if (iM186581f >= 5 && iM186581f < 15) {
            return new xhd(i + 5, (char) (iM186581f + 43));
        }
        int iM186581f2 = m186581f(i, 6);
        if (iM186581f2 >= 32 && iM186581f2 < 58) {
            return new xhd(i + 6, (char) (iM186581f2 + 33));
        }
        switch (iM186581f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                wtq0.m207906a("Decoding invalid alphanumeric value: ".concat(String.valueOf(iM186581f2)));
                return null;
        }
        return new xhd(i + 6, c);
    }

    /* JADX INFO: renamed from: c */
    public zhd m186578c(int i, String str) throws FormatException {
        this.f169388c.setLength(0);
        if (str != null) {
            this.f169388c.append(str);
        }
        this.f169387b.m17410h(i);
        zhd zhdVarM186589o = m186589o();
        return (zhdVarM186589o == null || !zhdVarM186589o.m219687d()) ? new zhd(this.f169387b.m17403a(), this.f169388c.toString()) : new zhd(this.f169387b.m17403a(), this.f169388c.toString(), zhdVarM186589o.m219686c());
    }

    /* JADX INFO: renamed from: d */
    public final xhd m186579d(int i) throws FormatException {
        int iM186581f = m186581f(i, 5);
        if (iM186581f == 15) {
            return new xhd(i + 5, '$');
        }
        char c = '+';
        if (iM186581f >= 5 && iM186581f < 15) {
            return new xhd(i + 5, (char) (iM186581f + 43));
        }
        int iM186581f2 = m186581f(i, 7);
        if (iM186581f2 >= 64 && iM186581f2 < 90) {
            return new xhd(i + 7, (char) (iM186581f2 + 1));
        }
        if (iM186581f2 >= 90 && iM186581f2 < 116) {
            return new xhd(i + 7, (char) (iM186581f2 + 7));
        }
        switch (m186581f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new xhd(i + 8, c);
    }

    /* JADX INFO: renamed from: e */
    public final aid m186580e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 <= this.f169386a.m101402m()) {
            int iM186581f = m186581f(i, 7) - 8;
            return new aid(i2, iM186581f / 11, iM186581f % 11);
        }
        int iM186581f2 = m186581f(i, 4);
        b13 b13Var = this.f169386a;
        return iM186581f2 == 0 ? new aid(b13Var.m101402m(), 10, 10) : new aid(b13Var.m101402m(), iM186581f2 - 1, 10);
    }

    /* JADX INFO: renamed from: f */
    public int m186581f(int i, int i2) {
        return m186575g(this.f169386a, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m186582h(int i) {
        int i2 = i + 3;
        if (i2 > this.f169386a.m101402m()) {
            return false;
        }
        while (i < i2) {
            if (this.f169386a.m101398f(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m186583i(int i) {
        int i2;
        if (i + 1 > this.f169386a.m101402m()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f169386a.m101402m(); i3++) {
            b13 b13Var = this.f169386a;
            if (i3 == 2) {
                if (!b13Var.m101398f(i + 2)) {
                    return false;
                }
            } else if (b13Var.m101398f(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m186584j(int i) {
        int i2;
        if (i + 1 > this.f169386a.m101402m()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f169386a.m101402m(); i3++) {
            if (this.f169386a.m101398f(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m186585k(int i) {
        int iM186581f;
        if (i + 5 > this.f169386a.m101402m()) {
            return false;
        }
        int iM186581f2 = m186581f(i, 5);
        if (iM186581f2 < 5 || iM186581f2 >= 16) {
            return i + 6 <= this.f169386a.m101402m() && (iM186581f = m186581f(i, 6)) >= 16 && iM186581f < 63;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m186586l(int i) {
        int iM186581f;
        if (i + 5 > this.f169386a.m101402m()) {
            return false;
        }
        int iM186581f2 = m186581f(i, 5);
        if (iM186581f2 >= 5 && iM186581f2 < 16) {
            return true;
        }
        if (i + 7 > this.f169386a.m101402m()) {
            return false;
        }
        int iM186581f3 = m186581f(i, 7);
        if (iM186581f3 < 64 || iM186581f3 >= 116) {
            return i + 8 <= this.f169386a.m101402m() && (iM186581f = m186581f(i, 8)) >= 232 && iM186581f < 253;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m186587m(int i) {
        if (i + 7 > this.f169386a.m101402m()) {
            return i + 4 <= this.f169386a.m101402m();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            b13 b13Var = this.f169386a;
            if (i2 >= i3) {
                return b13Var.m101398f(i3);
            }
            if (b13Var.m101398f(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final j43 m186588n() {
        while (true) {
            boolean zM186585k = m186585k(this.f169387b.m17403a());
            CurrentParsingState currentParsingState = this.f169387b;
            if (!zM186585k) {
                boolean zM186582h = m186582h(currentParsingState.m17403a());
                CurrentParsingState currentParsingState2 = this.f169387b;
                if (zM186582h) {
                    currentParsingState2.m17404b(3);
                    this.f169387b.m17409g();
                } else if (m186583i(currentParsingState2.m17403a())) {
                    int iM17403a = this.f169387b.m17403a() + 5;
                    int iM101402m = this.f169386a.m101402m();
                    CurrentParsingState currentParsingState3 = this.f169387b;
                    if (iM17403a < iM101402m) {
                        currentParsingState3.m17404b(5);
                    } else {
                        currentParsingState3.m17410h(this.f169386a.m101402m());
                    }
                    this.f169387b.m17408f();
                }
                return new j43(false);
            }
            xhd xhdVarM186577b = m186577b(currentParsingState.m17403a());
            this.f169387b.m17410h(xhdVarM186577b.m104427a());
            if (xhdVarM186577b.m211026c()) {
                return new j43(new zhd(this.f169387b.m17403a(), this.f169388c.toString()), true);
            }
            this.f169388c.append(xhdVarM186577b.m211025b());
        }
    }

    /* JADX INFO: renamed from: o */
    public final zhd m186589o() throws FormatException {
        j43 j43VarM186591q;
        boolean zM143401b;
        do {
            int iM17403a = this.f169387b.m17403a();
            if (this.f169387b.m17405c()) {
                j43VarM186591q = m186588n();
                zM143401b = j43VarM186591q.m143401b();
            } else if (this.f169387b.m17406d()) {
                j43VarM186591q = m186590p();
                zM143401b = j43VarM186591q.m143401b();
            } else {
                j43VarM186591q = m186591q();
                zM143401b = j43VarM186591q.m143401b();
            }
            if (iM17403a == this.f169387b.m17403a() && !zM143401b) {
                break;
            }
        } while (!zM143401b);
        return j43VarM186591q.m143400a();
    }

    /* JADX INFO: renamed from: p */
    public final j43 m186590p() throws FormatException {
        while (true) {
            boolean zM186586l = m186586l(this.f169387b.m17403a());
            CurrentParsingState currentParsingState = this.f169387b;
            if (!zM186586l) {
                boolean zM186582h = m186582h(currentParsingState.m17403a());
                CurrentParsingState currentParsingState2 = this.f169387b;
                if (zM186582h) {
                    currentParsingState2.m17404b(3);
                    this.f169387b.m17409g();
                } else if (m186583i(currentParsingState2.m17403a())) {
                    int iM17403a = this.f169387b.m17403a() + 5;
                    int iM101402m = this.f169386a.m101402m();
                    CurrentParsingState currentParsingState3 = this.f169387b;
                    if (iM17403a < iM101402m) {
                        currentParsingState3.m17404b(5);
                    } else {
                        currentParsingState3.m17410h(this.f169386a.m101402m());
                    }
                    this.f169387b.m17407e();
                }
                return new j43(false);
            }
            xhd xhdVarM186579d = m186579d(currentParsingState.m17403a());
            this.f169387b.m17410h(xhdVarM186579d.m104427a());
            if (xhdVarM186579d.m211026c()) {
                return new j43(new zhd(this.f169387b.m17403a(), this.f169388c.toString()), true);
            }
            this.f169388c.append(xhdVarM186579d.m211025b());
        }
    }

    /* JADX INFO: renamed from: q */
    public final j43 m186591q() throws FormatException {
        while (true) {
            boolean zM186587m = m186587m(this.f169387b.m17403a());
            CurrentParsingState currentParsingState = this.f169387b;
            if (!zM186587m) {
                if (m186584j(currentParsingState.m17403a())) {
                    this.f169387b.m17407e();
                    this.f169387b.m17404b(4);
                }
                return new j43(false);
            }
            aid aidVarM186580e = m186580e(currentParsingState.m17403a());
            this.f169387b.m17410h(aidVarM186580e.m104427a());
            if (aidVarM186580e.m97994d()) {
                boolean zM97995e = aidVarM186580e.m97995e();
                CurrentParsingState currentParsingState2 = this.f169387b;
                return new j43(zM97995e ? new zhd(currentParsingState2.m17403a(), this.f169388c.toString()) : new zhd(currentParsingState2.m17403a(), this.f169388c.toString(), aidVarM186580e.m97993c()), true);
            }
            this.f169388c.append(aidVarM186580e.m97992b());
            if (aidVarM186580e.m97995e()) {
                return new j43(new zhd(this.f169387b.m17403a(), this.f169388c.toString()), true);
            }
            this.f169388c.append(aidVarM186580e.m97993c());
        }
    }
}

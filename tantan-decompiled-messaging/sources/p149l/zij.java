package p149l;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;
import com.tantanapp.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes7.dex */
public final class zij {

    /* JADX INFO: renamed from: a */
    public final m03 f203338a;

    /* JADX INFO: renamed from: b */
    public final CurrentParsingState f203339b = new CurrentParsingState();

    /* JADX INFO: renamed from: c */
    public final StringBuilder f203340c = new StringBuilder();

    public zij(m03 m03Var) {
        this.f203338a = m03Var;
    }

    /* JADX INFO: renamed from: g */
    public static int m219029g(m03 m03Var, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (m03Var.m152490f(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public String m219030a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            tgd tgdVarM219032c = m219032c(i, str);
            String strM141180a = jfi.m141180a(tgdVarM219032c.m188805b());
            if (strM141180a != null) {
                sb.append(strM141180a);
            }
            String strValueOf = tgdVarM219032c.m188807d() ? String.valueOf(tgdVarM219032c.m188806c()) : null;
            if (i == tgdVarM219032c.m198316a()) {
                return sb.toString();
            }
            i = tgdVarM219032c.m198316a();
            str = strValueOf;
        }
    }

    /* JADX INFO: renamed from: b */
    public final rgd m219031b(int i) {
        char c;
        int iM219035f = m219035f(i, 5);
        if (iM219035f == 15) {
            return new rgd(i + 5, '$');
        }
        if (iM219035f >= 5 && iM219035f < 15) {
            return new rgd(i + 5, (char) (iM219035f + 43));
        }
        int iM219035f2 = m219035f(i, 6);
        if (iM219035f2 >= 32 && iM219035f2 < 58) {
            return new rgd(i + 6, (char) (iM219035f2 + 33));
        }
        switch (iM219035f2) {
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
                qkq0.m175383a("Decoding invalid alphanumeric value: ".concat(String.valueOf(iM219035f2)));
                return null;
        }
        return new rgd(i + 6, c);
    }

    /* JADX INFO: renamed from: c */
    public tgd m219032c(int i, String str) throws FormatException {
        this.f203340c.setLength(0);
        if (str != null) {
            this.f203340c.append(str);
        }
        this.f203339b.m17355h(i);
        tgd tgdVarM219043o = m219043o();
        return (tgdVarM219043o == null || !tgdVarM219043o.m188807d()) ? new tgd(this.f203339b.m17348a(), this.f203340c.toString()) : new tgd(this.f203339b.m17348a(), this.f203340c.toString(), tgdVarM219043o.m188806c());
    }

    /* JADX INFO: renamed from: d */
    public final rgd m219033d(int i) throws FormatException {
        int iM219035f = m219035f(i, 5);
        if (iM219035f == 15) {
            return new rgd(i + 5, '$');
        }
        char c = '+';
        if (iM219035f >= 5 && iM219035f < 15) {
            return new rgd(i + 5, (char) (iM219035f + 43));
        }
        int iM219035f2 = m219035f(i, 7);
        if (iM219035f2 >= 64 && iM219035f2 < 90) {
            return new rgd(i + 7, (char) (iM219035f2 + 1));
        }
        if (iM219035f2 >= 90 && iM219035f2 < 116) {
            return new rgd(i + 7, (char) (iM219035f2 + 7));
        }
        switch (m219035f(i, 8)) {
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
        return new rgd(i + 8, c);
    }

    /* JADX INFO: renamed from: e */
    public final ugd m219034e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 <= this.f203338a.m152494m()) {
            int iM219035f = m219035f(i, 7) - 8;
            return new ugd(i2, iM219035f / 11, iM219035f % 11);
        }
        int iM219035f2 = m219035f(i, 4);
        m03 m03Var = this.f203338a;
        return iM219035f2 == 0 ? new ugd(m03Var.m152494m(), 10, 10) : new ugd(m03Var.m152494m(), iM219035f2 - 1, 10);
    }

    /* JADX INFO: renamed from: f */
    public int m219035f(int i, int i2) {
        return m219029g(this.f203338a, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m219036h(int i) {
        int i2 = i + 3;
        if (i2 > this.f203338a.m152494m()) {
            return false;
        }
        while (i < i2) {
            if (this.f203338a.m152490f(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m219037i(int i) {
        int i2;
        if (i + 1 > this.f203338a.m152494m()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f203338a.m152494m(); i3++) {
            m03 m03Var = this.f203338a;
            if (i3 == 2) {
                if (!m03Var.m152490f(i + 2)) {
                    return false;
                }
            } else if (m03Var.m152490f(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m219038j(int i) {
        int i2;
        if (i + 1 > this.f203338a.m152494m()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f203338a.m152494m(); i3++) {
            if (this.f203338a.m152490f(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m219039k(int i) {
        int iM219035f;
        if (i + 5 > this.f203338a.m152494m()) {
            return false;
        }
        int iM219035f2 = m219035f(i, 5);
        if (iM219035f2 < 5 || iM219035f2 >= 16) {
            return i + 6 <= this.f203338a.m152494m() && (iM219035f = m219035f(i, 6)) >= 16 && iM219035f < 63;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m219040l(int i) {
        int iM219035f;
        if (i + 5 > this.f203338a.m152494m()) {
            return false;
        }
        int iM219035f2 = m219035f(i, 5);
        if (iM219035f2 >= 5 && iM219035f2 < 16) {
            return true;
        }
        if (i + 7 > this.f203338a.m152494m()) {
            return false;
        }
        int iM219035f3 = m219035f(i, 7);
        if (iM219035f3 < 64 || iM219035f3 >= 116) {
            return i + 8 <= this.f203338a.m152494m() && (iM219035f = m219035f(i, 8)) >= 232 && iM219035f < 253;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m219041m(int i) {
        if (i + 7 > this.f203338a.m152494m()) {
            return i + 4 <= this.f203338a.m152494m();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            m03 m03Var = this.f203338a;
            if (i2 >= i3) {
                return m03Var.m152490f(i3);
            }
            if (m03Var.m152490f(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final t33 m219042n() {
        while (true) {
            boolean zM219039k = m219039k(this.f203339b.m17348a());
            CurrentParsingState currentParsingState = this.f203339b;
            if (!zM219039k) {
                boolean zM219036h = m219036h(currentParsingState.m17348a());
                CurrentParsingState currentParsingState2 = this.f203339b;
                if (zM219036h) {
                    currentParsingState2.m17349b(3);
                    this.f203339b.m17354g();
                } else if (m219037i(currentParsingState2.m17348a())) {
                    int iM17348a = this.f203339b.m17348a() + 5;
                    int iM152494m = this.f203338a.m152494m();
                    CurrentParsingState currentParsingState3 = this.f203339b;
                    if (iM17348a < iM152494m) {
                        currentParsingState3.m17349b(5);
                    } else {
                        currentParsingState3.m17355h(this.f203338a.m152494m());
                    }
                    this.f203339b.m17353f();
                }
                return new t33(false);
            }
            rgd rgdVarM219031b = m219031b(currentParsingState.m17348a());
            this.f203339b.m17355h(rgdVarM219031b.m198316a());
            if (rgdVarM219031b.m179160c()) {
                return new t33(new tgd(this.f203339b.m17348a(), this.f203340c.toString()), true);
            }
            this.f203340c.append(rgdVarM219031b.m179159b());
        }
    }

    /* JADX INFO: renamed from: o */
    public final tgd m219043o() throws FormatException {
        t33 t33VarM219045q;
        boolean zM187110b;
        do {
            int iM17348a = this.f203339b.m17348a();
            if (this.f203339b.m17350c()) {
                t33VarM219045q = m219042n();
                zM187110b = t33VarM219045q.m187110b();
            } else if (this.f203339b.m17351d()) {
                t33VarM219045q = m219044p();
                zM187110b = t33VarM219045q.m187110b();
            } else {
                t33VarM219045q = m219045q();
                zM187110b = t33VarM219045q.m187110b();
            }
            if (iM17348a == this.f203339b.m17348a() && !zM187110b) {
                break;
            }
        } while (!zM187110b);
        return t33VarM219045q.m187109a();
    }

    /* JADX INFO: renamed from: p */
    public final t33 m219044p() throws FormatException {
        while (true) {
            boolean zM219040l = m219040l(this.f203339b.m17348a());
            CurrentParsingState currentParsingState = this.f203339b;
            if (!zM219040l) {
                boolean zM219036h = m219036h(currentParsingState.m17348a());
                CurrentParsingState currentParsingState2 = this.f203339b;
                if (zM219036h) {
                    currentParsingState2.m17349b(3);
                    this.f203339b.m17354g();
                } else if (m219037i(currentParsingState2.m17348a())) {
                    int iM17348a = this.f203339b.m17348a() + 5;
                    int iM152494m = this.f203338a.m152494m();
                    CurrentParsingState currentParsingState3 = this.f203339b;
                    if (iM17348a < iM152494m) {
                        currentParsingState3.m17349b(5);
                    } else {
                        currentParsingState3.m17355h(this.f203338a.m152494m());
                    }
                    this.f203339b.m17352e();
                }
                return new t33(false);
            }
            rgd rgdVarM219033d = m219033d(currentParsingState.m17348a());
            this.f203339b.m17355h(rgdVarM219033d.m198316a());
            if (rgdVarM219033d.m179160c()) {
                return new t33(new tgd(this.f203339b.m17348a(), this.f203340c.toString()), true);
            }
            this.f203340c.append(rgdVarM219033d.m179159b());
        }
    }

    /* JADX INFO: renamed from: q */
    public final t33 m219045q() throws FormatException {
        while (true) {
            boolean zM219041m = m219041m(this.f203339b.m17348a());
            CurrentParsingState currentParsingState = this.f203339b;
            if (!zM219041m) {
                if (m219038j(currentParsingState.m17348a())) {
                    this.f203339b.m17352e();
                    this.f203339b.m17349b(4);
                }
                return new t33(false);
            }
            ugd ugdVarM219034e = m219034e(currentParsingState.m17348a());
            this.f203339b.m17355h(ugdVarM219034e.m198316a());
            if (ugdVarM219034e.m193549d()) {
                boolean zM193550e = ugdVarM219034e.m193550e();
                CurrentParsingState currentParsingState2 = this.f203339b;
                return new t33(zM193550e ? new tgd(currentParsingState2.m17348a(), this.f203340c.toString()) : new tgd(currentParsingState2.m17348a(), this.f203340c.toString(), ugdVarM219034e.m193548c()), true);
            }
            this.f203340c.append(ugdVarM219034e.m193547b());
            if (ugdVarM219034e.m193550e()) {
                return new t33(new tgd(this.f203339b.m17348a(), this.f203340c.toString()), true);
            }
            this.f203340c.append(ugdVarM219034e.m193548c());
        }
    }
}

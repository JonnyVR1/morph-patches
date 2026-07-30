package p009l;

import androidx.annotation.DrawableRes;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.OMSData;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.OMSSlotsInfo;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.p1.mobile.putong.data.SwipeExcites;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.qib0;
import l.upk0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ic50 {

    /* JADX INFO: renamed from: h */
    public static ic50 f14476h;

    /* JADX INFO: renamed from: a */
    public wa50 f14477a;

    /* JADX INFO: renamed from: b */
    public a<OMSData> f14478b;

    /* JADX INFO: renamed from: c */
    public lb50 f14479c;

    /* JADX INFO: renamed from: d */
    public cvv f14480d;

    /* JADX INFO: renamed from: e */
    public HashMap<String, yc50> f14481e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public kb50 f14482f;

    /* JADX INFO: renamed from: g */
    public m950 f14483g;

    /* JADX INFO: renamed from: j */
    public static ic50 m16316j() {
        if (f14476h == null) {
            synchronized (ic50.class) {
                try {
                    if (f14476h == null) {
                        f14476h = new ic50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14476h;
    }

    /* JADX INFO: renamed from: a */
    public void m16317a() {
        if (this.f14481e.size() > 0) {
            nc50.m18839f().m18842c();
            Iterator<Map.Entry<String, yc50>> it = this.f14481e.entrySet().iterator();
            while (it.hasNext()) {
                yc50 value = it.next().getValue();
                if (value != null) {
                    this.f14480d.m12854c(value.m25284c());
                    if (this.f14477a.m24026L()) {
                        this.f14477a.m24028N(value.m25285d());
                    }
                    if (this.f14477a.m24025K()) {
                        this.f14477a.m24027M(value.m25286e());
                    }
                    this.f14479c.m17784c(value.m25283b());
                    nc50.m18839f().m18849k(value.m25282a());
                }
            }
        }
        this.f14477a.m24022H(qib0.A);
    }

    /* JADX INFO: renamed from: b */
    public void m16318b() {
        m16335t();
        this.f14478b = a.b();
        this.f14483g = new m950();
        this.f14482f = new kb50();
        this.f14477a = new wa50();
        this.f14479c = new lb50();
        this.f14480d = new cvv();
    }

    /* JADX INFO: renamed from: c */
    public wa50 m16319c() {
        return this.f14477a;
    }

    /* JADX INFO: renamed from: d */
    public OMSData m16320d() {
        return (OMSData) this.f14483g.m18317z().m();
    }

    /* JADX INFO: renamed from: e */
    public OMSData m16321e() {
        return (OMSData) this.f14483g.m18317z().n();
    }

    /* JADX INFO: renamed from: f */
    public kb50 m16322f() {
        return this.f14482f;
    }

    /* JADX INFO: renamed from: g */
    public lb50 m16323g() {
        return this.f14479c;
    }

    /* JADX INFO: renamed from: h */
    public List<OMSAdCardInfo> m16324h() {
        if (this.f14483g.m18317z().m() == null) {
            return null;
        }
        return ((OMSData) this.f14483g.m18317z().m()).cards;
    }

    /* JADX INFO: renamed from: i */
    public List<OMSDialogInfo> m16325i() {
        if (this.f14483g.m18317z().m() == null) {
            return null;
        }
        return ((OMSData) this.f14483g.m18317z().m()).dialogs;
    }

    /* JADX INFO: renamed from: k */
    public List<OMSSlotsInfo> m16326k() {
        if (this.f14483g.m18317z().m() == null) {
            return null;
        }
        return ((OMSData) this.f14483g.m18317z().m()).slots;
    }

    /* JADX INFO: renamed from: l */
    public List<SwipeExcites> m16327l() {
        if (this.f14483g.m18317z().m() == null) {
            return null;
        }
        return ((OMSData) this.f14483g.m18317z().m()).swipeExcites;
    }

    /* JADX INFO: renamed from: m */
    public List<OMSThemeInfo> m16328m() {
        if (this.f14483g.m18317z().m() == null) {
            return null;
        }
        return ((OMSData) this.f14483g.m18317z().m()).themes;
    }

    /* JADX INFO: renamed from: n */
    public m950 m16329n() {
        return this.f14483g;
    }

    /* JADX INFO: renamed from: o */
    public cvv m16330o() {
        return this.f14480d;
    }

    /* JADX INFO: renamed from: p */
    public void m16331p(boolean z) {
        this.f14483g.m18317z().m18322F(z);
    }

    /* JADX INFO: renamed from: q */
    public void m16332q(String str, yc50 yc50Var) {
        if (this.f14481e.containsKey(str)) {
            upk0.a("the module name is already exits");
        } else {
            this.f14481e.put(str, yc50Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m16333r(String str, @DrawableRes int i) {
        if (NullChecker.a(this.f14479c)) {
            this.f14479c.m17785d(str, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public a<OMSData> m16334s() {
        return this.f14478b;
    }

    /* JADX INFO: renamed from: t */
    public void m16335t() {
        a<OMSData> aVar = this.f14478b;
        if (aVar != null) {
            aVar.onCompleted();
            this.f14478b = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16336u(OMSData oMSData) {
        this.f14483g.m18317z().A(oMSData);
    }
}

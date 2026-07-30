package p149l;

import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OMSData;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSSlotsInfo;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.SwipeExcites;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class ic50 {

    /* JADX INFO: renamed from: h */
    public static ic50 f112431h;

    /* JADX INFO: renamed from: a */
    public wa50 f112432a;

    /* JADX INFO: renamed from: b */
    public C22392a<OMSData> f112433b;

    /* JADX INFO: renamed from: c */
    public lb50 f112434c;

    /* JADX INFO: renamed from: d */
    public cvv f112435d;

    /* JADX INFO: renamed from: e */
    public HashMap<String, yc50> f112436e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public kb50 f112437f;

    /* JADX INFO: renamed from: g */
    public m950 f112438g;

    /* JADX INFO: renamed from: j */
    public static ic50 m135327j() {
        if (f112431h == null) {
            synchronized (ic50.class) {
                try {
                    if (f112431h == null) {
                        f112431h = new ic50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112431h;
    }

    /* JADX INFO: renamed from: a */
    public void m135328a() {
        if (this.f112436e.size() > 0) {
            nc50.m158912f().m158915c();
            Iterator<Map.Entry<String, yc50>> it = this.f112436e.entrySet().iterator();
            while (it.hasNext()) {
                yc50 value = it.next().getValue();
                if (value != null) {
                    this.f112435d.m108957c(value.mo29927c());
                    if (this.f112432a.m202370L()) {
                        this.f112432a.m202372N(value.mo29928d());
                    }
                    if (this.f112432a.m202369K()) {
                        this.f112432a.m202371M(value.mo29929e());
                    }
                    this.f112434c.m149211c(value.mo29926b());
                    nc50.m158912f().m158922k(value.mo29925a());
                }
            }
        }
        this.f112432a.m202366H(qib0.f154679A);
    }

    /* JADX INFO: renamed from: b */
    public void m135329b() {
        m135346t();
        this.f112433b = C22392a.m221512b();
        this.f112438g = new m950();
        this.f112437f = new kb50();
        this.f112432a = new wa50();
        this.f112434c = new lb50();
        this.f112435d = new cvv();
    }

    /* JADX INFO: renamed from: c */
    public wa50 m135330c() {
        return this.f112432a;
    }

    /* JADX INFO: renamed from: d */
    public OMSData m135331d() {
        return this.f112438g.m153596z().m121232m();
    }

    /* JADX INFO: renamed from: e */
    public OMSData m135332e() {
        return this.f112438g.m153596z().m121233n();
    }

    /* JADX INFO: renamed from: f */
    public kb50 m135333f() {
        return this.f112437f;
    }

    /* JADX INFO: renamed from: g */
    public lb50 m135334g() {
        return this.f112434c;
    }

    /* JADX INFO: renamed from: h */
    public List<OMSAdCardInfo> m135335h() {
        if (this.f112438g.m153596z().m121232m() == null) {
            return null;
        }
        return this.f112438g.m153596z().m121232m().cards;
    }

    /* JADX INFO: renamed from: i */
    public List<OMSDialogInfo> m135336i() {
        if (this.f112438g.m153596z().m121232m() == null) {
            return null;
        }
        return this.f112438g.m153596z().m121232m().dialogs;
    }

    /* JADX INFO: renamed from: k */
    public List<OMSSlotsInfo> m135337k() {
        if (this.f112438g.m153596z().m121232m() == null) {
            return null;
        }
        return this.f112438g.m153596z().m121232m().slots;
    }

    /* JADX INFO: renamed from: l */
    public List<SwipeExcites> m135338l() {
        if (this.f112438g.m153596z().m121232m() == null) {
            return null;
        }
        return this.f112438g.m153596z().m121232m().swipeExcites;
    }

    /* JADX INFO: renamed from: m */
    public List<OMSThemeInfo> m135339m() {
        if (this.f112438g.m153596z().m121232m() == null) {
            return null;
        }
        return this.f112438g.m153596z().m121232m().themes;
    }

    /* JADX INFO: renamed from: n */
    public m950 m135340n() {
        return this.f112438g;
    }

    /* JADX INFO: renamed from: o */
    public cvv m135341o() {
        return this.f112435d;
    }

    /* JADX INFO: renamed from: p */
    public void m135342p(boolean z) {
        this.f112438g.m153596z().m153601F(z);
    }

    /* JADX INFO: renamed from: q */
    public void m135343q(String str, yc50 yc50Var) {
        if (this.f112436e.containsKey(str)) {
            upk0.m194883a("the module name is already exits");
        } else {
            this.f112436e.put(str, yc50Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m135344r(String str, @DrawableRes int i) {
        if (NullChecker.m81303a(this.f112434c)) {
            this.f112434c.m149212d(str, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public C22392a<OMSData> m135345s() {
        return this.f112433b;
    }

    /* JADX INFO: renamed from: t */
    public void m135346t() {
        C22392a<OMSData> c22392a = this.f112433b;
        if (c22392a != null) {
            c22392a.onCompleted();
            this.f112433b = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m135347u(OMSData oMSData) {
        this.f112438g.m153596z().m121229A(oMSData);
    }
}

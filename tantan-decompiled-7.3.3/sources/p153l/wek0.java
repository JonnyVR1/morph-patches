package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class wek0 {

    /* JADX INFO: renamed from: c */
    public static wek0 f188697c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, pf60<Boolean, IdealInfo>> f188698a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public C22507a<pf60<String, pf60<Boolean, IdealInfo>>> f188699b = C22507a.m222758b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ pf60 m205998c(pf60 pf60Var) {
        return (pf60) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: g */
    public static wek0 m206001g() {
        if (f188697c == null) {
            synchronized (wek0.class) {
                try {
                    if (f188697c == null) {
                        f188697c = new wek0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f188697c;
    }

    /* JADX INFO: renamed from: l */
    public static void m206002l() {
        f188697c = null;
    }

    /* JADX INFO: renamed from: f */
    public C22421c<pf60<Boolean, IdealInfo>> m206003f(final String str) {
        m206008m(str);
        return this.f188699b.filter(new qcj() { // from class: l.tek0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, (CharSequence) ((pf60) obj).f152156a));
            }
        }).map(new qcj() { // from class: l.uek0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wek0.m205998c((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m206004h(String str, IdealInfo idealInfo) {
        pf60<Boolean, IdealInfo> pf60VarM172085a = pf60.m172085a(Boolean.TRUE, idealInfo);
        this.f188698a.put(str, pf60VarM172085a);
        this.f188699b.m137019l(pf60.m172085a(str, pf60VarM172085a));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m206005i(String str, Throwable th) {
        pf60<Boolean, IdealInfo> pf60Var = this.f188698a.get(str);
        if (pf60Var == null || !pf60Var.f152156a.booleanValue()) {
            this.f188699b.m137019l(pf60.m172085a(str, pf60.m172085a(Boolean.TRUE, null)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m206006j(String str) {
        pf60<Boolean, IdealInfo> pf60Var = this.f188698a.get(str);
        C22507a<pf60<String, pf60<Boolean, IdealInfo>>> c22507a = this.f188699b;
        if (pf60Var == null) {
            c22507a.m137019l(pf60.m172085a(str, pf60.m172085a(Boolean.FALSE, null)));
        } else {
            c22507a.m137019l(pf60.m172085a(str, pf60Var));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m206007k(final String str) {
        CoreModule.f18264c.f20381e0.m116610s7(str, "chat").subscribe(psd0.m173597H(new y20() { // from class: l.rek0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162658a.m206004h(str, (IdealInfo) obj);
            }
        }, new y20() { // from class: l.sek0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167629a.m206005i(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m206008m(final String str) {
        pf60<String, pf60<Boolean, IdealInfo>> pf60VarM222761e = this.f188699b.m222761e();
        if (NullChecker.m82486a(pf60VarM222761e) && TextUtils.equals(str, pf60VarM222761e.f152156a)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.vek0
            @Override // java.lang.Runnable
            public final void run() {
                this.f183802a.m206006j(str);
            }
        });
    }
}

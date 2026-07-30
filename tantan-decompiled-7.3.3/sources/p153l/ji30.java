package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class ji30 {

    /* JADX INFO: renamed from: a */
    public static C22507a<pf60<TabName, Boolean>> f121036a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public static C22507a<TabName> f121037b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public static C22507a<pf60<TabName, Bundle>> f121038c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static C22507a<String> f121039d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public static C22507a<pf60<TabName, Boolean>> f121040e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public static int f121041f = qa00.m175859d(66.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Bundle m144959c(pf60 pf60Var) {
        return (Bundle) pf60Var.f152157b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m144962f(pf60 pf60Var) {
        return (Boolean) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<Bundle> m144963g(final TabName tabName) {
        return f121038c.filter(new qcj() { // from class: l.di30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj) != null);
            }
        }).filter(new qcj() { // from class: l.ei30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj).f152156a == tabName);
            }
        }).map(new qcj() { // from class: l.fi30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ji30.m144959c((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static TabName m144964h() {
        return f121037b.m222761e();
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<pf60<TabName, Boolean>> m144965i() {
        return f121040e.asObservable();
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<Boolean> m144966j(final TabName tabName) {
        return f121036a.filter(new qcj() { // from class: l.gi30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj) != null);
            }
        }).filter(new qcj() { // from class: l.hi30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((pf60) obj).f152156a == tabName);
            }
        }).map(new qcj() { // from class: l.ii30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ji30.m144962f((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<TabName> m144967k() {
        return f121037b;
    }

    /* JADX INFO: renamed from: l */
    public static void m144968l(TabName tabName, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        f121038c.onNext(new pf60<>(tabName, bundle));
        f121038c.onNext(null);
    }

    /* JADX INFO: renamed from: m */
    public static void m144969m(TabName tabName, boolean z) {
        f121036a.onNext(new pf60<>(tabName, Boolean.valueOf(z)));
        f121036a.onNext(null);
    }

    /* JADX INFO: renamed from: n */
    public static void m144970n(TabName tabName) {
        f121037b.onNext(tabName);
    }

    /* JADX INFO: renamed from: o */
    public static void m144971o(TabName tabName, boolean z) {
        f121040e.onNext(new pf60<>(tabName, Boolean.valueOf(z)));
    }
}

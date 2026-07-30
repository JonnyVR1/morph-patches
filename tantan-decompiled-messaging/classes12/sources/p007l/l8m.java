package p007l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.android.billingclient.api.d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bpm;
import l.cpm;
import l.dpm;
import l.j760;
import l.lx2;
import l.rcb0;
import l.roj0;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l8m {

    /* JADX INFO: renamed from: a */
    public a f9946a;

    /* JADX INFO: renamed from: b */
    public Act f9947b;

    /* JADX INFO: renamed from: c */
    public boolean f9948c = false;

    /* JADX INFO: renamed from: d */
    public final rx.subjects.a<roj0> f9949d = rx.subjects.a.b();

    /* JADX INFO: renamed from: e */
    public final b<j760<d, List<Purchase>>> f9950e = b.b();

    /* JADX INFO: renamed from: f */
    public scb0 f9951f = new scb0(new rcb0() { // from class: l.i8m
        /* JADX INFO: renamed from: d */
        public final void m10833d(d dVar, List list) {
            this.f8964a.m11615n(dVar, list);
        }
    });

    /* JADX INFO: renamed from: g */
    public cpm f9952g = new cpm() { // from class: l.j8m
        /* JADX INFO: renamed from: a */
        public final void m11093a(dpm dpmVar) {
            l8m.m11602a(dpmVar);
        }
    };

    /* JADX INFO: renamed from: l.l8m$a */
    public class C2417a implements lx2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f9953a;

        public C2417a(Runnable runnable) {
            this.f9953a = runnable;
        }

        /* JADX INFO: renamed from: a */
        public void m11620a(d dVar) {
            int iB = dVar.b();
            l8m l8mVar = l8m.this;
            if (iB != 0) {
                l8mVar.f9949d.onError(new RuntimeException(TextUtils.concat(String.valueOf(dVar.b()), "_", dVar.a()).toString()));
                l8m.this.f9948c = false;
                return;
            }
            l8mVar.m11618q(l8mVar.f9946a);
            l8m.this.f9949d.onNext(roj0.a);
            l8m.this.f9948c = true;
            if (NullChecker.a(this.f9953a)) {
                this.f9953a.run();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m11621c() {
            l8m.this.f9949d.onCompleted();
            l8m.this.f9948c = false;
        }
    }

    public l8m(Act act) {
        this.f9947b = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11602a(dpm dpmVar) {
    }

    /* JADX INFO: renamed from: h */
    public c<a> m11609h() {
        return this.f9949d.map(new w9j() { // from class: l.k8m
            public final Object call(Object obj) {
                return this.f9637a.m11614m((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public a m11610i() {
        return this.f9946a;
    }

    /* JADX INFO: renamed from: j */
    public b<j760<d, List<Purchase>>> m11611j() {
        return this.f9950e;
    }

    /* JADX INFO: renamed from: k */
    public void m11612k(Application application) {
        if (IntlCountryCodeController.k()) {
            return;
        }
        this.f9946a = a.g(application).b().d(this.f9951f).a();
    }

    /* JADX INFO: renamed from: l */
    public void m11613l() {
        this.f9946a = a.g(this.f9947b).b().d(this.f9951f).a();
        m11619r(null);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ a m11614m(roj0 roj0Var) {
        return this.f9946a;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11615n(d dVar, List list) {
        this.f9950e.onNext(j760.a(dVar, list));
    }

    /* JADX INFO: renamed from: p */
    public void m11617p() {
        if (NullChecker.a(this.f9946a)) {
            this.f9946a.c();
            this.f9946a = null;
            this.f9951f.m14123a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11618q(a aVar) {
        if (NullChecker.a(aVar) && NullChecker.a(this.f9947b) && this.f9947b.getComponentName().getClassName().contains("NewMainAct")) {
            aVar.j(this.f9947b, bpm.a().a().b(), this.f9952g);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11619r(Runnable runnable) {
        if (this.f9948c) {
            runnable.run();
        } else {
            this.f9946a.k(new C2417a(runnable));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m11616o(int i, int i2, Intent intent) {
    }
}

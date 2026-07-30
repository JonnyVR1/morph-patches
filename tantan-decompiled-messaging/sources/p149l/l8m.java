package p149l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.android.billingclient.api.AbstractC0865a;
import com.android.billingclient.api.C0871d;
import com.android.billingclient.api.Purchase;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
public class l8m {

    /* JADX INFO: renamed from: a */
    public AbstractC0865a f126836a;

    /* JADX INFO: renamed from: b */
    public Act f126837b;

    /* JADX INFO: renamed from: c */
    public boolean f126838c = false;

    /* JADX INFO: renamed from: d */
    public final C22392a<roj0> f126839d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public final C22393b<j760<C0871d, List<Purchase>>> f126840e = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public scb0 f126841f = new scb0(new rcb0() { // from class: l.i8m
        @Override // p149l.rcb0
        /* JADX INFO: renamed from: d */
        public final void mo5069d(C0871d c0871d, List list) {
            this.f112053a.m148938n(c0871d, list);
        }
    });

    /* JADX INFO: renamed from: g */
    public cpm f126842g = new cpm() { // from class: l.j8m
        @Override // p149l.cpm
        /* JADX INFO: renamed from: a */
        public final void mo108168a(dpm dpmVar) {
            l8m.m148925a(dpmVar);
        }
    };

    /* JADX INFO: renamed from: l.l8m$a */
    public class C18169a implements lx2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f126843a;

        public C18169a(Runnable runnable) {
            this.f126843a = runnable;
        }

        @Override // p149l.lx2
        /* JADX INFO: renamed from: a */
        public void mo5066a(C0871d c0871d) {
            int iM4966b = c0871d.m4966b();
            l8m l8mVar = l8m.this;
            if (iM4966b != 0) {
                l8mVar.f126839d.onError(new RuntimeException(TextUtils.concat(String.valueOf(c0871d.m4966b()), "_", c0871d.m4965a()).toString()));
                l8m.this.f126838c = false;
                return;
            }
            l8mVar.m148941q(l8mVar.f126836a);
            l8m.this.f126839d.onNext(roj0.f160388a);
            l8m.this.f126838c = true;
            if (NullChecker.m81303a(this.f126843a)) {
                this.f126843a.run();
            }
        }

        @Override // p149l.lx2
        /* JADX INFO: renamed from: c */
        public void mo5068c() {
            l8m.this.f126839d.onCompleted();
            l8m.this.f126838c = false;
        }
    }

    public l8m(Act act) {
        this.f126837b = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m148925a(dpm dpmVar) {
    }

    /* JADX INFO: renamed from: h */
    public C22306c<AbstractC0865a> m148932h() {
        return this.f126839d.map(new w9j() { // from class: l.k8m
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121837a.m148937m((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0865a m148933i() {
        return this.f126836a;
    }

    /* JADX INFO: renamed from: j */
    public C22393b<j760<C0871d, List<Purchase>>> m148934j() {
        return this.f126840e;
    }

    /* JADX INFO: renamed from: k */
    public void m148935k(Application application) {
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        this.f126836a = AbstractC0865a.m4822g(application).m4835b().m4837d(this.f126841f).m4834a();
    }

    /* JADX INFO: renamed from: l */
    public void m148936l() {
        this.f126836a = AbstractC0865a.m4822g(this.f126837b).m4835b().m4837d(this.f126841f).m4834a();
        m148942r(null);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractC0865a m148937m(roj0 roj0Var) {
        return this.f126836a;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m148938n(C0871d c0871d, List list) {
        this.f126840e.onNext(j760.m140076a(c0871d, list));
    }

    /* JADX INFO: renamed from: p */
    public void m148940p() {
        if (NullChecker.m81303a(this.f126836a)) {
            this.f126836a.mo4825c();
            this.f126836a = null;
            this.f126841f.m183374a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m148941q(AbstractC0865a abstractC0865a) {
        if (NullChecker.m81303a(abstractC0865a) && NullChecker.m81303a(this.f126837b) && this.f126837b.getComponentName().getClassName().contains("NewMainAct")) {
            abstractC0865a.mo4831j(this.f126837b, bpm.m103080a().m103082a().m103083b(), this.f126842g);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m148942r(Runnable runnable) {
        if (this.f126838c) {
            runnable.run();
        } else {
            this.f126836a.mo4832k(new C18169a(runnable));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m148939o(int i, int i2, Intent intent) {
    }
}

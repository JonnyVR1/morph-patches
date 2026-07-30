package p153l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.android.billingclient.api.AbstractC0869a;
import com.android.billingclient.api.C0875d;
import com.android.billingclient.api.Purchase;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class bbm {

    /* JADX INFO: renamed from: a */
    public AbstractC0869a f75967a;

    /* JADX INFO: renamed from: b */
    public Act f75968b;

    /* JADX INFO: renamed from: c */
    public boolean f75969c = false;

    /* JADX INFO: renamed from: d */
    public final C22507a<uxj0> f75970d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public final C22508b<pf60<C0875d, List<Purchase>>> f75971e = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public wkb0 f75972f = new wkb0(new vkb0() { // from class: l.yam
        @Override // p153l.vkb0
        /* JADX INFO: renamed from: d */
        public final void mo5079d(C0875d c0875d, List list) {
            this.f198223a.m103300n(c0875d, list);
        }
    });

    /* JADX INFO: renamed from: g */
    public erm f75973g = new erm() { // from class: l.zam
        @Override // p153l.erm
        /* JADX INFO: renamed from: a */
        public final void mo122189a(frm frmVar) {
            bbm.m103287a(frmVar);
        }
    };

    /* JADX INFO: renamed from: l.bbm$a */
    public class C15965a implements ay2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f75974a;

        public C15965a(Runnable runnable) {
            this.f75974a = runnable;
        }

        @Override // p153l.ay2
        /* JADX INFO: renamed from: a */
        public void mo5076a(C0875d c0875d) {
            int iM4976b = c0875d.m4976b();
            bbm bbmVar = bbm.this;
            if (iM4976b != 0) {
                bbmVar.f75970d.onError(new RuntimeException(TextUtils.concat(String.valueOf(c0875d.m4976b()), "_", c0875d.m4975a()).toString()));
                bbm.this.f75969c = false;
                return;
            }
            bbmVar.m103303q(bbmVar.f75967a);
            bbm.this.f75970d.onNext(uxj0.f181467a);
            bbm.this.f75969c = true;
            if (NullChecker.m82486a(this.f75974a)) {
                this.f75974a.run();
            }
        }

        @Override // p153l.ay2
        /* JADX INFO: renamed from: c */
        public void mo5078c() {
            bbm.this.f75970d.onCompleted();
            bbm.this.f75969c = false;
        }
    }

    public bbm(Act act) {
        this.f75968b = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m103287a(frm frmVar) {
    }

    /* JADX INFO: renamed from: h */
    public C22421c<AbstractC0869a> m103294h() {
        return this.f75970d.map(new qcj() { // from class: l.abm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69635a.m103299m((uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0869a m103295i() {
        return this.f75967a;
    }

    /* JADX INFO: renamed from: j */
    public C22508b<pf60<C0875d, List<Purchase>>> m103296j() {
        return this.f75971e;
    }

    /* JADX INFO: renamed from: k */
    public void m103297k(Application application) {
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        this.f75967a = AbstractC0869a.m4832g(application).m4845b().m4847d(this.f75972f).m4844a();
    }

    /* JADX INFO: renamed from: l */
    public void m103298l() {
        this.f75967a = AbstractC0869a.m4832g(this.f75968b).m4845b().m4847d(this.f75972f).m4844a();
        m103304r(null);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractC0869a m103299m(uxj0 uxj0Var) {
        return this.f75967a;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m103300n(C0875d c0875d, List list) {
        this.f75971e.onNext(pf60.m172085a(c0875d, list));
    }

    /* JADX INFO: renamed from: p */
    public void m103302p() {
        if (NullChecker.m82486a(this.f75967a)) {
            this.f75967a.mo4835c();
            this.f75967a = null;
            this.f75972f.m206741a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m103303q(AbstractC0869a abstractC0869a) {
        if (NullChecker.m82486a(abstractC0869a) && NullChecker.m82486a(this.f75968b) && this.f75968b.getComponentName().getClassName().contains("NewMainAct")) {
            abstractC0869a.mo4841j(this.f75968b, drm.m117689a().m117691a().m117692b(), this.f75973g);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m103304r(Runnable runnable) {
        if (this.f75969c) {
            runnable.run();
        } else {
            this.f75967a.mo4842k(new C15965a(runnable));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m103301o(int i, int i2, Intent intent) {
    }
}

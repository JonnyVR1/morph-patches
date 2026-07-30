package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public abstract class y9h extends AbstractC15662a7<List<MomentActivity>> {

    /* JADX INFO: renamed from: b */
    public List<MomentActivity> f198092b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Links f198093c;

    /* JADX INFO: renamed from: d */
    public boolean f198094d;

    /* JADX INFO: renamed from: e */
    public Act f198095e;

    public y9h(Act act) {
        this.f198095e = act;
        m214832h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m214831g() {
        return this.f198094d;
    }

    /* JADX INFO: renamed from: h */
    public final void m214832h() {
        if (mo164137r()) {
            this.f198095e.duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.u9h
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178118a.m214838o((Moment) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m214833i() {
        m214834j(false);
    }

    /* JADX INFO: renamed from: j */
    public void m214834j(final boolean z) {
        this.f198095e.duringCreated(mo118474k()).subscribe(psd0.m173597H(new y20() { // from class: l.v9h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183002a.m214839p(z, (pf60) obj);
            }
        }, new y20() { // from class: l.w9h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188012a.m214840q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public abstract C22421c<pf60<Links, List<MomentActivity>>> mo118474k();

    /* JADX INFO: renamed from: l */
    public String m214835l() {
        Links links = this.f198093c;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return "";
        }
        return "&" + this.f198093c.next;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public String m214836m() {
        String strM214835l = m214835l();
        StringBuilder sb = new StringBuilder();
        sb.append(m214835l());
        sb.append(TextUtils.isEmpty(strM214835l) ? m214837n() : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public String m214837n() {
        return "&sort=unread";
    }

    @Override // p153l.dsl
    public void next() {
        if (TextUtils.isEmpty(m214835l()) || m214831g()) {
            return;
        }
        m214842t();
        m214833i();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m214838o(final Moment moment) {
        int iM147476G = jyb.m147476G(this.f198092b, new qcj() { // from class: l.x9h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MomentActivity momentActivity = (MomentActivity) obj;
                return Boolean.valueOf(momentActivity != null && momentActivity.reference.f40080id.equals(moment.f56859id));
            }
        });
        if (iM147476G != -1) {
            this.f198092b.remove(iM147476G);
            m96353b().mo63169z0(this.f198092b, this.f198093c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m214839p(boolean z, pf60 pf60Var) {
        if (z) {
            this.f198092b.clear();
        }
        this.f198092b.addAll((Collection) pf60Var.f152157b);
        this.f198093c = (Links) pf60Var.f152156a;
        m96353b().mo63169z0(this.f198092b, (Links) pf60Var.f152156a);
        m214841s();
    }

    @Override // p153l.dsl
    public void previous() {
        this.f198093c = null;
        m214834j(true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m214840q(Throwable th) {
        th.printStackTrace();
        m96353b().mo63168a(th);
        m214841s();
    }

    /* JADX INFO: renamed from: r */
    public boolean mo164137r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m214841s() {
        this.f198094d = false;
    }

    /* JADX INFO: renamed from: t */
    public void m214842t() {
        this.f198094d = true;
    }
}

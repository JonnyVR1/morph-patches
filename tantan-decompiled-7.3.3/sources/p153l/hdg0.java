package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.subscriptions.SubscriptionsAct;
import com.p051p1.mobile.putong.data.Contract;
import java.util.ArrayList;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class hdg0 implements iam<edg0> {

    /* JADX INFO: renamed from: a */
    public VLinear f108990a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f108991b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f108992c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f108993d;

    /* JADX INFO: renamed from: e */
    public edg0 f108994e;

    /* JADX INFO: renamed from: f */
    public final SubscriptionsAct f108995f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC16147c f108996g;

    /* JADX INFO: renamed from: h */
    public a80 f108997h;

    public hdg0(SubscriptionsAct subscriptionsAct, InterfaceC16147c interfaceC16147c) {
        this.f108995f = subscriptionsAct;
        this.f108996g = interfaceC16147c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m134589i(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f108995f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f108995f;
    }

    /* JADX INFO: renamed from: c */
    public View m134590c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return idg0.m139534b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(edg0 edg0Var) {
        this.f108994e = edg0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m134592e() {
        this.f108997h.m96412J(new z20() { // from class: l.fdg0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f98474a.m134593f((View) obj, (Contract) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m134593f(View view, Contract contract) {
        if (view.getId() == adc0.f70057Oe) {
            if (TextUtils.isEmpty(contract.f39583id)) {
                this.f108996g.m107276c("e_auto_renew_subscriptions_option", this.f108995f.pageId(), pf60.m172085a("auto_renew_subscriptions_option_type", "subscribe"));
                this.f108994e.m120444G0();
            } else {
                if (xzc0.m213720r().m213722A(contract)) {
                    this.f108996g.m107276c("e_auto_renew_subscriptions_option", this.f108995f.pageId(), pf60.m172085a("auto_renew_subscriptions_option_type", "cancel"));
                }
                this.f108994e.m120445H0(contract);
            }
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m134590c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m134594j(ArrayList<Contract> arrayList) {
        this.f108993d.setVisibility(0);
        this.f108992c.setVisibility(4);
        this.f108997h.m96411I(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public void m134595r() {
        this.f108991b.setTitle(R$string.f19532oo);
        this.f108991b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.gdg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103711a.m134589i(view);
            }
        });
        this.f108993d.setLayoutManager(new LinearLayoutManager(this.f108995f));
        a80 a80Var = new a80(this.f108995f);
        this.f108997h = a80Var;
        this.f108993d.setAdapter(a80Var);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

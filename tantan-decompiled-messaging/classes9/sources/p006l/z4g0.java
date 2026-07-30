package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.subscriptions.SubscriptionsAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Contract;
import java.util.ArrayList;
import l.a5g0;
import l.f30;
import l.j760;
import l.s7m;
import v.VLinear;
import v.VProgressBar;
import v.VRecyclerView;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class z4g0 implements s7m<w4g0> {

    /* JADX INFO: renamed from: a */
    public VLinear f28623a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f28624b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f28625c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f28626d;

    /* JADX INFO: renamed from: e */
    public w4g0 f28627e;

    /* JADX INFO: renamed from: f */
    public final SubscriptionsAct f28628f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0584c f28629g;

    /* JADX INFO: renamed from: h */
    public e80 f28630h;

    public z4g0(SubscriptionsAct subscriptionsAct, InterfaceC0584c interfaceC0584c) {
        this.f28628f = subscriptionsAct;
        this.f28629g = interfaceC0584c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m28551i(View view) {
        act().onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m28552C0() {
        return this.f28628f;
    }

    @Nullable
    public Act act() {
        return this.f28628f;
    }

    /* JADX INFO: renamed from: c */
    public View m28553c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a5g0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m28557i1(w4g0 w4g0Var) {
        this.f28627e = w4g0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m28555e() {
        this.f28630h.m14412J(new f30() { // from class: l.x4g0
            public final void call(Object obj, Object obj2) {
                this.f27349a.m28556f((View) obj, (Contract) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m28556f(View view, Contract contract) {
        if (view.getId() == u4c0.f22666Le) {
            if (TextUtils.isEmpty(contract.id)) {
                this.f28629g.m13049c("e_auto_renew_subscriptions_option", this.f28628f.pageId(), j760.a("auto_renew_subscriptions_option_type", "subscribe"));
                this.f28627e.m26196G0();
            } else {
                if (src0.m24159r().m24161A(contract)) {
                    this.f28629g.m13049c("e_auto_renew_subscriptions_option", this.f28628f.pageId(), j760.a("auto_renew_subscriptions_option_type", "cancel"));
                }
                this.f28627e.m26197H0(contract);
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m28553c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m28558j(ArrayList<Contract> arrayList) {
        this.f28626d.setVisibility(0);
        this.f28625c.setVisibility(4);
        this.f28630h.m14411I(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public void m28559r() {
        this.f28624b.setTitle(R$string.f2089Rn);
        this.f28624b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.y4g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28004a.m28551i(view);
            }
        });
        this.f28626d.setLayoutManager(new LinearLayoutManager(this.f28628f));
        e80 e80Var = new e80(this.f28628f);
        this.f28630h = e80Var;
        this.f28626d.setAdapter(e80Var);
    }

    public void destroy() {
    }
}

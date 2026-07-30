package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.subscriptions.SubscriptionsAct;
import com.p046p1.mobile.putong.data.Contract;
import java.util.ArrayList;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class z4g0 implements s7m<w4g0> {

    /* JADX INFO: renamed from: a */
    public VLinear f201592a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f201593b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f201594c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f201595d;

    /* JADX INFO: renamed from: e */
    public w4g0 f201596e;

    /* JADX INFO: renamed from: f */
    public final SubscriptionsAct f201597f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC16030c f201598g;

    /* JADX INFO: renamed from: h */
    public e80 f201599h;

    public z4g0(SubscriptionsAct subscriptionsAct, InterfaceC16030c interfaceC16030c) {
        this.f201597f = subscriptionsAct;
        this.f201598g = interfaceC16030c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m217076i(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f201597f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f201597f;
    }

    /* JADX INFO: renamed from: c */
    public View m217077c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a5g0.m95024b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(w4g0 w4g0Var) {
        this.f201596e = w4g0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m217079e() {
        this.f201599h.m115236J(new f30() { // from class: l.x4g0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f191022a.m217080f((View) obj, (Contract) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m217080f(View view, Contract contract) {
        if (view.getId() == u4c0.f173918Le) {
            if (TextUtils.isEmpty(contract.f38735id)) {
                this.f201598g.m104709c("e_auto_renew_subscriptions_option", this.f201597f.pageId(), j760.m140076a("auto_renew_subscriptions_option_type", "subscribe"));
                this.f201596e.m201501G0();
            } else {
                if (src0.m185656r().m185658A(contract)) {
                    this.f201598g.m104709c("e_auto_renew_subscriptions_option", this.f201597f.pageId(), j760.m140076a("auto_renew_subscriptions_option_type", "cancel"));
                }
                this.f201596e.m201502H0(contract);
            }
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m217077c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m217081j(ArrayList<Contract> arrayList) {
        this.f201595d.setVisibility(0);
        this.f201594c.setVisibility(4);
        this.f201599h.m115235I(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public void m217082r() {
        this.f201593b.setTitle(R$string.f18100Rn);
        this.f201593b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.y4g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196282a.m217076i(view);
            }
        });
        this.f201595d.setLayoutManager(new LinearLayoutManager(this.f201597f));
        e80 e80Var = new e80(this.f201597f);
        this.f201599h = e80Var;
        this.f201595d.setAdapter(e80Var);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

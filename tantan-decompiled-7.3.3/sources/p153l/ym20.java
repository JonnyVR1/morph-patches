package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.AccountDeleteAct;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ym20 implements iam<qm20> {

    /* JADX INFO: renamed from: a */
    public VLinear f200624a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f200625b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f200626c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f200627d;

    /* JADX INFO: renamed from: e */
    public VLinear f200628e;

    /* JADX INFO: renamed from: f */
    public VText f200629f;

    /* JADX INFO: renamed from: g */
    public VText f200630g;

    /* JADX INFO: renamed from: h */
    public final NewAccountSecureAct f200631h;

    /* JADX INFO: renamed from: i */
    public qm20 f200632i;

    /* JADX INFO: renamed from: j */
    public an20 f200633j;

    /* JADX INFO: renamed from: l.ym20$a */
    public class ViewOnClickListenerC21630a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final String[] f200634a;

        /* JADX INFO: renamed from: b */
        public String[] f200635b = {"found_someone_on_tantan", "found_someone_elsewhere", "dont_like_app", "other"};

        /* JADX INFO: renamed from: c */
        public String[] f200636c = {"already_in_love_from_tantan", "already_in_love_from_others", "dislike_tantan", "other_reasons"};

        public ViewOnClickListenerC21630a() {
            this.f200634a = new String[]{ym20.this.getAct().getString(R$string.f28760q0), ym20.this.getAct().getString(R$string.f28766r0), ym20.this.getAct().getString(R$string.f28772s0), ym20.this.getAct().getString(R$string.f28778t0)};
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Unit m216668f() {
            ym20.this.f200632i.m177050N0("");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m216669g(int i, String str) {
            sfj0.m185596c("e_delete_account_confirm_click", "p_alert_delete_account_confirm_popup", sfj0.C20032a.m185615h("delete_account_reason", this.f200636c[i]));
            ym20.this.getAct().progress(R$string.f28619R0);
            ym20.this.f200632i.m177050N0(str);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m216670h(Dialog dialog, View view, final int i, CharSequence charSequence) {
            final String str = this.f200635b[i];
            sfj0.m185596c("e_delete_account_reason_click", "p_delete_account_reason_selection_popup", sfj0.C20032a.m185615h("delete_account_reason", this.f200636c[i]));
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_delete_account_confirm_popup", Dialog.class.getName());
            l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_system", "delete_account_reason_button", "account_security_page", "delete_account"));
            w1e.m204402f(l4g0VarM204399c);
            ym20.this.getAct().dialog().m21502E0(R$string.f28790v0).m21499D(R$string.f28796w0).m21540k0(R$string.f28663a).m21555t0(R$string.f28717j, new Runnable() { // from class: l.wm20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189760a.m216669g(i, str);
                }
            }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.xm20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            }).m21567z0();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_delete_account_reason_selection_popup", Dialog.class.getName());
            l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_system", "account_cancel_button", "account_security_page", "click"));
            w1e.m204402f(l4g0VarM204399c);
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || !CoreModule.f18273l.m143405a().mo34492e2() || CoreModule.f18264c.f20312H0.m155435Y4() > 0 || (CoreModule.m30930K().mo31838xf() && CoreModule.f18264c.f20315I0.m144054K3() > 0)) {
                C21356xk.INSTANCE.m211278f(true, ym20.this.getAct(), new Function0() { // from class: l.tm20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f174885a.m216668f();
                    }
                });
            } else {
                ym20.this.getAct().dialog().m21502E0(R$string.f28784u0).m21535f0(this.f200634a).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.um20
                    @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                    /* JADX INFO: renamed from: a */
                    public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                        this.f179596a.m216670h(dialog, view2, i, charSequence);
                    }
                }).m21540k0(R$string.f28663a).m21525V(new DialogInterface.OnDismissListener() { // from class: l.vm20
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        w1e.m204401e(l4g0VarM204399c);
                    }
                }).m21567z0();
            }
        }
    }

    public ym20(NewAccountSecureAct newAccountSecureAct) {
        this.f200631h = newAccountSecureAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m216655k(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m216656l(View view) {
        getAct().startActivity(AccountDeleteAct.m45283Z1(getAct()));
    }

    /* JADX INFO: renamed from: r */
    private void m216657r() {
        this.f200625b.setTitle(getAct().getString(R$string.f28751o3));
        this.f200625b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rm20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163823a.m216655k(view);
            }
        });
        bnl0.m105524M(this.f200628e, true);
        String string = getAct().getString(R$string.f28662Z3);
        String string2 = getAct().getString(R$string.f28657Y3);
        this.f200629f.setText(q8g0.m175796b0(string + string2, jyb.m147507f0(string2), getAct().getResources().getColor(j9c0.f118869f), Typeface.DEFAULT));
        boolean zM29112i = IntlCountryCodeController.m29112i();
        VText vText = this.f200630g;
        if (zM29112i) {
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.sm20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169488a.m216656l(view);
                }
            });
            this.f200630g.setText(R$string.f28594M0);
        } else {
            vText.setText(R$string.f28736m0);
            bnl0.m105509E0(this.f200630g, new ViewOnClickListenerC21630a());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getAct());
        linearLayoutManager.setOrientation(1);
        this.f200627d.setLayoutManager(linearLayoutManager);
        an20 an20Var = new an20(getAct());
        this.f200633j = an20Var;
        this.f200627d.setAdapter(an20Var);
        m216662j();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f200631h;
    }

    /* JADX INFO: renamed from: d */
    public View m216658d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zm20.m220348b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public NewAccountSecureAct getAct() {
        return this.f200631h;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qm20 qm20Var) {
        this.f200632i = qm20Var;
    }

    /* JADX INFO: renamed from: i */
    public void m216661i(boolean z) {
        bnl0.m105524M(this.f200626c, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM216658d = m216658d(layoutInflater, viewGroup);
        m216657r();
        return viewM216658d;
    }

    /* JADX INFO: renamed from: j */
    public void m216662j() {
        bnl0.m105524M(this.f200626c, false);
        this.f200633j.m98933K(this.f200632i.m177049L0(), this.f200632i.m177048I0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.AccountDeleteAct;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes8.dex */
public class oe20 implements s7m<ge20> {

    /* JADX INFO: renamed from: a */
    public VLinear f143259a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f143260b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f143261c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f143262d;

    /* JADX INFO: renamed from: e */
    public VLinear f143263e;

    /* JADX INFO: renamed from: f */
    public VText f143264f;

    /* JADX INFO: renamed from: g */
    public VText f143265g;

    /* JADX INFO: renamed from: h */
    public final NewAccountSecureAct f143266h;

    /* JADX INFO: renamed from: i */
    public ge20 f143267i;

    /* JADX INFO: renamed from: j */
    public qe20 f143268j;

    /* JADX INFO: renamed from: l.oe20$a */
    public class ViewOnClickListenerC18903a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final String[] f143269a;

        /* JADX INFO: renamed from: b */
        public String[] f143270b = {"found_someone_on_tantan", "found_someone_elsewhere", "dont_like_app", "other"};

        /* JADX INFO: renamed from: c */
        public String[] f143271c = {"already_in_love_from_tantan", "already_in_love_from_others", "dislike_tantan", "other_reasons"};

        public ViewOnClickListenerC18903a() {
            this.f143269a = new String[]{oe20.this.getAct().getString(R$string.f27912q0), oe20.this.getAct().getString(R$string.f27918r0), oe20.this.getAct().getString(R$string.f27924s0), oe20.this.getAct().getString(R$string.f27930t0)};
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Unit m163795f() {
            oe20.this.f143267i.m125641N0("");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m163796g(int i, String str) {
            o6j0.m162859c("e_delete_account_confirm_click", "p_alert_delete_account_confirm_popup", o6j0.C18854a.m162878h("delete_account_reason", this.f143271c[i]));
            oe20.this.getAct().progress(R$string.f27771R0);
            oe20.this.f143267i.m125641N0(str);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m163797h(Dialog dialog, View view, final int i, CharSequence charSequence) {
            final String str = this.f143270b[i];
            o6j0.m162859c("e_delete_account_reason_click", "p_delete_account_reason_selection_popup", o6j0.C18854a.m162878h("delete_account_reason", this.f143271c[i]));
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_delete_account_confirm_popup", Dialog.class.getName());
            cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_system", "delete_account_reason_button", "account_security_page", "delete_account"));
            i0e.m133797f(cwf0VarM133794c);
            oe20.this.getAct().dialog().m20503E0(R$string.f27942v0).m20500D(R$string.f27948w0).m20541k0(R$string.f27815a).m20556t0(R$string.f27869j, new Runnable() { // from class: l.me20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133336a.m163796g(i, str);
                }
            }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.ne20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            }).m20568z0();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_delete_account_reason_selection_popup", Dialog.class.getName());
            cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_system", "account_cancel_button", "account_security_page", "click"));
            i0e.m133797f(cwf0VarM133794c);
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || !CoreModule.f17554l.m94651a().mo33489e2() || CoreModule.f17545c.f19570H0.m210347Y4() > 0 || (CoreModule.m29932K().mo30835xf() && CoreModule.f17545c.f19573I0.m140257K3() > 0)) {
                C16185cl.INSTANCE.m107439f(true, oe20.this.getAct(), new Function0() { // from class: l.je20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f117466a.m163795f();
                    }
                });
            } else {
                oe20.this.getAct().dialog().m20503E0(R$string.f27936u0).m20536f0(this.f143269a).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ke20
                    @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
                    /* JADX INFO: renamed from: a */
                    public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                        this.f122665a.m163797h(dialog, view2, i, charSequence);
                    }
                }).m20541k0(R$string.f27815a).m20526V(new DialogInterface.OnDismissListener() { // from class: l.le20
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.m133796e(cwf0VarM133794c);
                    }
                }).m20568z0();
            }
        }
    }

    public oe20(NewAccountSecureAct newAccountSecureAct) {
        this.f143266h = newAccountSecureAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m163782k(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m163783l(View view) {
        getAct().startActivity(AccountDeleteAct.m44100Y1(getAct()));
    }

    /* JADX INFO: renamed from: r */
    private void m163784r() {
        this.f143260b.setTitle(getAct().getString(R$string.f27903o3));
        this.f143260b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.he20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107327a.m163782k(view);
            }
        });
        xdl0.m208344M(this.f143263e, true);
        String string = getAct().getString(R$string.f27814Z3);
        String string2 = getAct().getString(R$string.f27809Y3);
        this.f143264f.setText(i0g0.m133861b0(string + string2, vwb.m200324f0(string2), getAct().getResources().getColor(c1c0.f78249f), Typeface.DEFAULT));
        boolean zM28113i = IntlCountryCodeController.m28113i();
        VText vText = this.f143265g;
        if (zM28113i) {
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ie20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112708a.m163783l(view);
                }
            });
            this.f143265g.setText(R$string.f27746M0);
        } else {
            vText.setText(R$string.f27888m0);
            xdl0.m208329E0(this.f143265g, new ViewOnClickListenerC18903a());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getAct());
        linearLayoutManager.setOrientation(1);
        this.f143262d.setLayoutManager(linearLayoutManager);
        qe20 qe20Var = new qe20(getAct());
        this.f143268j = qe20Var;
        this.f143262d.setAdapter(qe20Var);
        m163789j();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143266h;
    }

    /* JADX INFO: renamed from: d */
    public View m163785d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pe20.m168501b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public NewAccountSecureAct getAct() {
        return this.f143266h;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ge20 ge20Var) {
        this.f143267i = ge20Var;
    }

    /* JADX INFO: renamed from: i */
    public void m163788i(boolean z) {
        xdl0.m208344M(this.f143261c, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM163785d = m163785d(layoutInflater, viewGroup);
        m163784r();
        return viewM163785d;
    }

    /* JADX INFO: renamed from: j */
    public void m163789j() {
        xdl0.m208344M(this.f143261c, false);
        this.f143268j.m174180K(this.f143267i.m125640L0(), this.f143267i.m125639I0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

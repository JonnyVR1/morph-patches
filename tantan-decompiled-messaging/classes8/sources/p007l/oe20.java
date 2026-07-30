package p007l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p003p1.mobile.android.app.Dialog;
import com.p003p1.mobile.putong.core.p006ui.account.AccountDeleteAct;
import com.p003p1.mobile.putong.core.p006ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.c1c0;
import l.cwf0;
import l.i0e;
import l.i0g0;
import l.o6j0;
import l.pe20;
import l.u4e;
import l.vwb;
import l.xdl0;
import v.VLinear;
import v.VProgressBar;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class oe20 implements s7m<ge20> {

    /* JADX INFO: renamed from: a */
    public VLinear f3527a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f3528b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f3529c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f3530d;

    /* JADX INFO: renamed from: e */
    public VLinear f3531e;

    /* JADX INFO: renamed from: f */
    public VText f3532f;

    /* JADX INFO: renamed from: g */
    public VText f3533g;

    /* JADX INFO: renamed from: h */
    public final NewAccountSecureAct f3534h;

    /* JADX INFO: renamed from: i */
    public ge20 f3535i;

    /* JADX INFO: renamed from: j */
    public qe20 f3536j;

    /* JADX INFO: renamed from: l.oe20$a */
    public class ViewOnClickListenerC0634a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final String[] f3537a;

        /* JADX INFO: renamed from: b */
        public String[] f3538b = {"found_someone_on_tantan", "found_someone_elsewhere", "dont_like_app", "other"};

        /* JADX INFO: renamed from: c */
        public String[] f3539c = {"already_in_love_from_tantan", "already_in_love_from_others", "dislike_tantan", "other_reasons"};

        public ViewOnClickListenerC0634a() {
            this.f3537a = new String[]{oe20.this.act().getString(R.string.q0), oe20.this.act().getString(R.string.r0), oe20.this.act().getString(R.string.s0), oe20.this.act().getString(R.string.t0)};
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Unit m10214f() {
            oe20.this.f3535i.m9231N0("");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m10215g(int i, String str) {
            o6j0.c("e_delete_account_confirm_click", "p_alert_delete_account_confirm_popup", new o6j0.a[]{o6j0.a.h("delete_account_reason", this.f3539c[i])});
            oe20.this.act().progress(R.string.R0);
            oe20.this.f3535i.m9231N0(str);
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m10216h(Dialog dialog, View view, final int i, CharSequence charSequence) {
            final String str = this.f3538b[i];
            o6j0.c("e_delete_account_reason_click", "p_delete_account_reason_selection_popup", new o6j0.a[]{o6j0.a.h("delete_account_reason", this.f3539c[i])});
            final cwf0 cwf0VarC = i0e.c("p_alert_delete_account_confirm_popup", Dialog.class.getName());
            cwf0VarC.o(u4e.b("passive", "alert", "alert_system", "delete_account_reason_button", "account_security_page", "delete_account"));
            i0e.f(cwf0VarC);
            oe20.this.act().dialog().m774E0(R.string.v0).m771D(R.string.w0).m812k0(R.string.a).m827t0(R.string.j, new Runnable() { // from class: l.me20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3301a.m10215g(i, str);
                }
            }).m797V(new DialogInterface.OnDismissListener() { // from class: l.ne20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.e(cwf0VarC);
                }
            }).m839z0();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final cwf0 cwf0VarC = i0e.c("p_delete_account_reason_selection_popup", Dialog.class.getName());
            cwf0VarC.o(u4e.b("passive", "alert", "alert_system", "account_cancel_button", "account_security_page", "click"));
            i0e.f(cwf0VarC);
            if (CoreModule.c.e0.p9().isVIP() || !CoreModule.l.a().e2() || CoreModule.c.H0.Y4() > 0 || (CoreModule.K().xf() && CoreModule.c.I0.K3() > 0)) {
                C0517cl.INSTANCE.m8790f(true, oe20.this.act(), new Function0() { // from class: l.je20
                    public final Object invoke() {
                        return this.f2977a.m10214f();
                    }
                });
            } else {
                oe20.this.act().dialog().m774E0(R.string.u0).m807f0(this.f3537a).m808g0(new Dialog.InterfaceC0223g() { // from class: l.ke20
                    @Override // com.p003p1.mobile.android.app.Dialog.InterfaceC0223g
                    /* JADX INFO: renamed from: a */
                    public final void mo840a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                        this.f3070a.m10216h(dialog, view2, i, charSequence);
                    }
                }).m812k0(R.string.a).m797V(new DialogInterface.OnDismissListener() { // from class: l.le20
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.e(cwf0VarC);
                    }
                }).m839z0();
            }
        }
    }

    public oe20(NewAccountSecureAct newAccountSecureAct) {
        this.f3534h = newAccountSecureAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m10201k(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m10202l(View view) {
        act().startActivity(AccountDeleteAct.m8436Y1(act()));
    }

    /* JADX INFO: renamed from: r */
    private void m10203r() {
        this.f3528b.setTitle(act().getString(R.string.o3));
        this.f3528b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.he20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2842a.m10201k(view);
            }
        });
        xdl0.M(this.f3531e, true);
        String string = act().getString(R.string.Z3);
        String string2 = act().getString(R.string.Y3);
        this.f3532f.setText(i0g0.b0(string + string2, vwb.f0(new String[]{string2}), act().getResources().getColor(c1c0.f), Typeface.DEFAULT));
        boolean zI = IntlCountryCodeController.i();
        VText vText = this.f3533g;
        if (zI) {
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.ie20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2880a.m10202l(view);
                }
            });
            this.f3533g.setText(R.string.M0);
        } else {
            vText.setText(R.string.m0);
            xdl0.E0(this.f3533g, new ViewOnClickListenerC0634a());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(1);
        this.f3530d.setLayoutManager(linearLayoutManager);
        qe20 qe20Var = new qe20(act());
        this.f3536j = qe20Var;
        this.f3530d.setAdapter(qe20Var);
        m10208j();
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f3534h;
    }

    /* JADX INFO: renamed from: d */
    public View m10204d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pe20.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public NewAccountSecureAct act() {
        return this.f3534h;
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(ge20 ge20Var) {
        this.f3535i = ge20Var;
    }

    /* JADX INFO: renamed from: i */
    public void m10207i(boolean z) {
        xdl0.M(this.f3529c, z);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM10204d = m10204d(layoutInflater, viewGroup);
        m10203r();
        return viewM10204d;
    }

    /* JADX INFO: renamed from: j */
    public void m10208j() {
        xdl0.M(this.f3529c, false);
        this.f3536j.m10345K(this.f3535i.m9230L0(), this.f3535i.m9229I0());
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}

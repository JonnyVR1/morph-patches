package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public final class ebn extends g6e {
    /* JADX INFO: renamed from: A */
    public static void m120186A(final Act act, PurchaseType purchaseType, String str) {
        ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(kec0.f126142xf, (ViewGroup) null);
        View viewFindViewById = viewGroup.findViewById(adc0.f69895F5);
        ImageView imageView = (ImageView) viewGroup.findViewById(adc0.f70621w5);
        TextView textView = (TextView) viewGroup.findViewById(adc0.f70409je);
        VButton vButton = (VButton) viewGroup.findViewById(adc0.f70331f3);
        VButton vButton2 = (VButton) viewGroup.findViewById(adc0.f70427kf);
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
        String str2 = purchaseType == purchaseType2 ? "vip" : "see";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_privilege_activated", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("productType", str2), jyb.m147494Y("skuID", str));
        final jl80 jl80VarM146049r0 = act.newDialog().m146023R(viewGroup).m146046o0(new DialogInterface.OnShowListener() { // from class: l.dbn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.nan
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        if (purchaseType == purchaseType2) {
            imageView.setImageDrawable(act.drawable(dbc0.f87431sv));
            textView.setText(R$string.f19015Xs);
        } else {
            viewFindViewById.setVisibility(8);
            imageView.setImageResource(dbc0.f86485Ps);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int iM175859d = qa00.m175859d(98.0f);
            layoutParams.height = iM175859d;
            layoutParams.width = iM175859d;
            textView.setText(R$string.f18985Ws);
        }
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.oan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebn.m120201s(jl80VarM146049r0, view);
            }
        });
        vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.pan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebn.m120198p(act, jl80VarM146049r0, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static Dialog m120187B(Act act, String str, String str2, String str3, String str4, final z20<String, x20> z20Var) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_download_data_submit_email_popup", "showEmailInputDlg");
        final Dialog dialogM21566z = act.dialog().m21506G0(str).m21503F(str2).m21516M(kec0.f125987od).m21557u0(str3).m21542m0(str4).m21495B(true).m21548q(false).m21525V(new DialogInterface.OnDismissListener() { // from class: l.man
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z();
        final VEditText vEditText = (VEditText) dialogM21566z.m21457P().findViewById(adc0.f70534r3);
        l51.m152887G(new Runnable() { // from class: l.van
            @Override // java.lang.Runnable
            public final void run() {
                vEditText.requestFocus();
            }
        });
        vEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.wan
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ebn.m120207y(dialogM21566z, view, z);
            }
        });
        dialogM21566z.m21473o0(new Runnable() { // from class: l.xan
            @Override // java.lang.Runnable
            public final void run() {
                ebn.m120193k(z20Var, vEditText, dialogM21566z);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.yan
            @Override // java.lang.Runnable
            public final void run() {
                dialogM21566z.dismiss();
            }
        });
        dialogM21566z.show();
        w1e.m204402f(l4g0VarM204399c);
        return dialogM21566z;
    }

    /* JADX INFO: renamed from: C */
    public static void m120188C(Act act, String str, String str2, String str3, Runnable runnable) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_get_privilege_failed", "showGPRestoreDlg");
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_special", "purchase_button", "anywhere", "pay_fail"));
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146024S(dbc0.f86678Vt).m146056y0(str).m146051t0(str2).m146033b0(str3).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ran
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.m145975W(runnable);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: D */
    public static void m120189D(final Act act, final String str, String str2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_privilege_renew_pending_dialog", "showSubsErrorDlg");
        l4g0VarM204399c.m152781p(jyb.m147494Y("dialog_show_from", str2));
        w1e.m204402f(l4g0VarM204399c);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125803df, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70061P1);
        Dialog dialogM21566z = act.dialog().m21558v().m21518O(viewInflate).m21557u0(act.string(R$string.f19824y6)).m21542m0(act.string(R$string.f19731v6)).m21525V(new DialogInterface.OnDismissListener() { // from class: l.san
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z();
        textView.setText(q8g0.m175796b0(act.string(R$string.f19762w6), jyb.m147507f0(act.string(R$string.f19793x6)), Color.parseColor("#d84d37"), Typeface.DEFAULT));
        dialogM21566z.m21473o0(new Runnable() { // from class: l.tan
            @Override // java.lang.Runnable
            public final void run() {
                ebn.m120191i(str, act);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.uan
            @Override // java.lang.Runnable
            public final void run() {
                sfj0.m185596c("e_privilege_renew_giveup", "p_privilege_renew_pending_dialog", new sfj0.C20032a[0]);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m120191i(String str, Act act) {
        sfj0.m185596c("e_privilege_renew_update", "p_privilege_renew_pending_dialog", new sfj0.C20032a[0]);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", str).appendQueryParameter("package", act.getPackageName()).build());
        if (act.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return;
        }
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m120193k(z20 z20Var, VEditText vEditText, final Dialog dialog) {
        i4g0.m138520r("e_download_data_submit_email_button", "p_download_data_submit_email_popup");
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call(vEditText.getText().toString().trim(), new x20() { // from class: l.qan
                @Override // p153l.x20
                public final void call() {
                    dialog.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m120195m() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m120198p(Act act, jl80 jl80Var, View view) {
        sfj0.m185596c("e_privilege_activated_view_privilege_button", "p_privilege_activated", new sfj0.C20032a[0]);
        if (!(act instanceof VipAct)) {
            act.startActivity(VipAct.m57419b2(act));
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m120201s(jl80 jl80Var, View view) {
        sfj0.m185596c("e_privilege_activated_done_button", "p_privilege_activated", new sfj0.C20032a[0]);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m120205w(x20 x20Var) {
        sfj0.m185596c("e_vip_upgrade_popup_purchase_button", "p_vip_upgrade_popup", new sfj0.C20032a[0]);
        x20Var.call();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m120207y(Dialog dialog, View view, boolean z) {
        if (NullChecker.m82486a(dialog)) {
            dialog.getWindow().setSoftInputMode(5);
        }
    }

    /* JADX INFO: renamed from: z */
    public static Dialog m120208z(Act act, User user, final x20 x20Var) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_vip_upgrade_popup", OMSTemplateType.dialog);
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71112F).m21516M(kec0.f126106vd).m21557u0(act.string(R$string.f19569q)).m21542m0(act.string(R$string.f18307Al)).m21563x0(act.getResources().getDrawable(dbc0.f86907d)).m21558v().m21495B(true).m21496B0(new DialogInterface.OnShowListener() { // from class: l.zan
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.abn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z();
        VText vText = (VText) dialogM21566z.m21457P().findViewById(adc0.f70409je);
        VDraweeView vDraweeView = (VDraweeView) dialogM21566z.m21457P().findViewById(adc0.f70563sf);
        ((VImage) dialogM21566z.m21457P().findViewById(adc0.f70580tf)).setImageResource(dbc0.f87461ts);
        VText vText2 = (VText) dialogM21566z.m21457P().findViewById(adc0.f70597uf);
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(String.format(act.string(R$string.f19370jh), 3), jyb.m147507f0("3", act.string(R$string.f18494Gm)), Color.parseColor("#e1a11c"), Typeface.DEFAULT);
        vText.setText(String.format(act.string(R$string.f19401kh), "3"));
        vText2.setText(spannableStringBuilderM175796b0);
        if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127115L0(vDraweeView, user.picture(0).url);
        }
        dialogM21566z.m21473o0(new Runnable() { // from class: l.bbn
            @Override // java.lang.Runnable
            public final void run() {
                ebn.m120205w(x20Var);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.cbn
            @Override // java.lang.Runnable
            public final void run() {
                ebn.m120195m();
            }
        });
        dialogM21566z.show();
        return dialogM21566z;
    }
}

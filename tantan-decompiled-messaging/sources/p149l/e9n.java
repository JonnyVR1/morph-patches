package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public final class e9n extends s4e {
    /* JADX INFO: renamed from: A */
    public static void m115352A(final Act act, PurchaseType purchaseType, String str) {
        ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(f6c0.f95969qf, (ViewGroup) null);
        View viewFindViewById = viewGroup.findViewById(u4c0.f173773D5);
        ImageView imageView = (ImageView) viewGroup.findViewById(u4c0.f174496u5);
        TextView textView = (TextView) viewGroup.findViewById(u4c0.f174268ge);
        VButton vButton = (VButton) viewGroup.findViewById(u4c0.f174206d3);
        VButton vButton2 = (VButton) viewGroup.findViewById(u4c0.f174269gf);
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
        String str2 = purchaseType == purchaseType2 ? "vip" : "see";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_privilege_activated", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("productType", str2), vwb.m200311Y("skuID", str));
        final dd80 dd80VarM110989r0 = act.newDialog().m110963R(viewGroup).m110986o0(new DialogInterface.OnShowListener() { // from class: l.d9n
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.n8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        if (purchaseType == purchaseType2) {
            imageView.setImageDrawable(act.drawable(x2c0.f189312Eu));
            textView.setText(R$string.f17625Bs);
        } else {
            viewFindViewById.setVisibility(8);
            imageView.setImageResource(x2c0.f190026bs);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int iM186890d = t100.m186890d(98.0f);
            layoutParams.height = iM186890d;
            layoutParams.width = iM186890d;
            textView.setText(R$string.f17595As);
        }
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.o8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e9n.m115367s(dd80VarM110989r0, view);
            }
        });
        vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.p8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e9n.m115364p(act, dd80VarM110989r0, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static Dialog m115353B(Act act, String str, String str2, String str3, String str4, final f30<String, d30> f30Var) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_download_data_submit_email_popup", "showEmailInputDlg");
        final Dialog dialogM20567z = act.dialog().m20507G0(str).m20504F(str2).m20517M(f6c0.f95815hd).m20558u0(str3).m20543m0(str4).m20496B(true).m20549q(false).m20526V(new DialogInterface.OnDismissListener() { // from class: l.m8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z();
        final VEditText vEditText = (VEditText) dialogM20567z.m20458P().findViewById(u4c0.f174409p3);
        e51.m114742G(new Runnable() { // from class: l.v8n
            @Override // java.lang.Runnable
            public final void run() {
                vEditText.requestFocus();
            }
        });
        vEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.w8n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                e9n.m115373y(dialogM20567z, view, z);
            }
        });
        dialogM20567z.m20474o0(new Runnable() { // from class: l.x8n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m115359k(f30Var, vEditText, dialogM20567z);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.y8n
            @Override // java.lang.Runnable
            public final void run() {
                dialogM20567z.dismiss();
            }
        });
        dialogM20567z.show();
        i0e.m133797f(cwf0VarM133794c);
        return dialogM20567z;
    }

    /* JADX INFO: renamed from: C */
    public static void m115354C(Act act, String str, String str2, String str3, Runnable runnable) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_get_privilege_failed", "showGPRestoreDlg");
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_special", "purchase_button", "anywhere", "pay_fail"));
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110964S(x2c0.f190186gt).m110996y0(str).m110991t0(str2).m110973b0(str3).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.r8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.m110915W(runnable);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: D */
    public static void m115355D(final Act act, final String str, String str2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_privilege_renew_pending_dialog", "showSubsErrorDlg");
        cwf0VarM133794c.m109040p(vwb.m200311Y("dialog_show_from", str2));
        i0e.m133797f(cwf0VarM133794c);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95633We, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f173973P1);
        Dialog dialogM20567z = act.dialog().m20559v().m20519O(viewInflate).m20558u0(act.string(R$string.f19025w6)).m20543m0(act.string(R$string.f18935t6)).m20526V(new DialogInterface.OnDismissListener() { // from class: l.s8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z();
        textView.setText(i0g0.m133861b0(act.string(R$string.f18965u6), vwb.m200324f0(act.string(R$string.f18995v6)), Color.parseColor("#d84d37"), Typeface.DEFAULT));
        dialogM20567z.m20474o0(new Runnable() { // from class: l.t8n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m115357i(str, act);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.u8n
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.m162859c("e_privilege_renew_giveup", "p_privilege_renew_pending_dialog", new o6j0.C18854a[0]);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m115357i(String str, Act act) {
        o6j0.m162859c("e_privilege_renew_update", "p_privilege_renew_pending_dialog", new o6j0.C18854a[0]);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", str).appendQueryParameter("package", act.getPackageName()).build());
        if (act.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return;
        }
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m115359k(f30 f30Var, VEditText vEditText, final Dialog dialog) {
        zvf0.m220396r("e_download_data_submit_email_button", "p_download_data_submit_email_popup");
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call(vEditText.getText().toString().trim(), new d30() { // from class: l.q8n
                @Override // p149l.d30
                public final void call() {
                    dialog.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m115361m() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m115364p(Act act, dd80 dd80Var, View view) {
        o6j0.m162859c("e_privilege_activated_view_privilege_button", "p_privilege_activated", new o6j0.C18854a[0]);
        if (!(act instanceof VipAct)) {
            act.startActivity(VipAct.m56236a2(act));
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m115367s(dd80 dd80Var, View view) {
        o6j0.m162859c("e_privilege_activated_done_button", "p_privilege_activated", new o6j0.C18854a[0]);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m115371w(d30 d30Var) {
        o6j0.m162859c("e_vip_upgrade_popup_purchase_button", "p_vip_upgrade_popup", new o6j0.C18854a[0]);
        d30Var.call();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m115373y(Dialog dialog, View view, boolean z) {
        if (NullChecker.m81303a(dialog)) {
            dialog.getWindow().setSoftInputMode(5);
        }
    }

    /* JADX INFO: renamed from: z */
    public static Dialog m115374z(Act act, User user, final d30 d30Var) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_vip_upgrade_popup", OMSTemplateType.dialog);
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180351F).m20517M(f6c0.f95933od).m20558u0(act.string(R$string.f18838q)).m20543m0(act.string(R$string.f18491el)).m20564x0(act.getResources().getDrawable(x2c0.f190061d)).m20559v().m20496B(true).m20497B0(new DialogInterface.OnShowListener() { // from class: l.z8n
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.a9n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z();
        VText vText = (VText) dialogM20567z.m20458P().findViewById(u4c0.f174268ge);
        VDraweeView vDraweeView = (VDraweeView) dialogM20567z.m20458P().findViewById(u4c0.f174421pf);
        ((VImage) dialogM20567z.m20458P().findViewById(u4c0.f174438qf)).setImageResource(x2c0.f189341Fr);
        VText vText2 = (VText) dialogM20567z.m20458P().findViewById(u4c0.f174455rf);
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(String.format(act.string(R$string.f18033Pg), 3), vwb.m200324f0("3", act.string(R$string.f18676km)), Color.parseColor("#e1a11c"), Typeface.DEFAULT);
        vText.setText(String.format(act.string(R$string.f18063Qg), "3"));
        vText2.setText(spannableStringBuilderM133861b0);
        if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102331L0(vDraweeView, user.picture(0).url);
        }
        dialogM20567z.m20474o0(new Runnable() { // from class: l.b9n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m115371w(d30Var);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.c9n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m115361m();
            }
        });
        dialogM20567z.show();
        return dialogM20567z;
    }
}

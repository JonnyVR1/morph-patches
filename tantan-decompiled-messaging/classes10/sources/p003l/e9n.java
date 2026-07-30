package p003l;

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
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e51;
import l.f30;
import l.f6c0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.o7r;
import l.qib0;
import l.t100;
import l.u4c0;
import l.u4e;
import l.v7c0;
import l.vwb;
import l.x2c0;
import l.zvf0;
import v.VButton;
import v.VDraweeView;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class e9n extends s4e {
    /* JADX INFO: renamed from: A */
    public static void m6259A(final Act act, PurchaseType purchaseType, String str) {
        ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(f6c0.qf, (ViewGroup) null);
        View viewFindViewById = viewGroup.findViewById(u4c0.D5);
        ImageView imageView = (ImageView) viewGroup.findViewById(u4c0.u5);
        TextView textView = (TextView) viewGroup.findViewById(u4c0.ge);
        VButton vButtonFindViewById = viewGroup.findViewById(u4c0.d3);
        VButton vButtonFindViewById2 = viewGroup.findViewById(u4c0.gf);
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
        String str2 = purchaseType == purchaseType2 ? "vip" : "see";
        final cwf0 cwf0VarC = i0e.c("p_privilege_activated", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("productType", str2), vwb.Y("skuID", str)});
        final dd80 dd80VarR0 = act.newDialog().R(viewGroup).o0(new DialogInterface.OnShowListener() { // from class: l.d9n
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.n8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
        if (purchaseType == purchaseType2) {
            imageView.setImageDrawable(act.drawable(x2c0.Eu));
            textView.setText(R.string.Bs);
        } else {
            viewFindViewById.setVisibility(8);
            imageView.setImageResource(x2c0.bs);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int iD = t100.d(98.0f);
            layoutParams.height = iD;
            layoutParams.width = iD;
            textView.setText(R.string.As);
        }
        vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.o8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e9n.m6274s(dd80VarR0, view);
            }
        });
        vButtonFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.p8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e9n.m6271p(act, dd80VarR0, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static Dialog m6260B(Act act, String str, String str2, String str3, String str4, final f30<String, d30> f30Var) {
        final cwf0 cwf0VarC = i0e.c("p_download_data_submit_email_popup", "showEmailInputDlg");
        final Dialog dialogZ = act.dialog().G0(str).F(str2).M(f6c0.hd).u0(str3).m0(str4).B(true).q(false).V(new DialogInterface.OnDismissListener() { // from class: l.m8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z();
        final VEditText vEditTextFindViewById = dialogZ.P().findViewById(u4c0.p3);
        e51.G(new Runnable() { // from class: l.v8n
            @Override // java.lang.Runnable
            public final void run() {
                vEditTextFindViewById.requestFocus();
            }
        });
        vEditTextFindViewById.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.w8n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                e9n.m6280y(dialogZ, view, z);
            }
        });
        dialogZ.o0(new Runnable() { // from class: l.x8n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m6266k(f30Var, vEditTextFindViewById, dialogZ);
            }
        });
        dialogZ.m0(new Runnable() { // from class: l.y8n
            @Override // java.lang.Runnable
            public final void run() {
                dialogZ.dismiss();
            }
        });
        dialogZ.show();
        i0e.f(cwf0VarC);
        return dialogZ;
    }

    /* JADX INFO: renamed from: C */
    public static void m6261C(Act act, String str, String str2, String str3, Runnable runnable) {
        final cwf0 cwf0VarC = i0e.c("p_get_privilege_failed", "showGPRestoreDlg");
        cwf0VarC.o(u4e.b("passive", "alert", "alert_special", "purchase_button", "anywhere", "pay_fail"));
        dd80 dd80VarO = new dd80.a(act).S(x2c0.gt).y0(str).t0(str2).b0(str3).n0(new DialogInterface.OnDismissListener() { // from class: l.r8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).O();
        i0e.f(cwf0VarC);
        dd80VarO.W(runnable);
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: D */
    public static void m6262D(final Act act, final String str, String str2) {
        final cwf0 cwf0VarC = i0e.c("p_privilege_renew_pending_dialog", "showSubsErrorDlg");
        cwf0VarC.p(new j760[]{vwb.Y("dialog_show_from", str2)});
        i0e.f(cwf0VarC);
        View viewInflate = o7r.a(act).inflate(f6c0.We, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.P1);
        Dialog dialogZ = act.dialog().v().O(viewInflate).u0(act.string(R.string.w6)).m0(act.string(R.string.t6)).V(new DialogInterface.OnDismissListener() { // from class: l.s8n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z();
        textView.setText(i0g0.b0(act.string(R.string.u6), vwb.f0(new String[]{act.string(R.string.v6)}), Color.parseColor("#d84d37"), Typeface.DEFAULT));
        dialogZ.o0(new Runnable() { // from class: l.t8n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m6264i(str, act);
            }
        });
        dialogZ.m0(new Runnable() { // from class: l.u8n
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.m8403c("e_privilege_renew_giveup", "p_privilege_renew_pending_dialog", new o6j0.C3390a[0]);
            }
        });
        dialogZ.show();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6264i(String str, Act act) {
        o6j0.m8403c("e_privilege_renew_update", "p_privilege_renew_pending_dialog", new o6j0.C3390a[0]);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", str).appendQueryParameter(StickerPackage.TYPE, act.getPackageName()).build());
        if (act.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return;
        }
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6266k(f30 f30Var, VEditText vEditText, final Dialog dialog) {
        zvf0.r("e_download_data_submit_email_button", "p_download_data_submit_email_popup");
        if (NullChecker.a(f30Var)) {
            f30Var.call(vEditText.getText().toString().trim(), new d30() { // from class: l.q8n
                public final void call() {
                    dialog.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6268m() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6271p(Act act, dd80 dd80Var, View view) {
        o6j0.m8403c("e_privilege_activated_view_privilege_button", "p_privilege_activated", new o6j0.C3390a[0]);
        if (!(act instanceof VipAct)) {
            act.startActivity(VipAct.a2(act));
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6274s(dd80 dd80Var, View view) {
        o6j0.m8403c("e_privilege_activated_done_button", "p_privilege_activated", new o6j0.C3390a[0]);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m6278w(d30 d30Var) {
        o6j0.m8403c("e_vip_upgrade_popup_purchase_button", "p_vip_upgrade_popup", new o6j0.C3390a[0]);
        d30Var.call();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m6280y(Dialog dialog, View view, boolean z) {
        if (NullChecker.a(dialog)) {
            dialog.getWindow().setSoftInputMode(5);
        }
    }

    /* JADX INFO: renamed from: z */
    public static Dialog m6281z(Act act, User user, final d30 d30Var) {
        final cwf0 cwf0VarC = i0e.c("p_vip_upgrade_popup", "dialog");
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        Dialog dialogZ = act.dialog().L(v7c0.F).M(f6c0.od).u0(act.string(R.string.q)).m0(act.string(R.string.el)).x0(act.getResources().getDrawable(x2c0.d)).v().B(true).B0(new DialogInterface.OnShowListener() { // from class: l.z8n
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.a9n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z();
        VText vTextFindViewById = dialogZ.P().findViewById(u4c0.ge);
        VDraweeView vDraweeViewFindViewById = dialogZ.P().findViewById(u4c0.pf);
        dialogZ.P().findViewById(u4c0.qf).setImageResource(x2c0.Fr);
        VText vTextFindViewById2 = dialogZ.P().findViewById(u4c0.rf);
        SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0(String.format(act.string(R.string.Pg), 3), vwb.f0(new String[]{"3", act.string(R.string.km)}), Color.parseColor("#e1a11c"), Typeface.DEFAULT);
        vTextFindViewById.setText(String.format(act.string(R.string.Qg), "3"));
        vTextFindViewById2.setText(spannableStringBuilderB0);
        if (NullChecker.a(user)) {
            qib0.G.L0(vDraweeViewFindViewById, ((Media) user.picture(0)).url);
        }
        dialogZ.o0(new Runnable() { // from class: l.b9n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m6278w(d30Var);
            }
        });
        dialogZ.m0(new Runnable() { // from class: l.c9n
            @Override // java.lang.Runnable
            public final void run() {
                e9n.m6268m();
            }
        });
        dialogZ.show();
        return dialogZ;
    }
}

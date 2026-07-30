package p003l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.i0e;
import l.o7r;
import l.szd;
import l.t100;
import l.v7c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0016\u00104\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u00103¨\u00065"}, d2 = {"Ll/hcn;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "j", "()V", "i", "h", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VButton;", "c", "Lv/VButton;", "f", "()Lv/VButton;", "set_positive_primary", "(Lv/VButton;)V", "_positive_primary", "", "Ljava/lang/String;", "getDIALOG_P_ID", "()Ljava/lang/String;", "DIALOG_P_ID", "Ll/cwf0;", "Ll/cwf0;", "pageHelper", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class hcn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VButton _positive_primary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String DIALOG_P_ID;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final cwf0 pageHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Dialog dialog;

    public hcn(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.DIALOG_P_ID = "p_intl_band_phone_success_popup";
        cwf0 cwf0VarC = i0e.c("p_intl_band_phone_success_popup", hcn.class.getName());
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
    }

    /* JADX INFO: renamed from: a */
    public static void m6940a(hcn hcnVar, DialogInterface dialogInterface) {
        hcnVar.m6947h();
    }

    /* JADX INFO: renamed from: b */
    public static void m6941b(hcn hcnVar, View view) {
        szd szdVar = hcnVar.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m6942c(hcn hcnVar, View view) {
        szd szdVar = hcnVar.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m6943d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM7153b = icn.m7153b(this, inflater, parent);
        viewM7153b.getClass();
        return viewM7153b;
    }

    /* JADX INFO: renamed from: e */
    public final Dialog m6944e(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.o).P(rootView, false).C(t100.d(32.0f), 0, t100.d(32.0f), 0).B(true).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VButton m6945f() {
        VButton vButton = this._positive_primary;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_positive_primary");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m6946g() {
        xdl0.E0(m6945f(), new View.OnClickListener() { // from class: l.gcn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hcn.m6941b(this.f4610a, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m6947h() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.k();
            cwf0Var.j();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6948i() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.i();
            cwf0Var.l();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6949j() {
        LayoutInflater layoutInflaterA = o7r.a(this.act);
        layoutInflaterA.getClass();
        Dialog dialog = null;
        this.dialog = m6944e(this.act, m6943d(layoutInflaterA, null));
        xdl0.E0(m6945f(), new View.OnClickListener() { // from class: l.ecn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hcn.m6942c(this.f4290a, view);
            }
        });
        szd szdVar = this.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fcn
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hcn.m6940a(this.f4433a, dialogInterface);
            }
        });
        m6946g();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
        m6948i();
    }
}

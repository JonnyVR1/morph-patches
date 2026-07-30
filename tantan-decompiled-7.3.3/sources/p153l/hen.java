package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0016\u00104\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u00103¨\u00065"}, m88121d2 = {"Ll/hen;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "j", "()V", RXScreenCaptureService.KEY_INDEX, "h", "g", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VButton;", "c", "Lv/VButton;", "f", "()Lv/VButton;", "set_positive_primary", "(Lv/VButton;)V", "_positive_primary", "", "Ljava/lang/String;", "getDIALOG_P_ID", "()Ljava/lang/String;", "DIALOG_P_ID", "Ll/l4g0;", "Ll/l4g0;", "pageHelper", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hen {

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
    public final l4g0 pageHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Dialog dialog;

    public hen(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.DIALOG_P_ID = "p_intl_band_phone_success_popup";
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_band_phone_success_popup", hen.class.getName());
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
    }

    /* JADX INFO: renamed from: a */
    public static void m134657a(hen henVar, DialogInterface dialogInterface) {
        henVar.m134664h();
    }

    /* JADX INFO: renamed from: b */
    public static void m134658b(hen henVar, View view) {
        Dialog dialog = henVar.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m134659c(hen henVar, View view) {
        Dialog dialog = henVar.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m134660d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM139637b = ien.m139637b(this, inflater, parent);
        viewM139637b.getClass();
        return viewM139637b;
    }

    /* JADX INFO: renamed from: e */
    public final Dialog m134661e(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21497C(qa00.m175859d(32.0f), 0, qa00.m175859d(32.0f), 0).m21495B(true).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VButton m134662f() {
        VButton vButton = this._positive_primary;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_positive_primary");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m134663g() {
        bnl0.m105509E0(m134662f(), new View.OnClickListener() { // from class: l.gen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hen.m134658b(this.f103844a, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m134664h() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152775j();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m134665i() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            l4g0Var.m152777l();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m134666j() {
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(this.act);
        layoutInflaterM171370a.getClass();
        Dialog dialog = null;
        this.dialog = m134661e(this.act, m134660d(layoutInflaterM171370a, null));
        bnl0.m105509E0(m134662f(), new View.OnClickListener() { // from class: l.een
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hen.m134659c(this.f93652a, view);
            }
        });
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fen
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hen.m134657a(this.f98693a, dialogInterface);
            }
        });
        m134663g();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.show();
        m134665i();
    }
}

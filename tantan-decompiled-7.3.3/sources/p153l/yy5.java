package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.p058ui.constellationmatch.ConstellationInfoView;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/yy5;", "Ll/ya5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "e", "(Lcom/p1/mobile/putong/data/User;)V", "close", "()V", "Landroid/view/View;", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "c", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/l4g0;", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ll/l4g0;", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class yy5 implements ya5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Dialog dialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.yy5$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/yy5$a", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21721a extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_intl_horoscope_match_self_card";
        }
    }

    public yy5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.wy5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yy5.m217922a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static l4g0 m217922a() {
        return new l4g0(new C21721a());
    }

    /* JADX INFO: renamed from: b */
    public static void m217923b(yy5 yy5Var, DialogInterface dialogInterface) {
        w1e.m204401e(yy5Var.m217924d());
    }

    /* JADX INFO: renamed from: d */
    private final l4g0 m217924d() {
        return (l4g0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final Dialog m217925c(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21495B(true).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    @Override // p153l.ya5
    public void close() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m217926e(@NotNull User user) {
        user.getClass();
        Dialog dialog = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f126131x4, (ViewGroup) null);
        Act act = this.act;
        viewInflate.getClass();
        this.dialog = m217925c(act, viewInflate);
        if (viewInflate instanceof ConstellationInfoView) {
            ConstellationInfoView constellationInfoView = (ConstellationInfoView) viewInflate;
            constellationInfoView.setListener(this);
            constellationInfoView.m45960h0(this.act, user);
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.show();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xy5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yy5.m217923b(this.f196716a, dialogInterface);
            }
        });
        w1e.m204402f(m217924d());
    }
}

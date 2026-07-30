package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.p053ui.constellationmatch.ConstellationInfoView;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/tx5;", "Ll/x95;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "e", "(Lcom/p1/mobile/putong/data/User;)V", "close", "()V", "Landroid/view/View;", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "c", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "Ll/cwf0;", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class tx5 implements x95 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Dialog dialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.tx5$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/tx5$a", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20307a extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_intl_horoscope_match_self_card";
        }
    }

    public tx5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.rx5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tx5.m190943a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static cwf0 m190943a() {
        return new cwf0(new C20307a());
    }

    /* JADX INFO: renamed from: b */
    public static void m190944b(tx5 tx5Var, DialogInterface dialogInterface) {
        i0e.m133796e(tx5Var.m190945d());
    }

    /* JADX INFO: renamed from: d */
    private final cwf0 m190945d() {
        return (cwf0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final Dialog m190946c(Act act, View rootView) {
        Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180368o).m20520P(rootView, false).m20496B(true).m20567z();
        dialogM20567z.getClass();
        return dialogM20567z;
    }

    @Override // p149l.x95
    public void close() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m190947e(@NotNull User user) {
        user.getClass();
        Dialog dialog = null;
        View viewInflate = o7r.m163037a(this.act).inflate(f6c0.f96077x4, (ViewGroup) null);
        Act act = this.act;
        viewInflate.getClass();
        this.dialog = m190946c(act, viewInflate);
        if (viewInflate instanceof ConstellationInfoView) {
            ConstellationInfoView constellationInfoView = (ConstellationInfoView) viewInflate;
            constellationInfoView.setListener(this);
            constellationInfoView.m44777h0(this.act, user);
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            dialog2 = null;
        }
        dialog2.show();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            dialog = dialog3;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sx5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                tx5.m190944b(this.f166777a, dialogInterface);
            }
        });
        i0e.m133797f(m190945d());
    }
}

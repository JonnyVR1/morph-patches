package p003l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.constellationmatch.ConstellationInfoView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.User;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.er2;
import l.f6c0;
import l.i0e;
import l.o7r;
import l.szd;
import l.v7c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ll/tx5;", "Ll/x95;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "e", "(Lcom/p1/mobile/putong/data/User;)V", "close", "()V", "Landroid/view/View;", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "c", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "Ll/cwf0;", "Lkotlin/Lazy;", "d", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/tx5$a", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3436a extends er2 {
        public String pageId() {
            return "p_intl_horoscope_match_self_card";
        }
    }

    public tx5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.rx5
            public final Object invoke() {
                return tx5.m9628a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static cwf0 m9628a() {
        return new cwf0(new C3436a());
    }

    /* JADX INFO: renamed from: b */
    public static void m9629b(tx5 tx5Var, DialogInterface dialogInterface) {
        i0e.e(tx5Var.m9630d());
    }

    /* JADX INFO: renamed from: d */
    private final cwf0 m9630d() {
        return (cwf0) this.pageHelp.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final Dialog m9631c(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.o).P(rootView, false).B(true).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @Override // p003l.x95
    public void close() {
        szd szdVar = this.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m9632e(@NotNull User user) {
        user.getClass();
        szd szdVar = null;
        View viewInflate = o7r.a(this.act).inflate(f6c0.x4, (ViewGroup) null);
        Act act = this.act;
        viewInflate.getClass();
        this.dialog = m9631c(act, viewInflate);
        if (viewInflate instanceof ConstellationInfoView) {
            ConstellationInfoView constellationInfoView = (ConstellationInfoView) viewInflate;
            constellationInfoView.setListener(this);
            constellationInfoView.m2091h0(this.act, user);
        }
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        dialog.show();
        szd szdVar2 = this.dialog;
        if (szdVar2 == null) {
            Intrinsics.r("dialog");
        } else {
            szdVar = szdVar2;
        }
        szdVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sx5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                tx5.m9629b(this.f7477a, dialogInterface);
            }
        });
        i0e.f(m9630d());
    }
}

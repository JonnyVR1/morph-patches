package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.tarot.TarotInfoView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.TarotData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.o7r;
import l.szd;
import l.t100;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll/bdi0;", "Ll/w95;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "", "b", "(Lcom/p1/mobile/putong/core/data/TarotData;)V", "close", "()V", "Landroid/view/View;", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "a", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bdi0 implements w95 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Dialog dialog;

    public bdi0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public final Dialog m12599a(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.f24195o).P(rootView, false).C(t100.d(24.0f), 0, t100.d(24.0f), 0).B(true).z();
        dialogZ.getClass();
        return dialogZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m12600b(@NotNull TarotData tarotInfo) {
        tarotInfo.getClass();
        Dialog dialog = null;
        View viewInflate = o7r.a(this.act).inflate(f6c0.f11894N5, (ViewGroup) null);
        Act act = this.act;
        viewInflate.getClass();
        this.dialog = m12599a(act, viewInflate);
        if (viewInflate instanceof TarotInfoView) {
            TarotInfoView tarotInfoView = (TarotInfoView) viewInflate;
            tarotInfoView.setListener(this);
            tarotInfoView.m9275i0(this.act, tarotInfo);
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }

    @Override // p006l.w95
    public void close() {
        szd szdVar = this.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }
}

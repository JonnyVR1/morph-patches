package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.TarotData;
import com.p051p1.mobile.putong.core.p058ui.tarot.TarotInfoView;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/bmi0;", "Ll/xa5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "", "b", "(Lcom/p1/mobile/putong/core/data/TarotData;)V", "close", "()V", "Landroid/view/View;", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "a", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bmi0 implements xa5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Dialog dialog;

    public bmi0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public final Dialog m105061a(Act act, View rootView) {
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21519P(rootView, false).m21497C(qa00.m175859d(24.0f), 0, qa00.m175859d(24.0f), 0).m21495B(true).m21566z();
        dialogM21566z.getClass();
        return dialogM21566z;
    }

    /* JADX INFO: renamed from: b */
    public final void m105062b(@NotNull TarotData tarotInfo) {
        tarotInfo.getClass();
        Dialog dialog = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f125550O5, (ViewGroup) null);
        Act act = this.act;
        viewInflate.getClass();
        this.dialog = m105061a(act, viewInflate);
        if (viewInflate instanceof TarotInfoView) {
            TarotInfoView tarotInfoView = (TarotInfoView) viewInflate;
            tarotInfoView.setListener(this);
            tarotInfoView.m57060i0(this.act, tarotInfo);
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }

    @Override // p153l.xa5
    public void close() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            dialog = null;
        }
        dialog.dismiss();
    }
}

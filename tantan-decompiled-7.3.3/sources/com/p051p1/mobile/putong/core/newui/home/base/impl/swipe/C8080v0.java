package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.dbc0;
import p153l.i6e;
import p153l.l4g0;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.v0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8080v0 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        NewMainAct newMainActAct = aVar.f22837b.act();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatar_verification_succeed_swipe_page", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe"));
        w1e.m204402f(l4g0VarM204399c);
        CoreDlg.m46167F1(newMainActAct, newMainActAct.string(R$string.f19629rs), newMainActAct.string(R$string.f19598qs), dbc0.f87222mk, newMainActAct.string(R$string.f18894Tr), new x20() { // from class: l.blh0
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20294B0.f20489U.put(Boolean.FALSE);
            }
        }, false, null, null, new x20() { // from class: l.clh0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }, null, false, false, null, null);
        aVar.f22836a.m101938P8(aVar.f22841f, "successPicAuth");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            return CoreModule.f18264c.f20294B0.f20489U.get().booleanValue();
        }
        return false;
    }
}

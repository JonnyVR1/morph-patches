package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8082w0;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.dbc0;
import p153l.hxf;
import p153l.i4g0;
import p153l.i6e;
import p153l.l4g0;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.w0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8082w0 extends AbstractC8022a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38793p(Act act) {
        i4g0.m138520r("e_avatarVerification_reverify_confirm_re_click", "p_avatarVerification_fail_popup");
        hxf.m137593n();
        hxf.m137587h(act, OMSTemplateType.dialog);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38794q(Act act) {
        i4g0.m138520r("e_avatarVerification_change_avatar", "p_avatarVerification_fail_popup");
        act.startActivity(ProfileAct.m51922q2(act, CoreModule.m30929H().userId(), "", false, true));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        final NewMainAct newMainActAct = aVar.f22837b.act();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_fail_popup", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe"));
        w1e.m204402f(l4g0VarM204399c);
        CoreDlg.m46167F1(newMainActAct, newMainActAct.string(R$string.f19044Yr), newMainActAct.string(R$string.f19014Xr), dbc0.f87156kk, newMainActAct.string(R$string.f18984Wr), new x20() { // from class: l.dlh0
            @Override // p153l.x20
            public final void call() {
                C8082w0.m38793p(newMainActAct);
            }
        }, true, newMainActAct.string(R$string.f18954Vr), new x20() { // from class: l.elh0
            @Override // p153l.x20
            public final void call() {
                C8082w0.m38794q(newMainActAct);
            }
        }, new x20() { // from class: l.flh0
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20294B0.f20490V.put(Boolean.FALSE);
            }
        }, null, false, true, null, new x20() { // from class: l.glh0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        aVar.f22836a.m101938P8(aVar.f22841f, "failPicReject");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "rejected")) {
            return CoreModule.f18264c.f20294B0.f20490V.get().booleanValue();
        }
        return false;
    }
}

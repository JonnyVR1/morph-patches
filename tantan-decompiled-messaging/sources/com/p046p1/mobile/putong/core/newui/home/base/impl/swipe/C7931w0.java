package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7931w0;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p149l.cwf0;
import p149l.d30;
import p149l.i0e;
import p149l.tvf;
import p149l.u4e;
import p149l.x2c0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.w0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7931w0 extends AbstractC7871a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37790p(Act act) {
        zvf0.m220396r("e_avatarVerification_reverify_confirm_re_click", "p_avatarVerification_fail_popup");
        tvf.m190736n();
        tvf.m190730h(act, OMSTemplateType.dialog);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37791q(Act act) {
        zvf0.m220396r("e_avatarVerification_change_avatar", "p_avatarVerification_fail_popup");
        act.startActivity(ProfileAct.m50738p2(act, CoreModule.m29931H().userId(), "", false, true));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        final NewMainAct newMainActAct = aVar.f22095b.act();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_fail_popup", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe"));
        i0e.m133797f(cwf0VarM133794c);
        CoreDlg.m44984F1(newMainActAct, newMainActAct.string(R$string.f17654Cr), newMainActAct.string(R$string.f17624Br), x2c0.f190686wj, newMainActAct.string(R$string.f17594Ar), new d30() { // from class: l.vch0
            @Override // p149l.d30
            public final void call() {
                C7931w0.m37790p(newMainActAct);
            }
        }, true, newMainActAct.string(R$string.f19136zr), new d30() { // from class: l.wch0
            @Override // p149l.d30
            public final void call() {
                C7931w0.m37791q(newMainActAct);
            }
        }, new d30() { // from class: l.xch0
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19552B0.f19748V.put(Boolean.FALSE);
            }
        }, null, false, true, null, new d30() { // from class: l.ych0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        aVar.f22094a.m161144P8(aVar.f22099f, "failPicReject");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "rejected")) {
            return CoreModule.f17545c.f19552B0.f19748V.get().booleanValue();
        }
        return false;
    }
}

package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0095w0;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.tvf;
import l.x2c0;
import l.zvf0;
import p009l.i0e;
import p009l.u4e;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.w0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0095w0 extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1761p(Act act) {
        zvf0.r("e_avatarVerification_reverify_confirm_re_click", "p_avatarVerification_fail_popup");
        tvf.n();
        tvf.h(act, "dialog");
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1762q(Act act) {
        zvf0.r("e_avatarVerification_change_avatar", "p_avatarVerification_fail_popup");
        act.startActivity(ProfileAct.p2(act, CoreModule.H().userId(), "", false, true));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        final NewMainAct newMainActAct = aVar.f873b.act();
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_avatarVerification_fail_popup", Dialog.class.getName());
        cwf0VarM16062c.o(u4e.m22745b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe"));
        i0e.m16065f(cwf0VarM16062c);
        CoreDlg.F1(newMainActAct, newMainActAct.string(R.string.Cr), newMainActAct.string(R.string.Br), x2c0.wj, newMainActAct.string(R.string.Ar), new d30() { // from class: l.vch0
            public final void call() {
                C0095w0.m1761p(newMainActAct);
            }
        }, true, newMainActAct.string(R.string.zr), new d30() { // from class: l.wch0
            public final void call() {
                C0095w0.m1762q(newMainActAct);
            }
        }, new d30() { // from class: l.xch0
            public final void call() {
                CoreModule.c.B0.V.put(Boolean.FALSE);
            }
        }, (User) null, false, true, (String) null, new d30() { // from class: l.ych0
            public final void call() {
                i0e.m16064e(cwf0VarM16062c);
            }
        });
        aVar.f872a.m19348P8(aVar.f877f, "failPicReject");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "rejected")) {
            return ((Boolean) CoreModule.c.B0.V.get()).booleanValue();
        }
        return false;
    }
}

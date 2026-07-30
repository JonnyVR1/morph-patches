package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.x2c0;
import p009l.i0e;
import p009l.u4e;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.v0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0093v0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        NewMainAct newMainActAct = aVar.f873b.act();
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_avatar_verification_succeed_swipe_page", Dialog.class.getName());
        cwf0VarM16062c.o(u4e.m22745b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe"));
        i0e.m16065f(cwf0VarM16062c);
        CoreDlg.F1(newMainActAct, newMainActAct.string(R.string.Vr), newMainActAct.string(R.string.Ur), x2c0.yj, newMainActAct.string(R.string.xr), new d30() { // from class: l.tch0
            public final void call() {
                CoreModule.c.B0.U.put(Boolean.FALSE);
            }
        }, false, (String) null, (d30) null, new d30() { // from class: l.uch0
            public final void call() {
                i0e.m16064e(cwf0VarM16062c);
            }
        }, (User) null, false, false, (String) null, (d30) null);
        aVar.f872a.m19348P8(aVar.f877f, "successPicAuth");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            return ((Boolean) CoreModule.c.B0.U.get()).booleanValue();
        }
        return false;
    }
}

package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p149l.cwf0;
import p149l.d30;
import p149l.i0e;
import p149l.u4e;
import p149l.x2c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.v0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7929v0 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        NewMainAct newMainActAct = aVar.f22095b.act();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatar_verification_succeed_swipe_page", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe"));
        i0e.m133797f(cwf0VarM133794c);
        CoreDlg.m44984F1(newMainActAct, newMainActAct.string(R$string.f18224Vr), newMainActAct.string(R$string.f18194Ur), x2c0.f190750yj, newMainActAct.string(R$string.f19076xr), new d30() { // from class: l.tch0
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19552B0.f19747U.put(Boolean.FALSE);
            }
        }, false, null, null, new d30() { // from class: l.uch0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }, null, false, false, null, null);
        aVar.f22094a.m161144P8(aVar.f22099f, "successPicAuth");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            return CoreModule.f17545c.f19552B0.f19747U.get().booleanValue();
        }
        return false;
    }
}

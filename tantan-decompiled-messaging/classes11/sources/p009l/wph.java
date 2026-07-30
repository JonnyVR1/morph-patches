package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wph extends pph {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(qph.C1150a c1150a) {
        CoreModule.K().startJailedDialogLikeAct();
        c1150a.f19431g.mo7345k2(c1150a.f19430f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        return CoreModule.c.e0.p9().isJailed();
    }
}

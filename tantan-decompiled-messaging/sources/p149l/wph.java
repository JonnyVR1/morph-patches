package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class wph extends pph {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(qph.C19553a c19553a) {
        CoreModule.m29932K().startJailedDialogLikeAct();
        c19553a.f155763g.mo43130k2(c19553a.f155762f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(qph.C19553a c19553a) {
        return CoreModule.f17545c.f19639e0.m169527p9().isJailed();
    }
}

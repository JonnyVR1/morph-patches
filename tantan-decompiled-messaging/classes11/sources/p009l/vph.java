package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.ew40;
import l.n3b0;
import l.ok3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vph extends pph {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final qph.C1150a c1150a) {
        CoreModule.c.m0.u0.put(Boolean.TRUE);
        ok3.G(c1150a.f19425a, true, c1150a.f19427c.name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(c1150a.f19427c.gender, "male"), new Runnable() { // from class: l.tph
            @Override // java.lang.Runnable
            public final void run() {
                c1150a.f19431g.mo7333A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.uph
            @Override // java.lang.Runnable
            public final void run() {
                c1150a.f19431g.mo7346y();
            }
        });
        c1150a.f19431g.mo7345k2(c1150a.f19430f, "failFirstSwipe");
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        return (c1150a.f19428d != SwipeDirection.UP || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || n3b0.t() || ew40.j()) ? false : true;
    }
}

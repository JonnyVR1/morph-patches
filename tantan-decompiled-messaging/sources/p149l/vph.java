package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class vph extends pph {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final qph.C19553a c19553a) {
        CoreModule.f17545c.f19663m0.f19454u0.put(Boolean.TRUE);
        ok3.m164808G(c19553a.f155757a, true, c19553a.f155759c.name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(c19553a.f155759c.gender, "male"), new Runnable() { // from class: l.tph
            @Override // java.lang.Runnable
            public final void run() {
                c19553a.f155763g.mo43121A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.uph
            @Override // java.lang.Runnable
            public final void run() {
                c19553a.f155763g.mo43131y();
            }
        });
        c19553a.f155763g.mo43130k2(c19553a.f155762f, "failFirstSwipe");
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(qph.C19553a c19553a) {
        return (c19553a.f155760d != SwipeDirection.UP || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || n3b0.m157745t() || ew40.m118398j()) ? false : true;
    }
}

package p009l;

import com.p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uof extends kof {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(lof.C1021a c1021a) {
        if (c1021a.f16281h || !c1021a.m17971a()) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        snf.m22306M(c1021a.f16274a, c1021a.f16280g, c1021a.f16277d, true);
        c1021a.f16284k.mo279M3(c1021a.m17971a(), "no_condition_to_rightswipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(lof.C1021a c1021a) {
        return !c1021a.f16281h && c1021a.m17971a();
    }
}

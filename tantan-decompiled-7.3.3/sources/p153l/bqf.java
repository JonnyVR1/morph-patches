package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class bqf extends rpf {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(spf.C20128a c20128a) {
        if (c20128a.f170046h || !c20128a.m187342a()) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        zof.m220753M(c20128a.f170039a, c20128a.f170045g, c20128a.f170042d, true);
        c20128a.f170049k.mo37357M3(c20128a.m187342a(), "no_condition_to_rightswipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(spf.C20128a c20128a) {
        return !c20128a.f170046h && c20128a.m187342a();
    }
}

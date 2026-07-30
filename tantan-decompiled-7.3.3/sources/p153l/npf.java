package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class npf extends rpf {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(spf.C20128a c20128a) {
        o1j0.m165651y("此主题卡片今日滑动次数已用尽，去探索其他主题吧~");
        c20128a.f170049k.mo37357M3(c20128a.m187342a(), "tantanx_scene_noswipe_num");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(spf.C20128a c20128a) {
        return c20128a.f170043e;
    }
}

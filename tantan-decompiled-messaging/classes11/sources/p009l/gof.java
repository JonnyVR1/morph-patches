package p009l;

import com.p1.mobile.putong.core.card.VSwipeStack;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gof extends kof {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(lof.C1021a c1021a) {
        lsi0.y("此主题卡片今日滑动次数已用尽，去探索其他主题吧~");
        c1021a.f16284k.mo279M3(c1021a.m17971a(), "tantanx_scene_noswipe_num");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(lof.C1021a c1021a) {
        return c1021a.f16278e;
    }
}

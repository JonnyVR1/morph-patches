package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class gof extends kof {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(lof.C18270a c18270a) {
        lsi0.m151595y("此主题卡片今日滑动次数已用尽，去探索其他主题吧~");
        c18270a.f129101k.mo36354M3(c18270a.m150772a(), "tantanx_scene_noswipe_num");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(lof.C18270a c18270a) {
        return c18270a.f129095e;
    }
}

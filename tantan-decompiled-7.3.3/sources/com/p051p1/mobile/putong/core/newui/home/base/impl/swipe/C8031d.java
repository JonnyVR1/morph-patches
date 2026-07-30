package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.net.Uri;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import p153l.al80;
import p153l.cl80;
import p153l.l8l;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d */
/* JADX INFO: loaded from: classes11.dex */
public class C8031d extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!CoreModule.f18264c.f20381e0.f89195b5.get().booleanValue() && CoreModule.f18264c.f20404l2.f81482T >= 3) {
            final NewMainAct newMainActAct = aVar.f22837b.act();
            if (NullChecker.m82486a(newMainActAct)) {
                l8l l8lVarM153279k = new l8l.C18366c(newMainActAct).m153287s("要不要找人陪你打游戏？").m153286r("游戏搭子都在这儿").m153282n("去看看").m153281m("#6E66FF").m153284p("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZKWVdYSktTUEdJWUUyVVFVQkNYNk1NWDdQWUJRQzE0IiwidyI6NDIwLCJoIjo0MjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MzQ1MTY1ODQ3ODUwNTg4NDE5fQ.webp").m153280l(new Runnable() { // from class: l.zjj
                    @Override // java.lang.Runnable
                    public final void run() {
                        nae0.m162083m(newMainActAct, Uri.parse("tantan://moment/p_game_cp?mid=0"));
                    }
                }).m153279k();
                if (C4522a.m22099p().m22107I()) {
                    C4522a.m22099p().m22102C(CorePopLevel.GAME_CP, newMainActAct, l8lVarM153279k, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    cl80.m110426e().m110439q(al80.m98641a(l8lVarM153279k));
                }
                aVar.f22842g = true;
                CoreModule.f18264c.f20381e0.f89195b5.put(Boolean.TRUE);
            }
        }
        return false;
    }
}

package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.net.Uri;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import p149l.uc80;
import p149l.v5l;
import p149l.wc80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d */
/* JADX INFO: loaded from: classes11.dex */
public class C7880d extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!CoreModule.f17545c.f19639e0.f149338b5.get().booleanValue() && CoreModule.f17545c.f19662l2.f197523T >= 3) {
            final NewMainAct newMainActAct = aVar.f22095b.act();
            if (NullChecker.m81303a(newMainActAct)) {
                v5l v5lVarM197142k = new v5l.C20583c(newMainActAct).m197150s("要不要找人陪你打游戏？").m197149r("游戏搭子都在这儿").m197145n("去看看").m197144m("#6E66FF").m197147p("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZKWVdYSktTUEdJWUUyVVFVQkNYNk1NWDdQWUJRQzE0IiwidyI6NDIwLCJoIjo0MjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MzQ1MTY1ODQ3ODUwNTg4NDE5fQ.webp").m197143l(new Runnable() { // from class: l.fhj
                    @Override // java.lang.Runnable
                    public final void run() {
                        j2e0.m139446m(newMainActAct, Uri.parse("tantan://moment/p_game_cp?mid=0"));
                    }
                }).m197142k();
                if (C4371a.m21100p().m21108I()) {
                    C4371a.m21100p().m21103C(CorePopLevel.GAME_CP, newMainActAct, v5lVarM197142k, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    wc80.m202636e().m202649q(uc80.m192995a(v5lVarM197142k));
                }
                aVar.f22100g = true;
                CoreModule.f17545c.f19639e0.f149338b5.put(Boolean.TRUE);
            }
        }
        return false;
    }
}

package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.net.Uri;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import l.j2e0;
import l.uc80;
import l.v5l;
import l.wc80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0044d extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!((Boolean) CoreModule.c.e0.b5.get()).booleanValue() && CoreModule.c.l2.T >= 3) {
            final NewMainAct newMainActAct = aVar.f873b.act();
            if (NullChecker.a(newMainActAct)) {
                v5l v5lVarK = new v5l.c(newMainActAct).s("要不要找人陪你打游戏？").r("游戏搭子都在这儿").n("去看看").m("#6E66FF").p("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlZKWVdYSktTUEdJWUUyVVFVQkNYNk1NWDdQWUJRQzE0IiwidyI6NDIwLCJoIjo0MjEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MzQ1MTY1ODQ3ODUwNTg4NDE5fQ.webp").l(new Runnable() { // from class: l.fhj
                    @Override // java.lang.Runnable
                    public final void run() {
                        j2e0.m(newMainActAct, Uri.parse("tantan://moment/p_game_cp?mid=0"));
                    }
                }).k();
                if (a.p().I()) {
                    a.p().C(CorePopLevel.GAME_CP, newMainActAct, v5lVarK, 20000);
                } else {
                    wc80.e().q(uc80.a(v5lVarK));
                }
                aVar.f878g = true;
                CoreModule.c.e0.b5.put(Boolean.TRUE);
            }
        }
        return false;
    }
}

package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import l.uc80;
import l.v5l;
import l.wc80;
import l.yd7;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0041c extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (mqi0.m18550o() < ((Long) CoreModule.c.e0.C4.get()).longValue() || ((Boolean) CoreModule.c.e0.D4.get()).booleanValue()) {
            return false;
        }
        yd7 yd7Var = CoreModule.c.l2;
        boolean z = yd7Var.T >= 5;
        boolean z2 = yd7Var.a3(mqi0.m18550o()) >= 5000;
        if (z || z2) {
            final NewMainAct newMainActAct = aVar.f873b.act();
            if (NullChecker.a(newMainActAct)) {
                v5l v5lVarK = new v5l.c(newMainActAct).s("好友默契大测试").r("让朋友猜猜哪些会是你喜欢的人").n("去看看").p("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkNCWTRSNFBYSDM3WEIyTURHQUc3RFpRVU9DM0w1SzE0IiwidyI6NTY1LCJoIjo2MzcsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM1NDA0Nzk1NjAzOTAyMTk0NH0.webp").m("FFFE7E1D").l(new Runnable() { // from class: l.m7j
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act = newMainActAct;
                        act.startActivity(MkWebViewAct.m10585c2(act, "", (juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/friendship-test/index.html?speed=true&_bid=1004496&hideNavigationBar=1&hideNotch=1&pageFrom=introduce_card"), true, true, null));
                    }
                }).q("p_friendship_test_popup").o("e_friendship_test_popup_enter").k();
                if (a.p().I()) {
                    a.p().C(CorePopLevel.FRIEND_TACIT, newMainActAct, v5lVarK, 20000);
                } else {
                    wc80.e().q(uc80.a(v5lVarK));
                }
                aVar.f878g = true;
                CoreModule.c.e0.C4.put(Long.valueOf(mqi0.m18550o() + 86400000));
                CoreModule.c.e0.D4.put(Boolean.TRUE);
            }
        }
        return false;
    }
}

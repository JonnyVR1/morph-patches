package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.mqi0;
import p149l.uc80;
import p149l.v5l;
import p149l.wc80;
import p149l.yd7;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c */
/* JADX INFO: loaded from: classes11.dex */
public class C7877c extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (mqi0.m155944o() < CoreModule.f17545c.f19639e0.f149152C4.get().longValue() || CoreModule.f17545c.f19639e0.f149159D4.get().booleanValue()) {
            return false;
        }
        yd7 yd7Var = CoreModule.f17545c.f19662l2;
        boolean z = yd7Var.f197523T >= 5;
        boolean z2 = yd7Var.m214215a3(mqi0.m155944o()) >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        if (z || z2) {
            final NewMainAct newMainActAct = aVar.f22095b.act();
            if (NullChecker.m81303a(newMainActAct)) {
                v5l v5lVarM197142k = new v5l.C20583c(newMainActAct).m197150s("好友默契大测试").m197149r("让朋友猜猜哪些会是你喜欢的人").m197145n("去看看").m197147p("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkNCWTRSNFBYSDM3WEIyTURHQUc3RFpRVU9DM0w1SzE0IiwidyI6NTY1LCJoIjo2MzcsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM1NDA0Nzk1NjAzOTAyMTk0NH0.webp").m197144m("FFFE7E1D").m197143l(new Runnable() { // from class: l.m7j
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act = newMainActAct;
                        act.startActivity(MkWebViewAct.m80238c2(act, "", (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/friendship-test/index.html?speed=true&_bid=1004496&hideNavigationBar=1&hideNotch=1&pageFrom=introduce_card"), true, true, null));
                    }
                }).m197148q("p_friendship_test_popup").m197146o("e_friendship_test_popup_enter").m197142k();
                if (C4371a.m21100p().m21108I()) {
                    C4371a.m21100p().m21103C(CorePopLevel.FRIEND_TACIT, newMainActAct, v5lVarM197142k, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    wc80.m202636e().m202649q(uc80.m192995a(v5lVarM197142k));
                }
                aVar.f22100g = true;
                CoreModule.f17545c.f19639e0.f149152C4.put(Long.valueOf(mqi0.m155944o() + 86400000));
                CoreModule.f17545c.f19639e0.f149159D4.put(Boolean.TRUE);
            }
        }
        return false;
    }
}

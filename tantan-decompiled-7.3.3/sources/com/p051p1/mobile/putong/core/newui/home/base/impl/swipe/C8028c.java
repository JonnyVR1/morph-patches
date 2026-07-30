package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.al80;
import p153l.cf7;
import p153l.cl80;
import p153l.l8l;
import p153l.pzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c */
/* JADX INFO: loaded from: classes11.dex */
public class C8028c extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (pzi0.m174454o() < CoreModule.f18264c.f20381e0.f89009C4.get().longValue() || CoreModule.f18264c.f20381e0.f89016D4.get().booleanValue()) {
            return false;
        }
        cf7 cf7Var = CoreModule.f18264c.f20404l2;
        boolean z = cf7Var.f81482T >= 5;
        boolean z2 = cf7Var.m109523a3(pzi0.m174454o()) >= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        if (z || z2) {
            final NewMainAct newMainActAct = aVar.f22837b.act();
            if (NullChecker.m82486a(newMainActAct)) {
                l8l l8lVarM153279k = new l8l.C18366c(newMainActAct).m153287s("好友默契大测试").m153286r("让朋友猜猜哪些会是你喜欢的人").m153282n("去看看").m153284p("https://fe-static.tancdn.com/v1/images/eyJpZCI6IkNCWTRSNFBYSDM3WEIyTURHQUc3RFpRVU9DM0w1SzE0IiwidyI6NTY1LCJoIjo2MzcsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM1NDA0Nzk1NjAzOTAyMTk0NH0.webp").m153281m("FFFE7E1D").m153280l(new Runnable() { // from class: l.gaj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act = newMainActAct;
                        act.startActivity(MkWebViewAct.m81421d2(act, "", (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/friendship-test/index.html?speed=true&_bid=1004496&hideNavigationBar=1&hideNotch=1&pageFrom=introduce_card"), true, true, null));
                    }
                }).m153285q("p_friendship_test_popup").m153283o("e_friendship_test_popup_enter").m153279k();
                if (C4522a.m22099p().m22107I()) {
                    C4522a.m22099p().m22102C(CorePopLevel.FRIEND_TACIT, newMainActAct, l8lVarM153279k, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    cl80.m110426e().m110439q(al80.m98641a(l8lVarM153279k));
                }
                aVar.f22842g = true;
                CoreModule.f18264c.f20381e0.f89009C4.put(Long.valueOf(pzi0.m174454o() + 86400000));
                CoreModule.f18264c.f20381e0.f89016D4.put(Boolean.TRUE);
            }
        }
        return false;
    }
}

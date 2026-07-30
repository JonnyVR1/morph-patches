package p153l;

import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;

/* JADX INFO: loaded from: classes9.dex */
public class t2u {
    /* JADX INFO: renamed from: a */
    public static void m189000a(w2u<x2u> w2uVar, x2u x2uVar, Act act) {
        w2uVar.m153103z2(new vys(w2uVar, w2uVar.m160239H2(), x2uVar.f192194l));
        nus nusVarM160239H2 = w2uVar.m160239H2();
        NoSaveStateViewPager noSaveStateViewPager = x2uVar.f192186d;
        TabLayout tabLayout = x2uVar.f192191i;
        ToolBarSkinView toolBarSkinView = x2uVar.f192187e;
        LiveSquareTopButtonLiveView liveSquareTopButtonLiveView = x2uVar.f192192j.f45885d;
        w2uVar.m153103z2(new dxs(w2uVar, nusVarM160239H2, noSaveStateViewPager, tabLayout, toolBarSkinView, liveSquareTopButtonLiveView.f45879a, liveSquareTopButtonLiveView.f45880b));
        w2uVar.m153103z2(new urr(w2uVar, w2uVar.m160239H2(), x2uVar.f192184b));
        w2uVar.m153103z2(new bys(w2uVar, w2uVar.m160239H2()));
        if (act instanceof PutongAct) {
            w2uVar.m153103z2(new o0g0(w2uVar, w2uVar.m160239H2(), new s0g0(x2uVar.f192191i, x2uVar.f192185c, x2uVar.f192187e, x2uVar.f192186d, x2uVar.f192188f, act)));
        }
        w2uVar.m153103z2(new gbu(w2uVar, w2uVar.m160239H2()));
        w2uVar.m153103z2(new q40(w2uVar, w2uVar.m160239H2()));
        w2uVar.m153103z2(new r6u(w2uVar, w2uVar.m160239H2(), x2uVar.f192192j));
    }
}

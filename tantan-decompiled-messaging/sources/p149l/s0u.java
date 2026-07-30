package p149l;

import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class s0u {
    /* JADX INFO: renamed from: a */
    public static void m181891a(v0u<w0u> v0uVar, w0u w0uVar, Act act) {
        v0uVar.m144512z2(new uws(v0uVar, v0uVar.m151643H2(), w0uVar.f183950l));
        mss mssVarM151643H2 = v0uVar.m151643H2();
        NoSaveStateViewPager noSaveStateViewPager = w0uVar.f183942d;
        TabLayout tabLayout = w0uVar.f183947i;
        ToolBarSkinView toolBarSkinView = w0uVar.f183943e;
        LiveSquareTopButtonLiveView liveSquareTopButtonLiveView = w0uVar.f183948j.f45037d;
        v0uVar.m144512z2(new cvs(v0uVar, mssVarM151643H2, noSaveStateViewPager, tabLayout, toolBarSkinView, liveSquareTopButtonLiveView.f45031a, liveSquareTopButtonLiveView.f45032b));
        v0uVar.m144512z2(new tpr(v0uVar, v0uVar.m151643H2(), w0uVar.f183940b));
        v0uVar.m144512z2(new aws(v0uVar, v0uVar.m151643H2()));
        if (act instanceof PutongAct) {
            v0uVar.m144512z2(new fsf0(v0uVar, v0uVar.m151643H2(), new jsf0(w0uVar.f183947i, w0uVar.f183941c, w0uVar.f183943e, w0uVar.f183942d, w0uVar.f183944f, act)));
        }
        v0uVar.m144512z2(new f9u(v0uVar, v0uVar.m151643H2()));
        v0uVar.m144512z2(new w40(v0uVar, v0uVar.m151643H2()));
        v0uVar.m144512z2(new q4u(v0uVar, v0uVar.m151643H2(), w0uVar.f183948j));
    }
}

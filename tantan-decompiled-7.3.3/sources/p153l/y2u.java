package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class y2u {
    /* JADX INFO: renamed from: a */
    public static void m214104a(x2u x2uVar, View view) {
        x2uVar.f192183a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        x2uVar.f192184b = (VFrame) viewGroup.getChildAt(0);
        x2uVar.f192185c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        x2uVar.f192186d = (NoSaveStateViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        x2uVar.f192187e = (ToolBarSkinView) viewGroup.getChildAt(1);
        x2uVar.f192188f = (AnimEffectPlayer) viewGroup.getChildAt(2);
        x2uVar.f192189g = (VFrame) viewGroup.getChildAt(3);
        x2uVar.f192190h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        x2uVar.f192191i = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        x2uVar.f192192j = (LiveSquareTopButtonViewModel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        x2uVar.f192193k = viewGroup.getChildAt(4);
        x2uVar.f192194l = (LiveTeenModeViewModel) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m214105b(x2u x2uVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193800M0, viewGroup, false);
        m214104a(x2uVar, viewInflate);
        return viewInflate;
    }
}

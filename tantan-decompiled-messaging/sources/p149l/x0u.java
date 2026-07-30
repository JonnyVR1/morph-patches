package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class x0u {
    /* JADX INFO: renamed from: a */
    public static void m206649a(w0u w0uVar, View view) {
        w0uVar.f183939a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w0uVar.f183940b = (VFrame) viewGroup.getChildAt(0);
        w0uVar.f183941c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        w0uVar.f183942d = (NoSaveStateViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        w0uVar.f183943e = (ToolBarSkinView) viewGroup.getChildAt(1);
        w0uVar.f183944f = (AnimEffectPlayer) viewGroup.getChildAt(2);
        w0uVar.f183945g = (VFrame) viewGroup.getChildAt(3);
        w0uVar.f183946h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        w0uVar.f183947i = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        w0uVar.f183948j = (LiveSquareTopButtonViewModel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        w0uVar.f183949k = viewGroup.getChildAt(4);
        w0uVar.f183950l = (LiveTeenModeViewModel) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m206650b(w0u w0uVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162686M0, viewGroup, false);
        m206649a(w0uVar, viewInflate);
        return viewInflate;
    }
}

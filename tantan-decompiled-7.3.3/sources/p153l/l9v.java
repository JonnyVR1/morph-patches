package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VPullDownRefreshLayout;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class l9v {
    /* JADX INFO: renamed from: a */
    public static void m153461a(k9v k9vVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k9vVar.f124578a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        k9vVar.f124579b = (FrameLayout) viewGroup.getChildAt(1);
        k9vVar.f124580c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        k9vVar.f124581d = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        k9vVar.f124582e = (AppBarLayout) view.findViewById(ldc0.f131476K1);
        k9vVar.f124583f = (LiveVoiceInternalHeaderView) view.findViewById(ldc0.f131582o0);
        k9vVar.f124584g = (TabLayout) view.findViewById(ldc0.f131480L1);
        k9vVar.f124585h = (NoSaveStateViewPager) view.findViewById(ldc0.f131612v2);
    }

    /* JADX INFO: renamed from: b */
    public static View m153462b(k9v k9vVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193864f2, viewGroup, false);
        m153461a(k9vVar, viewInflate);
        return viewInflate;
    }
}

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
public class m9v {
    /* JADX INFO: renamed from: a */
    public static void m157597a(i9v i9vVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i9vVar.f113509a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        i9vVar.f113510b = (FrameLayout) viewGroup.getChildAt(1);
        i9vVar.f113511c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        i9vVar.f113512d = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        i9vVar.f113513e = (AppBarLayout) view.findViewById(ldc0.f131476K1);
        i9vVar.f113514f = (LiveVoiceInternalHeaderView) view.findViewById(ldc0.f131582o0);
        i9vVar.f113515g = (TabLayout) view.findViewById(ldc0.f131480L1);
        i9vVar.f113516h = (NoSaveStateViewPager) view.findViewById(ldc0.f131612v2);
    }

    /* JADX INFO: renamed from: b */
    public static View m157598b(i9v i9vVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193856d2, viewGroup, false);
        m157597a(i9vVar, viewInflate);
        return viewInflate;
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VPullDownRefreshLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class l7v {
    /* JADX INFO: renamed from: a */
    public static void m148825a(h7v h7vVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        h7vVar.f106340a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        h7vVar.f106341b = (FrameLayout) viewGroup.getChildAt(1);
        h7vVar.f106342c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        h7vVar.f106343d = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h7vVar.f106344e = (AppBarLayout) view.findViewById(f5c0.f95019K1);
        h7vVar.f106345f = (LiveVoiceInternalHeaderView) view.findViewById(f5c0.f95125o0);
        h7vVar.f106346g = (TabLayout) view.findViewById(f5c0.f95023L1);
        h7vVar.f106347h = (NoSaveStateViewPager) view.findViewById(f5c0.f95155v2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148826b(h7v h7vVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162742d2, viewGroup, false);
        m148825a(h7vVar, viewInflate);
        return viewInflate;
    }
}

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
public class k7v {
    /* JADX INFO: renamed from: a */
    public static void m144702a(j7v j7vVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j7vVar.f116645a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        j7vVar.f116646b = (FrameLayout) viewGroup.getChildAt(1);
        j7vVar.f116647c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        j7vVar.f116648d = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j7vVar.f116649e = (AppBarLayout) view.findViewById(f5c0.f95019K1);
        j7vVar.f116650f = (LiveVoiceInternalHeaderView) view.findViewById(f5c0.f95125o0);
        j7vVar.f116651g = (TabLayout) view.findViewById(f5c0.f95023L1);
        j7vVar.f116652h = (NoSaveStateViewPager) view.findViewById(f5c0.f95155v2);
    }

    /* JADX INFO: renamed from: b */
    public static View m144703b(j7v j7vVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162750f2, viewGroup, false);
        m144702a(j7vVar, viewInflate);
        return viewInflate;
    }
}

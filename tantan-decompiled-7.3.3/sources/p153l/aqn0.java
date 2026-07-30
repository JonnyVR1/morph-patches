package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class aqn0 {
    /* JADX INFO: renamed from: a */
    public static void m99539a(zpn0 zpn0Var, View view) {
        zpn0Var._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zpn0Var._svga_view = (AnimEffectPlayer) viewGroup.getChildAt(0);
        zpn0Var._container = (FrameLayout) viewGroup.getChildAt(1);
        zpn0Var._navigation_bar = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zpn0Var._tabLayout_container = (LinearLayout) view.findViewById(ldc0.f131472J1);
        zpn0Var._topic_tab_layout = (TabLayout) view.findViewById(ldc0.f131509U1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        zpn0Var._red_dot_layout = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        zpn0Var._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        zpn0Var._view_pager = (NoSaveStateViewPager) view.findViewById(ldc0.f131457F2);
        zpn0Var._view_group_network_error = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0);
        zpn0Var._img_network_error = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        zpn0Var._tv_network_error = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        zpn0Var._view_group_empty = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        zpn0Var._img_empty = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        zpn0Var._tv_empty = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        zpn0Var._entry_view = (LiveVoiceEntryView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        zpn0Var._game_entry_view = (IntlGameOperationView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m99540b(zpn0 zpn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193862f0, viewGroup, false);
        m99539a(zpn0Var, viewInflate);
        return viewInflate;
    }
}

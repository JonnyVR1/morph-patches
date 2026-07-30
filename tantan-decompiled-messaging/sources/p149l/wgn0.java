package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class wgn0 {
    /* JADX INFO: renamed from: a */
    public static void m203075a(vgn0 vgn0Var, View view) {
        vgn0Var._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vgn0Var._svga_view = (AnimEffectPlayer) viewGroup.getChildAt(0);
        vgn0Var._container = (FrameLayout) viewGroup.getChildAt(1);
        vgn0Var._navigation_bar = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vgn0Var._tabLayout_container = (LinearLayout) view.findViewById(f5c0.f95015J1);
        vgn0Var._topic_tab_layout = (TabLayout) view.findViewById(f5c0.f95052U1);
        ViewGroup viewGroup2 = (ViewGroup) view;
        vgn0Var._red_dot_layout = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        vgn0Var._swipe_refresh = (VPullDownRefreshLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        vgn0Var._view_pager = (NoSaveStateViewPager) view.findViewById(f5c0.f95000F2);
        vgn0Var._view_group_network_error = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0);
        vgn0Var._img_network_error = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        vgn0Var._tv_network_error = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        vgn0Var._view_group_empty = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        vgn0Var._img_empty = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        vgn0Var._tv_empty = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        vgn0Var._entry_view = (LiveVoiceEntryView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        vgn0Var._game_entry_view = (IntlGameOperationView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m203076b(vgn0 vgn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162748f0, viewGroup, false);
        m203075a(vgn0Var, viewInflate);
        return viewInflate;
    }
}

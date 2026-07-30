package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;
import p147v.VLinear;
import p147v.VPagerNoPage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zu2 {
    /* JADX INFO: renamed from: a */
    public static void m220194a(BeautyFilterView beautyFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyFilterView.f48577a = (OnFlingFrameLayout) viewGroup.getChildAt(0);
        beautyFilterView.f48578b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        beautyFilterView.f48579c = (RelativeLayout) viewGroup.getChildAt(1);
        beautyFilterView.f48580d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        beautyFilterView.f48581e = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        beautyFilterView.f48582f = (RelativeLayout) viewGroup.getChildAt(2);
        beautyFilterView.f48583g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        beautyFilterView.f48584h = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        beautyFilterView.f48585i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        beautyFilterView.f48586j = (ContrastView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        beautyFilterView.f48587k = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        beautyFilterView.f48588l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        beautyFilterView.f48589m = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}

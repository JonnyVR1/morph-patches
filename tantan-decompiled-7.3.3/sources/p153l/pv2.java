package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;
import p151v.VLinear;
import p151v.VPagerNoPage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pv2 {
    /* JADX INFO: renamed from: a */
    public static void m173918a(BeautyFilterView beautyFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyFilterView.f49425a = (OnFlingFrameLayout) viewGroup.getChildAt(0);
        beautyFilterView.f49426b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        beautyFilterView.f49427c = (RelativeLayout) viewGroup.getChildAt(1);
        beautyFilterView.f49428d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        beautyFilterView.f49429e = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        beautyFilterView.f49430f = (RelativeLayout) viewGroup.getChildAt(2);
        beautyFilterView.f49431g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        beautyFilterView.f49432h = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        beautyFilterView.f49433i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        beautyFilterView.f49434j = (ContrastView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        beautyFilterView.f49435k = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        beautyFilterView.f49436l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        beautyFilterView.f49437m = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}

package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zu2 {
    /* JADX INFO: renamed from: a */
    public static void m27529a(BeautyFilterView beautyFilterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyFilterView.f4619a = (OnFlingFrameLayout) viewGroup.getChildAt(0);
        beautyFilterView.f4620b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        beautyFilterView.f4621c = (RelativeLayout) viewGroup.getChildAt(1);
        beautyFilterView.f4622d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        beautyFilterView.f4623e = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        beautyFilterView.f4624f = (RelativeLayout) viewGroup.getChildAt(2);
        beautyFilterView.f4625g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        beautyFilterView.f4626h = (TextSeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        beautyFilterView.f4627i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        beautyFilterView.f4628j = (ContrastView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        beautyFilterView.f4629k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        beautyFilterView.f4630l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        beautyFilterView.f4631m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}

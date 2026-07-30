package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.camera.widget.BeautyMenuItemView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.BeautyMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.BeautyValueTipSeekBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jv2 {
    /* JADX INFO: renamed from: a */
    public static void m11347a(BeautyMenuView beautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyMenuView.f989a = viewGroup.getChildAt(0);
        beautyMenuView.f990b = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        beautyMenuView.f991c = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        beautyMenuView.f992d = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        beautyMenuView.f993e = (BeautyValueTipSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.camera.widget.BeautyMenuItemView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.BeautyMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.BeautyValueTipSeekBar;

/* JADX INFO: loaded from: classes13.dex */
public class zv2 {
    /* JADX INFO: renamed from: a */
    public static void m221749a(BeautyMenuView beautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyMenuView.f40376a = viewGroup.getChildAt(0);
        beautyMenuView.f40377b = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        beautyMenuView.f40378c = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        beautyMenuView.f40379d = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        beautyMenuView.f40380e = (BeautyValueTipSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

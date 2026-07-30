package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.camera.widget.BeautyMenuItemView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.BeautyMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.BeautyValueTipSeekBar;

/* JADX INFO: loaded from: classes12.dex */
public class jv2 {
    /* JADX INFO: renamed from: a */
    public static void m143395a(BeautyMenuView beautyMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        beautyMenuView.f39528a = viewGroup.getChildAt(0);
        beautyMenuView.f39529b = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        beautyMenuView.f39530c = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        beautyMenuView.f39531d = (BeautyMenuItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        beautyMenuView.f39532e = (BeautyValueTipSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

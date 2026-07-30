package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MaskMenuView;
import p147v.VPager;

/* JADX INFO: loaded from: classes12.dex */
public class g3x {
    /* JADX INFO: renamed from: a */
    public static void m124287a(MaskMenuView maskMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        maskMenuView.f39771a = viewGroup.getChildAt(0);
        maskMenuView.f39772b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        maskMenuView.f39773c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        maskMenuView.f39774d = (VPager) viewGroup.getChildAt(2);
    }
}

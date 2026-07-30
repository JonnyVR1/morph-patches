package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MaskMenuView;
import p151v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class f6x {
    /* JADX INFO: renamed from: a */
    public static void m124325a(MaskMenuView maskMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        maskMenuView.f40619a = viewGroup.getChildAt(0);
        maskMenuView.f40620b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        maskMenuView.f40621c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        maskMenuView.f40622d = (VPager) viewGroup.getChildAt(2);
    }
}

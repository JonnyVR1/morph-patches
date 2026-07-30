package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentHeaderLargeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gg00 {
    /* JADX INFO: renamed from: a */
    public static void m10490a(MomentHeaderLargeView momentHeaderLargeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentHeaderLargeView.f5216d = viewGroup.getChildAt(0);
        momentHeaderLargeView.f5217e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentHeaderLargeView.f5218f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentHeaderLargeView.f5219g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentHeaderLargeView.f5220h = viewGroup.getChildAt(1);
        momentHeaderLargeView.f5221i = (FrameLayout) viewGroup.getChildAt(2);
        momentHeaderLargeView.f5222j = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        momentHeaderLargeView.f5223k = viewGroup.getChildAt(4);
    }
}

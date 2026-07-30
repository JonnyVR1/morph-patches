package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class med0 {
    /* JADX INFO: renamed from: a */
    public static void m11929a(RotatingDiscView rotatingDiscView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rotatingDiscView.f1273a = viewGroup.getChildAt(0);
        rotatingDiscView.f1274b = (FrameLayout) viewGroup.getChildAt(1);
        rotatingDiscView.f1275c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rotatingDiscView.f1276d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rotatingDiscView.f1277e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

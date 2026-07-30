package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class okb0 {
    /* JADX INFO: renamed from: a */
    public static void m12653a(QAMomentPostBar qAMomentPostBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qAMomentPostBar.f2803u = (FrameLayout) viewGroup.getChildAt(0);
        qAMomentPostBar.f2804v = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qAMomentPostBar.f2805w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qAMomentPostBar.f2806x = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qAMomentPostBar.f2807y = (FrameLayout) viewGroup.getChildAt(1);
        qAMomentPostBar.f2808z = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}

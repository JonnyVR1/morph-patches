package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;

/* JADX INFO: loaded from: classes12.dex */
public class okb0 {
    /* JADX INFO: renamed from: a */
    public static void m164840a(QAMomentPostBar qAMomentPostBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qAMomentPostBar.f41342u = (FrameLayout) viewGroup.getChildAt(0);
        qAMomentPostBar.f41343v = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qAMomentPostBar.f41344w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qAMomentPostBar.f41345x = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qAMomentPostBar.f41346y = (FrameLayout) viewGroup.getChildAt(1);
        qAMomentPostBar.f41347z = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}

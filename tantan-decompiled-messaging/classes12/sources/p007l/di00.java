package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class di00 {
    /* JADX INFO: renamed from: a */
    public static void m9406a(MomentPostBar momentPostBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentPostBar.f2474a = viewGroup.getChildAt(0);
        momentPostBar.f2475b = viewGroup.getChildAt(1);
        momentPostBar.f2476c = (TextView) viewGroup.getChildAt(2);
        momentPostBar.f2477d = (ImageView) viewGroup.getChildAt(3);
        momentPostBar.f2478e = (ImageView) viewGroup.getChildAt(4);
        momentPostBar.f2479f = (ProgressBar) viewGroup.getChildAt(5);
    }
}

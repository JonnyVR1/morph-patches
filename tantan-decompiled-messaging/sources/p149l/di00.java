package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class di00 {
    /* JADX INFO: renamed from: a */
    public static void m111856a(MomentPostBar momentPostBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentPostBar.f41013a = (VText) viewGroup.getChildAt(0);
        momentPostBar.f41014b = (VDraweeView) viewGroup.getChildAt(1);
        momentPostBar.f41015c = (TextView) viewGroup.getChildAt(2);
        momentPostBar.f41016d = (ImageView) viewGroup.getChildAt(3);
        momentPostBar.f41017e = (ImageView) viewGroup.getChildAt(4);
        momentPostBar.f41018f = (ProgressBar) viewGroup.getChildAt(5);
    }
}

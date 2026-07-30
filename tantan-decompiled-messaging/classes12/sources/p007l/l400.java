package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p1.mobile.putong.ui.webview.mk.MkProgressView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l400 {
    /* JADX INFO: renamed from: a */
    public static void m11550a(MkProgressView mkProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mkProgressView.a = (ProgressBar) viewGroup.getChildAt(0);
        mkProgressView.b = (LinearLayout) viewGroup.getChildAt(1);
        mkProgressView.c = (LinearLayout) viewGroup.getChildAt(2);
        mkProgressView.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}

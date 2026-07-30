package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkProgressView;

/* JADX INFO: loaded from: classes13.dex */
public class bd00 {
    /* JADX INFO: renamed from: a */
    public static void m103562a(MkProgressView mkProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mkProgressView.f55643a = (ProgressBar) viewGroup.getChildAt(0);
        mkProgressView.f55644b = (LinearLayout) viewGroup.getChildAt(1);
        mkProgressView.f55645c = (LinearLayout) viewGroup.getChildAt(2);
        mkProgressView.f55646d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}

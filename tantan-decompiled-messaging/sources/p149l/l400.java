package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkProgressView;

/* JADX INFO: loaded from: classes12.dex */
public class l400 {
    /* JADX INFO: renamed from: a */
    public static void m148419a(MkProgressView mkProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mkProgressView.f54795a = (ProgressBar) viewGroup.getChildAt(0);
        mkProgressView.f54796b = (LinearLayout) viewGroup.getChildAt(1);
        mkProgressView.f54797c = (LinearLayout) viewGroup.getChildAt(2);
        mkProgressView.f54798d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}

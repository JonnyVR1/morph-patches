package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.LikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ter {
    /* JADX INFO: renamed from: a */
    public static void m14509a(LikeView likeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeView.f5113a = (LinearLayout) viewGroup.getChildAt(0);
        likeView.f5114b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likeView.f5115c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        likeView.f5116d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likeView.f5117e = viewGroup.getChildAt(1);
    }
}

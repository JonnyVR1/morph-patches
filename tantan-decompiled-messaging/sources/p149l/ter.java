package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.LikeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ter {
    /* JADX INFO: renamed from: a */
    public static void m188557a(LikeView likeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeView.f43652a = (LinearLayout) viewGroup.getChildAt(0);
        likeView.f43653b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        likeView.f43654c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        likeView.f43655d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likeView.f43656e = viewGroup.getChildAt(1);
    }
}

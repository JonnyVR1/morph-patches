package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gqg {
    /* JADX INFO: renamed from: a */
    public static void m131374a(FeedAutoScrollView feedAutoScrollView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAutoScrollView.f43746a = (ConstraintLayout) viewGroup.getChildAt(0);
        feedAutoScrollView.f43747b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAutoScrollView.f43748c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAutoScrollView.f43749d = (ConstraintLayout) viewGroup.getChildAt(1);
        feedAutoScrollView.f43750e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedAutoScrollView.f43751f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

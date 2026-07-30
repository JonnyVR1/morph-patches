package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.hello.FeedNearbyOnlineView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class fih {
    /* JADX INFO: renamed from: a */
    public static void m121512a(FeedNearbyOnlineView feedNearbyOnlineView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedNearbyOnlineView.f41634d = (ConstraintLayout) viewGroup.getChildAt(0);
        feedNearbyOnlineView.f41635e = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedNearbyOnlineView.f41636f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedNearbyOnlineView.f41637g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedNearbyOnlineView.f41638h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedNearbyOnlineView.f41639i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedNearbyOnlineView.f41640j = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedNearbyOnlineView.f41641k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedNearbyOnlineView.f41642l = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedNearbyOnlineView.f41643m = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

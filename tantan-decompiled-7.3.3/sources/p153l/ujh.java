package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.hello.FeedNearbyOnlineView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ujh {
    /* JADX INFO: renamed from: a */
    public static void m196370a(FeedNearbyOnlineView feedNearbyOnlineView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedNearbyOnlineView.f42482d = (ConstraintLayout) viewGroup.getChildAt(0);
        feedNearbyOnlineView.f42483e = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedNearbyOnlineView.f42484f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedNearbyOnlineView.f42485g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedNearbyOnlineView.f42486h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedNearbyOnlineView.f42487i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedNearbyOnlineView.f42488j = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedNearbyOnlineView.f42489k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedNearbyOnlineView.f42490l = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedNearbyOnlineView.f42491m = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

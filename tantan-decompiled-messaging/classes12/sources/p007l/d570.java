package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFansView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d570 {
    /* JADX INFO: renamed from: a */
    public static void m9305a(PhotoAlbumFansView photoAlbumFansView, View view) {
        photoAlbumFansView.f2682a = (PhotoAlbumFansView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFansView.f2683b = viewGroup.getChildAt(0);
        photoAlbumFansView.f2684c = (RelativeLayout) viewGroup.getChildAt(1);
        photoAlbumFansView.f2685d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        photoAlbumFansView.f2686e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        photoAlbumFansView.f2687f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        photoAlbumFansView.f2688g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        photoAlbumFansView.f2689h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        photoAlbumFansView.f2690i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        photoAlbumFansView.f2691j = viewGroup.getChildAt(2);
        photoAlbumFansView.f2692k = viewGroup.getChildAt(3);
        photoAlbumFansView.f2693l = viewGroup.getChildAt(4);
    }
}

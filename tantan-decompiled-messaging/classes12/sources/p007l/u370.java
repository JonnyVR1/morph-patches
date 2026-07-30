package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u370 {
    /* JADX INFO: renamed from: a */
    public static void m14724a(PhotoAlbumFallsFeedItem photoAlbumFallsFeedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFallsFeedItem.f2673a = viewGroup.getChildAt(0);
        photoAlbumFallsFeedItem.f2674b = viewGroup.getChildAt(1);
        photoAlbumFallsFeedItem.f2675c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoAlbumFallsFeedItem.f2676d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        photoAlbumFallsFeedItem.f2677e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        photoAlbumFallsFeedItem.f2678f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        photoAlbumFallsFeedItem.f2679g = viewGroup.getChildAt(3);
    }
}

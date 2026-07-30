package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class u370 {
    /* JADX INFO: renamed from: a */
    public static void m191565a(PhotoAlbumFallsFeedItem photoAlbumFallsFeedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFallsFeedItem.f41212a = (VDraweeView) viewGroup.getChildAt(0);
        photoAlbumFallsFeedItem.f41213b = (VText) viewGroup.getChildAt(1);
        photoAlbumFallsFeedItem.f41214c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoAlbumFallsFeedItem.f41215d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        photoAlbumFallsFeedItem.f41216e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        photoAlbumFallsFeedItem.f41217f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        photoAlbumFallsFeedItem.f41218g = (VImage) viewGroup.getChildAt(3);
    }
}

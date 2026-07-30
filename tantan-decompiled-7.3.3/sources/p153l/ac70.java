package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ac70 {
    /* JADX INFO: renamed from: a */
    public static void m96805a(PhotoAlbumFallsFeedItem photoAlbumFallsFeedItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFallsFeedItem.f42060a = (VDraweeView) viewGroup.getChildAt(0);
        photoAlbumFallsFeedItem.f42061b = (VText) viewGroup.getChildAt(1);
        photoAlbumFallsFeedItem.f42062c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoAlbumFallsFeedItem.f42063d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        photoAlbumFallsFeedItem.f42064e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        photoAlbumFallsFeedItem.f42065f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        photoAlbumFallsFeedItem.f42066g = (VImage) viewGroup.getChildAt(3);
    }
}

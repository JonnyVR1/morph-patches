package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class r970 {
    /* JADX INFO: renamed from: a */
    public static void m180575a(PhotoAlbumCommentDetailsView photoAlbumCommentDetailsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumCommentDetailsView.f42001a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        photoAlbumCommentDetailsView.f42002b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        photoAlbumCommentDetailsView.f42003c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        photoAlbumCommentDetailsView.f42004d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        photoAlbumCommentDetailsView.f42005e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        photoAlbumCommentDetailsView.f42006f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        photoAlbumCommentDetailsView.f42007g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        photoAlbumCommentDetailsView.f42008h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        photoAlbumCommentDetailsView.f42009i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}

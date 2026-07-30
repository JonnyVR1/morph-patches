package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class l170 {
    /* JADX INFO: renamed from: a */
    public static void m148151a(PhotoAlbumCommentDetailsView photoAlbumCommentDetailsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumCommentDetailsView.f41153a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        photoAlbumCommentDetailsView.f41154b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        photoAlbumCommentDetailsView.f41155c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        photoAlbumCommentDetailsView.f41156d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        photoAlbumCommentDetailsView.f41157e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        photoAlbumCommentDetailsView.f41158f = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        photoAlbumCommentDetailsView.f41159g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        photoAlbumCommentDetailsView.f41160h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        photoAlbumCommentDetailsView.f41161i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}

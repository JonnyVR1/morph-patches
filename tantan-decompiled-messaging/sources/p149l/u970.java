package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedCardView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class u970 {
    /* JADX INFO: renamed from: a */
    public static void m192264a(PhotoAlbumInterestedCardView photoAlbumInterestedCardView, View view) {
        photoAlbumInterestedCardView.f42255a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumInterestedCardView.f42256b = (VDraweeView) viewGroup.getChildAt(0);
        photoAlbumInterestedCardView.f42257c = (TextView) viewGroup.getChildAt(1);
        photoAlbumInterestedCardView.f42258d = (VImage) viewGroup.getChildAt(2);
        photoAlbumInterestedCardView.f42259e = (TextView) viewGroup.getChildAt(3);
        photoAlbumInterestedCardView.f42260f = (TextView) viewGroup.getChildAt(4);
        photoAlbumInterestedCardView.f42261g = (TextView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m192265b(PhotoAlbumInterestedCardView photoAlbumInterestedCardView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142183e2, viewGroup, false);
        m192264a(photoAlbumInterestedCardView, viewInflate);
        return viewInflate;
    }
}

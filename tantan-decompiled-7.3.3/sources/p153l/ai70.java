package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedCardView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class ai70 {
    /* JADX INFO: renamed from: a */
    public static void m97959a(PhotoAlbumInterestedCardView photoAlbumInterestedCardView, View view) {
        photoAlbumInterestedCardView.f43103a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumInterestedCardView.f43104b = (VDraweeView) viewGroup.getChildAt(0);
        photoAlbumInterestedCardView.f43105c = (TextView) viewGroup.getChildAt(1);
        photoAlbumInterestedCardView.f43106d = (VImage) viewGroup.getChildAt(2);
        photoAlbumInterestedCardView.f43107e = (TextView) viewGroup.getChildAt(3);
        photoAlbumInterestedCardView.f43108f = (TextView) viewGroup.getChildAt(4);
        photoAlbumInterestedCardView.f43109g = (TextView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m97960b(PhotoAlbumInterestedCardView photoAlbumInterestedCardView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173652e2, viewGroup, false);
        m97959a(photoAlbumInterestedCardView, viewInflate);
        return viewInflate;
    }
}

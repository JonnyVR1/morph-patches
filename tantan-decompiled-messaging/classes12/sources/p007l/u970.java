package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u970 {
    /* JADX INFO: renamed from: a */
    public static void m14790a(PhotoAlbumInterestedCardView photoAlbumInterestedCardView, View view) {
        photoAlbumInterestedCardView.f3716a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumInterestedCardView.f3717b = viewGroup.getChildAt(0);
        photoAlbumInterestedCardView.f3718c = (TextView) viewGroup.getChildAt(1);
        photoAlbumInterestedCardView.f3719d = viewGroup.getChildAt(2);
        photoAlbumInterestedCardView.f3720e = (TextView) viewGroup.getChildAt(3);
        photoAlbumInterestedCardView.f3721f = (TextView) viewGroup.getChildAt(4);
        photoAlbumInterestedCardView.f3722g = (TextView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m14791b(PhotoAlbumInterestedCardView photoAlbumInterestedCardView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11202e2, viewGroup, false);
        m14790a(photoAlbumInterestedCardView, viewInflate);
        return viewInflate;
    }
}

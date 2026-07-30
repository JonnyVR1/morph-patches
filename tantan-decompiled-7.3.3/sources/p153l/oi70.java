package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import p151v.VImage;
import p151v.VLinear;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes13.dex */
public class oi70 {
    /* JADX INFO: renamed from: a */
    public static void m167771a(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumPhotoPreviewView.f43504a = (FeedPhotoDraweeView) viewGroup.getChildAt(0);
        photoAlbumPhotoPreviewView.f43505b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
        photoAlbumPhotoPreviewView.f43506c = (VLinear) viewGroup.getChildAt(2);
        photoAlbumPhotoPreviewView.f43507d = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m167772b(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173673h2, viewGroup, true);
        m167771a(photoAlbumPhotoPreviewView, viewInflate);
        return viewInflate;
    }
}

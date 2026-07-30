package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.FeedPhotoDraweeView;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import p147v.VImage;
import p147v.VLinear;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes12.dex */
public class ia70 {
    /* JADX INFO: renamed from: a */
    public static void m135135a(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumPhotoPreviewView.f42656a = (FeedPhotoDraweeView) viewGroup.getChildAt(0);
        photoAlbumPhotoPreviewView.f42657b = (SubsamplingScaleImageView) viewGroup.getChildAt(1);
        photoAlbumPhotoPreviewView.f42658c = (VLinear) viewGroup.getChildAt(2);
        photoAlbumPhotoPreviewView.f42659d = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m135136b(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142204h2, viewGroup, true);
        m135135a(photoAlbumPhotoPreviewView, viewInflate);
        return viewInflate;
    }
}

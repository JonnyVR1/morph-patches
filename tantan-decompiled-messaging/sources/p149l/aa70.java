package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class aa70 {
    /* JADX INFO: renamed from: a */
    public static void m95530a(PhotoAlbumLivePhotoView photoAlbumLivePhotoView, View view) {
        photoAlbumLivePhotoView.f42631a = (TextureView) ((ViewGroup) view).getChildAt(0);
        photoAlbumLivePhotoView.f42632b = (PhotoDraweeView) view.findViewById(b5c0.f73472D);
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumLivePhotoView.f42633c = (VLinear) viewGroup.getChildAt(2);
        photoAlbumLivePhotoView.f42634d = (VProgressBar) viewGroup.getChildAt(3);
        photoAlbumLivePhotoView.f42635e = (VLinear) viewGroup.getChildAt(4);
        photoAlbumLivePhotoView.f42636f = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        photoAlbumLivePhotoView.f42637g = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        photoAlbumLivePhotoView.f42638h = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m95531b(PhotoAlbumLivePhotoView photoAlbumLivePhotoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142197g2, viewGroup, true);
        m95530a(photoAlbumLivePhotoView, viewInflate);
        return viewInflate;
    }
}

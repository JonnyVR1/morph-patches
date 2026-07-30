package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class gi70 {
    /* JADX INFO: renamed from: a */
    public static void m130295a(PhotoAlbumLivePhotoView photoAlbumLivePhotoView, View view) {
        photoAlbumLivePhotoView.f43479a = (TextureView) ((ViewGroup) view).getChildAt(0);
        photoAlbumLivePhotoView.f43480b = (PhotoDraweeView) view.findViewById(hdc0.f108825D);
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumLivePhotoView.f43481c = (VLinear) viewGroup.getChildAt(2);
        photoAlbumLivePhotoView.f43482d = (VProgressBar) viewGroup.getChildAt(3);
        photoAlbumLivePhotoView.f43483e = (VLinear) viewGroup.getChildAt(4);
        photoAlbumLivePhotoView.f43484f = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        photoAlbumLivePhotoView.f43485g = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        photoAlbumLivePhotoView.f43486h = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m130296b(PhotoAlbumLivePhotoView photoAlbumLivePhotoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173666g2, viewGroup, true);
        m130295a(photoAlbumLivePhotoView, viewInflate);
        return viewInflate;
    }
}

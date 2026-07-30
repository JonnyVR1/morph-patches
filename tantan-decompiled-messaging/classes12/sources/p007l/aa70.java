package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aa70 {
    /* JADX INFO: renamed from: a */
    public static void m8466a(PhotoAlbumLivePhotoView photoAlbumLivePhotoView, View view) {
        photoAlbumLivePhotoView.f4092a = (TextureView) ((ViewGroup) view).getChildAt(0);
        photoAlbumLivePhotoView.f4093b = view.findViewById(b5c0.f5953D);
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumLivePhotoView.f4094c = viewGroup.getChildAt(2);
        photoAlbumLivePhotoView.f4095d = viewGroup.getChildAt(3);
        photoAlbumLivePhotoView.f4096e = viewGroup.getChildAt(4);
        photoAlbumLivePhotoView.f4097f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        photoAlbumLivePhotoView.f4098g = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        photoAlbumLivePhotoView.f4099h = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8467b(PhotoAlbumLivePhotoView photoAlbumLivePhotoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11216g2, viewGroup, true);
        m8466a(photoAlbumLivePhotoView, viewInflate);
        return viewInflate;
    }
}

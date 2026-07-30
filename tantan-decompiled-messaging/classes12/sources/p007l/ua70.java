package p007l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ua70 {
    /* JADX INFO: renamed from: a */
    public static void m15069a(PhotoAlbumPlayerView photoAlbumPlayerView, View view) {
        photoAlbumPlayerView.f4125a = (TextureView) ((ViewGroup) view).getChildAt(0);
        photoAlbumPlayerView.f4126b = view.findViewById(b5c0.f5953D);
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumPlayerView.f4127c = viewGroup.getChildAt(2);
        photoAlbumPlayerView.f4128d = viewGroup.getChildAt(3);
        photoAlbumPlayerView.f4129e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        photoAlbumPlayerView.f4130f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        photoAlbumPlayerView.f4131g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        photoAlbumPlayerView.f4132h = view.findViewById(b5c0.f6072n);
        photoAlbumPlayerView.f4133i = (ImageView) view.findViewById(b5c0.f6083q1);
        photoAlbumPlayerView.f4134j = view.findViewById(b5c0.f5966H0);
    }

    /* JADX INFO: renamed from: b */
    public static View m15070b(PhotoAlbumPlayerView photoAlbumPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11230i2, viewGroup, true);
        m15069a(photoAlbumPlayerView, viewInflate);
        return viewInflate;
    }
}

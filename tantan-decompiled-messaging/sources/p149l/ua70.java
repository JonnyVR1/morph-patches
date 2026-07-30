package p149l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ua70 {
    /* JADX INFO: renamed from: a */
    public static void m192734a(PhotoAlbumPlayerView photoAlbumPlayerView, View view) {
        photoAlbumPlayerView.f42664a = (TextureView) ((ViewGroup) view).getChildAt(0);
        photoAlbumPlayerView.f42665b = (VDraweeView) view.findViewById(b5c0.f73472D);
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumPlayerView.f42666c = (VProgressBar) viewGroup.getChildAt(2);
        photoAlbumPlayerView.f42667d = (VLinear) viewGroup.getChildAt(3);
        photoAlbumPlayerView.f42668e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        photoAlbumPlayerView.f42669f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        photoAlbumPlayerView.f42670g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        photoAlbumPlayerView.f42671h = (VFrame_ColorFilter) view.findViewById(b5c0.f73591n);
        photoAlbumPlayerView.f42672i = (ImageView) view.findViewById(b5c0.f73602q1);
        photoAlbumPlayerView.f42673j = (VProgressBar) view.findViewById(b5c0.f73485H0);
    }

    /* JADX INFO: renamed from: b */
    public static View m192735b(PhotoAlbumPlayerView photoAlbumPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142211i2, viewGroup, true);
        m192734a(photoAlbumPlayerView, viewInflate);
        return viewInflate;
    }
}

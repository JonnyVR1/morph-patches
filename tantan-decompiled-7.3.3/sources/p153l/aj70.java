package p153l;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class aj70 {
    /* JADX INFO: renamed from: a */
    public static void m98353a(PhotoAlbumPlayerView photoAlbumPlayerView, View view) {
        photoAlbumPlayerView.f43512a = (TextureView) ((ViewGroup) view).getChildAt(0);
        photoAlbumPlayerView.f43513b = (VDraweeView) view.findViewById(hdc0.f108825D);
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumPlayerView.f43514c = (VProgressBar) viewGroup.getChildAt(2);
        photoAlbumPlayerView.f43515d = (VLinear) viewGroup.getChildAt(3);
        photoAlbumPlayerView.f43516e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        photoAlbumPlayerView.f43517f = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        photoAlbumPlayerView.f43518g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        photoAlbumPlayerView.f43519h = (VFrame_ColorFilter) view.findViewById(hdc0.f108944n);
        photoAlbumPlayerView.f43520i = (ImageView) view.findViewById(hdc0.f108955q1);
        photoAlbumPlayerView.f43521j = (VProgressBar) view.findViewById(hdc0.f108838H0);
    }

    /* JADX INFO: renamed from: b */
    public static View m98354b(PhotoAlbumPlayerView photoAlbumPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173680i2, viewGroup, true);
        m98353a(photoAlbumPlayerView, viewInflate);
        return viewInflate;
    }
}

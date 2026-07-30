package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import p147v.VFrame;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class n970 {
    /* JADX INFO: renamed from: a */
    public static void m158535a(PhotoAlbumFrag photoAlbumFrag, View view) {
        photoAlbumFrag.f41297z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFrag.f41242A = (DiscoveryPager) viewGroup.getChildAt(0);
        photoAlbumFrag.f41243B = (VFrame) viewGroup.getChildAt(1);
        photoAlbumFrag.f41244C = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        photoAlbumFrag.f41245D = (VFrame) viewGroup.getChildAt(2);
        photoAlbumFrag.f41246E = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoAlbumFrag.f41248F = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m158536b(PhotoAlbumFrag photoAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142312w5, viewGroup, false);
        m158535a(photoAlbumFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m158537c(PhotoAlbumFrag photoAlbumFrag) {
        photoAlbumFrag.f41297z = null;
        photoAlbumFrag.f41242A = null;
        photoAlbumFrag.f41243B = null;
        photoAlbumFrag.f41244C = null;
        photoAlbumFrag.f41245D = null;
        photoAlbumFrag.f41246E = null;
        photoAlbumFrag.f41248F = null;
    }
}

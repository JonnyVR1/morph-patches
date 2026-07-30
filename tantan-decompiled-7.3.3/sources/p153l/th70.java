package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import p151v.VFrame;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class th70 {
    /* JADX INFO: renamed from: a */
    public static void m191233a(PhotoAlbumFrag photoAlbumFrag, View view) {
        photoAlbumFrag.f42145z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFrag.f42090A = (DiscoveryPager) viewGroup.getChildAt(0);
        photoAlbumFrag.f42091B = (VFrame) viewGroup.getChildAt(1);
        photoAlbumFrag.f42092C = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        photoAlbumFrag.f42093D = (VFrame) viewGroup.getChildAt(2);
        photoAlbumFrag.f42094E = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoAlbumFrag.f42096F = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191234b(PhotoAlbumFrag photoAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173781w5, viewGroup, false);
        m191233a(photoAlbumFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m191235c(PhotoAlbumFrag photoAlbumFrag) {
        photoAlbumFrag.f42145z = null;
        photoAlbumFrag.f42090A = null;
        photoAlbumFrag.f42091B = null;
        photoAlbumFrag.f42092C = null;
        photoAlbumFrag.f42093D = null;
        photoAlbumFrag.f42094E = null;
        photoAlbumFrag.f42096F = null;
    }
}

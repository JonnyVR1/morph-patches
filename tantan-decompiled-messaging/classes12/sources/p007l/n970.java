package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n970 {
    /* JADX INFO: renamed from: a */
    public static void m12127a(PhotoAlbumFrag photoAlbumFrag, View view) {
        photoAlbumFrag.f2758z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        photoAlbumFrag.f2703A = (DiscoveryPager) viewGroup.getChildAt(0);
        photoAlbumFrag.f2704B = viewGroup.getChildAt(1);
        photoAlbumFrag.f2705C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        photoAlbumFrag.f2706D = viewGroup.getChildAt(2);
        photoAlbumFrag.f2707E = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        photoAlbumFrag.f2709F = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m12128b(PhotoAlbumFrag photoAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11331w5, viewGroup, false);
        m12127a(photoAlbumFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m12129c(PhotoAlbumFrag photoAlbumFrag) {
        photoAlbumFrag.f2758z = null;
        photoAlbumFrag.f2703A = null;
        photoAlbumFrag.f2704B = null;
        photoAlbumFrag.f2705C = null;
        photoAlbumFrag.f2706D = null;
        photoAlbumFrag.f2707E = null;
        photoAlbumFrag.f2709F = null;
    }
}

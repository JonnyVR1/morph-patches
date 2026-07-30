package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import p147v.VFrame;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class i140 {
    /* JADX INFO: renamed from: a */
    public static void m133965a(NewPhotoAlbumFrag newPhotoAlbumFrag, View view) {
        newPhotoAlbumFrag.f41602z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPhotoAlbumFrag.f41541A = (DiscoveryPager) viewGroup.getChildAt(0);
        newPhotoAlbumFrag.f41542B = (VFrame) viewGroup.getChildAt(1);
        newPhotoAlbumFrag.f41543C = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newPhotoAlbumFrag.f41544D = (VFrame) viewGroup.getChildAt(2);
        newPhotoAlbumFrag.f41545E = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newPhotoAlbumFrag.f41547F = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m133966b(NewPhotoAlbumFrag newPhotoAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142034G1, viewGroup, false);
        m133965a(newPhotoAlbumFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m133967c(NewPhotoAlbumFrag newPhotoAlbumFrag) {
        newPhotoAlbumFrag.f41602z = null;
        newPhotoAlbumFrag.f41541A = null;
        newPhotoAlbumFrag.f41542B = null;
        newPhotoAlbumFrag.f41543C = null;
        newPhotoAlbumFrag.f41544D = null;
        newPhotoAlbumFrag.f41545E = null;
        newPhotoAlbumFrag.f41547F = null;
    }
}

package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import p151v.VFrame;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class w940 {
    /* JADX INFO: renamed from: a */
    public static void m205555a(NewPhotoAlbumFrag newPhotoAlbumFrag, View view) {
        newPhotoAlbumFrag.f42450z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPhotoAlbumFrag.f42389A = (DiscoveryPager) viewGroup.getChildAt(0);
        newPhotoAlbumFrag.f42390B = (VFrame) viewGroup.getChildAt(1);
        newPhotoAlbumFrag.f42391C = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newPhotoAlbumFrag.f42392D = (VFrame) viewGroup.getChildAt(2);
        newPhotoAlbumFrag.f42393E = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newPhotoAlbumFrag.f42395F = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m205556b(NewPhotoAlbumFrag newPhotoAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173503G1, viewGroup, false);
        m205555a(newPhotoAlbumFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m205557c(NewPhotoAlbumFrag newPhotoAlbumFrag) {
        newPhotoAlbumFrag.f42450z = null;
        newPhotoAlbumFrag.f42389A = null;
        newPhotoAlbumFrag.f42390B = null;
        newPhotoAlbumFrag.f42391C = null;
        newPhotoAlbumFrag.f42392D = null;
        newPhotoAlbumFrag.f42393E = null;
        newPhotoAlbumFrag.f42395F = null;
    }
}

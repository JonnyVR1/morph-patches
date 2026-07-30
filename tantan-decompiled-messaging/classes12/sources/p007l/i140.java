package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i140 {
    /* JADX INFO: renamed from: a */
    public static void m10757a(NewPhotoAlbumFrag newPhotoAlbumFrag, View view) {
        newPhotoAlbumFrag.f3063z = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPhotoAlbumFrag.f3002A = (DiscoveryPager) viewGroup.getChildAt(0);
        newPhotoAlbumFrag.f3003B = viewGroup.getChildAt(1);
        newPhotoAlbumFrag.f3004C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newPhotoAlbumFrag.f3005D = viewGroup.getChildAt(2);
        newPhotoAlbumFrag.f3006E = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newPhotoAlbumFrag.f3008F = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10758b(NewPhotoAlbumFrag newPhotoAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11053G1, viewGroup, false);
        m10757a(newPhotoAlbumFrag, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m10759c(NewPhotoAlbumFrag newPhotoAlbumFrag) {
        newPhotoAlbumFrag.f3063z = null;
        newPhotoAlbumFrag.f3002A = null;
        newPhotoAlbumFrag.f3003B = null;
        newPhotoAlbumFrag.f3004C = null;
        newPhotoAlbumFrag.f3005D = null;
        newPhotoAlbumFrag.f3006E = null;
        newPhotoAlbumFrag.f3008F = null;
    }
}

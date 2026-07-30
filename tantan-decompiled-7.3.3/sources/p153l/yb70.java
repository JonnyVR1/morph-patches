package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class yb70 {
    /* JADX INFO: renamed from: a */
    public static void m215016a(PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFrag, View view) {
        photoAlbumFallsFeedFrag.f42054z = (SwipeRefreshLayout) ((ViewGroup) view).getChildAt(0);
        photoAlbumFallsFeedFrag.f42048A = (VRecyclerView) view.findViewById(hdc0.f108896a1);
        photoAlbumFallsFeedFrag.f42049B = (CommonEmptyView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m215017b(PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173739q5, viewGroup, false);
        m215016a(photoAlbumFallsFeedFrag, viewInflate);
        return viewInflate;
    }
}

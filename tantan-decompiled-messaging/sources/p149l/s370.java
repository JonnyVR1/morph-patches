package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class s370 {
    /* JADX INFO: renamed from: a */
    public static void m182122a(PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFrag, View view) {
        photoAlbumFallsFeedFrag.f41206z = (SwipeRefreshLayout) ((ViewGroup) view).getChildAt(0);
        photoAlbumFallsFeedFrag.f41200A = (VRecyclerView) view.findViewById(b5c0.f73543a1);
        photoAlbumFallsFeedFrag.f41201B = (CommonEmptyView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182123b(PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142270q5, viewGroup, false);
        m182122a(photoAlbumFallsFeedFrag, viewInflate);
        return viewInflate;
    }
}

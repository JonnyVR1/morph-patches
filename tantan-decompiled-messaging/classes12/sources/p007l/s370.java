package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s370 {
    /* JADX INFO: renamed from: a */
    public static void m14003a(PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFrag, View view) {
        photoAlbumFallsFeedFrag.f2667z = ((ViewGroup) view).getChildAt(0);
        photoAlbumFallsFeedFrag.f2661A = view.findViewById(b5c0.f6024a1);
        photoAlbumFallsFeedFrag.f2662B = (CommonEmptyView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14004b(PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11289q5, viewGroup, false);
        m14003a(photoAlbumFallsFeedFrag, viewInflate);
        return viewInflate;
    }
}

package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.FeedAlbumInterestedEntranceView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class nng {
    /* JADX INFO: renamed from: a */
    public static void m163865a(FeedAlbumInterestedEntranceView feedAlbumInterestedEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAlbumInterestedEntranceView.f43080d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedAlbumInterestedEntranceView.f43081e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedAlbumInterestedEntranceView.f43082f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedAlbumInterestedEntranceView.f43083g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedAlbumInterestedEntranceView.f43084h = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedAlbumInterestedEntranceView.f43085i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedAlbumInterestedEntranceView.f43086j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m163866b(FeedAlbumInterestedEntranceView feedAlbumInterestedEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173592V0, viewGroup, false);
        m163865a(feedAlbumInterestedEntranceView, viewInflate);
        return viewInflate;
    }
}

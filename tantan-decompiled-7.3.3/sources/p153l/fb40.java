package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class fb40 {
    /* JADX INFO: renamed from: a */
    public static void m124862a(NewPostAlbumFrag newPostAlbumFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newPostAlbumFrag.f41331I = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newPostAlbumFrag.f41332J = (LinearLayout) viewGroup.getChildAt(1);
        newPostAlbumFrag.f41333K = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newPostAlbumFrag.f41334L = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newPostAlbumFrag.f41335M = (LinearLayout) viewGroup.getChildAt(2);
        newPostAlbumFrag.f41336N = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m124863b(NewPostAlbumFrag newPostAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173669g5, viewGroup, false);
        m124862a(newPostAlbumFrag, viewInflate);
        return viewInflate;
    }
}

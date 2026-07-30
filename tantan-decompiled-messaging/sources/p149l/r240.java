package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class r240 {
    /* JADX INFO: renamed from: a */
    public static void m177558a(NewPostAlbumFrag newPostAlbumFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newPostAlbumFrag.f40483I = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newPostAlbumFrag.f40484J = (LinearLayout) viewGroup.getChildAt(1);
        newPostAlbumFrag.f40485K = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newPostAlbumFrag.f40486L = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newPostAlbumFrag.f40487M = (LinearLayout) viewGroup.getChildAt(2);
        newPostAlbumFrag.f40488N = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m177559b(NewPostAlbumFrag newPostAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142200g5, viewGroup, false);
        m177558a(newPostAlbumFrag, viewInflate);
        return viewInflate;
    }
}

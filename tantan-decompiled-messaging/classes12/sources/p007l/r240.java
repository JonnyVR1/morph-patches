package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r240 {
    /* JADX INFO: renamed from: a */
    public static void m13827a(NewPostAlbumFrag newPostAlbumFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newPostAlbumFrag.f1944I = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newPostAlbumFrag.f1945J = (LinearLayout) viewGroup.getChildAt(1);
        newPostAlbumFrag.f1946K = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newPostAlbumFrag.f1947L = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newPostAlbumFrag.f1948M = (LinearLayout) viewGroup.getChildAt(2);
        newPostAlbumFrag.f1949N = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m13828b(NewPostAlbumFrag newPostAlbumFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11219g5, viewGroup, false);
        m13827a(newPostAlbumFrag, viewInflate);
        return viewInflate;
    }
}

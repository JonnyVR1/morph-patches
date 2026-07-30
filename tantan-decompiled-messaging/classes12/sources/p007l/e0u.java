package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare.LiveSquareFeedFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e0u {
    /* JADX INFO: renamed from: a */
    public static void m9597a(LiveSquareFeedFrag liveSquareFeedFrag, View view) {
        liveSquareFeedFrag.f3128z = (LinearLayout) view;
        liveSquareFeedFrag.f3122A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9598b(LiveSquareFeedFrag liveSquareFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11222h1, viewGroup, false);
        m9597a(liveSquareFeedFrag, viewInflate);
        return viewInflate;
    }
}

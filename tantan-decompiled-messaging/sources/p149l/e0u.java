package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare.LiveSquareFeedFrag;

/* JADX INFO: loaded from: classes12.dex */
public class e0u {
    /* JADX INFO: renamed from: a */
    public static void m114342a(LiveSquareFeedFrag liveSquareFeedFrag, View view) {
        liveSquareFeedFrag.f41667z = (LinearLayout) view;
        liveSquareFeedFrag.f41661A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m114343b(LiveSquareFeedFrag liveSquareFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142203h1, viewGroup, false);
        m114342a(liveSquareFeedFrag, viewInflate);
        return viewInflate;
    }
}

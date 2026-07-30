package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare.LiveSquareFeedFrag;

/* JADX INFO: loaded from: classes13.dex */
public class f2u {
    /* JADX INFO: renamed from: a */
    public static void m123679a(LiveSquareFeedFrag liveSquareFeedFrag, View view) {
        liveSquareFeedFrag.f42515z = (LinearLayout) view;
        liveSquareFeedFrag.f42509A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m123680b(LiveSquareFeedFrag liveSquareFeedFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173672h1, viewGroup, false);
        m123679a(liveSquareFeedFrag, viewInflate);
        return viewInflate;
    }
}

package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2090b;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.FeedEditText;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.view.FeedPostMediaRecyclerView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f640 {
    /* JADX INFO: renamed from: a */
    public static void m10067a(C2090b c2090b, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c2090b.f2169a = viewGroup.getChildAt(0);
        c2090b.f2170b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c2090b.f2171c = (FeedMomentPostStatusView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c2090b.f2172d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c2090b.f2173e = (FrameLayout) viewGroup.getChildAt(1);
        c2090b.f2174f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c2090b.f2175g = (FeedEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c2090b.f2176h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c2090b.f2177i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c2090b.f2178j = (FeedPostMediaRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        c2090b.f2179k = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        c2090b.f2180l = (FeedAudioPlayerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c2090b.f2181m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        c2090b.f2182n = (FeedSharelinkView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        c2090b.f2183o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        c2090b.f2184p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
        c2090b.f2185q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(0);
        c2090b.f2186r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(1);
        c2090b.f2187s = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5)).getChildAt(2);
        c2090b.f2188t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
        c2090b.f2189u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(0);
        c2090b.f2190v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(1);
        c2090b.f2191w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(2);
        c2090b.f2192x = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
        c2090b.f2193y = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7)).getChildAt(0);
        c2090b.f2194z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c2090b.f2146A = (FeedPostBottomView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        c2090b.f2147B = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        c2090b.f2148C = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10068b(C2090b c2090b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11047F1, viewGroup, false);
        m10067a(c2090b, viewInflate);
        return viewInflate;
    }
}

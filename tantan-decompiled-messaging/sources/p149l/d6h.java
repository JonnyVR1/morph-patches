package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.newest.FeedGroupNewestMomentFrag;

/* JADX INFO: loaded from: classes12.dex */
public class d6h {
    /* JADX INFO: renamed from: a */
    public static void m110165a(FeedGroupNewestMomentFrag feedGroupNewestMomentFrag, View view) {
        feedGroupNewestMomentFrag.f40108z = (LinearLayout) view;
        feedGroupNewestMomentFrag.f40099A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m110166b(FeedGroupNewestMomentFrag feedGroupNewestMomentFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142039H0, viewGroup, false);
        m110165a(feedGroupNewestMomentFrag, viewInflate);
        return viewInflate;
    }
}

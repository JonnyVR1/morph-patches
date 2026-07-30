package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.newest.FeedGroupNewestMomentFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d6h {
    /* JADX INFO: renamed from: a */
    public static void m9350a(FeedGroupNewestMomentFrag feedGroupNewestMomentFrag, View view) {
        feedGroupNewestMomentFrag.f1569z = (LinearLayout) view;
        feedGroupNewestMomentFrag.f1560A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9351b(FeedGroupNewestMomentFrag feedGroupNewestMomentFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11058H0, viewGroup, false);
        m9350a(feedGroupNewestMomentFrag, viewInflate);
        return viewInflate;
    }
}

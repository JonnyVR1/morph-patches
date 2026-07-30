package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.newest.FeedGroupNewestMomentFrag;

/* JADX INFO: loaded from: classes13.dex */
public class s7h {
    /* JADX INFO: renamed from: a */
    public static void m185006a(FeedGroupNewestMomentFrag feedGroupNewestMomentFrag, View view) {
        feedGroupNewestMomentFrag.f40956z = (LinearLayout) view;
        feedGroupNewestMomentFrag.f40947A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m185007b(FeedGroupNewestMomentFrag feedGroupNewestMomentFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173508H0, viewGroup, false);
        m185006a(feedGroupNewestMomentFrag, viewInflate);
        return viewInflate;
    }
}

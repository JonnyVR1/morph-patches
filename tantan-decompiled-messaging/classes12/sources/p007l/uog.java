package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.newui.specialevents.christmas.FeedBannersView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uog {
    /* JADX INFO: renamed from: a */
    public static void m15125a(FeedBannersView feedBannersView, View view) {
        feedBannersView.f4160a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedBannersView.f4161b = viewGroup.getChildAt(0);
        feedBannersView.f4162c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15126b(FeedBannersView feedBannersView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11081L, viewGroup, false);
        m15125a(feedBannersView, viewInflate);
        return viewInflate;
    }
}

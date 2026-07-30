package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class d8h {
    /* JADX INFO: renamed from: a */
    public static void m9352a(FeedInteractionAct feedInteractionAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractionAct.f3448c = viewGroup.getChildAt(0);
        feedInteractionAct.f3449d = viewGroup.getChildAt(1);
        feedInteractionAct.f3450e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9353b(FeedInteractionAct feedInteractionAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11276p, viewGroup, false);
        m9352a(feedInteractionAct, viewInflate);
        return viewInflate;
    }
}

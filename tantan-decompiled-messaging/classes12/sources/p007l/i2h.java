package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i2h {
    /* JADX INFO: renamed from: a */
    public static void m10771a(FeedDraftView feedDraftView, View view) {
        feedDraftView.f3825d = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedDraftView.f3826e = viewGroup.getChildAt(0);
        feedDraftView.f3827f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedDraftView.f3828g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedDraftView.f3829h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedDraftView.f3830i = viewGroup.getChildAt(1);
        feedDraftView.f3831j = viewGroup.getChildAt(2);
        feedDraftView.f3832k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedDraftView.f3833l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10772b(FeedDraftView feedDraftView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11291r0, viewGroup, false);
        m10771a(feedDraftView, viewInflate);
        return viewInflate;
    }
}

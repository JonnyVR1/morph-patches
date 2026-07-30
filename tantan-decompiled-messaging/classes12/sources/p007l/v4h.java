package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.FeedGroupEntranceView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v4h {
    /* JADX INFO: renamed from: a */
    public static void m15340a(FeedGroupEntranceView feedGroupEntranceView, View view) {
        feedGroupEntranceView.f1421c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupEntranceView.f1422d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupEntranceView.f1423e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15341b(FeedGroupEntranceView feedGroupEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11040E0, viewGroup, false);
        m15340a(feedGroupEntranceView, viewInflate);
        return viewInflate;
    }
}

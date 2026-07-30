package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u8h {
    /* JADX INFO: renamed from: a */
    public static void m14787a(FeedInteractiveItemView feedInteractiveItemView, View view) {
        feedInteractiveItemView.f1588a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractiveItemView.f1589b = viewGroup.getChildAt(0);
        feedInteractiveItemView.f1590c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14788b(FeedInteractiveItemView feedInteractiveItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11136U0, viewGroup, false);
        m14787a(feedInteractiveItemView, viewInflate);
        return viewInflate;
    }
}

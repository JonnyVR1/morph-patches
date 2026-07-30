package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class eyh {
    /* JADX INFO: renamed from: a */
    public static void m9964a(FeedSelectStatusItem feedSelectStatusItem, View view) {
        feedSelectStatusItem.f4454c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectStatusItem.f4455d = viewGroup.getChildAt(0);
        feedSelectStatusItem.f4456e = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9965b(FeedSelectStatusItem feedSelectStatusItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11113Q1, viewGroup, false);
        m9964a(feedSelectStatusItem, viewInflate);
        return viewInflate;
    }
}

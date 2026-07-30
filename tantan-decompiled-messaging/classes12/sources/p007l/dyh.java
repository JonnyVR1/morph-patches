package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dyh {
    /* JADX INFO: renamed from: a */
    public static void m9587a(FeedSelectStatusItem feedSelectStatusItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectStatusItem.f4457f = viewGroup.getChildAt(0);
        feedSelectStatusItem.f4458g = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9588b(FeedSelectStatusItem feedSelectStatusItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11148W0, viewGroup, false);
        m9587a(feedSelectStatusItem, viewInflate);
        return viewInflate;
    }
}

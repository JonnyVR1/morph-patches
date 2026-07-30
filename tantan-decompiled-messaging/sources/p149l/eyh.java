package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import p147v.AutoVDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class eyh {
    /* JADX INFO: renamed from: a */
    public static void m118765a(FeedSelectStatusItem feedSelectStatusItem, View view) {
        feedSelectStatusItem.f42993c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectStatusItem.f42994d = (AutoVDraweeView) viewGroup.getChildAt(0);
        feedSelectStatusItem.f42995e = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m118766b(FeedSelectStatusItem feedSelectStatusItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142094Q1, viewGroup, false);
        m118765a(feedSelectStatusItem, viewInflate);
        return viewInflate;
    }
}

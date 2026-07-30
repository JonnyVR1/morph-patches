package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import p151v.AutoVDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class tzh {
    /* JADX INFO: renamed from: a */
    public static void m193661a(FeedSelectStatusItem feedSelectStatusItem, View view) {
        feedSelectStatusItem.f43841c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectStatusItem.f43842d = (AutoVDraweeView) viewGroup.getChildAt(0);
        feedSelectStatusItem.f43843e = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m193662b(FeedSelectStatusItem feedSelectStatusItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173563Q1, viewGroup, false);
        m193661a(feedSelectStatusItem, viewInflate);
        return viewInflate;
    }
}

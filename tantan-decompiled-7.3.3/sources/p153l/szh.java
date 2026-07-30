package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class szh {
    /* JADX INFO: renamed from: a */
    public static void m188646a(FeedSelectStatusItem feedSelectStatusItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectStatusItem.f43844f = (VDraweeView) viewGroup.getChildAt(0);
        feedSelectStatusItem.f43845g = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m188647b(FeedSelectStatusItem feedSelectStatusItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173598W0, viewGroup, false);
        m188646a(feedSelectStatusItem, viewInflate);
        return viewInflate;
    }
}

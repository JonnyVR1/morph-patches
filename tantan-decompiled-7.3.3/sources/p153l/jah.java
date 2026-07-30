package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class jah {
    /* JADX INFO: renamed from: a */
    public static void m144023a(FeedInteractiveItemView feedInteractiveItemView, View view) {
        feedInteractiveItemView.f40975a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractiveItemView.f40976b = (VDraweeView) viewGroup.getChildAt(0);
        feedInteractiveItemView.f40977c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m144024b(FeedInteractiveItemView feedInteractiveItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173586U0, viewGroup, false);
        m144023a(feedInteractiveItemView, viewInflate);
        return viewInflate;
    }
}

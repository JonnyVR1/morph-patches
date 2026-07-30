package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.interactive.FeedInteractiveItemView;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class u8h {
    /* JADX INFO: renamed from: a */
    public static void m192203a(FeedInteractiveItemView feedInteractiveItemView, View view) {
        feedInteractiveItemView.f40127a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractiveItemView.f40128b = (VDraweeView) viewGroup.getChildAt(0);
        feedInteractiveItemView.f40129c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m192204b(FeedInteractiveItemView feedInteractiveItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142117U0, viewGroup, false);
        m192203a(feedInteractiveItemView, viewInflate);
        return viewInflate;
    }
}

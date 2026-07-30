package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.GiftRedPacketView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class oxj {
    /* JADX INFO: renamed from: a */
    public static void m169715a(GiftRedPacketView giftRedPacketView, View view) {
        giftRedPacketView.f51650f = (GiftRedPacketView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        giftRedPacketView.f51651g = (VDraweeView) viewGroup.getChildAt(0);
        giftRedPacketView.f51652h = viewGroup.getChildAt(1);
        giftRedPacketView.f51653i = (VDraweeView) viewGroup.getChildAt(2);
        giftRedPacketView.f51654j = (TextView) viewGroup.getChildAt(3);
        giftRedPacketView.f51655k = (LinearLayout) viewGroup.getChildAt(4);
        giftRedPacketView.f51656l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        giftRedPacketView.f51657m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        giftRedPacketView.f51658n = viewGroup.getChildAt(5);
        giftRedPacketView.f51659o = (TextView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m169716b(GiftRedPacketView giftRedPacketView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199317y1, viewGroup, false);
        m169715a(giftRedPacketView, viewInflate);
        return viewInflate;
    }
}

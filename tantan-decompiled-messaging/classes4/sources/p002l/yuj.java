package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.GiftRedPacketView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yuj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m26938a(GiftRedPacketView giftRedPacketView, View view) {
        giftRedPacketView.f6844f = (GiftRedPacketView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        giftRedPacketView.f6845g = viewGroup.getChildAt(0);
        giftRedPacketView.f6846h = viewGroup.getChildAt(1);
        giftRedPacketView.f6847i = viewGroup.getChildAt(2);
        giftRedPacketView.f6848j = (TextView) viewGroup.getChildAt(3);
        giftRedPacketView.f6849k = (LinearLayout) viewGroup.getChildAt(4);
        giftRedPacketView.f6850l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        giftRedPacketView.f6851m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        giftRedPacketView.f6852n = viewGroup.getChildAt(5);
        giftRedPacketView.f6853o = (TextView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m26939b(GiftRedPacketView giftRedPacketView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20081y1, viewGroup, false);
        m26938a(giftRedPacketView, viewInflate);
        return viewInflate;
    }
}

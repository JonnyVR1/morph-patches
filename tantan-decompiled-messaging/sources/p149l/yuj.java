package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.GiftRedPacketView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class yuj {
    /* JADX INFO: renamed from: a */
    public static void m216112a(GiftRedPacketView giftRedPacketView, View view) {
        giftRedPacketView.f50802f = (GiftRedPacketView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        giftRedPacketView.f50803g = (VDraweeView) viewGroup.getChildAt(0);
        giftRedPacketView.f50804h = viewGroup.getChildAt(1);
        giftRedPacketView.f50805i = (VDraweeView) viewGroup.getChildAt(2);
        giftRedPacketView.f50806j = (TextView) viewGroup.getChildAt(3);
        giftRedPacketView.f50807k = (LinearLayout) viewGroup.getChildAt(4);
        giftRedPacketView.f50808l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        giftRedPacketView.f50809m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        giftRedPacketView.f50810n = viewGroup.getChildAt(5);
        giftRedPacketView.f50811o = (TextView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m216113b(GiftRedPacketView giftRedPacketView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168585y1, viewGroup, false);
        m216112a(giftRedPacketView, viewInflate);
        return viewInflate;
    }
}

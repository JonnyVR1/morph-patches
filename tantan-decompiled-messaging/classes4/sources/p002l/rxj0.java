package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.AnimEffectPlayerWithMatrix;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rxj0 {
    /* JADX INFO: renamed from: a */
    public static void m22146a(UserAnchorTicketView userAnchorTicketView, View view) {
        userAnchorTicketView._root_svg = (AnimEffectPlayerWithMatrix) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m22147b(UserAnchorTicketView userAnchorTicketView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20086y6, viewGroup, false);
        m22146a(userAnchorTicketView, viewInflate);
        return viewInflate;
    }
}

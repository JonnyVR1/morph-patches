package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.AnimEffectPlayerWithMatrix;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;

/* JADX INFO: loaded from: classes4.dex */
public class x6k0 {
    /* JADX INFO: renamed from: a */
    public static void m209507a(UserAnchorTicketView userAnchorTicketView, View view) {
        userAnchorTicketView._root_svg = (AnimEffectPlayerWithMatrix) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m209508b(UserAnchorTicketView userAnchorTicketView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199322y6, viewGroup, false);
        m209507a(userAnchorTicketView, viewInflate);
        return viewInflate;
    }
}

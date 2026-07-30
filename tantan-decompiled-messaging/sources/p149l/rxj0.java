package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.AnimEffectPlayerWithMatrix;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;

/* JADX INFO: loaded from: classes4.dex */
public class rxj0 {
    /* JADX INFO: renamed from: a */
    public static void m181611a(UserAnchorTicketView userAnchorTicketView, View view) {
        userAnchorTicketView._root_svg = (AnimEffectPlayerWithMatrix) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m181612b(UserAnchorTicketView userAnchorTicketView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168590y6, viewGroup, false);
        m181611a(userAnchorTicketView, viewInflate);
        return viewInflate;
    }
}

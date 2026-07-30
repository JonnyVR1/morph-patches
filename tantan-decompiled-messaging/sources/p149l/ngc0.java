package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftAudienceView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ngc0 {
    /* JADX INFO: renamed from: a */
    public static void m159293a(ReceiveGiftUsersView receiveGiftUsersView, View view) {
        receiveGiftUsersView._root = (ReceiveGiftUsersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftUsersView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        receiveGiftUsersView._all = (VText) viewGroup.getChildAt(1);
        receiveGiftUsersView._audienceView = (ReceiveGiftAudienceView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m159294b(ReceiveGiftUsersView receiveGiftUsersView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168572x1, viewGroup, false);
        m159293a(receiveGiftUsersView, viewInflate);
        return viewInflate;
    }
}

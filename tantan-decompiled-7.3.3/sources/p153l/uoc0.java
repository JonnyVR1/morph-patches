package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftAudienceView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uoc0 {
    /* JADX INFO: renamed from: a */
    public static void m196972a(ReceiveGiftUsersView receiveGiftUsersView, View view) {
        receiveGiftUsersView._root = (ReceiveGiftUsersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftUsersView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        receiveGiftUsersView._all = (VText) viewGroup.getChildAt(1);
        receiveGiftUsersView._audienceView = (ReceiveGiftAudienceView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m196973b(ReceiveGiftUsersView receiveGiftUsersView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199304x1, viewGroup, false);
        m196972a(receiveGiftUsersView, viewInflate);
        return viewInflate;
    }
}

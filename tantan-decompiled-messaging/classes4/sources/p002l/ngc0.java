package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftAudienceView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ngc0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m18752a(ReceiveGiftUsersView receiveGiftUsersView, View view) {
        receiveGiftUsersView._root = (ReceiveGiftUsersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        receiveGiftUsersView._recyclerView = viewGroup.getChildAt(0);
        receiveGiftUsersView._all = viewGroup.getChildAt(1);
        receiveGiftUsersView._audienceView = (ReceiveGiftAudienceView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m18753b(ReceiveGiftUsersView receiveGiftUsersView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20068x1, viewGroup, false);
        m18752a(receiveGiftUsersView, viewInflate);
        return viewInflate;
    }
}

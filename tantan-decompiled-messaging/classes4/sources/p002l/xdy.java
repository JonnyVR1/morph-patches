package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.voice.membermanager.requestsettlein.MemberRequestSettleInView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xdy {
    /* JADX INFO: renamed from: a */
    public static void m25898a(MemberRequestSettleInView memberRequestSettleInView, View view) {
        memberRequestSettleInView.d = (MemberRequestSettleInView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberRequestSettleInView.e = viewGroup.getChildAt(0);
        memberRequestSettleInView.f = viewGroup.getChildAt(1);
        memberRequestSettleInView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberRequestSettleInView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberSettleInPageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eey {
    /* JADX INFO: renamed from: a */
    public static void m12450a(MemberSettleInPageView memberSettleInPageView, View view) {
        memberSettleInPageView.d = (MemberSettleInPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberSettleInPageView.e = viewGroup.getChildAt(0);
        memberSettleInPageView.f = viewGroup.getChildAt(1);
        memberSettleInPageView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberSettleInPageView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

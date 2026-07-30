package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yby {
    /* JADX INFO: renamed from: a */
    public static void m26503a(MemberOnLinePageView memberOnLinePageView, View view) {
        memberOnLinePageView.d = (MemberOnLinePageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberOnLinePageView.e = viewGroup.getChildAt(0);
        memberOnLinePageView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        memberOnLinePageView.g = viewGroup.getChildAt(1);
        memberOnLinePageView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        memberOnLinePageView.i = viewGroup.getChildAt(2);
        memberOnLinePageView.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberOnLinePageView.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

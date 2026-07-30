package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.membermanager.requestmic.MemberRequestMicPageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ucy {
    /* JADX INFO: renamed from: a */
    public static void m23430a(MemberRequestMicPageView memberRequestMicPageView, View view) {
        memberRequestMicPageView.d = (MemberRequestMicPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberRequestMicPageView.e = viewGroup.getChildAt(0);
        memberRequestMicPageView.f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberRequestMicPageView.g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberRequestMicPageView.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        memberRequestMicPageView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        memberRequestMicPageView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        memberRequestMicPageView.k = viewGroup.getChildAt(1);
        memberRequestMicPageView.l = viewGroup.getChildAt(2);
        memberRequestMicPageView.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberRequestMicPageView.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

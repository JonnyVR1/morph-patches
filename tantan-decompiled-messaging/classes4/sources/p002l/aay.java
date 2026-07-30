package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.member.view.MemberLeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aay {
    /* JADX INFO: renamed from: a */
    public static void m9468a(MemberLeaderView memberLeaderView, View view) {
        memberLeaderView.f5278a = (MemberLeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberLeaderView.f5279b = viewGroup.getChildAt(0);
        memberLeaderView.f5280c = viewGroup.getChildAt(1);
        memberLeaderView.f5281d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

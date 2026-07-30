package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j5s {
    /* JADX INFO: renamed from: a */
    public static void m15665a(LiveCoverAct liveCoverAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCoverAct.f7236c = viewGroup.getChildAt(0);
        liveCoverAct.f7237d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveCoverAct.f7238e = view.findViewById(g5c0.f10809C2);
        ViewGroup viewGroup2 = (ViewGroup) view;
        liveCoverAct.f7239f = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        liveCoverAct.f7240g = ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        liveCoverAct.f7241h = ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        liveCoverAct.f7242i = ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
        liveCoverAct.f7243j = viewGroup2.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15666b(LiveCoverAct liveCoverAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19937n0, viewGroup, false);
        m15665a(liveCoverAct, viewInflate);
        return viewInflate;
    }
}

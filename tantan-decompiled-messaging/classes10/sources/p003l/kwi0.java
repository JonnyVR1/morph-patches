package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.toppicks.TopPicksAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kwi0 {
    /* JADX INFO: renamed from: a */
    public static void m7641a(TopPicksAct topPicksAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topPicksAct.c = (FrameLayout) viewGroup.getChildAt(0);
        topPicksAct.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7642b(TopPicksAct topPicksAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.q5, viewGroup, false);
        m7641a(topPicksAct, viewInflate);
        return viewInflate;
    }
}

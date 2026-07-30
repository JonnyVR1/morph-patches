package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jo3 {
    /* JADX INFO: renamed from: a */
    public static void m7434a(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzMarqueeRecyclerView.a = viewGroup.getChildAt(0);
        buzzMarqueeRecyclerView.b = viewGroup.getChildAt(1);
        buzzMarqueeRecyclerView.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7435b(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.h, viewGroup, true);
        m7434a(buzzMarqueeRecyclerView, viewInflate);
        return viewInflate;
    }
}

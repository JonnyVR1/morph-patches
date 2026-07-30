package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class jp3 {
    /* JADX INFO: renamed from: a */
    public static void m146484a(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzMarqueeRecyclerView._auto_rv1 = (RecyclerView) viewGroup.getChildAt(0);
        buzzMarqueeRecyclerView._auto_rv2 = (RecyclerView) viewGroup.getChildAt(1);
        buzzMarqueeRecyclerView._auto_rv3 = (RecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m146485b(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136473h, viewGroup, true);
        m146484a(buzzMarqueeRecyclerView, viewInflate);
        return viewInflate;
    }
}

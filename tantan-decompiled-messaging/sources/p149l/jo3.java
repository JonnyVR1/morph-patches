package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class jo3 {
    /* JADX INFO: renamed from: a */
    public static void m142413a(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzMarqueeRecyclerView._auto_rv1 = (RecyclerView) viewGroup.getChildAt(0);
        buzzMarqueeRecyclerView._auto_rv2 = (RecyclerView) viewGroup.getChildAt(1);
        buzzMarqueeRecyclerView._auto_rv3 = (RecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m142414b(BuzzMarqueeRecyclerView buzzMarqueeRecyclerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106031h, viewGroup, true);
        m142413a(buzzMarqueeRecyclerView, viewInflate);
        return viewInflate;
    }
}

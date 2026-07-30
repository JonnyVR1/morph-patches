package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionChooseView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fp3 {
    /* JADX INFO: renamed from: a */
    public static void m122555a(BuzzRegionChooseView buzzRegionChooseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzRegionChooseView._desc = (VText) viewGroup.getChildAt(0);
        buzzRegionChooseView._recycler_view = (VRecyclerView) viewGroup.getChildAt(1);
        buzzRegionChooseView._set_up = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m122556b(BuzzRegionChooseView buzzRegionChooseView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106034k, viewGroup, true);
        m122555a(buzzRegionChooseView, viewInflate);
        return viewInflate;
    }
}

package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionChooseView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fq3 {
    /* JADX INFO: renamed from: a */
    public static void m126727a(BuzzRegionChooseView buzzRegionChooseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzRegionChooseView._desc = (VText) viewGroup.getChildAt(0);
        buzzRegionChooseView._recycler_view = (VRecyclerView) viewGroup.getChildAt(1);
        buzzRegionChooseView._set_up = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m126728b(BuzzRegionChooseView buzzRegionChooseView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136476k, viewGroup, true);
        m126727a(buzzRegionChooseView, viewInflate);
        return viewInflate;
    }
}

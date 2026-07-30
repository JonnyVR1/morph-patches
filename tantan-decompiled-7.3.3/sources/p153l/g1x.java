package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g1x {
    /* JADX INFO: renamed from: a */
    public static void m128571a(e1x e1xVar, View view) {
        e1xVar.f91678c = (VScroll) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e1xVar.f91679d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e1xVar.f91680e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m128572b(e1x e1xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167555b0, viewGroup, false);
        m128571a(e1xVar, viewInflate);
        return viewInflate;
    }
}

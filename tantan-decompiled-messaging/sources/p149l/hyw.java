package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hyw {
    /* JADX INFO: renamed from: a */
    public static void m133625a(fyw fywVar, View view) {
        fywVar.f99907c = (VScroll) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fywVar.f99908d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fywVar.f99909e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m133626b(fyw fywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137341b0, viewGroup, false);
        m133625a(fywVar, viewInflate);
        return viewInflate;
    }
}

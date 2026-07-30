package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class s80 {
    /* JADX INFO: renamed from: a */
    public static void m185050a(r80 r80Var, View view) {
        r80Var.f161655a = (RecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m185051b(r80 r80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125397Ed, viewGroup, false);
        m185050a(r80Var, viewInflate);
        return viewInflate;
    }
}

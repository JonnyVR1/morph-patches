package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ofh {
    /* JADX INFO: renamed from: a */
    public static void m164068a(nfh nfhVar, View view) {
        nfhVar.f138785a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nfhVar.f138786b = (VLinear) viewGroup.getChildAt(0);
        nfhVar.f138787c = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nfhVar.f138788d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        nfhVar.f138789e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        nfhVar.f138790f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nfhVar.f138791g = (VText) viewGroup.getChildAt(1);
        nfhVar.f138792h = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m164069b(nfh nfhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142264q, viewGroup, false);
        m164068a(nfhVar, viewInflate);
        return viewInflate;
    }
}

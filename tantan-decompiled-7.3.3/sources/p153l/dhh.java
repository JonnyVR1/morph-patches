package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class dhh {
    /* JADX INFO: renamed from: a */
    public static void m115802a(chh chhVar, View view) {
        chhVar.f81824a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        chhVar.f81825b = (VLinear) viewGroup.getChildAt(0);
        chhVar.f81826c = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chhVar.f81827d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        chhVar.f81828e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        chhVar.f81829f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chhVar.f81830g = (VText) viewGroup.getChildAt(1);
        chhVar.f81831h = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m115803b(chh chhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173733q, viewGroup, false);
        m115802a(chhVar, viewInflate);
        return viewInflate;
    }
}

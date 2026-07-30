package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hle {
    /* JADX INFO: renamed from: a */
    public static void m135697a(gle gleVar, View view) {
        gleVar.f104840u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gleVar.f104841v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gleVar.f104842w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gleVar.f104843x = (LinearLayout) viewGroup.getChildAt(1);
        gleVar.f104844y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gleVar.f104845z = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135698b(gle gleVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125571Pa, viewGroup, false);
        m135697a(gleVar, viewInflate);
        return viewInflate;
    }
}

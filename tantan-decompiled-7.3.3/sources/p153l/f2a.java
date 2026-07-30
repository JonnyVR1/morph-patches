package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f2a {
    /* JADX INFO: renamed from: a */
    public static void m123605a(e2a e2aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e2aVar.f91710a = (LinearLayout) viewGroup.getChildAt(0);
        e2aVar.f91711b = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        e2aVar.f91712c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        e2aVar.f91713d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        e2aVar.f91714e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        e2aVar.f91715f = (GridView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        e2aVar.f91716g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        e2aVar.f91717h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        e2aVar.f91718i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        e2aVar.f91719j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        e2aVar.f91720k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123606b(e2a e2aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157060k2, viewGroup, false);
        m123605a(e2aVar, viewInflate);
        return viewInflate;
    }
}

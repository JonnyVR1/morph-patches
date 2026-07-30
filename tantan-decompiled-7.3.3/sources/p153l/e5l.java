package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e5l {
    /* JADX INFO: renamed from: a */
    public static void m119545a(d5l d5lVar, View view) {
        d5lVar.f85163f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d5lVar.f85164g = (VLinear) viewGroup.getChildAt(0);
        d5lVar.f85165h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d5lVar.f85166i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        d5lVar.f85167j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        d5lVar.f85168k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        d5lVar.f85169l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m119546b(d5l d5lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125465J0, viewGroup, false);
        m119545a(d5lVar, viewInflate);
        return viewInflate;
    }
}

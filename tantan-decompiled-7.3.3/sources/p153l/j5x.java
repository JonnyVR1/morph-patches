package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class j5x {
    /* JADX INFO: renamed from: a */
    public static void m143594a(i5x i5xVar, View view) {
        i5xVar.f113110f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        i5xVar.f113111g = (VImage) viewGroup.getChildAt(0);
        i5xVar.f113112h = (VText_Bold) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m143595b(i5x i5xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125778c7, viewGroup, false);
        m143594a(i5xVar, viewInflate);
        return viewInflate;
    }
}

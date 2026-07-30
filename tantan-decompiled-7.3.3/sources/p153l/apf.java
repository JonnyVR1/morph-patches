package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class apf {
    /* JADX INFO: renamed from: a */
    public static void m99315a(zof zofVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zofVar.f205336j = (VImage) viewGroup.getChildAt(0);
        zofVar.f205337k = (VDraweeView) viewGroup.getChildAt(1);
        zofVar.f205338l = (TextView) viewGroup.getChildAt(2);
        zofVar.f205339m = (TextView) viewGroup.getChildAt(3);
        zofVar.f205340n = (TextView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m99316b(zof zofVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125723Z2, viewGroup, false);
        m99315a(zofVar, viewInflate);
        return viewInflate;
    }
}

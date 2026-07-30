package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w1s {
    /* JADX INFO: renamed from: a */
    public static void m204470a(v1s v1sVar, View view) {
        v1sVar.f182003k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v1sVar.f182004l = viewGroup.getChildAt(0);
        v1sVar.f182005m = viewGroup.getChildAt(1);
        v1sVar.f182006n = viewGroup.getChildAt(2);
        v1sVar.f182007o = (VImage) viewGroup.getChildAt(3);
        v1sVar.f182008p = (VText) viewGroup.getChildAt(4);
        v1sVar.f182009q = (TextView) viewGroup.getChildAt(5);
        v1sVar.f182010r = viewGroup.getChildAt(6);
        v1sVar.f182011s = (VEditText) viewGroup.getChildAt(7);
        v1sVar.f182012t = (TextView) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m204471b(v1s v1sVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198739E, viewGroup, false);
        m204470a(v1sVar, viewInflate);
        return viewInflate;
    }
}

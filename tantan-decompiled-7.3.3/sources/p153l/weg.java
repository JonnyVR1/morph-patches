package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class weg {
    /* JADX INFO: renamed from: a */
    public static void m205993a(veg vegVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vegVar.f183764k = (VDraweeView) viewGroup.getChildAt(0);
        vegVar.f183765l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vegVar.f183766m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vegVar.f183767n = (VText) viewGroup.getChildAt(2);
    }
}

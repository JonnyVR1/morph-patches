package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;
import p151v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class afh {
    /* JADX INFO: renamed from: a */
    public static void m97335a(zeh zehVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zehVar.f204009a = (PhotoDraweeView) viewGroup.getChildAt(0);
        zehVar.f204010b = viewGroup.getChildAt(1);
        zehVar.f204011c = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m97336b(zeh zehVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173700l1, viewGroup, false);
        m97335a(zehVar, viewInflate);
        return viewInflate;
    }
}

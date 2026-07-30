package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;
import p147v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class ldh {
    /* JADX INFO: renamed from: a */
    public static void m149442a(kdh kdhVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kdhVar.f122558a = (PhotoDraweeView) viewGroup.getChildAt(0);
        kdhVar.f122559b = viewGroup.getChildAt(1);
        kdhVar.f122560c = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m149443b(kdh kdhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142231l1, viewGroup, false);
        m149442a(kdhVar, viewInflate);
        return viewInflate;
    }
}

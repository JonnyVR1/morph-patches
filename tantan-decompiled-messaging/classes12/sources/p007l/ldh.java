package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ldh {
    /* JADX INFO: renamed from: a */
    public static void m11637a(kdh kdhVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kdhVar.f9683a = viewGroup.getChildAt(0);
        kdhVar.f9684b = viewGroup.getChildAt(1);
        kdhVar.f9685c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11638b(kdh kdhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11250l1, viewGroup, false);
        m11637a(kdhVar, viewInflate);
        return viewInflate;
    }
}

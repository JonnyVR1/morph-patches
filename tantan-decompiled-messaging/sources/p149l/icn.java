package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class icn {
    /* JADX INFO: renamed from: a */
    public static void m135361a(hcn hcnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hcnVar._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hcnVar._positive_primary = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135362b(hcn hcnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95335E4, viewGroup, false);
        m135361a(hcnVar, viewInflate);
        return viewInflate;
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wcn {
    /* JADX INFO: renamed from: a */
    public static void m202668a(vcn vcnVar, View view) {
        vcnVar.f180967L = (VText) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m202669b(vcn vcnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168494r1, viewGroup, false);
        m202668a(vcnVar, viewInflate);
        return viewInflate;
    }
}

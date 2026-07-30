package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VCheckBox;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class ruz {
    /* JADX INFO: renamed from: a */
    public static void m181227a(quz quzVar, View view) {
        quzVar.f156562a = (VRelative) view;
        quzVar.f156563b = (VCheckBox) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181228b(quz quzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126567t2, viewGroup, false);
        m181227a(quzVar, viewInflate);
        return viewInflate;
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class zlr {
    /* JADX INFO: renamed from: a */
    public static void m219288a(xlr xlrVar, View view) {
        xlrVar.f193486a = (LinearLayout) view;
        xlrVar.f193487b = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m219289b(xlr xlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142025E4, viewGroup, false);
        m219288a(xlrVar, viewInflate);
        return viewInflate;
    }
}

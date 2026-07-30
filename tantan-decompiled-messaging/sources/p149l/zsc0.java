package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.report.C8828e;
import p147v.VButton;
import p147v.VEditText;
import p147v.VRecycler_Fixed;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zsc0 {
    /* JADX INFO: renamed from: a */
    public static void m220000a(C8828e c8828e, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8828e.f35551a = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8828e.f35552b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c8828e.f35553c = (VRecycler_Fixed) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        c8828e.f35554d = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        c8828e.f35555e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        c8828e.f35556f = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m220001b(C8828e c8828e, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95393He, viewGroup, false);
        m220000a(c8828e, viewInflate);
        return viewInflate;
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yne {
    /* JADX INFO: renamed from: a */
    public static void m215407a(xne xneVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xneVar.f193663u = (FrameLayout) viewGroup.getChildAt(0);
        xneVar.f193664v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xneVar.f193665w = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xneVar.f193666x = (VText) viewGroup.getChildAt(1);
        xneVar.f193667y = (FrameLayout) viewGroup.getChildAt(2);
        xneVar.f193668z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xneVar.f193656A = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xneVar.f193657B = (RecyclerView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m215408b(xne xneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96115z9, viewGroup, false);
        m215407a(xneVar, viewInflate);
        return viewInflate;
    }
}

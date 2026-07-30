package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes10.dex */
public class auz {
    /* JADX INFO: renamed from: a */
    public static void m99094a(ztz ztzVar, View view) {
        ztzVar.f204784a = (VMaterialEdit) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m99095b(ztz ztzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126525n2, viewGroup, false);
        m99094a(ztzVar, viewInflate);
        return viewInflate;
    }
}

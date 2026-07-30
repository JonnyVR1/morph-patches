package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes10.dex */
public class x200 {
    /* JADX INFO: renamed from: a */
    public static void m209124a(w200 w200Var, View view) {
        w200Var.f186856a = (VMaterialEdit) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m209125b(w200 w200Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157081n2, viewGroup, false);
        m209124a(w200Var, viewInflate);
        return viewInflate;
    }
}

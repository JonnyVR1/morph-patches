package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VButton_FakeShadow;
import p151v.VEditText;
import p151v.VMaterialEdit;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xy0 {
    /* JADX INFO: renamed from: a */
    public static void m213598a(wy0 wy0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wy0Var.f191553a = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        wy0Var.f191554b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        wy0Var.f191555c = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        wy0Var.f191556d = (VMaterialEdit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        wy0Var.f191557e = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m213599b(wy0 wy0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125416G, viewGroup, false);
        m213598a(wy0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m213600c(wy0 wy0Var) {
        wy0Var.f191553a = null;
        wy0Var.f191554b = null;
        wy0Var.f191555c = null;
        wy0Var.f191556d = null;
        wy0Var.f191557e = null;
    }
}

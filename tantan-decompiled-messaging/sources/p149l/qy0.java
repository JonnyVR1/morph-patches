package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VButton_FakeShadow;
import p147v.VEditText;
import p147v.VMaterialEdit;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qy0 {
    /* JADX INFO: renamed from: a */
    public static void m177018a(py0 py0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        py0Var.f151743a = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        py0Var.f151744b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        py0Var.f151745c = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        py0Var.f151746d = (VMaterialEdit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        py0Var.f151747e = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m177019b(py0 py0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95362G, viewGroup, false);
        m177018a(py0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m177020c(py0 py0Var) {
        py0Var.f151743a = null;
        py0Var.f151744b = null;
        py0Var.f151745c = null;
        py0Var.f151746d = null;
        py0Var.f151747e = null;
    }
}

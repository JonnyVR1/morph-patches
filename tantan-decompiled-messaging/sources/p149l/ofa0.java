package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ofa0 {
    /* JADX INFO: renamed from: a */
    public static void m164059a(nfa0 nfa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nfa0Var.f138706a = (VLinear) viewGroup.getChildAt(0);
        nfa0Var.f138707b = (VText) viewGroup.getChildAt(1);
        nfa0Var.f138708c = (VText) viewGroup.getChildAt(2);
        nfa0Var.f138709d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        nfa0Var.f138710e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        nfa0Var.f138711f = (ProfileLoopActionLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m164060b(nfa0 nfa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137286A0, viewGroup, false);
        m164059a(nfa0Var, viewInflate);
        return viewInflate;
    }
}

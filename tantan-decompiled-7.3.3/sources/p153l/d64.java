package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;

/* JADX INFO: loaded from: classes4.dex */
public class d64 {
    /* JADX INFO: renamed from: a */
    public static void m114366a(c64 c64Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c64Var.f79929a = viewGroup.getChildAt(0);
        c64Var.f79930b = (CallResultView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c64Var.f79931c = (CallResultView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c64Var.f79932d = (CallResultView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        c64Var.f79933e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m114367b(c64 c64Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198823L, viewGroup, false);
        m114366a(c64Var, viewInflate);
        return viewInflate;
    }
}

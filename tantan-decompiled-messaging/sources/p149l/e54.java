package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;

/* JADX INFO: loaded from: classes4.dex */
public class e54 {
    /* JADX INFO: renamed from: a */
    public static void m114779a(d54 d54Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d54Var.f84367a = viewGroup.getChildAt(0);
        d54Var.f84368b = (CallResultView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        d54Var.f84369c = (CallResultView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        d54Var.f84370d = (CallResultView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        d54Var.f84371e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m114780b(d54 d54Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168091L, viewGroup, false);
        m114779a(d54Var, viewInflate);
        return viewInflate;
    }
}

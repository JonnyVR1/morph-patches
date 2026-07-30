package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import p147v.VFrame;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes4.dex */
public class ggk0 {
    /* JADX INFO: renamed from: a */
    public static void m125985a(fgk0 fgk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fgk0Var.f97374a = (TextView) viewGroup.getChildAt(0);
        fgk0Var.f97375b = (TextView) viewGroup.getChildAt(1);
        fgk0Var.f97376c = (VFrame) viewGroup.getChildAt(2);
        fgk0Var.f97377d = (VSwitch) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        fgk0Var.f97378e = (RecyclerView) viewGroup.getChildAt(3);
        fgk0Var.f97379f = (EmptyView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m125986b(fgk0 fgk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168539u7, viewGroup, false);
        m125985a(fgk0Var, viewInflate);
        return viewInflate;
    }
}

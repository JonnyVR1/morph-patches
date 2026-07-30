package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p147v.VList;

/* JADX INFO: loaded from: classes12.dex */
public class us00 {
    /* JADX INFO: renamed from: a */
    public static void m195175a(ts00 ts00Var, View view) {
        ts00Var.f171886a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ts00Var.f171887b = (VList) viewGroup.getChildAt(0);
        ts00Var.f171888c = (FloatingActionButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m195176b(ts00 ts00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142332z4, viewGroup, false);
        m195175a(ts00Var, viewInflate);
        return viewInflate;
    }
}

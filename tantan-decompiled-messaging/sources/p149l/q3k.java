package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.admob.GoogleAdAct;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class q3k {
    /* JADX INFO: renamed from: a */
    public static void m172880a(GoogleAdAct googleAdAct, View view) {
        googleAdAct.f21259c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        googleAdAct.f21260d = (VImage) viewGroup.getChildAt(0);
        googleAdAct.f21261e = (VFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m172881b(GoogleAdAct googleAdAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95318D3, viewGroup, false);
        m172880a(googleAdAct, viewInflate);
        return viewInflate;
    }
}

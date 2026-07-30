package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;

/* JADX INFO: loaded from: classes4.dex */
public class lrl0 {
    /* JADX INFO: renamed from: a */
    public static void m151495a(krl0 krl0Var, View view) {
        krl0Var.f124368a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        krl0Var.f124369b = viewGroup.getChildAt(0);
        krl0Var.f124370c = (SvgAndImageView) viewGroup.getChildAt(1);
        krl0Var.f124371d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        krl0Var.f124372e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m151496b(krl0 krl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168146P6, viewGroup, false);
        m151495a(krl0Var, viewInflate);
        return viewInflate;
    }
}

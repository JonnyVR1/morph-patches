package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;

/* JADX INFO: loaded from: classes4.dex */
public class p0m0 {
    /* JADX INFO: renamed from: a */
    public static void m170167a(o0m0 o0m0Var, View view) {
        o0m0Var.f144557a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        o0m0Var.f144558b = viewGroup.getChildAt(0);
        o0m0Var.f144559c = (SvgAndImageView) viewGroup.getChildAt(1);
        o0m0Var.f144560d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        o0m0Var.f144561e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m170168b(o0m0 o0m0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198878P6, viewGroup, false);
        m170167a(o0m0Var, viewInflate);
        return viewInflate;
    }
}

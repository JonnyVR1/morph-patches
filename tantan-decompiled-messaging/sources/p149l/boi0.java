package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import p147v.VButton;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class boi0 {
    /* JADX INFO: renamed from: a */
    public static void m102946a(aoi0 aoi0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aoi0Var._close = (VButton) viewGroup.getChildAt(0);
        aoi0Var._avatar = (VDraweeView) viewGroup.getChildAt(1);
        aoi0Var._id = (TextView) viewGroup.getChildAt(2);
        aoi0Var._desc = (TextView) viewGroup.getChildAt(3);
        aoi0Var._confirm = (RoundButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m102947b(aoi0 aoi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95526Q3, viewGroup, false);
        m102946a(aoi0Var, viewInflate);
        return viewInflate;
    }
}

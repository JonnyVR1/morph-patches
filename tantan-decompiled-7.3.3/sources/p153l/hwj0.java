package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.CircularProgressView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hwj0 {
    /* JADX INFO: renamed from: a */
    public static void m137475a(gwj0 gwj0Var, View view) {
        gwj0Var.f106839i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gwj0Var.f106840j = (VText) viewGroup.getChildAt(0);
        gwj0Var.f106841k = (VFrame) viewGroup.getChildAt(1);
        gwj0Var.f106842l = (CircularProgressView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gwj0Var.f106843m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gwj0Var.f106844n = (VText) viewGroup.getChildAt(2);
        gwj0Var.f106845o = (VText) viewGroup.getChildAt(3);
        gwj0Var.f106846p = (VText) viewGroup.getChildAt(4);
        gwj0Var.f106847q = (VText) viewGroup.getChildAt(5);
    }
}

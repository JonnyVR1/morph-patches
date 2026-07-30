package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VButton;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nz2 {
    /* JADX INFO: renamed from: a */
    public static void m165364a(mz2 mz2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mz2Var.f139453a = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mz2Var.f139454b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mz2Var.f139455c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mz2Var.f139456d = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        mz2Var.f139457e = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        mz2Var.f139458f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        mz2Var.f139459g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        mz2Var.f139460h = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        mz2Var.f139461i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        mz2Var.f139462j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mz2Var.f139463k = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m165365b(mz2 mz2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126029r4, viewGroup, false);
        m165364a(mz2Var, viewInflate);
        return viewInflate;
    }
}

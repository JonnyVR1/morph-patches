package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.view.MaximumScroll;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class loo0 {
    /* JADX INFO: renamed from: a */
    public static void m155093a(koo0 koo0Var, View view) {
        koo0Var.f127771a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        koo0Var.f127772b = viewGroup.getChildAt(0);
        koo0Var.f127773c = (RelativeLayout) viewGroup.getChildAt(1);
        koo0Var.f127774d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        koo0Var.f127775e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        koo0Var.f127776f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        koo0Var.f127777g = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        koo0Var.f127778h = (MaximumScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        koo0Var.f127779i = (FlowLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        koo0Var.f127780j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        koo0Var.f127781k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m155094b(koo0 koo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199065e9, viewGroup, false);
        m155093a(koo0Var, viewInflate);
        return viewInflate;
    }
}

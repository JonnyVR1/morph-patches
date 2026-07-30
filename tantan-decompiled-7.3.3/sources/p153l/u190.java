package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.legacy.widget.Space;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u190 {
    /* JADX INFO: renamed from: a */
    public static void m193948a(t190 t190Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t190Var.f171612a = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        t190Var.f171613b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        t190Var.f171614c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        t190Var.f171615d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        t190Var.f171616e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        t190Var.f171617f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        t190Var.f171618g = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        t190Var.f171619h = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        t190Var.f171620i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}

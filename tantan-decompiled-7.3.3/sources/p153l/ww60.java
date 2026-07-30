package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.newui.view.CoreAutoScrollTextView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class ww60 {
    /* JADX INFO: renamed from: a */
    public static void m208153a(vw60 vw60Var, View view) {
        vw60Var.f186078a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vw60Var.f186079b = (VNavigationBar) viewGroup.getChildAt(0);
        vw60Var.f186080c = (FrameLayout) viewGroup.getChildAt(1);
        vw60Var.f186081d = (VFrame) viewGroup.getChildAt(2);
        vw60Var.f186082e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        vw60Var.f186083f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vw60Var.f186084g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vw60Var.f186085h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        vw60Var.f186086i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        vw60Var.f186087j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        vw60Var.f186088k = (VRelative) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vw60Var.f186089l = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        vw60Var.f186090m = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        vw60Var.f186091n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        vw60Var.f186092o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        vw60Var.f186093p = (VRelative) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vw60Var.f186094q = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        vw60Var.f186095r = (ConstraintLayout) viewGroup.getChildAt(3);
        vw60Var.f186096s = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        vw60Var.f186097t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        vw60Var.f186098u = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        vw60Var.f186099v = (CoreAutoScrollTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        vw60Var.f186100w = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        vw60Var.f186101x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m208154b(vw60 vw60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173575S1, viewGroup, false);
        m208153a(vw60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m208155c(vw60 vw60Var) {
        vw60Var.f186078a = null;
        vw60Var.f186079b = null;
        vw60Var.f186080c = null;
        vw60Var.f186081d = null;
        vw60Var.f186082e = null;
        vw60Var.f186083f = null;
        vw60Var.f186084g = null;
        vw60Var.f186085h = null;
        vw60Var.f186086i = null;
        vw60Var.f186087j = null;
        vw60Var.f186088k = null;
        vw60Var.f186089l = null;
        vw60Var.f186090m = null;
        vw60Var.f186091n = null;
        vw60Var.f186092o = null;
        vw60Var.f186093p = null;
        vw60Var.f186094q = null;
        vw60Var.f186095r = null;
        vw60Var.f186096s = null;
        vw60Var.f186097t = null;
        vw60Var.f186098u = null;
        vw60Var.f186099v = null;
        vw60Var.f186100w = null;
        vw60Var.f186101x = null;
    }
}

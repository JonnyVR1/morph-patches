package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.newui.view.CoreAutoScrollTextView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class qo60 {
    /* JADX INFO: renamed from: a */
    public static void m175721a(po60 po60Var, View view) {
        po60Var.f150464a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        po60Var.f150465b = (VNavigationBar) viewGroup.getChildAt(0);
        po60Var.f150466c = (FrameLayout) viewGroup.getChildAt(1);
        po60Var.f150467d = (VFrame) viewGroup.getChildAt(2);
        po60Var.f150468e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        po60Var.f150469f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        po60Var.f150470g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        po60Var.f150471h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        po60Var.f150472i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        po60Var.f150473j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        po60Var.f150474k = (VRelative) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        po60Var.f150475l = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        po60Var.f150476m = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        po60Var.f150477n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        po60Var.f150478o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        po60Var.f150479p = (VRelative) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        po60Var.f150480q = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        po60Var.f150481r = (ConstraintLayout) viewGroup.getChildAt(3);
        po60Var.f150482s = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        po60Var.f150483t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        po60Var.f150484u = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        po60Var.f150485v = (CoreAutoScrollTextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        po60Var.f150486w = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        po60Var.f150487x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m175722b(po60 po60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142106S1, viewGroup, false);
        m175721a(po60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m175723c(po60 po60Var) {
        po60Var.f150464a = null;
        po60Var.f150465b = null;
        po60Var.f150466c = null;
        po60Var.f150467d = null;
        po60Var.f150468e = null;
        po60Var.f150469f = null;
        po60Var.f150470g = null;
        po60Var.f150471h = null;
        po60Var.f150472i = null;
        po60Var.f150473j = null;
        po60Var.f150474k = null;
        po60Var.f150475l = null;
        po60Var.f150476m = null;
        po60Var.f150477n = null;
        po60Var.f150478o = null;
        po60Var.f150479p = null;
        po60Var.f150480q = null;
        po60Var.f150481r = null;
        po60Var.f150482s = null;
        po60Var.f150483t = null;
        po60Var.f150484u = null;
        po60Var.f150485v = null;
        po60Var.f150486w = null;
        po60Var.f150487x = null;
    }
}

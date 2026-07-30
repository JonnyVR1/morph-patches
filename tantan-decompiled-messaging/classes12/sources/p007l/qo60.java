package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qo60 {
    /* JADX INFO: renamed from: a */
    public static void m13676a(po60 po60Var, View view) {
        po60Var.f11905a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        po60Var.f11906b = viewGroup.getChildAt(0);
        po60Var.f11907c = (FrameLayout) viewGroup.getChildAt(1);
        po60Var.f11908d = viewGroup.getChildAt(2);
        po60Var.f11909e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        po60Var.f11910f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        po60Var.f11911g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        po60Var.f11912h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        po60Var.f11913i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        po60Var.f11914j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        po60Var.f11915k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        po60Var.f11916l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        po60Var.f11917m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        po60Var.f11918n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        po60Var.f11919o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        po60Var.f11920p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        po60Var.f11921q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        po60Var.f11922r = viewGroup.getChildAt(3);
        po60Var.f11923s = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        po60Var.f11924t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        po60Var.f11925u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        po60Var.f11926v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        po60Var.f11927w = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        po60Var.f11928x = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m13677b(po60 po60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11125S1, viewGroup, false);
        m13676a(po60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m13678c(po60 po60Var) {
        po60Var.f11905a = null;
        po60Var.f11906b = null;
        po60Var.f11907c = null;
        po60Var.f11908d = null;
        po60Var.f11909e = null;
        po60Var.f11910f = null;
        po60Var.f11911g = null;
        po60Var.f11912h = null;
        po60Var.f11913i = null;
        po60Var.f11914j = null;
        po60Var.f11915k = null;
        po60Var.f11916l = null;
        po60Var.f11917m = null;
        po60Var.f11918n = null;
        po60Var.f11919o = null;
        po60Var.f11920p = null;
        po60Var.f11921q = null;
        po60Var.f11922r = null;
        po60Var.f11923s = null;
        po60Var.f11924t = null;
        po60Var.f11925u = null;
        po60Var.f11926v = null;
        po60Var.f11927w = null;
        po60Var.f11928x = null;
    }
}

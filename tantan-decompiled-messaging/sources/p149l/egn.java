package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class egn {
    /* JADX INFO: renamed from: a */
    public static void m116296a(dgn dgnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dgnVar.f86118R = (VFrame) viewGroup.getChildAt(0);
        dgnVar.f86119S = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dgnVar.f86120T = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dgnVar.f86121U = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        dgnVar.f86122V = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        dgnVar.f86123W = (VFrame) viewGroup.getChildAt(1);
        dgnVar.f86124X = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dgnVar.f86125Y = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dgnVar.f86126Z = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        dgnVar.f86127a0 = (VText) viewGroup.getChildAt(2);
        dgnVar.f86128b0 = (TextView) viewGroup.getChildAt(3);
    }
}

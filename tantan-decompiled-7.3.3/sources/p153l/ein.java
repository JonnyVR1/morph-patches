package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ein {
    /* JADX INFO: renamed from: a */
    public static void m120938a(din dinVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dinVar.f88667R = (VFrame) viewGroup.getChildAt(0);
        dinVar.f88668S = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dinVar.f88669T = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dinVar.f88670U = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        dinVar.f88671V = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        dinVar.f88672W = (VFrame) viewGroup.getChildAt(1);
        dinVar.f88673X = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dinVar.f88674Y = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dinVar.f88675Z = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        dinVar.f88676a0 = (VText) viewGroup.getChildAt(2);
        dinVar.f88677b0 = (TextView) viewGroup.getChildAt(3);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class szz {
    /* JADX INFO: renamed from: a */
    public static void m188688a(qzz qzzVar, View view) {
        qzzVar.f160380a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qzzVar.f160382b = (RelativeLayout) viewGroup.getChildAt(0);
        qzzVar.f160384c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qzzVar.f160386d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qzzVar.f160388e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        qzzVar.f160390f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        qzzVar.f160392g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qzzVar.f160394h = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}

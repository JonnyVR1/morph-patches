package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eoo {
    /* JADX INFO: renamed from: a */
    public static void m121755a(doo dooVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dooVar.f89979a = (LinearLayout) viewGroup.getChildAt(0);
        dooVar.f89980b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dooVar.f89981c = (VLinear) viewGroup.getChildAt(1);
        dooVar.f89982d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dooVar.f89983e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dooVar.f89984f = (VText) viewGroup.getChildAt(2);
    }
}

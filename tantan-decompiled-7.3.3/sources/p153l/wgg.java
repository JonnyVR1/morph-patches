package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wgg {
    /* JADX INFO: renamed from: a */
    public static void m206194a(vgg vggVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vggVar.f184027k = (VText) viewGroup.getChildAt(0);
        vggVar.f184028l = (VText) viewGroup.getChildAt(1);
        vggVar.f184029m = (VLinear) viewGroup.getChildAt(4);
        vggVar.f184030n = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        vggVar.f184031o = (VText) viewGroup.getChildAt(5);
    }
}

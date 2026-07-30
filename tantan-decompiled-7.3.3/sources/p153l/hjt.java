package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hjt {
    /* JADX INFO: renamed from: a */
    public static void m135525a(gjt gjtVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gjtVar.f104667a = (VDraweeView) viewGroup.getChildAt(0);
        gjtVar.f104668b = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gjtVar.f104669c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gjtVar.f104670d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gjtVar.f104671e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        gjtVar.f104672f = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gjtVar.f104673g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        gjtVar.f104674h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        gjtVar.f104675i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        gjtVar.f104676j = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gjtVar.f104677k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        gjtVar.f104678l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        gjtVar.f104679m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
    }
}

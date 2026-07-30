package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rxm {
    /* JADX INFO: renamed from: a */
    public static void m183554a(qxm qxmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qxmVar.f160054a = (AutoVDraweeView) viewGroup.getChildAt(0);
        qxmVar.f160055b = (VImage) viewGroup.getChildAt(1);
        qxmVar.f160056c = (VRelative) viewGroup.getChildAt(2);
        qxmVar.f160057d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qxmVar.f160058e = (VImage) viewGroup.getChildAt(3);
        qxmVar.f160059f = (VText) viewGroup.getChildAt(4);
        qxmVar.f160060g = (VText) viewGroup.getChildAt(5);
    }
}

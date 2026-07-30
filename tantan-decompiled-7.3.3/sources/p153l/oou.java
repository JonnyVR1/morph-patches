package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class oou {
    /* JADX INFO: renamed from: a */
    public static void m168600a(nou nouVar, View view) {
        nouVar.f143036a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nouVar.f143037b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nouVar.f143038c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nouVar.f143039d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nouVar.f143040e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        nouVar.f143041f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        nouVar.f143042g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ghj {
    /* JADX INFO: renamed from: a */
    public static void m130252a(fhj fhjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fhjVar.f99057R = (VFrame) viewGroup.getChildAt(0);
        fhjVar.f99058S = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fhjVar.f99059T = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fhjVar.f99060U = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        fhjVar.f99061V = (VText) viewGroup.getChildAt(1);
        fhjVar.f99062W = (TextView) viewGroup.getChildAt(2);
    }
}

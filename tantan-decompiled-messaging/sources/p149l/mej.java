package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mej {
    /* JADX INFO: renamed from: a */
    public static void m154224a(lej lejVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lejVar.f127688R = (VFrame) viewGroup.getChildAt(0);
        lejVar.f127689S = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        lejVar.f127690T = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        lejVar.f127691U = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        lejVar.f127692V = (VText) viewGroup.getChildAt(1);
        lejVar.f127693W = (TextView) viewGroup.getChildAt(2);
    }
}

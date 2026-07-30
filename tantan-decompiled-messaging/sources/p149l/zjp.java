package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zjp {
    /* JADX INFO: renamed from: a */
    public static void m219127a(yjp yjpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yjpVar.f198648a = (VRelative) viewGroup.getChildAt(0);
        yjpVar.f198649b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yjpVar.f198650c = (VText) viewGroup.getChildAt(1);
        yjpVar.f198651d = (VText) viewGroup.getChildAt(2);
    }
}

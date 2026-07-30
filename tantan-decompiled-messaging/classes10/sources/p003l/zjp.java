package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.yjp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zjp {
    /* JADX INFO: renamed from: a */
    public static void m11429a(yjp yjpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yjpVar.a = viewGroup.getChildAt(0);
        yjpVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yjpVar.c = viewGroup.getChildAt(1);
        yjpVar.d = viewGroup.getChildAt(2);
    }
}

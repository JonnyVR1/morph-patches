package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.f;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ish0 {
    /* JADX INFO: renamed from: a */
    public static void m7293a(f fVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fVar.d = viewGroup.getChildAt(0);
        fVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}

package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.report.e;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zsc0 {
    /* JADX INFO: renamed from: a */
    public static void m11448a(e eVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        eVar.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        eVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        eVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        eVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        eVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        eVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m11449b(e eVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.He, viewGroup, false);
        m11448a(eVar, viewInflate);
        return viewInflate;
    }
}

package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.anim.view.a;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y840 {
    /* JADX INFO: renamed from: a */
    public static void m11160a(a aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.b = viewGroup.getChildAt(0);
        aVar.c = viewGroup.getChildAt(1);
        aVar.d = viewGroup.getChildAt(2);
        aVar.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        aVar.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        aVar.g = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m11161b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.nb, viewGroup, true);
        m11160a(aVar, viewInflate);
        return viewInflate;
    }
}

package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x5l {
    /* JADX INFO: renamed from: a */
    public static void m10645a(v5l v5lVar, View view) {
        v5lVar.f7865f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v5lVar.f7866g = viewGroup.getChildAt(0);
        v5lVar.f7867h = viewGroup.getChildAt(1);
        v5lVar.f7868i = viewGroup.getChildAt(2);
        v5lVar.f7869j = viewGroup.getChildAt(3);
        v5lVar.f7870k = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10646b(v5l v5lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.d4, viewGroup, false);
        m10645a(v5lVar, viewInflate);
        return viewInflate;
    }
}

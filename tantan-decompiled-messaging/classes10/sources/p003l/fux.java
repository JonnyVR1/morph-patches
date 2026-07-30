package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.eux;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fux {
    /* JADX INFO: renamed from: a */
    public static void m6516a(eux euxVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        euxVar.a = viewGroup.getChildAt(0);
        euxVar.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6517b(eux euxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Wd, viewGroup, false);
        m6516a(euxVar, viewInflate);
        return viewInflate;
    }
}

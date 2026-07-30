package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.v2c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w2c {
    /* JADX INFO: renamed from: a */
    public static void m10433a(v2c v2cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        v2cVar.a = viewGroup.getChildAt(0);
        v2cVar.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        v2cVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        v2cVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10434b(v2c v2cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.e2, viewGroup, false);
        m10433a(v2cVar, viewInflate);
        return viewInflate;
    }
}

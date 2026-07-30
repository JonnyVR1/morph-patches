package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import l.izf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kzf {
    /* JADX INFO: renamed from: a */
    public static void m7647a(izf izfVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        izfVar.b = viewGroup.getChildAt(0);
        izfVar.c = viewGroup.getChildAt(1);
        izfVar.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        izfVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        izfVar.f = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7648b(izf izfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5479M0, viewGroup, false);
        m7647a(izfVar, viewInflate);
        return viewInflate;
    }
}

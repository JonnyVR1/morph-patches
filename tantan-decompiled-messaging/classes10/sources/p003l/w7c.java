package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w7c {
    /* JADX INFO: renamed from: a */
    public static void m10451a(v7c v7cVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        v7cVar.f7908f = viewGroup.getChildAt(0);
        v7cVar.f7909g = viewGroup.getChildAt(1);
        v7cVar.f7910h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        v7cVar.f7911i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        v7cVar.f7912j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        v7cVar.f7913k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        v7cVar.f7914l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10452b(v7c v7cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.g2, viewGroup, false);
        m10451a(v7cVar, viewInflate);
        return viewInflate;
    }
}

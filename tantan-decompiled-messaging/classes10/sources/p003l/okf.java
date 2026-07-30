package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import l.f6c0;
import l.nkf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class okf {
    /* JADX INFO: renamed from: a */
    public static void m8499a(nkf nkfVar, View view) {
        nkfVar.a = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nkfVar.b = viewGroup.getChildAt(0);
        nkfVar.c = viewGroup.getChildAt(1);
        nkfVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nkfVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nkfVar.f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8500b(nkf nkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.T2, viewGroup, false);
        m8499a(nkfVar, viewInflate);
        return viewInflate;
    }
}

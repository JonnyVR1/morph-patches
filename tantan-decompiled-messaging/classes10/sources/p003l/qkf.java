package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import l.f6c0;
import l.pkf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qkf {
    /* JADX INFO: renamed from: a */
    public static void m9010a(pkf pkfVar, View view) {
        pkfVar.a = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkfVar.b = viewGroup.getChildAt(0);
        pkfVar.c = viewGroup.getChildAt(1);
        pkfVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pkfVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkfVar.f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9011b(pkf pkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.U2, viewGroup, false);
        m9010a(pkfVar, viewInflate);
        return viewInflate;
    }
}

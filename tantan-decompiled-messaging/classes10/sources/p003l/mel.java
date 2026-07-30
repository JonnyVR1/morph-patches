package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.agreement.a;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mel {
    /* JADX INFO: renamed from: a */
    public static void m8143a(a aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.b = (LinearLayout) viewGroup.getChildAt(0);
        aVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8144b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.v2, viewGroup, false);
        m8143a(aVar, viewInflate);
        return viewInflate;
    }
}

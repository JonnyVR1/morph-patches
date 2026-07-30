package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.pop.BaseBuzzNotifyPop;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sf2 {
    /* JADX INFO: renamed from: a */
    public static void m9338a(BaseBuzzNotifyPop baseBuzzNotifyPop, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        baseBuzzNotifyPop.d = viewGroup.getChildAt(0);
        baseBuzzNotifyPop.e = viewGroup.getChildAt(1);
        baseBuzzNotifyPop.f = viewGroup.getChildAt(2);
        baseBuzzNotifyPop.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        baseBuzzNotifyPop.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        baseBuzzNotifyPop.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        baseBuzzNotifyPop.j = viewGroup.getChildAt(3);
        baseBuzzNotifyPop.k = viewGroup.getChildAt(4);
        baseBuzzNotifyPop.l = viewGroup.getChildAt(5);
        baseBuzzNotifyPop.m = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m9339b(BaseBuzzNotifyPop baseBuzzNotifyPop, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.A, viewGroup, true);
        m9338a(baseBuzzNotifyPop, viewInflate);
        return viewInflate;
    }
}

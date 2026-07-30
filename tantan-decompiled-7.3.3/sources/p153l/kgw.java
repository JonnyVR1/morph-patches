package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class kgw {
    /* JADX INFO: renamed from: a */
    public static void m149762a(jgw jgwVar, View view) {
        jgwVar.f120773f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jgwVar.f120774g = (VImage) viewGroup.getChildAt(0);
        jgwVar.f120775h = (VDraweeView) viewGroup.getChildAt(4);
        jgwVar.f120776i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        jgwVar.f120777j = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m149763b(jgw jgwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167509F, viewGroup, false);
        m149762a(jgwVar, viewInflate);
        return viewInflate;
    }
}

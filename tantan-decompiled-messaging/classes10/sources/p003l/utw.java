package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import l.f6c0;
import l.ttw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class utw {
    /* JADX INFO: renamed from: a */
    public static void m9783a(ttw ttwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ttwVar.g = (FrameLayout) viewGroup.getChildAt(0);
        ttwVar.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ttwVar.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ttwVar.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ttwVar.k = viewGroup.getChildAt(1);
        ttwVar.l = viewGroup.getChildAt(2);
        ttwVar.m = viewGroup.getChildAt(3);
        ttwVar.n = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        ttwVar.o = (FrameLayout) viewGroup.getChildAt(4);
        ttwVar.p = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9784b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Jd, viewGroup, false);
        m9783a(ttwVar, viewInflate);
        return viewInflate;
    }
}

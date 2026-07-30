package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.f6c0;
import l.mzk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nzk {
    /* JADX INFO: renamed from: a */
    public static void m8381a(mzk mzkVar, View view) {
        mzkVar.b = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mzkVar.c = viewGroup.getChildAt(0);
        mzkVar.d = viewGroup.getChildAt(1);
        mzkVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mzkVar.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mzkVar.g = viewGroup.getChildAt(2);
        mzkVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        mzkVar.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mzkVar.j = viewGroup.getChildAt(3);
        mzkVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        mzkVar.l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8382b(mzk mzkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.I4, viewGroup, false);
        m8381a(mzkVar, viewInflate);
        return viewInflate;
    }
}

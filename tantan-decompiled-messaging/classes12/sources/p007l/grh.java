package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class grh {
    /* JADX INFO: renamed from: a */
    public static void m10493a(frh frhVar, View view) {
        frhVar.f8200a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        frhVar.f8201b = viewGroup.getChildAt(0);
        frhVar.f8202c = (RelativeLayout) viewGroup.getChildAt(1);
        frhVar.f8203d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        frhVar.f8204e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        frhVar.f8205f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        frhVar.f8206g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        frhVar.f8207h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        frhVar.f8208i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        frhVar.f8209j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        frhVar.f8210k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m10494b(frh frhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11258m2, viewGroup, false);
        m10493a(frhVar, viewInflate);
        return viewInflate;
    }
}

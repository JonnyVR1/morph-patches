package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nai {
    /* JADX INFO: renamed from: a */
    public static void m12133a(mai maiVar, View view) {
        maiVar.f10375a = view.findViewById(b5c0.f5960F0);
        ViewGroup viewGroup = (ViewGroup) view;
        maiVar.f10376b = viewGroup.getChildAt(0);
        maiVar.f10377c = (FrameLayout) viewGroup.getChildAt(1);
        maiVar.f10378d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        maiVar.f10379e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        maiVar.f10380f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        maiVar.f10381g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        maiVar.f10382h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m12134b(mai maiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11103O3, viewGroup, false);
        m12133a(maiVar, viewInflate);
        return viewInflate;
    }
}

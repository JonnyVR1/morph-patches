package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import p147v.VImage;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class axp {
    /* JADX INFO: renamed from: a */
    public static void m99514a(zwp zwpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zwpVar.f205250a = (VNavigationBar) viewGroup.getChildAt(0);
        zwpVar.f205251b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        zwpVar.f205252c = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m99515b(zwp zwpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95391Hc, viewGroup, false);
        m99514a(zwpVar, viewInflate);
        return viewInflate;
    }
}

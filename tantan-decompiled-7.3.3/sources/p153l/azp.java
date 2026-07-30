package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import p151v.VImage;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class azp {
    /* JADX INFO: renamed from: a */
    public static void m101078a(zyp zypVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zypVar.f206622a = (VNavigationBar) viewGroup.getChildAt(0);
        zypVar.f206623b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        zypVar.f206624c = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m101079b(zyp zypVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125557Oc, viewGroup, false);
        m101078a(zypVar, viewInflate);
        return viewInflate;
    }
}

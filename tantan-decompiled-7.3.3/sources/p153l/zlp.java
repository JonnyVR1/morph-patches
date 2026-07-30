package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zlp {
    /* JADX INFO: renamed from: a */
    public static void m220294a(ylp ylpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ylpVar.f200570a = (VRelative) viewGroup.getChildAt(0);
        ylpVar.f200571b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ylpVar.f200572c = (VText) viewGroup.getChildAt(1);
        ylpVar.f200573d = (VText) viewGroup.getChildAt(2);
    }
}

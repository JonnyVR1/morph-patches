package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class idg {
    /* JADX INFO: renamed from: a */
    public static void m135445a(hdg hdgVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hdgVar.f107238k = (VDraweeView) viewGroup.getChildAt(0);
        hdgVar.f107239l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hdgVar.f107240m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hdgVar.f107241n = (VText) viewGroup.getChildAt(2);
    }
}

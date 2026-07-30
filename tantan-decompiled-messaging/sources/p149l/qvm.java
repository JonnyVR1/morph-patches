package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qvm {
    /* JADX INFO: renamed from: a */
    public static void m176707a(pvm pvmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pvmVar.f151484a = (AutoVDraweeView) viewGroup.getChildAt(0);
        pvmVar.f151485b = (VImage) viewGroup.getChildAt(1);
        pvmVar.f151486c = (VRelative) viewGroup.getChildAt(2);
        pvmVar.f151487d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pvmVar.f151488e = (VImage) viewGroup.getChildAt(3);
        pvmVar.f151489f = (VText) viewGroup.getChildAt(4);
        pvmVar.f151490g = (VText) viewGroup.getChildAt(5);
    }
}

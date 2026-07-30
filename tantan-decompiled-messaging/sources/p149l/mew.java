package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class mew {
    /* JADX INFO: renamed from: a */
    public static void m154314a(lew lewVar, View view) {
        lewVar.f127757f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lewVar.f127758g = (VImage) viewGroup.getChildAt(0);
        lewVar.f127759h = (VDraweeView) viewGroup.getChildAt(4);
        lewVar.f127760i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        lewVar.f127761j = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m154315b(lew lewVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137295F, viewGroup, false);
        m154314a(lewVar, viewInflate);
        return viewInflate;
    }
}

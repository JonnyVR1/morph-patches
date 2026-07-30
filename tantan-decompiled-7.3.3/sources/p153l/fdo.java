package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fdo {
    /* JADX INFO: renamed from: a */
    public static void m125127a(edo edoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        edoVar.f93560a = (VFrame) viewGroup.getChildAt(0);
        edoVar.f93561b = (LinearLayout) viewGroup.getChildAt(1);
        edoVar.f93562c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m125128b(edo edoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125510Ld, viewGroup, false);
        m125127a(edoVar, viewInflate);
        return viewInflate;
    }
}

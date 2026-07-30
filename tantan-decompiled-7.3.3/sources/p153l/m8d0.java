package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m8d0 {
    /* JADX INFO: renamed from: a */
    public static void m157357a(l8d0 l8d0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        l8d0Var._icon_close = (VImage) viewGroup.getChildAt(0);
        l8d0Var._image = (VImage) viewGroup.getChildAt(1);
        l8d0Var._title = (VText) viewGroup.getChildAt(2);
        l8d0Var._content = (VText) viewGroup.getChildAt(3);
        l8d0Var._confirm = (VText) viewGroup.getChildAt(4);
        l8d0Var._cancel = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m157358b(l8d0 l8d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151973c, viewGroup, false);
        m157357a(l8d0Var, viewInflate);
        return viewInflate;
    }
}

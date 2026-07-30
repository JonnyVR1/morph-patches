package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qpa0 {
    /* JADX INFO: renamed from: a */
    public static void m177448a(ppa0 ppa0Var, View view) {
        ppa0Var._config_root = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ppa0Var._key_name = (VText) viewGroup.getChildAt(0);
        ppa0Var._selected_icon = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m177449b(ppa0 ppa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167600x, viewGroup, false);
        m177448a(ppa0Var, viewInflate);
        return viewInflate;
    }
}

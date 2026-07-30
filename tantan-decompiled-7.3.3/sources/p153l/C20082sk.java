package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VLinear;

/* JADX INFO: renamed from: l.sk */
/* JADX INFO: loaded from: classes10.dex */
public class C20082sk {
    /* JADX INFO: renamed from: a */
    public static void m186349a(C19858rk c19858rk, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c19858rk.f163528a = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c19858rk.f163529b = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m186350b(C19858rk c19858rk, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167528O0, viewGroup, false);
        m186349a(c19858rk, viewInflate);
        return viewInflate;
    }
}

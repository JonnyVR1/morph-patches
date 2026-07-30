package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j65 {
    /* JADX INFO: renamed from: a */
    public static void m7371a(CityTopGreetDialog cityTopGreetDialog, View view) {
        cityTopGreetDialog.f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityTopGreetDialog.g = viewGroup.getChildAt(0);
        cityTopGreetDialog.h = viewGroup.getChildAt(1);
        cityTopGreetDialog.i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cityTopGreetDialog.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cityTopGreetDialog.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cityTopGreetDialog.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        cityTopGreetDialog.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        cityTopGreetDialog.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cityTopGreetDialog.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        cityTopGreetDialog.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        cityTopGreetDialog.q = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cityTopGreetDialog.r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        cityTopGreetDialog.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m7372b(CityTopGreetDialog cityTopGreetDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.s9, viewGroup, false);
        m7371a(cityTopGreetDialog, viewInflate);
        return viewInflate;
    }
}

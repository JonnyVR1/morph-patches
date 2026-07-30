package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class poo {
    /* JADX INFO: renamed from: a */
    public static void m8787a(IntlNewUIFilterBaseSetting intlNewUIFilterBaseSetting, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlNewUIFilterBaseSetting.c = viewGroup.getChildAt(0);
        intlNewUIFilterBaseSetting.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlNewUIFilterBaseSetting.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlNewUIFilterBaseSetting.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlNewUIFilterBaseSetting.g = (LinearLayout) viewGroup.getChildAt(1);
        intlNewUIFilterBaseSetting.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlNewUIFilterBaseSetting.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlNewUIFilterBaseSetting.j = viewGroup.getChildAt(3);
        intlNewUIFilterBaseSetting.k = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlNewUIFilterBaseSetting.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        intlNewUIFilterBaseSetting.m = viewGroup.getChildAt(5);
        intlNewUIFilterBaseSetting.n = viewGroup.getChildAt(6);
        intlNewUIFilterBaseSetting.o = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        intlNewUIFilterBaseSetting.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(2);
        intlNewUIFilterBaseSetting.q = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        intlNewUIFilterBaseSetting.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(1);
    }
}

package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vkp {
    /* JADX INFO: renamed from: a */
    public static void m10241a(IntlVipNewCardPager intlVipNewCardPager, View view) {
        intlVipNewCardPager.a = (VFrame) view;
        intlVipNewCardPager.b = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10242b(IntlVipNewCardPager intlVipNewCardPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.l5, viewGroup, false);
        m10241a(intlVipNewCardPager, viewInflate);
        return viewInflate;
    }
}

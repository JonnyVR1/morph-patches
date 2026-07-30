package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tjl0 {
    /* JADX INFO: renamed from: a */
    public static void m9583a(VipNewCardPager vipNewCardPager, View view) {
        vipNewCardPager.a = (VFrame) view;
        vipNewCardPager.b = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9584b(VipNewCardPager vipNewCardPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.uf, viewGroup, false);
        m9583a(vipNewCardPager, viewInflate);
        return viewInflate;
    }
}

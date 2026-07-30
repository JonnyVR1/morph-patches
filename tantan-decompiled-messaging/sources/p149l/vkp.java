package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewCardPager;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class vkp {
    /* JADX INFO: renamed from: a */
    public static void m198749a(IntlVipNewCardPager intlVipNewCardPager, View view) {
        intlVipNewCardPager.f37102a = (VFrame) view;
        intlVipNewCardPager.f37103b = (ViewPager) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m198750b(IntlVipNewCardPager intlVipNewCardPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95874l5, viewGroup, false);
        m198749a(intlVipNewCardPager, viewInflate);
        return viewInflate;
    }
}

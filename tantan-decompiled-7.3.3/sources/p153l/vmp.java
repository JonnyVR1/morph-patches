package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewCardPager;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class vmp {
    /* JADX INFO: renamed from: a */
    public static void m201762a(IntlVipNewCardPager intlVipNewCardPager, View view) {
        intlVipNewCardPager.f37950a = (VFrame) view;
        intlVipNewCardPager.f37951b = (ViewPager) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m201763b(IntlVipNewCardPager intlVipNewCardPager, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125945m5, viewGroup, false);
        m201762a(intlVipNewCardPager, viewInflate);
        return viewInflate;
    }
}

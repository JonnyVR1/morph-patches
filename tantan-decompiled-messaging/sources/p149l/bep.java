package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupBanner;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class bep {
    /* JADX INFO: renamed from: a */
    public static void m101355a(IntlTribeGroupBanner intlTribeGroupBanner, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeGroupBanner.f24264a = (VDraweeView) viewGroup.getChildAt(0);
        intlTribeGroupBanner.f24265b = (VLinear) viewGroup.getChildAt(1);
        intlTribeGroupBanner.f24266c = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlTribeGroupBanner.f24267d = (VText_NoTopPadding) viewGroup.getChildAt(2);
        intlTribeGroupBanner.f24268e = (VText_NoTopPadding) viewGroup.getChildAt(3);
    }
}

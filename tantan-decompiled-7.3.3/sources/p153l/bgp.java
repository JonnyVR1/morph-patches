package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupBanner;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class bgp {
    /* JADX INFO: renamed from: a */
    public static void m104235a(IntlTribeGroupBanner intlTribeGroupBanner, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeGroupBanner.f25006a = (VDraweeView) viewGroup.getChildAt(0);
        intlTribeGroupBanner.f25007b = (VLinear) viewGroup.getChildAt(1);
        intlTribeGroupBanner.f25008c = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlTribeGroupBanner.f25009d = (VText_NoTopPadding) viewGroup.getChildAt(2);
        intlTribeGroupBanner.f25010e = (VText_NoTopPadding) viewGroup.getChildAt(3);
    }
}

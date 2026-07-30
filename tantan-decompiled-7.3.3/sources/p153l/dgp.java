package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupRight;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class dgp {
    /* JADX INFO: renamed from: a */
    public static void m115660a(IntlTribeGroupRight intlTribeGroupRight, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeGroupRight.f25020a = (VDraweeView) viewGroup.getChildAt(0);
        intlTribeGroupRight.f25021b = (VImage) viewGroup.getChildAt(1);
        intlTribeGroupRight.f25022c = (VLinear) viewGroup.getChildAt(2);
        intlTribeGroupRight.f25023d = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlTribeGroupRight.f25024e = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlTribeGroupRight.f25025f = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlTribeGroupRight.f25026g = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        intlTribeGroupRight.f25027h = (VText_NoTopPadding) viewGroup.getChildAt(4);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialogView;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class rdp {
    /* JADX INFO: renamed from: a */
    public static void m180938a(IntlSlGuideDialogView intlSlGuideDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlSlGuideDialogView.f23796c = (VFrame) viewGroup.getChildAt(0);
        intlSlGuideDialogView.f23797d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlSlGuideDialogView.f23798e = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlSlGuideDialogView.f23799f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlSlGuideDialogView.f23800g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        intlSlGuideDialogView.f23801h = (VLinear) viewGroup.getChildAt(1);
        intlSlGuideDialogView.f23802i = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlSlGuideDialogView.f23803j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlSlGuideDialogView.f23804k = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        intlSlGuideDialogView.f23805l = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}

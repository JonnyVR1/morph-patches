package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialogView;
import p147v.AutoVDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class rbp {
    /* JADX INFO: renamed from: a */
    public static void m178687a(IntlSlGuideDialogView intlSlGuideDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlSlGuideDialogView.f23054c = (VFrame) viewGroup.getChildAt(0);
        intlSlGuideDialogView.f23055d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlSlGuideDialogView.f23056e = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlSlGuideDialogView.f23057f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlSlGuideDialogView.f23058g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        intlSlGuideDialogView.f23059h = (VLinear) viewGroup.getChildAt(1);
        intlSlGuideDialogView.f23060i = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlSlGuideDialogView.f23061j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlSlGuideDialogView.f23062k = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        intlSlGuideDialogView.f23063l = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}

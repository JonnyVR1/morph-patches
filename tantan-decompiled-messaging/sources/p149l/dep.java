package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupRight;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class dep {
    /* JADX INFO: renamed from: a */
    public static void m111388a(IntlTribeGroupRight intlTribeGroupRight, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeGroupRight.f24278a = (VDraweeView) viewGroup.getChildAt(0);
        intlTribeGroupRight.f24279b = (VImage) viewGroup.getChildAt(1);
        intlTribeGroupRight.f24280c = (VLinear) viewGroup.getChildAt(2);
        intlTribeGroupRight.f24281d = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlTribeGroupRight.f24282e = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlTribeGroupRight.f24283f = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlTribeGroupRight.f24284g = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        intlTribeGroupRight.f24285h = (VText_NoTopPadding) viewGroup.getChildAt(4);
    }
}

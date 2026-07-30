package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomExpandedProfileItemView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yg4 {
    /* JADX INFO: renamed from: a */
    public static void m214612a(CardBottomExpandedProfileItemView cardBottomExpandedProfileItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomExpandedProfileItemView.f23467c = (VLinear) viewGroup.getChildAt(0);
        cardBottomExpandedProfileItemView.f23468d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomExpandedProfileItemView.f23469e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardBottomExpandedProfileItemView.f23470f = (VLinear) viewGroup.getChildAt(1);
        cardBottomExpandedProfileItemView.f23471g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomExpandedProfileItemView.f23472h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

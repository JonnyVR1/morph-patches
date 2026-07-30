package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLetterLayout;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ji4 {
    /* JADX INFO: renamed from: a */
    public static void m144972a(CardBottomLetterLayout cardBottomLetterLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLetterLayout.f24252c = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        cardBottomLetterLayout.f24253d = (VLinear) viewGroup.getChildAt(1);
        cardBottomLetterLayout.f24254e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cardBottomLetterLayout.f24255f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cardBottomLetterLayout.f24256g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}

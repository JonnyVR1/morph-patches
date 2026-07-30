package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.letter.LetterGuideView_IntlB;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tcr {
    /* JADX INFO: renamed from: a */
    public static void m190491a(LetterGuideView_IntlB letterGuideView_IntlB, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        letterGuideView_IntlB.f38088c = viewGroup.getChildAt(0);
        letterGuideView_IntlB.f38089d = (VLinear) viewGroup.getChildAt(1);
        letterGuideView_IntlB.f38090e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        letterGuideView_IntlB.f38091f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        letterGuideView_IntlB.f38092g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
    }
}

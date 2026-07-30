package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.letter.LetterGuideView_IntlB;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rar {
    /* JADX INFO: renamed from: a */
    public static void m178533a(LetterGuideView_IntlB letterGuideView_IntlB, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        letterGuideView_IntlB.f37240c = viewGroup.getChildAt(0);
        letterGuideView_IntlB.f37241d = (VLinear) viewGroup.getChildAt(1);
        letterGuideView_IntlB.f37242e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        letterGuideView_IntlB.f37243f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        letterGuideView_IntlB.f37244g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
    }
}

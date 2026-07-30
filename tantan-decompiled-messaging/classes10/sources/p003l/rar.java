package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.letter.LetterGuideView_IntlB;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rar {
    /* JADX INFO: renamed from: a */
    public static void m9126a(LetterGuideView_IntlB letterGuideView_IntlB, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        letterGuideView_IntlB.c = viewGroup.getChildAt(0);
        letterGuideView_IntlB.d = viewGroup.getChildAt(1);
        letterGuideView_IntlB.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        letterGuideView_IntlB.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        letterGuideView_IntlB.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
    }
}

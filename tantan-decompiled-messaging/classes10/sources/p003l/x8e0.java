package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.privilege.SeeLetterBlockPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x8e0 {
    /* JADX INFO: renamed from: a */
    public static void m10698a(SeeLetterBlockPage seeLetterBlockPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeLetterBlockPage.a = viewGroup.getChildAt(0);
        seeLetterBlockPage.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        seeLetterBlockPage.c = viewGroup.getChildAt(2);
        seeLetterBlockPage.d = viewGroup.getChildAt(3);
    }
}

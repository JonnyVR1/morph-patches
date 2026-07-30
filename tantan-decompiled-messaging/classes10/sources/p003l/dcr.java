package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import l.ccr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dcr {
    /* JADX INFO: renamed from: a */
    public static void m6105a(ccr ccrVar, View view) {
        ccrVar.f = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ccrVar.g = viewGroup.getChildAt(0);
        ccrVar.h = viewGroup.getChildAt(1);
        ccrVar.i = viewGroup.getChildAt(2);
        ccrVar.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ccrVar.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

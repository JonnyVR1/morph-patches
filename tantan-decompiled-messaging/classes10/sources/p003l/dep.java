package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupRight;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dep {
    /* JADX INFO: renamed from: a */
    public static void m6111a(IntlTribeGroupRight intlTribeGroupRight, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeGroupRight.a = viewGroup.getChildAt(0);
        intlTribeGroupRight.b = viewGroup.getChildAt(1);
        intlTribeGroupRight.c = viewGroup.getChildAt(2);
        intlTribeGroupRight.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlTribeGroupRight.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlTribeGroupRight.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlTribeGroupRight.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        intlTribeGroupRight.h = viewGroup.getChildAt(4);
    }
}

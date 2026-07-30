package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.head.IntlUserGreetHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lkp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m7736a(IntlUserGreetHeadView intlUserGreetHeadView, View view) {
        intlUserGreetHeadView._root = (IntlUserGreetHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlUserGreetHeadView._avatar_container = viewGroup.getChildAt(0);
        intlUserGreetHeadView._avatar_wrapper = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlUserGreetHeadView._hand_ic = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlUserGreetHeadView._username = viewGroup.getChildAt(1);
    }
}

package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.head.IntlUserGreetHeadView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lkp {
    /* JADX INFO: renamed from: a */
    public static void m150378a(IntlUserGreetHeadView intlUserGreetHeadView, View view) {
        intlUserGreetHeadView._root = (IntlUserGreetHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlUserGreetHeadView._avatar_container = (VFrame) viewGroup.getChildAt(0);
        intlUserGreetHeadView._avatar_wrapper = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlUserGreetHeadView._hand_ic = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlUserGreetHeadView._username = (VText) viewGroup.getChildAt(1);
    }
}

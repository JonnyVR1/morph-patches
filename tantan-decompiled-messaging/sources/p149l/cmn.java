package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlGreetListItemView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cmn {
    /* JADX INFO: renamed from: a */
    public static void m107672a(IntlGreetListItemView intlGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGreetListItemView.f29783a = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        intlGreetListItemView.f29784b = viewGroup.getChildAt(1);
        intlGreetListItemView.f29785c = (VText) viewGroup.getChildAt(2);
        intlGreetListItemView.f29786d = (VText) viewGroup.getChildAt(3);
        intlGreetListItemView.f29787e = (VFrame) viewGroup.getChildAt(4);
        intlGreetListItemView.f29788f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        intlGreetListItemView.f29789g = (VText) viewGroup.getChildAt(5);
        intlGreetListItemView.f29790h = (VText) viewGroup.getChildAt(6);
        intlGreetListItemView.f29791i = (VText) viewGroup.getChildAt(7);
    }
}

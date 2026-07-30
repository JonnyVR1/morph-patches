package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlGreetListItemView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class con {
    /* JADX INFO: renamed from: a */
    public static void m111674a(IntlGreetListItemView intlGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGreetListItemView.f30631a = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        intlGreetListItemView.f30632b = viewGroup.getChildAt(1);
        intlGreetListItemView.f30633c = (VText) viewGroup.getChildAt(2);
        intlGreetListItemView.f30634d = (VText) viewGroup.getChildAt(3);
        intlGreetListItemView.f30635e = (VFrame) viewGroup.getChildAt(4);
        intlGreetListItemView.f30636f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        intlGreetListItemView.f30637g = (VText) viewGroup.getChildAt(5);
        intlGreetListItemView.f30638h = (VText) viewGroup.getChildAt(6);
        intlGreetListItemView.f30639i = (VText) viewGroup.getChildAt(7);
    }
}

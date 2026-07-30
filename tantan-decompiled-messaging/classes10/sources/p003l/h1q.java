package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.messages.ItemBlindBoxGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h1q {
    /* JADX INFO: renamed from: a */
    public static void m6903a(ItemBlindBoxGuideView itemBlindBoxGuideView, View view) {
        itemBlindBoxGuideView.a = (ItemBlindBoxGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemBlindBoxGuideView.b = viewGroup.getChildAt(0);
        itemBlindBoxGuideView.c = (RelativeLayout) viewGroup.getChildAt(1);
        itemBlindBoxGuideView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemBlindBoxGuideView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemBlindBoxGuideView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        itemBlindBoxGuideView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

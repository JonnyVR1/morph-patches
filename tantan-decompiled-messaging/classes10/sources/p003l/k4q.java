package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k4q {
    /* JADX INFO: renamed from: a */
    public static void m7532a(ItemGuideAuthentication itemGuideAuthentication, View view) {
        itemGuideAuthentication.a = (ItemGuideAuthentication) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGuideAuthentication.b = viewGroup.getChildAt(0);
        itemGuideAuthentication.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGuideAuthentication.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGuideAuthentication.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemGuideAuthentication.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemGuideAuthentication.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}

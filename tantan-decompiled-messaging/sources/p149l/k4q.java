package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemGuideAuthentication;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k4q {
    /* JADX INFO: renamed from: a */
    public static void m144501a(ItemGuideAuthentication itemGuideAuthentication, View view) {
        itemGuideAuthentication.f30980a = (ItemGuideAuthentication) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGuideAuthentication.f30981b = (VLinear) viewGroup.getChildAt(0);
        itemGuideAuthentication.f30982c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGuideAuthentication.f30983d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGuideAuthentication.f30984e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemGuideAuthentication.f30985f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemGuideAuthentication.f30986g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}

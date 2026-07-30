package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemGuideAuthentication;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k6q {
    /* JADX INFO: renamed from: a */
    public static void m148539a(ItemGuideAuthentication itemGuideAuthentication, View view) {
        itemGuideAuthentication.f31828a = (ItemGuideAuthentication) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGuideAuthentication.f31829b = (VLinear) viewGroup.getChildAt(0);
        itemGuideAuthentication.f31830c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGuideAuthentication.f31831d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGuideAuthentication.f31832e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemGuideAuthentication.f31833f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemGuideAuthentication.f31834g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}

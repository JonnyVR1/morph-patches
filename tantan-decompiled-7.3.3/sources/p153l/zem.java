package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.p053ui.label.CommonTextureFrameLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zem {
    /* JADX INFO: renamed from: a */
    public static void m219500a(IdentifyView identifyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        identifyView.f27535c = (RelativeLayout) viewGroup.getChildAt(0);
        identifyView.f27536d = (CommonTextureFrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        identifyView.f27537e = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        identifyView.f27538f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        identifyView.f27539g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        identifyView.f27540h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        identifyView.f27541i = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}

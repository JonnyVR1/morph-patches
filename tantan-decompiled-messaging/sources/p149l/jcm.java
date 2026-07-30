package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.p048ui.label.CommonTextureFrameLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VOnlineIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jcm {
    /* JADX INFO: renamed from: a */
    public static void m140981a(IdentifyView identifyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        identifyView.f26687c = (RelativeLayout) viewGroup.getChildAt(0);
        identifyView.f26688d = (CommonTextureFrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        identifyView.f26689e = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        identifyView.f26690f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        identifyView.f26691g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        identifyView.f26692h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        identifyView.f26693i = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}

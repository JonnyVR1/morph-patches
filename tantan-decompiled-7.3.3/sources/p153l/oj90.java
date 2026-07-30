package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeSVIPBadgeView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class oj90 {
    /* JADX INFO: renamed from: a */
    public static void m167845a(PrivilegeSVIPBadgeView privilegeSVIPBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSVIPBadgeView.f35948a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeSVIPBadgeView.f35949b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeSVIPBadgeView.f35950c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeSVIPBadgeView.f35951d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

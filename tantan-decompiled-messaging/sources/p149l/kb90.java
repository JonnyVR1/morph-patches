package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeSVIPBadgeView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class kb90 {
    /* JADX INFO: renamed from: a */
    public static void m145266a(PrivilegeSVIPBadgeView privilegeSVIPBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSVIPBadgeView.f35100a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeSVIPBadgeView.f35101b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeSVIPBadgeView.f35102c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeSVIPBadgeView.f35103d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

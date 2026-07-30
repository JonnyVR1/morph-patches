package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipItemView;
import p147v.VDraweeView;
import p147v.VOnlineIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s1f0 {
    /* JADX INFO: renamed from: a */
    public static void m181960a(SidesSlipItemView sidesSlipItemView, View view) {
        sidesSlipItemView.f26731c = (SidesSlipItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sidesSlipItemView.f26732d = viewGroup.getChildAt(0);
        sidesSlipItemView.f26733e = (LinearLayout) viewGroup.getChildAt(1);
        sidesSlipItemView.f26734f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sidesSlipItemView.f26735g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sidesSlipItemView.f26736h = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sidesSlipItemView.f26737i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}

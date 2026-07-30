package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class r1f0 {
    /* JADX INFO: renamed from: a */
    public static void m177463a(SidesSlipHeadItemView sidesSlipHeadItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sidesSlipHeadItemView.f26700c = (VDraweeView) viewGroup.getChildAt(0);
        sidesSlipHeadItemView.f26701d = (VLinear) viewGroup.getChildAt(1);
        sidesSlipHeadItemView.f26702e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f26703f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f26704g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.f26705h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f26706i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        sidesSlipHeadItemView.f26707j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        sidesSlipHeadItemView.f26708k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.f26709l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f26710m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.f26711n = (VFrame) viewGroup.getChildAt(2);
        sidesSlipHeadItemView.f26712o = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sidesSlipHeadItemView.f26713p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

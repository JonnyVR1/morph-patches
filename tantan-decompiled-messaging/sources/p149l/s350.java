package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s350 {
    /* JADX INFO: renamed from: a */
    public static void m182121a(r350 r350Var, View view) {
        r350Var.f157493k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r350Var.f157494l = viewGroup.getChildAt(0);
        r350Var.f157495m = (VDraweeView) viewGroup.getChildAt(1);
        r350Var.f157496n = (VDraweeView) viewGroup.getChildAt(2);
        r350Var.f157497o = (VDraweeView) viewGroup.getChildAt(3);
        r350Var.f157498p = (TextView) viewGroup.getChildAt(4);
        r350Var.f157499q = (VFrame) viewGroup.getChildAt(5);
        r350Var.f157500r = (VText) viewGroup.getChildAt(6);
        r350Var.f157501s = (TextView) viewGroup.getChildAt(7);
        r350Var.f157502t = (LiveBannerView) viewGroup.getChildAt(8);
        r350Var.f157503u = (LinearLayout) viewGroup.getChildAt(9);
        r350Var.f157504v = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        r350Var.f157505w = (VText) viewGroup.getChildAt(10);
    }
}

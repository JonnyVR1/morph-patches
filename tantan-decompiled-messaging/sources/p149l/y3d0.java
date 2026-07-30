package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightMedalTipsView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class y3d0 {
    /* JADX INFO: renamed from: a */
    public static void m212796a(RightMedalTipsView rightMedalTipsView, View view) {
        rightMedalTipsView.f46090a = (RightMedalTipsView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightMedalTipsView.f46091b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightMedalTipsView.f46092c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightMedalTipsView.f46093d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        rightMedalTipsView.f46094e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

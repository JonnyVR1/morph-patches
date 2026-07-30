package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerNewCircleIndicator;
import p147v.AutoVDraweeView;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tej {
    /* JADX INFO: renamed from: a */
    public static void m188508a(oej oejVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oejVar.f143318a = (AutoVDraweeView) viewGroup.getChildAt(0);
        oejVar.f143319b = (Space) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oejVar.f143320c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oejVar.f143321d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        oejVar.f143322e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        oejVar.f143323f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        oejVar.f143324g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        oejVar.f143325h = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        oejVar.f143326i = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        oejVar.f143327j = (VPagerNewCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2);
    }
}

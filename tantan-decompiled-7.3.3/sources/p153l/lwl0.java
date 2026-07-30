package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.home.VipSuperLikeContainer;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lwl0 {
    /* JADX INFO: renamed from: a */
    public static void m156072a(VipSuperLikeContainer vipSuperLikeContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipSuperLikeContainer.f22585a = (RelativeLayout) viewGroup.getChildAt(0);
        vipSuperLikeContainer.f22586b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipSuperLikeContainer.f22587c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipSuperLikeContainer.f22588d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        vipSuperLikeContainer.f22589e = (VImage) viewGroup.getChildAt(1);
    }
}

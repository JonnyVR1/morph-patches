package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.home.VipSuperLikeContainer;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hnl0 {
    /* JADX INFO: renamed from: a */
    public static void m131949a(VipSuperLikeContainer vipSuperLikeContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipSuperLikeContainer.f21843a = (RelativeLayout) viewGroup.getChildAt(0);
        vipSuperLikeContainer.f21844b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipSuperLikeContainer.f21845c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipSuperLikeContainer.f21846d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        vipSuperLikeContainer.f21847e = (VImage) viewGroup.getChildAt(1);
    }
}

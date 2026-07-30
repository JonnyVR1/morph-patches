package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.home.VipSuperLikeContainer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hnl0 {
    /* JADX INFO: renamed from: a */
    public static void m7044a(VipSuperLikeContainer vipSuperLikeContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipSuperLikeContainer.a = (RelativeLayout) viewGroup.getChildAt(0);
        vipSuperLikeContainer.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vipSuperLikeContainer.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vipSuperLikeContainer.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        vipSuperLikeContainer.e = viewGroup.getChildAt(1);
    }
}

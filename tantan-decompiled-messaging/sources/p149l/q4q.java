package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemIceBreakStateRight;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class q4q {
    /* JADX INFO: renamed from: a */
    public static void m172951a(ItemIceBreakStateRight itemIceBreakStateRight, View view) {
        itemIceBreakStateRight.f31027c = (ItemIceBreakStateRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemIceBreakStateRight.f31028d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemIceBreakStateRight.f31029e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}

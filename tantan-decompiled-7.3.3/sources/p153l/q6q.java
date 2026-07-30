package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemIceBreakStateRight;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class q6q {
    /* JADX INFO: renamed from: a */
    public static void m175600a(ItemIceBreakStateRight itemIceBreakStateRight, View view) {
        itemIceBreakStateRight.f31875c = (ItemIceBreakStateRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemIceBreakStateRight.f31876d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemIceBreakStateRight.f31877e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}

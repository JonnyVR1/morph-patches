package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCountdownLikeSuccess;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class q4q {
    /* JADX INFO: renamed from: a */
    public static void m175255a(ItemCountdownLikeSuccess itemCountdownLikeSuccess, View view) {
        itemCountdownLikeSuccess.f31757a = (ItemCountdownLikeSuccess) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCountdownLikeSuccess.f31758b = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f31759c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f31760d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemCountdownLikeSuccess.f31761e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f31762f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemCountdownLikeSuccess.f31763g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

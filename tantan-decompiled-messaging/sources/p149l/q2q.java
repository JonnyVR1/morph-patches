package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCountdownLikeSuccess;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class q2q {
    /* JADX INFO: renamed from: a */
    public static void m172474a(ItemCountdownLikeSuccess itemCountdownLikeSuccess, View view) {
        itemCountdownLikeSuccess.f30909a = (ItemCountdownLikeSuccess) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCountdownLikeSuccess.f30910b = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f30911c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f30912d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemCountdownLikeSuccess.f30913e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f30914f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemCountdownLikeSuccess.f30915g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

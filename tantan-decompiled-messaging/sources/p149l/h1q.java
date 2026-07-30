package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBlindBoxGuideView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h1q {
    /* JADX INFO: renamed from: a */
    public static void m129067a(ItemBlindBoxGuideView itemBlindBoxGuideView, View view) {
        itemBlindBoxGuideView.f30828a = (ItemBlindBoxGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemBlindBoxGuideView.f30829b = (VText) viewGroup.getChildAt(0);
        itemBlindBoxGuideView.f30830c = (RelativeLayout) viewGroup.getChildAt(1);
        itemBlindBoxGuideView.f30831d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemBlindBoxGuideView.f30832e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemBlindBoxGuideView.f30833f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        itemBlindBoxGuideView.f30834g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

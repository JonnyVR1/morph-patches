package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBlindBoxGuideView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h3q {
    /* JADX INFO: renamed from: a */
    public static void m133517a(ItemBlindBoxGuideView itemBlindBoxGuideView, View view) {
        itemBlindBoxGuideView.f31676a = (ItemBlindBoxGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemBlindBoxGuideView.f31677b = (VText) viewGroup.getChildAt(0);
        itemBlindBoxGuideView.f31678c = (RelativeLayout) viewGroup.getChildAt(1);
        itemBlindBoxGuideView.f31679d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemBlindBoxGuideView.f31680e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemBlindBoxGuideView.f31681f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        itemBlindBoxGuideView.f31682g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}

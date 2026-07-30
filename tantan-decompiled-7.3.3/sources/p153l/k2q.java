package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiP2PChatGuide;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k2q {
    /* JADX INFO: renamed from: a */
    public static void m147991a(ItemAiP2PChatGuide itemAiP2PChatGuide, View view) {
        itemAiP2PChatGuide.f31612a = (ItemAiP2PChatGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiP2PChatGuide.f31613b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiP2PChatGuide.f31614c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemAiP2PChatGuide.f31615d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemAiP2PChatGuide.f31616e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

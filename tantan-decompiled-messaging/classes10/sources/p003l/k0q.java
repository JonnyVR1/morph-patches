package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemAiP2PChatGuide;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k0q {
    /* JADX INFO: renamed from: a */
    public static void m7479a(ItemAiP2PChatGuide itemAiP2PChatGuide, View view) {
        itemAiP2PChatGuide.a = (ItemAiP2PChatGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiP2PChatGuide.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiP2PChatGuide.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemAiP2PChatGuide.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemAiP2PChatGuide.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

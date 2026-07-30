package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemTagGuide;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class seq {
    /* JADX INFO: renamed from: a */
    public static void m9337a(ItemTagGuide itemTagGuide, View view) {
        itemTagGuide.a = (ItemTagGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTagGuide.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemTagGuide.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemTagGuide.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemTagGuide.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

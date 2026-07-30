package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemAddArtworkGuide;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qzp {
    /* JADX INFO: renamed from: a */
    public static void m9066a(ItemAddArtworkGuide itemAddArtworkGuide, View view) {
        itemAddArtworkGuide.a = (ItemAddArtworkGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAddArtworkGuide.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAddArtworkGuide.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAddArtworkGuide.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAddArtworkGuide.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemPicCertGuide;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ibq {
    /* JADX INFO: renamed from: a */
    public static void m7148a(ItemPicCertGuide itemPicCertGuide, View view) {
        itemPicCertGuide.a = (ItemPicCertGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPicCertGuide.b = viewGroup.getChildAt(0);
        itemPicCertGuide.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPicCertGuide.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPicCertGuide.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPicCertGuide.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

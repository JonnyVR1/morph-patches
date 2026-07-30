package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemUnderstandShare;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mhq {
    /* JADX INFO: renamed from: a */
    public static void m8158a(ItemUnderstandShare itemUnderstandShare, View view) {
        itemUnderstandShare.a = (ItemUnderstandShare) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemUnderstandShare.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemUnderstandShare.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemUnderstandShare.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemUnderstandShare.e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemUnderstandShare.f = (TextView) viewGroup.getChildAt(1);
        itemUnderstandShare.g = (TextView) viewGroup.getChildAt(2);
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purpose.PurposeItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ucb0 {
    /* JADX INFO: renamed from: a */
    public static void m9714a(PurposeItem purposeItem, View view) {
        purposeItem.a = (PurposeItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purposeItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purposeItem.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        purposeItem.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        purposeItem.e = viewGroup.getChildAt(1);
    }
}

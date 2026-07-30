package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemLoveBuzzUnlockSuccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d6q {
    /* JADX INFO: renamed from: a */
    public static void m6078a(ItemLoveBuzzUnlockSuccess itemLoveBuzzUnlockSuccess, View view) {
        itemLoveBuzzUnlockSuccess.a = (ItemLoveBuzzUnlockSuccess) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveBuzzUnlockSuccess.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLoveBuzzUnlockSuccess.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLoveBuzzUnlockSuccess.d = viewGroup.getChildAt(2);
    }
}

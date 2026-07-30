package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLoveBuzzUnlockSuccess;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d6q {
    /* JADX INFO: renamed from: a */
    public static void m110188a(ItemLoveBuzzUnlockSuccess itemLoveBuzzUnlockSuccess, View view) {
        itemLoveBuzzUnlockSuccess.f31116a = (ItemLoveBuzzUnlockSuccess) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveBuzzUnlockSuccess.f31117b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLoveBuzzUnlockSuccess.f31118c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLoveBuzzUnlockSuccess.f31119d = (VText) viewGroup.getChildAt(2);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLoveBuzzUnlockSuccess;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d8q {
    /* JADX INFO: renamed from: a */
    public static void m114920a(ItemLoveBuzzUnlockSuccess itemLoveBuzzUnlockSuccess, View view) {
        itemLoveBuzzUnlockSuccess.f31964a = (ItemLoveBuzzUnlockSuccess) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveBuzzUnlockSuccess.f31965b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLoveBuzzUnlockSuccess.f31966c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLoveBuzzUnlockSuccess.f31967d = (VText) viewGroup.getChildAt(2);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLoveBuzzUnlockLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z7q {
    /* JADX INFO: renamed from: a */
    public static void m218915a(ItemLoveBuzzUnlockLayout itemLoveBuzzUnlockLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveBuzzUnlockLayout.f31959a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLoveBuzzUnlockLayout.f31960b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLoveBuzzUnlockLayout.f31961c = (VText) viewGroup.getChildAt(1);
        itemLoveBuzzUnlockLayout.f31962d = (VText) viewGroup.getChildAt(2);
    }
}

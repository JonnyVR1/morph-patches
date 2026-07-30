package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLoveBuzzUnlockLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z5q {
    /* JADX INFO: renamed from: a */
    public static void m217368a(ItemLoveBuzzUnlockLayout itemLoveBuzzUnlockLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveBuzzUnlockLayout.f31111a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLoveBuzzUnlockLayout.f31112b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLoveBuzzUnlockLayout.f31113c = (VText) viewGroup.getChildAt(1);
        itemLoveBuzzUnlockLayout.f31114d = (VText) viewGroup.getChildAt(2);
    }
}

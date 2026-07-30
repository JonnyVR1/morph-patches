package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageWCInvite;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z9q {
    /* JADX INFO: renamed from: a */
    public static void m217681a(ItemMessageWCInvite itemMessageWCInvite, View view) {
        itemMessageWCInvite.f31260a = (ItemMessageWCInvite) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageWCInvite.f31261b = (VDraweeView) viewGroup.getChildAt(0);
        itemMessageWCInvite.f31262c = (VText) viewGroup.getChildAt(1);
        itemMessageWCInvite.f31263d = (VText) viewGroup.getChildAt(2);
    }
}

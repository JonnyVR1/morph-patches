package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemMessageWCInvite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z9q {
    /* JADX INFO: renamed from: a */
    public static void m11380a(ItemMessageWCInvite itemMessageWCInvite, View view) {
        itemMessageWCInvite.a = (ItemMessageWCInvite) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageWCInvite.b = viewGroup.getChildAt(0);
        itemMessageWCInvite.c = viewGroup.getChildAt(1);
        itemMessageWCInvite.d = viewGroup.getChildAt(2);
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.messages.ItemMessageWCInviteAfter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y9q {
    /* JADX INFO: renamed from: a */
    public static void m11164a(ItemMessageWCInviteAfter itemMessageWCInviteAfter, View view) {
        itemMessageWCInviteAfter.a = (ItemMessageWCInviteAfter) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageWCInviteAfter.b = (RelativeLayout) viewGroup.getChildAt(0);
        itemMessageWCInviteAfter.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageWCInviteAfter.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageWCInviteAfter.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemMessageWCInviteAfter.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

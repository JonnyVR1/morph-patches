package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemDiceInvite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s2q {
    /* JADX INFO: renamed from: a */
    public static void m9213a(ItemDiceInvite itemDiceInvite, View view) {
        itemDiceInvite.a = (ItemDiceInvite) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemDiceInvite.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemDiceInvite.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemDiceInvite.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemDiceInvite.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemDiceTip;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t2q {
    /* JADX INFO: renamed from: a */
    public static void m9523a(ItemDiceTip itemDiceTip, View view) {
        itemDiceTip.a = (ItemDiceTip) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemDiceTip.b = viewGroup.getChildAt(0);
        itemDiceTip.c = viewGroup.getChildAt(1);
    }
}

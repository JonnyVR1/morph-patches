package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemLiveVirtualVoice;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q5q {
    /* JADX INFO: renamed from: a */
    public static void m8915a(ItemLiveVirtualVoice itemLiveVirtualVoice, View view) {
        itemLiveVirtualVoice.a = (ItemLiveVirtualVoice) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLiveVirtualVoice.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLiveVirtualVoice.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLiveVirtualVoice.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

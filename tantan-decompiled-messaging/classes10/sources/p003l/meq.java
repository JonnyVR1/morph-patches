package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemSwapAnswerMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class meq {
    /* JADX INFO: renamed from: a */
    public static void m8145a(ItemSwapAnswerMessage itemSwapAnswerMessage, View view) {
        itemSwapAnswerMessage.c = (ItemSwapAnswerMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemSwapAnswerMessage.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemSwapAnswerMessage.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemSwapAnswerMessage.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemSwapAnswerMessage.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemSwapAnswerMessage.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemSwapAnswerMessage.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        itemSwapAnswerMessage.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        itemSwapAnswerMessage.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        itemSwapAnswerMessage.l = viewGroup.getChildAt(3);
    }
}

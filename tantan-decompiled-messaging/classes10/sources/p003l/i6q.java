package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.view.LetterTextView;
import com.p1.mobile.putong.core.ui.messages.view.ItemLoveLetterMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i6q {
    /* JADX INFO: renamed from: a */
    public static void m7132a(ItemLoveLetterMessage itemLoveLetterMessage, View view) {
        itemLoveLetterMessage.a = (ItemLoveLetterMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveLetterMessage.b = viewGroup.getChildAt(0);
        itemLoveLetterMessage.c = viewGroup.getChildAt(1);
        itemLoveLetterMessage.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemLoveLetterMessage.e = (LetterTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLoveLetterMessage.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        itemLoveLetterMessage.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

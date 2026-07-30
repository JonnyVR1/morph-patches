package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemSwapAnswerMessage;
import p147v.VImage;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class meq {
    /* JADX INFO: renamed from: a */
    public static void m154305a(ItemSwapAnswerMessage itemSwapAnswerMessage, View view) {
        itemSwapAnswerMessage.f31481c = (ItemSwapAnswerMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemSwapAnswerMessage.f31482d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemSwapAnswerMessage.f31483e = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemSwapAnswerMessage.f31484f = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemSwapAnswerMessage.f31485g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemSwapAnswerMessage.f31486h = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemSwapAnswerMessage.f31487i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        itemSwapAnswerMessage.f31488j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        itemSwapAnswerMessage.f31489k = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        itemSwapAnswerMessage.f31490l = (VText_Bold) viewGroup.getChildAt(3);
    }
}

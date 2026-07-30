package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemSwapAnswerMessage;
import p151v.VImage;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class mgq {
    /* JADX INFO: renamed from: a */
    public static void m158376a(ItemSwapAnswerMessage itemSwapAnswerMessage, View view) {
        itemSwapAnswerMessage.f32329c = (ItemSwapAnswerMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemSwapAnswerMessage.f32330d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemSwapAnswerMessage.f32331e = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemSwapAnswerMessage.f32332f = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemSwapAnswerMessage.f32333g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemSwapAnswerMessage.f32334h = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemSwapAnswerMessage.f32335i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        itemSwapAnswerMessage.f32336j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        itemSwapAnswerMessage.f32337k = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        itemSwapAnswerMessage.f32338l = (VText_Bold) viewGroup.getChildAt(3);
    }
}

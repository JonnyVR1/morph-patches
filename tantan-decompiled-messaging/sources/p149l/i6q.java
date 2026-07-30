package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.messages.view.ItemLoveLetterMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.view.LoveLetterView;
import com.p046p1.mobile.putong.core.view.LetterTextView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i6q {
    /* JADX INFO: renamed from: a */
    public static void m134629a(ItemLoveLetterMessage itemLoveLetterMessage, View view) {
        itemLoveLetterMessage.f32339a = (ItemLoveLetterMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveLetterMessage.f32340b = (LoveLetterView) viewGroup.getChildAt(0);
        itemLoveLetterMessage.f32341c = (VLinear) viewGroup.getChildAt(1);
        itemLoveLetterMessage.f32342d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemLoveLetterMessage.f32343e = (LetterTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLoveLetterMessage.f32344f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        itemLoveLetterMessage.f32345g = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

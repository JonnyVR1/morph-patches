package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.messages.view.ItemLoveLetterMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.view.LoveLetterView;
import com.p051p1.mobile.putong.core.view.LetterTextView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i8q {
    /* JADX INFO: renamed from: a */
    public static void m139021a(ItemLoveLetterMessage itemLoveLetterMessage, View view) {
        itemLoveLetterMessage.f33187a = (ItemLoveLetterMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveLetterMessage.f33188b = (LoveLetterView) viewGroup.getChildAt(0);
        itemLoveLetterMessage.f33189c = (VLinear) viewGroup.getChildAt(1);
        itemLoveLetterMessage.f33190d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemLoveLetterMessage.f33191e = (LetterTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLoveLetterMessage.f33192f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        itemLoveLetterMessage.f33193g = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}

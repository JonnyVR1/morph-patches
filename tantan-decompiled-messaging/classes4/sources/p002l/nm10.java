package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nm10 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m18864a(MultipleGiftItemView multipleGiftItemView, View view) {
        multipleGiftItemView.f5919d = (MultipleGiftItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multipleGiftItemView.f5920e = (TextView) viewGroup.getChildAt(0);
        multipleGiftItemView.f5921f = (TextView) viewGroup.getChildAt(1);
        multipleGiftItemView.f5922g = (LiveMarqueeTextView) viewGroup.getChildAt(2);
        multipleGiftItemView.f5923h = (LiveMarqueeTextView) viewGroup.getChildAt(3);
    }
}

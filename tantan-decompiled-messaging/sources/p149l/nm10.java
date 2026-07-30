package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;

/* JADX INFO: loaded from: classes4.dex */
public class nm10 {
    /* JADX INFO: renamed from: a */
    public static void m160084a(MultipleGiftItemView multipleGiftItemView, View view) {
        multipleGiftItemView.f49877d = (MultipleGiftItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multipleGiftItemView.f49878e = (TextView) viewGroup.getChildAt(0);
        multipleGiftItemView.f49879f = (TextView) viewGroup.getChildAt(1);
        multipleGiftItemView.f49880g = (LiveMarqueeTextView) viewGroup.getChildAt(2);
        multipleGiftItemView.f49881h = (LiveMarqueeTextView) viewGroup.getChildAt(3);
    }
}

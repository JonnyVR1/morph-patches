package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;

/* JADX INFO: loaded from: classes4.dex */
public class vu10 {
    /* JADX INFO: renamed from: a */
    public static void m202771a(MultipleGiftItemView multipleGiftItemView, View view) {
        multipleGiftItemView.f50725d = (MultipleGiftItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multipleGiftItemView.f50726e = (TextView) viewGroup.getChildAt(0);
        multipleGiftItemView.f50727f = (TextView) viewGroup.getChildAt(1);
        multipleGiftItemView.f50728g = (LiveMarqueeTextView) viewGroup.getChildAt(2);
        multipleGiftItemView.f50729h = (LiveMarqueeTextView) viewGroup.getChildAt(3);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPlatinumPinGuideMessage;

/* JADX INFO: loaded from: classes10.dex */
public class heq {
    /* JADX INFO: renamed from: a */
    public static void m134671a(ItemPlatinumPinGuideMessage itemPlatinumPinGuideMessage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemPlatinumPinGuideMessage.f32242a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemPlatinumPinGuideMessage.f32243b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemPlatinumPinGuideMessage.f32244c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPlatinumPinGuideMessage.f32245d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

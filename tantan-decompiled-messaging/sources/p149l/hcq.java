package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPlatinumPinGuideMessage;

/* JADX INFO: loaded from: classes10.dex */
public class hcq {
    /* JADX INFO: renamed from: a */
    public static void m130491a(ItemPlatinumPinGuideMessage itemPlatinumPinGuideMessage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemPlatinumPinGuideMessage.f31394a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemPlatinumPinGuideMessage.f31395b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemPlatinumPinGuideMessage.f31396c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPlatinumPinGuideMessage.f31397d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

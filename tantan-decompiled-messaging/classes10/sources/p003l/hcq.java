package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemPlatinumPinGuideMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hcq {
    /* JADX INFO: renamed from: a */
    public static void m6950a(ItemPlatinumPinGuideMessage itemPlatinumPinGuideMessage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemPlatinumPinGuideMessage.a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemPlatinumPinGuideMessage.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemPlatinumPinGuideMessage.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPlatinumPinGuideMessage.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

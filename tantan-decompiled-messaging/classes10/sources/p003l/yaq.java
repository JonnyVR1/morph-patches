package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemODiamondVisitorGuideMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yaq {
    /* JADX INFO: renamed from: a */
    public static void m11167a(ItemODiamondVisitorGuideMessage itemODiamondVisitorGuideMessage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemODiamondVisitorGuideMessage.a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        itemODiamondVisitorGuideMessage.b = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        itemODiamondVisitorGuideMessage.c = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        itemODiamondVisitorGuideMessage.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemODiamondVisitorGuideMessage.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}

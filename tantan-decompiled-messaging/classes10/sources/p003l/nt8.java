package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nt8 {
    /* JADX INFO: renamed from: a */
    public static void m8371a(CoreGiftLayer coreGiftLayer, View view) {
        coreGiftLayer.f1586a = (CoreGiftLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreGiftLayer.f1587b = viewGroup.getChildAt(0);
        coreGiftLayer.f1588c = viewGroup.getChildAt(1);
        coreGiftLayer.f1589d = (LinearLayout) viewGroup.getChildAt(2);
        coreGiftLayer.f1590e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        coreGiftLayer.f1591f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreGiftLayer.f1592g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}

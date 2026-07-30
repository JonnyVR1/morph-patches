package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBreakIceMessage;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l3q {
    /* JADX INFO: renamed from: a */
    public static void m152734a(ItemBreakIceMessage itemBreakIceMessage, View view) {
        itemBreakIceMessage.f31683a = (ItemBreakIceMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemBreakIceMessage.f31684b = (VLinear) viewGroup.getChildAt(0);
        itemBreakIceMessage.f31685c = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemBreakIceMessage.f31686d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemBreakIceMessage.f31687e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        itemBreakIceMessage.f31688f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        itemBreakIceMessage.f31689g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemBreakIceMessage.f31690h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemBreakIceMessage.f31691i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemBreakIceMessage.f31692j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemBreakIceMessage.f31693k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemBreakIceMessage.f31694l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}

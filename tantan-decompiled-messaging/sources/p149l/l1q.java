package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBreakIceMessage;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l1q {
    /* JADX INFO: renamed from: a */
    public static void m148202a(ItemBreakIceMessage itemBreakIceMessage, View view) {
        itemBreakIceMessage.f30835a = (ItemBreakIceMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemBreakIceMessage.f30836b = (VLinear) viewGroup.getChildAt(0);
        itemBreakIceMessage.f30837c = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemBreakIceMessage.f30838d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemBreakIceMessage.f30839e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        itemBreakIceMessage.f30840f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        itemBreakIceMessage.f30841g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemBreakIceMessage.f30842h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemBreakIceMessage.f30843i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemBreakIceMessage.f30844j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemBreakIceMessage.f30845k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemBreakIceMessage.f30846l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageActionBarLeftLayout;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nuy {
    /* JADX INFO: renamed from: a */
    public static void m164820a(MessageActionBarLeftLayout messageActionBarLeftLayout, View view) {
        messageActionBarLeftLayout.f32946a = (MessageActionBarLeftLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageActionBarLeftLayout.f32947b = (VFrame) viewGroup.getChildAt(0);
        messageActionBarLeftLayout.f32948c = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32949d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32950e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32951f = (VLinear) viewGroup.getChildAt(1);
        messageActionBarLeftLayout.f32952g = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32953h = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32954i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32955j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32956k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32957l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32958m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32959n = (VImage) view.findViewById(edc0.f93454s5);
        ViewGroup viewGroup2 = (ViewGroup) view;
        messageActionBarLeftLayout.f32960o = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        messageActionBarLeftLayout.f32961p = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        messageActionBarLeftLayout.f32962q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        messageActionBarLeftLayout.f32963r = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        messageActionBarLeftLayout.f32964s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        messageActionBarLeftLayout.f32965t = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32966u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32967v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageActionBarLeftLayout.f32968w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageActionBarLeftLayout.f32969x = (VImage) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageActionBarLeftLayout.f32970y = (VText) viewGroup2.getChildAt(2);
    }
}

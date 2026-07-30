package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageActionBarLeftLayout;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qly {
    /* JADX INFO: renamed from: a */
    public static void m175526a(MessageActionBarLeftLayout messageActionBarLeftLayout, View view) {
        messageActionBarLeftLayout.f32098a = (MessageActionBarLeftLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageActionBarLeftLayout.f32099b = (VFrame) viewGroup.getChildAt(0);
        messageActionBarLeftLayout.f32100c = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32101d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32102e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32103f = (VLinear) viewGroup.getChildAt(1);
        messageActionBarLeftLayout.f32104g = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32105h = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32106i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32107j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32108k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32109l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageActionBarLeftLayout.f32110m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32111n = (VImage) view.findViewById(y4c0.f196219s5);
        ViewGroup viewGroup2 = (ViewGroup) view;
        messageActionBarLeftLayout.f32112o = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        messageActionBarLeftLayout.f32113p = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        messageActionBarLeftLayout.f32114q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        messageActionBarLeftLayout.f32115r = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        messageActionBarLeftLayout.f32116s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        messageActionBarLeftLayout.f32117t = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageActionBarLeftLayout.f32118u = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageActionBarLeftLayout.f32119v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageActionBarLeftLayout.f32120w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageActionBarLeftLayout.f32121x = (VImage) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageActionBarLeftLayout.f32122y = (VText) viewGroup2.getChildAt(2);
    }
}

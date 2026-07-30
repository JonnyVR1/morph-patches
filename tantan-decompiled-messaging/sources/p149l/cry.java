package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.KeyboardFrameWithShadowOutside;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.RecorderView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageSurfaceAnimContainer;
import com.p046p1.mobile.putong.core.p053ui.messages.model.record.view.RecordAnimLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageBarRootLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputEditRootLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cry {
    /* JADX INFO: renamed from: a */
    public static void m108460a(MessageBarOpt messageBarOpt, View view) {
        messageBarOpt.f31961b = (MessageBarOpt) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageBarOpt.f31962c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageBarOpt.f31963d = (MessageSurfaceAnimContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f31964e = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f31965f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f31966g = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        messageBarOpt.f31967h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        messageBarOpt.f31968i = (FilterScrollMoreViewPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        messageBarOpt.f31969j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        messageBarOpt.f31970k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        messageBarOpt.f31972l = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        messageBarOpt.f31973m = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        messageBarOpt.f31974n = (MessageBarRootLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageBarOpt.f31975o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageBarOpt.f31976p = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f31978q = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f31979r = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageBarOpt.f31980s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f31981t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f31982u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageBarOpt.f31983v = (MessageInputEditRootLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        messageBarOpt.f31984w = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f31985x = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f31986y = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f31987z = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        messageBarOpt.f31936A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f31937B = (RecorderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageBarOpt.f31938C = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        messageBarOpt.f31939D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        messageBarOpt.f31940E = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageBarOpt.f31942F = (RecordAnimLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageBarOpt.f31944G = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageBarOpt.f31945H = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        messageBarOpt.f31946I = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        messageBarOpt.f31947J = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        messageBarOpt.f31948K = (VButton) viewGroup.getChildAt(1);
        messageBarOpt.f31949L = (KeyboardFrameWithShadowOutside) viewGroup.getChildAt(2);
        messageBarOpt.f31950M = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}

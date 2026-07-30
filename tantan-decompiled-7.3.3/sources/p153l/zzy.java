package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.KeyboardFrameWithShadowOutside;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.RecorderView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageSurfaceAnimContainer;
import com.p051p1.mobile.putong.core.p058ui.messages.model.record.view.RecordAnimLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageBarRootLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputEditRootLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zzy {
    /* JADX INFO: renamed from: a */
    public static void m222292a(MessageBarOpt messageBarOpt, View view) {
        messageBarOpt.f32809b = (MessageBarOpt) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageBarOpt.f32810c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageBarOpt.f32811d = (MessageSurfaceAnimContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f32812e = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f32813f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f32814g = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        messageBarOpt.f32815h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        messageBarOpt.f32816i = (FilterScrollMoreViewPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        messageBarOpt.f32817j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        messageBarOpt.f32818k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        messageBarOpt.f32820l = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        messageBarOpt.f32821m = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        messageBarOpt.f32822n = (MessageBarRootLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageBarOpt.f32823o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageBarOpt.f32824p = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f32826q = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f32827r = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageBarOpt.f32828s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f32829t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f32830u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageBarOpt.f32831v = (MessageInputEditRootLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        messageBarOpt.f32832w = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f32833x = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageBarOpt.f32834y = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f32835z = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        messageBarOpt.f32784A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        messageBarOpt.f32785B = (RecorderView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        messageBarOpt.f32786C = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        messageBarOpt.f32787D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        messageBarOpt.f32788E = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        messageBarOpt.f32790F = (RecordAnimLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageBarOpt.f32792G = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageBarOpt.f32793H = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        messageBarOpt.f32794I = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        messageBarOpt.f32795J = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        messageBarOpt.f32796K = (VButton) viewGroup.getChildAt(1);
        messageBarOpt.f32797L = (KeyboardFrameWithShadowOutside) viewGroup.getChildAt(2);
        messageBarOpt.f32798M = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}

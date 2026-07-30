package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryAvatarView;
import com.p051p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class p7c0 {
    /* JADX INFO: renamed from: a */
    public static void m171101a(QuickchatConversationsEntryView quickchatConversationsEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickchatConversationsEntryView.f26637a = (VLinear) viewGroup.getChildAt(0);
        quickchatConversationsEntryView.f26638b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.f26639c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.f26640d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f26641e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f26642f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickchatConversationsEntryView.f26643g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.f26644h = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f26645i = (FrameLayout) viewGroup.getChildAt(1);
        quickchatConversationsEntryView.f26646j = (RelativeLayout) viewGroup.getChildAt(2);
        quickchatConversationsEntryView.f26647k = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickchatConversationsEntryView.f26648l = (RelativeLayout) viewGroup.getChildAt(3);
        quickchatConversationsEntryView.f26649m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickchatConversationsEntryView.f26650n = (QuickchatConversationsEntryAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickchatConversationsEntryView.f26651o = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        quickchatConversationsEntryView.f26652p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        quickchatConversationsEntryView.f26653q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }
}

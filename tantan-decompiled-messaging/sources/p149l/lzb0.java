package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryAvatarView;
import com.p046p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class lzb0 {
    /* JADX INFO: renamed from: a */
    public static void m152343a(QuickchatConversationsEntryView quickchatConversationsEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickchatConversationsEntryView.f25895a = (VLinear) viewGroup.getChildAt(0);
        quickchatConversationsEntryView.f25896b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.f25897c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.f25898d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f25899e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f25900f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickchatConversationsEntryView.f25901g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.f25902h = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f25903i = (FrameLayout) viewGroup.getChildAt(1);
        quickchatConversationsEntryView.f25904j = (RelativeLayout) viewGroup.getChildAt(2);
        quickchatConversationsEntryView.f25905k = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickchatConversationsEntryView.f25906l = (RelativeLayout) viewGroup.getChildAt(3);
        quickchatConversationsEntryView.f25907m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickchatConversationsEntryView.f25908n = (QuickchatConversationsEntryAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickchatConversationsEntryView.f25909o = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        quickchatConversationsEntryView.f25910p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        quickchatConversationsEntryView.f25911q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }
}

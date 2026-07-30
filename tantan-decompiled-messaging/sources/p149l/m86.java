package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemFriendMoments;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m86 {
    /* JADX INFO: renamed from: a */
    public static void m153462a(ConversationItemFriendMoments conversationItemFriendMoments, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemFriendMoments.f24808a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemFriendMoments.f24809b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemFriendMoments.f24810c = (FriendsMomentAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemFriendMoments.f24811d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemFriendMoments.f24812e = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemFriendMoments.f24813f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemFriendMoments.f24814g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemFriendMoments.f24815h = (TextView) viewGroup.getChildAt(2);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemFriendMoments;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class r96 {
    /* JADX INFO: renamed from: a */
    public static void m180290a(ConversationItemFriendMoments conversationItemFriendMoments, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemFriendMoments.f25550a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemFriendMoments.f25551b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemFriendMoments.f25552c = (FriendsMomentAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemFriendMoments.f25553d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemFriendMoments.f25554e = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemFriendMoments.f25555f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemFriendMoments.f25556g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemFriendMoments.f25557h = (TextView) viewGroup.getChildAt(2);
    }
}

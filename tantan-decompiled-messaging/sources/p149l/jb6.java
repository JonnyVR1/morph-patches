package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemTeamGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jb6 {
    /* JADX INFO: renamed from: a */
    public static void m140741a(ConversationItemTeamGroup conversationItemTeamGroup, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemTeamGroup.f24895a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemTeamGroup.f24896b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemTeamGroup.f24897c = (FriendsMomentAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemTeamGroup.f24898d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemTeamGroup.f24899e = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemTeamGroup.f24900f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemTeamGroup.f24901g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemTeamGroup.f24902h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationItemTeamGroup.f24903i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

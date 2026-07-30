package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemTeamGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.FriendsMomentAvatarView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mc6 {
    /* JADX INFO: renamed from: a */
    public static void m157915a(ConversationItemTeamGroup conversationItemTeamGroup, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemTeamGroup.f25637a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemTeamGroup.f25638b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemTeamGroup.f25639c = (FriendsMomentAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemTeamGroup.f25640d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemTeamGroup.f25641e = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemTeamGroup.f25642f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemTeamGroup.f25643g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemTeamGroup.f25644h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationItemTeamGroup.f25645i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

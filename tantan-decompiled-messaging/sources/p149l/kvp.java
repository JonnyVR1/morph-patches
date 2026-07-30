package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInviteItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class kvp {
    /* JADX INFO: renamed from: a */
    public static void m147390a(IntlVoiceLiveManagerInviteItemView intlVoiceLiveManagerInviteItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceLiveManagerInviteItemView._header = (VDraweeView) viewGroup.getChildAt(0);
        intlVoiceLiveManagerInviteItemView._status = viewGroup.getChildAt(1);
        intlVoiceLiveManagerInviteItemView._inviteBtn = (TextView) viewGroup.getChildAt(2);
        intlVoiceLiveManagerInviteItemView._user_name = (TextView) viewGroup.getChildAt(3);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.manager.VoiceLiveManagerInviteItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class i2o0 {
    /* JADX INFO: renamed from: a */
    public static void m138231a(VoiceLiveManagerInviteItemView voiceLiveManagerInviteItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveManagerInviteItemView._header = (VDraweeView) viewGroup.getChildAt(0);
        voiceLiveManagerInviteItemView._status = viewGroup.getChildAt(1);
        voiceLiveManagerInviteItemView._inviteBtn = (TextView) viewGroup.getChildAt(2);
        voiceLiveManagerInviteItemView._user_name = (TextView) viewGroup.getChildAt(3);
    }
}

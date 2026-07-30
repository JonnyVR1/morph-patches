package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInviteItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kvp {
    /* JADX INFO: renamed from: a */
    public static void m16835a(IntlVoiceLiveManagerInviteItemView intlVoiceLiveManagerInviteItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceLiveManagerInviteItemView.d = viewGroup.getChildAt(0);
        intlVoiceLiveManagerInviteItemView.e = viewGroup.getChildAt(1);
        intlVoiceLiveManagerInviteItemView.f = (TextView) viewGroup.getChildAt(2);
        intlVoiceLiveManagerInviteItemView.g = (TextView) viewGroup.getChildAt(3);
    }
}

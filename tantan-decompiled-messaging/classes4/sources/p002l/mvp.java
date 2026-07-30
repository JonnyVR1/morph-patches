package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mvp {
    /* JADX INFO: renamed from: a */
    public static void m18293a(IntlVoiceLiveManagerInvitePageView intlVoiceLiveManagerInvitePageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceLiveManagerInvitePageView.a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlVoiceLiveManagerInvitePageView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlVoiceLiveManagerInvitePageView.c = viewGroup.getChildAt(1);
        intlVoiceLiveManagerInvitePageView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}

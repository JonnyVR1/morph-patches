package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.ClipLayout;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class uqp {
    /* JADX INFO: renamed from: a */
    public static void m197376a(IntlVoiceActivitiesInChatView intlVoiceActivitiesInChatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceActivitiesInChatView.f46733c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlVoiceActivitiesInChatView.f46734d = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlVoiceActivitiesInChatView.f46735e = (ClipLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlVoiceActivitiesInChatView.f46736f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlVoiceActivitiesInChatView.f46737g = (VLinear) viewGroup.getChildAt(1);
        intlVoiceActivitiesInChatView.f46738h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVoiceActivitiesInChatView.f46739i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlVoiceActivitiesInChatView.f46740j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlVoiceActivitiesInChatView.f46741k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

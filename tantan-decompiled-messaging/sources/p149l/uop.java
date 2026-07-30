package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.ClipLayout;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class uop {
    /* JADX INFO: renamed from: a */
    public static void m194557a(IntlVoiceActivitiesInChatView intlVoiceActivitiesInChatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceActivitiesInChatView.f45885c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlVoiceActivitiesInChatView.f45886d = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlVoiceActivitiesInChatView.f45887e = (ClipLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlVoiceActivitiesInChatView.f45888f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlVoiceActivitiesInChatView.f45889g = (VLinear) viewGroup.getChildAt(1);
        intlVoiceActivitiesInChatView.f45890h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVoiceActivitiesInChatView.f45891i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlVoiceActivitiesInChatView.f45892j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlVoiceActivitiesInChatView.f45893k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

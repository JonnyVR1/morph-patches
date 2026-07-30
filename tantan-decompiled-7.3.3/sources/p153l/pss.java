package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatItemView;

/* JADX INFO: loaded from: classes9.dex */
public class pss {
    /* JADX INFO: renamed from: a */
    public static void m173696a(LiveGroupChatItemView liveGroupChatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGroupChatItemView.f47396d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveGroupChatItemView.f47397e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveGroupChatItemView.f47398f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveGroupChatItemView.f47399g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}

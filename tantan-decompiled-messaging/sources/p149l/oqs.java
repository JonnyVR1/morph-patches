package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatItemView;

/* JADX INFO: loaded from: classes13.dex */
public class oqs {
    /* JADX INFO: renamed from: a */
    public static void m165491a(LiveGroupChatItemView liveGroupChatItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGroupChatItemView.f46548d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveGroupChatItemView.f46549e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveGroupChatItemView.f46550f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveGroupChatItemView.f46551g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}

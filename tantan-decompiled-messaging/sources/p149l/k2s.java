package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;
import com.p046p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class k2s {
    /* JADX INFO: renamed from: a */
    public static void m144339a(LiveChatItem liveChatItem, View view) {
        liveChatItem.f48747a = (LiveChatItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveChatItem.f48748b = (LinearLayout) viewGroup.getChildAt(0);
        liveChatItem.f48749c = (AutoRefreshTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveChatItem.f48750d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveChatItem.f48751e = (VDraweeView) viewGroup.getChildAt(1);
    }
}

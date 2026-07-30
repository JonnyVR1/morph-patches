package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;
import com.p051p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class l4s {
    /* JADX INFO: renamed from: a */
    public static void m152838a(LiveChatItem liveChatItem, View view) {
        liveChatItem.f49595a = (LiveChatItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveChatItem.f49596b = (LinearLayout) viewGroup.getChildAt(0);
        liveChatItem.f49597c = (AutoRefreshTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveChatItem.f49598d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveChatItem.f49599e = (VDraweeView) viewGroup.getChildAt(1);
    }
}

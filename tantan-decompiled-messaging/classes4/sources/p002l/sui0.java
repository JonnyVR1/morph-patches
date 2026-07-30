package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sui0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m22705a(TopChatView topChatView, View view) {
        topChatView.f4993d = (TopChatView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topChatView.f4994e = viewGroup.getChildAt(0);
        topChatView.f4995f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topChatView.f4996g = viewGroup.getChildAt(1);
        topChatView.f4997h = viewGroup.getChildAt(2);
        topChatView.f4998i = viewGroup.getChildAt(3);
        topChatView.f4999j = viewGroup.getChildAt(4);
    }
}

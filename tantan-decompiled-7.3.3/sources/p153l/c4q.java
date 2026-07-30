package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatUnlockLayout;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c4q {
    /* JADX INFO: renamed from: a */
    public static void m107956a(ItemChatUnlockLayout itemChatUnlockLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemChatUnlockLayout.f31729a = (NewTalkProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemChatUnlockLayout.f31730b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemChatUnlockLayout.f31731c = (TextView) viewGroup.getChildAt(1);
        itemChatUnlockLayout.f31732d = (VText) viewGroup.getChildAt(2);
    }
}

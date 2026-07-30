package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatUnlockLayout;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c2q {
    /* JADX INFO: renamed from: a */
    public static void m104917a(ItemChatUnlockLayout itemChatUnlockLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemChatUnlockLayout.f30881a = (NewTalkProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemChatUnlockLayout.f30882b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemChatUnlockLayout.f30883c = (TextView) viewGroup.getChildAt(1);
        itemChatUnlockLayout.f30884d = (VText) viewGroup.getChildAt(2);
    }
}

package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cv4 {
    /* JADX INFO: renamed from: a */
    public static void m11391a(ChatInputEntryView chatInputEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatInputEntryView.f4916a = (LinearLayout) viewGroup.getChildAt(0);
        chatInputEntryView.f4917b = (BottomInputView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatInputEntryView.f4918c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatInputEntryView.f4919d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

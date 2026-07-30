package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cv4 {
    /* JADX INFO: renamed from: a */
    public static void m108846a(ChatInputEntryView chatInputEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatInputEntryView.f48874a = (LinearLayout) viewGroup.getChildAt(0);
        chatInputEntryView.f48875b = (BottomInputView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatInputEntryView.f48876c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatInputEntryView.f48877d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

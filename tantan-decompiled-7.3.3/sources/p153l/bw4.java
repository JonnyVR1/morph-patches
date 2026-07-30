package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bw4 {
    /* JADX INFO: renamed from: a */
    public static void m106635a(ChatInputEntryView chatInputEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatInputEntryView.f49722a = (LinearLayout) viewGroup.getChildAt(0);
        chatInputEntryView.f49723b = (BottomInputView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatInputEntryView.f49724c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatInputEntryView.f49725d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}

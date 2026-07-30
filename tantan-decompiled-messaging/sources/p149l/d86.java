package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemBlindBoxEntrance;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d86 {
    /* JADX INFO: renamed from: a */
    public static void m110271a(ConversationItemBlindBoxEntrance conversationItemBlindBoxEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemBlindBoxEntrance.f24802a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemBlindBoxEntrance.f24803b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemBlindBoxEntrance.f24804c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemBlindBoxEntrance.f24805d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemBlindBoxEntrance.f24806e = (TextView) viewGroup.getChildAt(2);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemBlindBoxEntrance;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i96 {
    /* JADX INFO: renamed from: a */
    public static void m139081a(ConversationItemBlindBoxEntrance conversationItemBlindBoxEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemBlindBoxEntrance.f25544a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemBlindBoxEntrance.f25545b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemBlindBoxEntrance.f25546c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemBlindBoxEntrance.f25547d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemBlindBoxEntrance.f25548e = (TextView) viewGroup.getChildAt(2);
    }
}

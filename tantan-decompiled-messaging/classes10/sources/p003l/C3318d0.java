package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.aichat.AIChatViewAdviceItem;

/* JADX INFO: renamed from: l.d0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3318d0 {
    /* JADX INFO: renamed from: a */
    public static void m6028a(AIChatViewAdviceItem aIChatViewAdviceItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aIChatViewAdviceItem.a = (TextView) viewGroup.getChildAt(0);
        aIChatViewAdviceItem.b = (ImageView) viewGroup.getChildAt(1);
    }
}

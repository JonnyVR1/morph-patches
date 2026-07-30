package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SendMultiSuperLikePushBubble;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vge0 {
    /* JADX INFO: renamed from: a */
    public static void m10225a(SendMultiSuperLikePushBubble sendMultiSuperLikePushBubble, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sendMultiSuperLikePushBubble.a = viewGroup.getChildAt(0);
        sendMultiSuperLikePushBubble.b = (TextView) viewGroup.getChildAt(1);
    }
}

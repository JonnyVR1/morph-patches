package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SendMultiSuperLikePushBubble;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class vge0 {
    /* JADX INFO: renamed from: a */
    public static void m198317a(SendMultiSuperLikePushBubble sendMultiSuperLikePushBubble, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sendMultiSuperLikePushBubble._avatar = (VDraweeView) viewGroup.getChildAt(0);
        sendMultiSuperLikePushBubble._title = (TextView) viewGroup.getChildAt(1);
    }
}

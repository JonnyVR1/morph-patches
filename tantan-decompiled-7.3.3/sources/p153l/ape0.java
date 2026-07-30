package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SendMultiSuperLikePushBubble;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ape0 {
    /* JADX INFO: renamed from: a */
    public static void m99314a(SendMultiSuperLikePushBubble sendMultiSuperLikePushBubble, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sendMultiSuperLikePushBubble._avatar = (VDraweeView) viewGroup.getChildAt(0);
        sendMultiSuperLikePushBubble._title = (TextView) viewGroup.getChildAt(1);
    }
}

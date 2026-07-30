package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SendMultiSuperLikeBubbleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uge0 {
    /* JADX INFO: renamed from: a */
    public static void m9720a(SendMultiSuperLikeBubbleView sendMultiSuperLikeBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sendMultiSuperLikeBubbleView.a = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sendMultiSuperLikeBubbleView.b = (TextView) viewGroup.getChildAt(2);
    }
}

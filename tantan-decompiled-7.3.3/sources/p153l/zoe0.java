package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SendMultiSuperLikeBubbleView;

/* JADX INFO: loaded from: classes10.dex */
public class zoe0 {
    /* JADX INFO: renamed from: a */
    public static void m220750a(SendMultiSuperLikeBubbleView sendMultiSuperLikeBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sendMultiSuperLikeBubbleView._superlike_count = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sendMultiSuperLikeBubbleView._send = (TextView) viewGroup.getChildAt(2);
    }
}

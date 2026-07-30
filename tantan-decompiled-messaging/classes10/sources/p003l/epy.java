package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class epy {
    /* JADX INFO: renamed from: a */
    public static void m6312a(MessageBarActionItemView messageBarActionItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageBarActionItemView.a = viewGroup.getChildAt(0);
        messageBarActionItemView.b = viewGroup.getChildAt(1);
        messageBarActionItemView.c = viewGroup.getChildAt(2);
        messageBarActionItemView.d = viewGroup.getChildAt(3);
    }
}

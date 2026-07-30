package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.view.CommonLabelShowView;
import com.p1.mobile.putong.core.ui.messages.view.MessageIdealTypeHeadLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e5z {
    /* JADX INFO: renamed from: a */
    public static void m6243a(MessageIdealTypeHeadLayout messageIdealTypeHeadLayout, View view) {
        messageIdealTypeHeadLayout.a = (LinearLayout) ((ViewGroup) view).getChildAt(0);
        messageIdealTypeHeadLayout.b = view.findViewById(y4c0.f8897n1);
        ViewGroup viewGroup = (ViewGroup) view;
        messageIdealTypeHeadLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageIdealTypeHeadLayout.d = (CommonLabelShowView) viewGroup.getChildAt(1);
        messageIdealTypeHeadLayout.e = viewGroup.getChildAt(2);
    }
}

package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageIdealTypeHeadLayout;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e5z {
    /* JADX INFO: renamed from: a */
    public static void m114924a(MessageIdealTypeHeadLayout messageIdealTypeHeadLayout, View view) {
        messageIdealTypeHeadLayout.f32388a = (LinearLayout) ((ViewGroup) view).getChildAt(0);
        messageIdealTypeHeadLayout.f32389b = (VImage) view.findViewById(y4c0.f196180n1);
        ViewGroup viewGroup = (ViewGroup) view;
        messageIdealTypeHeadLayout.f32390c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageIdealTypeHeadLayout.f32391d = (CommonLabelShowView) viewGroup.getChildAt(1);
        messageIdealTypeHeadLayout.f32392e = (VRecyclerView) viewGroup.getChildAt(2);
    }
}

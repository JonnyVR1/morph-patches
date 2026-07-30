package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageIdealTypeHeadLayout;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bez {
    /* JADX INFO: renamed from: a */
    public static void m103792a(MessageIdealTypeHeadLayout messageIdealTypeHeadLayout, View view) {
        messageIdealTypeHeadLayout.f33236a = (LinearLayout) ((ViewGroup) view).getChildAt(0);
        messageIdealTypeHeadLayout.f33237b = (VImage) view.findViewById(edc0.f93415n1);
        ViewGroup viewGroup = (ViewGroup) view;
        messageIdealTypeHeadLayout.f33238c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageIdealTypeHeadLayout.f33239d = (CommonLabelShowView) viewGroup.getChildAt(1);
        messageIdealTypeHeadLayout.f33240e = (VRecyclerView) viewGroup.getChildAt(2);
    }
}

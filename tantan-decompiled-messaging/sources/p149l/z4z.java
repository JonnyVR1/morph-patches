package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageIdealEnquiryLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z4z {
    /* JADX INFO: renamed from: a */
    public static void m217247a(MessageIdealEnquiryLayout messageIdealEnquiryLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageIdealEnquiryLayout.f32376a = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageIdealEnquiryLayout.f32377b = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageIdealEnquiryLayout.f32378c = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageIdealEnquiryLayout.f32379d = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageIdealEnquiryLayout.f32380e = (VImage) viewGroup.getChildAt(1);
    }
}

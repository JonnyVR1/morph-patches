package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageIdealEnquiryLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wdz {
    /* JADX INFO: renamed from: a */
    public static void m205989a(MessageIdealEnquiryLayout messageIdealEnquiryLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageIdealEnquiryLayout.f33224a = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageIdealEnquiryLayout.f33225b = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageIdealEnquiryLayout.f33226c = (FlowTagsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageIdealEnquiryLayout.f33227d = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageIdealEnquiryLayout.f33228e = (VImage) viewGroup.getChildAt(1);
    }
}

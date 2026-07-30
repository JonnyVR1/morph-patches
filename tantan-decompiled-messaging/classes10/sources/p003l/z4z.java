package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.view.MessageIdealEnquiryLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z4z {
    /* JADX INFO: renamed from: a */
    public static void m11343a(MessageIdealEnquiryLayout messageIdealEnquiryLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageIdealEnquiryLayout.a = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageIdealEnquiryLayout.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageIdealEnquiryLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageIdealEnquiryLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageIdealEnquiryLayout.e = viewGroup.getChildAt(1);
    }
}

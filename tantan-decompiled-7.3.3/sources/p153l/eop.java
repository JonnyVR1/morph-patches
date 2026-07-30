package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.core.newui.messages.business.IntlVisitorConversationView;
import p151v.VDraweeView;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class eop {
    /* JADX INFO: renamed from: a */
    public static void m121756a(IntlVisitorConversationView intlVisitorConversationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorConversationView.f26495d = (VDraweeView) viewGroup.getChildAt(0);
        intlVisitorConversationView.f26496e = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVisitorConversationView.f26497f = (ViewStub) viewGroup.getChildAt(2);
        intlVisitorConversationView.f26498g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlVisitorConversationView.f26499h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
    }
}

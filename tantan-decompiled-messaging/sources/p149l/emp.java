package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.core.newui.messages.business.IntlVisitorConversationView;
import p147v.VDraweeView;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class emp {
    /* JADX INFO: renamed from: a */
    public static void m117214a(IntlVisitorConversationView intlVisitorConversationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorConversationView.f25753d = (VDraweeView) viewGroup.getChildAt(0);
        intlVisitorConversationView.f25754e = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVisitorConversationView.f25755f = (ViewStub) viewGroup.getChildAt(2);
        intlVisitorConversationView.f25756g = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlVisitorConversationView.f25757h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
    }
}

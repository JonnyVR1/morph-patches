package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.core.newui.messages.business.IntlVisitorConversationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class emp {
    /* JADX INFO: renamed from: a */
    public static void m6308a(IntlVisitorConversationView intlVisitorConversationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorConversationView.d = viewGroup.getChildAt(0);
        intlVisitorConversationView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVisitorConversationView.f = (ViewStub) viewGroup.getChildAt(2);
        intlVisitorConversationView.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlVisitorConversationView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
    }
}

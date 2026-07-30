package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.business.BusinessConversationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oj3 {
    /* JADX INFO: renamed from: a */
    public static void m8459a(BusinessConversationView businessConversationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        businessConversationView.h = viewGroup.getChildAt(0);
        businessConversationView.i = (ImageView) viewGroup.getChildAt(1);
        businessConversationView.j = (FrameLayout) viewGroup.getChildAt(2);
        businessConversationView.k = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        businessConversationView.l = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        businessConversationView.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        businessConversationView.n = viewGroup.getChildAt(3);
        businessConversationView.o = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        businessConversationView.p = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        businessConversationView.q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        businessConversationView.r = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        businessConversationView.s = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        businessConversationView.t = (ViewStub) viewGroup.getChildAt(4);
        businessConversationView.u = viewGroup.getChildAt(5);
        businessConversationView.v = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        businessConversationView.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        businessConversationView.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        businessConversationView.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        businessConversationView.z = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        businessConversationView.A = viewGroup.getChildAt(7);
    }
}

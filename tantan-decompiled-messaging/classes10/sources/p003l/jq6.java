package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationsListHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jq6 {
    /* JADX INFO: renamed from: a */
    public static void m7451a(ConversationsListHeadView conversationsListHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationsListHeadView.m = viewGroup.getChildAt(0);
        conversationsListHeadView.n = viewGroup.getChildAt(1);
        conversationsListHeadView.o = viewGroup.getChildAt(2);
        conversationsListHeadView.p = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationsListHeadView.q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        conversationsListHeadView.r = (FrameLayout) viewGroup.getChildAt(4);
        conversationsListHeadView.s = viewGroup.getChildAt(5);
        conversationsListHeadView.t = (LinearLayout) viewGroup.getChildAt(6);
        conversationsListHeadView.u = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationsListHeadView.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        conversationsListHeadView.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        conversationsListHeadView.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        conversationsListHeadView.A = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        conversationsListHeadView.B = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        conversationsListHeadView.C = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.D = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.E = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        conversationsListHeadView.F = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        conversationsListHeadView.G = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
        conversationsListHeadView.H = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(5);
        conversationsListHeadView.I = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(6);
    }
}

package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iq6 {
    /* JADX INFO: renamed from: a */
    public static void m7285a(ConversationsListHeadView conversationsListHeadView, View view) {
        conversationsListHeadView.c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationsListHeadView.d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationsListHeadView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationsListHeadView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationsListHeadView.g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationsListHeadView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationsListHeadView.j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationsListHeadView.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7286b(ConversationsListHeadView conversationsListHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.U4, viewGroup, false);
        m7285a(conversationsListHeadView, viewInflate);
        return viewInflate;
    }
}

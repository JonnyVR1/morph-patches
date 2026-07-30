package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pmm {
    /* JADX INFO: renamed from: a */
    public static void m8765a(ImpressSignalConversationHeadView impressSignalConversationHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        impressSignalConversationHeadView.a = viewGroup.getChildAt(0);
        impressSignalConversationHeadView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        impressSignalConversationHeadView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        impressSignalConversationHeadView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        impressSignalConversationHeadView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        impressSignalConversationHeadView.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        impressSignalConversationHeadView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        impressSignalConversationHeadView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        impressSignalConversationHeadView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        impressSignalConversationHeadView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        impressSignalConversationHeadView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        impressSignalConversationHeadView.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        impressSignalConversationHeadView.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        impressSignalConversationHeadView.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        impressSignalConversationHeadView.o = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        impressSignalConversationHeadView.p = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        impressSignalConversationHeadView.q = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        impressSignalConversationHeadView.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        impressSignalConversationHeadView.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
        impressSignalConversationHeadView.t = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8766b(ImpressSignalConversationHeadView impressSignalConversationHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.q4, viewGroup, true);
        m8765a(impressSignalConversationHeadView, viewInflate);
        return viewInflate;
    }
}

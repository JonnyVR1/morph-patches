package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n56 {
    /* JADX INFO: renamed from: a */
    public static void m8313a(ConversationBoostDetailAct conversationBoostDetailAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationBoostDetailAct.c = viewGroup.getChildAt(0);
        conversationBoostDetailAct.d = (ImageView) viewGroup.getChildAt(1);
        conversationBoostDetailAct.e = (ImageView) viewGroup.getChildAt(2);
        conversationBoostDetailAct.f = (TextView) viewGroup.getChildAt(3);
        conversationBoostDetailAct.g = (TextView) viewGroup.getChildAt(4);
        conversationBoostDetailAct.h = viewGroup.getChildAt(5);
        conversationBoostDetailAct.i = viewGroup.getChildAt(6);
        conversationBoostDetailAct.j = viewGroup.getChildAt(8);
        conversationBoostDetailAct.k = viewGroup.getChildAt(9);
        conversationBoostDetailAct.l = (TextView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m8314b(ConversationBoostDetailAct conversationBoostDetailAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.m, viewGroup, false);
        m8313a(conversationBoostDetailAct, viewInflate);
        return viewInflate;
    }
}

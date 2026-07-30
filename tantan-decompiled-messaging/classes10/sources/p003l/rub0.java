package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rub0 {
    /* JADX INFO: renamed from: a */
    public static void m9191a(QuickChatHeaderView quickChatHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatHeaderView.h = viewGroup.getChildAt(0);
        quickChatHeaderView.i = viewGroup.getChildAt(1);
        quickChatHeaderView.j = viewGroup.getChildAt(2);
        quickChatHeaderView.k = viewGroup.getChildAt(3);
        quickChatHeaderView.l = viewGroup.getChildAt(4);
        quickChatHeaderView.m = viewGroup.getChildAt(5);
        quickChatHeaderView.n = viewGroup.getChildAt(6);
        quickChatHeaderView.o = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m9192b(QuickChatHeaderView quickChatHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.tb, viewGroup, true);
        m9191a(quickChatHeaderView, viewInflate);
        return viewInflate;
    }
}

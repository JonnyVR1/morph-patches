package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderUserView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class otb0 {
    /* JADX INFO: renamed from: a */
    public static void m8591a(QuickChatHeaderUserView quickChatHeaderUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatHeaderUserView.d = viewGroup.getChildAt(0);
        quickChatHeaderUserView.e = viewGroup.getChildAt(1);
        quickChatHeaderUserView.f = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatHeaderUserView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        quickChatHeaderUserView.h = viewGroup.getChildAt(3);
        quickChatHeaderUserView.i = viewGroup.getChildAt(4);
        quickChatHeaderUserView.j = viewGroup.getChildAt(5);
        quickChatHeaderUserView.k = viewGroup.getChildAt(6);
        quickChatHeaderUserView.l = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m8592b(QuickChatHeaderUserView quickChatHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ub, viewGroup, true);
        m8591a(quickChatHeaderUserView, viewInflate);
        return viewInflate;
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gxb0 {
    /* JADX INFO: renamed from: a */
    public static void m6844a(QuickChatPrivilegeAnimView quickChatPrivilegeAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPrivilegeAnimView.d = viewGroup.getChildAt(0);
        quickChatPrivilegeAnimView.e = viewGroup.getChildAt(1);
        quickChatPrivilegeAnimView.f = (FrameLayout) viewGroup.getChildAt(2);
        quickChatPrivilegeAnimView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatPrivilegeAnimView.h = (FrameLayout) viewGroup.getChildAt(3);
        quickChatPrivilegeAnimView.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickChatPrivilegeAnimView.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickChatPrivilegeAnimView.k = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickChatPrivilegeAnimView.l = (ImageView) viewGroup.getChildAt(4);
        quickChatPrivilegeAnimView.m = (ImageView) viewGroup.getChildAt(5);
        quickChatPrivilegeAnimView.n = (ImageView) viewGroup.getChildAt(6);
        quickChatPrivilegeAnimView.o = (ImageView) viewGroup.getChildAt(7);
        quickChatPrivilegeAnimView.p = (ImageView) viewGroup.getChildAt(8);
        quickChatPrivilegeAnimView.q = viewGroup.getChildAt(9);
    }
}

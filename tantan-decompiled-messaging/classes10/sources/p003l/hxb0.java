package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hxb0 {
    /* JADX INFO: renamed from: a */
    public static void m7086a(QuickChatPullHeadAnim quickChatPullHeadAnim, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPullHeadAnim.d = viewGroup.getChildAt(0);
        quickChatPullHeadAnim.e = viewGroup.getChildAt(1);
        quickChatPullHeadAnim.f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7087b(QuickChatPullHeadAnim quickChatPullHeadAnim, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.zb, viewGroup, true);
        m7086a(quickChatPullHeadAnim, viewInflate);
        return viewInflate;
    }
}

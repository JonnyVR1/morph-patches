package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hxb0 {
    /* JADX INFO: renamed from: a */
    public static void m133318a(QuickChatPullHeadAnim quickChatPullHeadAnim, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPullHeadAnim.f25716d = (VDraweeView) viewGroup.getChildAt(0);
        quickChatPullHeadAnim.f25717e = (ImageXfermodeView) viewGroup.getChildAt(1);
        quickChatPullHeadAnim.f25718f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m133319b(QuickChatPullHeadAnim quickChatPullHeadAnim, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96117zb, viewGroup, true);
        m133318a(quickChatPullHeadAnim, viewInflate);
        return viewInflate;
    }
}

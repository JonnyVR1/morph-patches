package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l5c0 {
    /* JADX INFO: renamed from: a */
    public static void m152929a(QuickChatPullHeadAnim quickChatPullHeadAnim, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPullHeadAnim.f26458d = (VDraweeView) viewGroup.getChildAt(0);
        quickChatPullHeadAnim.f26459e = (ImageXfermodeView) viewGroup.getChildAt(1);
        quickChatPullHeadAnim.f26460f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152930b(QuickChatPullHeadAnim quickChatPullHeadAnim, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125428Gb, viewGroup, true);
        m152929a(quickChatPullHeadAnim, viewInflate);
        return viewInflate;
    }
}

package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class deq0 {
    /* JADX INFO: renamed from: a */
    public static void m115454a(WengwengPullHeadAnim wengwengPullHeadAnim, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wengwengPullHeadAnim.f26434d = (SVGAnimationView) viewGroup.getChildAt(0);
        wengwengPullHeadAnim.f26435e = (VLinear) viewGroup.getChildAt(1);
        wengwengPullHeadAnim.f26436f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wengwengPullHeadAnim.f26437g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wengwengPullHeadAnim.f26438h = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m115455b(WengwengPullHeadAnim wengwengPullHeadAnim, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125750ad, viewGroup, true);
        m115454a(wengwengPullHeadAnim, viewInflate);
        return viewInflate;
    }
}

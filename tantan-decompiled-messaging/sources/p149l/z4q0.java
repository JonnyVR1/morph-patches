package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z4q0 {
    /* JADX INFO: renamed from: a */
    public static void m217116a(WengwengPullHeadAnim wengwengPullHeadAnim, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wengwengPullHeadAnim.f25692d = (SVGAnimationView) viewGroup.getChildAt(0);
        wengwengPullHeadAnim.f25693e = (VLinear) viewGroup.getChildAt(1);
        wengwengPullHeadAnim.f25694f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wengwengPullHeadAnim.f25695g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wengwengPullHeadAnim.f25696h = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m217117b(WengwengPullHeadAnim wengwengPullHeadAnim, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95583Tc, viewGroup, true);
        m217116a(wengwengPullHeadAnim, viewInflate);
        return viewInflate;
    }
}

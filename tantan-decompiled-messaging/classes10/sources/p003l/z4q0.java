package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z4q0 {
    /* JADX INFO: renamed from: a */
    public static void m11341a(WengwengPullHeadAnim wengwengPullHeadAnim, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wengwengPullHeadAnim.d = viewGroup.getChildAt(0);
        wengwengPullHeadAnim.e = viewGroup.getChildAt(1);
        wengwengPullHeadAnim.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wengwengPullHeadAnim.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wengwengPullHeadAnim.h = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11342b(WengwengPullHeadAnim wengwengPullHeadAnim, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Tc, viewGroup, true);
        m11341a(wengwengPullHeadAnim, viewInflate);
        return viewInflate;
    }
}

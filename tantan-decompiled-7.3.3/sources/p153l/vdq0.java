package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng.C8325a;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim;

/* JADX INFO: loaded from: classes10.dex */
public class vdq0 {
    /* JADX INFO: renamed from: a */
    public static void m200990a(C8325a c8325a, View view) {
        c8325a._pullhead_anim = (WengwengPullHeadAnim) ((ViewGroup) view).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m200991b(C8325a c8325a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125733Zc, viewGroup, true);
        m200990a(c8325a, viewInflate);
        return viewInflate;
    }
}

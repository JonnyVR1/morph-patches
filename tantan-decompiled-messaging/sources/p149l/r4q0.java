package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.C8174a;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim;

/* JADX INFO: loaded from: classes10.dex */
public class r4q0 {
    /* JADX INFO: renamed from: a */
    public static void m177821a(C8174a c8174a, View view) {
        c8174a._pullhead_anim = (WengwengPullHeadAnim) ((ViewGroup) view).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m177822b(C8174a c8174a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95567Sc, viewGroup, true);
        m177821a(c8174a, viewInflate);
        return viewInflate;
    }
}

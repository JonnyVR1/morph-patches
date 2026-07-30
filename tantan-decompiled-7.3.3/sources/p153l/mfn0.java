package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class mfn0 {
    /* JADX INFO: renamed from: a */
    public static void m158171a(lfn0 lfn0Var, View view) {
        lfn0Var._fl_deputy = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lfn0Var._vc_deputy_1 = (NormalVoiceDeputyItemView) viewGroup.getChildAt(0);
        lfn0Var._one = (LinearLayout) viewGroup.getChildAt(1);
        lfn0Var._vc_deputy_2 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        lfn0Var._vc_deputy_3 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        lfn0Var._vc_deputy_4 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        lfn0Var._vc_deputy_5 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m158172b(lfn0 lfn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198975X7, viewGroup, false);
        m158171a(lfn0Var, viewInflate);
        return viewInflate;
    }
}

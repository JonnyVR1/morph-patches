package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class i6n0 {
    /* JADX INFO: renamed from: a */
    public static void m134626a(h6n0 h6n0Var, View view) {
        h6n0Var._fl_deputy = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h6n0Var._vc_deputy_1 = (NormalVoiceDeputyItemView) viewGroup.getChildAt(0);
        h6n0Var._one = (LinearLayout) viewGroup.getChildAt(1);
        h6n0Var._vc_deputy_2 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        h6n0Var._vc_deputy_3 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h6n0Var._vc_deputy_4 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        h6n0Var._vc_deputy_5 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m134627b(h6n0 h6n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168243X7, viewGroup, false);
        m134626a(h6n0Var, viewInflate);
        return viewInflate;
    }
}

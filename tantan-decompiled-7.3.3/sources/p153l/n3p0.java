package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class n3p0 {
    /* JADX INFO: renamed from: a */
    public static void m161350a(m3p0 m3p0Var, View view) {
        m3p0Var._fl_deputy = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        m3p0Var._vc_deputy_1 = (NormalVoiceDeputyItemView) viewGroup.getChildAt(0);
        m3p0Var._one = (LinearLayout) viewGroup.getChildAt(1);
        m3p0Var._vc_deputy_2 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        m3p0Var._vc_deputy_3 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m161351b(m3p0 m3p0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199077f8, viewGroup, false);
        m161350a(m3p0Var, viewInflate);
        return viewInflate;
    }
}

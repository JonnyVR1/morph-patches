package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class juo0 {
    /* JADX INFO: renamed from: a */
    public static void m143337a(iuo0 iuo0Var, View view) {
        iuo0Var._fl_deputy = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        iuo0Var._vc_deputy_1 = (NormalVoiceDeputyItemView) viewGroup.getChildAt(0);
        iuo0Var._one = (LinearLayout) viewGroup.getChildAt(1);
        iuo0Var._vc_deputy_2 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iuo0Var._vc_deputy_3 = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m143338b(iuo0 iuo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168345f8, viewGroup, false);
        m143337a(iuo0Var, viewInflate);
        return viewInflate;
    }
}

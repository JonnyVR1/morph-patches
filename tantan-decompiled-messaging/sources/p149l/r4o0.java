package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class r4o0 {
    /* JADX INFO: renamed from: a */
    public static void m177819a(q4o0 q4o0Var, View view) {
        q4o0Var.f152655e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q4o0Var.f152656f = (NormalVoiceDeputyItemView) viewGroup.getChildAt(0);
        q4o0Var.f152657g = (LinearLayout) viewGroup.getChildAt(1);
        q4o0Var.f152658h = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        q4o0Var.f152659i = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        q4o0Var.f152660j = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        q4o0Var.f152661k = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        q4o0Var.f152662l = (LinearLayout) viewGroup.getChildAt(2);
        q4o0Var.f152663m = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        q4o0Var.f152664n = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        q4o0Var.f152665o = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        q4o0Var.f152666p = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m177820b(q4o0 q4o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168306c8, viewGroup, false);
        m177819a(q4o0Var, viewInflate);
        return viewInflate;
    }
}

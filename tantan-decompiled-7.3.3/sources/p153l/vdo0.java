package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class vdo0 {
    /* JADX INFO: renamed from: a */
    public static void m200988a(udo0 udo0Var, View view) {
        udo0Var.f178559e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        udo0Var.f178560f = (NormalVoiceDeputyItemView) viewGroup.getChildAt(0);
        udo0Var.f178561g = (LinearLayout) viewGroup.getChildAt(1);
        udo0Var.f178562h = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        udo0Var.f178563i = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        udo0Var.f178564j = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        udo0Var.f178565k = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        udo0Var.f178566l = (LinearLayout) viewGroup.getChildAt(2);
        udo0Var.f178567m = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        udo0Var.f178568n = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        udo0Var.f178569o = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        udo0Var.f178570p = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m200989b(udo0 udo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199038c8, viewGroup, false);
        m200988a(udo0Var, viewInflate);
        return viewInflate;
    }
}

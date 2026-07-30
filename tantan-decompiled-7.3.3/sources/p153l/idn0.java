package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class idn0 {
    /* JADX INFO: renamed from: a */
    public static void m139538a(hdn0 hdn0Var, View view) {
        hdn0Var.f109013e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hdn0Var.f109014f = (LinearLayout) viewGroup.getChildAt(0);
        hdn0Var.f109015g = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hdn0Var.f109016h = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hdn0Var.f109017i = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hdn0Var.f109018j = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        hdn0Var.f109019k = (LinearLayout) viewGroup.getChildAt(1);
        hdn0Var.f109020l = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hdn0Var.f109021m = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hdn0Var.f109022n = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hdn0Var.f109023o = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m139539b(hdn0 hdn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198963W7, viewGroup, false);
        m139538a(hdn0Var, viewInflate);
        return viewInflate;
    }
}

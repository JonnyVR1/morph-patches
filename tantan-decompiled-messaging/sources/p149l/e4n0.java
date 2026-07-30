package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;

/* JADX INFO: loaded from: classes4.dex */
public class e4n0 {
    /* JADX INFO: renamed from: a */
    public static void m114697a(d4n0 d4n0Var, View view) {
        d4n0Var.f84319e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d4n0Var.f84320f = (LinearLayout) viewGroup.getChildAt(0);
        d4n0Var.f84321g = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d4n0Var.f84322h = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        d4n0Var.f84323i = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        d4n0Var.f84324j = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        d4n0Var.f84325k = (LinearLayout) viewGroup.getChildAt(1);
        d4n0Var.f84326l = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        d4n0Var.f84327m = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        d4n0Var.f84328n = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        d4n0Var.f84329o = (NormalVoiceDeputyItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m114698b(d4n0 d4n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168231W7, viewGroup, false);
        m114697a(d4n0Var, viewInflate);
        return viewInflate;
    }
}

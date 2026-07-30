package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.EmailVerifyCodeView;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VImage;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rwe {
    /* JADX INFO: renamed from: a */
    public static void m181390a(qwe qweVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qweVar.f156681c = (VScroll) viewGroup.getChildAt(0);
        qweVar.f156682d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qweVar.f156683e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qweVar.f156684f = (EmailVerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        qweVar.f156685g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        qweVar.f156686h = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        qweVar.f156687i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        qweVar.f156688j = (ConstraintLayout) viewGroup.getChildAt(1);
        qweVar.f156689k = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qweVar.f156690l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181391b(qwe qweVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79520r, viewGroup, false);
        m181390a(qweVar, viewInflate);
        return viewInflate;
    }
}

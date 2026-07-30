package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.profile.myroomnew.view.MultipleAvatarView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pw10 {
    /* JADX INFO: renamed from: a */
    public static void m171701a(ow10 ow10Var, View view) {
        ow10Var.f145901a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ow10Var.f145902b = (VText) viewGroup.getChildAt(0);
        ow10Var.f145903c = (ConstraintLayout) viewGroup.getChildAt(1);
        ow10Var.f145904d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ow10Var.f145905e = (MultipleAvatarView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ow10Var.f145906f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ow10Var.f145907g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ow10Var.f145908h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        ow10Var.f145909i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        ow10Var.f145910j = (ConstraintLayout) viewGroup.getChildAt(2);
        ow10Var.f145911k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ow10Var.f145912l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ow10Var.f145913m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ow10Var.f145914n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        ow10Var.f145915o = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        ow10Var.f145916p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m171702b(ow10 ow10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162805w0, viewGroup, false);
        m171701a(ow10Var, viewInflate);
        return viewInflate;
    }
}

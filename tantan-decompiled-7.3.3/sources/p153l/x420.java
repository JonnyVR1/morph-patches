package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.profile.myroomnew.view.MultipleAvatarView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class x420 {
    /* JADX INFO: renamed from: a */
    public static void m209297a(w420 w420Var, View view) {
        w420Var.f187201a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w420Var.f187202b = (VText) viewGroup.getChildAt(0);
        w420Var.f187203c = (ConstraintLayout) viewGroup.getChildAt(1);
        w420Var.f187204d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        w420Var.f187205e = (MultipleAvatarView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        w420Var.f187206f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        w420Var.f187207g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        w420Var.f187208h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        w420Var.f187209i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        w420Var.f187210j = (ConstraintLayout) viewGroup.getChildAt(2);
        w420Var.f187211k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        w420Var.f187212l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        w420Var.f187213m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        w420Var.f187214n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        w420Var.f187215o = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        w420Var.f187216p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m209298b(w420 w420Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193919w0, viewGroup, false);
        m209297a(w420Var, viewInflate);
        return viewInflate;
    }
}

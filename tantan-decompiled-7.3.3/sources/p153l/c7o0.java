package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class c7o0 {
    /* JADX INFO: renamed from: a */
    public static void m108310a(b7o0 b7o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b7o0Var.f75315a = viewGroup.getChildAt(0);
        b7o0Var.f75316b = (ConstraintLayout) viewGroup.getChildAt(1);
        b7o0Var.f75317c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        b7o0Var.f75318d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        b7o0Var.f75319e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        b7o0Var.f75320f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        b7o0Var.f75321g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        b7o0Var.f75322h = (SvgAndImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        b7o0Var.f75323i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        b7o0Var.f75324j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m108311b(b7o0 b7o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198737D9, viewGroup, false);
        m108310a(b7o0Var, viewInflate);
        return viewInflate;
    }
}

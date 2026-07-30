package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yxn0 {
    /* JADX INFO: renamed from: a */
    public static void m216466a(xxn0 xxn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xxn0Var.f194886a = viewGroup.getChildAt(0);
        xxn0Var.f194887b = (ConstraintLayout) viewGroup.getChildAt(1);
        xxn0Var.f194888c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xxn0Var.f194889d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        xxn0Var.f194890e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        xxn0Var.f194891f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        xxn0Var.f194892g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        xxn0Var.f194893h = (SvgAndImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        xxn0Var.f194894i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        xxn0Var.f194895j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m216467b(xxn0 xxn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168005D9, viewGroup, false);
        m216466a(xxn0Var, viewInflate);
        return viewInflate;
    }
}

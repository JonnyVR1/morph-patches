package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkMatchProfileBlackView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iu70 {
    /* JADX INFO: renamed from: a */
    public static void m138352a(hu70 hu70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hu70Var.f109529i = viewGroup.getChildAt(0);
        hu70Var.f109530j = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hu70Var.f109531k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hu70Var.f109532l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hu70Var.f109533m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        hu70Var.f109534n = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        hu70Var.f109535o = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        hu70Var.f109536p = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        hu70Var.f109537q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        hu70Var.f109538r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        hu70Var.f109539s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        hu70Var.f109540t = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        hu70Var.f109541u = (PkMatchProfileBlackView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        hu70Var.f109542v = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        hu70Var.f109543w = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        hu70Var.f109544x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        hu70Var.f109545y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(1);
        hu70Var.f109546z = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        hu70Var.f109520A = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        hu70Var.f109521B = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m138353b(hu70 hu70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168303c5, viewGroup, false);
        m138352a(hu70Var, viewInflate);
        return viewInflate;
    }
}

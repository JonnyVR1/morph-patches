package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class x5o0 {
    /* JADX INFO: renamed from: a */
    public static void m207096a(w5o0 w5o0Var, View view) {
        w5o0Var.f184716a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w5o0Var.f184717b = (Group) viewGroup.getChildAt(0);
        w5o0Var.f184718c = (ImageView) viewGroup.getChildAt(1);
        w5o0Var.f184719d = (TextView) viewGroup.getChildAt(2);
        w5o0Var.f184720e = (AnimEffectPlayer) viewGroup.getChildAt(3);
        w5o0Var.f184721f = (VDraweeView) viewGroup.getChildAt(4);
        w5o0Var.f184722g = (Button) viewGroup.getChildAt(5);
        w5o0Var.f184723h = (Group) viewGroup.getChildAt(6);
        w5o0Var.f184724i = (TextView) viewGroup.getChildAt(7);
        w5o0Var.f184725j = (TextView) viewGroup.getChildAt(8);
        w5o0Var.f184726k = (LinearLayout) viewGroup.getChildAt(9);
        w5o0Var.f184727l = (Button) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m207097b(w5o0 w5o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168123N7, viewGroup, false);
        m207096a(w5o0Var, viewInflate);
        return viewInflate;
    }
}

package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class bfo0 {
    /* JADX INFO: renamed from: a */
    public static void m103933a(afo0 afo0Var, View view) {
        afo0Var.f71028a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        afo0Var.f71029b = (Group) viewGroup.getChildAt(0);
        afo0Var.f71030c = (ImageView) viewGroup.getChildAt(1);
        afo0Var.f71031d = (TextView) viewGroup.getChildAt(2);
        afo0Var.f71032e = (AnimEffectPlayer) viewGroup.getChildAt(3);
        afo0Var.f71033f = (VDraweeView) viewGroup.getChildAt(4);
        afo0Var.f71034g = (Button) viewGroup.getChildAt(5);
        afo0Var.f71035h = (Group) viewGroup.getChildAt(6);
        afo0Var.f71036i = (TextView) viewGroup.getChildAt(7);
        afo0Var.f71037j = (TextView) viewGroup.getChildAt(8);
        afo0Var.f71038k = (LinearLayout) viewGroup.getChildAt(9);
        afo0Var.f71039l = (Button) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m103934b(afo0 afo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198855N7, viewGroup, false);
        m103933a(afo0Var, viewInflate);
        return viewInflate;
    }
}

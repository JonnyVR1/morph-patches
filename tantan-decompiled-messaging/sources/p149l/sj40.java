package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import p147v.AutoVDraweeView;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sj40 {
    /* JADX INFO: renamed from: a */
    public static void m184417a(rj40 rj40Var, View view) {
        rj40Var.f159630a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rj40Var.f159631b = (AutoVDraweeView) viewGroup.getChildAt(0);
        rj40Var.f159632c = (AutoVDraweeView) viewGroup.getChildAt(1);
        rj40Var.f159633d = (ImageView) viewGroup.getChildAt(2);
        rj40Var.f159634e = (TextView) viewGroup.getChildAt(3);
        rj40Var.f159635f = (VText) viewGroup.getChildAt(4);
        rj40Var.f159636g = viewGroup.getChildAt(5);
        rj40Var.f159637h = (VPager) viewGroup.getChildAt(6);
        rj40Var.f159638i = (NewPictureContainerIndicator) viewGroup.getChildAt(7);
        rj40Var.f159639j = (CardBottomBaseInfoView) viewGroup.getChildAt(9);
        rj40Var.f159640k = (CardUserContentView) viewGroup.getChildAt(10);
        rj40Var.f159641l = (VText) viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m184418b(rj40 rj40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95827i8, viewGroup, false);
        m184417a(rj40Var, viewInflate);
        return viewInflate;
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v93 {
    /* JADX INFO: renamed from: a */
    public static void m197525a(BoostStartView boostStartView, View view) {
        boostStartView.f50795f = (BoostStartView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boostStartView.f50796g = (VImage) viewGroup.getChildAt(0);
        boostStartView.f50797h = (VImage) viewGroup.getChildAt(1);
        boostStartView.f50798i = (VImage) viewGroup.getChildAt(2);
        boostStartView.f50799j = (VImage) viewGroup.getChildAt(3);
        boostStartView.f50800k = (VText) viewGroup.getChildAt(5);
        boostStartView.f50801l = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m197526b(BoostStartView boostStartView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168518t, viewGroup, false);
        m197525a(boostStartView, viewInflate);
        return viewInflate;
    }
}

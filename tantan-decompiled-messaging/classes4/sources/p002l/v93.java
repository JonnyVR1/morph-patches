package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v93 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m23802a(BoostStartView boostStartView, View view) {
        boostStartView.f6837f = (BoostStartView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boostStartView.f6838g = viewGroup.getChildAt(0);
        boostStartView.f6839h = viewGroup.getChildAt(1);
        boostStartView.f6840i = viewGroup.getChildAt(2);
        boostStartView.f6841j = viewGroup.getChildAt(3);
        boostStartView.f6842k = viewGroup.getChildAt(5);
        boostStartView.f6843l = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m23803b(BoostStartView boostStartView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20014t, viewGroup, false);
        m23802a(boostStartView, viewInflate);
        return viewInflate;
    }
}

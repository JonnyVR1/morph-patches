package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import l.t100;
import l.uep0;
import l.xdl0;
import p002l.h4t;
import p002l.qas;
import p002l.t6c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubLevelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f5130a;

    /* JADX INFO: renamed from: b */
    public VImage f5131b;

    /* JADX INFO: renamed from: c */
    public VText f5132c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f5133d;

    /* JADX INFO: renamed from: e */
    public VImage f5134e;

    /* JADX INFO: renamed from: f */
    public VText f5135f;

    /* JADX INFO: renamed from: g */
    public VText f5136g;

    /* JADX INFO: renamed from: h */
    public VText f5137h;

    public LiveFansClubLevelView(Context context) {
        super(context);
        m6434e(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m6433d(View view) {
        qas.m21150a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m6434e(Context context) {
        LayoutInflater.from(context).inflate(t6c0.f19953o3, (ViewGroup) this, true);
        m6433d(getChildAt(0));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6435f(float f) {
        VImage vImage = this.f5134e;
        uep0.l(vImage, 0, 0, (int) (vImage.getWidth() * f), 0, t100.g);
    }

    /* JADX INFO: renamed from: g */
    public void m6436g(final h4t h4tVar, BLiveFanBaseHierarchy bLiveFanBaseHierarchy) {
        xdl0.E0(this.f5131b, new View.OnClickListener() { // from class: l.nas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edg.m12321e(h4tVar, true);
            }
        });
        xdl0.E0(this.f5132c, new View.OnClickListener() { // from class: l.oas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edg.m12321e(h4tVar, true);
            }
        });
        String string = getContext().getString(R$string.f2844L3);
        this.f5135f.setText(String.format(string, String.valueOf(bLiveFanBaseHierarchy.grade)));
        long j = bLiveFanBaseHierarchy.grade;
        long j2 = bLiveFanBaseHierarchy.maxGrade;
        VText vText = this.f5136g;
        if (j < j2) {
            vText.setText(String.format(string, String.valueOf(j + 1)));
        } else {
            vText.setText(String.format(string, "Max"));
            this.f5135f.setText(String.format(string, String.valueOf(bLiveFanBaseHierarchy.grade - 1)));
        }
        this.f5137h.setText(String.format(getContext().getString(R$string.f2800J3), Long.valueOf(bLiveFanBaseHierarchy.current), Long.valueOf(bLiveFanBaseHierarchy.max)));
        float f = 1.0f - ((bLiveFanBaseHierarchy.current * 1.0f) / bLiveFanBaseHierarchy.max);
        final float f2 = f <= 1.0f ? f : 1.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f5134e.post(new Runnable() { // from class: l.pas
            @Override // java.lang.Runnable
            public final void run() {
                this.f17175a.m6435f(f2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m6437h(h4t h4tVar, BLiveFanBaseMedal bLiveFanBaseMedal) {
        BLiveFanBaseHierarchy bLiveFanBaseHierarchyNew_ = BLiveFanBaseHierarchy.new_();
        bLiveFanBaseHierarchyNew_.fanbaseId = bLiveFanBaseMedal.id;
        bLiveFanBaseHierarchyNew_.max = 50L;
        bLiveFanBaseHierarchyNew_.min = 0L;
        bLiveFanBaseHierarchyNew_.grade = bLiveFanBaseMedal.grade;
        bLiveFanBaseHierarchyNew_.maxGrade = 20L;
        bLiveFanBaseHierarchyNew_.userId = bLiveFanBaseMedal.userId;
        bLiveFanBaseHierarchyNew_.current = 0L;
        m6436g(h4tVar, bLiveFanBaseHierarchyNew_);
    }

    /* JADX INFO: renamed from: i */
    public void m6438i(boolean z) {
        xdl0.M0(this.f5135f, !z);
        xdl0.M0(this.f5136g, !z);
        xdl0.M0(this.f5137h, !z);
        xdl0.M0(this.f5134e, !z);
    }

    public LiveFansClubLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6434e(context);
    }

    public LiveFansClubLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6434e(context);
    }
}

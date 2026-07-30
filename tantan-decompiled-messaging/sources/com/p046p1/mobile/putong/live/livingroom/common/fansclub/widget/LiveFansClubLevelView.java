package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.h4t;
import p149l.qas;
import p149l.t100;
import p149l.t6c0;
import p149l.uep0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubLevelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f49088a;

    /* JADX INFO: renamed from: b */
    public VImage f49089b;

    /* JADX INFO: renamed from: c */
    public VText f49090c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f49091d;

    /* JADX INFO: renamed from: e */
    public VImage f49092e;

    /* JADX INFO: renamed from: f */
    public VText f49093f;

    /* JADX INFO: renamed from: g */
    public VText f49094g;

    /* JADX INFO: renamed from: h */
    public VText f49095h;

    public LiveFansClubLevelView(Context context) {
        super(context);
        m72915e(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m72914d(View view) {
        qas.m173774a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m72915e(Context context) {
        LayoutInflater.from(context).inflate(t6c0.f168457o3, (ViewGroup) this, true);
        m72914d(getChildAt(0));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m72916f(float f) {
        VImage vImage = this.f49092e;
        uep0.m193325l(vImage, 0, 0, (int) (vImage.getWidth() * f), 0, t100.f167258g);
    }

    /* JADX INFO: renamed from: g */
    public void m72917g(final h4t h4tVar, BLiveFanBaseHierarchy bLiveFanBaseHierarchy) {
        xdl0.m208329E0(this.f49089b, new View.OnClickListener() { // from class: l.nas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edg.m115800e(h4tVar, true);
            }
        });
        xdl0.m208329E0(this.f49090c, new View.OnClickListener() { // from class: l.oas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edg.m115800e(h4tVar, true);
            }
        });
        String string = getContext().getString(R$string.f46802L3);
        this.f49093f.setText(String.format(string, String.valueOf(bLiveFanBaseHierarchy.grade)));
        long j = bLiveFanBaseHierarchy.grade;
        long j2 = bLiveFanBaseHierarchy.maxGrade;
        VText vText = this.f49094g;
        if (j < j2) {
            vText.setText(String.format(string, String.valueOf(j + 1)));
        } else {
            vText.setText(String.format(string, "Max"));
            this.f49093f.setText(String.format(string, String.valueOf(bLiveFanBaseHierarchy.grade - 1)));
        }
        this.f49095h.setText(String.format(getContext().getString(R$string.f46758J3), Long.valueOf(bLiveFanBaseHierarchy.current), Long.valueOf(bLiveFanBaseHierarchy.max)));
        float f = 1.0f - ((bLiveFanBaseHierarchy.current * 1.0f) / bLiveFanBaseHierarchy.max);
        final float f2 = f <= 1.0f ? f : 1.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f49092e.post(new Runnable() { // from class: l.pas
            @Override // java.lang.Runnable
            public final void run() {
                this.f148005a.m72916f(f2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m72918h(h4t h4tVar, BLiveFanBaseMedal bLiveFanBaseMedal) {
        BLiveFanBaseHierarchy bLiveFanBaseHierarchyNew_ = BLiveFanBaseHierarchy.new_();
        bLiveFanBaseHierarchyNew_.fanbaseId = bLiveFanBaseMedal.f44365id;
        bLiveFanBaseHierarchyNew_.max = 50L;
        bLiveFanBaseHierarchyNew_.min = 0L;
        bLiveFanBaseHierarchyNew_.grade = bLiveFanBaseMedal.grade;
        bLiveFanBaseHierarchyNew_.maxGrade = 20L;
        bLiveFanBaseHierarchyNew_.userId = bLiveFanBaseMedal.userId;
        bLiveFanBaseHierarchyNew_.current = 0L;
        m72917g(h4tVar, bLiveFanBaseHierarchyNew_);
    }

    /* JADX INFO: renamed from: i */
    public void m72919i(boolean z) {
        xdl0.m208345M0(this.f49093f, !z);
        xdl0.m208345M0(this.f49094g, !z);
        xdl0.m208345M0(this.f49095h, !z);
        xdl0.m208345M0(this.f49092e, !z);
    }

    public LiveFansClubLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m72915e(context);
    }

    public LiveFansClubLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72915e(context);
    }
}

package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.i6t;
import p153l.qa00;
import p153l.rcs;
import p153l.yec0;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubLevelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f49936a;

    /* JADX INFO: renamed from: b */
    public VImage f49937b;

    /* JADX INFO: renamed from: c */
    public VText f49938c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f49939d;

    /* JADX INFO: renamed from: e */
    public VImage f49940e;

    /* JADX INFO: renamed from: f */
    public VText f49941f;

    /* JADX INFO: renamed from: g */
    public VText f49942g;

    /* JADX INFO: renamed from: h */
    public VText f49943h;

    public LiveFansClubLevelView(Context context) {
        super(context);
        m74098e(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m74097d(View view) {
        rcs.m180819a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m74098e(Context context) {
        LayoutInflater.from(context).inflate(yec0.f199189o3, (ViewGroup) this, true);
        m74097d(getChildAt(0));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74099f(float f) {
        VImage vImage = this.f49940e;
        ynp0.m216935l(vImage, 0, 0, (int) (vImage.getWidth() * f), 0, qa00.f156320g);
    }

    /* JADX INFO: renamed from: g */
    public void m74100g(final i6t i6tVar, BLiveFanBaseHierarchy bLiveFanBaseHierarchy) {
        bnl0.m105509E0(this.f49937b, new View.OnClickListener() { // from class: l.ocs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                seg.m185537e(i6tVar, true);
            }
        });
        bnl0.m105509E0(this.f49938c, new View.OnClickListener() { // from class: l.pcs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                seg.m185537e(i6tVar, true);
            }
        });
        String string = getContext().getString(R$string.f47650L3);
        this.f49941f.setText(String.format(string, String.valueOf(bLiveFanBaseHierarchy.grade)));
        long j = bLiveFanBaseHierarchy.grade;
        long j2 = bLiveFanBaseHierarchy.maxGrade;
        VText vText = this.f49942g;
        if (j < j2) {
            vText.setText(String.format(string, String.valueOf(j + 1)));
        } else {
            vText.setText(String.format(string, "Max"));
            this.f49941f.setText(String.format(string, String.valueOf(bLiveFanBaseHierarchy.grade - 1)));
        }
        this.f49943h.setText(String.format(getContext().getString(R$string.f47606J3), Long.valueOf(bLiveFanBaseHierarchy.current), Long.valueOf(bLiveFanBaseHierarchy.max)));
        float f = 1.0f - ((bLiveFanBaseHierarchy.current * 1.0f) / bLiveFanBaseHierarchy.max);
        final float f2 = f <= 1.0f ? f : 1.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f49940e.post(new Runnable() { // from class: l.qcs
            @Override // java.lang.Runnable
            public final void run() {
                this.f156619a.m74099f(f2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m74101h(i6t i6tVar, BLiveFanBaseMedal bLiveFanBaseMedal) {
        BLiveFanBaseHierarchy bLiveFanBaseHierarchyNew_ = BLiveFanBaseHierarchy.new_();
        bLiveFanBaseHierarchyNew_.fanbaseId = bLiveFanBaseMedal.f45213id;
        bLiveFanBaseHierarchyNew_.max = 50L;
        bLiveFanBaseHierarchyNew_.min = 0L;
        bLiveFanBaseHierarchyNew_.grade = bLiveFanBaseMedal.grade;
        bLiveFanBaseHierarchyNew_.maxGrade = 20L;
        bLiveFanBaseHierarchyNew_.userId = bLiveFanBaseMedal.userId;
        bLiveFanBaseHierarchyNew_.current = 0L;
        m74100g(i6tVar, bLiveFanBaseHierarchyNew_);
    }

    /* JADX INFO: renamed from: i */
    public void m74102i(boolean z) {
        bnl0.m105525M0(this.f49941f, !z);
        bnl0.m105525M0(this.f49942g, !z);
        bnl0.m105525M0(this.f49943h, !z);
        bnl0.m105525M0(this.f49940e, !z);
    }

    public LiveFansClubLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m74098e(context);
    }

    public LiveFansClubLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m74098e(context);
    }
}

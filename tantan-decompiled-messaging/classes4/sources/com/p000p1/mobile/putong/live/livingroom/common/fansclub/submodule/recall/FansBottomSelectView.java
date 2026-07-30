package com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import l.lsi0;
import l.xdl0;
import p002l.agg;
import p002l.mag;
import p002l.t4g;
import p002l.wgg;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansBottomSelectView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f5044c;

    /* JADX INFO: renamed from: d */
    public VText f5045d;

    /* JADX INFO: renamed from: e */
    public VText f5046e;

    /* JADX INFO: renamed from: f */
    public VText f5047f;

    public FansBottomSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m6364R(agg aggVar, mag magVar, View view) {
        if (aggVar == null || magVar == null) {
            return;
        }
        if (TextUtils.isEmpty(aggVar.m9629h0()) || TextUtils.equals(aggVar.m9629h0(), "[]")) {
            lsi0.w(R$string.f3599u4);
        } else {
            magVar.m25548F2().FansRecallEvent.showEditDialog().j(new wgg(true, aggVar.m9629h0()));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m6366T(View view) {
        t4g.m22791a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m6367V(agg aggVar, View view) {
        VImage vImage = this.f5044c;
        vImage.setSelected(!vImage.isSelected());
        aggVar.m9628g0(this.f5044c.isSelected());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m6368W(agg aggVar, View view) {
        VImage vImage = this.f5044c;
        vImage.setSelected(!vImage.isSelected());
        aggVar.m9628g0(this.f5044c.isSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public void m6369X(final agg aggVar, final mag magVar) {
        setVisibility(0);
        this.f5044c.setSelected(true);
        aggVar.m9630i0(this.f5044c);
        xdl0.E0(this.f5044c, new View.OnClickListener() { // from class: l.p4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17002a.m6367V(aggVar, view);
            }
        });
        xdl0.E0(this.f5045d, new View.OnClickListener() { // from class: l.q4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17808a.m6368W(aggVar, view);
            }
        });
        xdl0.E0(this.f5047f, new View.OnClickListener() { // from class: l.r4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                magVar.m25548F2().FansRecallEvent.hideFansRecallSelectPanel().j(Boolean.TRUE);
            }
        });
        xdl0.E0(this.f5046e, new View.OnClickListener() { // from class: l.s4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansBottomSelectView.m6364R(aggVar, magVar, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6366T(this);
    }

    public FansBottomSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansBottomSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

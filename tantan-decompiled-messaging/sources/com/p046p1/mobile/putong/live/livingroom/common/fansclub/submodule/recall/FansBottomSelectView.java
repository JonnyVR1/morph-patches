package com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.agg;
import p149l.lsi0;
import p149l.mag;
import p149l.t4g;
import p149l.wgg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class FansBottomSelectView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f49002c;

    /* JADX INFO: renamed from: d */
    public VText f49003d;

    /* JADX INFO: renamed from: e */
    public VText f49004e;

    /* JADX INFO: renamed from: f */
    public VText f49005f;

    public FansBottomSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m72845R(agg aggVar, mag magVar, View view) {
        if (aggVar == null || magVar == null) {
            return;
        }
        if (TextUtils.isEmpty(aggVar.m96306h0()) || TextUtils.equals(aggVar.m96306h0(), WeJson.EMPTY_ARR)) {
            lsi0.m151593w(R$string.f47557u4);
        } else {
            magVar.m206028F2().FansRecallEvent.showEditDialog().mo172463j(new wgg(true, aggVar.m96306h0()));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m72847T(View view) {
        t4g.m187202a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m72848V(agg aggVar, View view) {
        VImage vImage = this.f49002c;
        vImage.setSelected(!vImage.isSelected());
        aggVar.m96305g0(this.f49002c.isSelected());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m72849W(agg aggVar, View view) {
        VImage vImage = this.f49002c;
        vImage.setSelected(!vImage.isSelected());
        aggVar.m96305g0(this.f49002c.isSelected());
    }

    /* JADX INFO: renamed from: X */
    public void m72850X(final agg aggVar, final mag magVar) {
        setVisibility(0);
        this.f49002c.setSelected(true);
        aggVar.m96307i0(this.f49002c);
        xdl0.m208329E0(this.f49002c, new View.OnClickListener() { // from class: l.p4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147169a.m72848V(aggVar, view);
            }
        });
        xdl0.m208329E0(this.f49003d, new View.OnClickListener() { // from class: l.q4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152624a.m72849W(aggVar, view);
            }
        });
        xdl0.m208329E0(this.f49005f, new View.OnClickListener() { // from class: l.r4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                magVar.m206028F2().FansRecallEvent.hideFansRecallSelectPanel().mo172463j(Boolean.TRUE);
            }
        });
        xdl0.m208329E0(this.f49004e, new View.OnClickListener() { // from class: l.s4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansBottomSelectView.m72845R(aggVar, magVar, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72847T(this);
    }

    public FansBottomSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansBottomSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

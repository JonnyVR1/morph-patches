package com.p000p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.t100;
import l.xdl0;
import l.yb2;
import p002l.bcg;
import p002l.mcg;
import p002l.xbg;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansClubSweetCompanyView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansClubSweetCompanyView f5076d;

    /* JADX INFO: renamed from: e */
    public VImage f5077e;

    /* JADX INFO: renamed from: f */
    public View f5078f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5079g;

    /* JADX INFO: renamed from: h */
    public View f5080h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f5081i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f5082j;

    /* JADX INFO: renamed from: k */
    public VImage f5083k;

    /* JADX INFO: renamed from: l */
    public TextView f5084l;

    /* JADX INFO: renamed from: m */
    public TextView f5085m;

    /* JADX INFO: renamed from: n */
    public TextView f5086n;

    /* JADX INFO: renamed from: o */
    public VImage f5087o;

    /* JADX INFO: renamed from: p */
    public TextView f5088p;

    public FansClubSweetCompanyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m6393k0(View view) {
        bcg.m10224a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m6394l0() {
        xdl0.M(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public void m6395m0(final mcg mcgVar, final xbg xbgVar) {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = mcgVar.f15336f;
        if (bLiveAccommpanyTaskSummary == null) {
            xdl0.M(this, false);
            return;
        }
        this.f5084l.setText(bLiveAccommpanyTaskSummary.title);
        this.f5085m.setText(bLiveAccommpanyTaskSummary.desc);
        if ("done".equals(bLiveAccommpanyTaskSummary.status)) {
            xdl0.M(this.f5088p, true);
            xdl0.M(this.f5087o, true);
            xdl0.M(this.f5086n, false);
        } else {
            xdl0.M(this.f5087o, false);
            xdl0.M(this.f5088p, false);
            xdl0.M(this.f5086n, true);
            this.f5086n.setBackground(yb2.a(-1, t100.d(12.0f), false));
        }
        xdl0.E0(this.f5086n, new View.OnClickListener() { // from class: l.ybg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbgVar.m17290e4(false, mcgVar);
            }
        });
        xdl0.E0(this.f5088p, new View.OnClickListener() { // from class: l.zbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbgVar.m17290e4(false, mcgVar);
            }
        });
        xdl0.E0(this.f5087o, new View.OnClickListener() { // from class: l.acg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbgVar.m17290e4(false, mcgVar);
            }
        });
        xdl0.M(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6393k0(this);
        this.f5076d.setBackground(yb2.e(new int[]{-22895, -26927}, GradientDrawable.Orientation.LEFT_RIGHT, t100.d(16.0f), false));
    }

    public FansClubSweetCompanyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubSweetCompanyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

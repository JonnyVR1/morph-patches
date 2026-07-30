package com.p046p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bcg;
import p149l.mcg;
import p149l.t100;
import p149l.xbg;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubSweetCompanyView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansClubSweetCompanyView f49034d;

    /* JADX INFO: renamed from: e */
    public VImage f49035e;

    /* JADX INFO: renamed from: f */
    public View f49036f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49037g;

    /* JADX INFO: renamed from: h */
    public View f49038h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49039i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f49040j;

    /* JADX INFO: renamed from: k */
    public VImage f49041k;

    /* JADX INFO: renamed from: l */
    public TextView f49042l;

    /* JADX INFO: renamed from: m */
    public TextView f49043m;

    /* JADX INFO: renamed from: n */
    public TextView f49044n;

    /* JADX INFO: renamed from: o */
    public VImage f49045o;

    /* JADX INFO: renamed from: p */
    public TextView f49046p;

    public FansClubSweetCompanyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m72874k0(View view) {
        bcg.m101060a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m72875l0() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: m0 */
    public void m72876m0(final mcg mcgVar, final xbg xbgVar) {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = mcgVar.f133108f;
        if (bLiveAccommpanyTaskSummary == null) {
            xdl0.m208344M(this, false);
            return;
        }
        this.f49042l.setText(bLiveAccommpanyTaskSummary.title);
        this.f49043m.setText(bLiveAccommpanyTaskSummary.desc);
        if ("done".equals(bLiveAccommpanyTaskSummary.status)) {
            xdl0.m208344M(this.f49046p, true);
            xdl0.m208344M(this.f49045o, true);
            xdl0.m208344M(this.f49044n, false);
        } else {
            xdl0.m208344M(this.f49045o, false);
            xdl0.m208344M(this.f49046p, false);
            xdl0.m208344M(this.f49044n, true);
            this.f49044n.setBackground(yb2.m213876a(-1, t100.m186890d(12.0f), false));
        }
        xdl0.m208329E0(this.f49044n, new View.OnClickListener() { // from class: l.ybg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbgVar.m150136e4(false, mcgVar);
            }
        });
        xdl0.m208329E0(this.f49046p, new View.OnClickListener() { // from class: l.zbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbgVar.m150136e4(false, mcgVar);
            }
        });
        xdl0.m208329E0(this.f49045o, new View.OnClickListener() { // from class: l.acg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbgVar.m150136e4(false, mcgVar);
            }
        });
        xdl0.m208344M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72874k0(this);
        this.f49034d.setBackground(yb2.m213880e(new int[]{-22895, -26927}, GradientDrawable.Orientation.LEFT_RIGHT, t100.m186890d(16.0f), false));
    }

    public FansClubSweetCompanyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubSweetCompanyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

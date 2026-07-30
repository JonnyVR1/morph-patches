package com.p051p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.aeg;
import p153l.bnl0;
import p153l.fc2;
import p153l.ldg;
import p153l.pdg;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubSweetCompanyView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansClubSweetCompanyView f49882d;

    /* JADX INFO: renamed from: e */
    public VImage f49883e;

    /* JADX INFO: renamed from: f */
    public View f49884f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49885g;

    /* JADX INFO: renamed from: h */
    public View f49886h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49887i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f49888j;

    /* JADX INFO: renamed from: k */
    public VImage f49889k;

    /* JADX INFO: renamed from: l */
    public TextView f49890l;

    /* JADX INFO: renamed from: m */
    public TextView f49891m;

    /* JADX INFO: renamed from: n */
    public TextView f49892n;

    /* JADX INFO: renamed from: o */
    public VImage f49893o;

    /* JADX INFO: renamed from: p */
    public TextView f49894p;

    public FansClubSweetCompanyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74057k0(View view) {
        pdg.m171811a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m74058l0() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: m0 */
    public void m74059m0(final aeg aegVar, final ldg ldgVar) {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = aegVar.f70796f;
        if (bLiveAccommpanyTaskSummary == null) {
            bnl0.m105524M(this, false);
            return;
        }
        this.f49890l.setText(bLiveAccommpanyTaskSummary.title);
        this.f49891m.setText(bLiveAccommpanyTaskSummary.desc);
        if ("done".equals(bLiveAccommpanyTaskSummary.status)) {
            bnl0.m105524M(this.f49894p, true);
            bnl0.m105524M(this.f49893o, true);
            bnl0.m105524M(this.f49892n, false);
        } else {
            bnl0.m105524M(this.f49893o, false);
            bnl0.m105524M(this.f49894p, false);
            bnl0.m105524M(this.f49892n, true);
            this.f49892n.setBackground(fc2.m124971a(-1, qa00.m175859d(12.0f), false));
        }
        bnl0.m105509E0(this.f49892n, new View.OnClickListener() { // from class: l.mdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ldgVar.m191484e4(false, aegVar);
            }
        });
        bnl0.m105509E0(this.f49894p, new View.OnClickListener() { // from class: l.ndg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ldgVar.m191484e4(false, aegVar);
            }
        });
        bnl0.m105509E0(this.f49893o, new View.OnClickListener() { // from class: l.odg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ldgVar.m191484e4(false, aegVar);
            }
        });
        bnl0.m105524M(this, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74057k0(this);
        this.f49882d.setBackground(fc2.m124975e(new int[]{-22895, -26927}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.m175859d(16.0f), false));
    }

    public FansClubSweetCompanyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubSweetCompanyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;
import p147v.VText;
import p149l.jrs;
import p149l.mpw;
import p149l.qrk;
import p149l.xdl0;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardLeadBoardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f50476d;

    /* JADX INFO: renamed from: e */
    public VImage f50477e;

    /* JADX INFO: renamed from: f */
    public VText f50478f;

    /* JADX INFO: renamed from: g */
    public VImage f50479g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f50480h;

    public LiveGuardLeadBoardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74670j0(View view) {
        jrs.m142972a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m74671k0(final zqs zqsVar, mpw mpwVar) {
        xdl0.m208329E0(this.f50477e, new View.OnClickListener() { // from class: l.hrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m219894z();
            }
        });
        xdl0.m208329E0(this.f50479g, new View.OnClickListener() { // from class: l.irs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m219886H();
            }
        });
        qrk qrkVar = new qrk(zqsVar);
        this.f50480h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f50480h.setAdapter(qrkVar);
        qrkVar.m176039H(mpwVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74670j0(this);
    }

    public LiveGuardLeadBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardLeadBoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

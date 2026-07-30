package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;
import p151v.VText;
import p153l.ats;
import p153l.bnl0;
import p153l.guk;
import p153l.kts;
import p153l.lsw;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardLeadBoardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f51324d;

    /* JADX INFO: renamed from: e */
    public VImage f51325e;

    /* JADX INFO: renamed from: f */
    public VText f51326f;

    /* JADX INFO: renamed from: g */
    public VImage f51327g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f51328h;

    public LiveGuardLeadBoardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75853j0(View view) {
        kts.m151398a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m75854k0(final ats atsVar, lsw lswVar) {
        bnl0.m105509E0(this.f51325e, new View.OnClickListener() { // from class: l.its
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atsVar.m100260z();
            }
        });
        bnl0.m105509E0(this.f51327g, new View.OnClickListener() { // from class: l.jts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atsVar.m100252H();
            }
        });
        guk gukVar = new guk(atsVar);
        this.f51328h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f51328h.setAdapter(gukVar);
        gukVar.m132321H(lswVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75853j0(this);
    }

    public LiveGuardLeadBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardLeadBoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

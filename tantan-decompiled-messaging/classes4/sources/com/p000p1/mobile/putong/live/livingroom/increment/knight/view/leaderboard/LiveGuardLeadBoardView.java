package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.xdl0;
import p002l.jrs;
import p002l.mpw;
import p002l.qrk;
import p002l.zqs;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardLeadBoardView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f6518d;

    /* JADX INFO: renamed from: e */
    public VImage f6519e;

    /* JADX INFO: renamed from: f */
    public VText f6520f;

    /* JADX INFO: renamed from: g */
    public VImage f6521g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f6522h;

    public LiveGuardLeadBoardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8264j0(View view) {
        jrs.m16187a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m8265k0(final zqs zqsVar, mpw mpwVar) {
        xdl0.E0(this.f6519e, new View.OnClickListener() { // from class: l.hrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m27522z();
            }
        });
        xdl0.E0(this.f6521g, new View.OnClickListener() { // from class: l.irs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m27514H();
            }
        });
        qrk qrkVar = new qrk(zqsVar);
        this.f6522h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f6522h.setAdapter(qrkVar);
        qrkVar.m21538H(mpwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8264j0(this);
    }

    public LiveGuardLeadBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardLeadBoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p046p1.mobile.putong.live.external.internal.live.square.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.df50;
import p149l.e51;
import p149l.h3c0;
import p149l.hnc0;
import p149l.pgi0;
import p149l.s9s;
import p149l.xdl0;
import p149l.xyt;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LiveSquareBaseListFrag extends LiveSquareBaseFrag implements df50 {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f44987A;

    /* JADX INFO: renamed from: B */
    public VText f44988B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f44989C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f44990D;

    /* JADX INFO: renamed from: E */
    public VImage f44991E;

    /* JADX INFO: renamed from: F */
    public VText f44992F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f44993G;

    /* JADX INFO: renamed from: H */
    public VImage f44994H;

    /* JADX INFO: renamed from: I */
    public VText f44995I;

    /* JADX INFO: renamed from: J */
    public VText f44996J;

    /* JADX INFO: renamed from: K */
    public boolean f44997K = false;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f44998z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m69036p5(View view) {
        mo57954w2(this.f44998z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m69037q5(AppBarLayout appBarLayout, int i) {
        this.f44998z.m223757I(i >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m69038r5(View view) {
        act().startActivity(LiveSearchAct.m70828Y1(act()));
        zvf0.m220396r("e_anchor_search", "p_audio_explore_recommend");
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f44996J.setOnClickListener(new View.OnClickListener() { // from class: l.tyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172628a.m69036p5(view);
            }
        });
        this.f44998z.mo223159O(this);
        this.f44987A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.uyt
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f178913a.m69037q5(appBarLayout, i);
            }
        });
        String strM195888m5 = s9s.f163228b.m195888m5();
        if (!TextUtils.isEmpty(strM195888m5)) {
            this.f44988B.setHint(strM195888m5);
        }
        xdl0.m208329E0(this.f44988B, new View.OnClickListener() { // from class: l.vyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183552a.m69038r5(view);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m69039o5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public View m69039o5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xyt.m211877b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m69040s5() {
        this.f44987A.setExpanded(false);
    }

    /* JADX INFO: renamed from: t5 */
    public void m69041t5(boolean z, boolean z2) {
        xdl0.m208345M0(this.f44989C, z);
        xdl0.m208345M0(this.f44990D, !z2);
        if (pgi0.m168730l().m168751x()) {
            this.f44992F.setText(s9s.f163227a.getString(R$string.f44933w));
            this.f44991E.setImageResource(h3c0.f105626N0);
        }
        this.f44993G.setVisibility(4);
    }

    /* JADX INFO: renamed from: u5 */
    public void m69042u5() {
        this.f44993G.setVisibility(0);
        this.f44989C.setVisibility(4);
        this.f44990D.setVisibility(4);
    }

    /* JADX INFO: renamed from: v5 */
    public void m69043v5() {
        this.f44998z.m223775t();
        if (this.f44997K || !isAdded() || isRemoving()) {
            return;
        }
        this.f44997K = true;
        e51.m114744I(this, new Runnable() { // from class: l.wyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f188673a.m69040s5();
            }
        }, 200L);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public abstract void mo57954w2(@NonNull hnc0 hnc0Var);
}

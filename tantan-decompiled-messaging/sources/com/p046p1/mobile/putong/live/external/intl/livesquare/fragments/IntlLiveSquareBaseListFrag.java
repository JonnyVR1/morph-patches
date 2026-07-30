package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments;

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
import p149l.j0o;
import p149l.pgi0;
import p149l.s9s;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IntlLiveSquareBaseListFrag extends LiveSquareBaseFrag implements df50 {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f45571A;

    /* JADX INFO: renamed from: B */
    public VText f45572B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f45573C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f45574D;

    /* JADX INFO: renamed from: E */
    public VImage f45575E;

    /* JADX INFO: renamed from: F */
    public VText f45576F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f45577G;

    /* JADX INFO: renamed from: H */
    public VImage f45578H;

    /* JADX INFO: renamed from: I */
    public VText f45579I;

    /* JADX INFO: renamed from: J */
    public VText f45580J;

    /* JADX INFO: renamed from: K */
    public boolean f45581K = false;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45582z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m70000p5(View view) {
        mo57954w2(this.f45582z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m70001q5(AppBarLayout appBarLayout, int i) {
        this.f45582z.m223757I(i >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m70002r5(View view) {
        act().startActivity(LiveSearchAct.m70828Y1(act()));
        zvf0.m220396r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public /* synthetic */ void m70003s5() {
        this.f45571A.setExpanded(false);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45580J.setOnClickListener(new View.OnClickListener() { // from class: l.f0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93993a.m70000p5(view);
            }
        });
        this.f45582z.mo223159O(this);
        this.f45571A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.g0o
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f100070a.m70001q5(appBarLayout, i);
            }
        });
        String strM195888m5 = s9s.f163228b.m195888m5();
        if (!TextUtils.isEmpty(strM195888m5)) {
            this.f45572B.setHint(strM195888m5);
        }
        xdl0.m208329E0(this.f45572B, new View.OnClickListener() { // from class: l.h0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105231a.m70002r5(view);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70004o5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public View m70004o5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j0o.m139198b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t5 */
    public void m70005t5(boolean z, boolean z2) {
        xdl0.m208345M0(this.f45573C, z);
        xdl0.m208345M0(this.f45574D, !z2);
        if (pgi0.m168730l().m168751x()) {
            this.f45576F.setText(s9s.f163227a.getString(R$string.f44933w));
            this.f45575E.setImageResource(h3c0.f105626N0);
        }
        this.f45577G.setVisibility(4);
    }

    /* JADX INFO: renamed from: u5 */
    public void m70006u5() {
        this.f45577G.setVisibility(0);
        this.f45573C.setVisibility(4);
        this.f45574D.setVisibility(4);
    }

    /* JADX INFO: renamed from: v5 */
    public void m70007v5() {
        this.f45582z.m223775t();
        if (this.f45581K || !isAdded() || isRemoving()) {
            return;
        }
        this.f45581K = true;
        e51.m114744I(this, new Runnable() { // from class: l.i0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f110367a.m70003s5();
            }
        }, 200L);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public abstract void mo57954w2(@NonNull hnc0 hnc0Var);
}

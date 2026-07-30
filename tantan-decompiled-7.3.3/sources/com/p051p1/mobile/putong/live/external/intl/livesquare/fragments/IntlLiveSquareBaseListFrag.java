package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.j2o;
import p153l.jn50;
import p153l.l51;
import p153l.mvc0;
import p153l.nbc0;
import p153l.ppi0;
import p153l.tbs;

/* JADX INFO: loaded from: classes9.dex */
public abstract class IntlLiveSquareBaseListFrag extends LiveSquareBaseFrag implements jn50 {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f46419A;

    /* JADX INFO: renamed from: B */
    public VText f46420B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f46421C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f46422D;

    /* JADX INFO: renamed from: E */
    public VImage f46423E;

    /* JADX INFO: renamed from: F */
    public VText f46424F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f46425G;

    /* JADX INFO: renamed from: H */
    public VImage f46426H;

    /* JADX INFO: renamed from: I */
    public VText f46427I;

    /* JADX INFO: renamed from: J */
    public VText f46428J;

    /* JADX INFO: renamed from: K */
    public boolean f46429K = false;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f46430z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m71183p5(View view) {
        mo59137w2(this.f46430z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m71184q5(AppBarLayout appBarLayout, int i) {
        this.f46430z.m225003I(i >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m71185r5(View view) {
        act().startActivity(LiveSearchAct.m72011Z1(act()));
        i4g0.m138520r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public /* synthetic */ void m71186s5() {
        this.f46419A.setExpanded(false);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46428J.setOnClickListener(new View.OnClickListener() { // from class: l.f2o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96893a.m71183p5(view);
            }
        });
        this.f46430z.mo224405O(this);
        this.f46419A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.g2o
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f101862a.m71184q5(appBarLayout, i);
            }
        });
        String strM203675m5 = tbs.f172989b.m203675m5();
        if (!TextUtils.isEmpty(strM203675m5)) {
            this.f46420B.setHint(strM203675m5);
        }
        bnl0.m105509E0(this.f46420B, new View.OnClickListener() { // from class: l.h2o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107574a.m71185r5(view);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m71187o5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public View m71187o5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j2o.m143239b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t5 */
    public void m71188t5(boolean z, boolean z2) {
        bnl0.m105525M0(this.f46421C, z);
        bnl0.m105525M0(this.f46422D, !z2);
        if (ppi0.m173207l().m173228x()) {
            this.f46424F.setText(tbs.f172988a.getString(R$string.f45781w));
            this.f46423E.setImageResource(nbc0.f141117N0);
        }
        this.f46425G.setVisibility(4);
    }

    /* JADX INFO: renamed from: u5 */
    public void m71189u5() {
        this.f46425G.setVisibility(0);
        this.f46421C.setVisibility(4);
        this.f46422D.setVisibility(4);
    }

    /* JADX INFO: renamed from: v5 */
    public void m71190v5() {
        this.f46430z.m225021t();
        if (this.f46429K || !isAdded() || isRemoving()) {
            return;
        }
        this.f46429K = true;
        l51.m152889I(this, new Runnable() { // from class: l.i2o
            @Override // java.lang.Runnable
            public final void run() {
                this.f112660a.m71186s5();
            }
        }, 200L);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public abstract void mo59137w2(@NonNull mvc0 mvc0Var);
}

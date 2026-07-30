package com.p051p1.mobile.putong.live.external.internal.live.square.fragments;

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
import p153l.jn50;
import p153l.l51;
import p153l.mvc0;
import p153l.nbc0;
import p153l.ppi0;
import p153l.tbs;
import p153l.y0u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LiveSquareBaseListFrag extends LiveSquareBaseFrag implements jn50 {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f45835A;

    /* JADX INFO: renamed from: B */
    public VText f45836B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f45837C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f45838D;

    /* JADX INFO: renamed from: E */
    public VImage f45839E;

    /* JADX INFO: renamed from: F */
    public VText f45840F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f45841G;

    /* JADX INFO: renamed from: H */
    public VImage f45842H;

    /* JADX INFO: renamed from: I */
    public VText f45843I;

    /* JADX INFO: renamed from: J */
    public VText f45844J;

    /* JADX INFO: renamed from: K */
    public boolean f45845K = false;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45846z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m70219p5(View view) {
        mo59137w2(this.f45846z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m70220q5(AppBarLayout appBarLayout, int i) {
        this.f45846z.m225003I(i >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public /* synthetic */ void m70221r5(View view) {
        act().startActivity(LiveSearchAct.m72011Z1(act()));
        i4g0.m138520r("e_anchor_search", "p_audio_explore_recommend");
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f45844J.setOnClickListener(new View.OnClickListener() { // from class: l.u0u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176937a.m70219p5(view);
            }
        });
        this.f45846z.mo224405O(this);
        this.f45835A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.v0u
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f181899a.m70220q5(appBarLayout, i);
            }
        });
        String strM203675m5 = tbs.f172989b.m203675m5();
        if (!TextUtils.isEmpty(strM203675m5)) {
            this.f45836B.setHint(strM203675m5);
        }
        bnl0.m105509E0(this.f45836B, new View.OnClickListener() { // from class: l.w0u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186721a.m70221r5(view);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70222o5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o5 */
    public View m70222o5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y0u.m213906b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m70223s5() {
        this.f45835A.setExpanded(false);
    }

    /* JADX INFO: renamed from: t5 */
    public void m70224t5(boolean z, boolean z2) {
        bnl0.m105525M0(this.f45837C, z);
        bnl0.m105525M0(this.f45838D, !z2);
        if (ppi0.m173207l().m173228x()) {
            this.f45840F.setText(tbs.f172988a.getString(R$string.f45781w));
            this.f45839E.setImageResource(nbc0.f141117N0);
        }
        this.f45841G.setVisibility(4);
    }

    /* JADX INFO: renamed from: u5 */
    public void m70225u5() {
        this.f45841G.setVisibility(0);
        this.f45837C.setVisibility(4);
        this.f45838D.setVisibility(4);
    }

    /* JADX INFO: renamed from: v5 */
    public void m70226v5() {
        this.f45846z.m225021t();
        if (this.f45845K || !isAdded() || isRemoving()) {
            return;
        }
        this.f45845K = true;
        l51.m152889I(this, new Runnable() { // from class: l.x0u
            @Override // java.lang.Runnable
            public final void run() {
                this.f191938a.m70223s5();
            }
        }, 200L);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public abstract void mo59137w2(@NonNull mvc0 mvc0Var);
}

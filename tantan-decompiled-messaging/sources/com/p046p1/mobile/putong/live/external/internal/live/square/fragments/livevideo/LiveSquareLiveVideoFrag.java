package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.b1u;
import p149l.df50;
import p149l.e51;
import p149l.h3c0;
import p149l.hnc0;
import p149l.l880;
import p149l.lsi0;
import p149l.me50;
import p149l.mss;
import p149l.pxm;
import p149l.s7m;
import p149l.ycp0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareLiveVideoFrag extends LiveSquareBaseFrag implements s7m<C12495a> {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f45001A;

    /* JADX INFO: renamed from: B */
    public VLinear f45002B;

    /* JADX INFO: renamed from: C */
    public VImage f45003C;

    /* JADX INFO: renamed from: D */
    public VText f45004D;

    /* JADX INFO: renamed from: E */
    public C12495a f45005E;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45006z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m69049q5(hnc0 hnc0Var) {
        this.f45005E.m69112T3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getActivity();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (z) {
            e51.m114743H(getContext(), new Runnable() { // from class: l.a1u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67201a.m69057s5();
                }
            }, 500L);
        } else {
            this.f45005E.m69111S3(false);
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        C12495a c12495a = new C12495a(this, new mss(m70813Z4(), this));
        c12495a.m220948S2(this.tabInfo);
        c12495a.mo51532C(this);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        super.mo68932Y4();
        C12495a c12495a = this.f45005E;
        if (c12495a != null) {
            c12495a.m69112T3();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo69050b5() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: c5 */
    public boolean mo69051c5() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: d5 */
    public boolean mo69052d5() {
        return true;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45006z.mo223159O(new df50() { // from class: l.y0u
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f195328a.m69049q5(hnc0Var);
            }
        });
        this.f45006z.m223755G(true);
        this.f45006z.mo223158M(new me50() { // from class: l.z0u
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                this.f201012a.m69056r5(hnc0Var);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m69053n5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n5 */
    public View m69053n5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b1u.m99875b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C12495a c12495a) {
        this.f45005E = c12495a;
        c12495a.mo69101I2();
    }

    /* JADX INFO: renamed from: p5 */
    public void m69055p5() {
        this.f45002B.setVisibility(8);
        this.f45001A.setVisibility(0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_featured";
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m69056r5(hnc0 hnc0Var) {
        lsi0.m151595y("我是有底线的");
        this.f45006z.m223770o();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m69057s5() {
        pxm.m171910c().m171911a(true);
        if (!ycp0.m214190d().m214197h()) {
            ycp0.m214190d().m214192a();
        }
        this.f45005E.m69111S3(true);
    }

    /* JADX INFO: renamed from: t5 */
    public void m69058t5(boolean z) {
        l880.m148846a().m148850e(true);
        this.f45002B.setVisibility(0);
        this.f45001A.setVisibility(8);
        this.f45004D.setText(z ? "当前网络不可用" : "暂时没有新的内容");
        this.f45003C.setImageResource(z ? h3c0.f105610F0 : h3c0.f105607E0);
    }
}

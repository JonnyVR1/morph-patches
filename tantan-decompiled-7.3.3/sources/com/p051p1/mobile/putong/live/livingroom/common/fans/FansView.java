package com.p051p1.mobile.putong.live.livingroom.common.fans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.Map;
import p153l.bnl0;
import p153l.c6g;
import p153l.dhg;
import p153l.fgt;
import p153l.hcr;
import p153l.iam;
import p153l.nhg;
import p153l.pzi0;
import p153l.tig;
import p153l.uhd0;
import p153l.y20;
import p153l.yau;

/* JADX INFO: loaded from: classes4.dex */
public class FansView extends RelativeLayout implements iam<nhg> {

    /* JADX INFO: renamed from: a */
    public LiveFadeRecyclerView f49830a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49831b;

    /* JADX INFO: renamed from: c */
    public TextView f49832c;

    /* JADX INFO: renamed from: d */
    public nhg f49833d;

    /* JADX INFO: renamed from: e */
    public c6g f49834e;

    public FansView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m73999e(View view) {
        m74000i(0);
    }

    /* JADX INFO: renamed from: i */
    private void m74000i(int i) {
        this.f49833d.m163090b4(i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m74001c(View view) {
        tig.m191330a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nhg nhgVar) {
        this.f49833d = nhgVar;
        if (nhgVar != null) {
            this.f49834e = new c6g(nhgVar);
            nhgVar.mo163089a4(this.f49830a);
            this.f49830a.setAdapter(this.f49834e);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m74003f() {
        c6g c6gVar = this.f49834e;
        if (c6gVar != null) {
            c6gVar.m108133j0();
        }
        this.f49832c.setText("0");
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m74004j(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: k */
    public void m74005k(double d) {
        this.f49832c.setText(yau.m214935c(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74001c(this);
        m74006r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m74006r() {
        this.f49830a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f49830a.m69909H();
        bnl0.m105509E0(this.f49832c, new View.OnClickListener() { // from class: l.rig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163361a.m73999e(view);
            }
        });
    }

    public void setFansData(dhg dhgVar) {
        c6g c6gVar = this.f49834e;
        if (c6gVar != null) {
            c6gVar.m108134k0(dhgVar);
        }
    }

    public void setFansDataByLeaderBoardData(hcr hcrVar) {
        c6g c6gVar = this.f49834e;
        if (c6gVar != null) {
            c6gVar.m108134k0(new dhg(hcrVar));
        }
        final long jM174454o = pzi0.m174454o() - uhd0.f179016l;
        fgt.m125531c(this.f49833d, "audience_leaderboard_loaded", new y20() { // from class: l.sig
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM174454o));
            }
        });
    }

    public FansView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

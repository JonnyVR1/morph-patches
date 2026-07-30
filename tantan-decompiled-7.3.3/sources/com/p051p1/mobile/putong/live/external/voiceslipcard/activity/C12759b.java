package com.p051p1.mobile.putong.live.external.voiceslipcard.activity;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p051p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.C12758a;
import com.p051p1.mobile.putong.live.external.voiceslipcard.activity.C12759b;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.d3q;
import p153l.e2v;
import p153l.evo0;
import p153l.iam;
import p153l.jyb;
import p153l.jyn0;
import p153l.l9c0;
import p153l.m1v;
import p153l.qa00;
import p153l.qcj;
import p153l.x1v;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.b */
/* JADX INFO: loaded from: classes9.dex */
public class C12759b implements iam<x1v> {

    /* JADX INFO: renamed from: a */
    public VFrame f47294a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f47295b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f47296c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshList f47297d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f47298e;

    /* JADX INFO: renamed from: f */
    public VRelative f47299f;

    /* JADX INFO: renamed from: g */
    public VImage f47300g;

    /* JADX INFO: renamed from: h */
    public VText f47301h;

    /* JADX INFO: renamed from: i */
    public VRelative f47302i;

    /* JADX INFO: renamed from: j */
    public VImage f47303j;

    /* JADX INFO: renamed from: k */
    public VText f47304k;

    /* JADX INFO: renamed from: l */
    public Act f47305l;

    /* JADX INFO: renamed from: m */
    public x1v f47306m;

    /* JADX INFO: renamed from: n */
    public LiveBaseAdapter f47307n = new LiveBaseAdapter();

    /* JADX INFO: renamed from: o */
    public boolean f47308o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.b$a */
    public class a implements LiveVoiceActivitiesItemView.InterfaceC12757a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f47309a;

        public a(int i) {
            this.f47309a = i;
        }

        @Override // com.p051p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView.InterfaceC12757a
        /* JADX INFO: renamed from: a */
        public void mo72176a(int i, BLiveMemberActivityData bLiveMemberActivityData) {
            C12759b.this.m72207z(i, bLiveMemberActivityData);
        }

        @Override // com.p051p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView.InterfaceC12757a
        /* JADX INFO: renamed from: b */
        public void mo72177b(BLiveMemberActivityData bLiveMemberActivityData) {
            boolean zIsEmpty = TextUtils.isEmpty(bLiveMemberActivityData.schema);
            C12759b c12759b = C12759b.this;
            if (!zIsEmpty) {
                c12759b.f47306m.m209113m0(bLiveMemberActivityData.schema);
            } else {
                c12759b.f47306m.m209112l0(bLiveMemberActivityData.voiceLiveId, bLiveMemberActivityData.userId);
                evo0.m122807e(bLiveMemberActivityData, true, this.f47309a);
            }
        }
    }

    public C12759b(Act act, boolean z) {
        this.f47305l = act;
        this.f47308o = z;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m72188e() {
    }

    /* JADX INFO: renamed from: p */
    private int m72191p(int i) {
        if (i != 0) {
            if (i == 1) {
                return R$string.f45062v1;
            }
            if (i != 2) {
                return i != 3 ? R$string.f45062v1 : R$string.f44942A1;
            }
        }
        return R$string.f45065w1;
    }

    /* JADX INFO: renamed from: q */
    private void m72192q() {
        VText vText = new VText(this.f47305l);
        vText.setText(R$string.f45068x1);
        vText.setTextSize(jyn0.m147610g(this.f47308o).mo108076j());
        vText.setTextColor(jyn0.m147610g(this.f47308o).getTitleColor());
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, qa00.f156316c, 0, 0);
        this.f47296c.setTitleView(vText);
        this.f47296c.setLeftIconAsBack(this.f47305l);
        this.f47296c.setBackgroundResource(l9c0.f130601n);
        VImage vImage = new VImage(this.f47305l);
        vImage.setImageResource(jyn0.m147610g(this.f47308o).mo108073g());
        this.f47296c.setLeftIconView(vImage);
        this.f47296c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.y1v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197137a.m72202s(view);
            }
        });
        if (this.f47308o || !jyn0.m147611h()) {
            return;
        }
        Act act = this.f47305l;
        act.setStatusBarColor(act.color(l9c0.f130590c));
        Act act2 = this.f47305l;
        act2.setNavigationBarColor(act2.color(l9c0.f130590c));
        m72194y(this.f47305l);
    }

    /* JADX INFO: renamed from: r */
    private void m72193r() {
        m72206x();
        m72192q();
        this.f47294a.setBackgroundColor(jyn0.m147610g(this.f47308o).mo108071e());
        this.f47303j.setImageResource(jyn0.m147610g(this.f47308o).mo108075i());
        this.f47304k.setTextColor(jyn0.m147610g(this.f47308o).mo108072f());
        this.f47300g.setImageResource(jyn0.m147605b(this.f47308o).mo187673c());
        this.f47301h.setTextColor(jyn0.m147605b(this.f47308o).mo187676f());
    }

    /* JADX INFO: renamed from: y */
    private void m72194y(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = bnl0.m105511F0();
            this.f47295b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m72195A() {
        this.f47297d.setRefreshing(false);
        bnl0.m105524M(this.f47298e, false);
        bnl0.m105524M(this.f47299f, true);
        bnl0.m105524M(this.f47302i, false);
    }

    /* JADX INFO: renamed from: B */
    public void m72196B() {
        this.f47297d.setRefreshing(true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f47305l;
    }

    @Override // p153l.iam
    public void destroy() {
        if (this.f47306m != null) {
            this.f47306m = null;
        }
        if (this.f47305l != null) {
            this.f47305l = null;
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM72197j = m72197j(layoutInflater, viewGroup);
        m72193r();
        return viewM72197j;
    }

    /* JADX INFO: renamed from: j */
    public View m72197j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e2v.m119190b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x1v x1vVar) {
        this.f47306m = x1vVar;
    }

    /* JADX INFO: renamed from: l */
    public final List<d3q<?>> m72199l(List<BLiveMemberActivityData> list) {
        ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < list.size(); i++) {
            final BLiveMemberActivityData bLiveMemberActivityData = list.get(i);
            C12758a c12758a = new C12758a(bLiveMemberActivityData, this.f47308o, new a(i));
            c12758a.m113891z(new Runnable() { // from class: l.a2v
                @Override // java.lang.Runnable
                public final void run() {
                    evo0.m122807e(bLiveMemberActivityData, false, i);
                }
            });
            arrayList.add(c12758a);
        }
        arrayList.add(new m1v(arrayList.size() < 30, this.f47308o));
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final void m72200m(String str) {
        C12758a c12758aM72201n = m72201n(str);
        if (c12758aM72201n != null) {
            c12758aM72201n.m72181K();
            this.f47307n.m68551W(c12758aM72201n);
        }
    }

    /* JADX INFO: renamed from: n */
    public final C12758a m72201n(final String str) {
        d3q d3qVar = (d3q) jyb.m147529r(this.f47307n.m68538J(), new qcj() { // from class: l.d2v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((C12758a) ((d3q) obj)).f47290a.userId, str));
            }
        });
        if (d3qVar != null) {
            return (C12758a) d3qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m72202s(View view) {
        this.f47305l.m48999H2();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m72203u() {
        this.f47306m.m209114n0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m72204v(int i, BLiveMemberActivityData bLiveMemberActivityData) {
        this.f47306m.m209115o0(i, bLiveMemberActivityData);
        m72200m(bLiveMemberActivityData.userId);
    }

    /* JADX INFO: renamed from: w */
    public void m72205w(List<BLiveMemberActivityData> list) {
        this.f47297d.setRefreshing(false);
        boolean zM147479J = jyb.m147479J(list);
        VRecyclerView vRecyclerView = this.f47298e;
        if (zM147479J) {
            bnl0.m105524M(vRecyclerView, false);
            bnl0.m105524M(this.f47299f, false);
            bnl0.m105524M(this.f47302i, true);
        } else {
            bnl0.m105524M(vRecyclerView, true);
            bnl0.m105524M(this.f47299f, false);
            bnl0.m105524M(this.f47302i, false);
            this.f47307n.m68555a0(m72199l(list), false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m72206x() {
        this.f47298e.setLayoutManager(new LinearLayoutManager(this.f47305l, 1, false));
        this.f47298e.setAdapter(this.f47307n);
        this.f47297d.setColorSchemeResources(l9c0.f130600m, l9c0.f130597j, l9c0.f130598k, l9c0.f130599l);
        this.f47297d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.z1v
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f202603a.m72203u();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m72207z(final int i, final BLiveMemberActivityData bLiveMemberActivityData) {
        act().dialog().m21499D(m72191p(i)).m21541l0(R$string.f44997a, new Runnable() { // from class: l.b2v
            @Override // java.lang.Runnable
            public final void run() {
                C12759b.m72188e();
            }
        }).m21555t0(R$string.f44991X, new Runnable() { // from class: l.c2v
            @Override // java.lang.Runnable
            public final void run() {
                this.f79523a.m72204v(i, bLiveMemberActivityData);
            }
        }).m21495B(true).m21567z0();
    }
}

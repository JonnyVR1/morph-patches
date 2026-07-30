package com.p046p1.mobile.putong.live.external.voiceslipcard.activity;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p046p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.C12595a;
import com.p046p1.mobile.putong.live.external.voiceslipcard.activity.C12596b;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.amo0;
import p149l.d0v;
import p149l.d1q;
import p149l.f1c0;
import p149l.fpn0;
import p149l.lzu;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.wzu;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.b */
/* JADX INFO: loaded from: classes13.dex */
public class C12596b implements s7m<wzu> {

    /* JADX INFO: renamed from: a */
    public VFrame f46446a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f46447b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f46448c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshList f46449d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f46450e;

    /* JADX INFO: renamed from: f */
    public VRelative f46451f;

    /* JADX INFO: renamed from: g */
    public VImage f46452g;

    /* JADX INFO: renamed from: h */
    public VText f46453h;

    /* JADX INFO: renamed from: i */
    public VRelative f46454i;

    /* JADX INFO: renamed from: j */
    public VImage f46455j;

    /* JADX INFO: renamed from: k */
    public VText f46456k;

    /* JADX INFO: renamed from: l */
    public Act f46457l;

    /* JADX INFO: renamed from: m */
    public wzu f46458m;

    /* JADX INFO: renamed from: n */
    public LiveBaseAdapter f46459n = new LiveBaseAdapter();

    /* JADX INFO: renamed from: o */
    public boolean f46460o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.b$a */
    public class a implements LiveVoiceActivitiesItemView.InterfaceC12594a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f46461a;

        public a(int i) {
            this.f46461a = i;
        }

        @Override // com.p046p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView.InterfaceC12594a
        /* JADX INFO: renamed from: a */
        public void mo70993a(int i, BLiveMemberActivityData bLiveMemberActivityData) {
            C12596b.this.m71024z(i, bLiveMemberActivityData);
        }

        @Override // com.p046p1.mobile.putong.live.external.voiceslipcard.activity.LiveVoiceActivitiesItemView.InterfaceC12594a
        /* JADX INFO: renamed from: b */
        public void mo70994b(BLiveMemberActivityData bLiveMemberActivityData) {
            boolean zIsEmpty = TextUtils.isEmpty(bLiveMemberActivityData.schema);
            C12596b c12596b = C12596b.this;
            if (!zIsEmpty) {
                c12596b.f46458m.m206312m0(bLiveMemberActivityData.schema);
            } else {
                c12596b.f46458m.m206311l0(bLiveMemberActivityData.voiceLiveId, bLiveMemberActivityData.userId);
                amo0.m97568e(bLiveMemberActivityData, true, this.f46461a);
            }
        }
    }

    public C12596b(Act act, boolean z) {
        this.f46457l = act;
        this.f46460o = z;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m71005e() {
    }

    /* JADX INFO: renamed from: p */
    private int m71008p(int i) {
        if (i != 0) {
            if (i == 1) {
                return R$string.f44214v1;
            }
            if (i != 2) {
                return i != 3 ? R$string.f44214v1 : R$string.f44094A1;
            }
        }
        return R$string.f44217w1;
    }

    /* JADX INFO: renamed from: q */
    private void m71009q() {
        VText vText = new VText(this.f46457l);
        vText.setText(R$string.f44220x1);
        vText.setTextSize(fpn0.m122617g(this.f46460o).mo117891j());
        vText.setTextColor(fpn0.m122617g(this.f46460o).getTitleColor());
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, t100.f167254c, 0, 0);
        this.f46448c.setTitleView(vText);
        this.f46448c.setLeftIconAsBack(this.f46457l);
        this.f46448c.setBackgroundResource(f1c0.f94077n);
        VImage vImage = new VImage(this.f46457l);
        vImage.setImageResource(fpn0.m122617g(this.f46460o).mo117888g());
        this.f46448c.setLeftIconView(vImage);
        this.f46448c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195228a.m71019s(view);
            }
        });
        if (this.f46460o || !fpn0.m122618h()) {
            return;
        }
        Act act = this.f46457l;
        act.setStatusBarColor(act.color(f1c0.f94066c));
        Act act2 = this.f46457l;
        act2.setNavigationBarColor(act2.color(f1c0.f94066c));
        m71011y(this.f46457l);
    }

    /* JADX INFO: renamed from: r */
    private void m71010r() {
        m71023x();
        m71009q();
        this.f46446a.setBackgroundColor(fpn0.m122617g(this.f46460o).mo117886e());
        this.f46455j.setImageResource(fpn0.m122617g(this.f46460o).mo117890i());
        this.f46456k.setTextColor(fpn0.m122617g(this.f46460o).mo117887f());
        this.f46452g.setImageResource(fpn0.m122612b(this.f46460o).mo108463c());
        this.f46453h.setTextColor(fpn0.m122612b(this.f46460o).mo108466f());
    }

    /* JADX INFO: renamed from: y */
    private void m71011y(Act act) {
        if (act instanceof PutongAct) {
            ((PutongAct) act).setTransparentStatusBar();
            int i = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = xdl0.m208331F0();
            this.f46447b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m71012A() {
        this.f46449d.setRefreshing(false);
        xdl0.m208344M(this.f46450e, false);
        xdl0.m208344M(this.f46451f, true);
        xdl0.m208344M(this.f46454i, false);
    }

    /* JADX INFO: renamed from: B */
    public void m71013B() {
        this.f46449d.setRefreshing(true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f46457l;
    }

    @Override // p149l.s7m
    public void destroy() {
        if (this.f46458m != null) {
            this.f46458m = null;
        }
        if (this.f46457l != null) {
            this.f46457l = null;
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM71014j = m71014j(layoutInflater, viewGroup);
        m71010r();
        return viewM71014j;
    }

    /* JADX INFO: renamed from: j */
    public View m71014j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d0v.m109555b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wzu wzuVar) {
        this.f46458m = wzuVar;
    }

    /* JADX INFO: renamed from: l */
    public final List<d1q<?>> m71016l(List<BLiveMemberActivityData> list) {
        ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < list.size(); i++) {
            final BLiveMemberActivityData bLiveMemberActivityData = list.get(i);
            C12595a c12595a = new C12595a(bLiveMemberActivityData, this.f46460o, new a(i));
            c12595a.m109673z(new Runnable() { // from class: l.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    amo0.m97568e(bLiveMemberActivityData, false, i);
                }
            });
            arrayList.add(c12595a);
        }
        arrayList.add(new lzu(arrayList.size() < 30, this.f46460o));
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final void m71017m(String str) {
        C12595a c12595aM71018n = m71018n(str);
        if (c12595aM71018n != null) {
            c12595aM71018n.m70998K();
            this.f46459n.m67368W(c12595aM71018n);
        }
    }

    /* JADX INFO: renamed from: n */
    public final C12595a m71018n(final String str) {
        d1q d1qVar = (d1q) vwb.m200346r(this.f46459n.m67355J(), new w9j() { // from class: l.c0v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((C12595a) ((d1q) obj)).f46442a.userId, str));
            }
        });
        if (d1qVar != null) {
            return (C12595a) d1qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m71019s(View view) {
        this.f46457l.m47815F2();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m71020u() {
        this.f46458m.m206313n0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m71021v(int i, BLiveMemberActivityData bLiveMemberActivityData) {
        this.f46458m.m206314o0(i, bLiveMemberActivityData);
        m71017m(bLiveMemberActivityData.userId);
    }

    /* JADX INFO: renamed from: w */
    public void m71022w(List<BLiveMemberActivityData> list) {
        this.f46449d.setRefreshing(false);
        boolean zM200296J = vwb.m200296J(list);
        VRecyclerView vRecyclerView = this.f46450e;
        if (zM200296J) {
            xdl0.m208344M(vRecyclerView, false);
            xdl0.m208344M(this.f46451f, false);
            xdl0.m208344M(this.f46454i, true);
        } else {
            xdl0.m208344M(vRecyclerView, true);
            xdl0.m208344M(this.f46451f, false);
            xdl0.m208344M(this.f46454i, false);
            this.f46459n.m67372a0(m71016l(list), false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m71023x() {
        this.f46450e.setLayoutManager(new LinearLayoutManager(this.f46457l, 1, false));
        this.f46450e.setAdapter(this.f46459n);
        this.f46449d.setColorSchemeResources(f1c0.f94076m, f1c0.f94073j, f1c0.f94074k, f1c0.f94075l);
        this.f46449d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.yzu
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f200911a.m71020u();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m71024z(final int i, final BLiveMemberActivityData bLiveMemberActivityData) {
        act().dialog().m20500D(m71008p(i)).m20542l0(R$string.f44149a, new Runnable() { // from class: l.a0v
            @Override // java.lang.Runnable
            public final void run() {
                C12596b.m71005e();
            }
        }).m20556t0(R$string.f44143X, new Runnable() { // from class: l.b0v
            @Override // java.lang.Runnable
            public final void run() {
                this.f72463a.m71021v(i, bLiveMemberActivityData);
            }
        }).m20496B(true).m20568z0();
    }
}

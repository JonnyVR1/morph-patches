package p007l;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.OMSConfigEnvelope;
import com.p000p1.mobile.putong.data.OMSConstraint;
import com.p000p1.mobile.putong.data.OMSCounterInfo;
import com.p000p1.mobile.putong.data.OMSData;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Frame;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.ic50;
import l.j760;
import l.mkd0;
import l.ngm;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ym2;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jug implements b0i<Frame> {

    /* JADX INFO: renamed from: a */
    public Act f9518a;

    /* JADX INFO: renamed from: b */
    public long f9519b;

    /* JADX INFO: renamed from: c */
    public boolean f9520c;

    /* JADX INFO: renamed from: d */
    public String f9521d;

    /* JADX INFO: renamed from: l.jug$a */
    public class C2407a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimEffectPlayer f9522a;

        public C2407a(AnimEffectPlayer animEffectPlayer) {
            this.f9522a = animEffectPlayer;
        }

        public void onFinished() {
            super.onFinished();
            this.f9522a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.jug$b */
    public class C2408b extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f9524a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f9525b;

        public C2408b(VDraweeView vDraweeView, View view) {
            this.f9524a = vDraweeView;
            this.f9525b = view;
        }

        /* JADX INFO: renamed from: h */
        public void m11346h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int iY0 = xdl0.y0() - t100.d(80.0f);
            int iMin = Math.min(t100.d(ngmVar.getHeight()), (int) ((iY0 * 452.0f) / 295.0f));
            int iMin2 = Math.min(iY0, t100.d(ngmVar.getWidth()));
            ViewGroup.LayoutParams layoutParams = this.f9524a.getLayoutParams();
            layoutParams.width = iMin2;
            layoutParams.height = iMin;
            this.f9524a.setLayoutParams(layoutParams);
            this.f9525b.setVisibility(0);
        }
    }

    public jug(Act act, String str) {
        this.f9518a = act;
        this.f9521d = str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11331c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11332d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m11333e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m11335g(OMSConfigEnvelope oMSConfigEnvelope) {
    }

    /* JADX INFO: renamed from: i */
    public final void m11337i(View view) {
        int iY0 = xdl0.y0() - t100.d(80.0f);
        xdl0.C0(view, (int) ((iY0 * 452.0f) / 295.0f));
        xdl0.D0(iY0, new View[]{view});
    }

    /* JADX INFO: renamed from: j */
    public View m11338j(final Frame frame) {
        final View viewInflate = LayoutInflater.from(this.f9518a).inflate(o6c0.f11200e0, (ViewGroup) null);
        AnimEffectPlayer animEffectPlayerFindViewById = viewInflate.findViewById(b5c0.f5988O1);
        View viewFindViewById = viewInflate.findViewById(b5c0.f6099w);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(b5c0.f6070m0);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.fug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jug.m11332d(view);
            }
        });
        viewFindViewById.setVisibility(4);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.gug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8517a.m11339k(viewInflate, frame, view);
            }
        });
        zvf0.A("e_moment_activity_popup", this.f9521d, new j760[]{vwb.Y("activity_id", frame.f683id)});
        if ("svg".equals(frame.content.resource.type)) {
            viewFindViewById.setVisibility(0);
            animEffectPlayerFindViewById.setVisibility(0);
            vDraweeViewFindViewById.setVisibility(8);
            m11337i(animEffectPlayerFindViewById);
            animEffectPlayerFindViewById.loadAnimWithListener(frame.content.resource.url, -1, new C2407a(animEffectPlayerFindViewById), true);
        } else {
            vDraweeViewFindViewById.setVisibility(0);
            animEffectPlayerFindViewById.setVisibility(8);
            qib0.G.M0(vDraweeViewFindViewById, frame.content.resource.url, new C2408b(vDraweeViewFindViewById, viewFindViewById));
        }
        animEffectPlayerFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.hug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8819a.m11340l(frame, viewInflate, view);
            }
        });
        vDraweeViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.iug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9135a.m11341m(frame, viewInflate, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m11339k(View view, Frame frame, View view2) {
        view.setVisibility(8);
        ((FrameLayout) this.f9518a.getWindow().getDecorView()).removeView(view);
        zvf0.u("e_moment_activity_popup_cancel", this.f9521d, new j760[]{vwb.Y("activity_id", frame.f683id)});
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11340l(Frame frame, View view, View view2) {
        m11343o(frame, view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11341m(Frame frame, View view, View view2) {
        m11343o(frame, view);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11342n(Envelope envelope) {
        List<Frame> list = ((FeedData) envelope.getModuleData(FeedData.class)).frames;
        String str = list.get(0).f683id;
        if (list.size() > 0 && !TextUtils.isEmpty(str)) {
            m11344p(list.get(0));
            m11345r(str);
        }
        this.f9519b = System.currentTimeMillis() + ((long) (list.get(0).intervalSec * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
    }

    /* JADX INFO: renamed from: o */
    public void m11343o(Frame frame, View view) {
        zvf0.u("e_moment_activity_popup", this.f9521d, new j760[]{vwb.Y("activity_id", frame.f683id)});
        view.setVisibility(8);
        ((FrameLayout) this.f9518a.getWindow().getDecorView()).removeView(view);
        String str = frame.content.deeplink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cxh.m9252b(this.f9518a, Uri.parse(str));
    }

    /* JADX INFO: renamed from: p */
    public final void m11344p(Frame frame) {
        if (this.f9520c) {
            return;
        }
        this.f9520c = true;
        ((FrameLayout) this.f9518a.getWindow().getDecorView()).addView(m11338j(frame));
    }

    @Override // p007l.b0i
    /* JADX INFO: renamed from: q */
    public void mo8626q() {
        long j = this.f9519b;
        if (j == 0 || j <= System.currentTimeMillis()) {
            FeedModule.f316d.m16633ed().subscribe(mkd0.H(new e30() { // from class: l.bug
                public final void call(Object obj) {
                    this.f6438a.m11342n((Envelope) obj);
                }
            }, new e30() { // from class: l.cug
                public final void call(Object obj) {
                    jug.m11331c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m11345r(String str) {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f245id = str;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = 1L;
        oMSConstraint.latestMs = System.currentTimeMillis();
        oMSCounterInfo.constraint = oMSConstraint;
        OMSData oMSData = new OMSData();
        ArrayList arrayList = new ArrayList();
        oMSData.counters = arrayList;
        arrayList.add(oMSCounterInfo);
        ic50.j().c().P(oMSData).subscribe(mkd0.H(new e30() { // from class: l.dug
            public final void call(Object obj) {
                jug.m11335g((OMSConfigEnvelope) obj);
            }
        }, new e30() { // from class: l.eug
            public final void call(Object obj) {
                jug.m11333e((Throwable) obj);
            }
        }));
    }
}

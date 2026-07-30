package p149l;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSConfigEnvelope;
import com.p046p1.mobile.putong.data.OMSConstraint;
import com.p046p1.mobile.putong.data.OMSCounterInfo;
import com.p046p1.mobile.putong.data.OMSData;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Frame;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class jug implements b0i<Frame> {

    /* JADX INFO: renamed from: a */
    public Act f119779a;

    /* JADX INFO: renamed from: b */
    public long f119780b;

    /* JADX INFO: renamed from: c */
    public boolean f119781c;

    /* JADX INFO: renamed from: d */
    public String f119782d;

    /* JADX INFO: renamed from: l.jug$a */
    public class C17865a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimEffectPlayer f119783a;

        public C17865a(AnimEffectPlayer animEffectPlayer) {
            this.f119783a = animEffectPlayer;
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
            this.f119783a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.jug$b */
    public class C17866b extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f119785a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f119786b;

        public C17866b(VDraweeView vDraweeView, View view) {
            this.f119785a = vDraweeView;
            this.f119786b = view;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int iM208412y0 = xdl0.m208412y0() - t100.m186890d(80.0f);
            int iMin = Math.min(t100.m186890d(ngmVar.getHeight()), (int) ((iM208412y0 * 452.0f) / 295.0f));
            int iMin2 = Math.min(iM208412y0, t100.m186890d(ngmVar.getWidth()));
            ViewGroup.LayoutParams layoutParams = this.f119785a.getLayoutParams();
            layoutParams.width = iMin2;
            layoutParams.height = iMin;
            this.f119785a.setLayoutParams(layoutParams);
            this.f119786b.setVisibility(0);
        }
    }

    public jug(Act act, String str) {
        this.f119779a = act;
        this.f119782d = str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m143291c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m143292d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m143293e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m143295g(OMSConfigEnvelope oMSConfigEnvelope) {
    }

    /* JADX INFO: renamed from: i */
    public final void m143297i(View view) {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(80.0f);
        xdl0.m208325C0(view, (int) ((iM208412y0 * 452.0f) / 295.0f));
        xdl0.m208327D0(iM208412y0, view);
    }

    /* JADX INFO: renamed from: j */
    public View m143298j(final Frame frame) {
        final View viewInflate = LayoutInflater.from(this.f119779a).inflate(o6c0.f142181e0, (ViewGroup) null);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewInflate.findViewById(b5c0.f73507O1);
        View viewFindViewById = viewInflate.findViewById(b5c0.f73618w);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(b5c0.f73589m0);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.fug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jug.m143292d(view);
            }
        });
        viewFindViewById.setVisibility(4);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.gug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104392a.m143299k(viewInflate, frame, view);
            }
        });
        zvf0.m220368A("e_moment_activity_popup", this.f119782d, vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, frame.f39222id));
        if ("svg".equals(frame.content.resource.type)) {
            viewFindViewById.setVisibility(0);
            animEffectPlayer.setVisibility(0);
            vDraweeView.setVisibility(8);
            m143297i(animEffectPlayer);
            animEffectPlayer.loadAnimWithListener(frame.content.resource.url, -1, new C17865a(animEffectPlayer), true);
        } else {
            vDraweeView.setVisibility(0);
            animEffectPlayer.setVisibility(8);
            qib0.f154691G.m102333M0(vDraweeView, frame.content.resource.url, new C17866b(vDraweeView, viewFindViewById));
        }
        animEffectPlayer.setOnClickListener(new View.OnClickListener() { // from class: l.hug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109563a.m143300l(frame, viewInflate, view);
            }
        });
        vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.iug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115013a.m143301m(frame, viewInflate, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m143299k(View view, Frame frame, View view2) {
        view.setVisibility(8);
        ((FrameLayout) this.f119779a.getWindow().getDecorView()).removeView(view);
        zvf0.m220399u("e_moment_activity_popup_cancel", this.f119782d, vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, frame.f39222id));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m143300l(Frame frame, View view, View view2) {
        m143303o(frame, view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m143301m(Frame frame, View view, View view2) {
        m143303o(frame, view);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m143302n(Envelope envelope) {
        List<Frame> list = ((FeedData) envelope.getModuleData(FeedData.class)).frames;
        String str = list.get(0).f39222id;
        if (list.size() > 0 && !TextUtils.isEmpty(str)) {
            m143304p(list.get(0));
            m143305r(str);
        }
        this.f119780b = System.currentTimeMillis() + ((long) (list.get(0).intervalSec * 1000));
    }

    /* JADX INFO: renamed from: o */
    public void m143303o(Frame frame, View view) {
        zvf0.m220399u("e_moment_activity_popup", this.f119782d, vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, frame.f39222id));
        view.setVisibility(8);
        ((FrameLayout) this.f119779a.getWindow().getDecorView()).removeView(view);
        String str = frame.content.deeplink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cxh.m109100b(this.f119779a, Uri.parse(str));
    }

    /* JADX INFO: renamed from: p */
    public final void m143304p(Frame frame) {
        if (this.f119781c) {
            return;
        }
        this.f119781c = true;
        ((FrameLayout) this.f119779a.getWindow().getDecorView()).addView(m143298j(frame));
    }

    @Override // p149l.b0i
    /* JADX INFO: renamed from: q */
    public void mo99779q() {
        long j = this.f119780b;
        if (j == 0 || j <= System.currentTimeMillis()) {
            FeedModule.f38855d.m209452ed().subscribe(mkd0.m154956H(new e30() { // from class: l.bug
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77319a.m143302n((Envelope) obj);
                }
            }, new e30() { // from class: l.cug
                @Override // p149l.e30
                public final void call(Object obj) {
                    jug.m143291c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m143305r(String str) {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f38784id = str;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = 1L;
        oMSConstraint.latestMs = System.currentTimeMillis();
        oMSCounterInfo.constraint = oMSConstraint;
        OMSData oMSData = new OMSData();
        ArrayList arrayList = new ArrayList();
        oMSData.counters = arrayList;
        arrayList.add(oMSCounterInfo);
        ic50.m135327j().m135330c().m202374P(oMSData).subscribe(mkd0.m154956H(new e30() { // from class: l.dug
            @Override // p149l.e30
            public final void call(Object obj) {
                jug.m143295g((OMSConfigEnvelope) obj);
            }
        }, new e30() { // from class: l.eug
            @Override // p149l.e30
            public final void call(Object obj) {
                jug.m143293e((Throwable) obj);
            }
        }));
    }
}

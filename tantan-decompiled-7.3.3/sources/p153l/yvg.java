package p153l;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSConfigEnvelope;
import com.p051p1.mobile.putong.data.OMSConstraint;
import com.p051p1.mobile.putong.data.OMSCounterInfo;
import com.p051p1.mobile.putong.data.OMSData;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class yvg implements q1i<Frame> {

    /* JADX INFO: renamed from: a */
    public Act f201706a;

    /* JADX INFO: renamed from: b */
    public long f201707b;

    /* JADX INFO: renamed from: c */
    public boolean f201708c;

    /* JADX INFO: renamed from: d */
    public String f201709d;

    /* JADX INFO: renamed from: l.yvg$a */
    public class C21689a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimEffectPlayer f201710a;

        public C21689a(AnimEffectPlayer animEffectPlayer) {
            this.f201710a = animEffectPlayer;
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
            this.f201710a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.yvg$b */
    public class C21690b extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f201712a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f201713b;

        public C21690b(VDraweeView vDraweeView, View view) {
            this.f201712a = vDraweeView;
            this.f201713b = view;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(80.0f);
            int iMin = Math.min(qa00.m175859d(qimVar.getHeight()), (int) ((iM105592y0 * 452.0f) / 295.0f));
            int iMin2 = Math.min(iM105592y0, qa00.m175859d(qimVar.getWidth()));
            ViewGroup.LayoutParams layoutParams = this.f201712a.getLayoutParams();
            layoutParams.width = iMin2;
            layoutParams.height = iMin;
            this.f201712a.setLayoutParams(layoutParams);
            this.f201713b.setVisibility(0);
        }
    }

    public yvg(Act act, String str) {
        this.f201706a = act;
        this.f201709d = str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m217501c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m217502d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m217503e(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m217505g(OMSConfigEnvelope oMSConfigEnvelope) {
    }

    /* JADX INFO: renamed from: i */
    public final void m217507i(View view) {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(80.0f);
        bnl0.m105505C0(view, (int) ((iM105592y0 * 452.0f) / 295.0f));
        bnl0.m105507D0(iM105592y0, view);
    }

    /* JADX INFO: renamed from: j */
    public View m217508j(final Frame frame) {
        final View viewInflate = LayoutInflater.from(this.f201706a).inflate(tec0.f173650e0, (ViewGroup) null);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewInflate.findViewById(hdc0.f108860O1);
        View viewFindViewById = viewInflate.findViewById(hdc0.f108971w);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(hdc0.f108942m0);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.uvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yvg.m217502d(view);
            }
        });
        viewFindViewById.setVisibility(4);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.vvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185927a.m217509k(viewInflate, frame, view);
            }
        });
        i4g0.m138492A("e_moment_activity_popup", this.f201709d, jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, frame.f40070id));
        if ("svg".equals(frame.content.resource.type)) {
            viewFindViewById.setVisibility(0);
            animEffectPlayer.setVisibility(0);
            vDraweeView.setVisibility(8);
            m217507i(animEffectPlayer);
            animEffectPlayer.loadAnimWithListener(frame.content.resource.url, -1, new C21689a(animEffectPlayer), true);
        } else {
            vDraweeView.setVisibility(0);
            animEffectPlayer.setVisibility(8);
            uqb0.f180374G.m127117M0(vDraweeView, frame.content.resource.url, new C21690b(vDraweeView, viewFindViewById));
        }
        animEffectPlayer.setOnClickListener(new View.OnClickListener() { // from class: l.wvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190961a.m217510l(frame, viewInflate, view);
            }
        });
        vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.xvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196394a.m217511m(frame, viewInflate, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m217509k(View view, Frame frame, View view2) {
        view.setVisibility(8);
        ((FrameLayout) this.f201706a.getWindow().getDecorView()).removeView(view);
        i4g0.m138523u("e_moment_activity_popup_cancel", this.f201709d, jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, frame.f40070id));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m217510l(Frame frame, View view, View view2) {
        m217513o(frame, view);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m217511m(Frame frame, View view, View view2) {
        m217513o(frame, view);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m217512n(Envelope envelope) {
        List<Frame> list = ((FeedData) envelope.getModuleData(FeedData.class)).frames;
        String str = list.get(0).f40070id;
        if (list.size() > 0 && !TextUtils.isEmpty(str)) {
            m217514q(list.get(0));
            m217515r(str);
        }
        this.f201707b = System.currentTimeMillis() + ((long) (list.get(0).intervalSec * 1000));
    }

    /* JADX INFO: renamed from: o */
    public void m217513o(Frame frame, View view) {
        i4g0.m138523u("e_moment_activity_popup", this.f201709d, jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, frame.f40070id));
        view.setVisibility(8);
        ((FrameLayout) this.f201706a.getWindow().getDecorView()).removeView(view);
        String str = frame.content.deeplink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ryh.m183607b(this.f201706a, Uri.parse(str));
    }

    @Override // p153l.q1i
    /* JADX INFO: renamed from: p */
    public void mo174886p() {
        long j = this.f201707b;
        if (j == 0 || j <= System.currentTimeMillis()) {
            FeedModule.f39703d.m145693ed().subscribe(psd0.m173597H(new y20() { // from class: l.qvg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159757a.m217512n((Envelope) obj);
                }
            }, new y20() { // from class: l.rvg
                @Override // p153l.y20
                public final void call(Object obj) {
                    yvg.m217501c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m217514q(Frame frame) {
        if (this.f201708c) {
            return;
        }
        this.f201708c = true;
        ((FrameLayout) this.f201706a.getWindow().getDecorView()).addView(m217508j(frame));
    }

    /* JADX INFO: renamed from: r */
    public final void m217515r(String str) {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f39632id = str;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = 1L;
        oMSConstraint.latestMs = System.currentTimeMillis();
        oMSCounterInfo.constraint = oMSConstraint;
        OMSData oMSData = new OMSData();
        ArrayList arrayList = new ArrayList();
        oMSData.counters = arrayList;
        arrayList.add(oMSCounterInfo);
        pk50.m172568j().m172571c().m116054P(oMSData).subscribe(psd0.m173597H(new y20() { // from class: l.svg
            @Override // p153l.y20
            public final void call(Object obj) {
                yvg.m217505g((OMSConfigEnvelope) obj);
            }
        }, new y20() { // from class: l.tvg
            @Override // p153l.y20
            public final void call(Object obj) {
                yvg.m217503e((Throwable) obj);
            }
        }));
    }
}

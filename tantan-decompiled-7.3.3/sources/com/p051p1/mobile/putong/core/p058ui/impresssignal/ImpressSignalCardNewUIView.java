package com.p051p1.mobile.putong.core.p058ui.impresssignal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.ImpressSignalCardWrapper;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.impresssignal.ImpressSignalCardNewUIView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.bom;
import p153l.bsj0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.i4g0;
import p153l.jde;
import p153l.jyb;
import p153l.kcg0;
import p153l.nnm;
import p153l.nrb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.r1j0;
import p153l.snm;
import p153l.upm;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wtd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ImpressSignalCardNewUIView extends CardView {

    /* JADX INFO: renamed from: a */
    public ImpressSignalCardNewUIView f30586a;

    /* JADX INFO: renamed from: b */
    public PictureView f30587b;

    /* JADX INFO: renamed from: c */
    public View f30588c;

    /* JADX INFO: renamed from: d */
    public View f30589d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f30590e;

    /* JADX INFO: renamed from: f */
    public VText f30591f;

    /* JADX INFO: renamed from: g */
    public VLinear f30592g;

    /* JADX INFO: renamed from: h */
    public VText f30593h;

    /* JADX INFO: renamed from: i */
    public CardBottomBaseInfoView f30594i;

    /* JADX INFO: renamed from: j */
    public VText f30595j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f30596k;

    /* JADX INFO: renamed from: l */
    public VLinear f30597l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f30598m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f30599n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f30600o;

    /* JADX INFO: renamed from: p */
    public VLinear f30601p;

    /* JADX INFO: renamed from: q */
    public VText f30602q;

    /* JADX INFO: renamed from: r */
    public NewNewHomeFrag f30603r;

    /* JADX INFO: renamed from: s */
    public snm f30604s;

    /* JADX INFO: renamed from: t */
    public ImpressSignalCardWrapper f30605t;

    /* JADX INFO: renamed from: u */
    public long f30606u;

    /* JADX INFO: renamed from: v */
    public kcg0 f30607v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.impresssignal.ImpressSignalCardNewUIView$a */
    public class C8538a implements y20<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f30608a;

        public C8538a(User user) {
            this.f30608a = user;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ImpressSignalCardNewUIView impressSignalCardNewUIView = ImpressSignalCardNewUIView.this;
            if (zIsEmpty) {
                bnl0.m105524M(impressSignalCardNewUIView.f30595j, false);
                bnl0.m105524M(ImpressSignalCardNewUIView.this.f30596k, true);
                try {
                    ImpressSignalCardNewUIView.this.f30596k.m40126W(this.f30608a, 0, true);
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            } else {
                bnl0.m105524M(impressSignalCardNewUIView.f30595j, true);
                bnl0.m105524M(ImpressSignalCardNewUIView.this.f30596k, false);
                ImpressSignalCardNewUIView.this.f30595j.setText(str);
            }
            bnl0.m105564k0(ImpressSignalCardNewUIView.this.f30586a);
        }
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context) {
        super(context);
        this.f30607v = null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m47304h(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public final void m47309m(View view) {
        bom.m105706a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m47310n(final SwipeDirection swipeDirection) {
        if (upm.m197108E(this.f30603r.act())) {
            this.f30603r.act().duringCreated(CoreModule.f18264c.f20313H1.m123929v3(upm.m197118O().pushMessage.tracker).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.xnm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f195420a.m47312p(swipeDirection, (Envelope) obj);
                }
            }, new y20() { // from class: l.ynm
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g("网络异常！");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m47311o(SwipeDirection swipeDirection, uxj0 uxj0Var) {
        this.f30604s.f169739d = Boolean.TRUE;
        this.f30603r.f22420C.m38128A2().mo39804A(swipeDirection);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30606u = pzi0.m174454o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m47320x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47309m(this);
        this.f30587b.m45167L(true, false, true, true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m47312p(final SwipeDirection swipeDirection, Envelope envelope) {
        if (NullChecker.m82486a(upm.m197118O()) && NullChecker.m82486a(upm.m197118O().pushMessage)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.m82486a(coreData) && NullChecker.m82486a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
                this.f30603r.act().duringCreated(CoreModule.f18264c.f20384f0.m33905ap(upm.m197118O().pushMessage.userId)).subscribe(psd0.m173597H(new y20() { // from class: l.znm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f205207a.m47311o(swipeDirection, (uxj0) obj);
                    }
                }, new y20() { // from class: l.aom
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ImpressSignalCardNewUIView.m47304h((Throwable) obj);
                    }
                }));
                return;
            }
            this.f30604s.f169739d = Boolean.TRUE;
            this.f30603r.f22420C.m38128A2().mo39804A(swipeDirection);
            r1j0.m179420g("对方信号波动，暂时无法接收");
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m47313q(int[] iArr) {
        bnl0.m105524M(this.f30588c, true);
        bnl0.m105524M(this.f30589d, true);
        bnl0.m105540X(this.f30589d, this.f30587b.getMeasuredHeight());
        bnl0.m105505C0(this.f30589d, this.f30586a.getMeasuredHeight() - this.f30587b.getMeasuredHeight());
        bnl0.m105540X(this.f30588c, this.f30587b.getMeasuredHeight() - qa00.m175859d(103.0f));
        bnl0.m105564k0(this.f30586a);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m47314r(User user, View view) {
        i4g0.m138523u("e_love_signal_photo", "p_suggest_users_home_view", pf60.m172085a("receiver_user_id", user.f56859id));
        getContext().startActivity(ProfileAct.m51920o2(getContext(), user.f56859id, "impress_signal", false));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m47315s(User user, NewNewHomeFrag newNewHomeFrag, snm snmVar, View view) {
        i4g0.m138523u("e_love_signal_accept", "p_suggest_users_home_view", pf60.m172085a("receiver_user_id", user.f56859id), pf60.m172085a("remainingtimes", Integer.valueOf(C8772a.m51429b0())), pf60.m172085a("accept_duration", "" + (pzi0.m174454o() - this.f30606u)), pf60.m172085a("signal_resource", Integer.valueOf(upm.m197120Q())));
        m47321y(newNewHomeFrag, snmVar, SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m47316t(long j, Long l2) {
        if ((pzi0.m174454o() - j) / 1000 >= upm.f180284a) {
            bsj0.m106263U(this.f30607v);
            if (NullChecker.m82486a(this.f30603r) && NullChecker.m82486a(this.f30603r.f22420C.m38128A2()) && NullChecker.m82486a(this.f30603r.f22420C.m38128A2().mo39816j()) && this.f30603r.f22420C.m38128A2().mo39816j().virtualCardType == VirtualCardType.ImpressSignalCard && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20136a0.m222761e()) && !jyb.m147479J(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded)) {
                m47317u();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m47317u() {
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.remove(0);
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = CoreModule.f18264c.f20405m0.f20136a0;
        c22507a.onNext(c22507a.m222761e());
        upm.m197113J(TabName.Card);
    }

    /* JADX INFO: renamed from: v */
    public void m47318v(final NewNewHomeFrag newNewHomeFrag, final snm snmVar, ImpressSignalCardWrapper impressSignalCardWrapper) {
        if (newNewHomeFrag == null || snmVar == null || impressSignalCardWrapper == null || impressSignalCardWrapper.getPushCustom() == null) {
            return;
        }
        this.f30603r = newNewHomeFrag;
        this.f30604s = snmVar;
        this.f30605t = impressSignalCardWrapper;
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(impressSignalCardWrapper.getPushCustom().userId);
        if (NullChecker.m82486a(userM116503Pa)) {
            String str = TEnum.equals(userM116503Pa.gender, "male") ? "他" : "她";
            if (jyb.m147479J(userM116503Pa.pictures) || userM116503Pa.pictures.size() < 4) {
                bnl0.m105524M(this.f30597l, false);
                nnm.m163903l(newNewHomeFrag.act(), userM116503Pa, new C8538a(userM116503Pa));
            } else {
                bnl0.m105524M(this.f30597l, true);
                uqb0.f180374G.m127115L0(this.f30598m, userM116503Pa.media(1).cover().profile480().formatted());
                uqb0.f180374G.m127115L0(this.f30599n, userM116503Pa.media(2).cover().profile480().formatted());
                uqb0.f180374G.m127115L0(this.f30600o, userM116503Pa.media(3).cover().profile480().formatted());
                this.f30595j.setText(str.concat("最近的动态照片"));
                bnl0.m105524M(this.f30595j, true);
                bnl0.m105524M(this.f30596k, false);
                bnl0.m105524M(this.f30597l, true);
            }
            this.f30587b.m45181c0(userM116503Pa.media(0), false);
            this.f30591f.setBackground(CoreModule.f18263b.getDrawable(dbc0.f86748Y3));
            this.f30591f.setText("心动匹配");
            this.f30602q.setText("点击和" + str + "聊一聊");
            Drawable drawable = getResources().getDrawable(dbc0.f86684W3);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f30591f.setCompoundDrawables(drawable, null, null, null);
            bnl0.m105524M(this.f30593h, CoreModule.f18264c.f20330N0.m32968i3(userM116503Pa, wtd0.m207832d(userM116503Pa)));
            this.f30594i.m39901q(userM116503Pa, 0, true, true);
            if (gra.m131550C2()) {
                int i = qa00.f156328o;
                Drawable drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.m29125v()) {
                    drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f30589d.setBackground(drawableM144407c);
                bnl0.m105505C0(this.f30588c, qa00.m175859d(103.0f));
                this.f30588c.setBackgroundResource(dbc0.f86746Y1);
            } else {
                int i2 = qa00.f156328o;
                this.f30589d.setBackground(jde.m144407c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (nrb0.m164466b()) {
                bnl0.m105524M(this.f30592g, false);
                if (this.f30592g.getChildCount() > 0) {
                    View viewFindViewById = this.f30592g.findViewById(adc0.f70195X0);
                    if (NullChecker.m82486a(viewFindViewById)) {
                        this.f30592g.removeView(viewFindViewById);
                    }
                }
                View viewM59330f = CertificationUtil.m59330f(newNewHomeFrag.act(), userM116503Pa, CertificationUtil.CertificationIconStyle.CARD);
                bnl0.m105524M(this.f30592g, NullChecker.m82486a(viewM59330f));
                if (NullChecker.m82486a(viewM59330f)) {
                    this.f30592g.addView(viewM59330f);
                }
            }
            bnl0.m105533Q0(this.f30587b, new y20() { // from class: l.tnm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f175296a.m47313q((int[]) obj);
                }
            });
            m47319w(pzi0.m174454o());
            bnl0.m105509E0(this.f30586a, new View.OnClickListener() { // from class: l.unm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179747a.m47314r(userM116503Pa, view);
                }
            });
            bnl0.m105509E0(this.f30602q, new View.OnClickListener() { // from class: l.vnm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184897a.m47315s(userM116503Pa, newNewHomeFrag, snmVar, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public void m47319w(final long j) {
        upm.m197129Z(false);
        bsj0.m106263U(this.f30607v);
        this.f30607v = C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wnm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189965a.m47316t(j, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m47320x() {
        bsj0.m106263U(this.f30607v);
    }

    /* JADX INFO: renamed from: y */
    public final void m47321y(NewNewHomeFrag newNewHomeFrag, snm snmVar, SwipeDirection swipeDirection) {
        if (NullChecker.m82486a(upm.m197118O()) && NullChecker.m82486a(upm.m197118O().pushMessage) && NullChecker.m82486a(newNewHomeFrag) && NullChecker.m82486a(newNewHomeFrag.act()) && upm.m197108E(newNewHomeFrag.act())) {
            m47310n(swipeDirection);
        }
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30607v = null;
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30607v = null;
    }
}

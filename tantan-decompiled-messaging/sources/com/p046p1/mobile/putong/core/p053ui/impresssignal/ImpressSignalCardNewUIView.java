package com.p046p1.mobile.putong.core.p053ui.impresssignal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.ImpressSignalCardWrapper;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.impresssignal.ImpressSignalCardNewUIView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.e30;
import p149l.fce;
import p149l.j760;
import p149l.jjb0;
import p149l.jo0;
import p149l.llm;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.qib0;
import p149l.qlm;
import p149l.roj0;
import p149l.snm;
import p149l.t100;
import p149l.u4c0;
import p149l.uld0;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yij0;
import p149l.zlm;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class ImpressSignalCardNewUIView extends CardView {

    /* JADX INFO: renamed from: a */
    public ImpressSignalCardNewUIView f29738a;

    /* JADX INFO: renamed from: b */
    public PictureView f29739b;

    /* JADX INFO: renamed from: c */
    public View f29740c;

    /* JADX INFO: renamed from: d */
    public View f29741d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f29742e;

    /* JADX INFO: renamed from: f */
    public VText f29743f;

    /* JADX INFO: renamed from: g */
    public VLinear f29744g;

    /* JADX INFO: renamed from: h */
    public VText f29745h;

    /* JADX INFO: renamed from: i */
    public CardBottomBaseInfoView f29746i;

    /* JADX INFO: renamed from: j */
    public VText f29747j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f29748k;

    /* JADX INFO: renamed from: l */
    public VLinear f29749l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f29750m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f29751n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f29752o;

    /* JADX INFO: renamed from: p */
    public VLinear f29753p;

    /* JADX INFO: renamed from: q */
    public VText f29754q;

    /* JADX INFO: renamed from: r */
    public NewNewHomeFrag f29755r;

    /* JADX INFO: renamed from: s */
    public qlm f29756s;

    /* JADX INFO: renamed from: t */
    public ImpressSignalCardWrapper f29757t;

    /* JADX INFO: renamed from: u */
    public long f29758u;

    /* JADX INFO: renamed from: v */
    public c4g0 f29759v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.impresssignal.ImpressSignalCardNewUIView$a */
    public class C8375a implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f29760a;

        public C8375a(User user) {
            this.f29760a = user;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ImpressSignalCardNewUIView impressSignalCardNewUIView = ImpressSignalCardNewUIView.this;
            if (zIsEmpty) {
                xdl0.m208344M(impressSignalCardNewUIView.f29747j, false);
                xdl0.m208344M(ImpressSignalCardNewUIView.this.f29748k, true);
                try {
                    ImpressSignalCardNewUIView.this.f29748k.m39123W(this.f29760a, 0, true);
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            } else {
                xdl0.m208344M(impressSignalCardNewUIView.f29747j, true);
                xdl0.m208344M(ImpressSignalCardNewUIView.this.f29748k, false);
                ImpressSignalCardNewUIView.this.f29747j.setText(str);
            }
            xdl0.m208384k0(ImpressSignalCardNewUIView.this.f29738a);
        }
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context) {
        super(context);
        this.f29759v = null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m46121h(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public final void m46126m(View view) {
        zlm.m219283a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m46127n(final SwipeDirection swipeDirection) {
        if (snm.m185074E(this.f29755r.act())) {
            this.f29755r.act().duringCreated(CoreModule.f17545c.f19571H1.m201076v3(snm.m185084O().pushMessage.tracker).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.vlm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181968a.m46129p(swipeDirection, (Envelope) obj);
                }
            }, new e30() { // from class: l.wlm
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g("网络异常！");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m46128o(SwipeDirection swipeDirection, roj0 roj0Var) {
        this.f29756s.f155244d = Boolean.TRUE;
        this.f29755r.f21678C.m37125A2().mo38801A(swipeDirection);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29758u = mqi0.m155944o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m46137x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46126m(this);
        this.f29739b.m43984L(true, false, true, true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m46129p(final SwipeDirection swipeDirection, Envelope envelope) {
        if (NullChecker.m81303a(snm.m185084O()) && NullChecker.m81303a(snm.m185084O().pushMessage)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
                this.f29755r.act().duringCreated(CoreModule.f17545c.f19642f0.m32902ap(snm.m185084O().pushMessage.userId)).subscribe(mkd0.m154956H(new e30() { // from class: l.xlm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f193429a.m46128o(swipeDirection, (roj0) obj);
                    }
                }, new e30() { // from class: l.ylm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ImpressSignalCardNewUIView.m46121h((Throwable) obj);
                    }
                }));
                return;
            }
            this.f29756s.f155244d = Boolean.TRUE;
            this.f29755r.f21678C.m37125A2().mo38801A(swipeDirection);
            osi0.m165783g("对方信号波动，暂时无法接收");
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m46130q(int[] iArr) {
        xdl0.m208344M(this.f29740c, true);
        xdl0.m208344M(this.f29741d, true);
        xdl0.m208360X(this.f29741d, this.f29739b.getMeasuredHeight());
        xdl0.m208325C0(this.f29741d, this.f29738a.getMeasuredHeight() - this.f29739b.getMeasuredHeight());
        xdl0.m208360X(this.f29740c, this.f29739b.getMeasuredHeight() - t100.m186890d(103.0f));
        xdl0.m208384k0(this.f29738a);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m46131r(User user, View view) {
        zvf0.m220399u("e_love_signal_photo", "p_suggest_users_home_view", j760.m140076a("receiver_user_id", user.f56011id));
        getContext().startActivity(ProfileAct.m50736n2(getContext(), user.f56011id, "impress_signal", false));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m46132s(User user, NewNewHomeFrag newNewHomeFrag, qlm qlmVar, View view) {
        zvf0.m220399u("e_love_signal_accept", "p_suggest_users_home_view", j760.m140076a("receiver_user_id", user.f56011id), j760.m140076a("remainingtimes", Integer.valueOf(C8609a.m50246b0())), j760.m140076a("accept_duration", "" + (mqi0.m155944o() - this.f29758u)), j760.m140076a("signal_resource", Integer.valueOf(snm.m185086Q())));
        m46138y(newNewHomeFrag, qlmVar, SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m46133t(long j, Long l2) {
        if ((mqi0.m155944o() - j) / 1000 >= snm.f165461a) {
            yij0.m214943U(this.f29759v);
            if (NullChecker.m81303a(this.f29755r) && NullChecker.m81303a(this.f29755r.f21678C.m37125A2()) && NullChecker.m81303a(this.f29755r.f21678C.m37125A2().mo38813j()) && this.f29755r.f21678C.m37125A2().mo38813j().virtualCardType == VirtualCardType.ImpressSignalCard && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19394a0.m221515e()) && !vwb.m200296J(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded)) {
                m46134u();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m46134u() {
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.remove(0);
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = CoreModule.f17545c.f19663m0.f19394a0;
        c22392a.onNext(c22392a.m221515e());
        snm.m185079J(TabName.Card);
    }

    /* JADX INFO: renamed from: v */
    public void m46135v(final NewNewHomeFrag newNewHomeFrag, final qlm qlmVar, ImpressSignalCardWrapper impressSignalCardWrapper) {
        if (newNewHomeFrag == null || qlmVar == null || impressSignalCardWrapper == null || impressSignalCardWrapper.getPushCustom() == null) {
            return;
        }
        this.f29755r = newNewHomeFrag;
        this.f29756s = qlmVar;
        this.f29757t = impressSignalCardWrapper;
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(impressSignalCardWrapper.getPushCustom().userId);
        if (NullChecker.m81303a(userM169430Pa)) {
            String str = TEnum.equals(userM169430Pa.gender, "male") ? "他" : "她";
            if (vwb.m200296J(userM169430Pa.pictures) || userM169430Pa.pictures.size() < 4) {
                xdl0.m208344M(this.f29749l, false);
                llm.m150525l(newNewHomeFrag.act(), userM169430Pa, new C8375a(userM169430Pa));
            } else {
                xdl0.m208344M(this.f29749l, true);
                qib0.f154691G.m102331L0(this.f29750m, userM169430Pa.media(1).cover().profile480().formatted());
                qib0.f154691G.m102331L0(this.f29751n, userM169430Pa.media(2).cover().profile480().formatted());
                qib0.f154691G.m102331L0(this.f29752o, userM169430Pa.media(3).cover().profile480().formatted());
                this.f29747j.setText(str.concat("最近的动态照片"));
                xdl0.m208344M(this.f29747j, true);
                xdl0.m208344M(this.f29748k, false);
                xdl0.m208344M(this.f29749l, true);
            }
            this.f29739b.m43998c0(userM169430Pa.media(0), false);
            this.f29743f.setBackground(CoreModule.f17544b.getDrawable(x2c0.f189876X3));
            this.f29743f.setText("心动匹配");
            this.f29754q.setText("点击和" + str + "聊一聊");
            Drawable drawable = getResources().getDrawable(x2c0.f189814V3);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f29743f.setCompoundDrawables(drawable, null, null, null);
            xdl0.m208344M(this.f29745h, CoreModule.f17545c.f19588N0.m31965i3(userM169430Pa, uld0.m194219d(userM169430Pa)));
            this.f29746i.m38898q(userM169430Pa, 0, true, true);
            if (upa.m194619C2()) {
                int i = t100.f167266o;
                Drawable drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.m28126v()) {
                    drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f29741d.setBackground(drawableM120426c);
                xdl0.m208325C0(this.f29740c, t100.m186890d(103.0f));
                this.f29740c.setBackgroundResource(x2c0.f189874X1);
            } else {
                int i2 = t100.f167266o;
                this.f29741d.setBackground(fce.m120426c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (jjb0.m141784b()) {
                xdl0.m208344M(this.f29744g, false);
                if (this.f29744g.getChildCount() > 0) {
                    View viewFindViewById = this.f29744g.findViewById(u4c0.f174104X0);
                    if (NullChecker.m81303a(viewFindViewById)) {
                        this.f29744g.removeView(viewFindViewById);
                    }
                }
                View viewM58147f = CertificationUtil.m58147f(newNewHomeFrag.act(), userM169430Pa, CertificationUtil.CertificationIconStyle.CARD);
                xdl0.m208344M(this.f29744g, NullChecker.m81303a(viewM58147f));
                if (NullChecker.m81303a(viewM58147f)) {
                    this.f29744g.addView(viewM58147f);
                }
            }
            xdl0.m208353Q0(this.f29739b, new e30() { // from class: l.rlm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159978a.m46130q((int[]) obj);
                }
            });
            m46136w(mqi0.m155944o());
            xdl0.m208329E0(this.f29738a, new View.OnClickListener() { // from class: l.slm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165248a.m46131r(userM169430Pa, view);
                }
            });
            xdl0.m208329E0(this.f29754q, new View.OnClickListener() { // from class: l.tlm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171032a.m46132s(userM169430Pa, newNewHomeFrag, qlmVar, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public void m46136w(final long j) {
        snm.m185095Z(false);
        yij0.m214943U(this.f29759v);
        this.f29759v = C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ulm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177080a.m46133t(j, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m46137x() {
        yij0.m214943U(this.f29759v);
    }

    /* JADX INFO: renamed from: y */
    public final void m46138y(NewNewHomeFrag newNewHomeFrag, qlm qlmVar, SwipeDirection swipeDirection) {
        if (NullChecker.m81303a(snm.m185084O()) && NullChecker.m81303a(snm.m185084O().pushMessage) && NullChecker.m81303a(newNewHomeFrag) && NullChecker.m81303a(newNewHomeFrag.act()) && snm.m185074E(newNewHomeFrag.act())) {
            m46127n(swipeDirection);
        }
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29759v = null;
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29759v = null;
    }
}

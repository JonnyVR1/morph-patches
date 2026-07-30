package com.p000p1.mobile.putong.core.p001ui.impresssignal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.ImpressSignalCardWrapper;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.impresssignal.ImpressSignalCardNewUIView;
import com.p000p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.fce;
import l.j760;
import l.jjb0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.uld0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.yij0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p003l.llm;
import p003l.qlm;
import p003l.snm;
import p003l.zlm;
import rx.c;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ImpressSignalCardNewUIView extends CardView {

    /* JADX INFO: renamed from: a */
    public ImpressSignalCardNewUIView f2132a;

    /* JADX INFO: renamed from: b */
    public PictureView f2133b;

    /* JADX INFO: renamed from: c */
    public View f2134c;

    /* JADX INFO: renamed from: d */
    public View f2135d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f2136e;

    /* JADX INFO: renamed from: f */
    public VText f2137f;

    /* JADX INFO: renamed from: g */
    public VLinear f2138g;

    /* JADX INFO: renamed from: h */
    public VText f2139h;

    /* JADX INFO: renamed from: i */
    public CardBottomBaseInfoView f2140i;

    /* JADX INFO: renamed from: j */
    public VText f2141j;

    /* JADX INFO: renamed from: k */
    public CardUserContentView f2142k;

    /* JADX INFO: renamed from: l */
    public VLinear f2143l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f2144m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f2145n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f2146o;

    /* JADX INFO: renamed from: p */
    public VLinear f2147p;

    /* JADX INFO: renamed from: q */
    public VText f2148q;

    /* JADX INFO: renamed from: r */
    public NewNewHomeFrag f2149r;

    /* JADX INFO: renamed from: s */
    public qlm f2150s;

    /* JADX INFO: renamed from: t */
    public ImpressSignalCardWrapper f2151t;

    /* JADX INFO: renamed from: u */
    public long f2152u;

    /* JADX INFO: renamed from: v */
    public c4g0 f2153v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.impresssignal.ImpressSignalCardNewUIView$a */
    public class C3150a implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f2154a;

        public C3150a(User user) {
            this.f2154a = user;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ImpressSignalCardNewUIView impressSignalCardNewUIView = ImpressSignalCardNewUIView.this;
            if (zIsEmpty) {
                xdl0.M(impressSignalCardNewUIView.f2141j, false);
                xdl0.M(ImpressSignalCardNewUIView.this.f2142k, true);
                try {
                    ImpressSignalCardNewUIView.this.f2142k.W(this.f2154a, 0, true);
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            } else {
                xdl0.M(impressSignalCardNewUIView.f2141j, true);
                xdl0.M(ImpressSignalCardNewUIView.this.f2142k, false);
                ImpressSignalCardNewUIView.this.f2141j.setText(str);
            }
            xdl0.k0(ImpressSignalCardNewUIView.this.f2132a);
        }
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context) {
        super(context);
        this.f2153v = null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m3486h(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public final void m3491m(View view) {
        zlm.m11434a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m3492n(final SwipeDirection swipeDirection) {
        if (snm.m9376E(this.f2149r.Y4())) {
            this.f2149r.Y4().duringCreated(CoreModule.c.H1.v3(snm.m9386O().pushMessage.tracker).take(1)).subscribe(mkd0.H(new e30() { // from class: l.vlm
                public final void call(Object obj) {
                    this.f7996a.m3494p(swipeDirection, (Envelope) obj);
                }
            }, new e30() { // from class: l.wlm
                public final void call(Object obj) {
                    osi0.g("网络异常！");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m3493o(SwipeDirection swipeDirection, roj0 roj0Var) {
        this.f2150s.f7040d = Boolean.TRUE;
        this.f2149r.C.A2().A(swipeDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        this.f2152u = mqi0.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m3502x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3491m(this);
        this.f2133b.L(true, false, true, true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m3494p(final SwipeDirection swipeDirection, Envelope envelope) {
        if (NullChecker.a(snm.m9386O()) && NullChecker.a(snm.m9386O().pushMessage)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.a(coreData) && NullChecker.a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
                this.f2149r.Y4().duringCreated(CoreModule.c.f0.ap(snm.m9386O().pushMessage.userId)).subscribe(mkd0.H(new e30() { // from class: l.xlm
                    public final void call(Object obj) {
                        this.f8509a.m3493o(swipeDirection, (roj0) obj);
                    }
                }, new e30() { // from class: l.ylm
                    public final void call(Object obj) {
                        ImpressSignalCardNewUIView.m3486h((Throwable) obj);
                    }
                }));
                return;
            }
            this.f2150s.f7040d = Boolean.TRUE;
            this.f2149r.C.A2().A(swipeDirection);
            osi0.g("对方信号波动，暂时无法接收");
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m3495q(int[] iArr) {
        xdl0.M(this.f2134c, true);
        xdl0.M(this.f2135d, true);
        xdl0.X(this.f2135d, this.f2133b.getMeasuredHeight());
        xdl0.C0(this.f2135d, this.f2132a.getMeasuredHeight() - this.f2133b.getMeasuredHeight());
        xdl0.X(this.f2134c, this.f2133b.getMeasuredHeight() - t100.d(103.0f));
        xdl0.k0(this.f2132a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m3496r(User user, View view) {
        zvf0.u("e_love_signal_photo", "p_suggest_users_home_view", new j760[]{j760.a("receiver_user_id", ((DbObject) user).id)});
        getContext().startActivity(ProfileAct.n2(getContext(), ((DbObject) user).id, "impress_signal", false));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m3497s(User user, NewNewHomeFrag newNewHomeFrag, qlm qlmVar, View view) {
        zvf0.u("e_love_signal_accept", "p_suggest_users_home_view", new j760[]{j760.a("receiver_user_id", ((DbObject) user).id), j760.a("remainingtimes", Integer.valueOf(a.b0())), j760.a("accept_duration", "" + (mqi0.o() - this.f2152u)), j760.a("signal_resource", Integer.valueOf(snm.m9388Q()))});
        m3503y(newNewHomeFrag, qlmVar, SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m3498t(long j, Long l2) {
        if ((mqi0.o() - j) / 1000 >= snm.f7395a) {
            yij0.U(this.f2153v);
            if (NullChecker.a(this.f2149r) && NullChecker.a(this.f2149r.C.A2()) && NullChecker.a(this.f2149r.C.A2().j()) && this.f2149r.C.A2().j().virtualCardType == VirtualCardType.ImpressSignalCard && NullChecker.a(CoreModule.c.m0.a0.e()) && !vwb.J(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded)) {
                m3499u();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3499u() {
        ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.remove(0);
        ((PartialListOpt) CoreModule.c.m0.a0.e()).setRefreshValue(true);
        rx.subjects.a aVar = CoreModule.c.m0.a0;
        aVar.onNext((PartialListOpt) aVar.e());
        snm.m9381J(TabName.Card);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m3500v(final NewNewHomeFrag newNewHomeFrag, final qlm qlmVar, ImpressSignalCardWrapper impressSignalCardWrapper) {
        if (newNewHomeFrag == null || qlmVar == null || impressSignalCardWrapper == null || impressSignalCardWrapper.getPushCustom() == null) {
            return;
        }
        this.f2149r = newNewHomeFrag;
        this.f2150s = qlmVar;
        this.f2151t = impressSignalCardWrapper;
        final User userPa = CoreModule.c.e0.Pa(impressSignalCardWrapper.getPushCustom().userId);
        if (NullChecker.a(userPa)) {
            String str = TEnum.equals(userPa.gender, "male") ? "他" : "她";
            if (vwb.J(userPa.pictures) || userPa.pictures.size() < 4) {
                xdl0.M(this.f2143l, false);
                llm.m7750l(newNewHomeFrag.Y4(), userPa, new C3150a(userPa));
            } else {
                xdl0.M(this.f2143l, true);
                qib0.G.L0(this.f2144m, userPa.media(1).cover().profile480().formatted());
                qib0.G.L0(this.f2145n, userPa.media(2).cover().profile480().formatted());
                qib0.G.L0(this.f2146o, userPa.media(3).cover().profile480().formatted());
                this.f2141j.setText(str.concat("最近的动态照片"));
                xdl0.M(this.f2141j, true);
                xdl0.M(this.f2142k, false);
                xdl0.M(this.f2143l, true);
            }
            this.f2133b.c0(userPa.media(0), false);
            this.f2137f.setBackground(CoreModule.b.getDrawable(x2c0.X3));
            this.f2137f.setText("心动匹配");
            this.f2148q.setText("点击和" + str + "聊一聊");
            Drawable drawable = getResources().getDrawable(x2c0.V3);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f2137f.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            xdl0.M(this.f2139h, CoreModule.c.N0.i3(userPa, uld0.d(userPa)));
            this.f2140i.q(userPa, 0, true, true);
            if (upa.C2()) {
                int i = t100.o;
                Drawable drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.v()) {
                    drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f2135d.setBackground(drawableC);
                xdl0.C0(this.f2134c, t100.d(103.0f));
                this.f2134c.setBackgroundResource(x2c0.X1);
            } else {
                int i2 = t100.o;
                this.f2135d.setBackground(fce.c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (jjb0.b()) {
                xdl0.M(this.f2138g, false);
                if (this.f2138g.getChildCount() > 0) {
                    View viewFindViewById = this.f2138g.findViewById(u4c0.X0);
                    if (NullChecker.a(viewFindViewById)) {
                        this.f2138g.removeView(viewFindViewById);
                    }
                }
                View viewM3555f = CertificationUtil.m3555f(newNewHomeFrag.Y4(), userPa, CertificationUtil.CertificationIconStyle.CARD);
                xdl0.M(this.f2138g, NullChecker.a(viewM3555f));
                if (NullChecker.a(viewM3555f)) {
                    this.f2138g.addView(viewM3555f);
                }
            }
            xdl0.Q0(this.f2133b, new e30() { // from class: l.rlm
                public final void call(Object obj) {
                    this.f7187a.m3495q((int[]) obj);
                }
            });
            m3501w(mqi0.o());
            xdl0.E0(this.f2132a, new View.OnClickListener() { // from class: l.slm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7379a.m3496r(userPa, view);
                }
            });
            xdl0.E0(this.f2148q, new View.OnClickListener() { // from class: l.tlm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7580a.m3497s(userPa, newNewHomeFrag, qlmVar, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3501w(final long j) {
        snm.m9397Z(false);
        yij0.U(this.f2153v);
        this.f2153v = c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ulm
            public final void call(Object obj) {
                this.f7769a.m3498t(j, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m3502x() {
        yij0.U(this.f2153v);
    }

    /* JADX INFO: renamed from: y */
    public final void m3503y(NewNewHomeFrag newNewHomeFrag, qlm qlmVar, SwipeDirection swipeDirection) {
        if (NullChecker.a(snm.m9386O()) && NullChecker.a(snm.m9386O().pushMessage) && NullChecker.a(newNewHomeFrag) && NullChecker.a(newNewHomeFrag.Y4()) && snm.m9376E(newNewHomeFrag.Y4())) {
            m3492n(swipeDirection);
        }
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2153v = null;
    }

    public ImpressSignalCardNewUIView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2153v = null;
    }
}

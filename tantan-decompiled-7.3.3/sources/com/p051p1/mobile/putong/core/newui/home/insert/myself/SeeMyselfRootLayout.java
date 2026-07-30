package com.p051p1.mobile.putong.core.newui.home.insert.myself;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8019b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p051p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.EditProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.util.HashSet;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.aoh0;
import p153l.aw90;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.kcg0;
import p153l.kec0;
import p153l.mie0;
import p153l.mql;
import p153l.nae0;
import p153l.ner;
import p153l.nwb;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rc80;
import p153l.rie0;
import p153l.sfj0;
import p153l.t3m;
import p153l.th0;
import p153l.uqb0;
import p153l.x7c0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class SeeMyselfRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public int f23753A;

    /* JADX INFO: renamed from: B */
    public HashSet<String> f23754B;

    /* JADX INFO: renamed from: C */
    public mql f23755C;

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f23756a;

    /* JADX INFO: renamed from: b */
    public VFrame f23757b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f23758c;

    /* JADX INFO: renamed from: d */
    public VText f23759d;

    /* JADX INFO: renamed from: e */
    public VText f23760e;

    /* JADX INFO: renamed from: f */
    public VImage f23761f;

    /* JADX INFO: renamed from: g */
    public VText f23762g;

    /* JADX INFO: renamed from: h */
    public VImage f23763h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f23764i;

    /* JADX INFO: renamed from: j */
    public VText f23765j;

    /* JADX INFO: renamed from: k */
    public VImage f23766k;

    /* JADX INFO: renamed from: l */
    public VText f23767l;

    /* JADX INFO: renamed from: m */
    public SimpleDraweeView f23768m;

    /* JADX INFO: renamed from: n */
    public SimpleDraweeView f23769n;

    /* JADX INFO: renamed from: o */
    public VImage f23770o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f23771p;

    /* JADX INFO: renamed from: q */
    public VText f23772q;

    /* JADX INFO: renamed from: r */
    public VFrame f23773r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f23774s;

    /* JADX INFO: renamed from: t */
    public ExpandedImageSwitchView f23775t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f23776u;

    /* JADX INFO: renamed from: v */
    public ConstraintLayout f23777v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f23778w;

    /* JADX INFO: renamed from: x */
    public VImage f23779x;

    /* JADX INFO: renamed from: y */
    public VText_Bold f23780y;

    /* JADX INFO: renamed from: z */
    public kcg0 f23781z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$a */
    public class ViewOnClickListenerC8148a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23782a;

        public ViewOnClickListenerC8148a(User user) {
            this.f23782a = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CertificationUtil.m59334j((Act) SeeMyselfRootLayout.this.f23763h.getContext(), this.f23782a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$b */
    public class ViewOnClickListenerC8149b implements View.OnClickListener {
        public ViewOnClickListenerC8149b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeeMyselfRootLayout.this.m39607R("swipe");
            CoreModule.f18264c.f20405m0.f20088I2.onNext(pf60.m172085a(SwipeDirection.RIGHT, null));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$c */
    public class ViewOnClickListenerC8150c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23785a;

        public ViewOnClickListenerC8150c(User user) {
            this.f23785a = user;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0030  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userM189086i2;
            Context context = SeeMyselfRootLayout.this.getContext();
            if (context instanceof Act) {
                Act act = (Act) context;
                Intent intentM51923r2 = ProfileAct.m51923r2(act, this.f23785a.f56859id, "preview_card", false, false, 0);
                if (act instanceof ProfileAct) {
                    ner nerVarM51931D2 = ((ProfileAct) act).m51931D2();
                    if (nerVarM51931D2 instanceof t3m) {
                        userM189086i2 = ((t3m) nerVarM51931D2).m189086i2();
                    } else {
                        userM189086i2 = null;
                    }
                } else {
                    userM189086i2 = null;
                }
                if (userM189086i2 == null) {
                    userM189086i2 = aw90.m100562F().f73701a;
                }
                intentM51923r2.putExtra("preview_user_info", userM189086i2);
                act.startActivity(intentM51923r2);
                act.overridePendingTransition(x7c0.f192710y, x7c0.f192700o);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$d */
    public class C8151d implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoopInputType f23787a;

        public C8151d(LoopInputType loopInputType) {
            this.f23787a = loopInputType;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i2 != -1 || !(SeeMyselfRootLayout.this.m39611u() instanceof EditProfileAct)) {
                return false;
            }
            EditProfileAct editProfileAct = (EditProfileAct) SeeMyselfRootLayout.this.m39611u();
            editProfileAct.m51762d3();
            PutongFrag putongFragM51931D2 = editProfileAct.m51931D2();
            if (!(putongFragM51931D2 instanceof ProfileListFragLocalEditImpl) || this.f23787a != LoopInputType.MY_LIFE_SEE_MYSELF) {
                return false;
            }
            ((ProfileListFragLocalEditImpl) putongFragM51931D2).mo52250J3();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$e */
    public class C8152e implements ExpandedImageSwitchView.InterfaceC8118b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23789a;

        public C8152e(User user) {
            this.f23789a = user;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: c */
        public void mo39338c(boolean z) {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: d */
        public void mo39339d(int i, Media media, boolean z) {
            if (this.f23789a.pictures.size() > i) {
                uqb0.f180374G.m127115L0(SeeMyselfRootLayout.this.f23756a, nwb.m164968f(this.f23789a.media(i).cover()).formatted());
                mql mqlVar = SeeMyselfRootLayout.this.f23755C;
                if (mqlVar != null) {
                    mqlVar.mo38435a(i, true);
                }
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: e */
        public boolean mo39340e(Media media) {
            return false;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC8118b
        /* JADX INFO: renamed from: f */
        public void mo39341f(int i, boolean z) {
        }
    }

    public SeeMyselfRootLayout(@NonNull Context context) {
        super(context);
        this.f23753A = 0;
        this.f23754B = new HashSet<>();
        m39591B();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m39576f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ pf60 m39577g(VerificationCenter verificationCenter) {
        StudentVerificationStatus studentVerificationStatus = StudentVerificationStatus.get("default");
        StudentVerificationStatus studentVerificationStatus2 = StudentVerificationStatus.get("default");
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo)) {
            studentVerificationStatus = verificationCenter.picVerificationInfo.status;
        }
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.idCard)) {
            studentVerificationStatus2 = verificationCenter.idCard.status;
        }
        return pf60.m172085a(studentVerificationStatus, studentVerificationStatus2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m39579i(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m39586p(View view) {
    }

    private void setImageStyle(boolean z) {
        RoundingParams roundingParamsM207055p = this.f23756a.getHierarchy().m207055p();
        if (roundingParamsM207055p == null) {
            roundingParamsM207055p = new RoundingParams();
        }
        int i = qa00.f156326m;
        if (z) {
            i = qa00.f156328o;
        }
        int i2 = i;
        float f = i;
        float f2 = i2;
        roundingParamsM207055p.m8318r(f, f, f2, f2);
        this.f23756a.getHierarchy().m207045H(roundingParamsM207055p);
    }

    /* JADX INFO: renamed from: A */
    public final void m39590A(aoh0 aoh0Var, User user) {
        this.f23775t.m39334l();
        this.f23775t.m39332j(aoh0Var, user, new C8152e(user));
    }

    /* JADX INFO: renamed from: B */
    public final void m39591B() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125620Sb, (ViewGroup) this, false);
        addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        m39610t(viewInflate);
        this.f23756a.getHierarchy().m207042E(new rc80(qa00.f156326m));
        bnl0.m105509E0(this.f23764i, new View.OnClickListener() { // from class: l.zhe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeMyselfRootLayout.m39576f(view);
            }
        });
        bnl0.m105509E0(this.f23758c, new View.OnClickListener() { // from class: l.iie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeMyselfRootLayout.m39586p(view);
            }
        });
        boolean zM131778z = gra.m131778z();
        VImage vImage = this.f23761f;
        if (zM131778z) {
            vImage.setImageResource(dbc0.f86947e7);
            this.f23766k.setImageResource(dbc0.f86871bt);
            this.f23768m.setBackgroundResource(dbc0.f86915d7);
            this.f23769n.setBackgroundResource(dbc0.f86915d7);
            this.f23771p.setBackgroundResource(dbc0.f87563x1);
        } else {
            vImage.setImageResource(dbc0.f86850b8);
            this.f23766k.setImageResource(dbc0.f87014g8);
            this.f23768m.setBackgroundResource(dbc0.f86784Z7);
            this.f23769n.setBackgroundResource(dbc0.f86784Z7);
            this.f23771p.setBackgroundResource(dbc0.f87432t);
            ViewGroup.LayoutParams layoutParams = this.f23763h.getLayoutParams();
            int iM175859d = qa00.m175859d(70.0f);
            layoutParams.width = iM175859d;
            layoutParams.height = iM175859d;
            this.f23763h.setLayoutParams(layoutParams);
        }
        if (gra.m131606N3()) {
            this.f23775t.setIndicatorColor(Color.parseColor("#57000000"));
            this.f23775t.setIndicatorColorBorder(Color.parseColor("#57A0A0A0"));
            this.f23775t.setIndicatorSelectedColorBorder(Color.parseColor("#4DA0A0A0"));
            this.f23775t.setupIndicator(this.f23774s);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m39592C(User user) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m39594E(pf60 pf60Var) {
        User user = (User) pf60Var.f152156a;
        S s = pf60Var.f152157b;
        m39605P(user, (StudentVerificationStatus) ((pf60) s).f152156a, (StudentVerificationStatus) ((pf60) s).f152157b, this.f23753A);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m39595F(int i, String str, View view) {
        if (m39612v() || m39613w()) {
            return;
        }
        m39607R(ReminderAction.photo);
        if (i == 2) {
            m39616z(LoopInputType.MY_LIFE_SEE_MYSELF);
            return;
        }
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantan://user_mirror?entry=picture&from=" + str));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m39596G(int i, String str, View view) {
        if (m39612v() || m39613w()) {
            return;
        }
        m39607R(ReminderAction.photo);
        if (i == 2) {
            m39616z(LoopInputType.MY_LIFE_SEE_MYSELF);
            return;
        }
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantan://user_mirror?entry=picture&from=" + str));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m39597H(View view) {
        m39607R("swipe");
        CoreModule.f18264c.f20405m0.f20088I2.onNext(pf60.m172085a(SwipeDirection.RIGHT, null));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m39598I(View view) {
        if (m39612v() || m39613w()) {
            return;
        }
        m39607R("complete_profile");
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantan://user_mirror?entry=".concat(TextUtils.isEmpty(CoreModule.f18264c.f20381e0.m116593na().description) ? SocialOperation.GAME_SIGNATURE : "picture")));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m39599J(View view) {
        m39607R("later");
        CoreModule.f18264c.f20405m0.f20088I2.onNext(pf60.m172085a(SwipeDirection.LEFT, null));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m39600K(View view) {
        m39607R("avatar_verify");
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantan://verificationcenter"));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m39601L(int i, String str, View view) {
        if (m39612v() || m39613w()) {
            return;
        }
        m39607R("avatar_verify");
        if (i == 2) {
            m39616z(LoopInputType.VERIFICATION);
            return;
        }
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantan://user_mirror?entry=verification&from=" + str));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m39602M(int i, String str, View view) {
        if (m39612v() || m39613w()) {
            return;
        }
        m39607R("self_introduction");
        if (i == 2) {
            m39616z(LoopInputType.SIGNATURE);
            return;
        }
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantan://user_mirror?entry=signature&from=" + str));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m39603N(th0[] th0VarArr, View view) {
        m39611u().startActivity(CoreModule.m30930K().startMessagesAct(m39611u(), User.ID_TEAM_ACCOUNT, true, false));
        th0VarArr[0].m191137c();
    }

    /* JADX INFO: renamed from: O */
    public void m39604O(Act act) {
        m39608S(act);
        psd0.m173633z(this.f23781z);
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        if (this.f23753A == 2) {
            c22421cM116596o9 = C22421c.just(aw90.m100562F().f73701a);
        }
        this.f23781z = act.duringCreated(C22421c.combineLatest(c22421cM116596o9.distinctUntilChanged().doOnNext(new y20() { // from class: l.jie0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121077a.m39592C((User) obj);
            }
        }), CoreModule.f18264c.f20294B0.m32614j4().map(new qcj() { // from class: l.kie0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return SeeMyselfRootLayout.m39577g((VerificationCenter) obj);
            }
        }).distinctUntilChanged().doOnNext(new y20() { // from class: l.lie0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132217a.m39593D((pf60) obj);
            }
        }), new mie0())).subscribe(psd0.m173597H(new y20() { // from class: l.nie0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142118a.m39594E((pf60) obj);
            }
        }, new y20() { // from class: l.oie0
            @Override // p153l.y20
            public final void call(Object obj) {
                SeeMyselfRootLayout.m39579i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m39605P(User user, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2, final int i) {
        boolean z = i == 0 || i == 2;
        setImageStyle(z);
        User userRiskAuditUser = user.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + user.f56859id));
        uqb0.f180374G.m127115L0(this.f23756a, nwb.m164968f(userRiskAuditUser.m61308fp()).formatted());
        this.f23759d.setText("Hi，" + userRiskAuditUser.name);
        final String str = "home_complete_card";
        if (i != 0) {
            if (i == 1) {
                str = "mytab_complete_card";
            } else if (i == 2) {
                str = "edit_profile_complete_card";
            }
        }
        VText vText = this.f23760e;
        if (i == 2) {
            vText.setText("你的卡片信息有点少\n补全信息可以吸引到更多人的喜欢");
        } else {
            vText.setText("你的卡片信息有点少\n补全一下你的信息吧");
        }
        bnl0.m105509E0(this.f23761f, null);
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            bnl0.m105524M(this.f23763h, true);
            bnl0.m105524M(this.f23761f, false);
            bnl0.m105524M(this.f23762g, false);
            if (gra.m131778z()) {
                bnl0.m105505C0(this.f23763h, qa00.m175859d(z ? 30.0f : 24.0f));
            }
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                boolean zM131778z = gra.m131778z();
                VImage vImage = this.f23763h;
                if (zM131778z) {
                    vImage.setImageResource(z ? dbc0.f86463P6 : dbc0.f86331L2);
                } else {
                    vImage.setImageResource(dbc0.f86299K2);
                }
            } else {
                boolean zM131778z2 = gra.m131778z();
                VImage vImage2 = this.f23763h;
                if (zM131778z2) {
                    vImage2.setImageResource(z ? dbc0.f86687W6 : dbc0.f86459P2);
                } else {
                    vImage2.setImageResource(dbc0.f86427O2);
                }
            }
            if (i == 2) {
                bnl0.m105509E0(this.f23763h, new ViewOnClickListenerC8148a(userRiskAuditUser));
            }
        } else {
            boolean zEquals = TEnum.equals(studentVerificationStatus, "pending");
            VText vText2 = this.f23762g;
            if (zEquals) {
                vText2.setText("认证中");
                bnl0.m105509E0(this.f23761f, new View.OnClickListener() { // from class: l.pie0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f152530a.m39600K(view);
                    }
                });
            } else {
                vText2.setText("头像认证");
                bnl0.m105509E0(this.f23761f, new View.OnClickListener() { // from class: l.qie0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f157832a.m39601L(i, str, view);
                    }
                });
            }
            bnl0.m105524M(this.f23763h, false);
            bnl0.m105524M(this.f23761f, true);
            bnl0.m105524M(this.f23762g, true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(userRiskAuditUser.description);
        VText vText3 = this.f23767l;
        if (zIsEmpty) {
            bnl0.m105524M(vText3, false);
            bnl0.m105524M(this.f23766k, false);
            bnl0.m105524M(this.f23765j, true);
            bnl0.m105509E0(this.f23765j, new View.OnClickListener() { // from class: l.aie0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71525a.m39602M(i, str, view);
                }
            });
        } else {
            bnl0.m105524M(vText3, true);
            bnl0.m105524M(this.f23766k, true);
            bnl0.m105524M(this.f23765j, false);
            this.f23767l.setText(userRiskAuditUser.description);
        }
        bnl0.m105509E0(this.f23768m, null);
        bnl0.m105509E0(this.f23769n, null);
        this.f23768m.setClickable(false);
        this.f23769n.setClickable(false);
        if (userRiskAuditUser.pictures.size() > 1) {
            uqb0.f180374G.m127115L0(this.f23768m, userRiskAuditUser.pictures.get(1).cover().profileSmall().formatted());
        } else {
            this.f23768m.setImageResource(0);
            bnl0.m105509E0(this.f23768m, new View.OnClickListener() { // from class: l.bie0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76866a.m39595F(i, str, view);
                }
            });
        }
        if (userRiskAuditUser.pictures.size() > 2) {
            uqb0.f180374G.m127115L0(this.f23769n, userRiskAuditUser.pictures.get(2).cover().profileSmall().formatted());
        } else {
            this.f23769n.setImageResource(0);
            bnl0.m105509E0(this.f23769n, new View.OnClickListener() { // from class: l.cie0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81932a.m39596G(i, str, view);
                }
            });
        }
        if (m39615y(userRiskAuditUser)) {
            m39609T();
        }
        if (!gra.m131606N3() || !m39615y(userRiskAuditUser)) {
            bnl0.m105524M(this.f23757b, true);
            bnl0.m105524M(this.f23773r, false);
            VText_Bold vText_Bold = this.f23771p;
            if (i != 0) {
                bnl0.m105524M(vText_Bold, false);
                bnl0.m105524M(this.f23772q, false);
                return;
            }
            bnl0.m105524M(vText_Bold, true);
            bnl0.m105524M(this.f23772q, true);
            boolean zM39615y = m39615y(userRiskAuditUser);
            VText_Bold vText_Bold2 = this.f23771p;
            if (zM39615y) {
                vText_Bold2.setText("继续划卡");
                bnl0.m105509E0(this.f23771p, new View.OnClickListener() { // from class: l.die0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88629a.m39597H(view);
                    }
                });
            } else {
                vText_Bold2.setText("立即完善");
                bnl0.m105509E0(this.f23771p, new View.OnClickListener() { // from class: l.eie0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f94141a.m39598I(view);
                    }
                });
            }
            bnl0.m105509E0(this.f23772q, new View.OnClickListener() { // from class: l.fie0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99181a.m39599J(view);
                }
            });
            return;
        }
        bnl0.m105524M(this.f23757b, false);
        bnl0.m105524M(this.f23773r, true);
        m39590A(new aoh0(new CoreSuggested.UserInfo(), userRiskAuditUser), userRiskAuditUser);
        if (this.f23755C == null) {
            this.f23755C = new C8019b(false, getContext(), this.f23778w, null);
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = userRiskAuditUser.f56859id;
        this.f23755C.mo38439e(null, userRiskAuditUser, userInfo, true, null);
        this.f23755C.mo38435a(0, false);
        if (i == 0) {
            bnl0.m105524M(this.f23780y, true);
            bnl0.m105524M(this.f23779x, false);
            bnl0.m105509E0(this.f23780y, new ViewOnClickListenerC8149b());
            bnl0.m105509E0(this.f23777v, new ViewOnClickListenerC8150c(userRiskAuditUser));
            boolean zEquals2 = TEnum.equals(studentVerificationStatus, "verified");
            VDraweeView vDraweeView = this.f23776u;
            if (!zEquals2) {
                bnl0.m105524M(vDraweeView, false);
                return;
            }
            bnl0.m105524M(vDraweeView, true);
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                uqb0.f180374G.m127138Y0(this.f23776u, dbc0.f86299K2);
            } else {
                uqb0.f180374G.m127138Y0(this.f23776u, dbc0.f86427O2);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m39606Q() {
        th0.C20312a c20312aM191156o = new th0.C20312a(m39611u()).m191148g(false).m191149h(false).m191159r(m39611u().getResources().getString(R$string.f28588L)).m191156o(new View.OnClickListener() { // from class: l.gie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th0VarArr[0].m191137c();
            }
        });
        c20312aM191156o.m191151j(m39611u().getString(R$string.f28603O)).m191147f(getResources().getString(R$string.f28583K)).m191144c(new View.OnClickListener() { // from class: l.hie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110018a.m39603N(th0VarArr, view);
            }
        });
        th0 th0VarM191142a = c20312aM191156o.m191142a();
        final th0[] th0VarArr = {th0VarM191142a};
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: R */
    public final void m39607R(String str) {
        String str2;
        int i = this.f23753A;
        if (i == 0) {
            str2 = "p_suggest_users_home_view";
        } else if (i == 1) {
            str2 = OMSDialogPositon.p_navigation_view;
        } else {
            str2 = i == 2 ? "p_edit_profile_view" : "";
        }
        i4g0.m138523u("e_complete_card_info", str2, pf60.m172085a("complete_card_info_entrance", str));
    }

    /* JADX INFO: renamed from: S */
    public final void m39608S(Act act) {
        if (this.f23753A == 2) {
            if ((act instanceof EditProfileAct) && ((EditProfileAct) act).m51761c3()) {
                sfj0.m185602i("e_complete_card_info", "p_edit_profile_view");
                return;
            }
            return;
        }
        if (this.f23754B.contains("e_complete_card_info_mv")) {
            return;
        }
        this.f23754B.add("e_complete_card_info_mv");
        i4g0.m138526x("e_complete_card_info", this.f23753A == 0 ? "p_suggest_users_home_view" : OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: T */
    public final void m39609T() {
        if (this.f23754B.contains("e_complete_card_success")) {
            return;
        }
        this.f23754B.add("e_complete_card_success");
        i4g0.m138495D("e_complete_card_success", this.f23753A == 0 ? "p_suggest_users_home_view" : OMSDialogPositon.p_navigation_view, new pf60[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f23781z);
        this.f23754B.clear();
    }

    public void setRenderType(int i) {
        this.f23753A = i;
        if (i == 0) {
            this.f23760e.setTextSize(15.0f);
            bnl0.m105540X(this.f23760e, qa00.m175859d(4.0f));
            this.f23762g.setTextSize(15.0f);
            this.f23765j.setTextSize(16.0f);
            bnl0.m105505C0(this.f23765j, qa00.m175859d(56.0f));
            boolean zM131773y = gra.m131773y();
            VText vText = this.f23767l;
            if (!zM131773y) {
                vText.setTextSize(18.0f);
                return;
            } else {
                vText.setTextSize(16.0f);
                bnl0.m105539W(this.f23767l, qa00.m175859d(44.0f));
                return;
            }
        }
        if (i == 1) {
            this.f23760e.setTextSize(13.0f);
            bnl0.m105540X(this.f23760e, qa00.m175859d(4.0f));
            this.f23762g.setTextSize(13.0f);
            this.f23765j.setTextSize(13.0f);
            bnl0.m105505C0(this.f23765j, qa00.m175859d(48.0f));
            this.f23767l.setTextSize(16.0f);
            return;
        }
        if (i == 2) {
            this.f23760e.setTextSize(15.0f);
            bnl0.m105540X(this.f23760e, qa00.m175859d(4.0f));
            this.f23762g.setTextSize(15.0f);
            this.f23765j.setTextSize(16.0f);
            bnl0.m105505C0(this.f23765j, qa00.m175859d(56.0f));
            boolean zM131773y2 = gra.m131773y();
            VText vText2 = this.f23767l;
            if (zM131773y2) {
                vText2.setTextSize(16.0f);
                bnl0.m105539W(this.f23767l, qa00.m175859d(44.0f));
                bnl0.m105524M(this.f23770o, true);
            } else {
                vText2.setTextSize(18.0f);
                bnl0.m105539W(this.f23767l, 0);
            }
            bnl0.m105524M(this.f23771p, false);
            bnl0.m105524M(this.f23772q, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m39610t(View view) {
        rie0.m181596a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final Act m39611u() {
        return (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: v */
    public boolean m39612v() {
        if (!CoreModule.f18264c.f20381e0.m116593na().isJailed()) {
            return false;
        }
        CoreModule.m30930K().startJailedDialogLikeAct();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m39613w() {
        if (!CoreModule.f18264c.f20381e0.m116593na().isProfileJailed()) {
            return false;
        }
        m39606Q();
        return true;
    }

    /* JADX INFO: renamed from: x */
    public void m39614x() {
        psd0.m173633z(this.f23781z);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m39615y(User user) {
        return user.pictures.size() >= 3 && !TextUtils.isEmpty(user.description);
    }

    /* JADX INFO: renamed from: z */
    public void m39616z(LoopInputType loopInputType) {
        boolean z = loopInputType == LoopInputType.VERIFICATION;
        Intent intentM52689Y1 = ProfileInfoLoopEditAct.m52689Y1(m39611u(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, loopInputType, aw90.m100562F().f73701a);
        intentM52689Y1.putExtra("loop_create_from_page", "edit_profile_complete_card");
        intentM52689Y1.putExtra("loop_edit_patch_flag", z);
        m39611u().startActivityForResult(intentM52689Y1, new C8151d(loopInputType));
    }

    public SeeMyselfRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23753A = 0;
        this.f23754B = new HashSet<>();
        m39591B();
    }

    public SeeMyselfRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23753A = 0;
        this.f23754B = new HashSet<>();
        m39591B();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m39593D(pf60 pf60Var) {
    }
}

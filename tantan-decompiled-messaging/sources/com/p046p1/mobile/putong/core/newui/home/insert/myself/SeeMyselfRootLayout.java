package com.p046p1.mobile.putong.core.newui.home.insert.myself;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7868b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p046p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.EditProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.util.HashSet;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.a1m;
import p149l.bol;
import p149l.c4g0;
import p149l.e30;
import p149l.f6c0;
import p149l.hae0;
import p149l.j2e0;
import p149l.j760;
import p149l.l480;
import p149l.mae0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.pcl0;
import p149l.qib0;
import p149l.rzb0;
import p149l.sfh0;
import p149l.t100;
import p149l.upa;
import p149l.w9j;
import p149l.wn90;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class SeeMyselfRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public int f23011A;

    /* JADX INFO: renamed from: B */
    public HashSet<String> f23012B;

    /* JADX INFO: renamed from: C */
    public bol f23013C;

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f23014a;

    /* JADX INFO: renamed from: b */
    public VFrame f23015b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f23016c;

    /* JADX INFO: renamed from: d */
    public VText f23017d;

    /* JADX INFO: renamed from: e */
    public VText f23018e;

    /* JADX INFO: renamed from: f */
    public VImage f23019f;

    /* JADX INFO: renamed from: g */
    public VText f23020g;

    /* JADX INFO: renamed from: h */
    public VImage f23021h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f23022i;

    /* JADX INFO: renamed from: j */
    public VText f23023j;

    /* JADX INFO: renamed from: k */
    public VImage f23024k;

    /* JADX INFO: renamed from: l */
    public VText f23025l;

    /* JADX INFO: renamed from: m */
    public SimpleDraweeView f23026m;

    /* JADX INFO: renamed from: n */
    public SimpleDraweeView f23027n;

    /* JADX INFO: renamed from: o */
    public VImage f23028o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f23029p;

    /* JADX INFO: renamed from: q */
    public VText f23030q;

    /* JADX INFO: renamed from: r */
    public VFrame f23031r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f23032s;

    /* JADX INFO: renamed from: t */
    public ExpandedImageSwitchView f23033t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f23034u;

    /* JADX INFO: renamed from: v */
    public ConstraintLayout f23035v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f23036w;

    /* JADX INFO: renamed from: x */
    public VImage f23037x;

    /* JADX INFO: renamed from: y */
    public VText_Bold f23038y;

    /* JADX INFO: renamed from: z */
    public c4g0 f23039z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$a */
    public class ViewOnClickListenerC7997a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23040a;

        public ViewOnClickListenerC7997a(User user) {
            this.f23040a = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CertificationUtil.m58151j((Act) SeeMyselfRootLayout.this.f23021h.getContext(), this.f23040a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$b */
    public class ViewOnClickListenerC7998b implements View.OnClickListener {
        public ViewOnClickListenerC7998b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeeMyselfRootLayout.this.m38604R("swipe");
            CoreModule.f17545c.f19663m0.f19346I2.onNext(j760.m140076a(SwipeDirection.RIGHT, null));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$c */
    public class ViewOnClickListenerC7999c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23043a;

        public ViewOnClickListenerC7999c(User user) {
            this.f23043a = user;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0030  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userM94569i2;
            Context context = SeeMyselfRootLayout.this.getContext();
            if (context instanceof Act) {
                Act act = (Act) context;
                Intent intentM50739q2 = ProfileAct.m50739q2(act, this.f23043a.f56011id, "preview_card", false, false, 0);
                if (act instanceof ProfileAct) {
                    pcl0 pcl0VarM50748C2 = ((ProfileAct) act).m50748C2();
                    if (pcl0VarM50748C2 instanceof a1m) {
                        userM94569i2 = ((a1m) pcl0VarM50748C2).m94569i2();
                    } else {
                        userM94569i2 = null;
                    }
                } else {
                    userM94569i2 = null;
                }
                if (userM94569i2 == null) {
                    userM94569i2 = wn90.m204602F().f187269a;
                }
                intentM50739q2.putExtra("preview_user_info", userM94569i2);
                act.startActivity(intentM50739q2);
                act.overridePendingTransition(rzb0.f161653y, rzb0.f161643o);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$d */
    public class C8000d implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoopInputType f23045a;

        public C8000d(LoopInputType loopInputType) {
            this.f23045a = loopInputType;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i2 != -1 || !(SeeMyselfRootLayout.this.m38608u() instanceof EditProfileAct)) {
                return false;
            }
            EditProfileAct editProfileAct = (EditProfileAct) SeeMyselfRootLayout.this.m38608u();
            editProfileAct.m50579b3();
            PutongFrag putongFragM50748C2 = editProfileAct.m50748C2();
            if (!(putongFragM50748C2 instanceof ProfileListFragLocalEditImpl) || this.f23045a != LoopInputType.MY_LIFE_SEE_MYSELF) {
                return false;
            }
            ((ProfileListFragLocalEditImpl) putongFragM50748C2).mo51067J3();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$e */
    public class C8001e implements ExpandedImageSwitchView.InterfaceC7967b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23047a;

        public C8001e(User user) {
            this.f23047a = user;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: c */
        public void mo38335c(boolean z) {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: d */
        public void mo38336d(int i, Media media, boolean z) {
            if (this.f23047a.pictures.size() > i) {
                qib0.f154691G.m102331L0(SeeMyselfRootLayout.this.f23014a, zub.m220207f(this.f23047a.media(i).cover()).formatted());
                bol bolVar = SeeMyselfRootLayout.this.f23013C;
                if (bolVar != null) {
                    bolVar.mo37432a(i, true);
                }
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: e */
        public boolean mo38337e(Media media) {
            return false;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC7967b
        /* JADX INFO: renamed from: f */
        public void mo38338f(int i, boolean z) {
        }
    }

    public SeeMyselfRootLayout(@NonNull Context context) {
        super(context);
        this.f23011A = 0;
        this.f23012B = new HashSet<>();
        m38588B();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m38573f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ j760 m38574g(VerificationCenter verificationCenter) {
        StudentVerificationStatus studentVerificationStatus = StudentVerificationStatus.get("default");
        StudentVerificationStatus studentVerificationStatus2 = StudentVerificationStatus.get("default");
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo)) {
            studentVerificationStatus = verificationCenter.picVerificationInfo.status;
        }
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.idCard)) {
            studentVerificationStatus2 = verificationCenter.idCard.status;
        }
        return j760.m140076a(studentVerificationStatus, studentVerificationStatus2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m38576i(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38583p(View view) {
    }

    private void setImageStyle(boolean z) {
        RoundingParams roundingParamsM112069p = this.f23014a.getHierarchy().m112069p();
        if (roundingParamsM112069p == null) {
            roundingParamsM112069p = new RoundingParams();
        }
        int i = t100.f167264m;
        if (z) {
            i = t100.f167266o;
        }
        int i2 = i;
        float f = i;
        float f2 = i2;
        roundingParamsM112069p.m8264r(f, f, f2, f2);
        this.f23014a.getHierarchy().m112053H(roundingParamsM112069p);
    }

    /* JADX INFO: renamed from: A */
    public final void m38587A(sfh0 sfh0Var, User user) {
        this.f23033t.m38331l();
        this.f23033t.m38329j(sfh0Var, user, new C8001e(user));
    }

    /* JADX INFO: renamed from: B */
    public final void m38588B() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95454Lb, (ViewGroup) this, false);
        addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        m38607t(viewInflate);
        this.f23014a.getHierarchy().m112050E(new l480(t100.f167264m));
        xdl0.m208329E0(this.f23022i, new View.OnClickListener() { // from class: l.u9e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeMyselfRootLayout.m38573f(view);
            }
        });
        xdl0.m208329E0(this.f23016c, new View.OnClickListener() { // from class: l.dae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeMyselfRootLayout.m38583p(view);
            }
        });
        boolean zM194847z = upa.m194847z();
        VImage vImage = this.f23019f;
        if (zM194847z) {
            vImage.setImageResource(x2c0.f190069d7);
            this.f23024k.setImageResource(x2c0.f190407ns);
            this.f23026m.setBackgroundResource(x2c0.f190037c7);
            this.f23027n.setBackgroundResource(x2c0.f190037c7);
            this.f23029p.setBackgroundResource(x2c0.f190668w1);
        } else {
            vImage.setImageResource(x2c0.f189974a8);
            this.f23024k.setImageResource(x2c0.f190133f8);
            this.f23026m.setBackgroundResource(x2c0.f189911Y7);
            this.f23027n.setBackgroundResource(x2c0.f189911Y7);
            this.f23029p.setBackgroundResource(x2c0.f190538s);
            ViewGroup.LayoutParams layoutParams = this.f23021h.getLayoutParams();
            int iM186890d = t100.m186890d(70.0f);
            layoutParams.width = iM186890d;
            layoutParams.height = iM186890d;
            this.f23021h.setLayoutParams(layoutParams);
        }
        if (upa.m194675N3()) {
            this.f23033t.setIndicatorColor(Color.parseColor("#57000000"));
            this.f23033t.setIndicatorColorBorder(Color.parseColor("#57A0A0A0"));
            this.f23033t.setIndicatorSelectedColorBorder(Color.parseColor("#4DA0A0A0"));
            this.f23033t.setupIndicator(this.f23032s);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m38589C(User user) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m38591E(j760 j760Var) {
        User user = (User) j760Var.f116564a;
        S s = j760Var.f116565b;
        m38602P(user, (StudentVerificationStatus) ((j760) s).f116564a, (StudentVerificationStatus) ((j760) s).f116565b, this.f23011A);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m38592F(int i, String str, View view) {
        if (m38609v() || m38610w()) {
            return;
        }
        m38604R(ReminderAction.photo);
        if (i == 2) {
            m38613z(LoopInputType.MY_LIFE_SEE_MYSELF);
            return;
        }
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantan://user_mirror?entry=picture&from=" + str));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m38593G(int i, String str, View view) {
        if (m38609v() || m38610w()) {
            return;
        }
        m38604R(ReminderAction.photo);
        if (i == 2) {
            m38613z(LoopInputType.MY_LIFE_SEE_MYSELF);
            return;
        }
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantan://user_mirror?entry=picture&from=" + str));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m38594H(View view) {
        m38604R("swipe");
        CoreModule.f17545c.f19663m0.f19346I2.onNext(j760.m140076a(SwipeDirection.RIGHT, null));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m38595I(View view) {
        if (m38609v() || m38610w()) {
            return;
        }
        m38604R("complete_profile");
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantan://user_mirror?entry=".concat(TextUtils.isEmpty(CoreModule.f17545c.f19639e0.m169520na().description) ? SocialOperation.GAME_SIGNATURE : "picture")));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m38596J(View view) {
        m38604R("later");
        CoreModule.f17545c.f19663m0.f19346I2.onNext(j760.m140076a(SwipeDirection.LEFT, null));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m38597K(View view) {
        m38604R("avatar_verify");
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantan://verificationcenter"));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m38598L(int i, String str, View view) {
        if (m38609v() || m38610w()) {
            return;
        }
        m38604R("avatar_verify");
        if (i == 2) {
            m38613z(LoopInputType.VERIFICATION);
            return;
        }
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantan://user_mirror?entry=verification&from=" + str));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m38599M(int i, String str, View view) {
        if (m38609v() || m38610w()) {
            return;
        }
        m38604R("self_introduction");
        if (i == 2) {
            m38613z(LoopInputType.SIGNATURE);
            return;
        }
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantan://user_mirror?entry=signature&from=" + str));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m38600N(xh0[] xh0VarArr, View view) {
        m38608u().startActivity(CoreModule.m29932K().startMessagesAct(m38608u(), User.ID_TEAM_ACCOUNT, true, false));
        xh0VarArr[0].m208717c();
    }

    /* JADX INFO: renamed from: O */
    public void m38601O(Act act) {
        m38605S(act);
        mkd0.m154992z(this.f23039z);
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        if (this.f23011A == 2) {
            c22306cM169523o9 = C22306c.just(wn90.m204602F().f187269a);
        }
        this.f23039z = act.duringCreated(C22306c.combineLatest(c22306cM169523o9.distinctUntilChanged().doOnNext(new e30() { // from class: l.eae0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90191a.m38589C((User) obj);
            }
        }), CoreModule.f17545c.f19552B0.m31611j4().map(new w9j() { // from class: l.fae0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return SeeMyselfRootLayout.m38574g((VerificationCenter) obj);
            }
        }).distinctUntilChanged().doOnNext(new e30() { // from class: l.gae0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101665a.m38590D((j760) obj);
            }
        }), new hae0())).subscribe(mkd0.m154956H(new e30() { // from class: l.iae0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112298a.m38591E((j760) obj);
            }
        }, new e30() { // from class: l.jae0
            @Override // p149l.e30
            public final void call(Object obj) {
                SeeMyselfRootLayout.m38576i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m38602P(User user, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2, final int i) {
        boolean z = i == 0 || i == 2;
        setImageStyle(z);
        User userRiskAuditUser = user.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + user.f56011id));
        qib0.f154691G.m102331L0(this.f23014a, zub.m220207f(userRiskAuditUser.m60124fp()).formatted());
        this.f23017d.setText("Hi，" + userRiskAuditUser.name);
        final String str = "home_complete_card";
        if (i != 0) {
            if (i == 1) {
                str = "mytab_complete_card";
            } else if (i == 2) {
                str = "edit_profile_complete_card";
            }
        }
        VText vText = this.f23018e;
        if (i == 2) {
            vText.setText("你的卡片信息有点少\n补全信息可以吸引到更多人的喜欢");
        } else {
            vText.setText("你的卡片信息有点少\n补全一下你的信息吧");
        }
        xdl0.m208329E0(this.f23019f, null);
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.m208344M(this.f23021h, true);
            xdl0.m208344M(this.f23019f, false);
            xdl0.m208344M(this.f23020g, false);
            if (upa.m194847z()) {
                xdl0.m208325C0(this.f23021h, t100.m186890d(z ? 30.0f : 24.0f));
            }
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                boolean zM194847z = upa.m194847z();
                VImage vImage = this.f23021h;
                if (zM194847z) {
                    vImage.setImageResource(z ? x2c0.f189600O6 : x2c0.f189472K2);
                } else {
                    vImage.setImageResource(x2c0.f189441J2);
                }
            } else {
                boolean zM194847z2 = upa.m194847z();
                VImage vImage2 = this.f23021h;
                if (zM194847z2) {
                    vImage2.setImageResource(z ? x2c0.f189817V6 : x2c0.f189596O2);
                } else {
                    vImage2.setImageResource(x2c0.f189565N2);
                }
            }
            if (i == 2) {
                xdl0.m208329E0(this.f23021h, new ViewOnClickListenerC7997a(userRiskAuditUser));
            }
        } else {
            boolean zEquals = TEnum.equals(studentVerificationStatus, "pending");
            VText vText2 = this.f23020g;
            if (zEquals) {
                vText2.setText("认证中");
                xdl0.m208329E0(this.f23019f, new View.OnClickListener() { // from class: l.kae0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f122110a.m38597K(view);
                    }
                });
            } else {
                vText2.setText("头像认证");
                xdl0.m208329E0(this.f23019f, new View.OnClickListener() { // from class: l.lae0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f127189a.m38598L(i, str, view);
                    }
                });
            }
            xdl0.m208344M(this.f23021h, false);
            xdl0.m208344M(this.f23019f, true);
            xdl0.m208344M(this.f23020g, true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(userRiskAuditUser.description);
        VText vText3 = this.f23025l;
        if (zIsEmpty) {
            xdl0.m208344M(vText3, false);
            xdl0.m208344M(this.f23024k, false);
            xdl0.m208344M(this.f23023j, true);
            xdl0.m208329E0(this.f23023j, new View.OnClickListener() { // from class: l.v9e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180633a.m38599M(i, str, view);
                }
            });
        } else {
            xdl0.m208344M(vText3, true);
            xdl0.m208344M(this.f23024k, true);
            xdl0.m208344M(this.f23023j, false);
            this.f23025l.setText(userRiskAuditUser.description);
        }
        xdl0.m208329E0(this.f23026m, null);
        xdl0.m208329E0(this.f23027n, null);
        this.f23026m.setClickable(false);
        this.f23027n.setClickable(false);
        if (userRiskAuditUser.pictures.size() > 1) {
            qib0.f154691G.m102331L0(this.f23026m, userRiskAuditUser.pictures.get(1).cover().profileSmall().formatted());
        } else {
            this.f23026m.setImageResource(0);
            xdl0.m208329E0(this.f23026m, new View.OnClickListener() { // from class: l.w9e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185343a.m38592F(i, str, view);
                }
            });
        }
        if (userRiskAuditUser.pictures.size() > 2) {
            qib0.f154691G.m102331L0(this.f23027n, userRiskAuditUser.pictures.get(2).cover().profileSmall().formatted());
        } else {
            this.f23027n.setImageResource(0);
            xdl0.m208329E0(this.f23027n, new View.OnClickListener() { // from class: l.x9e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191617a.m38593G(i, str, view);
                }
            });
        }
        if (m38612y(userRiskAuditUser)) {
            m38606T();
        }
        if (!upa.m194675N3() || !m38612y(userRiskAuditUser)) {
            xdl0.m208344M(this.f23015b, true);
            xdl0.m208344M(this.f23031r, false);
            VText_Bold vText_Bold = this.f23029p;
            if (i != 0) {
                xdl0.m208344M(vText_Bold, false);
                xdl0.m208344M(this.f23030q, false);
                return;
            }
            xdl0.m208344M(vText_Bold, true);
            xdl0.m208344M(this.f23030q, true);
            boolean zM38612y = m38612y(userRiskAuditUser);
            VText_Bold vText_Bold2 = this.f23029p;
            if (zM38612y) {
                vText_Bold2.setText("继续划卡");
                xdl0.m208329E0(this.f23029p, new View.OnClickListener() { // from class: l.y9e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f196962a.m38594H(view);
                    }
                });
            } else {
                vText_Bold2.setText("立即完善");
                xdl0.m208329E0(this.f23029p, new View.OnClickListener() { // from class: l.z9e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f202289a.m38595I(view);
                    }
                });
            }
            xdl0.m208329E0(this.f23030q, new View.OnClickListener() { // from class: l.aae0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68550a.m38596J(view);
                }
            });
            return;
        }
        xdl0.m208344M(this.f23015b, false);
        xdl0.m208344M(this.f23031r, true);
        m38587A(new sfh0(new CoreSuggested.UserInfo(), userRiskAuditUser), userRiskAuditUser);
        if (this.f23013C == null) {
            this.f23013C = new C7868b(false, getContext(), this.f23036w, null);
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = userRiskAuditUser.f56011id;
        this.f23013C.mo37436e(null, userRiskAuditUser, userInfo, true, null);
        this.f23013C.mo37432a(0, false);
        if (i == 0) {
            xdl0.m208344M(this.f23038y, true);
            xdl0.m208344M(this.f23037x, false);
            xdl0.m208329E0(this.f23038y, new ViewOnClickListenerC7998b());
            xdl0.m208329E0(this.f23035v, new ViewOnClickListenerC7999c(userRiskAuditUser));
            boolean zEquals2 = TEnum.equals(studentVerificationStatus, "verified");
            VDraweeView vDraweeView = this.f23034u;
            if (!zEquals2) {
                xdl0.m208344M(vDraweeView, false);
                return;
            }
            xdl0.m208344M(vDraweeView, true);
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                qib0.f154691G.m102354Y0(this.f23034u, x2c0.f189441J2);
            } else {
                qib0.f154691G.m102354Y0(this.f23034u, x2c0.f189565N2);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m38603Q() {
        xh0.C21150a c21150aM208736o = new xh0.C21150a(m38608u()).m208728g(false).m208729h(false).m208739r(m38608u().getResources().getString(R$string.f27740L)).m208736o(new View.OnClickListener() { // from class: l.bae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh0VarArr[0].m208717c();
            }
        });
        c21150aM208736o.m208731j(m38608u().getString(R$string.f27755O)).m208727f(getResources().getString(R$string.f27735K)).m208724c(new View.OnClickListener() { // from class: l.cae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80026a.m38600N(xh0VarArr, view);
            }
        });
        xh0 xh0VarM208722a = c21150aM208736o.m208722a();
        final xh0[] xh0VarArr = {xh0VarM208722a};
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: R */
    public final void m38604R(String str) {
        String str2;
        int i = this.f23011A;
        if (i == 0) {
            str2 = "p_suggest_users_home_view";
        } else if (i == 1) {
            str2 = OMSDialogPositon.p_navigation_view;
        } else {
            str2 = i == 2 ? "p_edit_profile_view" : "";
        }
        zvf0.m220399u("e_complete_card_info", str2, j760.m140076a("complete_card_info_entrance", str));
    }

    /* JADX INFO: renamed from: S */
    public final void m38605S(Act act) {
        if (this.f23011A == 2) {
            if ((act instanceof EditProfileAct) && ((EditProfileAct) act).m50578a3()) {
                o6j0.m162865i("e_complete_card_info", "p_edit_profile_view");
                return;
            }
            return;
        }
        if (this.f23012B.contains("e_complete_card_info_mv")) {
            return;
        }
        this.f23012B.add("e_complete_card_info_mv");
        zvf0.m220402x("e_complete_card_info", this.f23011A == 0 ? "p_suggest_users_home_view" : OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: T */
    public final void m38606T() {
        if (this.f23012B.contains("e_complete_card_success")) {
            return;
        }
        this.f23012B.add("e_complete_card_success");
        zvf0.m220371D("e_complete_card_success", this.f23011A == 0 ? "p_suggest_users_home_view" : OMSDialogPositon.p_navigation_view, new j760[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f23039z);
        this.f23012B.clear();
    }

    public void setRenderType(int i) {
        this.f23011A = i;
        if (i == 0) {
            this.f23018e.setTextSize(15.0f);
            xdl0.m208360X(this.f23018e, t100.m186890d(4.0f));
            this.f23020g.setTextSize(15.0f);
            this.f23023j.setTextSize(16.0f);
            xdl0.m208325C0(this.f23023j, t100.m186890d(56.0f));
            boolean zM194842y = upa.m194842y();
            VText vText = this.f23025l;
            if (!zM194842y) {
                vText.setTextSize(18.0f);
                return;
            } else {
                vText.setTextSize(16.0f);
                xdl0.m208359W(this.f23025l, t100.m186890d(44.0f));
                return;
            }
        }
        if (i == 1) {
            this.f23018e.setTextSize(13.0f);
            xdl0.m208360X(this.f23018e, t100.m186890d(4.0f));
            this.f23020g.setTextSize(13.0f);
            this.f23023j.setTextSize(13.0f);
            xdl0.m208325C0(this.f23023j, t100.m186890d(48.0f));
            this.f23025l.setTextSize(16.0f);
            return;
        }
        if (i == 2) {
            this.f23018e.setTextSize(15.0f);
            xdl0.m208360X(this.f23018e, t100.m186890d(4.0f));
            this.f23020g.setTextSize(15.0f);
            this.f23023j.setTextSize(16.0f);
            xdl0.m208325C0(this.f23023j, t100.m186890d(56.0f));
            boolean zM194842y2 = upa.m194842y();
            VText vText2 = this.f23025l;
            if (zM194842y2) {
                vText2.setTextSize(16.0f);
                xdl0.m208359W(this.f23025l, t100.m186890d(44.0f));
                xdl0.m208344M(this.f23028o, true);
            } else {
                vText2.setTextSize(18.0f);
                xdl0.m208359W(this.f23025l, 0);
            }
            xdl0.m208344M(this.f23029p, false);
            xdl0.m208344M(this.f23030q, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m38607t(View view) {
        mae0.m153638a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final Act m38608u() {
        return (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: v */
    public boolean m38609v() {
        if (!CoreModule.f17545c.f19639e0.m169520na().isJailed()) {
            return false;
        }
        CoreModule.m29932K().startJailedDialogLikeAct();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m38610w() {
        if (!CoreModule.f17545c.f19639e0.m169520na().isProfileJailed()) {
            return false;
        }
        m38603Q();
        return true;
    }

    /* JADX INFO: renamed from: x */
    public void m38611x() {
        mkd0.m154992z(this.f23039z);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m38612y(User user) {
        return user.pictures.size() >= 3 && !TextUtils.isEmpty(user.description);
    }

    /* JADX INFO: renamed from: z */
    public void m38613z(LoopInputType loopInputType) {
        boolean z = loopInputType == LoopInputType.VERIFICATION;
        Intent intentM51506X1 = ProfileInfoLoopEditAct.m51506X1(m38608u(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, loopInputType, wn90.m204602F().f187269a);
        intentM51506X1.putExtra("loop_create_from_page", "edit_profile_complete_card");
        intentM51506X1.putExtra("loop_edit_patch_flag", z);
        m38608u().startActivityForResult(intentM51506X1, new C8000d(loopInputType));
    }

    public SeeMyselfRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23011A = 0;
        this.f23012B = new HashSet<>();
        m38588B();
    }

    public SeeMyselfRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23011A = 0;
        this.f23012B = new HashSet<>();
        m38588B();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m38590D(j760 j760Var) {
    }
}

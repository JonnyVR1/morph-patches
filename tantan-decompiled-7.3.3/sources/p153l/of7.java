package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.growth.views.GrowthSpamDlgView;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class of7 {

    /* JADX INFO: renamed from: e */
    public static volatile of7 f147043e;

    /* JADX INFO: renamed from: a */
    public C22507a<uxj0> f147044a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public C22507a<uxj0> f147045b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public jl80 f147046c;

    /* JADX INFO: renamed from: d */
    public GrowthSpamDlgView f147047d;

    /* JADX INFO: renamed from: l.of7$a */
    public class C19116a implements C4468a.a {
        public C19116a() {
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            of7.this.m167438z();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.of7$b */
    public class ViewOnClickListenerC19117b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bm5 f147049a;

        public ViewOnClickListenerC19117b(bm5 bm5Var) {
            this.f147049a = bm5Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            of7.this.f147047d.f30421j.setChecked(true);
            this.f147049a.m176562T();
        }
    }

    /* JADX INFO: renamed from: l.of7$c */
    public class DialogInterfaceOnDismissListenerC19118c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f147051a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kcg0 f147052b;

        public DialogInterfaceOnDismissListenerC19118c(l4g0 l4g0Var, kcg0 kcg0Var) {
            this.f147051a = l4g0Var;
            this.f147052b = kcg0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f147051a);
            if (!NullChecker.m82486a(this.f147052b) || this.f147052b.isUnsubscribed()) {
                return;
            }
            this.f147052b.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m167410c(x20 x20Var, String str, View view) {
        if (NullChecker.m82486a(x20Var)) {
            if (TextUtils.equals("live", str)) {
                i4g0.m138520r("e_function_guide_live_accept", "p_function_guide_live");
            } else if (TextUtils.equals("chat", str)) {
                i4g0.m138520r("e_function_guide_quickchat_accept", "p_function_guide_quickchat");
            } else if (TextUtils.equals("feed", str)) {
                i4g0.m138520r("e_function_guide_moment_accept", "p_function_guide_moment");
            }
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m167416i(Notification notification) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m167417j(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            i4g0.m138520r("e_lowmatch_quickchat_accept", "p_lowmatch_quickchat");
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static of7 m167420o() {
        if (f147043e == null) {
            synchronized (of7.class) {
                try {
                    if (f147043e == null) {
                        f147043e = new of7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f147043e;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m167421r() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) {
            return TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "invalid") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "rejected");
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m167422s() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        return NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m167423t() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) {
            return (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m167424u() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        return (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public void m167425A(Act act, String str) {
        if (act == null) {
            return;
        }
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125452I3, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        vText.setTypeface(lyh0.m156283c(3));
        vText.setText(q8g0.m175796b0(String.format("%s 加速曝光生效成功", str), jyb.m147507f0(str), Color.parseColor("#FE7E1D"), lyh0.m156283c(3)));
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(1).m22172w(3000).m22175z(CorePopLevel.GROWTH_NEW_EXPOSURE_USER_GUIDE).m22168s());
    }

    /* JADX INFO: renamed from: B */
    public void m167426B(Act act) {
        if (act == null) {
            return;
        }
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125468J3, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        vText.setTypeface(lyh0.m156283c(3));
        vText.setText(q8g0.m175796b0("你正被优先推荐，快右滑你喜欢的人", jyb.m147507f0("优先推荐"), Color.parseColor("#FE7E1D"), lyh0.m156283c(3)));
        i4g0.m138526x("e_new_user_bonus", "p_suggest_users_home_view");
        SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(act, viewInflate).m22163B(1).m22172w(3000).m22168s();
        simplePushBubbleM22168s.m126745x(CorePopLevel.GROWTH_NEW_USER_GUIDE);
        llb0.m154703c().m154710i(simplePushBubbleM22168s);
    }

    /* JADX INFO: renamed from: C */
    public void m167427C(Act act, String str, String str2, final x20 x20Var) {
        if (act == null) {
            return;
        }
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125484K3, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70415k3);
        VText vText = (VText) viewInflate.findViewById(adc0.f69921Ge);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f69904Fe);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f69839C0);
        vText.setText(str);
        vText.setTypeface(lyh0.m156283c(3));
        uqb0.f180374G.m127120O(vDraweeView, str2, 4, 30);
        vText2.setText(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "他正在等你聊天哦..." : "她正在等你聊天哦...");
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.lf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                of7.m167417j(x20Var, view);
            }
        });
        i4g0.m138526x("e_lowmatch_quickchat_accept", "p_lowmatch_quickchat");
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(2).m22172w(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m22174y(new RelativeLayout.LayoutParams(-1, qa00.m175859d(72.0f))).m22175z(CorePopLevel.GROWTH_PLAN_A).m22168s());
    }

    /* JADX INFO: renamed from: D */
    public void m167428D(Act act, final String str, String str2, String str3, final x20 x20Var) {
        if (act == null) {
            return;
        }
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125500L3, (ViewGroup) null);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70415k3);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70398j3);
        VText vText = (VText) viewInflate.findViewById(adc0.f69921Ge);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f69839C0);
        vText.setTypeface(lyh0.m156283c(3));
        if (TextUtils.equals("live", str)) {
            int i = qa00.f156336w;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.topMargin = qa00.m175859d(19.0f);
            layoutParams.leftMargin = qa00.f156320g;
            layoutParams.rightMargin = qa00.f156326m;
            simpleDraweeView.setLayoutParams(layoutParams);
            uqb0.f180374G.m127115L0(simpleDraweeView, str3);
            bnl0.m105524M(vDraweeView, true);
            vText.setText("她直播时pick了你，在线等你过去聊天~");
            i4g0.m138526x("e_function_guide_live_accept", "p_function_guide_live");
        } else if (TextUtils.equals("chat", str)) {
            simpleDraweeView.setBackground(act.getDrawable(dbc0.f86752Y7));
            vText.setText("有人喜欢你，想跟你聊天，快过去看看");
            i4g0.m138526x("e_function_guide_quickchat_accept", "p_function_guide_quickchat");
        } else if (TextUtils.equals("feed", str)) {
            vText.setText(str2);
            uqb0.f180374G.m127115L0(simpleDraweeView, str3);
            i4g0.m138526x("e_function_guide_moment_accept", "p_function_guide_moment");
        }
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.ef7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                of7.m167410c(x20Var, str, view);
            }
        });
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(2).m22172w(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m22174y(new RelativeLayout.LayoutParams(-1, qa00.m175859d(72.0f))).m22175z(CorePopLevel.GROWTH_PLAN_B).m22168s());
    }

    /* JADX INFO: renamed from: E */
    public void m167429E(final Act act, final boolean z, final boolean z2) {
        String str;
        if (act != null) {
            if (z && CoreModule.f18264c.f20381e0.f89049I3.get().booleanValue()) {
                return;
            }
            if (NullChecker.m82486a(this.f147046c) && this.f147046c.isShowing()) {
                this.f147046c.dismiss();
            }
            if (z) {
                CoreModule.f18264c.f20381e0.f89049I3.put(Boolean.TRUE);
                str = "p_face_verified_jump";
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = z2 ? "p_face_verified_nojump_failed" : "p_face_verified_nojump";
            }
            final String str2 = str;
            jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(act.getLayoutInflater().inflate(kec0.f125564P3, (ViewGroup) null)).m146021P(z).m146020O();
            this.f147046c = jl80VarM146020O;
            boolean z3 = false;
            jl80VarM146020O.setCanceledOnTouchOutside(false);
            GrowthSpamDlgView growthSpamDlgView = (GrowthSpamDlgView) this.f147046c.m145966L().findViewById(adc0.f70054Ob);
            this.f147047d = growthSpamDlgView;
            if (growthSpamDlgView == null || growthSpamDlgView.m47189T()) {
                return;
            }
            this.f147047d.m47190V(z);
            if (!z && z2) {
                z3 = true;
            }
            this.f147047d.m47191W(act, z3);
            bnl0.m105509E0(this.f147047d.f30423l, new View.OnClickListener() { // from class: l.df7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88134a.m167434v(z, str2, z2, act, view);
                }
            });
            bnl0.m105509E0(this.f147047d.f30425n, new View.OnClickListener() { // from class: l.ff7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98746a.m167435w(z, str2, z2, act, view);
                }
            });
            bnl0.m105509E0(this.f147047d.f30424m, new View.OnClickListener() { // from class: l.gf7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f103886a.m167436x(str2, act, view);
                }
            });
            kcg0 kcg0VarSubscribe = act.duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).filter(new qcj() { // from class: l.hf7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((VerificationCenter) obj) != null);
                }
            }).map(new qcj() { // from class: l.if7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo.status;
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.jf7
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120568a.m167437y((StudentVerificationStatus) obj);
                }
            }));
            final bm5 bm5Var = new bm5(act, 1);
            bm5Var.m104999D(new ViewOnClickListenerC19117b(bm5Var));
            fsj0.m127199a(this.f147047d.f30422k, "《真实头像认证协议》", Color.parseColor("#FE7E1D"), new x20() { // from class: l.kf7
                @Override // p153l.x20
                public final void call() {
                    bm5Var.show();
                }
            });
            l4g0 l4g0VarM204399c = w1e.m204399c(str2, Dialog.class.getName());
            w1e.m204402f(l4g0VarM204399c);
            this.f147046c.setOnDismissListener(new DialogInterfaceOnDismissListenerC19118c(l4g0VarM204399c, kcg0VarSubscribe));
            this.f147047d.m47192X(z, z2, str2);
            this.f147046c.show();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m167430m(Act act) {
        GrowthSpamDlgView growthSpamDlgView;
        if ((act == null && (!NullChecker.m82486a(this.f147046c) || !this.f147046c.isShowing())) || (growthSpamDlgView = this.f147047d) == null || growthSpamDlgView.m47189T()) {
            return;
        }
        o1j0.m165651y("已提交认证审核");
        if (d09.m113376m() && m167421r()) {
            this.f147047d.m47191W(act, true);
        } else {
            this.f147046c.dismiss();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m167431n() {
        if (NullChecker.m82486a(this.f147046c)) {
            if (this.f147046c.isShowing()) {
                this.f147046c.dismiss();
            }
            this.f147046c = null;
        }
        this.f147044a.onCompleted();
        this.f147045b.onCompleted();
        f147043e = null;
    }

    /* JADX INFO: renamed from: p */
    public C22421c<uxj0> m167432p() {
        return this.f147045b.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public C22421c<uxj0> m167433q() {
        return this.f147044a.asObservable();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m167434v(boolean z, String str, boolean z2, Act act, View view) {
        if (!this.f147047d.f30421j.isChecked() && this.f147047d.f30420i.getVisibility() == 0) {
            o1j0.m165651y("请确认并勾选真实头像认证协议");
            i4g0.m138523u(z ? "e_face_verified_jump_confirm" : "e_face_verified_nojump_confirm", str, jyb.m147494Y("start_verification_ornot", Boolean.FALSE));
            return;
        }
        if (z) {
            i4g0.m138523u("e_face_verified_jump_confirm", str, jyb.m147494Y("start_verification_ornot", Boolean.TRUE));
        } else if (z2) {
            i4g0.m138523u("e_face_verified_nojump_failed_reverified", str, jyb.m147494Y("start_verification_ornot", Boolean.TRUE));
        } else {
            i4g0.m138523u("e_face_verified_nojump_confirm", str, jyb.m147494Y("start_verification_ornot", Boolean.TRUE));
        }
        hxf.m137587h(act, "fromSpamDlg");
        if (z) {
            this.f147046c.dismiss();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m167435w(boolean z, String str, boolean z2, final Act act, View view) {
        if (z) {
            i4g0.m138520r("e_face_verified_jump_cancel", str);
            this.f147046c.dismiss();
        } else {
            i4g0.m138520r(z2 ? "e_face_verified_nojump_failed_signout" : "e_face_verified_nojump_signout", str);
            this.f147046c.dismiss();
            uqb0.m197259Z0(true, false).materialize().first().subscribe(psd0.m173597H(new y20() { // from class: l.mf7
                @Override // p153l.y20
                public final void call(Object obj) {
                    of7.m167416i((Notification) obj);
                }
            }, new y20() { // from class: l.nf7
                @Override // p153l.y20
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m167436x(String str, Act act, View view) {
        i4g0.m138520r("e_face_verified_nojump_failed_changeavatar", str);
        this.f147046c.dismiss();
        act.startActivityForResult(ProfileAct.m51922q2(act, CoreModule.m30929H().userId(), "from_profile_frag_tips_up_pic", false, true), new C19116a());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m167437y(StudentVerificationStatus studentVerificationStatus) {
        if ((TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "verified")) && NullChecker.m82486a(this.f147046c) && this.f147046c.isShowing()) {
            this.f147046c.dismiss();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m167438z() {
        this.f147045b.m137019l(uxj0.f181467a);
    }
}

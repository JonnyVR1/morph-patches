package p003l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p000p1.mobile.putong.core.p001ui.growth.views.GrowthSpamDlgView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.cjj0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.eqh0;
import l.f6c0;
import l.hdb0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.qib0;
import l.roj0;
import l.t100;
import l.tvf;
import l.u4c0;
import l.vwb;
import l.vy8;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.yk5;
import l.zvf0;
import rx.Notification;
import rx.c;
import rx.subjects.a;
import v.VButton;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ke7 {

    /* JADX INFO: renamed from: e */
    public static volatile ke7 f5641e;

    /* JADX INFO: renamed from: a */
    public a<roj0> f5642a = a.b();

    /* JADX INFO: renamed from: b */
    public a<roj0> f5643b = a.b();

    /* JADX INFO: renamed from: c */
    public dd80 f5644c;

    /* JADX INFO: renamed from: d */
    public GrowthSpamDlgView f5645d;

    /* JADX INFO: renamed from: l.ke7$a */
    public class C3359a implements com.p1.mobile.android.app.a.a {
        public C3359a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m7586a(int i, int i2, Intent intent) {
            ke7.this.m7585z();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ke7$b */
    public class ViewOnClickListenerC3360b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yk5 f5647a;

        public ViewOnClickListenerC3360b(yk5 yk5Var) {
            this.f5647a = yk5Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ke7.this.f5645d.f1967j.setChecked(true);
            this.f5647a.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.ke7$c */
    public class DialogInterfaceOnDismissListenerC3361c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f5649a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c4g0 f5650b;

        public DialogInterfaceOnDismissListenerC3361c(cwf0 cwf0Var, c4g0 c4g0Var) {
            this.f5649a = cwf0Var;
            this.f5650b = c4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f5649a);
            if (!NullChecker.a(this.f5650b) || this.f5650b.isUnsubscribed()) {
                return;
            }
            this.f5650b.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7557c(d30 d30Var, String str, View view) {
        if (NullChecker.a(d30Var)) {
            if (TextUtils.equals("live", str)) {
                zvf0.r("e_function_guide_live_accept", "p_function_guide_live");
            } else if (TextUtils.equals(CoreGiftPanelName.chat, str)) {
                zvf0.r("e_function_guide_quickchat_accept", "p_function_guide_quickchat");
            } else if (TextUtils.equals("feed", str)) {
                zvf0.r("e_function_guide_moment_accept", "p_function_guide_moment");
            }
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m7563i(Notification notification) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m7564j(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            zvf0.r("e_lowmatch_quickchat_accept", "p_lowmatch_quickchat");
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static ke7 m7567o() {
        if (f5641e == null) {
            synchronized (ke7.class) {
                try {
                    if (f5641e == null) {
                        f5641e = new ke7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5641e;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m7568r() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.picVerificationInfo)) {
            return TEnum.equals(verificationCenterK4.picVerificationInfo.status, Conversation.OTHER_STATUS_INVALID) || TEnum.equals(verificationCenterK4.picVerificationInfo.status, "rejected");
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7569s() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        return NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.picVerificationInfo) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m7570t() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.picVerificationInfo)) {
            return (TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m7571u() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        return (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.picVerificationInfo) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public void m7572A(Act act, String str) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.a(act).inflate(f6c0.I3, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        vTextFindViewById.setTypeface(eqh0.c(3));
        vTextFindViewById.setText(i0g0.b0(String.format("%s 加速曝光生效成功", str), vwb.f0(new String[]{str}), Color.parseColor("#FE7E1D"), eqh0.c(3)));
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(1).w(3000).z(CorePopLevel.GROWTH_NEW_EXPOSURE_USER_GUIDE).s());
    }

    /* JADX INFO: renamed from: B */
    public void m7573B(Act act) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.a(act).inflate(f6c0.J3, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        vTextFindViewById.setTypeface(eqh0.c(3));
        vTextFindViewById.setText(i0g0.b0("你正被优先推荐，快右滑你喜欢的人", vwb.f0(new String[]{"优先推荐"}), Color.parseColor("#FE7E1D"), eqh0.c(3)));
        zvf0.x("e_new_user_bonus", "p_suggest_users_home_view");
        SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(act, viewInflate).B(1).w(3000).s();
        simplePushBubbleS.x(CorePopLevel.GROWTH_NEW_USER_GUIDE);
        hdb0.c().i(simplePushBubbleS);
    }

    /* JADX INFO: renamed from: C */
    public void m7574C(Act act, String str, String str2, final d30 d30Var) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.a(act).inflate(f6c0.K3, (ViewGroup) null);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.i3);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.De);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Ce);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.C0);
        vTextFindViewById.setText(str);
        vTextFindViewById.setTypeface(eqh0.c(3));
        qib0.G.O(vDraweeViewFindViewById, str2, 4, 30);
        vTextFindViewById2.setText(CoreModule.c.e0.p9().isFemale() ? "他正在等你聊天哦..." : "她正在等你聊天哦...");
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.he7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ke7.m7564j(d30Var, view);
            }
        });
        zvf0.x("e_lowmatch_quickchat_accept", "p_lowmatch_quickchat");
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(2).w(6000).y(new RelativeLayout.LayoutParams(-1, t100.d(72.0f))).z(CorePopLevel.GROWTH_PLAN_A).s());
    }

    /* JADX INFO: renamed from: D */
    public void m7575D(Act act, final String str, String str2, String str3, final d30 d30Var) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.a(act).inflate(f6c0.L3, (ViewGroup) null);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.i3);
        VDraweeView vDraweeViewFindViewById2 = viewInflate.findViewById(u4c0.h3);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.De);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.C0);
        vTextFindViewById.setTypeface(eqh0.c(3));
        if (TextUtils.equals("live", str)) {
            int i = t100.w;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.topMargin = t100.d(19.0f);
            layoutParams.leftMargin = t100.g;
            layoutParams.rightMargin = t100.m;
            vDraweeViewFindViewById.setLayoutParams(layoutParams);
            qib0.G.L0(vDraweeViewFindViewById, str3);
            xdl0.M(vDraweeViewFindViewById2, true);
            vTextFindViewById.setText("她直播时pick了你，在线等你过去聊天~");
            zvf0.x("e_function_guide_live_accept", "p_function_guide_live");
        } else if (TextUtils.equals(CoreGiftPanelName.chat, str)) {
            vDraweeViewFindViewById.setBackground(act.getDrawable(x2c0.X7));
            vTextFindViewById.setText("有人喜欢你，想跟你聊天，快过去看看");
            zvf0.x("e_function_guide_quickchat_accept", "p_function_guide_quickchat");
        } else if (TextUtils.equals("feed", str)) {
            vTextFindViewById.setText(str2);
            qib0.G.L0(vDraweeViewFindViewById, str3);
            zvf0.x("e_function_guide_moment_accept", "p_function_guide_moment");
        }
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.ae7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ke7.m7557c(d30Var, str, view);
            }
        });
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(2).w(6000).y(new RelativeLayout.LayoutParams(-1, t100.d(72.0f))).z(CorePopLevel.GROWTH_PLAN_B).s());
    }

    /* JADX INFO: renamed from: E */
    public void m7576E(final Act act, final boolean z, final boolean z2) {
        String str;
        if (act != null) {
            if (z && ((Boolean) CoreModule.c.e0.I3.get()).booleanValue()) {
                return;
            }
            if (NullChecker.a(this.f5644c) && this.f5644c.isShowing()) {
                this.f5644c.dismiss();
            }
            if (z) {
                CoreModule.c.e0.I3.put(Boolean.TRUE);
                str = "p_face_verified_jump";
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = z2 ? "p_face_verified_nojump_failed" : "p_face_verified_nojump";
            }
            final String str2 = str;
            dd80 dd80VarO = new dd80.a(act).R(act.getLayoutInflater().inflate(f6c0.P3, (ViewGroup) null)).P(z).O();
            this.f5644c = dd80VarO;
            boolean z3 = false;
            dd80VarO.setCanceledOnTouchOutside(false);
            GrowthSpamDlgView growthSpamDlgView = (GrowthSpamDlgView) this.f5644c.L().findViewById(u4c0.Mb);
            this.f5645d = growthSpamDlgView;
            if (growthSpamDlgView == null || growthSpamDlgView.m3361T()) {
                return;
            }
            this.f5645d.m3362V(z);
            if (!z && z2) {
                z3 = true;
            }
            this.f5645d.m3363W(act, z3);
            xdl0.E0(this.f5645d.f1969l, new View.OnClickListener() { // from class: l.zd7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9222a.m7581v(z, str2, z2, act, view);
                }
            });
            xdl0.E0(this.f5645d.f1971n, new View.OnClickListener() { // from class: l.be7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3367a.m7582w(z, str2, z2, act, view);
                }
            });
            xdl0.E0(this.f5645d.f1970m, new View.OnClickListener() { // from class: l.ce7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4023a.m7583x(str2, act, view);
                }
            });
            c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).filter(new w9j() { // from class: l.de7
                public final Object call(Object obj) {
                    return Boolean.valueOf(((VerificationCenter) obj) != null);
                }
            }).map(new w9j() { // from class: l.ee7
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo.status;
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.fe7
                public final void call(Object obj) {
                    this.f4435a.m7584y((StudentVerificationStatus) obj);
                }
            }));
            final yk5 yk5Var = new yk5(act, 1);
            yk5Var.D(new ViewOnClickListenerC3360b(yk5Var));
            cjj0.a(this.f5645d.f1968k, "《真实头像认证协议》", Color.parseColor("#FE7E1D"), new d30() { // from class: l.ge7
                public final void call() {
                    yk5Var.show();
                }
            });
            cwf0 cwf0VarC = i0e.c(str2, Dialog.class.getName());
            i0e.f(cwf0VarC);
            this.f5644c.setOnDismissListener(new DialogInterfaceOnDismissListenerC3361c(cwf0VarC, c4g0VarSubscribe));
            this.f5645d.m3364X(z, z2, str2);
            this.f5644c.show();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m7577m(Act act) {
        GrowthSpamDlgView growthSpamDlgView;
        if ((act == null && (!NullChecker.a(this.f5644c) || !this.f5644c.isShowing())) || (growthSpamDlgView = this.f5645d) == null || growthSpamDlgView.m3361T()) {
            return;
        }
        lsi0.y("已提交认证审核");
        if (vy8.m() && m7568r()) {
            this.f5645d.m3363W(act, true);
        } else {
            this.f5644c.dismiss();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m7578n() {
        if (NullChecker.a(this.f5644c)) {
            if (this.f5644c.isShowing()) {
                this.f5644c.dismiss();
            }
            this.f5644c = null;
        }
        this.f5642a.onCompleted();
        this.f5643b.onCompleted();
        f5641e = null;
    }

    /* JADX INFO: renamed from: p */
    public c<roj0> m7579p() {
        return this.f5643b.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public c<roj0> m7580q() {
        return this.f5642a.asObservable();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7581v(boolean z, String str, boolean z2, Act act, View view) {
        if (!this.f5645d.f1967j.isChecked() && this.f5645d.f1966i.getVisibility() == 0) {
            lsi0.y("请确认并勾选真实头像认证协议");
            zvf0.u(z ? "e_face_verified_jump_confirm" : "e_face_verified_nojump_confirm", str, new j760[]{vwb.Y("start_verification_ornot", Boolean.FALSE)});
            return;
        }
        if (z) {
            zvf0.u("e_face_verified_jump_confirm", str, new j760[]{vwb.Y("start_verification_ornot", Boolean.TRUE)});
        } else if (z2) {
            zvf0.u("e_face_verified_nojump_failed_reverified", str, new j760[]{vwb.Y("start_verification_ornot", Boolean.TRUE)});
        } else {
            zvf0.u("e_face_verified_nojump_confirm", str, new j760[]{vwb.Y("start_verification_ornot", Boolean.TRUE)});
        }
        tvf.h(act, "fromSpamDlg");
        if (z) {
            this.f5644c.dismiss();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7582w(boolean z, String str, boolean z2, final Act act, View view) {
        if (z) {
            zvf0.r("e_face_verified_jump_cancel", str);
            this.f5644c.dismiss();
        } else {
            zvf0.r(z2 ? "e_face_verified_nojump_failed_signout" : "e_face_verified_nojump_signout", str);
            this.f5644c.dismiss();
            qib0.Z0(true, false).materialize().first().subscribe(mkd0.H(new e30() { // from class: l.ie7
                public final void call(Object obj) {
                    ke7.m7563i((Notification) obj);
                }
            }, new e30() { // from class: l.je7
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7583x(String str, Act act, View view) {
        zvf0.r("e_face_verified_nojump_failed_changeavatar", str);
        this.f5644c.dismiss();
        act.startActivityForResult(ProfileAct.p2(act, CoreModule.H().userId(), "from_profile_frag_tips_up_pic", false, true), new C3359a());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7584y(StudentVerificationStatus studentVerificationStatus) {
        if ((TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "verified")) && NullChecker.a(this.f5644c) && this.f5644c.isShowing()) {
            this.f5644c.dismiss();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m7585z() {
        this.f5643b.onNext(roj0.a);
    }
}

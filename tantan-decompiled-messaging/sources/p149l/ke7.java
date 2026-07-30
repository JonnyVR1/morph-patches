package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.growth.views.GrowthSpamDlgView;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ke7 {

    /* JADX INFO: renamed from: e */
    public static volatile ke7 f122670e;

    /* JADX INFO: renamed from: a */
    public C22392a<roj0> f122671a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public C22392a<roj0> f122672b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public dd80 f122673c;

    /* JADX INFO: renamed from: d */
    public GrowthSpamDlgView f122674d;

    /* JADX INFO: renamed from: l.ke7$a */
    public class C17992a implements C4317a.a {
        public C17992a() {
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            ke7.this.m145750z();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ke7$b */
    public class ViewOnClickListenerC17993b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yk5 f122676a;

        public ViewOnClickListenerC17993b(yk5 yk5Var) {
            this.f122676a = yk5Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ke7.this.f122674d.f29573j.setChecked(true);
            this.f122676a.m101651T();
        }
    }

    /* JADX INFO: renamed from: l.ke7$c */
    public class DialogInterfaceOnDismissListenerC17994c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f122678a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c4g0 f122679b;

        public DialogInterfaceOnDismissListenerC17994c(cwf0 cwf0Var, c4g0 c4g0Var) {
            this.f122678a = cwf0Var;
            this.f122679b = c4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f122678a);
            if (!NullChecker.m81303a(this.f122679b) || this.f122679b.isUnsubscribed()) {
                return;
            }
            this.f122679b.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m145722c(d30 d30Var, String str, View view) {
        if (NullChecker.m81303a(d30Var)) {
            if (TextUtils.equals("live", str)) {
                zvf0.m220396r("e_function_guide_live_accept", "p_function_guide_live");
            } else if (TextUtils.equals("chat", str)) {
                zvf0.m220396r("e_function_guide_quickchat_accept", "p_function_guide_quickchat");
            } else if (TextUtils.equals("feed", str)) {
                zvf0.m220396r("e_function_guide_moment_accept", "p_function_guide_moment");
            }
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m145728i(Notification notification) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m145729j(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            zvf0.m220396r("e_lowmatch_quickchat_accept", "p_lowmatch_quickchat");
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static ke7 m145732o() {
        if (f122670e == null) {
            synchronized (ke7.class) {
                try {
                    if (f122670e == null) {
                        f122670e = new ke7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f122670e;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m145733r() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) {
            return TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "invalid") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "rejected");
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m145734s() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        return NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m145735t() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) {
            return (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m145736u() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        return (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public void m145737A(Act act, String str) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95398I3, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        vText.setTypeface(eqh0.m117752c(3));
        vText.setText(i0g0.m133861b0(String.format("%s 加速曝光生效成功", str), vwb.m200324f0(str), Color.parseColor("#FE7E1D"), eqh0.m117752c(3)));
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(1).m21173w(3000).m21176z(CorePopLevel.GROWTH_NEW_EXPOSURE_USER_GUIDE).m21169s());
    }

    /* JADX INFO: renamed from: B */
    public void m145738B(Act act) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95414J3, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        vText.setTypeface(eqh0.m117752c(3));
        vText.setText(i0g0.m133861b0("你正被优先推荐，快右滑你喜欢的人", vwb.m200324f0("优先推荐"), Color.parseColor("#FE7E1D"), eqh0.m117752c(3)));
        zvf0.m220402x("e_new_user_bonus", "p_suggest_users_home_view");
        SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(act, viewInflate).m21164B(1).m21173w(3000).m21169s();
        simplePushBubbleM21169s.m96808x(CorePopLevel.GROWTH_NEW_USER_GUIDE);
        hdb0.m130575c().m130582i(simplePushBubbleM21169s);
    }

    /* JADX INFO: renamed from: C */
    public void m145739C(Act act, String str, String str2, final d30 d30Var) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95430K3, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174291i3);
        VText vText = (VText) viewInflate.findViewById(u4c0.f173782De);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f173765Ce);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f173751C0);
        vText.setText(str);
        vText.setTypeface(eqh0.m117752c(3));
        qib0.f154691G.m102336O(vDraweeView, str2, 4, 30);
        vText2.setText(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "他正在等你聊天哦..." : "她正在等你聊天哦...");
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.he7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ke7.m145729j(d30Var, view);
            }
        });
        zvf0.m220402x("e_lowmatch_quickchat_accept", "p_lowmatch_quickchat");
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(2).m21173w(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m21175y(new RelativeLayout.LayoutParams(-1, t100.m186890d(72.0f))).m21176z(CorePopLevel.GROWTH_PLAN_A).m21169s());
    }

    /* JADX INFO: renamed from: D */
    public void m145740D(Act act, final String str, String str2, String str3, final d30 d30Var) {
        if (act == null) {
            return;
        }
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95446L3, (ViewGroup) null);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174291i3);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174274h3);
        VText vText = (VText) viewInflate.findViewById(u4c0.f173782De);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f173751C0);
        vText.setTypeface(eqh0.m117752c(3));
        if (TextUtils.equals("live", str)) {
            int i = t100.f167274w;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.topMargin = t100.m186890d(19.0f);
            layoutParams.leftMargin = t100.f167258g;
            layoutParams.rightMargin = t100.f167264m;
            simpleDraweeView.setLayoutParams(layoutParams);
            qib0.f154691G.m102331L0(simpleDraweeView, str3);
            xdl0.m208344M(vDraweeView, true);
            vText.setText("她直播时pick了你，在线等你过去聊天~");
            zvf0.m220402x("e_function_guide_live_accept", "p_function_guide_live");
        } else if (TextUtils.equals("chat", str)) {
            simpleDraweeView.setBackground(act.getDrawable(x2c0.f189880X7));
            vText.setText("有人喜欢你，想跟你聊天，快过去看看");
            zvf0.m220402x("e_function_guide_quickchat_accept", "p_function_guide_quickchat");
        } else if (TextUtils.equals("feed", str)) {
            vText.setText(str2);
            qib0.f154691G.m102331L0(simpleDraweeView, str3);
            zvf0.m220402x("e_function_guide_moment_accept", "p_function_guide_moment");
        }
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.ae7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ke7.m145722c(d30Var, str, view);
            }
        });
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(2).m21173w(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m21175y(new RelativeLayout.LayoutParams(-1, t100.m186890d(72.0f))).m21176z(CorePopLevel.GROWTH_PLAN_B).m21169s());
    }

    /* JADX INFO: renamed from: E */
    public void m145741E(final Act act, final boolean z, final boolean z2) {
        String str;
        if (act != null) {
            if (z && CoreModule.f17545c.f19639e0.f149192I3.get().booleanValue()) {
                return;
            }
            if (NullChecker.m81303a(this.f122673c) && this.f122673c.isShowing()) {
                this.f122673c.dismiss();
            }
            if (z) {
                CoreModule.f17545c.f19639e0.f149192I3.put(Boolean.TRUE);
                str = "p_face_verified_jump";
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = z2 ? "p_face_verified_nojump_failed" : "p_face_verified_nojump";
            }
            final String str2 = str;
            dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(act.getLayoutInflater().inflate(f6c0.f95510P3, (ViewGroup) null)).m110961P(z).m110960O();
            this.f122673c = dd80VarM110960O;
            boolean z3 = false;
            dd80VarM110960O.setCanceledOnTouchOutside(false);
            GrowthSpamDlgView growthSpamDlgView = (GrowthSpamDlgView) this.f122673c.m110906L().findViewById(u4c0.f173932Mb);
            this.f122674d = growthSpamDlgView;
            if (growthSpamDlgView == null || growthSpamDlgView.m46006T()) {
                return;
            }
            this.f122674d.m46007V(z);
            if (!z && z2) {
                z3 = true;
            }
            this.f122674d.m46008W(act, z3);
            xdl0.m208329E0(this.f122674d.f29575l, new View.OnClickListener() { // from class: l.zd7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202629a.m145746v(z, str2, z2, act, view);
                }
            });
            xdl0.m208329E0(this.f122674d.f29577n, new View.OnClickListener() { // from class: l.be7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f75120a.m145747w(z, str2, z2, act, view);
                }
            });
            xdl0.m208329E0(this.f122674d.f29576m, new View.OnClickListener() { // from class: l.ce7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80436a.m145748x(str2, act, view);
                }
            });
            c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).filter(new w9j() { // from class: l.de7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((VerificationCenter) obj) != null);
                }
            }).map(new w9j() { // from class: l.ee7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo.status;
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.fe7
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97101a.m145749y((StudentVerificationStatus) obj);
                }
            }));
            final yk5 yk5Var = new yk5(act, 1);
            yk5Var.m215118D(new ViewOnClickListenerC17993b(yk5Var));
            cjj0.m107173a(this.f122674d.f29574k, "《真实头像认证协议》", Color.parseColor("#FE7E1D"), new d30() { // from class: l.ge7
                @Override // p149l.d30
                public final void call() {
                    yk5Var.show();
                }
            });
            cwf0 cwf0VarM133794c = i0e.m133794c(str2, Dialog.class.getName());
            i0e.m133797f(cwf0VarM133794c);
            this.f122673c.setOnDismissListener(new DialogInterfaceOnDismissListenerC17994c(cwf0VarM133794c, c4g0VarSubscribe));
            this.f122674d.m46009X(z, z2, str2);
            this.f122673c.show();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m145742m(Act act) {
        GrowthSpamDlgView growthSpamDlgView;
        if ((act == null && (!NullChecker.m81303a(this.f122673c) || !this.f122673c.isShowing())) || (growthSpamDlgView = this.f122674d) == null || growthSpamDlgView.m46006T()) {
            return;
        }
        lsi0.m151595y("已提交认证审核");
        if (vy8.m200615m() && m145733r()) {
            this.f122674d.m46008W(act, true);
        } else {
            this.f122673c.dismiss();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m145743n() {
        if (NullChecker.m81303a(this.f122673c)) {
            if (this.f122673c.isShowing()) {
                this.f122673c.dismiss();
            }
            this.f122673c = null;
        }
        this.f122671a.onCompleted();
        this.f122672b.onCompleted();
        f122670e = null;
    }

    /* JADX INFO: renamed from: p */
    public C22306c<roj0> m145744p() {
        return this.f122672b.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public C22306c<roj0> m145745q() {
        return this.f122671a.asObservable();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m145746v(boolean z, String str, boolean z2, Act act, View view) {
        if (!this.f122674d.f29573j.isChecked() && this.f122674d.f29572i.getVisibility() == 0) {
            lsi0.m151595y("请确认并勾选真实头像认证协议");
            zvf0.m220399u(z ? "e_face_verified_jump_confirm" : "e_face_verified_nojump_confirm", str, vwb.m200311Y("start_verification_ornot", Boolean.FALSE));
            return;
        }
        if (z) {
            zvf0.m220399u("e_face_verified_jump_confirm", str, vwb.m200311Y("start_verification_ornot", Boolean.TRUE));
        } else if (z2) {
            zvf0.m220399u("e_face_verified_nojump_failed_reverified", str, vwb.m200311Y("start_verification_ornot", Boolean.TRUE));
        } else {
            zvf0.m220399u("e_face_verified_nojump_confirm", str, vwb.m200311Y("start_verification_ornot", Boolean.TRUE));
        }
        tvf.m190730h(act, "fromSpamDlg");
        if (z) {
            this.f122673c.dismiss();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m145747w(boolean z, String str, boolean z2, final Act act, View view) {
        if (z) {
            zvf0.m220396r("e_face_verified_jump_cancel", str);
            this.f122673c.dismiss();
        } else {
            zvf0.m220396r(z2 ? "e_face_verified_nojump_failed_signout" : "e_face_verified_nojump_signout", str);
            this.f122673c.dismiss();
            qib0.m174805Z0(true, false).materialize().first().subscribe(mkd0.m154956H(new e30() { // from class: l.ie7
                @Override // p149l.e30
                public final void call(Object obj) {
                    ke7.m145728i((Notification) obj);
                }
            }, new e30() { // from class: l.je7
                @Override // p149l.e30
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m145748x(String str, Act act, View view) {
        zvf0.m220396r("e_face_verified_nojump_failed_changeavatar", str);
        this.f122673c.dismiss();
        act.startActivityForResult(ProfileAct.m50738p2(act, CoreModule.m29931H().userId(), "from_profile_frag_tips_up_pic", false, true), new C17992a());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m145749y(StudentVerificationStatus studentVerificationStatus) {
        if ((TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "verified")) && NullChecker.m81303a(this.f122673c) && this.f122673c.isShowing()) {
            this.f122673c.dismiss();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m145750z() {
        this.f122672b.m132487l(roj0.f160388a);
    }
}

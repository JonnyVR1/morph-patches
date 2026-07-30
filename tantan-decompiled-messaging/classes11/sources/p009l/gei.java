package p009l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.VipSetting;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.lang.ref.WeakReference;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.j760;
import l.l3f;
import l.lsi0;
import l.mkd0;
import l.qhy;
import l.roj0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xma;
import l.yaf0;
import l.zvf0;
import rx.c;
import v.VSwitchButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gei {

    /* JADX INFO: renamed from: j */
    public static WeakReference<gei> f13468j;

    /* JADX INFO: renamed from: a */
    public qhy f13469a;

    /* JADX INFO: renamed from: b */
    public C0920a f13470b;

    /* JADX INFO: renamed from: c */
    public VSwitchButton f13471c;

    /* JADX INFO: renamed from: d */
    public VSwitchButton f13472d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f13473e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f13474f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f13475g;

    /* JADX INFO: renamed from: h */
    public VSwitchButton f13476h;

    /* JADX INFO: renamed from: i */
    public boolean f13477i;

    /* JADX INFO: renamed from: l.gei$a */
    public static class C0920a {

        /* JADX INFO: renamed from: a */
        public boolean f13478a;

        /* JADX INFO: renamed from: b */
        public boolean f13479b;

        /* JADX INFO: renamed from: c */
        public boolean f13480c;

        /* JADX INFO: renamed from: d */
        public boolean f13481d;

        /* JADX INFO: renamed from: e */
        public boolean f13482e;

        /* JADX INFO: renamed from: f */
        public boolean f13483f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m14930a(roj0 roj0Var, roj0 roj0Var2) {
        if (roj0Var == null && roj0Var2 == null) {
            return null;
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ roj0 m14935f(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ VipSetting m14937h(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ PrivacyMembershipSetting m14941l(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C0920a m14944o(PrivacyMembershipSetting privacyMembershipSetting, VipSetting vipSetting) {
        C0920a c0920a = new C0920a();
        if (privacyMembershipSetting != null) {
            c0920a.f13479b = privacyMembershipSetting.hideLocation.booleanValue();
            c0920a.f13478a = privacyMembershipSetting.frozenActivity.booleanValue();
        } else {
            c0920a.f13479b = false;
            c0920a.f13478a = false;
        }
        if (vipSetting != null) {
            c0920a.f13480c = vipSetting.suggestReal;
            c0920a.f13481d = vipSetting.suggestSecure;
            c0920a.f13482e = vipSetting.blockAds;
            c0920a.f13483f = vipSetting.blockSensitiveWord;
            return c0920a;
        }
        c0920a.f13480c = false;
        c0920a.f13481d = false;
        c0920a.f13482e = false;
        c0920a.f13483f = false;
        return c0920a;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ roj0 m14946q(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static WeakReference<gei> m14948u() {
        WeakReference<gei> weakReference = f13468j;
        if (weakReference == null || weakReference.get() == null) {
            synchronized (gei.class) {
                f13468j = new WeakReference<>(new gei());
            }
        }
        return f13468j;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m14949A(VipSetting vipSetting) {
        qhy qhyVar = this.f13469a;
        if (qhyVar == null || !qhyVar.d() || vipSetting == null) {
            return;
        }
        C0920a c0920a = this.f13470b;
        c0920a.f13480c = vipSetting.suggestReal;
        c0920a.f13481d = vipSetting.suggestSecure;
        c0920a.f13482e = vipSetting.blockAds;
        c0920a.f13483f = vipSetting.blockSensitiveWord;
        m14956H(c0920a);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m14950B(Act act, View view) {
        m14959K(act);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m14951C(c4g0 c4g0Var, DialogInterface dialogInterface) {
        mkd0.z(c4g0Var);
        if (this.f13477i) {
            return;
        }
        zvf0.u("e_femalevip_close", "p_femalevip_page", new j760[]{vwb.Y("is_femalevip", Boolean.valueOf(xma.B3()))});
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m14952D(View view) {
        qhy qhyVar = this.f13469a;
        if (qhyVar != null) {
            qhyVar.b();
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m14953E(Act act, View view) {
        VSwitchButton vSwitchButton = this.f13471c;
        if (!m14960s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.privacy_membership, "e_femalevip_activetime") && this.f13471c.isChecked()) {
            lsi0.y("开启后，你的活跃时间将冻结在此刻，当你发布动态或评论点赞后，活跃时间将被更新，点击右上角确定按钮后生效");
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m14954F(Act act, View view) {
        VSwitchButton vSwitchButton = this.f13472d;
        if (!m14960s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.privacy_membership, "e_femalevip_location") && this.f13472d.isChecked()) {
            lsi0.y("已开启隐藏距离位置，其他用户将看不到你的距离和你的地理位置，点击右上角确定按钮后生效");
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m14955G(Act act, boolean z, roj0 roj0Var) {
        act.progressDismiss();
        if (roj0Var == null) {
            lsi0.w(R.string.p4);
            return;
        }
        lsi0.y("已保存");
        if (z) {
            CoreModule.c.m0.R5();
            CoreModule.c.m0.m8();
        }
        qhy qhyVar = this.f13469a;
        if (qhyVar != null) {
            qhyVar.b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m14956H(C0920a c0920a) {
        this.f13471c.setChecked(c0920a.f13478a);
        this.f13472d.setChecked(c0920a.f13479b);
        this.f13473e.setChecked(c0920a.f13480c);
        this.f13474f.setChecked(c0920a.f13481d);
        this.f13476h.setChecked(c0920a.f13483f);
        this.f13475g.setChecked(c0920a.f13482e);
    }

    /* JADX INFO: renamed from: I */
    public void m14957I(final Act act) {
        act.progress(R.string.J5);
        act.duringCreated(c.combineLatest(CoreModule.c.E0.Z3().onErrorReturn(new w9j() { // from class: l.odi
            public final Object call(Object obj) {
                return gei.m14941l((Throwable) obj);
            }
        }), CoreModule.c.E0.Y3().onErrorReturn(new w9j() { // from class: l.xdi
            public final Object call(Object obj) {
                return gei.m14937h((Throwable) obj);
            }
        }), new x9j() { // from class: l.ydi
            public final Object call(Object obj, Object obj2) {
                return gei.m14944o((PrivacyMembershipSetting) obj, (VipSetting) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zdi
            public final void call(Object obj) {
                this.f23585a.m14962v(act, (gei.C0920a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m14962v(final Act act, C0920a c0920a) {
        this.f13470b = c0920a;
        act.progressDismiss();
        CoreModule.c.C0.x4();
        final c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.c.E0.U3()).subscribe(mkd0.G(new e30() { // from class: l.aei
            public final void call(Object obj) {
                this.f9433a.m14949A((VipSetting) obj);
            }
        }));
        qhy.a aVarW = new qhy.a(act).R(t100.d(620.0f)).S(f6c0.r3).f0("她专享会员设置").a0("确定").d0(16.0f).j0(false).c0(t100.d(20.0f)).Y(new View.OnClickListener() { // from class: l.bei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10029a.m14950B(act, view);
            }
        }).b0(act.getResources().getColor(w0c0.I)).X(x2c0.U).g0(new DialogInterface.OnDismissListener() { // from class: l.cei
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10564a.m14951C(c4g0VarSubscribe, dialogInterface);
            }
        }).W(new View.OnClickListener() { // from class: l.dei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11786a.m14952D(view);
            }
        });
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        l3fVar.n = "p_femalevip_page";
        zvf0.m(l3fVar);
        qhy qhyVarN = aVarW.N();
        this.f13469a = qhyVarN;
        ViewGroup viewGroup = (ViewGroup) qhyVarN.c(u4c0.Ja);
        ((TextView) viewGroup.findViewById(u4c0.ge)).setText("冻结最后活跃时间");
        VSwitchButton vSwitchButtonFindViewById = viewGroup.findViewById(u4c0.xd);
        this.f13471c = vSwitchButtonFindViewById;
        vSwitchButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.eei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12522a.m14953E(act, view);
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) this.f13469a.c(u4c0.Ka);
        ((TextView) viewGroup2.findViewById(u4c0.ge)).setText("隐藏我的距离和位置");
        VSwitchButton vSwitchButtonFindViewById2 = viewGroup2.findViewById(u4c0.xd);
        this.f13472d = vSwitchButtonFindViewById2;
        vSwitchButtonFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.fei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12965a.m14954F(act, view);
            }
        });
        ViewGroup viewGroup3 = (ViewGroup) this.f13469a.c(u4c0.fd);
        ((TextView) viewGroup3.findViewById(u4c0.ge)).setText("优先推荐真人头像用户");
        VSwitchButton vSwitchButtonFindViewById3 = viewGroup3.findViewById(u4c0.xd);
        this.f13473e = vSwitchButtonFindViewById3;
        xdl0.E0(vSwitchButtonFindViewById3, new View.OnClickListener() { // from class: l.pdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18492a.m14963w(act, view);
            }
        });
        ViewGroup viewGroup4 = (ViewGroup) this.f13469a.c(u4c0.kd);
        ((TextView) viewGroup4.findViewById(u4c0.ge)).setText("优先推荐探探信用分高分用户");
        VSwitchButton vSwitchButtonFindViewById4 = viewGroup4.findViewById(u4c0.xd);
        this.f13474f = vSwitchButtonFindViewById4;
        xdl0.E0(vSwitchButtonFindViewById4, new View.OnClickListener() { // from class: l.qdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19161a.m14964x(act, view);
            }
        });
        ViewGroup viewGroup5 = (ViewGroup) this.f13469a.c(u4c0.B1);
        ((TextView) viewGroup5.findViewById(u4c0.ge)).setText("屏蔽开屏广告");
        VSwitchButton vSwitchButtonFindViewById5 = viewGroup5.findViewById(u4c0.xd);
        this.f13475g = vSwitchButtonFindViewById5;
        xdl0.E0(vSwitchButtonFindViewById5, new View.OnClickListener() { // from class: l.rdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19767a.m14965y(act, view);
            }
        });
        ViewGroup viewGroup6 = (ViewGroup) this.f13469a.c(u4c0.I);
        ((TextView) viewGroup6.findViewById(u4c0.ge)).setText("聊天骚扰敏感词直接屏蔽");
        VSwitchButton vSwitchButtonFindViewById6 = viewGroup6.findViewById(u4c0.xd);
        this.f13476h = vSwitchButtonFindViewById6;
        xdl0.E0(vSwitchButtonFindViewById6, new View.OnClickListener() { // from class: l.sdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20187a.m14966z(act, view);
            }
        });
        this.f13469a.g();
        m14956H(this.f13470b);
        if (xma.B3()) {
            return;
        }
        com.p1.mobile.putong.core.ui.purchase.c.V(act, "p_home,femalevip_icon", Privilege.pick_tantan_credits_users);
    }

    /* JADX INFO: renamed from: K */
    public final void m14959K(final Act act) {
        VSwitchButton vSwitchButton;
        VSwitchButton vSwitchButton2;
        VSwitchButton vSwitchButton3;
        zvf0.u("e_femalevip_confirm", "p_femalevip_page", new j760[]{vwb.Y("is_femalevip", Boolean.valueOf(xma.B3()))});
        final boolean z = true;
        this.f13477i = true;
        if (!xma.B3()) {
            qhy qhyVar = this.f13469a;
            if (qhyVar != null) {
                qhyVar.b();
                return;
            }
            return;
        }
        PrivacyMembershipSetting privacyMembershipSettingClone = CoreModule.c.E0.W3().clone();
        privacyMembershipSettingClone.frozenActivity = Boolean.valueOf(this.f13471c.isChecked());
        privacyMembershipSettingClone.hideLocation = Boolean.valueOf(this.f13472d.isChecked());
        c cVarR3 = CoreModule.c.E0.R3(privacyMembershipSettingClone);
        VipSetting vipSettingNew_ = VipSetting.new_();
        VSwitchButton vSwitchButton4 = this.f13473e;
        if (vSwitchButton4 != null) {
            vipSettingNew_.suggestReal = vSwitchButton4.isChecked();
        }
        VSwitchButton vSwitchButton5 = this.f13474f;
        if (vSwitchButton5 != null) {
            vipSettingNew_.suggestSecure = vSwitchButton5.isChecked();
        }
        VSwitchButton vSwitchButton6 = this.f13475g;
        if (vSwitchButton6 != null) {
            vipSettingNew_.blockAds = vSwitchButton6.isChecked();
        }
        VSwitchButton vSwitchButton7 = this.f13476h;
        if (vSwitchButton7 != null) {
            vipSettingNew_.blockSensitiveWord = vSwitchButton7.isChecked();
        }
        VSwitchButton vSwitchButton8 = this.f13473e;
        if ((vSwitchButton8 == null || vSwitchButton8.isChecked() == this.f13470b.f13480c) && (((vSwitchButton = this.f13474f) == null || vSwitchButton.isChecked() == this.f13470b.f13481d) && (((vSwitchButton2 = this.f13475g) == null || vSwitchButton2.isChecked() == this.f13470b.f13482e) && ((vSwitchButton3 = this.f13476h) == null || vSwitchButton3.isChecked() == this.f13470b.f13483f)))) {
            z = false;
        }
        c cVarJust = c.just(roj0.a);
        if (z) {
            cVarJust = CoreModule.c.E0.T3(vipSettingNew_);
        }
        act.progress(R.string.J5);
        act.duringCreated(c.combineLatest(cVarJust.onErrorReturn(new w9j() { // from class: l.tdi
            public final Object call(Object obj) {
                return gei.m14946q((Throwable) obj);
            }
        }), cVarR3.onErrorReturn(new w9j() { // from class: l.udi
            public final Object call(Object obj) {
                return gei.m14935f((Throwable) obj);
            }
        }), new x9j() { // from class: l.vdi
            public final Object call(Object obj, Object obj2) {
                return gei.m14930a((roj0) obj, (roj0) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.wdi
            public final void call(Object obj) {
                this.f22019a.m14955G(act, z, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: s */
    public final boolean m14960s(Act act, VSwitchButton vSwitchButton, boolean z, Privilege privilege, String str) {
        if (xma.B3()) {
            zvf0.u(str, "p_femalevip_page", new j760[]{j760.a("is_selected", Boolean.valueOf(z)), vwb.Y("is_femalevip", Boolean.valueOf(xma.B3()))});
            return false;
        }
        vSwitchButton.setChecked(!z);
        zvf0.u(str, "p_femalevip_page", new j760[]{j760.a("is_selected", Boolean.valueOf(!z)), vwb.Y("is_femalevip", Boolean.valueOf(xma.B3()))});
        com.p1.mobile.putong.core.ui.purchase.c.V(act, "p_home,femalevip_set", privilege);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m14961t() {
        qhy qhyVar = this.f13469a;
        if (qhyVar != null) {
            qhyVar.b();
        }
        f13468j.clear();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m14963w(Act act, View view) {
        VSwitchButton vSwitchButton = this.f13473e;
        m14960s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.pick_tantan_credits_users, "e_femalevip_real");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m14964x(Act act, View view) {
        VSwitchButton vSwitchButton = this.f13474f;
        m14960s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.pick_tantan_credits_users, "e_femalevip_safety");
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m14965y(Act act, View view) {
        VSwitchButton vSwitchButton = this.f13475g;
        m14960s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.ads_not_disturb, "e_femalevip_advertise");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m14966z(Act act, View view) {
        VSwitchButton vSwitchButton = this.f13476h;
        m14960s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.block_harassing_words, "e_femalevip_disturb");
    }
}

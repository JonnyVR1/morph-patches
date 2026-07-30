package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.VipSetting;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.lang.ref.WeakReference;
import p137rx.C22421c;
import p151v.VSwitchButton;

/* JADX INFO: loaded from: classes11.dex */
public class vfi {

    /* JADX INFO: renamed from: j */
    public static WeakReference<vfi> f183927j;

    /* JADX INFO: renamed from: a */
    public nqy f183928a;

    /* JADX INFO: renamed from: b */
    public C20829a f183929b;

    /* JADX INFO: renamed from: c */
    public VSwitchButton f183930c;

    /* JADX INFO: renamed from: d */
    public VSwitchButton f183931d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f183932e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f183933f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f183934g;

    /* JADX INFO: renamed from: h */
    public VSwitchButton f183935h;

    /* JADX INFO: renamed from: i */
    public boolean f183936i;

    /* JADX INFO: renamed from: l.vfi$a */
    public static class C20829a {

        /* JADX INFO: renamed from: a */
        public boolean f183937a;

        /* JADX INFO: renamed from: b */
        public boolean f183938b;

        /* JADX INFO: renamed from: c */
        public boolean f183939c;

        /* JADX INFO: renamed from: d */
        public boolean f183940d;

        /* JADX INFO: renamed from: e */
        public boolean f183941e;

        /* JADX INFO: renamed from: f */
        public boolean f183942f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m201125a(uxj0 uxj0Var, uxj0 uxj0Var2) {
        if (uxj0Var == null && uxj0Var2 == null) {
            return null;
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ uxj0 m201130f(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ VipSetting m201132h(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ PrivacyMembershipSetting m201136l(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C20829a m201139o(PrivacyMembershipSetting privacyMembershipSetting, VipSetting vipSetting) {
        C20829a c20829a = new C20829a();
        if (privacyMembershipSetting != null) {
            c20829a.f183938b = privacyMembershipSetting.hideLocation.booleanValue();
            c20829a.f183937a = privacyMembershipSetting.frozenActivity.booleanValue();
        } else {
            c20829a.f183938b = false;
            c20829a.f183937a = false;
        }
        if (vipSetting != null) {
            c20829a.f183939c = vipSetting.suggestReal;
            c20829a.f183940d = vipSetting.suggestSecure;
            c20829a.f183941e = vipSetting.blockAds;
            c20829a.f183942f = vipSetting.blockSensitiveWord;
            return c20829a;
        }
        c20829a.f183939c = false;
        c20829a.f183940d = false;
        c20829a.f183941e = false;
        c20829a.f183942f = false;
        return c20829a;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ uxj0 m201141q(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static WeakReference<vfi> m201143u() {
        WeakReference<vfi> weakReference = f183927j;
        if (weakReference == null || weakReference.get() == null) {
            synchronized (vfi.class) {
                f183927j = new WeakReference<>(new vfi());
            }
        }
        return f183927j;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m201144A(VipSetting vipSetting) {
        nqy nqyVar = this.f183928a;
        if (nqyVar == null || !nqyVar.m164364d() || vipSetting == null) {
            return;
        }
        C20829a c20829a = this.f183929b;
        c20829a.f183939c = vipSetting.suggestReal;
        c20829a.f183940d = vipSetting.suggestSecure;
        c20829a.f183941e = vipSetting.blockAds;
        c20829a.f183942f = vipSetting.blockSensitiveWord;
        m201151H(c20829a);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m201145B(Act act, View view) {
        m201154K(act);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m201146C(kcg0 kcg0Var, DialogInterface dialogInterface) {
        psd0.m173633z(kcg0Var);
        if (this.f183936i) {
            return;
        }
        i4g0.m138523u("e_femalevip_close", "p_femalevip_page", jyb.m147494Y("is_femalevip", Boolean.valueOf(joa.m146353C3())));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m201147D(View view) {
        nqy nqyVar = this.f183928a;
        if (nqyVar != null) {
            nqyVar.m164362b();
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m201148E(Act act, View view) {
        VSwitchButton vSwitchButton = this.f183930c;
        if (!m201155s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.privacy_membership, "e_femalevip_activetime") && this.f183930c.isChecked()) {
            o1j0.m165651y("开启后，你的活跃时间将冻结在此刻，当你发布动态或评论点赞后，活跃时间将被更新，点击右上角确定按钮后生效");
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m201149F(Act act, View view) {
        VSwitchButton vSwitchButton = this.f183931d;
        if (!m201155s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.privacy_membership, "e_femalevip_location") && this.f183931d.isChecked()) {
            o1j0.m165651y("已开启隐藏距离位置，其他用户将看不到你的距离和你的地理位置，点击右上角确定按钮后生效");
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m201150G(Act act, boolean z, uxj0 uxj0Var) {
        act.progressDismiss();
        if (uxj0Var == null) {
            o1j0.m165649w(R$string.f19605r4);
            return;
        }
        o1j0.m165651y("已保存");
        if (z) {
            CoreModule.f18264c.f20405m0.m32046R5();
            CoreModule.f18264c.f20405m0.m32130m8();
        }
        nqy nqyVar = this.f183928a;
        if (nqyVar != null) {
            nqyVar.m164362b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m201151H(C20829a c20829a) {
        this.f183930c.setChecked(c20829a.f183937a);
        this.f183931d.setChecked(c20829a.f183938b);
        this.f183932e.setChecked(c20829a.f183939c);
        this.f183933f.setChecked(c20829a.f183940d);
        this.f183935h.setChecked(c20829a.f183942f);
        this.f183934g.setChecked(c20829a.f183941e);
    }

    /* JADX INFO: renamed from: I */
    public void m201152I(final Act act) {
        act.progress(R$string.f18632L5);
        act.duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20303E0.m141084Z3().onErrorReturn(new qcj() { // from class: l.dfi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vfi.m201136l((Throwable) obj);
            }
        }), CoreModule.f18264c.f20303E0.m141083Y3().onErrorReturn(new qcj() { // from class: l.mfi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vfi.m201132h((Throwable) obj);
            }
        }), new rcj() { // from class: l.nfi
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return vfi.m201139o((PrivacyMembershipSetting) obj, (VipSetting) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ofi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147074a.m201157v(act, (vfi.C20829a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m201157v(final Act act, C20829a c20829a) {
        this.f183929b = c20829a;
        act.progressDismiss();
        CoreModule.f18264c.f20297C0.m146428y4();
        final kcg0 kcg0VarSubscribe = act.duringCreated(CoreModule.f18264c.f20303E0.m141079U3()).subscribe(psd0.m173596G(new y20() { // from class: l.pfi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152178a.m201144A((VipSetting) obj);
            }
        }));
        nqy.C18929a c18929aM164416W = new nqy.C18929a(act).m164411R(qa00.m175859d(620.0f)).m164412S(kec0.f126028r3).m164425f0("她专享会员设置").m164420a0("确定").m164423d0(16.0f).m164429j0(false).m164422c0(qa00.m175859d(20.0f)).m164418Y(new View.OnClickListener() { // from class: l.qfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157302a.m201145B(act, view);
            }
        }).m164421b0(act.getResources().getColor(c9c0.f80342I)).m164417X(dbc0.f86648V).m164426g0(new DialogInterface.OnDismissListener() { // from class: l.rfi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f162794a.m201146C(kcg0VarSubscribe, dialogInterface);
            }
        }).m164416W(new View.OnClickListener() { // from class: l.sfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167709a.m201147D(view);
            }
        });
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_femalevip_page";
        i4g0.m138515m(q4fVar);
        nqy nqyVarM164407N = c18929aM164416W.m164407N();
        this.f183928a = nqyVarM164407N;
        ViewGroup viewGroup = (ViewGroup) nqyVarM164407N.m164363c(adc0.f70002La);
        ((TextView) viewGroup.findViewById(adc0.f70409je)).setText("冻结最后活跃时间");
        VSwitchButton vSwitchButton = (VSwitchButton) viewGroup.findViewById(adc0.f70680zd);
        this.f183930c = vSwitchButton;
        vSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: l.tfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173964a.m201148E(act, view);
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) this.f183928a.m164363c(adc0.f70019Ma);
        ((TextView) viewGroup2.findViewById(adc0.f70409je)).setText("隐藏我的距离和位置");
        VSwitchButton vSwitchButton2 = (VSwitchButton) viewGroup2.findViewById(adc0.f70680zd);
        this.f183931d = vSwitchButton2;
        vSwitchButton2.setOnClickListener(new View.OnClickListener() { // from class: l.ufi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178767a.m201149F(act, view);
            }
        });
        ViewGroup viewGroup3 = (ViewGroup) this.f183928a.m164363c(adc0.f70375hd);
        ((TextView) viewGroup3.findViewById(adc0.f70409je)).setText("优先推荐真人头像用户");
        VSwitchButton vSwitchButton3 = (VSwitchButton) viewGroup3.findViewById(adc0.f70680zd);
        this.f183932e = vSwitchButton3;
        bnl0.m105509E0(vSwitchButton3, new View.OnClickListener() { // from class: l.efi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93789a.m201158w(act, view);
            }
        });
        ViewGroup viewGroup4 = (ViewGroup) this.f183928a.m164363c(adc0.f70459md);
        ((TextView) viewGroup4.findViewById(adc0.f70409je)).setText("优先推荐探探信用分高分用户");
        VSwitchButton vSwitchButton4 = (VSwitchButton) viewGroup4.findViewById(adc0.f70680zd);
        this.f183933f = vSwitchButton4;
        bnl0.m105509E0(vSwitchButton4, new View.OnClickListener() { // from class: l.ffi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98774a.m201159x(act, view);
            }
        });
        ViewGroup viewGroup5 = (ViewGroup) this.f183928a.m164363c(adc0.f69823B1);
        ((TextView) viewGroup5.findViewById(adc0.f70409je)).setText("屏蔽开屏广告");
        VSwitchButton vSwitchButton5 = (VSwitchButton) viewGroup5.findViewById(adc0.f70680zd);
        this.f183934g = vSwitchButton5;
        bnl0.m105509E0(vSwitchButton5, new View.OnClickListener() { // from class: l.gfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103930a.m201160y(act, view);
            }
        });
        ViewGroup viewGroup6 = (ViewGroup) this.f183928a.m164363c(adc0.f69940I);
        ((TextView) viewGroup6.findViewById(adc0.f70409je)).setText("聊天骚扰敏感词直接屏蔽");
        VSwitchButton vSwitchButton6 = (VSwitchButton) viewGroup6.findViewById(adc0.f70680zd);
        this.f183935h = vSwitchButton6;
        bnl0.m105509E0(vSwitchButton6, new View.OnClickListener() { // from class: l.hfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109297a.m201161z(act, view);
            }
        });
        this.f183928a.m164367g();
        m201151H(this.f183929b);
        if (joa.m146353C3()) {
            return;
        }
        C8927c.m54614V(act, "p_home,femalevip_icon", Privilege.pick_tantan_credits_users);
    }

    /* JADX INFO: renamed from: K */
    public final void m201154K(final Act act) {
        VSwitchButton vSwitchButton;
        VSwitchButton vSwitchButton2;
        VSwitchButton vSwitchButton3;
        i4g0.m138523u("e_femalevip_confirm", "p_femalevip_page", jyb.m147494Y("is_femalevip", Boolean.valueOf(joa.m146353C3())));
        final boolean z = true;
        this.f183936i = true;
        if (!joa.m146353C3()) {
            nqy nqyVar = this.f183928a;
            if (nqyVar != null) {
                nqyVar.m164362b();
                return;
            }
            return;
        }
        PrivacyMembershipSetting privacyMembershipSettingMo225055clone = CoreModule.f18264c.f20303E0.m141081W3().mo225055clone();
        privacyMembershipSettingMo225055clone.frozenActivity = Boolean.valueOf(this.f183930c.isChecked());
        privacyMembershipSettingMo225055clone.hideLocation = Boolean.valueOf(this.f183931d.isChecked());
        C22421c<uxj0> c22421cM141076R3 = CoreModule.f18264c.f20303E0.m141076R3(privacyMembershipSettingMo225055clone);
        VipSetting vipSettingNew_ = VipSetting.new_();
        VSwitchButton vSwitchButton4 = this.f183932e;
        if (vSwitchButton4 != null) {
            vipSettingNew_.suggestReal = vSwitchButton4.isChecked();
        }
        VSwitchButton vSwitchButton5 = this.f183933f;
        if (vSwitchButton5 != null) {
            vipSettingNew_.suggestSecure = vSwitchButton5.isChecked();
        }
        VSwitchButton vSwitchButton6 = this.f183934g;
        if (vSwitchButton6 != null) {
            vipSettingNew_.blockAds = vSwitchButton6.isChecked();
        }
        VSwitchButton vSwitchButton7 = this.f183935h;
        if (vSwitchButton7 != null) {
            vipSettingNew_.blockSensitiveWord = vSwitchButton7.isChecked();
        }
        VSwitchButton vSwitchButton8 = this.f183932e;
        if ((vSwitchButton8 == null || vSwitchButton8.isChecked() == this.f183929b.f183939c) && (((vSwitchButton = this.f183933f) == null || vSwitchButton.isChecked() == this.f183929b.f183940d) && (((vSwitchButton2 = this.f183934g) == null || vSwitchButton2.isChecked() == this.f183929b.f183941e) && ((vSwitchButton3 = this.f183935h) == null || vSwitchButton3.isChecked() == this.f183929b.f183942f)))) {
            z = false;
        }
        C22421c<uxj0> c22421cJust = C22421c.just(uxj0.f181467a);
        if (z) {
            c22421cJust = CoreModule.f18264c.f20303E0.m141078T3(vipSettingNew_);
        }
        act.progress(R$string.f18632L5);
        act.duringCreated(C22421c.combineLatest(c22421cJust.onErrorReturn(new qcj() { // from class: l.ifi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vfi.m201141q((Throwable) obj);
            }
        }), c22421cM141076R3.onErrorReturn(new qcj() { // from class: l.jfi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vfi.m201130f((Throwable) obj);
            }
        }), new rcj() { // from class: l.kfi
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return vfi.m201125a((uxj0) obj, (uxj0) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.lfi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131847a.m201150G(act, z, (uxj0) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: s */
    public final boolean m201155s(Act act, VSwitchButton vSwitchButton, boolean z, Privilege privilege, String str) {
        if (joa.m146353C3()) {
            i4g0.m138523u(str, "p_femalevip_page", pf60.m172085a("is_selected", Boolean.valueOf(z)), jyb.m147494Y("is_femalevip", Boolean.valueOf(joa.m146353C3())));
            return false;
        }
        vSwitchButton.setChecked(!z);
        i4g0.m138523u(str, "p_femalevip_page", pf60.m172085a("is_selected", Boolean.valueOf(!z)), jyb.m147494Y("is_femalevip", Boolean.valueOf(joa.m146353C3())));
        C8927c.m54614V(act, "p_home,femalevip_set", privilege);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m201156t() {
        nqy nqyVar = this.f183928a;
        if (nqyVar != null) {
            nqyVar.m164362b();
        }
        f183927j.clear();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m201158w(Act act, View view) {
        VSwitchButton vSwitchButton = this.f183932e;
        m201155s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.pick_tantan_credits_users, "e_femalevip_real");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m201159x(Act act, View view) {
        VSwitchButton vSwitchButton = this.f183933f;
        m201155s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.pick_tantan_credits_users, "e_femalevip_safety");
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m201160y(Act act, View view) {
        VSwitchButton vSwitchButton = this.f183934g;
        m201155s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.ads_not_disturb, "e_femalevip_advertise");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m201161z(Act act, View view) {
        VSwitchButton vSwitchButton = this.f183935h;
        m201155s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.block_harassing_words, "e_femalevip_disturb");
    }
}

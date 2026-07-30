package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.VipSetting;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.lang.ref.WeakReference;
import p133rx.C22306c;
import p147v.VSwitchButton;

/* JADX INFO: loaded from: classes11.dex */
public class gei {

    /* JADX INFO: renamed from: j */
    public static WeakReference<gei> f102254j;

    /* JADX INFO: renamed from: a */
    public qhy f102255a;

    /* JADX INFO: renamed from: b */
    public C17066a f102256b;

    /* JADX INFO: renamed from: c */
    public VSwitchButton f102257c;

    /* JADX INFO: renamed from: d */
    public VSwitchButton f102258d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f102259e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f102260f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f102261g;

    /* JADX INFO: renamed from: h */
    public VSwitchButton f102262h;

    /* JADX INFO: renamed from: i */
    public boolean f102263i;

    /* JADX INFO: renamed from: l.gei$a */
    public static class C17066a {

        /* JADX INFO: renamed from: a */
        public boolean f102264a;

        /* JADX INFO: renamed from: b */
        public boolean f102265b;

        /* JADX INFO: renamed from: c */
        public boolean f102266c;

        /* JADX INFO: renamed from: d */
        public boolean f102267d;

        /* JADX INFO: renamed from: e */
        public boolean f102268e;

        /* JADX INFO: renamed from: f */
        public boolean f102269f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m125783a(roj0 roj0Var, roj0 roj0Var2) {
        if (roj0Var == null && roj0Var2 == null) {
            return null;
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ roj0 m125788f(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ VipSetting m125790h(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ PrivacyMembershipSetting m125794l(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C17066a m125797o(PrivacyMembershipSetting privacyMembershipSetting, VipSetting vipSetting) {
        C17066a c17066a = new C17066a();
        if (privacyMembershipSetting != null) {
            c17066a.f102265b = privacyMembershipSetting.hideLocation.booleanValue();
            c17066a.f102264a = privacyMembershipSetting.frozenActivity.booleanValue();
        } else {
            c17066a.f102265b = false;
            c17066a.f102264a = false;
        }
        if (vipSetting != null) {
            c17066a.f102266c = vipSetting.suggestReal;
            c17066a.f102267d = vipSetting.suggestSecure;
            c17066a.f102268e = vipSetting.blockAds;
            c17066a.f102269f = vipSetting.blockSensitiveWord;
            return c17066a;
        }
        c17066a.f102266c = false;
        c17066a.f102267d = false;
        c17066a.f102268e = false;
        c17066a.f102269f = false;
        return c17066a;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ roj0 m125799q(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static WeakReference<gei> m125801u() {
        WeakReference<gei> weakReference = f102254j;
        if (weakReference == null || weakReference.get() == null) {
            synchronized (gei.class) {
                f102254j = new WeakReference<>(new gei());
            }
        }
        return f102254j;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m125802A(VipSetting vipSetting) {
        qhy qhyVar = this.f102255a;
        if (qhyVar == null || !qhyVar.m174611d() || vipSetting == null) {
            return;
        }
        C17066a c17066a = this.f102256b;
        c17066a.f102266c = vipSetting.suggestReal;
        c17066a.f102267d = vipSetting.suggestSecure;
        c17066a.f102268e = vipSetting.blockAds;
        c17066a.f102269f = vipSetting.blockSensitiveWord;
        m125809H(c17066a);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m125803B(Act act, View view) {
        m125812K(act);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m125804C(c4g0 c4g0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(c4g0Var);
        if (this.f102263i) {
            return;
        }
        zvf0.m220399u("e_femalevip_close", "p_femalevip_page", vwb.m200311Y("is_femalevip", Boolean.valueOf(xma.m210039B3())));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m125805D(View view) {
        qhy qhyVar = this.f102255a;
        if (qhyVar != null) {
            qhyVar.m174609b();
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m125806E(Act act, View view) {
        VSwitchButton vSwitchButton = this.f102257c;
        if (!m125813s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.privacy_membership, "e_femalevip_activetime") && this.f102257c.isChecked()) {
            lsi0.m151595y("开启后，你的活跃时间将冻结在此刻，当你发布动态或评论点赞后，活跃时间将被更新，点击右上角确定按钮后生效");
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m125807F(Act act, View view) {
        VSwitchButton vSwitchButton = this.f102258d;
        if (!m125813s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.privacy_membership, "e_femalevip_location") && this.f102258d.isChecked()) {
            lsi0.m151595y("已开启隐藏距离位置，其他用户将看不到你的距离和你的地理位置，点击右上角确定按钮后生效");
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m125808G(Act act, boolean z, roj0 roj0Var) {
        act.progressDismiss();
        if (roj0Var == null) {
            lsi0.m151593w(R$string.f18813p4);
            return;
        }
        lsi0.m151595y("已保存");
        if (z) {
            CoreModule.f17545c.f19663m0.m31043R5();
            CoreModule.f17545c.f19663m0.m31127m8();
        }
        qhy qhyVar = this.f102255a;
        if (qhyVar != null) {
            qhyVar.m174609b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m125809H(C17066a c17066a) {
        this.f102257c.setChecked(c17066a.f102264a);
        this.f102258d.setChecked(c17066a.f102265b);
        this.f102259e.setChecked(c17066a.f102266c);
        this.f102260f.setChecked(c17066a.f102267d);
        this.f102262h.setChecked(c17066a.f102269f);
        this.f102261g.setChecked(c17066a.f102268e);
    }

    /* JADX INFO: renamed from: I */
    public void m125810I(final Act act) {
        act.progress(R$string.f17842J5);
        act.duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19561E0.m203796Z3().onErrorReturn(new w9j() { // from class: l.odi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gei.m125794l((Throwable) obj);
            }
        }), CoreModule.f17545c.f19561E0.m203795Y3().onErrorReturn(new w9j() { // from class: l.xdi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gei.m125790h((Throwable) obj);
            }
        }), new x9j() { // from class: l.ydi
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return gei.m125797o((PrivacyMembershipSetting) obj, (VipSetting) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zdi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202666a.m125815v(act, (gei.C17066a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m125815v(final Act act, C17066a c17066a) {
        this.f102256b = c17066a;
        act.progressDismiss();
        CoreModule.f17545c.f19555C0.m210115x4();
        final c4g0 c4g0VarSubscribe = act.duringCreated(CoreModule.f17545c.f19561E0.m203791U3()).subscribe(mkd0.m154955G(new e30() { // from class: l.aei
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69044a.m125802A((VipSetting) obj);
            }
        }));
        qhy.C19502a c19502aM174663W = new qhy.C19502a(act).m174658R(t100.m186890d(620.0f)).m174659S(f6c0.f95974r3).m174672f0("她专享会员设置").m174667a0("确定").m174670d0(16.0f).m174676j0(false).m174669c0(t100.m186890d(20.0f)).m174665Y(new View.OnClickListener() { // from class: l.bei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75159a.m125803B(act, view);
            }
        }).m174668b0(act.getResources().getColor(w0c0.f183773I)).m174664X(x2c0.f189779U).m174673g0(new DialogInterface.OnDismissListener() { // from class: l.cei
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f80461a.m125804C(c4g0VarSubscribe, dialogInterface);
            }
        }).m174663W(new View.OnClickListener() { // from class: l.dei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85801a.m125805D(view);
            }
        });
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_femalevip_page";
        zvf0.m220391m(l3fVar);
        qhy qhyVarM174654N = c19502aM174663W.m174654N();
        this.f102255a = qhyVarM174654N;
        ViewGroup viewGroup = (ViewGroup) qhyVarM174654N.m174610c(u4c0.f173880Ja);
        ((TextView) viewGroup.findViewById(u4c0.f174268ge)).setText("冻结最后活跃时间");
        VSwitchButton vSwitchButton = (VSwitchButton) viewGroup.findViewById(u4c0.f174555xd);
        this.f102257c = vSwitchButton;
        vSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: l.eei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90743a.m125806E(act, view);
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) this.f102255a.m174610c(u4c0.f173897Ka);
        ((TextView) viewGroup2.findViewById(u4c0.f174268ge)).setText("隐藏我的距离和位置");
        VSwitchButton vSwitchButton2 = (VSwitchButton) viewGroup2.findViewById(u4c0.f174555xd);
        this.f102258d = vSwitchButton2;
        vSwitchButton2.setOnClickListener(new View.OnClickListener() { // from class: l.fei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97135a.m125807F(act, view);
            }
        });
        ViewGroup viewGroup3 = (ViewGroup) this.f102255a.m174610c(u4c0.f174250fd);
        ((TextView) viewGroup3.findViewById(u4c0.f174268ge)).setText("优先推荐真人头像用户");
        VSwitchButton vSwitchButton3 = (VSwitchButton) viewGroup3.findViewById(u4c0.f174555xd);
        this.f102259e = vSwitchButton3;
        xdl0.m208329E0(vSwitchButton3, new View.OnClickListener() { // from class: l.pdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148305a.m125816w(act, view);
            }
        });
        ViewGroup viewGroup4 = (ViewGroup) this.f102255a.m174610c(u4c0.f174334kd);
        ((TextView) viewGroup4.findViewById(u4c0.f174268ge)).setText("优先推荐探探信用分高分用户");
        VSwitchButton vSwitchButton4 = (VSwitchButton) viewGroup4.findViewById(u4c0.f174555xd);
        this.f102260f = vSwitchButton4;
        xdl0.m208329E0(vSwitchButton4, new View.OnClickListener() { // from class: l.qdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153932a.m125817x(act, view);
            }
        });
        ViewGroup viewGroup5 = (ViewGroup) this.f102255a.m174610c(u4c0.f173735B1);
        ((TextView) viewGroup5.findViewById(u4c0.f174268ge)).setText("屏蔽开屏广告");
        VSwitchButton vSwitchButton5 = (VSwitchButton) viewGroup5.findViewById(u4c0.f174555xd);
        this.f102261g = vSwitchButton5;
        xdl0.m208329E0(vSwitchButton5, new View.OnClickListener() { // from class: l.rdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158935a.m125818y(act, view);
            }
        });
        ViewGroup viewGroup6 = (ViewGroup) this.f102255a.m174610c(u4c0.f173852I);
        ((TextView) viewGroup6.findViewById(u4c0.f174268ge)).setText("聊天骚扰敏感词直接屏蔽");
        VSwitchButton vSwitchButton6 = (VSwitchButton) viewGroup6.findViewById(u4c0.f174555xd);
        this.f102262h = vSwitchButton6;
        xdl0.m208329E0(vSwitchButton6, new View.OnClickListener() { // from class: l.sdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163843a.m125819z(act, view);
            }
        });
        this.f102255a.m174614g();
        m125809H(this.f102256b);
        if (xma.m210039B3()) {
            return;
        }
        C8764c.m53431V(act, "p_home,femalevip_icon", Privilege.pick_tantan_credits_users);
    }

    /* JADX INFO: renamed from: K */
    public final void m125812K(final Act act) {
        VSwitchButton vSwitchButton;
        VSwitchButton vSwitchButton2;
        VSwitchButton vSwitchButton3;
        zvf0.m220399u("e_femalevip_confirm", "p_femalevip_page", vwb.m200311Y("is_femalevip", Boolean.valueOf(xma.m210039B3())));
        final boolean z = true;
        this.f102263i = true;
        if (!xma.m210039B3()) {
            qhy qhyVar = this.f102255a;
            if (qhyVar != null) {
                qhyVar.m174609b();
                return;
            }
            return;
        }
        PrivacyMembershipSetting privacyMembershipSettingMo223809clone = CoreModule.f17545c.f19561E0.m203793W3().mo223809clone();
        privacyMembershipSettingMo223809clone.frozenActivity = Boolean.valueOf(this.f102257c.isChecked());
        privacyMembershipSettingMo223809clone.hideLocation = Boolean.valueOf(this.f102258d.isChecked());
        C22306c<roj0> c22306cM203788R3 = CoreModule.f17545c.f19561E0.m203788R3(privacyMembershipSettingMo223809clone);
        VipSetting vipSettingNew_ = VipSetting.new_();
        VSwitchButton vSwitchButton4 = this.f102259e;
        if (vSwitchButton4 != null) {
            vipSettingNew_.suggestReal = vSwitchButton4.isChecked();
        }
        VSwitchButton vSwitchButton5 = this.f102260f;
        if (vSwitchButton5 != null) {
            vipSettingNew_.suggestSecure = vSwitchButton5.isChecked();
        }
        VSwitchButton vSwitchButton6 = this.f102261g;
        if (vSwitchButton6 != null) {
            vipSettingNew_.blockAds = vSwitchButton6.isChecked();
        }
        VSwitchButton vSwitchButton7 = this.f102262h;
        if (vSwitchButton7 != null) {
            vipSettingNew_.blockSensitiveWord = vSwitchButton7.isChecked();
        }
        VSwitchButton vSwitchButton8 = this.f102259e;
        if ((vSwitchButton8 == null || vSwitchButton8.isChecked() == this.f102256b.f102266c) && (((vSwitchButton = this.f102260f) == null || vSwitchButton.isChecked() == this.f102256b.f102267d) && (((vSwitchButton2 = this.f102261g) == null || vSwitchButton2.isChecked() == this.f102256b.f102268e) && ((vSwitchButton3 = this.f102262h) == null || vSwitchButton3.isChecked() == this.f102256b.f102269f)))) {
            z = false;
        }
        C22306c<roj0> c22306cJust = C22306c.just(roj0.f160388a);
        if (z) {
            c22306cJust = CoreModule.f17545c.f19561E0.m203790T3(vipSettingNew_);
        }
        act.progress(R$string.f17842J5);
        act.duringCreated(C22306c.combineLatest(c22306cJust.onErrorReturn(new w9j() { // from class: l.tdi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gei.m125799q((Throwable) obj);
            }
        }), c22306cM203788R3.onErrorReturn(new w9j() { // from class: l.udi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gei.m125788f((Throwable) obj);
            }
        }), new x9j() { // from class: l.vdi
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return gei.m125783a((roj0) obj, (roj0) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.wdi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185803a.m125808G(act, z, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: s */
    public final boolean m125813s(Act act, VSwitchButton vSwitchButton, boolean z, Privilege privilege, String str) {
        if (xma.m210039B3()) {
            zvf0.m220399u(str, "p_femalevip_page", j760.m140076a("is_selected", Boolean.valueOf(z)), vwb.m200311Y("is_femalevip", Boolean.valueOf(xma.m210039B3())));
            return false;
        }
        vSwitchButton.setChecked(!z);
        zvf0.m220399u(str, "p_femalevip_page", j760.m140076a("is_selected", Boolean.valueOf(!z)), vwb.m200311Y("is_femalevip", Boolean.valueOf(xma.m210039B3())));
        C8764c.m53431V(act, "p_home,femalevip_set", privilege);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m125814t() {
        qhy qhyVar = this.f102255a;
        if (qhyVar != null) {
            qhyVar.m174609b();
        }
        f102254j.clear();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m125816w(Act act, View view) {
        VSwitchButton vSwitchButton = this.f102259e;
        m125813s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.pick_tantan_credits_users, "e_femalevip_real");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m125817x(Act act, View view) {
        VSwitchButton vSwitchButton = this.f102260f;
        m125813s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.pick_tantan_credits_users, "e_femalevip_safety");
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m125818y(Act act, View view) {
        VSwitchButton vSwitchButton = this.f102261g;
        m125813s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.ads_not_disturb, "e_femalevip_advertise");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m125819z(Act act, View view) {
        VSwitchButton vSwitchButton = this.f102262h;
        m125813s(act, vSwitchButton, vSwitchButton.isChecked(), Privilege.block_harassing_words, "e_femalevip_disturb");
    }
}

package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.dac0;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.sb90;
import l.vwb;
import l.x9j;
import l.xdl0;
import l.yij0;
import l.yv80;
import l.zvf0;
import p006l.dv80;
import p006l.qib0;
import p006l.w0c0;
import p006l.xma;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VSwitchButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListPartnerDressUpItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f7413a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f7414b;

    /* JADX INFO: renamed from: c */
    public VRelative f7415c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f7416d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7417e;

    /* JADX INFO: renamed from: f */
    public VImage f7418f;

    /* JADX INFO: renamed from: g */
    public VImage f7419g;

    /* JADX INFO: renamed from: h */
    public VText f7420h;

    /* JADX INFO: renamed from: i */
    public VText f7421i;

    /* JADX INFO: renamed from: j */
    public VSwitchButton f7422j;

    /* JADX INFO: renamed from: k */
    public View f7423k;

    /* JADX INFO: renamed from: l */
    public long f7424l;

    /* JADX INFO: renamed from: m */
    public PrivacyMembershipSetting f7425m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem$a */
    public static class C0428a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f7426a;

        /* JADX INFO: renamed from: b */
        public String f7427b;

        /* JADX INFO: renamed from: c */
        public Privilege f7428c;

        public C0428a(String str, String str2, Privilege privilege) {
            this.f7426a = str;
            this.f7427b = str2;
            this.f7428c = privilege;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 10;
        }
    }

    public PrivilegeDescListPartnerDressUpItem(Context context) {
        super(context);
        this.f7424l = 0L;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10650e(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.y("已为你打开神秘人模式");
        }
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: i */
    public final void m10654i(View view) {
        yv80.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10655j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.f7424l > 2000;
        this.f7424l = jCurrentTimeMillis;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10656k(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        if (!NullChecker.a(this.f7425m)) {
            if (m10655j()) {
                CrashHelper.c(new Exception("o_diamond_switch_error:privacyMembershipEditSetting is null"));
                CoreModule.f1534c.f3550E0.m26488Z3();
                return;
            }
            return;
        }
        zvf0.u("e_supremepartner_skin", putongFrag.pageId(), new j760[]{vwb.Y("skin_is_on", Boolean.valueOf(z))});
        if (this.f7425m.hideIcon.booleanValue() == z) {
            this.f7425m.hideIcon = Boolean.valueOf(!z);
            m10664s(putongFrag);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10657l(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.a(privacyMembershipSetting)) {
            this.f7425m = privacyMembershipSetting.clone();
            boolean zM27357N3 = xma.m27357N3();
            VSwitchButton vSwitchButton = this.f7422j;
            if (zM27357N3) {
                vSwitchButton.setCheckedNoEvent(!this.f7425m.hideIcon.booleanValue());
            } else {
                vSwitchButton.setCheckedNoEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m10658m(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 == null) {
            this.f7422j.setChecked(false);
            CrashHelper.c(new Exception("mysteryman_switch_error:me user is null"));
            CoreModule.f1534c.f3550E0.m26488Z3();
            return;
        }
        if (this.f7425m == null) {
            this.f7422j.setChecked(false);
            CrashHelper.c(new Exception("mysteryman_switch_error:privacyMembershipEditSetting is null"));
            CoreModule.f1534c.f3550E0.m26488Z3();
        } else {
            if (userM21490p9.isSupremePartnerOpenMystery() == z) {
                return;
            }
            if (z && this.f7425m.hideIcon.booleanValue()) {
                this.f7422j.setChecked(false);
                lsi0.y("当前已隐藏会员身份，神秘人模式无法被打开");
            } else {
                zvf0.u("e_mysteryman", putongFrag.pageId(), new j760[]{vwb.Y("action", z ? "open" : "close")});
                if (xma.m27357N3()) {
                    putongFrag.duringCreated(CoreModule.f1534c.f3550E0.m26479Q3(z)).subscribe(mkd0.H(new e30() { // from class: l.uv80
                        public final void call(Object obj) {
                            PrivilegeDescListPartnerDressUpItem.m10650e((Boolean) obj);
                        }
                    }, new e30() { // from class: l.vv80
                        public final void call(Object obj) {
                            yij0.D((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10659n(j760 j760Var) {
        if (NullChecker.a(j760Var.b)) {
            this.f7425m = ((PrivacyMembershipSetting) j760Var.b).clone();
        }
        if (NullChecker.a(j760Var.a)) {
            boolean zM27357N3 = xma.m27357N3();
            VSwitchButton vSwitchButton = this.f7422j;
            if (zM27357N3) {
                vSwitchButton.setCheckedNoEvent(((User) j760Var.a).isSupremePartnerOpenMystery());
            } else {
                vSwitchButton.setCheckedNoEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m10660o(roj0 roj0Var) {
        if (this.f7425m.hideIcon.booleanValue()) {
            sb90.a("supreme_partner_dress_up");
        }
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10654i(this);
        this.f7422j.setActiveSliderColor(getResources().getColor(w0c0.f24637Q));
    }

    /* JADX INFO: renamed from: p */
    public void m10661p(C0428a c0428a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        this.f7420h.setText(c0428a.f7426a);
        this.f7421i.setText(c0428a.f7427b);
        qib0.f19782G.m12744L0(this.f7417e, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
        Privilege privilege = c0428a.f7428c;
        Privilege privilege2 = Privilege.mysterious_mode;
        View view = this.f7413a;
        if (privilege == privilege2) {
            xdl0.M(view, true);
            m10663r(dac0Var, putongFrag);
        } else {
            xdl0.M(view, false);
            m10662q(dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10662q(dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        this.f7422j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.sv80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f21682a.m10656k(putongFrag, compoundButton, z);
            }
        });
        dac0Var.c(putongFrag, CoreModule.f1534c.f3550E0.m26484V3()).subscribe(mkd0.G(new e30() { // from class: l.tv80
            public final void call(Object obj) {
                this.f22293a.m10657l((PrivacyMembershipSetting) obj);
            }
        }));
        if (NullChecker.a(this.f7425m)) {
            return;
        }
        CoreModule.f1534c.f3550E0.m26488Z3();
    }

    /* JADX INFO: renamed from: r */
    public final void m10663r(dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        this.f7422j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.pv80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f19375a.m10658m(putongFrag, compoundButton, z);
            }
        });
        dac0Var.c(putongFrag, mkd0.r(CoreModule.f1534c.f3628e0.m21486o9(), CoreModule.f1534c.f3550E0.m26484V3(), new x9j() { // from class: l.qv80
            public final Object call(Object obj, Object obj2) {
                return new j760((User) obj, (PrivacyMembershipSetting) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.rv80
            public final void call(Object obj) {
                this.f20809a.m10659n((j760) obj);
            }
        }));
        if (NullChecker.a(this.f7425m)) {
            return;
        }
        CoreModule.f1534c.f3550E0.m26488Z3();
    }

    /* JADX INFO: renamed from: s */
    public final void m10664s(PutongFrag putongFrag) {
        if (NullChecker.a(this.f7425m) && xma.m27357N3()) {
            putongFrag.duringCreated(CoreModule.f1534c.f3550E0.m26480R3(this.f7425m)).subscribe(mkd0.H(new e30() { // from class: l.wv80
                public final void call(Object obj) {
                    this.f25423a.m10660o((roj0) obj);
                }
            }, new e30() { // from class: l.xv80
                public final void call(Object obj) {
                    yij0.D((Throwable) obj);
                }
            }));
        }
    }

    public PrivilegeDescListPartnerDressUpItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7424l = 0L;
    }

    public PrivilegeDescListPartnerDressUpItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7424l = 0L;
    }
}

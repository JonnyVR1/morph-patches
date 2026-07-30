package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.dac0;
import p149l.dv80;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.sb90;
import p149l.vwb;
import p149l.w0c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xma;
import p149l.yv80;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListPartnerDressUpItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f37632a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f37633b;

    /* JADX INFO: renamed from: c */
    public VRelative f37634c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f37635d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f37636e;

    /* JADX INFO: renamed from: f */
    public VImage f37637f;

    /* JADX INFO: renamed from: g */
    public VImage f37638g;

    /* JADX INFO: renamed from: h */
    public VText f37639h;

    /* JADX INFO: renamed from: i */
    public VText f37640i;

    /* JADX INFO: renamed from: j */
    public VSwitchButton f37641j;

    /* JADX INFO: renamed from: k */
    public View f37642k;

    /* JADX INFO: renamed from: l */
    public long f37643l;

    /* JADX INFO: renamed from: m */
    public PrivacyMembershipSetting f37644m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem$a */
    public static class C8992a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f37645a;

        /* JADX INFO: renamed from: b */
        public String f37646b;

        /* JADX INFO: renamed from: c */
        public Privilege f37647c;

        public C8992a(String str, String str2, Privilege privilege) {
            this.f37645a = str;
            this.f37646b = str2;
            this.f37647c = privilege;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 10;
        }
    }

    public PrivilegeDescListPartnerDressUpItem(Context context) {
        super(context);
        this.f37643l = 0L;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m57176e(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.m151595y("已为你打开神秘人模式");
        }
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: i */
    public final void m57180i(View view) {
        yv80.m216194a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m57181j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.f37643l > 2000;
        this.f37643l = jCurrentTimeMillis;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m57182k(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        if (!NullChecker.m81303a(this.f37644m)) {
            if (m57181j()) {
                CrashHelper.m81296c(new Exception("o_diamond_switch_error:privacyMembershipEditSetting is null"));
                CoreModule.f17545c.f19561E0.m203796Z3();
                return;
            }
            return;
        }
        zvf0.m220399u("e_supremepartner_skin", putongFrag.pageId(), vwb.m200311Y("skin_is_on", Boolean.valueOf(z)));
        if (this.f37644m.hideIcon.booleanValue() == z) {
            this.f37644m.hideIcon = Boolean.valueOf(!z);
            m57190s(putongFrag);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m57183l(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.m81303a(privacyMembershipSetting)) {
            this.f37644m = privacyMembershipSetting.mo223809clone();
            boolean zM210049N3 = xma.m210049N3();
            VSwitchButton vSwitchButton = this.f37641j;
            if (zM210049N3) {
                vSwitchButton.setCheckedNoEvent(!this.f37644m.hideIcon.booleanValue());
            } else {
                vSwitchButton.setCheckedNoEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m57184m(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            this.f37641j.setChecked(false);
            CrashHelper.m81296c(new Exception("mysteryman_switch_error:me user is null"));
            CoreModule.f17545c.f19561E0.m203796Z3();
            return;
        }
        if (this.f37644m == null) {
            this.f37641j.setChecked(false);
            CrashHelper.m81296c(new Exception("mysteryman_switch_error:privacyMembershipEditSetting is null"));
            CoreModule.f17545c.f19561E0.m203796Z3();
        } else {
            if (userM169527p9.isSupremePartnerOpenMystery() == z) {
                return;
            }
            if (z && this.f37644m.hideIcon.booleanValue()) {
                this.f37641j.setChecked(false);
                lsi0.m151595y("当前已隐藏会员身份，神秘人模式无法被打开");
            } else {
                zvf0.m220399u("e_mysteryman", putongFrag.pageId(), vwb.m200311Y("action", z ? "open" : "close"));
                if (xma.m210049N3()) {
                    putongFrag.duringCreated(CoreModule.f17545c.f19561E0.m203787Q3(z)).subscribe(mkd0.m154956H(new e30() { // from class: l.uv80
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            PrivilegeDescListPartnerDressUpItem.m57176e((Boolean) obj);
                        }
                    }, new e30() { // from class: l.vv80
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            yij0.m214926D((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57185n(j760 j760Var) {
        if (NullChecker.m81303a(j760Var.f116565b)) {
            this.f37644m = ((PrivacyMembershipSetting) j760Var.f116565b).mo223809clone();
        }
        if (NullChecker.m81303a(j760Var.f116564a)) {
            boolean zM210049N3 = xma.m210049N3();
            VSwitchButton vSwitchButton = this.f37641j;
            if (zM210049N3) {
                vSwitchButton.setCheckedNoEvent(((User) j760Var.f116564a).isSupremePartnerOpenMystery());
            } else {
                vSwitchButton.setCheckedNoEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m57186o(roj0 roj0Var) {
        if (this.f37644m.hideIcon.booleanValue()) {
            sb90.m183205a("supreme_partner_dress_up");
        }
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57180i(this);
        this.f37641j.setActiveSliderColor(getResources().getColor(w0c0.f183797Q));
    }

    /* JADX INFO: renamed from: p */
    public void m57187p(C8992a c8992a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        this.f37639h.setText(c8992a.f37645a);
        this.f37640i.setText(c8992a.f37646b);
        qib0.f154691G.m102331L0(this.f37636e, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        Privilege privilege = c8992a.f37647c;
        Privilege privilege2 = Privilege.mysterious_mode;
        View view = this.f37632a;
        if (privilege == privilege2) {
            xdl0.m208344M(view, true);
            m57189r(dac0Var, putongFrag);
        } else {
            xdl0.m208344M(view, false);
            m57188q(dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m57188q(dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        this.f37641j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.sv80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f166546a.m57182k(putongFrag, compoundButton, z);
            }
        });
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19561E0.m203792V3()).subscribe(mkd0.m154955G(new e30() { // from class: l.tv80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172272a.m57183l((PrivacyMembershipSetting) obj);
            }
        }));
        if (NullChecker.m81303a(this.f37644m)) {
            return;
        }
        CoreModule.f17545c.f19561E0.m203796Z3();
    }

    /* JADX INFO: renamed from: r */
    public final void m57189r(dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        this.f37641j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.pv80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f151428a.m57184m(putongFrag, compoundButton, z);
            }
        });
        dac0Var.mo67374c(putongFrag, mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19561E0.m203792V3(), new x9j() { // from class: l.qv80
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((User) obj, (PrivacyMembershipSetting) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.rv80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161180a.m57185n((j760) obj);
            }
        }));
        if (NullChecker.m81303a(this.f37644m)) {
            return;
        }
        CoreModule.f17545c.f19561E0.m203796Z3();
    }

    /* JADX INFO: renamed from: s */
    public final void m57190s(PutongFrag putongFrag) {
        if (NullChecker.m81303a(this.f37644m) && xma.m210049N3()) {
            putongFrag.duringCreated(CoreModule.f17545c.f19561E0.m203788R3(this.f37644m)).subscribe(mkd0.m154956H(new e30() { // from class: l.wv80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188224a.m57186o((roj0) obj);
                }
            }, new e30() { // from class: l.xv80
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        }
    }

    public PrivilegeDescListPartnerDressUpItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37643l = 0L;
    }

    public PrivilegeDescListPartnerDressUpItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37643l = 0L;
    }
}

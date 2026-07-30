package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bnl0;
import p153l.c490;
import p153l.c9c0;
import p153l.h390;
import p153l.i4g0;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.rcj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wj90;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListPartnerDressUpItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f38480a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f38481b;

    /* JADX INFO: renamed from: c */
    public VRelative f38482c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f38483d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f38484e;

    /* JADX INFO: renamed from: f */
    public VImage f38485f;

    /* JADX INFO: renamed from: g */
    public VImage f38486g;

    /* JADX INFO: renamed from: h */
    public VText f38487h;

    /* JADX INFO: renamed from: i */
    public VText f38488i;

    /* JADX INFO: renamed from: j */
    public VSwitchButton f38489j;

    /* JADX INFO: renamed from: k */
    public View f38490k;

    /* JADX INFO: renamed from: l */
    public long f38491l;

    /* JADX INFO: renamed from: m */
    public PrivacyMembershipSetting f38492m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem$a */
    public static class C9155a implements h390 {

        /* JADX INFO: renamed from: a */
        public String f38493a;

        /* JADX INFO: renamed from: b */
        public String f38494b;

        /* JADX INFO: renamed from: c */
        public Privilege f38495c;

        public C9155a(String str, String str2, Privilege privilege) {
            this.f38493a = str;
            this.f38494b = str2;
            this.f38495c = privilege;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 10;
        }
    }

    public PrivilegeDescListPartnerDressUpItem(Context context) {
        super(context);
        this.f38491l = 0L;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m58359e(Boolean bool) {
        if (bool.booleanValue()) {
            o1j0.m165651y("已为你打开神秘人模式");
        }
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: i */
    public final void m58363i(View view) {
        c490.m107865a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m58364j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.f38491l > 2000;
        this.f38491l = jCurrentTimeMillis;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m58365k(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        if (!NullChecker.m82486a(this.f38492m)) {
            if (m58364j()) {
                CrashHelper.m82479c(new Exception("o_diamond_switch_error:privacyMembershipEditSetting is null"));
                CoreModule.f18264c.f20303E0.m141084Z3();
                return;
            }
            return;
        }
        i4g0.m138523u("e_supremepartner_skin", putongFrag.pageId(), jyb.m147494Y("skin_is_on", Boolean.valueOf(z)));
        if (this.f38492m.hideIcon.booleanValue() == z) {
            this.f38492m.hideIcon = Boolean.valueOf(!z);
            m58373s(putongFrag);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m58366l(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.m82486a(privacyMembershipSetting)) {
            this.f38492m = privacyMembershipSetting.mo225055clone();
            boolean zM146363O3 = joa.m146363O3();
            VSwitchButton vSwitchButton = this.f38489j;
            if (zM146363O3) {
                vSwitchButton.setCheckedNoEvent(!this.f38492m.hideIcon.booleanValue());
            } else {
                vSwitchButton.setCheckedNoEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m58367m(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            this.f38489j.setChecked(false);
            CrashHelper.m82479c(new Exception("mysteryman_switch_error:me user is null"));
            CoreModule.f18264c.f20303E0.m141084Z3();
            return;
        }
        if (this.f38492m == null) {
            this.f38489j.setChecked(false);
            CrashHelper.m82479c(new Exception("mysteryman_switch_error:privacyMembershipEditSetting is null"));
            CoreModule.f18264c.f20303E0.m141084Z3();
        } else {
            if (userM116600p9.isSupremePartnerOpenMystery() == z) {
                return;
            }
            if (z && this.f38492m.hideIcon.booleanValue()) {
                this.f38489j.setChecked(false);
                o1j0.m165651y("当前已隐藏会员身份，神秘人模式无法被打开");
            } else {
                i4g0.m138523u("e_mysteryman", putongFrag.pageId(), jyb.m147494Y("action", z ? "open" : "close"));
                if (joa.m146363O3()) {
                    putongFrag.duringCreated(CoreModule.f18264c.f20303E0.m141075Q3(z)).subscribe(psd0.m173597H(new y20() { // from class: l.y390
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            PrivilegeDescListPartnerDressUpItem.m58359e((Boolean) obj);
                        }
                    }, new y20() { // from class: l.z390
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            bsj0.m106246D((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m58368n(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            this.f38492m = ((PrivacyMembershipSetting) pf60Var.f152157b).mo225055clone();
        }
        if (NullChecker.m82486a(pf60Var.f152156a)) {
            boolean zM146363O3 = joa.m146363O3();
            VSwitchButton vSwitchButton = this.f38489j;
            if (zM146363O3) {
                vSwitchButton.setCheckedNoEvent(((User) pf60Var.f152156a).isSupremePartnerOpenMystery());
            } else {
                vSwitchButton.setCheckedNoEvent(false);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m58369o(uxj0 uxj0Var) {
        if (this.f38492m.hideIcon.booleanValue()) {
            wj90.m206618a("supreme_partner_dress_up");
        }
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58363i(this);
        this.f38489j.setActiveSliderColor(getResources().getColor(c9c0.f80369R));
    }

    /* JADX INFO: renamed from: p */
    public void m58370p(C9155a c9155a, jic0<h390> jic0Var, PutongFrag putongFrag) {
        this.f38487h.setText(c9155a.f38493a);
        this.f38488i.setText(c9155a.f38494b);
        uqb0.f180374G.m127115L0(this.f38484e, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        Privilege privilege = c9155a.f38495c;
        Privilege privilege2 = Privilege.mysterious_mode;
        View view = this.f38480a;
        if (privilege == privilege2) {
            bnl0.m105524M(view, true);
            m58372r(jic0Var, putongFrag);
        } else {
            bnl0.m105524M(view, false);
            m58371q(jic0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m58371q(jic0<h390> jic0Var, final PutongFrag putongFrag) {
        this.f38489j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.w390
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f187113a.m58365k(putongFrag, compoundButton, z);
            }
        });
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20303E0.m141080V3()).subscribe(psd0.m173596G(new y20() { // from class: l.x390
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192237a.m58366l((PrivacyMembershipSetting) obj);
            }
        }));
        if (NullChecker.m82486a(this.f38492m)) {
            return;
        }
        CoreModule.f18264c.f20303E0.m141084Z3();
    }

    /* JADX INFO: renamed from: r */
    public final void m58372r(jic0<h390> jic0Var, final PutongFrag putongFrag) {
        this.f38489j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.t390
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f171907a.m58367m(putongFrag, compoundButton, z);
            }
        });
        jic0Var.mo68557c(putongFrag, psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20303E0.m141080V3(), new rcj() { // from class: l.u390
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((User) obj, (PrivacyMembershipSetting) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.v390
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182173a.m58368n((pf60) obj);
            }
        }));
        if (NullChecker.m82486a(this.f38492m)) {
            return;
        }
        CoreModule.f18264c.f20303E0.m141084Z3();
    }

    /* JADX INFO: renamed from: s */
    public final void m58373s(PutongFrag putongFrag) {
        if (NullChecker.m82486a(this.f38492m) && joa.m146363O3()) {
            putongFrag.duringCreated(CoreModule.f18264c.f20303E0.m141076R3(this.f38492m)).subscribe(psd0.m173597H(new y20() { // from class: l.a490
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68367a.m58369o((uxj0) obj);
                }
            }, new y20() { // from class: l.b490
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        }
    }

    public PrivilegeDescListPartnerDressUpItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38491l = 0L;
    }

    public PrivilegeDescListPartnerDressUpItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38491l = 0L;
    }
}

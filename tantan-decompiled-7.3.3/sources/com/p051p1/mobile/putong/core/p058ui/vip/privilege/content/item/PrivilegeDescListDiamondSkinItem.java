package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.d390;
import p153l.dbc0;
import p153l.h390;
import p153l.i4g0;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.psd0;
import p153l.qa00;
import p153l.s7a;
import p153l.uqb0;
import p153l.wib0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListDiamondSkinItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f38432a;

    /* JADX INFO: renamed from: b */
    public VRelative f38433b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f38434c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f38435d;

    /* JADX INFO: renamed from: e */
    public VImage f38436e;

    /* JADX INFO: renamed from: f */
    public VImage f38437f;

    /* JADX INFO: renamed from: g */
    public VText f38438g;

    /* JADX INFO: renamed from: h */
    public VText f38439h;

    /* JADX INFO: renamed from: i */
    public VSwitchButton f38440i;

    /* JADX INFO: renamed from: j */
    public View f38441j;

    /* JADX INFO: renamed from: k */
    public long f38442k;

    /* JADX INFO: renamed from: l */
    public PrivacyMembershipSetting f38443l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem$a */
    public static class C9150a implements h390 {

        /* JADX INFO: renamed from: a */
        public String f38444a;

        /* JADX INFO: renamed from: b */
        public String f38445b;

        public C9150a(String str, String str2) {
            this.f38444a = str;
            this.f38445b = str2;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 6;
        }
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context) {
        super(context);
        this.f38442k = 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m58293e(View view) {
        d390.m113797a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58294f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.f38442k > 2000;
        this.f38442k = jCurrentTimeMillis;
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m58295g(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        if (!NullChecker.m82486a(this.f38443l)) {
            if (m58294f()) {
                CrashHelper.m82479c(new Exception("o_diamond_switch_error:privacyMembershipEditSetting is null"));
                CoreModule.f18264c.f20303E0.m141084Z3();
                return;
            }
            return;
        }
        i4g0.m138523u("e_exclusive_skin", putongFrag.pageId(), jyb.m147494Y("skin_is_on", Boolean.valueOf(z)));
        if (this.f38443l.hideIcon.booleanValue() == z) {
            this.f38443l.hideIcon = Boolean.valueOf(!z);
            m58298j(putongFrag);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m58296h(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.m82486a(privacyMembershipSetting)) {
            this.f38443l = privacyMembershipSetting.mo225055clone();
            boolean zM146357G3 = joa.m146357G3();
            VSwitchButton vSwitchButton = this.f38440i;
            if (zM146357G3) {
                vSwitchButton.setChecked(!this.f38443l.hideIcon.booleanValue());
            } else {
                vSwitchButton.setChecked(true);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m58297i(C9150a c9150a, jic0<h390> jic0Var, final PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f38438g.setText(c9150a.f38444a);
        this.f38439h.setText("专属边框随时彰显与众不同");
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            this.f38432a.setBackgroundResource(dbc0.f86283Ji);
            this.f38438g.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38439h.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38440i.setThumbActiveColor(getResources().getColor(c9c0.f80410d1));
            this.f38440i.setThumbInActiveColor(getResources().getColor(c9c0.f80402b1));
            this.f38440i.setActiveSliderColor(getResources().getColor(c9c0.f80423h1));
            this.f38441j.setBackgroundResource(c9c0.f80420g1);
        }
        uqb0.f180374G.m127115L0(this.f38435d, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        this.f38440i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.z290
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f202662a.m58295g(putongFrag, compoundButton, z);
            }
        });
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20303E0.m141080V3()).subscribe(psd0.m173596G(new y20() { // from class: l.a390
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68282a.m58296h((PrivacyMembershipSetting) obj);
            }
        }));
        if (NullChecker.m82486a(this.f38443l)) {
            return;
        }
        CoreModule.f18264c.f20303E0.m141084Z3();
    }

    /* JADX INFO: renamed from: j */
    public final void m58298j(PutongFrag putongFrag) {
        if (NullChecker.m82486a(this.f38443l) && joa.m146357G3()) {
            putongFrag.duringCreated(CoreModule.f18264c.f20303E0.m141076R3(this.f38443l)).subscribe(psd0.m173597H(new y20() { // from class: l.b390
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                }
            }, new y20() { // from class: l.c390
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58293e(this);
        bnl0.m105538V(this.f38433b, qa00.m175859d(15.0f));
        bnl0.m105539W(this.f38437f, qa00.m175859d(2.0f));
        this.f38438g.setTextColor(Color.parseColor("#e0000000"));
        this.f38439h.setTextColor(Color.parseColor("#66000000"));
        this.f38440i.setThumbActiveColor(Color.parseColor("#A06A20"));
        this.f38440i.setThumbInActiveColor(Color.parseColor("#F0E2CF"));
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38442k = 0L;
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38442k = 0L;
    }
}

package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.dac0;
import l.e30;
import l.j760;
import l.mkd0;
import l.sab0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zu80;
import l.zvf0;
import p006l.dv80;
import p006l.g6a;
import p006l.qib0;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VSwitchButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListDiamondSkinItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7365a;

    /* JADX INFO: renamed from: b */
    public VRelative f7366b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f7367c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f7368d;

    /* JADX INFO: renamed from: e */
    public VImage f7369e;

    /* JADX INFO: renamed from: f */
    public VImage f7370f;

    /* JADX INFO: renamed from: g */
    public VText f7371g;

    /* JADX INFO: renamed from: h */
    public VText f7372h;

    /* JADX INFO: renamed from: i */
    public VSwitchButton f7373i;

    /* JADX INFO: renamed from: j */
    public View f7374j;

    /* JADX INFO: renamed from: k */
    public long f7375k;

    /* JADX INFO: renamed from: l */
    public PrivacyMembershipSetting f7376l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem$a */
    public static class C0423a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f7377a;

        /* JADX INFO: renamed from: b */
        public String f7378b;

        public C0423a(String str, String str2) {
            this.f7377a = str;
            this.f7378b = str2;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 6;
        }
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context) {
        super(context);
        this.f7375k = 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m10581e(View view) {
        zu80.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10582f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.f7375k > 2000;
        this.f7375k = jCurrentTimeMillis;
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m10583g(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        if (!NullChecker.a(this.f7376l)) {
            if (m10582f()) {
                CrashHelper.c(new Exception("o_diamond_switch_error:privacyMembershipEditSetting is null"));
                CoreModule.f1534c.f3550E0.m26488Z3();
                return;
            }
            return;
        }
        zvf0.u("e_exclusive_skin", putongFrag.pageId(), new j760[]{vwb.Y("skin_is_on", Boolean.valueOf(z))});
        if (this.f7376l.hideIcon.booleanValue() == z) {
            this.f7376l.hideIcon = Boolean.valueOf(!z);
            m10586j(putongFrag);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m10584h(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.a(privacyMembershipSetting)) {
            this.f7376l = privacyMembershipSetting.clone();
            boolean zM27351F3 = xma.m27351F3();
            VSwitchButton vSwitchButton = this.f7373i;
            if (zM27351F3) {
                vSwitchButton.setChecked(!this.f7376l.hideIcon.booleanValue());
            } else {
                vSwitchButton.setChecked(true);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m10585i(C0423a c0423a, dac0<dv80> dac0Var, final PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f7371g.setText(c0423a.f7377a);
        this.f7372h.setText("专属边框随时彰显与众不同");
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            this.f7365a.setBackgroundResource(x2c0.f26364Vh);
            this.f7371g.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7372h.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7373i.setThumbActiveColor(getResources().getColor(w0c0.f24677c1));
            this.f7373i.setThumbInActiveColor(getResources().getColor(w0c0.f24669a1));
            this.f7373i.setActiveSliderColor(getResources().getColor(w0c0.f24690g1));
            this.f7374j.setBackgroundResource(w0c0.f24687f1);
        }
        qib0.f19782G.m12744L0(this.f7368d, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
        this.f7373i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vu80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f24466a.m10583g(putongFrag, compoundButton, z);
            }
        });
        dac0Var.c(putongFrag, CoreModule.f1534c.f3550E0.m26484V3()).subscribe(mkd0.G(new e30() { // from class: l.wu80
            public final void call(Object obj) {
                this.f25414a.m10584h((PrivacyMembershipSetting) obj);
            }
        }));
        if (NullChecker.a(this.f7376l)) {
            return;
        }
        CoreModule.f1534c.f3550E0.m26488Z3();
    }

    /* JADX INFO: renamed from: j */
    public final void m10586j(PutongFrag putongFrag) {
        if (NullChecker.a(this.f7376l) && xma.m27351F3()) {
            putongFrag.duringCreated(CoreModule.f1534c.f3550E0.m26480R3(this.f7376l)).subscribe(mkd0.H(new e30() { // from class: l.xu80
                public final void call(Object obj) {
                    CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
                }
            }, new e30() { // from class: l.yu80
                public final void call(Object obj) {
                    yij0.D((Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10581e(this);
        xdl0.V(this.f7366b, t100.d(15.0f));
        xdl0.W(this.f7370f, t100.d(2.0f));
        this.f7371g.setTextColor(Color.parseColor("#e0000000"));
        this.f7372h.setTextColor(Color.parseColor("#66000000"));
        this.f7373i.setThumbActiveColor(Color.parseColor("#A06A20"));
        this.f7373i.setThumbInActiveColor(Color.parseColor("#F0E2CF"));
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7375k = 0L;
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7375k = 0L;
    }
}

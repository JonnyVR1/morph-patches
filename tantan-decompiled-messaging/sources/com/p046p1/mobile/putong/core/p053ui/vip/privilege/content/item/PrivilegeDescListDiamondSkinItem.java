package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.PurchaseType;
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
import p149l.g6a;
import p149l.mkd0;
import p149l.qib0;
import p149l.sab0;
import p149l.t100;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.zu80;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListDiamondSkinItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f37584a;

    /* JADX INFO: renamed from: b */
    public VRelative f37585b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f37586c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f37587d;

    /* JADX INFO: renamed from: e */
    public VImage f37588e;

    /* JADX INFO: renamed from: f */
    public VImage f37589f;

    /* JADX INFO: renamed from: g */
    public VText f37590g;

    /* JADX INFO: renamed from: h */
    public VText f37591h;

    /* JADX INFO: renamed from: i */
    public VSwitchButton f37592i;

    /* JADX INFO: renamed from: j */
    public View f37593j;

    /* JADX INFO: renamed from: k */
    public long f37594k;

    /* JADX INFO: renamed from: l */
    public PrivacyMembershipSetting f37595l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem$a */
    public static class C8987a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f37596a;

        /* JADX INFO: renamed from: b */
        public String f37597b;

        public C8987a(String str, String str2) {
            this.f37596a = str;
            this.f37597b = str2;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 6;
        }
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context) {
        super(context);
        this.f37594k = 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m57110e(View view) {
        zu80.m220201a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57111f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - this.f37594k > 2000;
        this.f37594k = jCurrentTimeMillis;
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m57112g(PutongFrag putongFrag, CompoundButton compoundButton, boolean z) {
        if (!NullChecker.m81303a(this.f37595l)) {
            if (m57111f()) {
                CrashHelper.m81296c(new Exception("o_diamond_switch_error:privacyMembershipEditSetting is null"));
                CoreModule.f17545c.f19561E0.m203796Z3();
                return;
            }
            return;
        }
        zvf0.m220399u("e_exclusive_skin", putongFrag.pageId(), vwb.m200311Y("skin_is_on", Boolean.valueOf(z)));
        if (this.f37595l.hideIcon.booleanValue() == z) {
            this.f37595l.hideIcon = Boolean.valueOf(!z);
            m57115j(putongFrag);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m57113h(PrivacyMembershipSetting privacyMembershipSetting) {
        if (NullChecker.m81303a(privacyMembershipSetting)) {
            this.f37595l = privacyMembershipSetting.mo223809clone();
            boolean zM210043F3 = xma.m210043F3();
            VSwitchButton vSwitchButton = this.f37592i;
            if (zM210043F3) {
                vSwitchButton.setChecked(!this.f37595l.hideIcon.booleanValue());
            } else {
                vSwitchButton.setChecked(true);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m57114i(C8987a c8987a, dac0<dv80> dac0Var, final PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f37590g.setText(c8987a.f37596a);
        this.f37591h.setText("专属边框随时彰显与众不同");
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            this.f37584a.setBackgroundResource(x2c0.f189828Vh);
            this.f37590g.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37591h.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37592i.setThumbActiveColor(getResources().getColor(w0c0.f183837c1));
            this.f37592i.setThumbInActiveColor(getResources().getColor(w0c0.f183829a1));
            this.f37592i.setActiveSliderColor(getResources().getColor(w0c0.f183850g1));
            this.f37593j.setBackgroundResource(w0c0.f183847f1);
        }
        qib0.f154691G.m102331L0(this.f37587d, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        this.f37592i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vu80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f183040a.m57112g(putongFrag, compoundButton, z);
            }
        });
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19561E0.m203792V3()).subscribe(mkd0.m154955G(new e30() { // from class: l.wu80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188097a.m57113h((PrivacyMembershipSetting) obj);
            }
        }));
        if (NullChecker.m81303a(this.f37595l)) {
            return;
        }
        CoreModule.f17545c.f19561E0.m203796Z3();
    }

    /* JADX INFO: renamed from: j */
    public final void m57115j(PutongFrag putongFrag) {
        if (NullChecker.m81303a(this.f37595l) && xma.m210043F3()) {
            putongFrag.duringCreated(CoreModule.f17545c.f19561E0.m203788R3(this.f37595l)).subscribe(mkd0.m154956H(new e30() { // from class: l.xu80
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                }
            }, new e30() { // from class: l.yu80
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57110e(this);
        xdl0.m208358V(this.f37585b, t100.m186890d(15.0f));
        xdl0.m208359W(this.f37589f, t100.m186890d(2.0f));
        this.f37590g.setTextColor(Color.parseColor("#e0000000"));
        this.f37591h.setTextColor(Color.parseColor("#66000000"));
        this.f37592i.setThumbActiveColor(Color.parseColor("#A06A20"));
        this.f37592i.setThumbInActiveColor(Color.parseColor("#F0E2CF"));
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37594k = 0L;
    }

    public PrivilegeDescListDiamondSkinItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37594k = 0L;
    }
}

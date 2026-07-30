package com.p046p1.mobile.putong.core.p053ui.match;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import p149l.a5x;
import p149l.d30;
import p149l.dyq;
import p149l.e30;
import p149l.h6x;
import p149l.i0e;
import p149l.i4x;
import p149l.j760;
import p149l.k7x;
import p149l.l5x;
import p149l.lw40;
import p149l.ogl0;
import p149l.ow40;
import p149l.ozb0;
import p149l.pa30;
import p149l.rol;
import p149l.sbx;
import p149l.sdx;
import p149l.upa;
import p149l.vdx;
import p149l.vwb;
import p149l.w5x;
import p149l.w6x;
import p149l.xdl0;
import p149l.xma;
import p149l.y8x;
import p149l.y9x;
import p149l.yvl;
import p149l.z4x;
import p149l.zax;

/* JADX INFO: loaded from: classes3.dex */
public class MatchAct extends PutongAct implements dyq, rol {

    /* JADX INFO: renamed from: c */
    public l5x f30467c;

    /* JADX INFO: renamed from: d */
    public yvl f30468d;

    /* JADX INFO: renamed from: e */
    public String f30469e;

    /* JADX INFO: renamed from: f */
    public String f30470f = "";

    /* JADX INFO: renamed from: g */
    public boolean f30471g = false;

    /* JADX INFO: renamed from: h */
    public int f30472h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f30473i = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.MatchAct$a */
    public static class C8453a<FROM extends Act, TO extends Act> extends Act.AbstractC4304w<FROM, TO> {
        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: b */
        public boolean mo20408b() {
            return true;
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: e */
        public boolean mo20411e() {
            return true;
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: f */
        public void mo20412f(Act act) {
            act.overridePendingTransition(ozb0.f146415c, 0);
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: g */
        public void mo20413g(Act act) {
            act.overridePendingTransition(0, ozb0.f146416d);
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator mo20409c(FROM from, TO to) {
            return to.enterAnimation();
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Animator mo20410d(FROM from, TO to) {
            return to.exitAnimation();
        }

        @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo20414h(FROM from, TO to) {
            to.initAnimationState();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.MatchAct$b */
    public static class C8454b<T extends Act> extends Act.C4300s<T, Act> {
        @Override // com.p046p1.mobile.android.app.Act.C4300s, com.p046p1.mobile.android.app.Act.AbstractC4304w
        /* JADX INFO: renamed from: i */
        public Animator mo20409c(T t, Act act) {
            boolean z = act instanceof MatchAct;
            if (z && a5x.m95062b()) {
                return act.enterAnimation();
            }
            if (!z || IntlCountryCodeController.m28126v()) {
                return super.mo20409c(t, act);
            }
            a5x.m95061a(t, act, 0);
            return act.enterAnimation();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m47555V1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_enter_time = Integer.parseInt(str);
            CoreModule.f17545c.f19639e0.f149360e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m47556X1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_keyboard_show_time = Integer.parseInt(str);
            CoreModule.f17545c.f19639e0.f149360e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m47557Y1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_keyboard_show_head_time = Integer.parseInt(str);
            CoreModule.f17545c.f19639e0.f149360e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m47559a2(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_exit_time = Integer.parseInt(str);
            CoreModule.f17545c.f19639e0.f149360e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m47563e2(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2) {
        return m47564g2(act, arrayList, i, arrayList2, null);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m47564g2(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str) {
        Intent intent = new Intent(act, (Class<?>) MatchAct.class);
        intent.putStringArrayListExtra("user_list", arrayList);
        intent.putExtra("match_type", i);
        intent.putStringArrayListExtra("extra_list", arrayList2);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        final MatchSuccessAnimTime matchSuccessAnimTimeM167982l = pa30.m167982l();
        arrayList.add(vwb.m200311Y("男性 进入动画时间 " + matchSuccessAnimTimeM167982l.male_enter_time, new d30() { // from class: l.n3x
            @Override // p149l.d30
            public final void call() {
                this.f137031a.m47567k2(matchSuccessAnimTimeM167982l);
            }
        }));
        arrayList.add(vwb.m200311Y("男性 键盘弹起动画时间 " + matchSuccessAnimTimeM167982l.male_keyboard_show_time, new d30() { // from class: l.o3x
            @Override // p149l.d30
            public final void call() {
                this.f141715a.m47568l2(matchSuccessAnimTimeM167982l);
            }
        }));
        arrayList.add(vwb.m200311Y("男性 头像收起动画时间 " + matchSuccessAnimTimeM167982l.male_keyboard_show_head_time, new d30() { // from class: l.p3x
            @Override // p149l.d30
            public final void call() {
                this.f147023a.m47569m2(matchSuccessAnimTimeM167982l);
            }
        }));
        arrayList.add(vwb.m200311Y("男性 退出动画时间 " + matchSuccessAnimTimeM167982l.male_exit_time, new d30() { // from class: l.q3x
            @Override // p149l.d30
            public final void call() {
                this.f152524a.m47570n2(matchSuccessAnimTimeM167982l);
            }
        }));
        return arrayList;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Animator enterAnimation() {
        return this.f30468d.enterAnimation();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Animator exitAnimation() {
        return this.f30468d.exitAnimation();
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        this.f30468d.mo129557h(i, i2);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m47565h2() {
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("user_list");
        if (vwb.m200296J(stringArrayListExtra)) {
            return;
        }
        this.f30470f = stringArrayListExtra.get(0);
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m47566i2(int i) {
        return i == 40 || i == 41 || i == 42 || i == 43 || i == 45 || i == 46;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30468d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initAnimationState() {
        this.f30468d.initAnimationState();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        m47565h2();
        super.initDataOnCreate();
        int intExtra = getIntent().getIntExtra("match_type", 0);
        if (intExtra == 46) {
            this.f30467c = new lw40(this);
            this.f30468d = new ow40(this);
        } else if (a5x.m95062b()) {
            getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            this.f30467c = new w5x(this);
            this.f30468d = new h6x(this);
        } else if ((upa.m194755g2() || (upa.m194765i2() && TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "male"))) && !C8140a.m41831p(this.f30470f) && CoreModule.f17545c.f19608T1.m199967B3(this.f30470f)) {
            this.f30467c = new w6x(this);
            this.f30468d = new k7x(this);
        } else if (ogl0.m164240S() && (intExtra == 42 || intExtra == 43 || intExtra == 45)) {
            this.f30471g = true;
            this.f30467c = new zax(this);
            this.f30468d = new sbx(this);
        } else if (upa.m194791n3() && !m47566i2(intExtra)) {
            this.f30471g = true;
            getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
            setLightStatusBar(1024);
            this.f30467c = new sdx(this);
            this.f30468d = new vdx(this);
        } else if (IntlCountryCodeController.m28126v()) {
            if (intExtra == 50 || intExtra == 51) {
                this.f30471g = true;
                getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(0);
                setLightStatusBar(1024);
            }
            this.f30467c = new i4x(this);
            this.f30468d = new z4x(this);
        } else {
            if (intExtra == 50 || intExtra == 51) {
                this.f30471g = true;
                getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(0);
                setLightStatusBar(1024);
            } else {
                getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            }
            this.f30467c = new y8x(this);
            this.f30468d = new y9x(this);
        }
        this.f30469e = getIntent().getStringExtra("from");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_list");
        this.f30467c.mo134431q0(this.f30470f, intExtra, getIntent().getStringArrayListExtra("user_list"), stringArrayListExtra);
        this.f30467c.m148675t0(this.pageHelper, this.f30469e);
        this.f30467c.mo51532C(this.f30468d);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30467c.mo39470a0();
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f30472h = intExtra;
        if (intExtra == 48 || intExtra == 49 || intExtra == 47) {
            this.pageHelper.m109041q("p_intl_premium_match");
            this.pageHelper.m109040p(vwb.m200311Y("if_premuim", Boolean.valueOf(!xma.m210071e4())));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m47567k2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.m133795d(this).m133819I("时间 = " + matchSuccessAnimTime.male_enter_time).m133816F(new e30() { // from class: l.u3x
            @Override // p149l.e30
            public final void call(Object obj) {
                MatchAct.m47555V1(matchSuccessAnimTime, (String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m47568l2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.m133795d(this).m133819I("时间 = " + matchSuccessAnimTime.male_keyboard_show_time).m133816F(new e30() { // from class: l.t3x
            @Override // p149l.e30
            public final void call(Object obj) {
                MatchAct.m47556X1(matchSuccessAnimTime, (String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m47569m2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.m133795d(this).m133819I("时间 = " + matchSuccessAnimTime.male_keyboard_show_head_time).m133816F(new e30() { // from class: l.r3x
            @Override // p149l.e30
            public final void call(Object obj) {
                MatchAct.m47557Y1(matchSuccessAnimTime, (String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m47570n2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.m133795d(this).m133819I("时间 = " + matchSuccessAnimTime.male_exit_time).m133816F(new e30() { // from class: l.s3x
            @Override // p149l.e30
            public final void call(Object obj) {
                MatchAct.m47559a2(matchSuccessAnimTime, (String) obj);
            }
        }).m133821n().show();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f30472h = intExtra;
        if (intExtra == 48 || intExtra == 49 || intExtra == 50 || intExtra == 51) {
            return true;
        }
        return super.needBindBillingService();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m66873d2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity
    public void overridePendingTransition(int i, int i2) {
        if (this.f30473i) {
            super.overridePendingTransition(i, i2);
        }
        this.f30473i = false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        this.f30472h = getIntent().getIntExtra("match_type", 0);
        if (!TextUtils.isEmpty(this.f30470f) && C8140a.m41831p(this.f30470f)) {
            return "p_limited_time_match";
        }
        int i = this.f30472h;
        if (i == 48 || i == 49 || i == 47) {
            return "p_intl_premium_match";
        }
        return i == 50 ? "p_intl_instantmatch_no_ultra_view" : "p_successful_match_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f30472h = intExtra;
        if (intExtra == 46) {
            this.f30471g = true;
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            getWindow().setStatusBarColor(0);
            setLightStatusBar(1024);
            getWindow().getDecorView().setPadding(0, xdl0.m208331F0(), 0, 0);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        if (this.f30471g) {
            int i = this.f30472h;
            if (i == 46 || i == 51) {
                this.act.getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            } else {
                setLightStatusBar(1024);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return this.f30471g;
    }
}

package com.p051p1.mobile.putong.core.p058ui.match;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import p153l.a550;
import p153l.bnl0;
import p153l.crl;
import p153l.d0r;
import p153l.d550;
import p153l.dj30;
import p153l.g9x;
import p153l.gra;
import p153l.h7x;
import p153l.jax;
import p153l.joa;
import p153l.jyb;
import p153l.k8x;
import p153l.pf60;
import p153l.qyl;
import p153l.rex;
import p153l.rgx;
import p153l.spl0;
import p153l.u7c0;
import p153l.ugx;
import p153l.v8x;
import p153l.v9x;
import p153l.w1e;
import p153l.x20;
import p153l.xbx;
import p153l.xcx;
import p153l.y20;
import p153l.y7x;
import p153l.ydx;
import p153l.z7x;

/* JADX INFO: loaded from: classes3.dex */
public class MatchAct extends PutongAct implements d0r, crl {

    /* JADX INFO: renamed from: c */
    public k8x f31315c;

    /* JADX INFO: renamed from: d */
    public qyl f31316d;

    /* JADX INFO: renamed from: e */
    public String f31317e;

    /* JADX INFO: renamed from: f */
    public String f31318f = "";

    /* JADX INFO: renamed from: g */
    public boolean f31319g = false;

    /* JADX INFO: renamed from: h */
    public int f31320h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f31321i = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.MatchAct$a */
    public static class C8616a<FROM extends Act, TO extends Act> extends Act.AbstractC4455w<FROM, TO> {
        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: b */
        public boolean mo21407b() {
            return true;
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: e */
        public boolean mo21410e() {
            return true;
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: f */
        public void mo21411f(Act act) {
            act.overridePendingTransition(u7c0.f177897c, 0);
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: g */
        public void mo21412g(Act act) {
            act.overridePendingTransition(0, u7c0.f177898d);
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator mo21408c(FROM from, TO to) {
            return to.enterAnimation();
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Animator mo21409d(FROM from, TO to) {
            return to.exitAnimation();
        }

        @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo21413h(FROM from, TO to) {
            to.initAnimationState();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.MatchAct$b */
    public static class C8617b<T extends Act> extends Act.C4451s<T, Act> {
        @Override // com.p051p1.mobile.android.app.Act.C4451s, com.p051p1.mobile.android.app.Act.AbstractC4455w
        /* JADX INFO: renamed from: i */
        public Animator mo21408c(T t, Act act) {
            boolean z = act instanceof MatchAct;
            if (z && z7x.m218925b()) {
                return act.enterAnimation();
            }
            if (!z || IntlCountryCodeController.m29125v()) {
                return super.mo21408c(t, act);
            }
            z7x.m218924a(t, act, 0);
            return act.enterAnimation();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m48738X1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_enter_time = Integer.parseInt(str);
            CoreModule.f18264c.f20381e0.f89217e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m48739Y1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_keyboard_show_time = Integer.parseInt(str);
            CoreModule.f18264c.f20381e0.f89217e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m48740Z1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_keyboard_show_head_time = Integer.parseInt(str);
            CoreModule.f18264c.f20381e0.f89217e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m48742b2(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_exit_time = Integer.parseInt(str);
            CoreModule.f18264c.f20381e0.f89217e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m48746g2(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2) {
        return m48747h2(act, arrayList, i, arrayList2, null);
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m48747h2(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str) {
        Intent intent = new Intent(act, (Class<?>) MatchAct.class);
        intent.putStringArrayListExtra("user_list", arrayList);
        intent.putExtra("match_type", i);
        intent.putStringArrayListExtra("extra_list", arrayList2);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        final MatchSuccessAnimTime matchSuccessAnimTimeM116035l = dj30.m116035l();
        arrayList.add(jyb.m147494Y("男性 进入动画时间 " + matchSuccessAnimTimeM116035l.male_enter_time, new x20() { // from class: l.m6x
            @Override // p153l.x20
            public final void call() {
                this.f135038a.m48750l2(matchSuccessAnimTimeM116035l);
            }
        }));
        arrayList.add(jyb.m147494Y("男性 键盘弹起动画时间 " + matchSuccessAnimTimeM116035l.male_keyboard_show_time, new x20() { // from class: l.n6x
            @Override // p153l.x20
            public final void call() {
                this.f140497a.m48751m2(matchSuccessAnimTimeM116035l);
            }
        }));
        arrayList.add(jyb.m147494Y("男性 头像收起动画时间 " + matchSuccessAnimTimeM116035l.male_keyboard_show_head_time, new x20() { // from class: l.o6x
            @Override // p153l.x20
            public final void call() {
                this.f145218a.m48752n2(matchSuccessAnimTimeM116035l);
            }
        }));
        arrayList.add(jyb.m147494Y("男性 退出动画时间 " + matchSuccessAnimTimeM116035l.male_exit_time, new x20() { // from class: l.p6x
            @Override // p153l.x20
            public final void call() {
                this.f150882a.m48753o2(matchSuccessAnimTimeM116035l);
            }
        }));
        return arrayList;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Animator enterAnimation() {
        return this.f31316d.enterAnimation();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Animator exitAnimation() {
        return this.f31316d.exitAnimation();
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        this.f31316d.mo114282h(i, i2);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m48748i2() {
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("user_list");
        if (jyb.m147479J(stringArrayListExtra)) {
            return;
        }
        this.f31318f = stringArrayListExtra.get(0);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31316d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initAnimationState() {
        this.f31316d.initAnimationState();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        m48748i2();
        super.initDataOnCreate();
        int intExtra = getIntent().getIntExtra("match_type", 0);
        if (intExtra == 46) {
            this.f31315c = new a550(this);
            this.f31316d = new d550(this);
        } else if (z7x.m218925b()) {
            getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            this.f31315c = new v8x(this);
            this.f31316d = new g9x(this);
        } else if ((gra.m131686g2() || (gra.m131696i2() && TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "male"))) && !C8291a.m42842p(this.f31318f) && CoreModule.f18264c.f20350T1.m137301B3(this.f31318f)) {
            this.f31315c = new v9x(this);
            this.f31316d = new jax(this);
        } else if (spl0.m187367S() && (intExtra == 42 || intExtra == 43 || intExtra == 45)) {
            this.f31319g = true;
            this.f31315c = new ydx(this);
            this.f31316d = new rex(this);
        } else if (gra.m131722n3() && !m48749k2(intExtra)) {
            this.f31319g = true;
            getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
            setLightStatusBar(1024);
            this.f31315c = new rgx(this);
            this.f31316d = new ugx(this);
        } else if (IntlCountryCodeController.m29125v()) {
            if (intExtra == 50 || intExtra == 51) {
                this.f31319g = true;
                getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(0);
                setLightStatusBar(1024);
            }
            this.f31315c = new h7x(this);
            this.f31316d = new y7x(this);
        } else {
            if (intExtra == 50 || intExtra == 51) {
                this.f31319g = true;
                getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(0);
                setLightStatusBar(1024);
            } else {
                getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            }
            this.f31315c = new xbx(this);
            this.f31316d = new xcx(this);
        }
        this.f31317e = getIntent().getStringExtra("from");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_list");
        this.f31315c.mo96040q0(this.f31318f, intExtra, getIntent().getStringArrayListExtra("user_list"), stringArrayListExtra);
        this.f31315c.m148779t0(this.pageHelper, this.f31317e);
        this.f31315c.mo52715C(this.f31316d);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31315c.mo40473a0();
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f31320h = intExtra;
        if (intExtra == 48 || intExtra == 49 || intExtra == 47) {
            this.pageHelper.m152782q("p_intl_premium_match");
            this.pageHelper.m152781p(jyb.m147494Y("if_premuim", Boolean.valueOf(!joa.m146386f4())));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public boolean m48749k2(int i) {
        return i == 40 || i == 41 || i == 42 || i == 43 || i == 45 || i == 46;
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m48750l2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        w1e.m204400d(this).m204424I("时间 = " + matchSuccessAnimTime.male_enter_time).m204421F(new y20() { // from class: l.t6x
            @Override // p153l.y20
            public final void call(Object obj) {
                MatchAct.m48738X1(matchSuccessAnimTime, (String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m48751m2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        w1e.m204400d(this).m204424I("时间 = " + matchSuccessAnimTime.male_keyboard_show_time).m204421F(new y20() { // from class: l.s6x
            @Override // p153l.y20
            public final void call(Object obj) {
                MatchAct.m48739Y1(matchSuccessAnimTime, (String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m48752n2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        w1e.m204400d(this).m204424I("时间 = " + matchSuccessAnimTime.male_keyboard_show_head_time).m204421F(new y20() { // from class: l.q6x
            @Override // p153l.y20
            public final void call(Object obj) {
                MatchAct.m48740Z1(matchSuccessAnimTime, (String) obj);
            }
        }).m204426n().show();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f31320h = intExtra;
        if (intExtra == 48 || intExtra == 49 || intExtra == 50 || intExtra == 51) {
            return true;
        }
        return super.needBindBillingService();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m48753o2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        w1e.m204400d(this).m204424I("时间 = " + matchSuccessAnimTime.male_exit_time).m204421F(new y20() { // from class: l.r6x
            @Override // p153l.y20
            public final void call(Object obj) {
                MatchAct.m48742b2(matchSuccessAnimTime, (String) obj);
            }
        }).m204426n().show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity
    public void overridePendingTransition(int i, int i2) {
        if (this.f31321i) {
            super.overridePendingTransition(i, i2);
        }
        this.f31321i = false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        this.f31320h = getIntent().getIntExtra("match_type", 0);
        if (!TextUtils.isEmpty(this.f31318f) && C8291a.m42842p(this.f31318f)) {
            return "p_limited_time_match";
        }
        int i = this.f31320h;
        if (i == 48 || i == 49 || i == 47) {
            return "p_intl_premium_match";
        }
        return i == 50 ? "p_intl_instantmatch_no_ultra_view" : "p_successful_match_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f31320h = intExtra;
        if (intExtra == 46) {
            this.f31319g = true;
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            getWindow().setStatusBarColor(0);
            setLightStatusBar(1024);
            getWindow().getDecorView().setPadding(0, bnl0.m105511F0(), 0, 0);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        if (this.f31319g) {
            int i = this.f31320h;
            if (i == 46 || i == 51) {
                this.act.getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            } else {
                setLightStatusBar(1024);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return this.f31319g;
    }
}

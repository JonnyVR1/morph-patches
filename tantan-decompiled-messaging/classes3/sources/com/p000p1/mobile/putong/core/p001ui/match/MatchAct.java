package com.p000p1.mobile.putong.core.p001ui.match;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.p1.mobile.putong.core.newui.messages.a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import l.dyq;
import l.i0e;
import l.j760;
import l.ogl0;
import l.ozb0;
import l.rol;
import l.upa;
import l.vwb;
import l.xdl0;
import l.xma;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p003l.a5x;
import p003l.d30;
import p003l.e30;
import p003l.h6x;
import p003l.i4x;
import p003l.k7x;
import p003l.l5x;
import p003l.lw40;
import p003l.ow40;
import p003l.pa30;
import p003l.sbx;
import p003l.sdx;
import p003l.vdx;
import p003l.w5x;
import p003l.w6x;
import p003l.y8x;
import p003l.y9x;
import p003l.yvl;
import p003l.z4x;
import p003l.zax;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchAct extends PutongAct implements dyq, rol {

    /* JADX INFO: renamed from: c */
    public l5x f358c;

    /* JADX INFO: renamed from: d */
    public yvl f359d;

    /* JADX INFO: renamed from: e */
    public String f360e;

    /* JADX INFO: renamed from: f */
    public String f361f = "";

    /* JADX INFO: renamed from: g */
    public boolean f362g = false;

    /* JADX INFO: renamed from: h */
    public int f363h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f364i = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.MatchAct$a */
    public static class C0036a<FROM extends Act, TO extends Act> extends Act.w<FROM, TO> {
        /* JADX INFO: renamed from: b */
        public boolean m626b() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public boolean m629e() {
            return true;
        }

        /* JADX INFO: renamed from: f */
        public void m630f(Act act) {
            act.overridePendingTransition(ozb0.c, 0);
        }

        /* JADX INFO: renamed from: g */
        public void m631g(Act act) {
            act.overridePendingTransition(0, ozb0.d);
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator m627c(FROM from, TO to) {
            return to.enterAnimation();
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Animator m628d(FROM from, TO to) {
            return to.exitAnimation();
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void m632h(FROM from, TO to) {
            to.initAnimationState();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.MatchAct$b */
    public static class C0037b<T extends Act> extends Act.s<T, Act> {
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Animator m636c(T t, Act act) {
            boolean z = act instanceof MatchAct;
            if (z && a5x.m2745b()) {
                return act.enterAnimation();
            }
            if (!z || IntlCountryCodeController.v()) {
                return super.i(t, act);
            }
            a5x.m2744a(t, act, 0);
            return act.enterAnimation();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m609V1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_enter_time = Integer.parseInt(str);
            CoreModule.c.e0.e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m610X1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_keyboard_show_time = Integer.parseInt(str);
            CoreModule.c.e0.e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m611Y1(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_keyboard_show_head_time = Integer.parseInt(str);
            CoreModule.c.e0.e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m613a2(MatchSuccessAnimTime matchSuccessAnimTime, String str) {
        try {
            matchSuccessAnimTime.male_exit_time = Integer.parseInt(str);
            CoreModule.c.e0.e3.put(matchSuccessAnimTime.toJson());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m617e2(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2) {
        return m618g2(act, arrayList, i, arrayList2, null);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m618g2(Act act, ArrayList<String> arrayList, int i, ArrayList<String> arrayList2, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) MatchAct.class);
        intent.putStringArrayListExtra("user_list", arrayList);
        intent.putExtra("match_type", i);
        intent.putStringArrayListExtra("extra_list", arrayList2);
        intent.putExtra("from", str);
        return intent;
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        final MatchSuccessAnimTime matchSuccessAnimTimeM6816l = pa30.m6816l();
        arrayList.add(vwb.Y("男性 进入动画时间 " + matchSuccessAnimTimeM6816l.male_enter_time, new d30() { // from class: l.n3x
            @Override // p003l.d30
            public final void call() {
                this.f5829a.m622k2(matchSuccessAnimTimeM6816l);
            }
        }));
        arrayList.add(vwb.Y("男性 键盘弹起动画时间 " + matchSuccessAnimTimeM6816l.male_keyboard_show_time, new d30() { // from class: l.o3x
            @Override // p003l.d30
            public final void call() {
                this.f6037a.m623l2(matchSuccessAnimTimeM6816l);
            }
        }));
        arrayList.add(vwb.Y("男性 头像收起动画时间 " + matchSuccessAnimTimeM6816l.male_keyboard_show_head_time, new d30() { // from class: l.p3x
            @Override // p003l.d30
            public final void call() {
                this.f6309a.m624m2(matchSuccessAnimTimeM6816l);
            }
        }));
        arrayList.add(vwb.Y("男性 退出动画时间 " + matchSuccessAnimTimeM6816l.male_exit_time, new d30() { // from class: l.q3x
            @Override // p003l.d30
            public final void call() {
                this.f6585a.m625n2(matchSuccessAnimTimeM6816l);
            }
        }));
        return arrayList;
    }

    public Animator enterAnimation() {
        return this.f359d.enterAnimation();
    }

    public Animator exitAnimation() {
        return this.f359d.exitAnimation();
    }

    /* JADX INFO: renamed from: h */
    public void m619h(int i, int i2) {
        this.f359d.mo4943h(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public final void m620h2() {
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("user_list");
        if (vwb.J(stringArrayListExtra)) {
            return;
        }
        this.f361f = stringArrayListExtra.get(0);
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m621i2(int i) {
        return i == 40 || i == 41 || i == 42 || i == 43 || i == 45 || i == 46;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f359d.inflateView(layoutInflater, viewGroup);
    }

    public void initAnimationState() {
        this.f359d.initAnimationState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        m620h2();
        super.initDataOnCreate();
        int intExtra = getIntent().getIntExtra("match_type", 0);
        if (intExtra == 46) {
            this.f358c = new lw40(this);
            this.f359d = new ow40(this);
        } else if (a5x.m2745b()) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
            this.f358c = new w5x(this);
            this.f359d = new h6x(this);
        } else if ((upa.g2() || (upa.i2() && TEnum.equals(CoreModule.c.e0.p9().gender, "male"))) && !a.p(this.f361f) && CoreModule.c.T1.B3(this.f361f)) {
            this.f358c = new w6x(this);
            this.f359d = new k7x(this);
        } else if (ogl0.S() && (intExtra == 42 || intExtra == 43 || intExtra == 45)) {
            this.f362g = true;
            this.f358c = new zax(this);
            this.f359d = new sbx(this);
        } else if (upa.n3() && !m621i2(intExtra)) {
            this.f362g = true;
            getWindow().clearFlags(67108864);
            getWindow().addFlags(PKIFailureInfo.systemUnavail);
            getWindow().setStatusBarColor(0);
            setLightStatusBar(1024);
            this.f358c = new sdx(this);
            this.f359d = new vdx(this);
        } else if (IntlCountryCodeController.v()) {
            if (intExtra == 50 || intExtra == 51) {
                this.f362g = true;
                getWindow().clearFlags(67108864);
                getWindow().addFlags(PKIFailureInfo.systemUnavail);
                getWindow().setStatusBarColor(0);
                setLightStatusBar(1024);
            }
            this.f358c = new i4x(this);
            this.f359d = new z4x(this);
        } else {
            if (intExtra == 50 || intExtra == 51) {
                this.f362g = true;
                getWindow().clearFlags(67108864);
                getWindow().addFlags(PKIFailureInfo.systemUnavail);
                getWindow().setStatusBarColor(0);
                setLightStatusBar(1024);
            } else {
                getWindow().getDecorView().setSystemUiVisibility(1280);
            }
            this.f358c = new y8x(this);
            this.f359d = new y9x(this);
        }
        this.f360e = getIntent().getStringExtra("from");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_list");
        this.f358c.mo5067q0(this.f361f, intExtra, getIntent().getStringArrayListExtra("user_list"), stringArrayListExtra);
        this.f358c.m5989t0(((PutongAct) this).pageHelper, this.f360e);
        this.f358c.C(this.f359d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super.initSubscription();
        this.f358c.a0();
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f363h = intExtra;
        if (intExtra == 48 || intExtra == 49 || intExtra == 47) {
            ((PutongAct) this).pageHelper.q("p_intl_premium_match");
            ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("if_premuim", Boolean.valueOf(!xma.e4()))});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m622k2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.d(this).I("时间 = " + matchSuccessAnimTime.male_enter_time).F(new e30() { // from class: l.u3x
            @Override // p003l.e30
            public final void call(Object obj) {
                MatchAct.m609V1(matchSuccessAnimTime, (String) obj);
            }
        }).n().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m623l2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.d(this).I("时间 = " + matchSuccessAnimTime.male_keyboard_show_time).F(new e30() { // from class: l.t3x
            @Override // p003l.e30
            public final void call(Object obj) {
                MatchAct.m610X1(matchSuccessAnimTime, (String) obj);
            }
        }).n().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m624m2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.d(this).I("时间 = " + matchSuccessAnimTime.male_keyboard_show_head_time).F(new e30() { // from class: l.r3x
            @Override // p003l.e30
            public final void call(Object obj) {
                MatchAct.m611Y1(matchSuccessAnimTime, (String) obj);
            }
        }).n().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m625n2(final MatchSuccessAnimTime matchSuccessAnimTime) {
        i0e.d(this).I("时间 = " + matchSuccessAnimTime.male_exit_time).F(new e30() { // from class: l.s3x
            @Override // p003l.e30
            public final void call(Object obj) {
                MatchAct.m613a2(matchSuccessAnimTime, (String) obj);
            }
        }).n().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean needBindBillingService() {
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f363h = intExtra;
        if (intExtra == 48 || intExtra == 49 || intExtra == 50 || intExtra == 51) {
            return true;
        }
        return super.needBindBillingService();
    }

    public void onBackPressed() {
        finish();
    }

    public void overridePendingTransition(int i, int i2) {
        if (this.f364i) {
            super.overridePendingTransition(i, i2);
        }
        this.f364i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pageId() {
        this.f363h = getIntent().getIntExtra("match_type", 0);
        if (!TextUtils.isEmpty(this.f361f) && a.p(this.f361f)) {
            return "p_limited_time_match";
        }
        int i = this.f363h;
        if (i == 48 || i == 49 || i == 47) {
            return "p_intl_premium_match";
        }
        return i == 50 ? "p_intl_instantmatch_no_ultra_view" : "p_successful_match_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("match_type", 0);
        this.f363h = intExtra;
        if (intExtra == 46) {
            this.f362g = true;
            getWindow().addFlags(PKIFailureInfo.systemUnavail);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(0);
            setLightStatusBar(1024);
            getWindow().getDecorView().setPadding(0, xdl0.F0(), 0, 0);
        }
    }

    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        if (this.f362g) {
            int i = this.f363h;
            if (i == 46 || i == 51) {
                ((Act) this).act.getWindow().getDecorView().setSystemUiVisibility(1280);
            } else {
                setLightStatusBar(1024);
            }
        }
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return this.f362g;
    }
}

package com.p051p1.mobile.putong.core.p058ui.greet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.cgc0;
import p153l.crl;
import p153l.g9c0;
import p153l.i39;
import p153l.i4g0;
import p153l.l4g0;
import p153l.pzi0;
import p153l.th0;
import p153l.w1e;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class GreetAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public C8520a f30161c;

    /* JADX INFO: renamed from: d */
    public GreetActViewModel f30162d;

    /* JADX INFO: renamed from: e */
    public boolean f30163e = false;

    /* JADX INFO: renamed from: f */
    public boolean f30164f = true;

    /* JADX INFO: renamed from: g */
    public GreetingParam f30165g;

    /* JADX INFO: renamed from: a2 */
    public final C8520a m46763a2() {
        return new C8520a(this, this.f30165g);
    }

    /* JADX INFO: renamed from: b2 */
    public final GreetActViewModel m46764b2(Greeting greeting) {
        return new GreetActViewModel(this);
    }

    /* JADX INFO: renamed from: c2 */
    public String m46765c2() {
        return this.f30165g.getFrom();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(g9c0.f102807Y);
    }

    /* JADX INFO: renamed from: d2 */
    public GreetingParam m46766d2() {
        return this.f30165g;
    }

    /* JADX INFO: renamed from: e2 */
    public C8520a m46767e2() {
        return this.f30161c;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.f30163e) {
            return;
        }
        if (CoreModule.m30932N().mo61478M8() && CoreModule.m30932N().mo61508Ui(m46765c2())) {
            CoreModule.m30932N().mo61561nq().onNext(Boolean.TRUE);
        }
        act().overridePendingTransition(0, y7c0.f197764b);
    }

    /* JADX INFO: renamed from: g2 */
    public GreetActViewModel m46768g2() {
        return this.f30162d;
    }

    /* JADX INFO: renamed from: h2 */
    public boolean m46769h2() {
        Greeting greetingM47072g0;
        if (!CoreModule.m30933P().m143412i().mo180341J1() && !CoreModule.m30933P().m143412i().mo180457e()) {
            return false;
        }
        if (NullChecker.m82486a(this.f30161c) && NullChecker.m82486a(this.f30161c.m47072g0())) {
            greetingM47072g0 = this.f30161c.m47072g0();
        } else {
            greetingM47072g0 = NullChecker.m82486a(m46766d2()) ? m46766d2().greetInfo : null;
        }
        if (greetingM47072g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM47072g0.channel, Channel.city_c);
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m46770i2() {
        if (act() instanceof GreetAct) {
            return TextUtils.equals(m46765c2(), "meet") || TextUtils.equals(m46765c2(), "from_meet_liked") || TextUtils.equals(m46765c2(), "from_meet_picks");
        }
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30162d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f30165g = (GreetingParam) getIntent().getSerializableExtra("greet_param");
        super.initDataOnCreate();
        if (!NullChecker.m82486a(this.f30165g) || !NullChecker.m82486a(this.f30165g.greetInfo)) {
            this.f30163e = true;
            lambda$debugItems$19();
            return;
        }
        this.f30161c = m46763a2();
        GreetActViewModel greetActViewModelM46764b2 = m46764b2(this.f30165g.greetInfo);
        this.f30162d = greetActViewModelM46764b2;
        this.f30161c.mo52715C(greetActViewModelM46764b2);
        this.f30161c.mo47058i0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m82486a(this.f30161c)) {
            this.f30161c.mo40473a0();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public boolean m46771k2() {
        Greeting greetingM47072g0;
        if (NullChecker.m82486a(this.f30161c) && NullChecker.m82486a(this.f30161c.m47072g0())) {
            greetingM47072g0 = this.f30161c.m47072g0();
        } else {
            greetingM47072g0 = NullChecker.m82486a(m46766d2()) ? m46766d2().greetInfo : null;
        }
        if (greetingM47072g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM47072g0.channel, Channel.surprise_box);
    }

    /* JADX INFO: renamed from: l2 */
    public boolean m46772l2() {
        Greeting greetingM47072g0;
        if (NullChecker.m82486a(this.f30161c) && NullChecker.m82486a(this.f30161c.m47072g0())) {
            greetingM47072g0 = this.f30161c.m47072g0();
        } else {
            greetingM47072g0 = NullChecker.m82486a(m46766d2()) ? m46766d2().greetInfo : null;
        }
        if (greetingM47072g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM47072g0.channel, "seekPartnerNum");
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m46773m2(View view) {
        CoreModule.m30932N().mo61561nq().onNext(Boolean.TRUE);
        i4g0.m138520r("e_meet_back", "p_meet_back_pop");
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n2 */
    public void m46774n2(Message message) {
        this.f30162d.m46845X();
        this.f30161c.m47068v1(message);
    }

    /* JADX INFO: renamed from: o2 */
    public void m46775o2(Message message, CoreGiftInfo coreGiftInfo, String str) {
        this.f30162d.m46845X();
        this.f30162d.m46846X0(coreGiftInfo, true, str, true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f30161c.m47067u1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f30162d.m46845X();
        if (!CoreModule.m30932N().mo61478M8() || !CoreModule.m30932N().mo61508Ui(m46765c2()) || (GreetActViewModel.f30166Q.get().longValue() != 0 && i39.m138280b(GreetActViewModel.f30166Q.get().longValue(), pzi0.m174454o()))) {
            if (CoreModule.m30932N().mo61478M8() && CoreModule.m30932N().mo61508Ui(m46765c2())) {
                CoreModule.m30932N().mo61561nq().onNext(Boolean.TRUE);
            }
            this.act.lambda$debugItems$19();
            return;
        }
        GreetActViewModel.f30166Q.put(Long.valueOf(pzi0.m174454o()));
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_meet_back_pop", Dialog.class.getName());
        th0.C20312a c20312a = new th0.C20312a(this.act);
        c20312a.m191151j("退出后，就错过这次偶遇了，珍惜缘分打个招呼吧");
        c20312a.m191149h(false);
        c20312a.m191159r("再看看");
        c20312a.m191147f("确定退出");
        c20312a.m191154m(new DialogInterface.OnDismissListener() { // from class: l.p9k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        c20312a.m191144c(new View.OnClickListener() { // from class: l.q9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156244a.m46773m2(view);
            }
        });
        c20312a.m191156o(new View.OnClickListener() { // from class: l.r9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138520r("e_stay_meet", "p_meet_back_pop");
            }
        });
        c20312a.m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (CoreModule.m30932N().mo61552ld() && NullChecker.m82486a(this.f30165g) && NullChecker.m82486a(this.f30165g.greetInfo)) {
                jSONObject.put("to_uid", this.f30165g.greetInfo.otherUser);
            }
            if (CoreModule.m30932N().mo61556mr() && NullChecker.m82486a(this.f30165g)) {
                jSONObject.put("moment_id", (NullChecker.m82486a(this.f30165g.greetInfo) && NullChecker.m82486a(this.f30165g.greetInfo.moment)) ? this.f30165g.greetInfo.moment.f39607id : "");
                jSONObject.put("state_id", this.f30165g.stateId);
            }
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            String from = "meet_chat_popup";
            jSONObject.put("greet_origin", CoreModule.m30932N().mo61508Ui(this.f30165g.getFrom()) ? "meet_chat_popup" : this.f30165g.getFrom());
            if (CoreModule.m30932N().mo61478M8()) {
                if (!CoreModule.m30932N().mo61508Ui(this.f30165g.getFrom())) {
                    from = this.f30165g.getFrom();
                }
                jSONObject.put("source_page", from);
            }
            String str = "1";
            if (NullChecker.m82486a(m46766d2().greetInfo)) {
                jSONObject.put("message_count", m46766d2().greetInfo.userMessageCount);
                if (!TextUtils.equals(m46766d2().greetInfo.actorUserId, CoreModule.m30929H().userId())) {
                    str = "0";
                }
                jSONObject.put("is_greeting_actor", str);
            } else {
                jSONObject.put("message_count", 0);
                jSONObject.put("is_greeting_actor", "1");
            }
            this.pageHelper.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        super.onStartLifecycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f30162d.m46844W0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return m46769h2() ? "p_city_cover_greeting" : "p_kankan_chat_popup";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(cgc0.f81653i);
    }
}

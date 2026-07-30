package com.p046p1.mobile.putong.core.p053ui.greet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.a1c0;
import p149l.cwf0;
import p149l.i0e;
import p149l.mqi0;
import p149l.rol;
import p149l.szb0;
import p149l.x7c0;
import p149l.xh0;
import p149l.z19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GreetAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public C8357a f29313c;

    /* JADX INFO: renamed from: d */
    public GreetActViewModel f29314d;

    /* JADX INFO: renamed from: e */
    public boolean f29315e = false;

    /* JADX INFO: renamed from: f */
    public boolean f29316f = true;

    /* JADX INFO: renamed from: g */
    public GreetingParam f29317g;

    /* JADX INFO: renamed from: Z1 */
    public final C8357a m45580Z1() {
        return new C8357a(this, this.f29317g);
    }

    /* JADX INFO: renamed from: a2 */
    public final GreetActViewModel m45581a2(Greeting greeting) {
        return new GreetActViewModel(this);
    }

    /* JADX INFO: renamed from: b2 */
    public String m45582b2() {
        return this.f29317g.getFrom();
    }

    /* JADX INFO: renamed from: c2 */
    public GreetingParam m45583c2() {
        return this.f29317g;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(a1c0.f67143Y);
    }

    /* JADX INFO: renamed from: d2 */
    public C8357a m45584d2() {
        return this.f29313c;
    }

    /* JADX INFO: renamed from: e2 */
    public GreetActViewModel m45585e2() {
        return this.f29314d;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.f29315e) {
            return;
        }
        if (CoreModule.m29934N().mo60294M8() && CoreModule.m29934N().mo60324Ui(m45582b2())) {
            CoreModule.m29934N().mo60377nq().onNext(Boolean.TRUE);
        }
        act().overridePendingTransition(0, szb0.f167027b);
    }

    /* JADX INFO: renamed from: g2 */
    public boolean m45586g2() {
        Greeting greetingM45889g0;
        if (!CoreModule.m29935P().m94658i().mo158249J1() && !CoreModule.m29935P().m94658i().mo158365e()) {
            return false;
        }
        if (NullChecker.m81303a(this.f29313c) && NullChecker.m81303a(this.f29313c.m45889g0())) {
            greetingM45889g0 = this.f29313c.m45889g0();
        } else {
            greetingM45889g0 = NullChecker.m81303a(m45583c2()) ? m45583c2().greetInfo : null;
        }
        if (greetingM45889g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM45889g0.channel, Channel.city_c);
    }

    /* JADX INFO: renamed from: h2 */
    public boolean m45587h2() {
        if (act() instanceof GreetAct) {
            return TextUtils.equals(m45582b2(), "meet") || TextUtils.equals(m45582b2(), "from_meet_liked") || TextUtils.equals(m45582b2(), "from_meet_picks");
        }
        return false;
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m45588i2() {
        Greeting greetingM45889g0;
        if (NullChecker.m81303a(this.f29313c) && NullChecker.m81303a(this.f29313c.m45889g0())) {
            greetingM45889g0 = this.f29313c.m45889g0();
        } else {
            greetingM45889g0 = NullChecker.m81303a(m45583c2()) ? m45583c2().greetInfo : null;
        }
        if (greetingM45889g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM45889g0.channel, Channel.surprise_box);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29314d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f29317g = (GreetingParam) getIntent().getSerializableExtra("greet_param");
        super.initDataOnCreate();
        if (!NullChecker.m81303a(this.f29317g) || !NullChecker.m81303a(this.f29317g.greetInfo)) {
            this.f29315e = true;
            lambda$debugItems$19();
            return;
        }
        this.f29313c = m45580Z1();
        GreetActViewModel greetActViewModelM45581a2 = m45581a2(this.f29317g.greetInfo);
        this.f29314d = greetActViewModelM45581a2;
        this.f29313c.mo51532C(greetActViewModelM45581a2);
        this.f29313c.mo45875i0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.m81303a(this.f29313c)) {
            this.f29313c.mo39470a0();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public boolean m45589k2() {
        Greeting greetingM45889g0;
        if (NullChecker.m81303a(this.f29313c) && NullChecker.m81303a(this.f29313c.m45889g0())) {
            greetingM45889g0 = this.f29313c.m45889g0();
        } else {
            greetingM45889g0 = NullChecker.m81303a(m45583c2()) ? m45583c2().greetInfo : null;
        }
        if (greetingM45889g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM45889g0.channel, "seekPartnerNum");
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m45590l2(View view) {
        CoreModule.m29934N().mo60377nq().onNext(Boolean.TRUE);
        zvf0.m220396r("e_meet_back", "p_meet_back_pop");
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: m2 */
    public void m45591m2(Message message) {
        this.f29314d.m45662X();
        this.f29313c.m45885v1(message);
    }

    /* JADX INFO: renamed from: n2 */
    public void m45592n2(Message message, CoreGiftInfo coreGiftInfo, String str) {
        this.f29314d.m45662X();
        this.f29314d.m45663X0(coreGiftInfo, true, str, true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f29313c.m45884u1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f29314d.m45662X();
        if (!CoreModule.m29934N().mo60294M8() || !CoreModule.m29934N().mo60324Ui(m45582b2()) || (GreetActViewModel.f29318Q.get().longValue() != 0 && z19.m216789b(GreetActViewModel.f29318Q.get().longValue(), mqi0.m155944o()))) {
            if (CoreModule.m29934N().mo60294M8() && CoreModule.m29934N().mo60324Ui(m45582b2())) {
                CoreModule.m29934N().mo60377nq().onNext(Boolean.TRUE);
            }
            this.act.lambda$debugItems$19();
            return;
        }
        GreetActViewModel.f29318Q.put(Long.valueOf(mqi0.m155944o()));
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_meet_back_pop", Dialog.class.getName());
        xh0.C21150a c21150a = new xh0.C21150a(this.act);
        c21150a.m208731j("退出后，就错过这次偶遇了，珍惜缘分打个招呼吧");
        c21150a.m208729h(false);
        c21150a.m208739r("再看看");
        c21150a.m208727f("确定退出");
        c21150a.m208734m(new DialogInterface.OnDismissListener() { // from class: l.y6k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        c21150a.m208724c(new View.OnClickListener() { // from class: l.z6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201933a.m45590l2(view);
            }
        });
        c21150a.m208736o(new View.OnClickListener() { // from class: l.a7k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220396r("e_stay_meet", "p_meet_back_pop");
            }
        });
        c21150a.m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (CoreModule.m29934N().mo60368ld() && NullChecker.m81303a(this.f29317g) && NullChecker.m81303a(this.f29317g.greetInfo)) {
                jSONObject.put("to_uid", this.f29317g.greetInfo.otherUser);
            }
            if (CoreModule.m29934N().mo60372mr() && NullChecker.m81303a(this.f29317g)) {
                jSONObject.put("moment_id", (NullChecker.m81303a(this.f29317g.greetInfo) && NullChecker.m81303a(this.f29317g.greetInfo.moment)) ? this.f29317g.greetInfo.moment.f38759id : "");
                jSONObject.put("state_id", this.f29317g.stateId);
            }
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            String from = "meet_chat_popup";
            jSONObject.put("greet_origin", CoreModule.m29934N().mo60324Ui(this.f29317g.getFrom()) ? "meet_chat_popup" : this.f29317g.getFrom());
            if (CoreModule.m29934N().mo60294M8()) {
                if (!CoreModule.m29934N().mo60324Ui(this.f29317g.getFrom())) {
                    from = this.f29317g.getFrom();
                }
                jSONObject.put("source_page", from);
            }
            String str = "1";
            if (NullChecker.m81303a(m45583c2().greetInfo)) {
                jSONObject.put("message_count", m45583c2().greetInfo.userMessageCount);
                if (!TextUtils.equals(m45583c2().greetInfo.actorUserId, CoreModule.m29931H().userId())) {
                    str = "0";
                }
                jSONObject.put("is_greeting_actor", str);
            } else {
                jSONObject.put("message_count", 0);
                jSONObject.put("is_greeting_actor", "1");
            }
            this.pageHelper.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        super.onStartLifecycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f29314d.m45661W0(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return m45586g2() ? "p_city_cover_greeting" : "p_kankan_chat_popup";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(x7c0.f191340i);
    }
}

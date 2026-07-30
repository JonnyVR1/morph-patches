package com.p000p1.mobile.putong.core.p001ui.greet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Active;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i0e;
import l.mqi0;
import l.rol;
import l.xh0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.a1c0;
import p003l.szb0;
import p003l.x7c0;
import p003l.z19;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public C3132a f1707c;

    /* JADX INFO: renamed from: d */
    public GreetActViewModel f1708d;

    /* JADX INFO: renamed from: e */
    public boolean f1709e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1710f = true;

    /* JADX INFO: renamed from: g */
    public GreetingParam f1711g;

    /* JADX INFO: renamed from: Z1 */
    public final C3132a m2916Z1() {
        return new C3132a(this, this.f1711g);
    }

    /* JADX INFO: renamed from: a2 */
    public final GreetActViewModel m2917a2(Greeting greeting) {
        return new GreetActViewModel(this);
    }

    /* JADX INFO: renamed from: b2 */
    public String m2918b2() {
        return this.f1711g.getFrom();
    }

    /* JADX INFO: renamed from: c2 */
    public GreetingParam m2919c2() {
        return this.f1711g;
    }

    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(a1c0.f2689Y);
    }

    /* JADX INFO: renamed from: d2 */
    public C3132a m2920d2() {
        return this.f1707c;
    }

    /* JADX INFO: renamed from: e2 */
    public GreetActViewModel m2921e2() {
        return this.f1708d;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (this.f1709e) {
            return;
        }
        if (CoreModule.N().M8() && CoreModule.N().Ui(m2918b2())) {
            CoreModule.N().nq().onNext(Boolean.TRUE);
        }
        act().overridePendingTransition(0, szb0.f7491b);
    }

    /* JADX INFO: renamed from: g2 */
    public boolean m2922g2() {
        Greeting greetingM3235g0;
        if (!CoreModule.P().i().J1() && !CoreModule.P().i().e()) {
            return false;
        }
        if (NullChecker.a(this.f1707c) && NullChecker.a(this.f1707c.m3235g0())) {
            greetingM3235g0 = this.f1707c.m3235g0();
        } else {
            greetingM3235g0 = NullChecker.a(m2919c2()) ? m2919c2().greetInfo : null;
        }
        if (greetingM3235g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM3235g0.channel, "city_c");
    }

    /* JADX INFO: renamed from: h2 */
    public boolean m2923h2() {
        if (act() instanceof GreetAct) {
            return TextUtils.equals(m2918b2(), "meet") || TextUtils.equals(m2918b2(), "from_meet_liked") || TextUtils.equals(m2918b2(), "from_meet_picks");
        }
        return false;
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m2924i2() {
        Greeting greetingM3235g0;
        if (NullChecker.a(this.f1707c) && NullChecker.a(this.f1707c.m3235g0())) {
            greetingM3235g0 = this.f1707c.m3235g0();
        } else {
            greetingM3235g0 = NullChecker.a(m2919c2()) ? m2919c2().greetInfo : null;
        }
        if (greetingM3235g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM3235g0.channel, "surprise_box");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1708d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f1711g = (GreetingParam) getIntent().getSerializableExtra("greet_param");
        super.initDataOnCreate();
        if (!NullChecker.a(this.f1711g) || !NullChecker.a(this.f1711g.greetInfo)) {
            this.f1709e = true;
            finish();
            return;
        }
        this.f1707c = m2916Z1();
        GreetActViewModel greetActViewModelM2917a2 = m2917a2(this.f1711g.greetInfo);
        this.f1708d = greetActViewModelM2917a2;
        this.f1707c.C(greetActViewModelM2917a2);
        this.f1707c.mo3221i0();
    }

    public void initSubscription() {
        super.initSubscription();
        if (NullChecker.a(this.f1707c)) {
            this.f1707c.mo3211a0();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public boolean m2925k2() {
        Greeting greetingM3235g0;
        if (NullChecker.a(this.f1707c) && NullChecker.a(this.f1707c.m3235g0())) {
            greetingM3235g0 = this.f1707c.m3235g0();
        } else {
            greetingM3235g0 = NullChecker.a(m2919c2()) ? m2919c2().greetInfo : null;
        }
        if (greetingM3235g0 == null) {
            return false;
        }
        return TEnum.equals(greetingM3235g0.channel, SummarizedPrivilegesId.seekPartnerNum);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m2926l2(View view) {
        CoreModule.N().nq().onNext(Boolean.TRUE);
        zvf0.r("e_meet_back", "p_meet_back_pop");
        ((Act) this).act.finish();
    }

    /* JADX INFO: renamed from: m2 */
    public void m2927m2(Message message) {
        this.f1708d.m2999X();
        this.f1707c.m3231v1(message);
    }

    /* JADX INFO: renamed from: n2 */
    public void m2928n2(Message message, CoreGiftInfo coreGiftInfo, String str) {
        this.f1708d.m2999X();
        this.f1708d.m3000X0(coreGiftInfo, true, str, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1707c.m3230u1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        this.f1708d.m2999X();
        if (!CoreModule.N().M8() || !CoreModule.N().Ui(m2918b2()) || (((Long) GreetActViewModel.f1712Q.get()).longValue() != 0 && z19.m11322b(((Long) GreetActViewModel.f1712Q.get()).longValue(), mqi0.o()))) {
            if (CoreModule.N().M8() && CoreModule.N().Ui(m2918b2())) {
                CoreModule.N().nq().onNext(Boolean.TRUE);
            }
            ((Act) this).act.finish();
            return;
        }
        GreetActViewModel.f1712Q.put(Long.valueOf(mqi0.o()));
        final cwf0 cwf0VarC = i0e.c("p_meet_back_pop", Dialog.class.getName());
        xh0.a aVar = new xh0.a(((Act) this).act);
        aVar.j("退出后，就错过这次偶遇了，珍惜缘分打个招呼吧");
        aVar.h(false);
        aVar.r("再看看");
        aVar.f("确定退出");
        aVar.m(new DialogInterface.OnDismissListener() { // from class: l.y6k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        aVar.c(new View.OnClickListener() { // from class: l.z6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9194a.m2926l2(view);
            }
        });
        aVar.o(new View.OnClickListener() { // from class: l.a7k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.r("e_stay_meet", "p_meet_back_pop");
            }
        });
        aVar.a().g();
        i0e.f(cwf0VarC);
    }

    public void onStartLifecycle() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (CoreModule.N().ld() && NullChecker.a(this.f1711g) && NullChecker.a(this.f1711g.greetInfo)) {
                jSONObject.put("to_uid", this.f1711g.greetInfo.otherUser);
            }
            if (CoreModule.N().mr() && NullChecker.a(this.f1711g)) {
                jSONObject.put("moment_id", (NullChecker.a(this.f1711g.greetInfo) && NullChecker.a(this.f1711g.greetInfo.moment)) ? this.f1711g.greetInfo.moment.id : "");
                jSONObject.put("state_id", this.f1711g.stateId);
            }
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            String from = "meet_chat_popup";
            jSONObject.put("greet_origin", CoreModule.N().Ui(this.f1711g.getFrom()) ? "meet_chat_popup" : this.f1711g.getFrom());
            if (CoreModule.N().M8()) {
                if (!CoreModule.N().Ui(this.f1711g.getFrom())) {
                    from = this.f1711g.getFrom();
                }
                jSONObject.put("source_page", from);
            }
            String str = "1";
            if (NullChecker.a(m2919c2().greetInfo)) {
                jSONObject.put("message_count", m2919c2().greetInfo.userMessageCount);
                if (!TextUtils.equals(m2919c2().greetInfo.actorUserId, CoreModule.H().userId())) {
                    str = "0";
                }
                jSONObject.put("is_greeting_actor", str);
            } else {
                jSONObject.put("message_count", 0);
                jSONObject.put("is_greeting_actor", "1");
            }
            ((PutongAct) this).pageHelper.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.f1708d.m2998W0(z);
    }

    public String pageId() {
        return m2922g2() ? "p_city_cover_greeting" : "p_kankan_chat_popup";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }

    public void setTheme() {
        super.setTheme();
        setTheme(x7c0.f8382i);
    }
}

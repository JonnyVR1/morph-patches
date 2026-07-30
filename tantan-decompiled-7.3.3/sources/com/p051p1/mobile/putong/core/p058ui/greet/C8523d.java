package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.data.Channel;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.ela;
import p153l.joa;
import p153l.q0e0;
import p153l.y7c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.d */
/* JADX INFO: loaded from: classes3.dex */
public class C8523d {

    /* JADX INFO: renamed from: a */
    public static boolean f30302a = false;

    /* JADX INFO: renamed from: a */
    public static void m47075a(Act act, a aVar) {
        m47076b(act, aVar, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m47076b(Act act, a aVar, String str) {
        if (NullChecker.m82486a(act)) {
            if (!CoreModule.m30933P().m143412i().mo180477h1() || !TextUtils.equals("push_like", aVar.f30307e)) {
                q0e0.INSTANCE.m174704g(act, aVar);
            } else if (m47086l(act, aVar.f30307e, aVar.f30314l)) {
                m47082h(act, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m47077c(Act act, a aVar) {
        q0e0.INSTANCE.m174706k(act, aVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m47078d(Act act, a aVar) {
        q0e0.INSTANCE.m174703f(act, aVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m47079e(Act act, String str) {
        Greeting greetingNew_ = Greeting.new_();
        greetingNew_.otherUser = str;
        greetingNew_.f21143id = str;
        greetingNew_.actorUserId = CoreModule.m30929H().userId();
        greetingNew_.channel = Channel.get(Channel.city_c);
        greetingNew_.owner = CoreModule.m30929H().userId();
        m47084j(act, new a(greetingNew_, "from_city_centre_card"));
    }

    /* JADX INFO: renamed from: f */
    public static void m47080f(Act act, String str) {
        Greeting greetingNew_ = Greeting.new_();
        greetingNew_.otherUser = str;
        greetingNew_.f21143id = str;
        greetingNew_.actorUserId = CoreModule.m30929H().userId();
        greetingNew_.channel = Channel.get(Channel.surprise_box);
        greetingNew_.owner = CoreModule.m30929H().userId();
        m47084j(act, new a(greetingNew_, "from_surprise_box"));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m47081g(Context context, a aVar) {
        Intent intent = new Intent(context, (Class<?>) GreetAct.class);
        aVar.m47088b(intent);
        return intent;
    }

    /* JADX INFO: renamed from: h */
    public static void m47082h(Act act, a aVar) {
        if (NullChecker.m82486a(act)) {
            if (TextUtils.equals(aVar.f30307e, "p_state_explore")) {
                CoreModule.m30933P().m143412i().mo180292A0(true);
            }
            act.startActivityForResult(m47081g(act, aVar), 17);
            if (CoreModule.m30932N().mo61508Ui(aVar.f30307e)) {
                act.overridePendingTransition(y7c0.f197767e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m47083i(Context context, Greeting greeting, String str) {
        context.startActivity(m47081g(context, new a(greeting, str)));
    }

    /* JADX INFO: renamed from: j */
    public static void m47084j(Act act, a aVar) {
        if (NullChecker.m82486a(act)) {
            act.startActivityForResult(m47081g(act, aVar), 17);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m47085k(String str) {
        return TextUtils.equals(str, "from_picks") || TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card") || TextUtils.equals(str, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m47086l(Act act, String str, boolean z) {
        if ((!m47085k(str) && !z) || joa.m146358H3() || ela.m121122r3() > 0) {
            return true;
        }
        CoreModule.m30933P().m143412i().mo34369Mc(act, "p_meet_view,e_meet_card_sayhi,click");
        return false;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Greeting f30303a;

        /* JADX INFO: renamed from: b */
        public String f30304b;

        /* JADX INFO: renamed from: e */
        public String f30307e;

        /* JADX INFO: renamed from: f */
        public String f30308f;

        /* JADX INFO: renamed from: g */
        public String f30309g;

        /* JADX INFO: renamed from: h */
        public String f30310h;

        /* JADX INFO: renamed from: j */
        public String f30312j;

        /* JADX INFO: renamed from: k */
        public Object f30313k;

        /* JADX INFO: renamed from: n */
        public String f30316n;

        /* JADX INFO: renamed from: c */
        public boolean f30305c = false;

        /* JADX INFO: renamed from: d */
        public boolean f30306d = false;

        /* JADX INFO: renamed from: i */
        public int f30311i = 0;

        /* JADX INFO: renamed from: l */
        public boolean f30314l = false;

        /* JADX INFO: renamed from: m */
        public boolean f30315m = true;

        public a(String str, String str2) {
            Greeting greetingNew_ = Greeting.new_();
            greetingNew_.otherUser = str;
            greetingNew_.f21143id = str;
            greetingNew_.actorUserId = CoreModule.m30929H().userId();
            this.f30307e = str2;
            this.f30303a = greetingNew_;
            this.f30304b = str;
        }

        /* JADX INFO: renamed from: b */
        public final void m47088b(Intent intent) {
            if (!NullChecker.m82486a(this.f30303a)) {
                CrashHelper.m82479c(new NullPointerException("greetact_greetInfo_null,from:" + this.f30307e));
            }
            GreetingParam greetingParam = new GreetingParam();
            greetingParam.greetInfo = this.f30303a;
            greetingParam.finishForReport = this.f30305c;
            greetingParam.isStartHomeCard = this.f30306d;
            greetingParam.from = this.f30307e;
            greetingParam.preSendMsg = this.f30308f;
            greetingParam.stateId = this.f30309g;
            greetingParam.recommendReason = this.f30310h;
            greetingParam.hotLevel = this.f30311i;
            greetingParam.hasCreatedGreeting = this.f30315m;
            intent.putExtra("greet_param", greetingParam);
        }

        /* JADX INFO: renamed from: c */
        public String m47089c() {
            return this.f30307e;
        }

        /* JADX INFO: renamed from: d */
        public Greeting m47090d() {
            return this.f30303a;
        }

        /* JADX INFO: renamed from: e */
        public Object m47091e() {
            return this.f30313k;
        }

        /* JADX INFO: renamed from: f */
        public String m47092f() {
            return this.f30312j;
        }

        /* JADX INFO: renamed from: g */
        public String m47093g() {
            return this.f30304b;
        }

        /* JADX INFO: renamed from: h */
        public String m47094h() {
            return this.f30316n;
        }

        /* JADX INFO: renamed from: i */
        public String m47095i() {
            return this.f30309g;
        }

        /* JADX INFO: renamed from: j */
        public a m47096j(boolean z) {
            this.f30314l = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m47097k(boolean z) {
            this.f30306d = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m47098l(String str) {
            this.f30307e = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m47099m(Object obj) {
            this.f30313k = obj;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m47100n(String str) {
            this.f30312j = str;
            this.f30303a.moment.f39607id = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m47101o(String str) {
            this.f30316n = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m47102p(String str) {
            this.f30310h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m47103q(String str) {
            this.f30309g = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m47104r(Greeting greeting) {
            this.f30303a = greeting;
            this.f30304b = greeting.f21143id;
            return this;
        }

        public a(Greeting greeting, String str) {
            this.f30303a = greeting;
            this.f30304b = greeting.f21143id;
            this.f30307e = str;
        }
    }
}

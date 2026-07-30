package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Channel;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.osd0;
import l.sja;
import l.xma;
import p003l.szb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3135d {

    /* JADX INFO: renamed from: a */
    public static boolean f1848a = false;

    /* JADX INFO: renamed from: a */
    public static void m3238a(Act act, a aVar) {
        m3239b(act, aVar, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m3239b(Act act, a aVar, String str) {
        if (NullChecker.a(act)) {
            if (!CoreModule.P().i().h1() || !TextUtils.equals("push_like", aVar.f1853e)) {
                osd0.INSTANCE.g(act, aVar);
            } else if (m3249l(act, aVar.f1853e, aVar.f1860l)) {
                m3245h(act, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3240c(Act act, a aVar) {
        osd0.INSTANCE.k(act, aVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m3241d(Act act, a aVar) {
        osd0.INSTANCE.f(act, aVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m3242e(Act act, String str) {
        Greeting greetingNew_ = Greeting.new_();
        greetingNew_.otherUser = str;
        greetingNew_.f63id = str;
        greetingNew_.actorUserId = CoreModule.H().userId();
        greetingNew_.channel = Channel.get("city_c");
        greetingNew_.owner = CoreModule.H().userId();
        m3247j(act, new a(greetingNew_, "from_city_centre_card"));
    }

    /* JADX INFO: renamed from: f */
    public static void m3243f(Act act, String str) {
        Greeting greetingNew_ = Greeting.new_();
        greetingNew_.otherUser = str;
        greetingNew_.f63id = str;
        greetingNew_.actorUserId = CoreModule.H().userId();
        greetingNew_.channel = Channel.get("surprise_box");
        greetingNew_.owner = CoreModule.H().userId();
        m3247j(act, new a(greetingNew_, "from_surprise_box"));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m3244g(Context context, a aVar) {
        Intent intent = new Intent(context, (Class<?>) GreetAct.class);
        aVar.m3251b(intent);
        return intent;
    }

    /* JADX INFO: renamed from: h */
    public static void m3245h(Act act, a aVar) {
        if (NullChecker.a(act)) {
            if (TextUtils.equals(aVar.f1853e, "p_state_explore")) {
                CoreModule.P().i().A0(true);
            }
            act.startActivityForResult(m3244g(act, aVar), 17);
            if (CoreModule.N().Ui(aVar.f1853e)) {
                act.overridePendingTransition(szb0.f7494e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3246i(Context context, Greeting greeting, String str) {
        context.startActivity(m3244g(context, new a(greeting, str)));
    }

    /* JADX INFO: renamed from: j */
    public static void m3247j(Act act, a aVar) {
        if (NullChecker.a(act)) {
            act.startActivityForResult(m3244g(act, aVar), 17);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3248k(String str) {
        return TextUtils.equals(str, "from_picks") || TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card") || TextUtils.equals(str, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3249l(Act act, String str, boolean z) {
        if ((!m3248k(str) && !z) || xma.G3() || sja.r3() > 0) {
            return true;
        }
        CoreModule.P().i().Mc(act, "p_meet_view,e_meet_card_sayhi,click");
        return false;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Greeting f1849a;

        /* JADX INFO: renamed from: b */
        public String f1850b;

        /* JADX INFO: renamed from: e */
        public String f1853e;

        /* JADX INFO: renamed from: f */
        public String f1854f;

        /* JADX INFO: renamed from: g */
        public String f1855g;

        /* JADX INFO: renamed from: h */
        public String f1856h;

        /* JADX INFO: renamed from: j */
        public String f1858j;

        /* JADX INFO: renamed from: k */
        public Object f1859k;

        /* JADX INFO: renamed from: n */
        public String f1862n;

        /* JADX INFO: renamed from: c */
        public boolean f1851c = false;

        /* JADX INFO: renamed from: d */
        public boolean f1852d = false;

        /* JADX INFO: renamed from: i */
        public int f1857i = 0;

        /* JADX INFO: renamed from: l */
        public boolean f1860l = false;

        /* JADX INFO: renamed from: m */
        public boolean f1861m = true;

        public a(String str, String str2) {
            Greeting greetingNew_ = Greeting.new_();
            greetingNew_.otherUser = str;
            greetingNew_.f63id = str;
            greetingNew_.actorUserId = CoreModule.H().userId();
            this.f1853e = str2;
            this.f1849a = greetingNew_;
            this.f1850b = str;
        }

        /* JADX INFO: renamed from: b */
        public final void m3251b(Intent intent) {
            if (!NullChecker.a(this.f1849a)) {
                CrashHelper.c(new NullPointerException("greetact_greetInfo_null,from:" + this.f1853e));
            }
            GreetingParam greetingParam = new GreetingParam();
            greetingParam.greetInfo = this.f1849a;
            greetingParam.finishForReport = this.f1851c;
            greetingParam.isStartHomeCard = this.f1852d;
            greetingParam.from = this.f1853e;
            greetingParam.preSendMsg = this.f1854f;
            greetingParam.stateId = this.f1855g;
            greetingParam.recommendReason = this.f1856h;
            greetingParam.hotLevel = this.f1857i;
            greetingParam.hasCreatedGreeting = this.f1861m;
            intent.putExtra("greet_param", greetingParam);
        }

        /* JADX INFO: renamed from: c */
        public String m3252c() {
            return this.f1853e;
        }

        /* JADX INFO: renamed from: d */
        public Greeting m3253d() {
            return this.f1849a;
        }

        /* JADX INFO: renamed from: e */
        public Object m3254e() {
            return this.f1859k;
        }

        /* JADX INFO: renamed from: f */
        public String m3255f() {
            return this.f1858j;
        }

        /* JADX INFO: renamed from: g */
        public String m3256g() {
            return this.f1850b;
        }

        /* JADX INFO: renamed from: h */
        public String m3257h() {
            return this.f1862n;
        }

        /* JADX INFO: renamed from: i */
        public String m3258i() {
            return this.f1855g;
        }

        /* JADX INFO: renamed from: j */
        public a m3259j(boolean z) {
            this.f1860l = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m3260k(boolean z) {
            this.f1852d = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m3261l(String str) {
            this.f1853e = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m3262m(Object obj) {
            this.f1859k = obj;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m3263n(String str) {
            this.f1858j = str;
            this.f1849a.moment.id = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m3264o(String str) {
            this.f1862n = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m3265p(String str) {
            this.f1856h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m3266q(String str) {
            this.f1855g = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m3267r(Greeting greeting) {
            this.f1849a = greeting;
            this.f1850b = greeting.f63id;
            return this;
        }

        public a(Greeting greeting, String str) {
            this.f1849a = greeting;
            this.f1850b = greeting.f63id;
            this.f1853e = str;
        }
    }
}

package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.data.Channel;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.osd0;
import p149l.sja;
import p149l.szb0;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.d */
/* JADX INFO: loaded from: classes10.dex */
public class C8360d {

    /* JADX INFO: renamed from: a */
    public static boolean f29454a = false;

    /* JADX INFO: renamed from: a */
    public static void m45892a(Act act, a aVar) {
        m45893b(act, aVar, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m45893b(Act act, a aVar, String str) {
        if (NullChecker.m81303a(act)) {
            if (!CoreModule.m29935P().m94658i().mo158385h1() || !TextUtils.equals("push_like", aVar.f29459e)) {
                osd0.INSTANCE.m165749g(act, aVar);
            } else if (m45903l(act, aVar.f29459e, aVar.f29466l)) {
                m45899h(act, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m45894c(Act act, a aVar) {
        osd0.INSTANCE.m165751k(act, aVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m45895d(Act act, a aVar) {
        osd0.INSTANCE.m165748f(act, aVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m45896e(Act act, String str) {
        Greeting greetingNew_ = Greeting.new_();
        greetingNew_.otherUser = str;
        greetingNew_.f20401id = str;
        greetingNew_.actorUserId = CoreModule.m29931H().userId();
        greetingNew_.channel = Channel.get(Channel.city_c);
        greetingNew_.owner = CoreModule.m29931H().userId();
        m45901j(act, new a(greetingNew_, "from_city_centre_card"));
    }

    /* JADX INFO: renamed from: f */
    public static void m45897f(Act act, String str) {
        Greeting greetingNew_ = Greeting.new_();
        greetingNew_.otherUser = str;
        greetingNew_.f20401id = str;
        greetingNew_.actorUserId = CoreModule.m29931H().userId();
        greetingNew_.channel = Channel.get(Channel.surprise_box);
        greetingNew_.owner = CoreModule.m29931H().userId();
        m45901j(act, new a(greetingNew_, "from_surprise_box"));
    }

    /* JADX INFO: renamed from: g */
    public static Intent m45898g(Context context, a aVar) {
        Intent intent = new Intent(context, (Class<?>) GreetAct.class);
        aVar.m45905b(intent);
        return intent;
    }

    /* JADX INFO: renamed from: h */
    public static void m45899h(Act act, a aVar) {
        if (NullChecker.m81303a(act)) {
            if (TextUtils.equals(aVar.f29459e, "p_state_explore")) {
                CoreModule.m29935P().m94658i().mo158200A0(true);
            }
            act.startActivityForResult(m45898g(act, aVar), 17);
            if (CoreModule.m29934N().mo60324Ui(aVar.f29459e)) {
                act.overridePendingTransition(szb0.f167030e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m45900i(Context context, Greeting greeting, String str) {
        context.startActivity(m45898g(context, new a(greeting, str)));
    }

    /* JADX INFO: renamed from: j */
    public static void m45901j(Act act, a aVar) {
        if (NullChecker.m81303a(act)) {
            act.startActivityForResult(m45898g(act, aVar), 17);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m45902k(String str) {
        return TextUtils.equals(str, "from_picks") || TextUtils.equals(str, "from_meet_picks_feed") || TextUtils.equals(str, "from_meet_picks_card") || TextUtils.equals(str, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m45903l(Act act, String str, boolean z) {
        if ((!m45902k(str) && !z) || xma.m210044G3() || sja.m184461r3() > 0) {
            return true;
        }
        CoreModule.m29935P().m94658i().mo33366Mc(act, "p_meet_view,e_meet_card_sayhi,click");
        return false;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Greeting f29455a;

        /* JADX INFO: renamed from: b */
        public String f29456b;

        /* JADX INFO: renamed from: e */
        public String f29459e;

        /* JADX INFO: renamed from: f */
        public String f29460f;

        /* JADX INFO: renamed from: g */
        public String f29461g;

        /* JADX INFO: renamed from: h */
        public String f29462h;

        /* JADX INFO: renamed from: j */
        public String f29464j;

        /* JADX INFO: renamed from: k */
        public Object f29465k;

        /* JADX INFO: renamed from: n */
        public String f29468n;

        /* JADX INFO: renamed from: c */
        public boolean f29457c = false;

        /* JADX INFO: renamed from: d */
        public boolean f29458d = false;

        /* JADX INFO: renamed from: i */
        public int f29463i = 0;

        /* JADX INFO: renamed from: l */
        public boolean f29466l = false;

        /* JADX INFO: renamed from: m */
        public boolean f29467m = true;

        public a(String str, String str2) {
            Greeting greetingNew_ = Greeting.new_();
            greetingNew_.otherUser = str;
            greetingNew_.f20401id = str;
            greetingNew_.actorUserId = CoreModule.m29931H().userId();
            this.f29459e = str2;
            this.f29455a = greetingNew_;
            this.f29456b = str;
        }

        /* JADX INFO: renamed from: b */
        public final void m45905b(Intent intent) {
            if (!NullChecker.m81303a(this.f29455a)) {
                CrashHelper.m81296c(new NullPointerException("greetact_greetInfo_null,from:" + this.f29459e));
            }
            GreetingParam greetingParam = new GreetingParam();
            greetingParam.greetInfo = this.f29455a;
            greetingParam.finishForReport = this.f29457c;
            greetingParam.isStartHomeCard = this.f29458d;
            greetingParam.from = this.f29459e;
            greetingParam.preSendMsg = this.f29460f;
            greetingParam.stateId = this.f29461g;
            greetingParam.recommendReason = this.f29462h;
            greetingParam.hotLevel = this.f29463i;
            greetingParam.hasCreatedGreeting = this.f29467m;
            intent.putExtra("greet_param", greetingParam);
        }

        /* JADX INFO: renamed from: c */
        public String m45906c() {
            return this.f29459e;
        }

        /* JADX INFO: renamed from: d */
        public Greeting m45907d() {
            return this.f29455a;
        }

        /* JADX INFO: renamed from: e */
        public Object m45908e() {
            return this.f29465k;
        }

        /* JADX INFO: renamed from: f */
        public String m45909f() {
            return this.f29464j;
        }

        /* JADX INFO: renamed from: g */
        public String m45910g() {
            return this.f29456b;
        }

        /* JADX INFO: renamed from: h */
        public String m45911h() {
            return this.f29468n;
        }

        /* JADX INFO: renamed from: i */
        public String m45912i() {
            return this.f29461g;
        }

        /* JADX INFO: renamed from: j */
        public a m45913j(boolean z) {
            this.f29466l = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m45914k(boolean z) {
            this.f29458d = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m45915l(String str) {
            this.f29459e = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m45916m(Object obj) {
            this.f29465k = obj;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m45917n(String str) {
            this.f29464j = str;
            this.f29455a.moment.f38759id = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m45918o(String str) {
            this.f29468n = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m45919p(String str) {
            this.f29462h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m45920q(String str) {
            this.f29461g = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m45921r(Greeting greeting) {
            this.f29455a = greeting;
            this.f29456b = greeting.f20401id;
            return this;
        }

        public a(Greeting greeting, String str) {
            this.f29455a = greeting;
            this.f29456b = greeting.f20401id;
            this.f29459e = str;
        }
    }
}

package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.external.direction.core.LiveGoDummyAct;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class eqs {

    /* JADX INFO: renamed from: a */
    public static ArrayList<ytl> f92842a = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public static void m117779g(PushMessage pushMessage) {
        if (pushMessage.messageCustom.title != null && TextUtils.isEmpty(pushMessage.title)) {
            pushMessage.title = pushMessage.messageCustom.title;
        }
        if (pushMessage.messageCustom.content != null && (TextUtils.isEmpty(pushMessage.value) || TextUtils.isEmpty(pushMessage.ticker))) {
            String str = pushMessage.messageCustom.content;
            pushMessage.value = str;
            pushMessage.ticker = str;
        }
        if (pushMessage.title != null && TextUtils.isEmpty(pushMessage.messageCustom.title)) {
            pushMessage.messageCustom.title = pushMessage.title;
        }
        if (TextUtils.isEmpty(pushMessage.ticker) || !TextUtils.isEmpty(pushMessage.messageCustom.content)) {
            return;
        }
        pushMessage.messageCustom.content = pushMessage.ticker;
    }

    /* JADX INFO: renamed from: h */
    public static PendingIntent m117780h(final PushMessage pushMessage, PushTrackData pushTrackData) {
        if (!m117793u() || ((ytl) vwb.m200346r(m117783k(), new w9j() { // from class: l.dqs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ytl) obj).mo100101k(pushMessage.intent));
            }
        })) == null) {
            return null;
        }
        m117779g(pushMessage);
        nj3.C18704a c18704a = new nj3.C18704a();
        c18704a.f139201a = 1;
        c18704a.f139205e = pushMessage;
        c18704a.f139206f = pushTrackData;
        ((nj3) s9s.m182763m(gld0.f103312b)).m159618P(c18704a);
        return m117784l(LiveGoDummyAct.m68896V1(s9s.f163227a), pushTrackData);
    }

    /* JADX INFO: renamed from: i */
    public static String m117781i(String str) {
        return "tantanapp://goPage/live/" + str;
    }

    /* JADX INFO: renamed from: j */
    public static Act m117782j() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity instanceof Act) {
                    return (Act) activity;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<ytl> m117783k() {
        return f92842a;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public static PendingIntent m117784l(Intent intent, PushTrackData pushTrackData) {
        if (intent == null) {
            return null;
        }
        mgh0.m154549e(intent, pushTrackData);
        return PendingIntent.getActivity(s9s.f163227a, (int) System.currentTimeMillis(), intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: m */
    public static Intent m117785m(SchemeKey schemeKey, w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!m117793u() || w2e0Var.m201094b() == null) {
            return null;
        }
        final String string = schemeKey.toString();
        if ("live".equals(string) && !TextUtils.isEmpty(w2e0Var.m201099g())) {
            string = "live" + w2e0Var.m201099g();
        }
        if (((ytl) vwb.m200346r(m117783k(), new w9j() { // from class: l.cqs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ytl) obj).mo94602l(string));
            }
        })) == null) {
            return null;
        }
        nj3.C18704a c18704a = new nj3.C18704a();
        c18704a.f139201a = 2;
        c18704a.f139202b = schemeKey.toString();
        c18704a.f139203c = w2e0Var;
        c18704a.f139204d = f30Var;
        ((nj3) s9s.m182763m(gld0.f103312b)).m159618P(c18704a);
        return LiveGoDummyAct.m68896V1(w2e0Var.m201094b());
    }

    /* JADX INFO: renamed from: n */
    public static void m117786n(Act act, String str) {
        m117789q(act, "goPage", new w2e0.C20787a(act, m117781i(str)).m201103d(), null);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m117787o(Act act, final LiveGoAction liveGoAction) {
        ytl ytlVar = (ytl) vwb.m200346r(m117783k(), new w9j() { // from class: l.bqs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ytl) obj).mo124163j(liveGoAction.getType()));
            }
        });
        if (ytlVar == null) {
            return false;
        }
        ytlVar.mo124162c(act, liveGoAction);
        return true;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: p */
    public static boolean m117788p(Act act, final PushMessage pushMessage, PushTrackData pushTrackData) {
        ytl ytlVar;
        if (!m117793u() || (ytlVar = (ytl) vwb.m200346r(m117783k(), new w9j() { // from class: l.aqs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ytl) obj).mo100101k(pushMessage.intent));
            }
        })) == null) {
            return false;
        }
        if ("notify".equals(pushMessage.messageCustom.type)) {
            if (!e51.m114736A(App.f15369e)) {
                m117779g(pushMessage);
                nj3.C18704a c18704a = new nj3.C18704a();
                c18704a.f139201a = 1;
                c18704a.f139205e = pushMessage;
                c18704a.f139206f = pushTrackData;
                ((nj3) s9s.m182763m(gld0.f103312b)).m159618P(c18704a);
                l9s.m149074f(pushMessage, m117784l(LiveGoDummyAct.m68896V1(s9s.f163227a), pushTrackData), null, null, null);
            }
            return true;
        }
        if (act == null) {
            act = m117782j();
        }
        if (act == null) {
            return false;
        }
        if ((Act.foreground_() != null ? Act.foreground_().f15343a.get() : null) == null && ytlVar.mo99016g()) {
            return true;
        }
        ytlVar.m216071q(pushMessage);
        ytlVar.m216070p(pushTrackData);
        ytlVar.mo100100d(act, pushMessage.intent, pushMessage.messageCustom);
        if (act instanceof LiveGoDummyAct) {
            act.m66873d2();
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m117789q(final Act act, final String str, final w2e0 w2e0Var, final f30<String, String> f30Var) {
        final String str2;
        if (!m117793u() || w2e0Var.m201094b() == null) {
            return false;
        }
        if (("goPage".equals(str) || "goRun".equals(str) || "live".equals(str)) && !TextUtils.isEmpty(w2e0Var.m201099g())) {
            str2 = str + w2e0Var.m201099g();
        } else {
            str2 = str;
        }
        ytl ytlVar = (ytl) vwb.m200346r(m117783k(), new w9j() { // from class: l.yps
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ytl) obj).mo94602l(str2));
            }
        });
        if (ytlVar == null) {
            return false;
        }
        if (act == null) {
            nj3.C18704a c18704a = new nj3.C18704a();
            c18704a.f139201a = 2;
            c18704a.f139202b = str;
            c18704a.f139203c = w2e0Var;
            c18704a.f139204d = f30Var;
            ((nj3) s9s.m182763m(gld0.f103312b)).m159618P(c18704a);
            w2e0Var.m201094b().startActivity(LiveGoDummyAct.m68896V1(w2e0Var.m201094b()));
            if (w2e0Var.m201094b() instanceof Activity) {
                ((Activity) w2e0Var.m201094b()).overridePendingTransition(0, 0);
            }
            return true;
        }
        if (!e51.m114739D()) {
            e51.m114748M(new Runnable() { // from class: l.zps
                @Override // java.lang.Runnable
                public final void run() {
                    eqs.m117789q(act, str, w2e0Var, f30Var);
                }
            });
            return true;
        }
        if (ytl.m216063f(act)) {
            return true;
        }
        if ((Act.foreground_() == null ? null : Act.foreground_().f15343a.get()) == null && ytlVar.mo99016g()) {
            return true;
        }
        ytlVar.mo94601e(act, str2, w2e0Var);
        if (act instanceof LiveGoDummyAct) {
            act.m66873d2();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static void m117790r() {
        f92842a.clear();
        f92842a.add(new g3k());
        m117791s();
        m117792t();
    }

    /* JADX INFO: renamed from: s */
    public static void m117791s() {
        f92842a.add(new z1k());
        f92842a.add(new k2k());
        f92842a.add(new g2k());
        f92842a.add(new v1k());
        f92842a.add(new b2k());
        f92842a.add(new y1k());
        f92842a.add(new x1k());
        f92842a.add(new e2k());
        f92842a.add(new c2k());
        f92842a.add(new n2k());
        f92842a.add(new h2k());
        f92842a.add(new w1k());
        f92842a.add(new i2k());
        f92842a.add(new f2k());
        f92842a.add(new a2k());
        f92842a.add(new d2k());
        f92842a.add(new m2k());
        f92842a.add(new o2k());
        f92842a.add(new j2k());
    }

    /* JADX INFO: renamed from: t */
    public static void m117792t() {
        f92842a.add(new h3k());
        f92842a.add(new c3k());
        f92842a.add(new b3k());
        f92842a.add(new f3k());
        f92842a.add(new e3k());
        f92842a.add(new t2k());
        f92842a.add(new j3k());
        f92842a.add(new d3k());
        f92842a.add(new q2k());
        f92842a.add(new w2k());
        f92842a.add(new a3k());
    }

    /* JADX INFO: renamed from: u */
    public static boolean m117793u() {
        return uvr.m196087d().m162672H1();
    }
}

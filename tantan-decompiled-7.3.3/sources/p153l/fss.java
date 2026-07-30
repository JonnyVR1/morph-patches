package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.external.direction.core.LiveGoDummyAct;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class fss {

    /* JADX INFO: renamed from: a */
    public static ArrayList<mwl> f100685a = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public static void m127244g(PushMessage pushMessage) {
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
    public static PendingIntent m127245h(final PushMessage pushMessage, PushTrackData pushTrackData) {
        if (!m127258u() || ((mwl) jyb.m147529r(m127248k(), new qcj() { // from class: l.ess
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((mwl) obj).mo102762k(pushMessage.intent));
            }
        })) == null) {
            return null;
        }
        m127244g(pushMessage);
        fk3.C16995a c16995a = new fk3.C16995a();
        c16995a.f99474a = 1;
        c16995a.f99478e = pushMessage;
        c16995a.f99479f = pushTrackData;
        ((fk3) tbs.m190077m(itd0.f116820b)).m125949P(c16995a);
        return m127249l(LiveGoDummyAct.m70079X1(tbs.f172988a), pushTrackData);
    }

    /* JADX INFO: renamed from: i */
    public static String m127246i(String str) {
        return "tantanapp://goPage/live/" + str;
    }

    /* JADX INFO: renamed from: j */
    public static Act m127247j() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity instanceof Act) {
                    return (Act) activity;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<mwl> m127248k() {
        return f100685a;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public static PendingIntent m127249l(Intent intent, PushTrackData pushTrackData) {
        if (intent == null) {
            return null;
        }
        toh0.m192045e(intent, pushTrackData);
        return PendingIntent.getActivity(tbs.f172988a, (int) System.currentTimeMillis(), intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: m */
    public static Intent m127250m(SchemeKey schemeKey, abe0 abe0Var, z20<String, String> z20Var) {
        if (!m127258u() || abe0Var.m96739b() == null) {
            return null;
        }
        final String string = schemeKey.toString();
        if ("live".equals(string) && !TextUtils.isEmpty(abe0Var.m96744g())) {
            string = "live" + abe0Var.m96744g();
        }
        if (((mwl) jyb.m147529r(m127248k(), new qcj() { // from class: l.dss
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((mwl) obj).mo96235l(string));
            }
        })) == null) {
            return null;
        }
        fk3.C16995a c16995a = new fk3.C16995a();
        c16995a.f99474a = 2;
        c16995a.f99475b = schemeKey.toString();
        c16995a.f99476c = abe0Var;
        c16995a.f99477d = z20Var;
        ((fk3) tbs.m190077m(itd0.f116820b)).m125949P(c16995a);
        return LiveGoDummyAct.m70079X1(abe0Var.m96739b());
    }

    /* JADX INFO: renamed from: n */
    public static void m127251n(Act act, String str) {
        m127254q(act, "goPage", new abe0.C15681a(act, m127246i(str)).m96748d(), null);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m127252o(Act act, final LiveGoAction liveGoAction) {
        mwl mwlVar = (mwl) jyb.m147529r(m127248k(), new qcj() { // from class: l.css
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((mwl) obj).mo108064j(liveGoAction.getType()));
            }
        });
        if (mwlVar == null) {
            return false;
        }
        mwlVar.mo108063c(act, liveGoAction);
        return true;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: p */
    public static boolean m127253p(Act act, final PushMessage pushMessage, PushTrackData pushTrackData) {
        mwl mwlVar;
        if (!m127258u() || (mwlVar = (mwl) jyb.m147529r(m127248k(), new qcj() { // from class: l.bss
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((mwl) obj).mo102762k(pushMessage.intent));
            }
        })) == null) {
            return false;
        }
        if ("notify".equals(pushMessage.messageCustom.type)) {
            if (!l51.m152881A(App.f16088e)) {
                m127244g(pushMessage);
                fk3.C16995a c16995a = new fk3.C16995a();
                c16995a.f99474a = 1;
                c16995a.f99478e = pushMessage;
                c16995a.f99479f = pushTrackData;
                ((fk3) tbs.m190077m(itd0.f116820b)).m125949P(c16995a);
                mbs.m157851f(pushMessage, m127249l(LiveGoDummyAct.m70079X1(tbs.f172988a), pushTrackData), null, null, null);
            }
            return true;
        }
        if (act == null) {
            act = m127247j();
        }
        if (act == null) {
            return false;
        }
        if ((Act.foreground_() != null ? Act.foreground_().f16062a.get() : null) == null && mwlVar.mo160565g()) {
            return true;
        }
        mwlVar.m160567q(pushMessage);
        mwlVar.m160566p(pushTrackData);
        mwlVar.mo102761d(act, pushMessage.intent, pushMessage.messageCustom);
        if (act instanceof LiveGoDummyAct) {
            act.m68056e2();
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m127254q(final Act act, final String str, final abe0 abe0Var, final z20<String, String> z20Var) {
        final String str2;
        if (!m127258u() || abe0Var.m96739b() == null) {
            return false;
        }
        if (("goPage".equals(str) || "goRun".equals(str) || "live".equals(str)) && !TextUtils.isEmpty(abe0Var.m96744g())) {
            str2 = str + abe0Var.m96744g();
        } else {
            str2 = str;
        }
        mwl mwlVar = (mwl) jyb.m147529r(m127248k(), new qcj() { // from class: l.zrs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((mwl) obj).mo96235l(str2));
            }
        });
        if (mwlVar == null) {
            return false;
        }
        if (act == null) {
            fk3.C16995a c16995a = new fk3.C16995a();
            c16995a.f99474a = 2;
            c16995a.f99475b = str;
            c16995a.f99476c = abe0Var;
            c16995a.f99477d = z20Var;
            ((fk3) tbs.m190077m(itd0.f116820b)).m125949P(c16995a);
            abe0Var.m96739b().startActivity(LiveGoDummyAct.m70079X1(abe0Var.m96739b()));
            if (abe0Var.m96739b() instanceof Activity) {
                ((Activity) abe0Var.m96739b()).overridePendingTransition(0, 0);
            }
            return true;
        }
        if (!l51.m152884D()) {
            l51.m152893M(new Runnable() { // from class: l.ass
                @Override // java.lang.Runnable
                public final void run() {
                    fss.m127254q(act, str, abe0Var, z20Var);
                }
            });
            return true;
        }
        if (mwl.m160557f(act)) {
            return true;
        }
        if ((Act.foreground_() == null ? null : Act.foreground_().f16062a.get()) == null && mwlVar.mo160565g()) {
            return true;
        }
        mwlVar.mo96234e(act, str2, abe0Var);
        if (act instanceof LiveGoDummyAct) {
            act.m68056e2();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static void m127255r() {
        f100685a.clear();
        f100685a.add(new y5k());
        m127256s();
        m127257t();
    }

    /* JADX INFO: renamed from: s */
    public static void m127256s() {
        f100685a.add(new r4k());
        f100685a.add(new c5k());
        f100685a.add(new y4k());
        f100685a.add(new n4k());
        f100685a.add(new t4k());
        f100685a.add(new q4k());
        f100685a.add(new p4k());
        f100685a.add(new w4k());
        f100685a.add(new u4k());
        f100685a.add(new f5k());
        f100685a.add(new z4k());
        f100685a.add(new o4k());
        f100685a.add(new a5k());
        f100685a.add(new x4k());
        f100685a.add(new s4k());
        f100685a.add(new v4k());
        f100685a.add(new e5k());
        f100685a.add(new g5k());
        f100685a.add(new b5k());
    }

    /* JADX INFO: renamed from: t */
    public static void m127257t() {
        f100685a.add(new z5k());
        f100685a.add(new u5k());
        f100685a.add(new t5k());
        f100685a.add(new x5k());
        f100685a.add(new w5k());
        f100685a.add(new l5k());
        f100685a.add(new b6k());
        f100685a.add(new v5k());
        f100685a.add(new i5k());
        f100685a.add(new o5k());
        f100685a.add(new s5k());
    }

    /* JADX INFO: renamed from: u */
    public static boolean m127258u() {
        return vxr.m203876d().m170979H1();
    }
}

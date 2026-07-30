package p149l;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tantanapp.foxstatistics.utils.NetWorkConnectionChangedReceiver;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class dwf0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f88168a;

    /* JADX INFO: renamed from: b */
    public DefaultEnvironment f88169b;

    /* JADX INFO: renamed from: c */
    public bwf0 f88170c;

    /* JADX INFO: renamed from: d */
    public cwf0.InterfaceC16263b f88171d;

    /* JADX INFO: renamed from: e */
    public AtomicLong f88172e;

    /* JADX INFO: renamed from: l.dwf0$a */
    public class C16483a implements lw0.InterfaceC18329c {

        /* JADX INFO: renamed from: a */
        public long f88173a;

        public C16483a() {
        }

        @Override // p149l.lw0.InterfaceC18329c
        public void onBack() {
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.APPQUIT;
            l3fVar.f125886e = ((SystemClock.elapsedRealtime() - this.f88173a) * 1.0d) / 1000.0d;
            zvf0.m220391m(l3fVar);
            zvf0.m220382d();
        }

        @Override // p149l.lw0.InterfaceC18329c
        public void onFront() {
            this.f88173a = SystemClock.elapsedRealtime();
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.APPSTART;
            zvf0.m220391m(l3fVar);
        }
    }

    /* JADX INFO: renamed from: l.dwf0$b */
    public class RunnableC16484b implements Runnable {
        public RunnableC16484b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oy50.m166625q(50);
            oy50.m166624p(50);
        }
    }

    /* JADX INFO: renamed from: l.dwf0$c */
    public class RunnableC16485c implements Runnable {
        public RunnableC16485c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rkd0.m179725n(50);
        }
    }

    /* JADX INFO: renamed from: l.dwf0$d */
    public static /* synthetic */ class C16486d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f88177a;

        static {
            int[] iArr = new int[EventNameEnum.values().length];
            f88177a = iArr;
            try {
                iArr[EventNameEnum.MODULE_SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88177a[EventNameEnum.MODULE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88177a[EventNameEnum.MODULE_VIEW_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88177a[EventNameEnum.MODULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88177a[EventNameEnum.MODULE_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88177a[EventNameEnum.BIZ_ORDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88177a[EventNameEnum.BIZ_PAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88177a[EventNameEnum.SYS_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88177a[EventNameEnum.USER_BEHAVIOR_COMPLEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88177a[EventNameEnum.APPSTART.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88177a[EventNameEnum.APPQUIT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88177a[EventNameEnum.APPEXIT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f88177a[EventNameEnum.APPCRASH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f88177a[EventNameEnum.PAGE_VIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f88177a[EventNameEnum.PAGE_DISAPPEAR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: l.dwf0$e */
    public static class C16487e {
        private static final dwf0 INSTANCE = new dwf0(null);
    }

    public dwf0() {
        this.f88168a = false;
        this.f88172e = new AtomicLong();
    }

    /* JADX INFO: renamed from: f */
    public static dwf0 m113869f() {
        return C16487e.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m113870a(l3f l3fVar) {
        o660 o660VarM167645d;
        if (EventNameEnum.APPCRASH.equals(l3fVar.f125885d) && (o660VarM167645d = p660.m167645d()) != null) {
            l3fVar.f125895n = o660VarM167645d.m162820c();
        }
        l3fVar.f125887f = System.currentTimeMillis();
        l3fVar.f125903v = rke0.m179730b();
        l3fVar.f125891j = rke0.m179734f();
        l3fVar.f125892k = this.f88172e.getAndIncrement();
        l3fVar.f125894m = UUID.randomUUID().toString();
        l3fVar.f125893l = lw0.f130219b ? 2 : 0;
        l3fVar.f125888g = nu40.m161425a();
        l3fVar.f125889h = nu40.m161427c();
        l3fVar.f125882a = 1;
        m113871b(l3fVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m113871b(l3f l3fVar) {
        switch (C16486d.f88177a[l3fVar.f125885d.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                o660 o660VarM167645d = p660.m167645d();
                if (o660VarM167645d != null) {
                    if (TextUtils.isEmpty(l3fVar.f125895n)) {
                        l3fVar.f125895n = o660VarM167645d.m162820c();
                        l3fVar.f125884c = true;
                    }
                    o660 o660VarM167644c = p660.m167644c(l3fVar.f125895n);
                    if (o660VarM167644c != null) {
                        l3fVar.f125897p = o660VarM167644c.m162818a();
                        l3fVar.f125898q = o660VarM167644c.m162823f();
                        l3fVar.f125896o = o660VarM167644c.m162821d();
                        l3fVar.f125899r = o660VarM167644c.m162822e();
                        try {
                            if (o660VarM167644c.m162819b() != null && !EventNameEnum.SYS_CHECK.equals(l3fVar.f125885d)) {
                                JSONObject jSONObject = l3fVar.f125904w;
                                if (jSONObject != null) {
                                    jSONObject.put("pageExtras", o660VarM167644c.m162819b());
                                } else {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("pageExtras", o660VarM167644c.m162819b());
                                    l3fVar.f125904w = jSONObject2;
                                }
                                break;
                            }
                        } catch (Exception e) {
                            sm80.m184942b(e);
                            return;
                        }
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m113872c() {
        my50.m156954e().m156955c(new RunnableC16484b());
        qkd0.m175359e().m175360c(new RunnableC16485c());
    }

    /* JADX INFO: renamed from: d */
    public DefaultEnvironment m113873d() {
        return this.f88169b;
    }

    /* JADX INFO: renamed from: e */
    public AtomicLong m113874e() {
        return this.f88172e;
    }

    /* JADX INFO: renamed from: g */
    public void m113875g(Context context) {
        if (this.f88168a || context == null) {
            return;
        }
        this.f88172e.set(gwe0.m128396a());
        my50.m156954e().m156958g(Message.obtain());
        qkd0.m175359e().m175363g(Message.obtain());
        this.f88169b = DefaultEnvironment.m81324c(context);
        this.f88168a = true;
        lw0.m151927c().m151928b(new C16483a());
        m113877i(context);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m113876h(l3f l3fVar) {
        switch (C16486d.f88177a[l3fVar.f125885d.ordinal()]) {
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 8:
            case 9:
            default:
                return l3fVar.m148391a().booleanValue();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m113877i(Context context) {
        if (context == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(context, new NetWorkConnectionChangedReceiver(), intentFilter);
    }

    /* JADX INFO: renamed from: j */
    public void m113878j(l3f l3fVar) {
        if (l3fVar == null || zvf0.m220383e() == null) {
            return;
        }
        m113870a(l3fVar);
        bwf0 bwf0Var = this.f88170c;
        if (bwf0Var != null) {
            bwf0Var.mo104155a(l3fVar);
        }
        if (m113876h(l3fVar)) {
            m113879k(l3fVar);
        } else if (EventNameEnum.SYS_CHECK.equals(l3fVar.f125885d)) {
            m113883o(l3fVar);
        } else {
            m113882n(l3fVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m113879k(l3f l3fVar) {
        mtc0.m156196f(l3fVar);
    }

    /* JADX INFO: renamed from: l */
    public void m113880l(EventNameEnum eventNameEnum, String str, String str2, JSONObject jSONObject) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = eventNameEnum;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        l3fVar.f125904w = jSONObject;
        l3fVar.m148392b(Boolean.TRUE);
        m113878j(l3fVar);
    }

    /* JADX INFO: renamed from: m */
    public void m113881m(EventNameEnum eventNameEnum, String str, String str2, JSONObject jSONObject) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = eventNameEnum;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        l3fVar.f125904w = jSONObject;
        m113878j(l3fVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m113882n(l3f l3fVar) {
        mtc0.m156197g(l3fVar);
    }

    /* JADX INFO: renamed from: o */
    public final void m113883o(l3f l3fVar) {
        mtc0.m156198h(l3fVar);
    }

    /* JADX INFO: renamed from: p */
    public void m113884p(String str) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = "e_foxstatistics_exception";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ex", e5f.m114787a(str));
            l3fVar.f125904w = jSONObject;
            m113878j(l3fVar);
        } catch (JSONException e) {
            sm80.m184942b(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m113885q(cwf0.InterfaceC16263b interfaceC16263b) {
        this.f88171d = interfaceC16263b;
    }

    /* JADX INFO: renamed from: r */
    public void m113886r(bwf0 bwf0Var) {
        this.f88170c = bwf0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m113887s(String str, Object obj) {
        DefaultEnvironment defaultEnvironment = this.f88169b;
        if (defaultEnvironment != null) {
            defaultEnvironment.m81327f(str, obj);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m113888t(wj2 wj2Var) {
        this.f88169b.m81329h(wj2Var);
    }

    public /* synthetic */ dwf0(C16483a c16483a) {
        this();
    }
}

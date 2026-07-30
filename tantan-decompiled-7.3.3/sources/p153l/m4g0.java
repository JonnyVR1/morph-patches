package p153l;

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

/* JADX INFO: loaded from: classes11.dex */
public class m4g0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f134792a;

    /* JADX INFO: renamed from: b */
    public DefaultEnvironment f134793b;

    /* JADX INFO: renamed from: c */
    public k4g0 f134794c;

    /* JADX INFO: renamed from: d */
    public l4g0.InterfaceC18345b f134795d;

    /* JADX INFO: renamed from: e */
    public AtomicLong f134796e;

    /* JADX INFO: renamed from: l.m4g0$a */
    public class C18541a implements sw0.InterfaceC20166c {

        /* JADX INFO: renamed from: a */
        public long f134797a;

        public C18541a() {
        }

        @Override // p153l.sw0.InterfaceC20166c
        public void onBack() {
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.APPQUIT;
            q4fVar.f155567e = ((SystemClock.elapsedRealtime() - this.f134797a) * 1.0d) / 1000.0d;
            i4g0.m138515m(q4fVar);
            i4g0.m138506d();
        }

        @Override // p153l.sw0.InterfaceC20166c
        public void onFront() {
            this.f134797a = SystemClock.elapsedRealtime();
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.APPSTART;
            i4g0.m138515m(q4fVar);
        }
    }

    /* JADX INFO: renamed from: l.m4g0$b */
    public class RunnableC18542b implements Runnable {
        public RunnableC18542b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t660.m189509q(50);
            t660.m189508p(50);
        }
    }

    /* JADX INFO: renamed from: l.m4g0$c */
    public class RunnableC18543c implements Runnable {
        public RunnableC18543c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            usd0.m197874n(50);
        }
    }

    /* JADX INFO: renamed from: l.m4g0$d */
    public static /* synthetic */ class C18544d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134801a;

        static {
            int[] iArr = new int[EventNameEnum.values().length];
            f134801a = iArr;
            try {
                iArr[EventNameEnum.MODULE_SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f134801a[EventNameEnum.MODULE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f134801a[EventNameEnum.MODULE_VIEW_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f134801a[EventNameEnum.MODULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f134801a[EventNameEnum.MODULE_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f134801a[EventNameEnum.BIZ_ORDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f134801a[EventNameEnum.BIZ_PAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f134801a[EventNameEnum.SYS_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f134801a[EventNameEnum.USER_BEHAVIOR_COMPLEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f134801a[EventNameEnum.APPSTART.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f134801a[EventNameEnum.APPQUIT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f134801a[EventNameEnum.APPEXIT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f134801a[EventNameEnum.APPCRASH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f134801a[EventNameEnum.PAGE_VIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f134801a[EventNameEnum.PAGE_DISAPPEAR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: l.m4g0$e */
    public static class C18545e {
        private static final m4g0 INSTANCE = new m4g0(null);
    }

    public m4g0() {
        this.f134792a = false;
        this.f134796e = new AtomicLong();
    }

    /* JADX INFO: renamed from: f */
    public static m4g0 m157014f() {
        return C18545e.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m157015a(q4f q4fVar) {
        ue60 ue60VarM201037d;
        if (EventNameEnum.APPCRASH.equals(q4fVar.f155566d) && (ue60VarM201037d = ve60.m201037d()) != null) {
            q4fVar.f155576n = ue60VarM201037d.m195739c();
        }
        q4fVar.f155568f = System.currentTimeMillis();
        q4fVar.f155584v = wse0.m207754b();
        q4fVar.f155572j = wse0.m207758f();
        q4fVar.f155573k = this.f134796e.getAndIncrement();
        q4fVar.f155575m = UUID.randomUUID().toString();
        q4fVar.f155574l = sw0.f170906b ? 2 : 0;
        q4fVar.f155569g = c350.m107768a();
        q4fVar.f155570h = c350.m107770c();
        q4fVar.f155563a = 1;
        m157016b(q4fVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m157016b(q4f q4fVar) {
        switch (C18544d.f134801a[q4fVar.f155566d.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                ue60 ue60VarM201037d = ve60.m201037d();
                if (ue60VarM201037d != null) {
                    if (TextUtils.isEmpty(q4fVar.f155576n)) {
                        q4fVar.f155576n = ue60VarM201037d.m195739c();
                        q4fVar.f155565c = true;
                    }
                    ue60 ue60VarM201036c = ve60.m201036c(q4fVar.f155576n);
                    if (ue60VarM201036c != null) {
                        q4fVar.f155578p = ue60VarM201036c.m195737a();
                        q4fVar.f155579q = ue60VarM201036c.m195742f();
                        q4fVar.f155577o = ue60VarM201036c.m195740d();
                        q4fVar.f155580r = ue60VarM201036c.m195741e();
                        try {
                            if (ue60VarM201036c.m195738b() != null && !EventNameEnum.SYS_CHECK.equals(q4fVar.f155566d)) {
                                JSONObject jSONObject = q4fVar.f155585w;
                                if (jSONObject != null) {
                                    jSONObject.put("pageExtras", ue60VarM201036c.m195738b());
                                } else {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("pageExtras", ue60VarM201036c.m195738b());
                                    q4fVar.f155585w = jSONObject2;
                                }
                                break;
                            }
                        } catch (Exception e) {
                            wu80.m207938b(e);
                            return;
                        }
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m157017c() {
        r660.m179993e().m179994c(new RunnableC18542b());
        tsd0.m192578e().m192579c(new RunnableC18543c());
    }

    /* JADX INFO: renamed from: d */
    public DefaultEnvironment m157018d() {
        return this.f134793b;
    }

    /* JADX INFO: renamed from: e */
    public AtomicLong m157019e() {
        return this.f134796e;
    }

    /* JADX INFO: renamed from: g */
    public void m157020g(Context context) {
        if (this.f134792a || context == null) {
            return;
        }
        this.f134796e.set(n4f0.m161558a());
        r660.m179993e().m179997g(Message.obtain());
        tsd0.m192578e().m192582g(Message.obtain());
        this.f134793b = DefaultEnvironment.m82507c(context);
        this.f134792a = true;
        sw0.m188232c().m188233b(new C18541a());
        m157022i(context);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m157021h(q4f q4fVar) {
        switch (C18544d.f134801a[q4fVar.f155566d.ordinal()]) {
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
                return q4fVar.m175209a().booleanValue();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m157022i(Context context) {
        if (context == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context, new NetWorkConnectionChangedReceiver(), intentFilter);
    }

    /* JADX INFO: renamed from: j */
    public void m157023j(q4f q4fVar) {
        if (q4fVar == null || i4g0.m138507e() == null) {
            return;
        }
        m157015a(q4fVar);
        k4g0 k4g0Var = this.f134794c;
        if (k4g0Var != null) {
            k4g0Var.mo148243a(q4fVar);
        }
        if (m157021h(q4fVar)) {
            m157024k(q4fVar);
        } else if (EventNameEnum.SYS_CHECK.equals(q4fVar.f155566d)) {
            m157028o(q4fVar);
        } else {
            m157027n(q4fVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m157024k(q4f q4fVar) {
        r1d0.m179403f(q4fVar);
    }

    /* JADX INFO: renamed from: l */
    public void m157025l(EventNameEnum eventNameEnum, String str, String str2, JSONObject jSONObject) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = eventNameEnum;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        q4fVar.f155585w = jSONObject;
        q4fVar.m175210b(Boolean.TRUE);
        m157023j(q4fVar);
    }

    /* JADX INFO: renamed from: m */
    public void m157026m(EventNameEnum eventNameEnum, String str, String str2, JSONObject jSONObject) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = eventNameEnum;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        q4fVar.f155585w = jSONObject;
        m157023j(q4fVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m157027n(q4f q4fVar) {
        r1d0.m179404g(q4fVar);
    }

    /* JADX INFO: renamed from: o */
    public final void m157028o(q4f q4fVar) {
        r1d0.m179405h(q4fVar);
    }

    /* JADX INFO: renamed from: p */
    public void m157029p(String str) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = "e_foxstatistics_exception";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ex", i6f.m138813a(str));
            q4fVar.f155585w = jSONObject;
            m157023j(q4fVar);
        } catch (JSONException e) {
            wu80.m207938b(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m157030q(l4g0.InterfaceC18345b interfaceC18345b) {
        this.f134795d = interfaceC18345b;
    }

    /* JADX INFO: renamed from: r */
    public void m157031r(k4g0 k4g0Var) {
        this.f134794c = k4g0Var;
    }

    /* JADX INFO: renamed from: s */
    public void m157032s(String str, Object obj) {
        DefaultEnvironment defaultEnvironment = this.f134793b;
        if (defaultEnvironment != null) {
            defaultEnvironment.m82510f(str, obj);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m157033t(ek2 ek2Var) {
        this.f134793b.m82512h(ek2Var);
    }

    public /* synthetic */ m4g0(C18541a c18541a) {
        this();
    }
}

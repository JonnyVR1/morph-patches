package p149l;

import android.content.Context;
import com.xiaomi.mipush.sdk.EnumC14720d;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.service.C14837ah;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class xqq0 implements InterfaceC20816w7 {

    /* JADX INFO: renamed from: e */
    private static volatile xqq0 f194024e;

    /* JADX INFO: renamed from: a */
    private Context f194025a;

    /* JADX INFO: renamed from: b */
    private beb0 f194026b;

    /* JADX INFO: renamed from: c */
    private boolean f194027c = false;

    /* JADX INFO: renamed from: d */
    private Map<EnumC14720d, InterfaceC20816w7> f194028d = new HashMap();

    /* JADX INFO: renamed from: l.xqq0$a */
    public class C21200a extends C14837ah.a {
        public C21200a(int i, String str) {
            super(i, str);
        }

        @Override // com.xiaomi.push.service.C14837ah.a
        public void onCallback() {
            boolean zM86489a = C14837ah.m86477a(xqq0.this.f194025a).m86489a(EnumC14745gk.AggregatePushSwitch.m85646a(), true);
            if (xqq0.this.f194027c != zM86489a) {
                xqq0.this.f194027c = zM86489a;
                hsq0.m132798l(xqq0.this.f194025a);
            }
        }
    }

    /* JADX INFO: renamed from: l.xqq0$b */
    public static /* synthetic */ class C21201b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f194030a;

        static {
            int[] iArr = new int[EnumC14720d.values().length];
            f194030a = iArr;
            try {
                iArr[EnumC14720d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f194030a[EnumC14720d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f194030a[EnumC14720d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f194030a[EnumC14720d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private xqq0(Context context) {
        this.f194025a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static xqq0 m210593c(Context context) {
        if (f194024e == null) {
            synchronized (xqq0.class) {
                try {
                    if (f194024e == null) {
                        f194024e = new xqq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f194024e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171  */
    /* JADX INFO: renamed from: d */
    private void m210594d() {
        EnumC14720d enumC14720d;
        InterfaceC20816w7 interfaceC20816w7M210597b;
        EnumC14720d enumC14720d2;
        InterfaceC20816w7 interfaceC20816w7M210597b2;
        EnumC14720d enumC14720d3;
        InterfaceC20816w7 interfaceC20816w7M210597b3;
        InterfaceC20816w7 interfaceC20816w7M210597b4;
        beb0 beb0Var = this.f194026b;
        if (beb0Var != null) {
            if (beb0Var.m101328d()) {
                ilq0.m137040m("ASSEMBLE_PUSH : ".concat(" HW user switch : " + this.f194026b.m101328d() + " HW online switch : " + hsq0.m132793g(this.f194025a, EnumC14720d.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + ztq0.m220132c(this.f194025a)));
            }
            if (this.f194026b.m101328d()) {
                Context context = this.f194025a;
                EnumC14720d enumC14720d4 = EnumC14720d.ASSEMBLE_PUSH_HUAWEI;
                if (hsq0.m132793g(context, enumC14720d4) && ztq0.m220132c(this.f194025a)) {
                    if (!m210601h(enumC14720d4)) {
                        m210599f(enumC14720d4, pwq0.m171763a(this.f194025a, enumC14720d4));
                    }
                    ilq0.m137053z("hw manager add to list");
                } else {
                    enumC14720d = EnumC14720d.ASSEMBLE_PUSH_HUAWEI;
                    if (m210601h(enumC14720d) && (interfaceC20816w7M210597b = m210597b(enumC14720d)) != null) {
                        m210598e(enumC14720d);
                        interfaceC20816w7M210597b.unregister();
                    }
                }
            } else {
                enumC14720d = EnumC14720d.ASSEMBLE_PUSH_HUAWEI;
                if (m210601h(enumC14720d)) {
                    m210598e(enumC14720d);
                    interfaceC20816w7M210597b.unregister();
                }
            }
            if (this.f194026b.m101326b()) {
                ilq0.m137040m("ASSEMBLE_PUSH : ".concat(" FCM user switch : " + this.f194026b.m101326b() + " FCM online switch : " + hsq0.m132793g(this.f194025a, EnumC14720d.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + ztq0.m220133d(this.f194025a)));
            }
            if (this.f194026b.m101326b()) {
                Context context2 = this.f194025a;
                EnumC14720d enumC14720d5 = EnumC14720d.ASSEMBLE_PUSH_FCM;
                if (hsq0.m132793g(context2, enumC14720d5) && ztq0.m220133d(this.f194025a)) {
                    if (!m210601h(enumC14720d5)) {
                        m210599f(enumC14720d5, pwq0.m171763a(this.f194025a, enumC14720d5));
                    }
                    ilq0.m137053z("fcm manager add to list");
                } else {
                    enumC14720d2 = EnumC14720d.ASSEMBLE_PUSH_FCM;
                    if (m210601h(enumC14720d2) && (interfaceC20816w7M210597b2 = m210597b(enumC14720d2)) != null) {
                        m210598e(enumC14720d2);
                        interfaceC20816w7M210597b2.unregister();
                    }
                }
            } else {
                enumC14720d2 = EnumC14720d.ASSEMBLE_PUSH_FCM;
                if (m210601h(enumC14720d2)) {
                    m210598e(enumC14720d2);
                    interfaceC20816w7M210597b2.unregister();
                }
            }
            if (this.f194026b.m101325a()) {
                ilq0.m137040m("ASSEMBLE_PUSH : ".concat(" COS user switch : " + this.f194026b.m101325a() + " COS online switch : " + hsq0.m132793g(this.f194025a, EnumC14720d.ASSEMBLE_PUSH_COS) + " COS isSupport : " + ztq0.m220134e(this.f194025a)));
            }
            if (this.f194026b.m101325a()) {
                Context context3 = this.f194025a;
                EnumC14720d enumC14720d6 = EnumC14720d.ASSEMBLE_PUSH_COS;
                if (hsq0.m132793g(context3, enumC14720d6) && ztq0.m220134e(this.f194025a)) {
                    m210599f(enumC14720d6, pwq0.m171763a(this.f194025a, enumC14720d6));
                } else {
                    enumC14720d3 = EnumC14720d.ASSEMBLE_PUSH_COS;
                    if (m210601h(enumC14720d3) && (interfaceC20816w7M210597b3 = m210597b(enumC14720d3)) != null) {
                        m210598e(enumC14720d3);
                        interfaceC20816w7M210597b3.unregister();
                    }
                }
            } else {
                enumC14720d3 = EnumC14720d.ASSEMBLE_PUSH_COS;
                if (m210601h(enumC14720d3)) {
                    m210598e(enumC14720d3);
                    interfaceC20816w7M210597b3.unregister();
                }
            }
            if (this.f194026b.m101327c()) {
                Context context4 = this.f194025a;
                EnumC14720d enumC14720d7 = EnumC14720d.ASSEMBLE_PUSH_FTOS;
                if (hsq0.m132793g(context4, enumC14720d7) && ztq0.m220135f(this.f194025a)) {
                    m210599f(enumC14720d7, pwq0.m171763a(this.f194025a, enumC14720d7));
                    return;
                }
            }
            EnumC14720d enumC14720d8 = EnumC14720d.ASSEMBLE_PUSH_FTOS;
            if (!m210601h(enumC14720d8) || (interfaceC20816w7M210597b4 = m210597b(enumC14720d8)) == null) {
                return;
            }
            m210598e(enumC14720d8);
            interfaceC20816w7M210597b4.unregister();
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC20816w7 m210597b(EnumC14720d enumC14720d) {
        return this.f194028d.get(enumC14720d);
    }

    /* JADX INFO: renamed from: e */
    public void m210598e(EnumC14720d enumC14720d) {
        this.f194028d.remove(enumC14720d);
    }

    /* JADX INFO: renamed from: f */
    public void m210599f(EnumC14720d enumC14720d, InterfaceC20816w7 interfaceC20816w7) {
        if (interfaceC20816w7 != null) {
            if (this.f194028d.containsKey(enumC14720d)) {
                this.f194028d.remove(enumC14720d);
            }
            this.f194028d.put(enumC14720d, interfaceC20816w7);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m210600g(beb0 beb0Var) {
        this.f194026b = beb0Var;
        this.f194027c = C14837ah.m86477a(this.f194025a).m86489a(EnumC14745gk.AggregatePushSwitch.m85646a(), true);
        if (this.f194026b.m101328d() || this.f194026b.m101326b() || this.f194026b.m101325a() || this.f194026b.m101327c()) {
            C14837ah.m86477a(this.f194025a).m86486a(new C21200a(101, "assemblePush"));
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m210601h(EnumC14720d enumC14720d) {
        return this.f194028d.containsKey(enumC14720d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r3 != 4) goto L27;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m210602k(com.xiaomi.mipush.sdk.EnumC14720d r3) {
        /*
            r2 = this;
            int[] r0 = p149l.xqq0.C21201b.f194030a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L31
            r0 = 2
            if (r3 == r0) goto L28
            r0 = 3
            if (r3 == r0) goto L16
            r0 = 4
            if (r3 == r0) goto L1e
            goto L3a
        L16:
            l.beb0 r3 = r2.f194026b
            if (r3 == 0) goto L1e
            boolean r1 = r3.m101325a()
        L1e:
            l.beb0 r2 = r2.f194026b
            if (r2 == 0) goto L27
            boolean r2 = r2.m101327c()
            return r2
        L27:
            return r1
        L28:
            l.beb0 r2 = r2.f194026b
            if (r2 == 0) goto L3a
            boolean r2 = r2.m101326b()
            return r2
        L31:
            l.beb0 r2 = r2.f194026b
            if (r2 == 0) goto L3a
            boolean r2 = r2.m101328d()
            return r2
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.xqq0.m210602k(com.xiaomi.mipush.sdk.d):boolean");
    }

    @Override // p149l.InterfaceC20816w7
    public void register() {
        ilq0.m137040m("ASSEMBLE_PUSH : assemble push register");
        if (this.f194028d.size() <= 0) {
            m210594d();
        }
        if (this.f194028d.size() > 0) {
            for (InterfaceC20816w7 interfaceC20816w7 : this.f194028d.values()) {
                if (interfaceC20816w7 != null) {
                    interfaceC20816w7.register();
                }
            }
            hsq0.m132792f(this.f194025a);
        }
    }

    @Override // p149l.InterfaceC20816w7
    public void unregister() {
        ilq0.m137040m("ASSEMBLE_PUSH : assemble push unregister");
        for (InterfaceC20816w7 interfaceC20816w7 : this.f194028d.values()) {
            if (interfaceC20816w7 != null) {
                interfaceC20816w7.unregister();
            }
        }
        this.f194028d.clear();
    }
}

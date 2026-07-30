package p153l;

import android.content.Context;
import com.xiaomi.mipush.sdk.EnumC14868d;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.service.C14985ah;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d0r0 implements InterfaceC19782r7 {

    /* JADX INFO: renamed from: e */
    private static volatile d0r0 f84593e;

    /* JADX INFO: renamed from: a */
    private Context f84594a;

    /* JADX INFO: renamed from: b */
    private fmb0 f84595b;

    /* JADX INFO: renamed from: c */
    private boolean f84596c = false;

    /* JADX INFO: renamed from: d */
    private Map<EnumC14868d, InterfaceC19782r7> f84597d = new HashMap();

    /* JADX INFO: renamed from: l.d0r0$a */
    public class C16411a extends C14985ah.a {
        public C16411a(int i, String str) {
            super(i, str);
        }

        @Override // com.xiaomi.push.service.C14985ah.a
        public void onCallback() {
            boolean zM87660a = C14985ah.m87648a(d0r0.this.f84594a).m87660a(EnumC14893gk.AggregatePushSwitch.m86817a(), true);
            if (d0r0.this.f84596c != zM87660a) {
                d0r0.this.f84596c = zM87660a;
                n1r0.m161140l(d0r0.this.f84594a);
            }
        }
    }

    /* JADX INFO: renamed from: l.d0r0$b */
    public static /* synthetic */ class C16412b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f84599a;

        static {
            int[] iArr = new int[EnumC14868d.values().length];
            f84599a = iArr;
            try {
                iArr[EnumC14868d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84599a[EnumC14868d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84599a[EnumC14868d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84599a[EnumC14868d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private d0r0(Context context) {
        this.f84594a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static d0r0 m113425c(Context context) {
        if (f84593e == null) {
            synchronized (d0r0.class) {
                try {
                    if (f84593e == null) {
                        f84593e = new d0r0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f84593e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171  */
    /* JADX INFO: renamed from: d */
    private void m113426d() {
        EnumC14868d enumC14868d;
        InterfaceC19782r7 interfaceC19782r7M113429b;
        EnumC14868d enumC14868d2;
        InterfaceC19782r7 interfaceC19782r7M113429b2;
        EnumC14868d enumC14868d3;
        InterfaceC19782r7 interfaceC19782r7M113429b3;
        InterfaceC19782r7 interfaceC19782r7M113429b4;
        fmb0 fmb0Var = this.f84595b;
        if (fmb0Var != null) {
            if (fmb0Var.m126218d()) {
                ouq0.m169393m("ASSEMBLE_PUSH : ".concat(" HW user switch : " + this.f84595b.m126218d() + " HW online switch : " + n1r0.m161135g(this.f84594a, EnumC14868d.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + f3r0.m123796c(this.f84594a)));
            }
            if (this.f84595b.m126218d()) {
                Context context = this.f84594a;
                EnumC14868d enumC14868d4 = EnumC14868d.ASSEMBLE_PUSH_HUAWEI;
                if (n1r0.m161135g(context, enumC14868d4) && f3r0.m123796c(this.f84594a)) {
                    if (!m113433h(enumC14868d4)) {
                        m113431f(enumC14868d4, v5r0.m199917a(this.f84594a, enumC14868d4));
                    }
                    ouq0.m169406z("hw manager add to list");
                } else {
                    enumC14868d = EnumC14868d.ASSEMBLE_PUSH_HUAWEI;
                    if (m113433h(enumC14868d) && (interfaceC19782r7M113429b = m113429b(enumC14868d)) != null) {
                        m113430e(enumC14868d);
                        interfaceC19782r7M113429b.unregister();
                    }
                }
            } else {
                enumC14868d = EnumC14868d.ASSEMBLE_PUSH_HUAWEI;
                if (m113433h(enumC14868d)) {
                    m113430e(enumC14868d);
                    interfaceC19782r7M113429b.unregister();
                }
            }
            if (this.f84595b.m126216b()) {
                ouq0.m169393m("ASSEMBLE_PUSH : ".concat(" FCM user switch : " + this.f84595b.m126216b() + " FCM online switch : " + n1r0.m161135g(this.f84594a, EnumC14868d.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + f3r0.m123797d(this.f84594a)));
            }
            if (this.f84595b.m126216b()) {
                Context context2 = this.f84594a;
                EnumC14868d enumC14868d5 = EnumC14868d.ASSEMBLE_PUSH_FCM;
                if (n1r0.m161135g(context2, enumC14868d5) && f3r0.m123797d(this.f84594a)) {
                    if (!m113433h(enumC14868d5)) {
                        m113431f(enumC14868d5, v5r0.m199917a(this.f84594a, enumC14868d5));
                    }
                    ouq0.m169406z("fcm manager add to list");
                } else {
                    enumC14868d2 = EnumC14868d.ASSEMBLE_PUSH_FCM;
                    if (m113433h(enumC14868d2) && (interfaceC19782r7M113429b2 = m113429b(enumC14868d2)) != null) {
                        m113430e(enumC14868d2);
                        interfaceC19782r7M113429b2.unregister();
                    }
                }
            } else {
                enumC14868d2 = EnumC14868d.ASSEMBLE_PUSH_FCM;
                if (m113433h(enumC14868d2)) {
                    m113430e(enumC14868d2);
                    interfaceC19782r7M113429b2.unregister();
                }
            }
            if (this.f84595b.m126215a()) {
                ouq0.m169393m("ASSEMBLE_PUSH : ".concat(" COS user switch : " + this.f84595b.m126215a() + " COS online switch : " + n1r0.m161135g(this.f84594a, EnumC14868d.ASSEMBLE_PUSH_COS) + " COS isSupport : " + f3r0.m123798e(this.f84594a)));
            }
            if (this.f84595b.m126215a()) {
                Context context3 = this.f84594a;
                EnumC14868d enumC14868d6 = EnumC14868d.ASSEMBLE_PUSH_COS;
                if (n1r0.m161135g(context3, enumC14868d6) && f3r0.m123798e(this.f84594a)) {
                    m113431f(enumC14868d6, v5r0.m199917a(this.f84594a, enumC14868d6));
                } else {
                    enumC14868d3 = EnumC14868d.ASSEMBLE_PUSH_COS;
                    if (m113433h(enumC14868d3) && (interfaceC19782r7M113429b3 = m113429b(enumC14868d3)) != null) {
                        m113430e(enumC14868d3);
                        interfaceC19782r7M113429b3.unregister();
                    }
                }
            } else {
                enumC14868d3 = EnumC14868d.ASSEMBLE_PUSH_COS;
                if (m113433h(enumC14868d3)) {
                    m113430e(enumC14868d3);
                    interfaceC19782r7M113429b3.unregister();
                }
            }
            if (this.f84595b.m126217c()) {
                Context context4 = this.f84594a;
                EnumC14868d enumC14868d7 = EnumC14868d.ASSEMBLE_PUSH_FTOS;
                if (n1r0.m161135g(context4, enumC14868d7) && f3r0.m123799f(this.f84594a)) {
                    m113431f(enumC14868d7, v5r0.m199917a(this.f84594a, enumC14868d7));
                    return;
                }
            }
            EnumC14868d enumC14868d8 = EnumC14868d.ASSEMBLE_PUSH_FTOS;
            if (!m113433h(enumC14868d8) || (interfaceC19782r7M113429b4 = m113429b(enumC14868d8)) == null) {
                return;
            }
            m113430e(enumC14868d8);
            interfaceC19782r7M113429b4.unregister();
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC19782r7 m113429b(EnumC14868d enumC14868d) {
        return this.f84597d.get(enumC14868d);
    }

    /* JADX INFO: renamed from: e */
    public void m113430e(EnumC14868d enumC14868d) {
        this.f84597d.remove(enumC14868d);
    }

    /* JADX INFO: renamed from: f */
    public void m113431f(EnumC14868d enumC14868d, InterfaceC19782r7 interfaceC19782r7) {
        if (interfaceC19782r7 != null) {
            if (this.f84597d.containsKey(enumC14868d)) {
                this.f84597d.remove(enumC14868d);
            }
            this.f84597d.put(enumC14868d, interfaceC19782r7);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m113432g(fmb0 fmb0Var) {
        this.f84595b = fmb0Var;
        this.f84596c = C14985ah.m87648a(this.f84594a).m87660a(EnumC14893gk.AggregatePushSwitch.m86817a(), true);
        if (this.f84595b.m126218d() || this.f84595b.m126216b() || this.f84595b.m126215a() || this.f84595b.m126217c()) {
            C14985ah.m87648a(this.f84594a).m87657a(new C16411a(101, "assemblePush"));
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m113433h(EnumC14868d enumC14868d) {
        return this.f84597d.containsKey(enumC14868d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r3 != 4) goto L27;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m113434k(EnumC14868d enumC14868d) {
        int i = C16412b.f84599a[enumC14868d.ordinal()];
        boolean zM126215a = false;
        if (i == 1) {
            fmb0 fmb0Var = this.f84595b;
            if (fmb0Var != null) {
                return fmb0Var.m126218d();
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    fmb0 fmb0Var2 = this.f84595b;
                    if (fmb0Var2 != null) {
                        zM126215a = fmb0Var2.m126215a();
                    }
                }
                fmb0 fmb0Var3 = this.f84595b;
                return fmb0Var3 != null ? fmb0Var3.m126217c() : zM126215a;
            }
            fmb0 fmb0Var4 = this.f84595b;
            if (fmb0Var4 != null) {
                return fmb0Var4.m126216b();
            }
        }
        return false;
    }

    @Override // p153l.InterfaceC19782r7
    public void register() {
        ouq0.m169393m("ASSEMBLE_PUSH : assemble push register");
        if (this.f84597d.size() <= 0) {
            m113426d();
        }
        if (this.f84597d.size() > 0) {
            for (InterfaceC19782r7 interfaceC19782r7 : this.f84597d.values()) {
                if (interfaceC19782r7 != null) {
                    interfaceC19782r7.register();
                }
            }
            n1r0.m161134f(this.f84594a);
        }
    }

    @Override // p153l.InterfaceC19782r7
    public void unregister() {
        ouq0.m169393m("ASSEMBLE_PUSH : assemble push unregister");
        for (InterfaceC19782r7 interfaceC19782r7 : this.f84597d.values()) {
            if (interfaceC19782r7 != null) {
                interfaceC19782r7.unregister();
            }
        }
        this.f84597d.clear();
    }
}

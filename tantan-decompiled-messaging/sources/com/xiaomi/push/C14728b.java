package com.xiaomi.push;

import com.xiaomi.push.service.C14842am;
import com.xiaomi.push.service.XMPushService;
import p149l.osq0;

/* JADX INFO: renamed from: com.xiaomi.push.b */
/* JADX INFO: loaded from: classes2.dex */
class C14728b implements C14842am.b.a {

    /* JADX INFO: renamed from: a */
    private XMPushService f61642a;

    /* JADX INFO: renamed from: b */
    private C14842am.b f61643b;

    /* JADX INFO: renamed from: c */
    private osq0 f61644c;

    /* JADX INFO: renamed from: e */
    private int f61646e;

    /* JADX INFO: renamed from: f */
    private boolean f61647f = false;

    /* JADX INFO: renamed from: d */
    private C14842am.c f61645d = C14842am.c.binding;

    /* JADX INFO: renamed from: com.xiaomi.push.b$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f61649a;

        static {
            int[] iArr = new int[C14842am.c.values().length];
            f61649a = iArr;
            try {
                iArr[C14842am.c.unbind.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61649a[C14842am.c.binding.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61649a[C14842am.c.binded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C14728b(XMPushService xMPushService, C14842am.b bVar) {
        this.f61642a = xMPushService;
        this.f61643b = bVar;
    }

    /* JADX INFO: renamed from: c */
    private void m85458c() {
        this.f61643b.m86534b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m85459d() {
        m85458c();
        if (this.f61647f && this.f61646e != 11) {
            C14734ej c14734ejM85877a = C14761h.m85875f().m85877a();
            int i = b.f61649a[this.f61645d.ordinal()];
            if (i == 1) {
                int i2 = this.f61646e;
                if (i2 == 17) {
                    c14734ejM85877a.f61739a = EnumC14733ei.BIND_TCP_READ_TIMEOUT.m85528a();
                } else if (i2 == 21) {
                    c14734ejM85877a.f61739a = EnumC14733ei.BIND_TIMEOUT.m85528a();
                } else {
                    try {
                        C14731e.a aVarM85524d = C14731e.m85524d(C14761h.m85874e().m85568a());
                        c14734ejM85877a.f61739a = aVarM85524d.f61654a.m85528a();
                        c14734ejM85877a.m85544c(aVarM85524d.f61655b);
                    } catch (NullPointerException unused) {
                        c14734ejM85877a = null;
                    }
                }
            } else if (i == 3) {
                c14734ejM85877a.f61739a = EnumC14733ei.BIND_SUCCESS.m85528a();
            }
            if (c14734ejM85877a != null) {
                c14734ejM85877a.m85539b(this.f61644c.mo165884c());
                c14734ejM85877a.m85548d(this.f61643b.f62894b);
                c14734ejM85877a.f61742b = 1;
                try {
                    c14734ejM85877a.m85530a((byte) Integer.parseInt(this.f61643b.f62900g));
                } catch (NumberFormatException unused2) {
                }
                C14761h.m85875f().m85880i(c14734ejM85877a);
            }
        }
    }

    @Override // com.xiaomi.push.service.C14842am.b.a
    /* JADX INFO: renamed from: a */
    public void mo85461a(C14842am.c cVar, C14842am.c cVar2, int i) {
        if (!this.f61647f && cVar == C14842am.c.binding) {
            this.f61645d = cVar2;
            this.f61646e = i;
            this.f61647f = true;
        }
        this.f61642a.m86345a(new a(4));
    }

    /* JADX INFO: renamed from: com.xiaomi.push.b$a */
    public class a extends XMPushService.AbstractC14818j {
        public a(int i) {
            super(i);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            C14728b.this.m85459d();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "Handling bind stats";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85460a() {
        this.f61643b.m86532a(this);
        this.f61644c = this.f61642a.m86341a();
    }
}

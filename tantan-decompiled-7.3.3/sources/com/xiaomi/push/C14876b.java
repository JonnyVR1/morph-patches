package com.xiaomi.push;

import com.xiaomi.push.service.C14990am;
import com.xiaomi.push.service.XMPushService;
import p153l.u1r0;

/* JADX INFO: renamed from: com.xiaomi.push.b */
/* JADX INFO: loaded from: classes2.dex */
class C14876b implements C14990am.b.a {

    /* JADX INFO: renamed from: a */
    private XMPushService f62489a;

    /* JADX INFO: renamed from: b */
    private C14990am.b f62490b;

    /* JADX INFO: renamed from: c */
    private u1r0 f62491c;

    /* JADX INFO: renamed from: e */
    private int f62493e;

    /* JADX INFO: renamed from: f */
    private boolean f62494f = false;

    /* JADX INFO: renamed from: d */
    private C14990am.c f62492d = C14990am.c.binding;

    /* JADX INFO: renamed from: com.xiaomi.push.b$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f62496a;

        static {
            int[] iArr = new int[C14990am.c.values().length];
            f62496a = iArr;
            try {
                iArr[C14990am.c.unbind.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62496a[C14990am.c.binding.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62496a[C14990am.c.binded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C14876b(XMPushService xMPushService, C14990am.b bVar) {
        this.f62489a = xMPushService;
        this.f62490b = bVar;
    }

    /* JADX INFO: renamed from: c */
    private void m86629c() {
        this.f62490b.m87705b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m86630d() {
        m86629c();
        if (this.f62494f && this.f62493e != 11) {
            C14882ej c14882ejM87048a = C14909h.m87046f().m87048a();
            int i = b.f62496a[this.f62492d.ordinal()];
            if (i == 1) {
                int i2 = this.f62493e;
                if (i2 == 17) {
                    c14882ejM87048a.f62586a = EnumC14881ei.BIND_TCP_READ_TIMEOUT.m86699a();
                } else if (i2 == 21) {
                    c14882ejM87048a.f62586a = EnumC14881ei.BIND_TIMEOUT.m86699a();
                } else {
                    try {
                        C14879e.a aVarM86695d = C14879e.m86695d(C14909h.m87045e().m86739a());
                        c14882ejM87048a.f62586a = aVarM86695d.f62501a.m86699a();
                        c14882ejM87048a.m86715c(aVarM86695d.f62502b);
                    } catch (NullPointerException unused) {
                        c14882ejM87048a = null;
                    }
                }
            } else if (i == 3) {
                c14882ejM87048a.f62586a = EnumC14881ei.BIND_SUCCESS.m86699a();
            }
            if (c14882ejM87048a != null) {
                c14882ejM87048a.m86710b(this.f62491c.mo102237c());
                c14882ejM87048a.m86719d(this.f62490b.f63741b);
                c14882ejM87048a.f62589b = 1;
                try {
                    c14882ejM87048a.m86701a((byte) Integer.parseInt(this.f62490b.f63747g));
                } catch (NumberFormatException unused2) {
                }
                C14909h.m87046f().m87051i(c14882ejM87048a);
            }
        }
    }

    @Override // com.xiaomi.push.service.C14990am.b.a
    /* JADX INFO: renamed from: a */
    public void mo86632a(C14990am.c cVar, C14990am.c cVar2, int i) {
        if (!this.f62494f && cVar == C14990am.c.binding) {
            this.f62492d = cVar2;
            this.f62493e = i;
            this.f62494f = true;
        }
        this.f62489a.m87516a(new a(4));
    }

    /* JADX INFO: renamed from: com.xiaomi.push.b$a */
    public class a extends XMPushService.AbstractC14966j {
        public a(int i) {
            super(i);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            C14876b.this.m86630d();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "Handling bind stats";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86631a() {
        this.f62490b.m87703a(this);
        this.f62491c = this.f62489a.m87512a();
    }
}

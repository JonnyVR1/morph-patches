package p149l;

import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class st5 {

    /* JADX INFO: renamed from: a */
    public final C20026c f166294a = new C20026c();

    /* JADX INFO: renamed from: b */
    public RunnableC20025b f166295b;

    /* JADX INFO: renamed from: c */
    public Runnable f166296c;

    /* JADX INFO: renamed from: l.st5$a */
    public interface InterfaceC20024a {
        /* JADX INFO: renamed from: a */
        boolean mo118008a();

        /* JADX INFO: renamed from: b */
        void mo118009b(LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg);
    }

    /* JADX INFO: renamed from: l.st5$b */
    public static class RunnableC20025b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C20026c f166297a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC20024a f166298b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f166299c = true;

        public RunnableC20025b(C20026c c20026c, InterfaceC20024a interfaceC20024a) {
            this.f166297a = c20026c;
            this.f166298b = interfaceC20024a;
        }

        /* JADX INFO: renamed from: b */
        public final void m185859b() {
            if (!this.f166297a.m185865d()) {
                e51.m114742G(new Runnable() { // from class: l.tt5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f171995a.m185860c();
                    }
                });
                try {
                    Thread.sleep(100L);
                    return;
                } catch (InterruptedException e) {
                    CrashHelper.m81296c(e);
                    return;
                }
            }
            try {
                synchronized (this.f166297a) {
                    try {
                        this.f166297a.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e2) {
                CrashHelper.m81296c(e2);
            }
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m185860c() {
            LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsgM185864c;
            InterfaceC20024a interfaceC20024a;
            InterfaceC20024a interfaceC20024a2 = this.f166298b;
            if (interfaceC20024a2 == null || !interfaceC20024a2.mo118008a() || !this.f166299c || (confessionGiftReceiveMsgM185864c = this.f166297a.m185864c()) == null || (interfaceC20024a = this.f166298b) == null) {
                return;
            }
            interfaceC20024a.mo118009b(confessionGiftReceiveMsgM185864c);
        }

        /* JADX INFO: renamed from: d */
        public void m185861d() {
            this.f166299c = false;
            synchronized (this.f166297a) {
                this.f166297a.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f166299c) {
                m185859b();
            }
        }
    }

    /* JADX INFO: renamed from: l.st5$c */
    public static class C20026c {

        /* JADX INFO: renamed from: a */
        public final ArrayList<LongLinkConfession.ConfessionGiftReceiveMsg> f166300a;

        public C20026c() {
            this.f166300a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        public void m185862a(LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
            this.f166300a.add(confessionGiftReceiveMsg);
        }

        /* JADX INFO: renamed from: b */
        public void m185863b() {
            this.f166300a.clear();
        }

        /* JADX INFO: renamed from: c */
        public LongLinkConfession.ConfessionGiftReceiveMsg m185864c() {
            if (this.f166300a.isEmpty()) {
                return null;
            }
            return this.f166300a.remove(0);
        }

        /* JADX INFO: renamed from: d */
        public boolean m185865d() {
            return this.f166300a.isEmpty();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m185852b(LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
        this.f166294a.m185862a(confessionGiftReceiveMsg);
        synchronized (this.f166294a) {
            this.f166294a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m185853c() {
        RunnableC20025b runnableC20025b = this.f166295b;
        if (runnableC20025b != null) {
            gbu.f101912b.m125328a(runnableC20025b);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m185854d() {
        e51.m114745J(this.f166296c);
        RunnableC20025b runnableC20025b = this.f166295b;
        if (runnableC20025b != null) {
            runnableC20025b.m185861d();
            this.f166295b = null;
        }
        this.f166294a.m185863b();
    }

    /* JADX INFO: renamed from: e */
    public void m185855e() {
        synchronized (this.f166294a) {
            this.f166294a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m185856f(InterfaceC20024a interfaceC20024a) {
        m185857g();
        this.f166295b = new RunnableC20025b(this.f166294a, interfaceC20024a);
        Runnable runnable = new Runnable() { // from class: l.rt5
            @Override // java.lang.Runnable
            public final void run() {
                this.f160944a.m185853c();
            }
        };
        this.f166296c = runnable;
        e51.m114743H(ypv.f199497e, runnable, 1000L);
    }

    /* JADX INFO: renamed from: g */
    public void m185857g() {
        RunnableC20025b runnableC20025b = this.f166295b;
        if (runnableC20025b != null) {
            runnableC20025b.m185861d();
        }
    }
}

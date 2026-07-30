package p153l;

import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class wu5 {

    /* JADX INFO: renamed from: a */
    public final C21182c f190832a = new C21182c();

    /* JADX INFO: renamed from: b */
    public RunnableC21181b f190833b;

    /* JADX INFO: renamed from: c */
    public Runnable f190834c;

    /* JADX INFO: renamed from: l.wu5$a */
    public interface InterfaceC21180a {
        /* JADX INFO: renamed from: a */
        boolean mo142175a();

        /* JADX INFO: renamed from: b */
        void mo142176b(LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg);
    }

    /* JADX INFO: renamed from: l.wu5$b */
    public static class RunnableC21181b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C21182c f190835a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC21180a f190836b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f190837c = true;

        public RunnableC21181b(C21182c c21182c, InterfaceC21180a interfaceC21180a) {
            this.f190835a = c21182c;
            this.f190836b = interfaceC21180a;
        }

        /* JADX INFO: renamed from: b */
        public final void m207928b() {
            if (!this.f190835a.m207934d()) {
                l51.m152887G(new Runnable() { // from class: l.xu5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196262a.m207929c();
                    }
                });
                try {
                    Thread.sleep(100L);
                    return;
                } catch (InterruptedException e) {
                    CrashHelper.m82479c(e);
                    return;
                }
            }
            try {
                synchronized (this.f190835a) {
                    try {
                        this.f190835a.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e2) {
                CrashHelper.m82479c(e2);
            }
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m207929c() {
            LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsgM207933c;
            InterfaceC21180a interfaceC21180a;
            InterfaceC21180a interfaceC21180a2 = this.f190836b;
            if (interfaceC21180a2 == null || !interfaceC21180a2.mo142175a() || !this.f190837c || (confessionGiftReceiveMsgM207933c = this.f190835a.m207933c()) == null || (interfaceC21180a = this.f190836b) == null) {
                return;
            }
            interfaceC21180a.mo142176b(confessionGiftReceiveMsgM207933c);
        }

        /* JADX INFO: renamed from: d */
        public void m207930d() {
            this.f190837c = false;
            synchronized (this.f190835a) {
                this.f190835a.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f190837c) {
                m207928b();
            }
        }
    }

    /* JADX INFO: renamed from: l.wu5$c */
    public static class C21182c {

        /* JADX INFO: renamed from: a */
        public final ArrayList<LongLinkConfession.ConfessionGiftReceiveMsg> f190838a;

        public C21182c() {
            this.f190838a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        public void m207931a(LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
            this.f190838a.add(confessionGiftReceiveMsg);
        }

        /* JADX INFO: renamed from: b */
        public void m207932b() {
            this.f190838a.clear();
        }

        /* JADX INFO: renamed from: c */
        public LongLinkConfession.ConfessionGiftReceiveMsg m207933c() {
            if (this.f190838a.isEmpty()) {
                return null;
            }
            return this.f190838a.remove(0);
        }

        /* JADX INFO: renamed from: d */
        public boolean m207934d() {
            return this.f190838a.isEmpty();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m207921b(LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
        this.f190832a.m207931a(confessionGiftReceiveMsg);
        synchronized (this.f190832a) {
            this.f190832a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m207922c() {
        RunnableC21181b runnableC21181b = this.f190833b;
        if (runnableC21181b != null) {
            hdu.f109038b.m134613a(runnableC21181b);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m207923d() {
        l51.m152890J(this.f190834c);
        RunnableC21181b runnableC21181b = this.f190833b;
        if (runnableC21181b != null) {
            runnableC21181b.m207930d();
            this.f190833b = null;
        }
        this.f190832a.m207932b();
    }

    /* JADX INFO: renamed from: e */
    public void m207924e() {
        synchronized (this.f190832a) {
            this.f190832a.notifyAll();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m207925f(InterfaceC21180a interfaceC21180a) {
        m207926g();
        this.f190833b = new RunnableC21181b(this.f190832a, interfaceC21180a);
        Runnable runnable = new Runnable() { // from class: l.vu5
            @Override // java.lang.Runnable
            public final void run() {
                this.f185763a.m207922c();
            }
        };
        this.f190834c = runnable;
        l51.m152888H(zrv.f205803e, runnable, 1000L);
    }

    /* JADX INFO: renamed from: g */
    public void m207926g() {
        RunnableC21181b runnableC21181b = this.f190833b;
        if (runnableC21181b != null) {
            runnableC21181b.m207930d();
        }
    }
}

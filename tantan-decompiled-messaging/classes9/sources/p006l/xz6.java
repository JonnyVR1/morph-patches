package p006l;

import android.os.Build;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.Counter;
import l.bne0;
import l.bs5;
import l.c4g0;
import l.d30;
import l.e30;
import l.h4g0;
import l.jo0;
import l.mkd0;
import l.roj0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xz6 implements oc2.InterfaceC1082a {

    /* JADX INFO: renamed from: k */
    public static final Object f27802k = new Object();

    /* JADX INFO: renamed from: l */
    public static xz6 f27803l;

    /* JADX INFO: renamed from: a */
    public int f27804a;

    /* JADX INFO: renamed from: b */
    public boolean f27805b = false;

    /* JADX INFO: renamed from: c */
    public boolean f27806c = false;

    /* JADX INFO: renamed from: d */
    public int f27807d = 0;

    /* JADX INFO: renamed from: e */
    public int f27808e = 0;

    /* JADX INFO: renamed from: f */
    public int f27809f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f27810g = false;

    /* JADX INFO: renamed from: h */
    public boolean f27811h = false;

    /* JADX INFO: renamed from: i */
    public a<roj0> f27812i;

    /* JADX INFO: renamed from: j */
    public c4g0 f27813j;

    public xz6() {
        a<roj0> aVarB = a.b();
        this.f27812i = aVarB;
        this.f27813j = null;
        aVarB.subscribe(mkd0.H(new e30() { // from class: l.qz6
            public final void call(Object obj) {
                this.f20169a.m27692k((roj0) obj);
            }
        }, Act.EMPTY_ON_ERROR));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27682a(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static xz6 m27689h() {
        if (f27803l == null) {
            synchronized (f27802k) {
                try {
                    if (f27803l == null) {
                        f27803l = new xz6();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27803l;
    }

    @Override // p006l.oc2.InterfaceC1082a
    public int getCount() {
        return this.f27804a;
    }

    /* JADX INFO: renamed from: i */
    public void m27690i(boolean z) {
        this.f27805b = z;
        this.f27812i.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: j */
    public void m27691j() {
        oc2.m20494b().m20496d(this);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m27692k(roj0 roj0Var) {
        if (CoreModule.m1850H().signedIn_() && !this.f27810g) {
            this.f27811h = true;
            return;
        }
        int i = this.f27808e;
        if (!"vivo".equalsIgnoreCase(Build.BRAND) && !bne0.m() && !CoreModule.m1851K().pe()) {
            i += this.f27809f;
        }
        this.f27804a = i + ((Integer) CoreModule.m1855Q().r9().d().e()).intValue();
        oc2.m20494b().m20497e();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m27693l(ConversationCounter conversationCounter) {
        this.f27808e = ura.m25555e().m25559d().m5614E7(conversationCounter.conversations) + conversationCounter.messages.unread;
        this.f27810g = true;
        this.f27812i.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m27694m(Counter counter) {
        this.f27809f = counter.activities.unread;
        this.f27812i.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m27695n(Throwable th) {
        if (this.f27811h) {
            this.f27811h = false;
            this.f27810g = true;
            this.f27812i.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m27696o() {
        this.f27808e = 0;
        this.f27810g = false;
        this.f27812i.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m27697p(Integer num) {
        this.f27812i.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: q */
    public c4g0 m27698q() {
        c4g0 c4g0Var = this.f27813j;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f27813j.unsubscribe();
        }
        bs5 bs5VarC = h4g0.c(new c4g0[]{CoreModule.f1534c.f3631f0.m4703Qe().subscribe(mkd0.H(new e30() { // from class: l.rz6
            public final void call(Object obj) {
                this.f20924a.m27693l((ConversationCounter) obj);
            }
        }, Act.EMPTY_ON_ERROR)), CoreModule.f1534c.m3413n3().subscribe(mkd0.H(new e30() { // from class: l.sz6
            public final void call(Object obj) {
                this.f21772a.m27694m((Counter) obj);
            }
        }, new e30() { // from class: l.tz6
            public final void call(Object obj) {
                this.f22354a.m27695n((Throwable) obj);
            }
        })), h4g0.a(new d30() { // from class: l.uz6
            public final void call() {
                this.f23821a.m27696o();
            }
        }), CoreModule.m1855Q().r9().d().onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.vz6
            public final void call(Object obj) {
                this.f24547a.m27697p((Integer) obj);
            }
        }, new e30() { // from class: l.wz6
            public final void call(Object obj) {
                xz6.m27682a((Throwable) obj);
            }
        }))});
        this.f27813j = bs5VarC;
        return bs5VarC;
    }
}

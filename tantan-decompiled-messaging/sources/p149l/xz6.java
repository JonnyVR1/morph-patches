package p149l;

import android.os.Build;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.Counter;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class xz6 implements oc2.InterfaceC18891a {

    /* JADX INFO: renamed from: k */
    public static final Object f195154k = new Object();

    /* JADX INFO: renamed from: l */
    public static xz6 f195155l;

    /* JADX INFO: renamed from: a */
    public int f195156a;

    /* JADX INFO: renamed from: b */
    public boolean f195157b = false;

    /* JADX INFO: renamed from: c */
    public boolean f195158c = false;

    /* JADX INFO: renamed from: d */
    public int f195159d = 0;

    /* JADX INFO: renamed from: e */
    public int f195160e = 0;

    /* JADX INFO: renamed from: f */
    public int f195161f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f195162g = false;

    /* JADX INFO: renamed from: h */
    public boolean f195163h = false;

    /* JADX INFO: renamed from: i */
    public C22392a<roj0> f195164i;

    /* JADX INFO: renamed from: j */
    public c4g0 f195165j;

    public xz6() {
        C22392a<roj0> c22392aM221512b = C22392a.m221512b();
        this.f195164i = c22392aM221512b;
        this.f195165j = null;
        c22392aM221512b.subscribe(mkd0.m154956H(new e30() { // from class: l.qz6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156995a.m211892k((roj0) obj);
            }
        }, Act.EMPTY_ON_ERROR));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m211882a(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static xz6 m211889h() {
        if (f195155l == null) {
            synchronized (f195154k) {
                try {
                    if (f195155l == null) {
                        f195155l = new xz6();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f195155l;
    }

    @Override // p149l.oc2.InterfaceC18891a
    public int getCount() {
        return this.f195156a;
    }

    /* JADX INFO: renamed from: i */
    public void m211890i(boolean z) {
        this.f195157b = z;
        this.f195164i.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: j */
    public void m211891j() {
        oc2.m163472b().m163474d(this);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m211892k(roj0 roj0Var) {
        if (CoreModule.m29931H().signedIn_() && !this.f195162g) {
            this.f195163h = true;
            return;
        }
        int i = this.f195160e;
        if (!HardwareEarMonitorUtils.MANUFACTURER_VIVO.equalsIgnoreCase(Build.BRAND) && !bne0.m102784m() && !CoreModule.m29932K().mo30805pe()) {
            i += this.f195161f;
        }
        this.f195156a = i + CoreModule.m29936Q().mo67280r9().mo123878d().m221515e().intValue();
        oc2.m163472b().m163475e();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m211893l(ConversationCounter conversationCounter) {
        this.f195160e = ura.m195053e().m195057d().mo33677E7(conversationCounter.conversations) + conversationCounter.messages.unread;
        this.f195162g = true;
        this.f195164i.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m211894m(Counter counter) {
        this.f195161f = counter.activities.unread;
        this.f195164i.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m211895n(Throwable th) {
        if (this.f195163h) {
            this.f195163h = false;
            this.f195162g = true;
            this.f195164i.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m211896o() {
        this.f195160e = 0;
        this.f195162g = false;
        this.f195164i.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m211897p(Integer num) {
        this.f195164i.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: q */
    public c4g0 m211898q() {
        c4g0 c4g0Var = this.f195165j;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f195165j.unsubscribe();
        }
        bs5 bs5VarM129242c = h4g0.m129242c(CoreModule.f17545c.f19642f0.m32773Qe().subscribe(mkd0.m154956H(new e30() { // from class: l.rz6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161608a.m211893l((ConversationCounter) obj);
            }
        }, Act.EMPTY_ON_ERROR)), CoreModule.f17545c.m31483n3().subscribe(mkd0.m154956H(new e30() { // from class: l.sz6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167018a.m211894m((Counter) obj);
            }
        }, new e30() { // from class: l.tz6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172685a.m211895n((Throwable) obj);
            }
        })), h4g0.m129240a(new d30() { // from class: l.uz6
            @Override // p149l.d30
            public final void call() {
                this.f178959a.m211896o();
            }
        }), CoreModule.m29936Q().mo67280r9().mo123878d().onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.vz6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183584a.m211897p((Integer) obj);
            }
        }, new e30() { // from class: l.wz6
            @Override // p149l.e30
            public final void call(Object obj) {
                xz6.m211882a((Throwable) obj);
            }
        })));
        this.f195165j = bs5VarM129242c;
        return bs5VarM129242c;
    }
}

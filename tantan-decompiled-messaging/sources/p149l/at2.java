package p149l;

import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public abstract class at2 {

    /* JADX INFO: renamed from: b */
    protected HandlerThread f71527b;

    /* JADX INFO: renamed from: c */
    protected zhm f71528c;

    /* JADX INFO: renamed from: d */
    protected rnr f71529d;

    /* JADX INFO: renamed from: a */
    private final String f71526a = getClass().getName();

    /* JADX INFO: renamed from: e */
    private zhm.InterfaceC21699a f71530e = new C15710a();

    /* JADX INFO: renamed from: l.at2$a */
    public class C15710a implements zhm.InterfaceC21699a {
        public C15710a() {
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: a */
        public void mo98715a(Message message) {
            Object obj = message.obj;
            if (obj == null) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Invalid parameter, add target failed ! ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (obj2 == null) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Invalid parameter, add target failed ! ");
            } else {
                at2.this.mo98691c(obj2, iIntValue, zBooleanValue);
            }
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: b */
        public void mo98716b(Message message) {
            at2.this.mo98695g();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: c */
        public void mo98717c(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            at2.this.mo98711w(obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: d */
        public void mo98718d(Message message) {
            at2.this.mo98707s();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: e */
        public void mo98719e(Message message) {
            at2.this.mo98696h();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: f */
        public void mo98720f(Message message) {
            at2.this.mo98699k();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: g */
        public void mo98721g(Message message) {
            at2.this.mo98714z(message.obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: h */
        public void mo98722h(Message message) {
            at2.this.mo98709u();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: i */
        public void mo98723i(Message message) {
            at2.this.mo98704p();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: j */
        public void mo98724j(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            at2.this.m98705q(obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: k */
        public void mo98725k() {
            at2.this.m98706r();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: l */
        public void mo98726l(Message message) {
            at2.this.mo98713y((tif0) message.obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: m */
        public void mo98727m(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Invalid parameter, remove target failed !");
            } else {
                at2.this.mo98703o(obj);
            }
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: n */
        public void mo98728n(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            Object[] objArr = (Object[]) obj;
            at2.this.mo98702n(objArr[0], ((Integer) objArr[1]).intValue());
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: o */
        public void mo98729o(Message message) {
            at2.this.mo98694f();
        }

        @Override // p149l.zhm.InterfaceC21699a
        public void onPause() {
            at2.this.mo98697i();
        }

        @Override // p149l.zhm.InterfaceC21699a
        public void onResume() {
            at2.this.mo98698j();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: p */
        public void mo98730p(Message message) {
            at2.this.mo98690b((us2) message.obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: q */
        public void mo98731q(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            Object[] objArr = (Object[]) obj;
            at2.this.mo98710v(objArr[0], ((Integer) objArr[1]).intValue(), (us2) objArr[2]);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: r */
        public void mo98732r(Message message) {
            at2.this.mo98712x((us2) message.obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: s */
        public void mo98733s() {
            at2.this.m98708t();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: t */
        public void mo98734t() {
            at2.this.mo98692d();
        }

        @Override // p149l.zhm.InterfaceC21699a
        @RequiresApi(api = 18)
        /* JADX INFO: renamed from: u */
        public void mo98735u(Message message) {
            at2.this.mo98701m();
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: v */
        public void mo98736v(Message message) {
            at2.this.mo98700l((Message) message.obj);
        }

        @Override // p149l.zhm.InterfaceC21699a
        /* JADX INFO: renamed from: w */
        public void mo98737w(Message message) {
            at2.this.mo98693e((jdq0.C17755a) message.obj);
        }
    }

    public at2(String str) {
        if (str == null) {
            str = "BaseRenderThread" + System.currentTimeMillis();
        }
        HandlerThread handlerThread = new HandlerThread(str);
        this.f71527b = handlerThread;
        handlerThread.start();
        zhm zhmVar = new zhm(this.f71527b.getLooper());
        this.f71528c = zhmVar;
        zhmVar.m218825b(this.f71530e);
        zhm zhmVar2 = this.f71528c;
        zhmVar2.sendMessage(zhmVar2.obtainMessage(24));
    }

    /* JADX INFO: renamed from: A */
    public void m98667A(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(1, obj));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m98668B() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(16));
    }

    /* JADX INFO: renamed from: C */
    public void m98669C(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(33, obj));
        }
    }

    /* JADX INFO: renamed from: D */
    public void m98670D(Object obj) {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(17));
    }

    /* JADX INFO: renamed from: E */
    public void m98671E() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(28));
    }

    /* JADX INFO: renamed from: F */
    public void m98672F(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(6, obj));
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo98673G() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(7));
    }

    /* JADX INFO: renamed from: H */
    public void m98674H(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(2, obj));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m98675I() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(4));
    }

    /* JADX INFO: renamed from: J */
    public void m98676J() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(29));
    }

    /* JADX INFO: renamed from: K */
    public void m98677K(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(5, obj));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m98678L(Object obj) {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(32, obj));
    }

    /* JADX INFO: renamed from: M */
    public void m98679M() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessageAtFrontOfQueue(zhmVar.obtainMessage(26));
    }

    /* JADX INFO: renamed from: N */
    public void m98680N() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(21));
        zhm zhmVar2 = this.f71528c;
        zhmVar2.sendMessage(zhmVar2.obtainMessage(8));
    }

    /* JADX INFO: renamed from: O */
    public void m98681O() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(27));
    }

    /* JADX INFO: renamed from: P */
    public void mo98682P() {
        zhm zhmVar = this.f71528c;
        zhmVar.sendMessage(zhmVar.obtainMessage(9));
    }

    /* JADX INFO: renamed from: Q */
    public void m98683Q(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessageAtFrontOfQueue(zhmVar.obtainMessage(25, obj));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m98684R(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(18, obj));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m98685S(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(22, obj));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m98686T(Object obj) {
        if (obj != null) {
            zhm zhmVar = this.f71528c;
            zhmVar.sendMessage(zhmVar.obtainMessage(19, obj));
        }
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: U */
    public void m98687U() {
        rnr rnrVar = this.f71529d;
        if (rnrVar != null) {
            rnrVar.mo168076b();
        }
        this.f71527b.quitSafely();
    }

    /* JADX INFO: renamed from: V */
    public void m98688V(rnr rnrVar) {
        this.f71529d = rnrVar;
    }

    /* JADX INFO: renamed from: a */
    public void m98689a() {
        zhm zhmVar = this.f71528c;
        if (zhmVar != null) {
            zhmVar.m218824a();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo98691c(Object obj, int i, boolean z);

    /* JADX INFO: renamed from: f */
    public abstract void mo98694f();

    /* JADX INFO: renamed from: g */
    public abstract void mo98695g();

    /* JADX INFO: renamed from: i */
    public abstract void mo98697i();

    /* JADX INFO: renamed from: j */
    public abstract void mo98698j();

    /* JADX INFO: renamed from: k */
    public abstract void mo98699k();

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: m */
    public void mo98701m() {
        zhm zhmVar = this.f71528c;
        if (zhmVar != null) {
            zhmVar.removeMessages(4);
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo98702n(Object obj, int i);

    /* JADX INFO: renamed from: o */
    public abstract void mo98703o(Object obj);

    /* JADX INFO: renamed from: p */
    public abstract void mo98704p();

    /* JADX INFO: renamed from: q */
    public void m98705q(Object obj) {
        rnr rnrVar = this.f71529d;
        if (rnrVar != null) {
            rnrVar.mo168080f(obj);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m98706r() {
        rnr rnrVar = this.f71529d;
        if (rnrVar != null) {
            rnrVar.mo168075a();
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo98707s();

    /* JADX INFO: renamed from: t */
    public void m98708t() {
        rnr rnrVar = this.f71529d;
        if (rnrVar != null) {
            rnrVar.mo168078d();
        }
    }

    /* JADX INFO: renamed from: u */
    public void mo98709u() {
        zhm zhmVar = this.f71528c;
        if (zhmVar != null) {
            zhmVar.removeMessages(4);
        }
        rnr rnrVar = this.f71529d;
        if (rnrVar != null) {
            rnrVar.mo168077c();
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo98710v(Object obj, int i, us2 us2Var);

    /* JADX INFO: renamed from: z */
    public abstract void mo98714z(Object obj);

    /* JADX INFO: renamed from: d */
    public void mo98692d() {
    }

    /* JADX INFO: renamed from: h */
    public void mo98696h() {
    }

    /* JADX INFO: renamed from: b */
    public void mo98690b(us2 us2Var) {
    }

    /* JADX INFO: renamed from: e */
    public void mo98693e(jdq0.C17755a c17755a) {
    }

    /* JADX INFO: renamed from: l */
    public void mo98700l(Message message) {
    }

    /* JADX INFO: renamed from: w */
    public void mo98711w(Object obj) {
    }

    /* JADX INFO: renamed from: x */
    public void mo98712x(us2 us2Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo98713y(tif0 tif0Var) {
    }
}

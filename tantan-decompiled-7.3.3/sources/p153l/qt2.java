package p153l;

import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qt2 {

    /* JADX INFO: renamed from: b */
    protected HandlerThread f159376b;

    /* JADX INFO: renamed from: c */
    protected ckm f159377c;

    /* JADX INFO: renamed from: d */
    protected spr f159378d;

    /* JADX INFO: renamed from: a */
    private final String f159375a = getClass().getName();

    /* JADX INFO: renamed from: e */
    private ckm.InterfaceC16294a f159379e = new C19651a();

    /* JADX INFO: renamed from: l.qt2$a */
    public class C19651a implements ckm.InterfaceC16294a {
        public C19651a() {
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: a */
        public void mo110352a(Message message) {
            Object obj = message.obj;
            if (obj == null) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Invalid parameter, add target failed ! ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (obj2 == null) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Invalid parameter, add target failed ! ");
            } else {
                qt2.this.mo121193c(obj2, iIntValue, zBooleanValue);
            }
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: b */
        public void mo110353b(Message message) {
            qt2.this.mo121198g();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: c */
        public void mo110354c(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            qt2.this.mo121220w(obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: d */
        public void mo110355d(Message message) {
            qt2.this.mo121214s();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: e */
        public void mo110356e(Message message) {
            qt2.this.mo96762h();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: f */
        public void mo110357f(Message message) {
            qt2.this.mo121203k();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: g */
        public void mo110358g(Message message) {
            qt2.this.mo121224z(message.obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: h */
        public void mo110359h(Message message) {
            qt2.this.mo96767u();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: i */
        public void mo110360i(Message message) {
            qt2.this.mo96766p();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: j */
        public void mo110361j(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            qt2.this.m177865q(obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: k */
        public void mo110362k() {
            qt2.this.m177866r();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: l */
        public void mo110363l(Message message) {
            qt2.this.mo96769y((crf0) message.obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: m */
        public void mo110364m(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Invalid parameter, remove target failed !");
            } else {
                qt2.this.mo121209o(obj);
            }
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: n */
        public void mo110365n(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            Object[] objArr = (Object[]) obj;
            qt2.this.mo121207n(objArr[0], ((Integer) objArr[1]).intValue());
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: o */
        public void mo110366o(Message message) {
            qt2.this.mo96761f();
        }

        @Override // p153l.ckm.InterfaceC16294a
        public void onPause() {
            qt2.this.mo121201i();
        }

        @Override // p153l.ckm.InterfaceC16294a
        public void onResume() {
            qt2.this.mo121202j();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: p */
        public void mo110367p(Message message) {
            qt2.this.mo121191b((kt2) message.obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: q */
        public void mo110368q(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            Object[] objArr = (Object[]) obj;
            qt2.this.mo121218v(objArr[0], ((Integer) objArr[1]).intValue(), (kt2) objArr[2]);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: r */
        public void mo110369r(Message message) {
            qt2.this.mo121222x((kt2) message.obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: s */
        public void mo110370s() {
            qt2.this.m177867t();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: t */
        public void mo110371t() {
            qt2.this.mo121195d();
        }

        @Override // p153l.ckm.InterfaceC16294a
        @RequiresApi(api = 18)
        /* JADX INFO: renamed from: u */
        public void mo110372u(Message message) {
            qt2.this.mo96765m();
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: v */
        public void mo110373v(Message message) {
            qt2.this.mo96764l((Message) message.obj);
        }

        @Override // p153l.ckm.InterfaceC16294a
        /* JADX INFO: renamed from: w */
        public void mo110374w(Message message) {
            qt2.this.mo177864e((omq0.C19167a) message.obj);
        }
    }

    public qt2(String str) {
        if (str == null) {
            str = "BaseRenderThread" + System.currentTimeMillis();
        }
        HandlerThread handlerThread = new HandlerThread(str);
        this.f159376b = handlerThread;
        handlerThread.start();
        ckm ckmVar = new ckm(this.f159376b.getLooper());
        this.f159377c = ckmVar;
        ckmVar.m110351b(this.f159379e);
        ckm ckmVar2 = this.f159377c;
        ckmVar2.sendMessage(ckmVar2.obtainMessage(24));
    }

    /* JADX INFO: renamed from: A */
    public void m177843A(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(1, obj));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m177844B() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(16));
    }

    /* JADX INFO: renamed from: C */
    public void m177845C(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(33, obj));
        }
    }

    /* JADX INFO: renamed from: D */
    public void m177846D(Object obj) {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(17));
    }

    /* JADX INFO: renamed from: E */
    public void m177847E() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(28));
    }

    /* JADX INFO: renamed from: F */
    public void m177848F(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(6, obj));
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo121187G() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(7));
    }

    /* JADX INFO: renamed from: H */
    public void m177849H(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(2, obj));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m177850I() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(4));
    }

    /* JADX INFO: renamed from: J */
    public void m177851J() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(29));
    }

    /* JADX INFO: renamed from: K */
    public void m177852K(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(5, obj));
        }
    }

    /* JADX INFO: renamed from: L */
    public void m177853L(Object obj) {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(32, obj));
    }

    /* JADX INFO: renamed from: M */
    public void m177854M() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessageAtFrontOfQueue(ckmVar.obtainMessage(26));
    }

    /* JADX INFO: renamed from: N */
    public void m177855N() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(21));
        ckm ckmVar2 = this.f159377c;
        ckmVar2.sendMessage(ckmVar2.obtainMessage(8));
    }

    /* JADX INFO: renamed from: O */
    public void m177856O() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(27));
    }

    /* JADX INFO: renamed from: P */
    public void mo121188P() {
        ckm ckmVar = this.f159377c;
        ckmVar.sendMessage(ckmVar.obtainMessage(9));
    }

    /* JADX INFO: renamed from: Q */
    public void m177857Q(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessageAtFrontOfQueue(ckmVar.obtainMessage(25, obj));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m177858R(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(18, obj));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m177859S(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(22, obj));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m177860T(Object obj) {
        if (obj != null) {
            ckm ckmVar = this.f159377c;
            ckmVar.sendMessage(ckmVar.obtainMessage(19, obj));
        }
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: U */
    public void m177861U() {
        spr sprVar = this.f159378d;
        if (sprVar != null) {
            sprVar.mo167012b();
        }
        this.f159376b.quitSafely();
    }

    /* JADX INFO: renamed from: V */
    public void m177862V(spr sprVar) {
        this.f159378d = sprVar;
    }

    /* JADX INFO: renamed from: a */
    public void m177863a() {
        ckm ckmVar = this.f159377c;
        if (ckmVar != null) {
            ckmVar.m110350a();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo121193c(Object obj, int i, boolean z);

    /* JADX INFO: renamed from: f */
    public abstract void mo96761f();

    /* JADX INFO: renamed from: g */
    public abstract void mo121198g();

    /* JADX INFO: renamed from: i */
    public abstract void mo121201i();

    /* JADX INFO: renamed from: j */
    public abstract void mo121202j();

    /* JADX INFO: renamed from: k */
    public abstract void mo121203k();

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: m */
    public void mo96765m() {
        ckm ckmVar = this.f159377c;
        if (ckmVar != null) {
            ckmVar.removeMessages(4);
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo121207n(Object obj, int i);

    /* JADX INFO: renamed from: o */
    public abstract void mo121209o(Object obj);

    /* JADX INFO: renamed from: p */
    public abstract void mo96766p();

    /* JADX INFO: renamed from: q */
    public void m177865q(Object obj) {
        spr sprVar = this.f159378d;
        if (sprVar != null) {
            sprVar.mo167016f(obj);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m177866r() {
        spr sprVar = this.f159378d;
        if (sprVar != null) {
            sprVar.mo167011a();
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo121214s();

    /* JADX INFO: renamed from: t */
    public void m177867t() {
        spr sprVar = this.f159378d;
        if (sprVar != null) {
            sprVar.mo167014d();
        }
    }

    /* JADX INFO: renamed from: u */
    public void mo96767u() {
        ckm ckmVar = this.f159377c;
        if (ckmVar != null) {
            ckmVar.removeMessages(4);
        }
        spr sprVar = this.f159378d;
        if (sprVar != null) {
            sprVar.mo167013c();
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo121218v(Object obj, int i, kt2 kt2Var);

    /* JADX INFO: renamed from: z */
    public abstract void mo121224z(Object obj);

    /* JADX INFO: renamed from: d */
    public void mo121195d() {
    }

    /* JADX INFO: renamed from: h */
    public void mo96762h() {
    }

    /* JADX INFO: renamed from: b */
    public void mo121191b(kt2 kt2Var) {
    }

    /* JADX INFO: renamed from: e */
    public void mo177864e(omq0.C19167a c19167a) {
    }

    /* JADX INFO: renamed from: l */
    public void mo96764l(Message message) {
    }

    /* JADX INFO: renamed from: w */
    public void mo121220w(Object obj) {
    }

    /* JADX INFO: renamed from: x */
    public void mo121222x(kt2 kt2Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo96769y(crf0 crf0Var) {
    }
}

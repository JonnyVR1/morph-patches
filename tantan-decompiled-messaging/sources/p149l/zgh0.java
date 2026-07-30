package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zgh0 implements cvk {

    /* JADX INFO: renamed from: b */
    @GuardedBy("messagePool")
    public static final List<C21691b> f203043b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f203044a;

    /* JADX INFO: renamed from: l.zgh0$b */
    public static final class C21691b implements cvk.InterfaceC16249a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Message f203045a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public zgh0 f203046b;

        public C21691b() {
        }

        @Override // p149l.cvk.InterfaceC16249a
        /* JADX INFO: renamed from: a */
        public void mo108877a() {
            ((Message) p11.m167011e(this.f203045a)).sendToTarget();
            m218646b();
        }

        /* JADX INFO: renamed from: b */
        public final void m218646b() {
            this.f203045a = null;
            this.f203046b = null;
            zgh0.m218645o(this);
        }

        /* JADX INFO: renamed from: c */
        public boolean m218647c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) p11.m167011e(this.f203045a));
            m218646b();
            return zSendMessageAtFrontOfQueue;
        }

        /* JADX INFO: renamed from: d */
        public C21691b m218648d(Message message, zgh0 zgh0Var) {
            this.f203045a = message;
            this.f203046b = zgh0Var;
            return this;
        }
    }

    public zgh0(Handler handler) {
        this.f203044a = handler;
    }

    /* JADX INFO: renamed from: n */
    public static C21691b m218644n() {
        C21691b c21691b;
        List<C21691b> list = f203043b;
        synchronized (list) {
            try {
                c21691b = list.isEmpty() ? new C21691b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c21691b;
    }

    /* JADX INFO: renamed from: o */
    public static void m218645o(C21691b c21691b) {
        List<C21691b> list = f203043b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c21691b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: a */
    public boolean mo108865a(Runnable runnable) {
        return this.f203044a.post(runnable);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: b */
    public cvk.InterfaceC16249a mo108866b(int i) {
        return m218644n().m218648d(this.f203044a.obtainMessage(i), this);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: c */
    public boolean mo108867c(int i) {
        return this.f203044a.hasMessages(i);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: d */
    public cvk.InterfaceC16249a mo108868d(int i, @Nullable Object obj) {
        return m218644n().m218648d(this.f203044a.obtainMessage(i, obj), this);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: e */
    public void mo108869e(@Nullable Object obj) {
        this.f203044a.removeCallbacksAndMessages(obj);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: f */
    public cvk.InterfaceC16249a mo108870f(int i, int i2, int i3) {
        return m218644n().m218648d(this.f203044a.obtainMessage(i, i2, i3), this);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: g */
    public cvk.InterfaceC16249a mo108871g(int i, int i2, int i3, @Nullable Object obj) {
        return m218644n().m218648d(this.f203044a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: h */
    public Looper mo108872h() {
        return this.f203044a.getLooper();
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: i */
    public boolean mo108873i(cvk.InterfaceC16249a interfaceC16249a) {
        return ((C21691b) interfaceC16249a).m218647c(this.f203044a);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: j */
    public boolean mo108874j(int i) {
        return this.f203044a.sendEmptyMessage(i);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: k */
    public boolean mo108875k(int i, long j) {
        return this.f203044a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p149l.cvk
    /* JADX INFO: renamed from: l */
    public void mo108876l(int i) {
        this.f203044a.removeMessages(i);
    }
}

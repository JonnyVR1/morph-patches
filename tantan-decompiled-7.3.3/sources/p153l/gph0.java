package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gph0 implements sxk {

    /* JADX INFO: renamed from: b */
    @GuardedBy("messagePool")
    public static final List<C17272b> f105463b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f105464a;

    /* JADX INFO: renamed from: l.gph0$b */
    public static final class C17272b implements sxk.InterfaceC20180a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Message f105465a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public gph0 f105466b;

        public C17272b() {
        }

        @Override // p153l.sxk.InterfaceC20180a
        /* JADX INFO: renamed from: a */
        public void mo131275a() {
            ((Message) w11.m204369e(this.f105465a)).sendToTarget();
            m131276b();
        }

        /* JADX INFO: renamed from: b */
        public final void m131276b() {
            this.f105465a = null;
            this.f105466b = null;
            gph0.m131262o(this);
        }

        /* JADX INFO: renamed from: c */
        public boolean m131277c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) w11.m204369e(this.f105465a));
            m131276b();
            return zSendMessageAtFrontOfQueue;
        }

        /* JADX INFO: renamed from: d */
        public C17272b m131278d(Message message, gph0 gph0Var) {
            this.f105465a = message;
            this.f105466b = gph0Var;
            return this;
        }
    }

    public gph0(Handler handler) {
        this.f105464a = handler;
    }

    /* JADX INFO: renamed from: n */
    public static C17272b m131261n() {
        C17272b c17272b;
        List<C17272b> list = f105463b;
        synchronized (list) {
            try {
                c17272b = list.isEmpty() ? new C17272b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17272b;
    }

    /* JADX INFO: renamed from: o */
    public static void m131262o(C17272b c17272b) {
        List<C17272b> list = f105463b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c17272b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: a */
    public sxk.InterfaceC20180a mo131263a(int i) {
        return m131261n().m131278d(this.f105464a.obtainMessage(i), this);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: b */
    public boolean mo131264b(int i) {
        return this.f105464a.hasMessages(i);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: c */
    public sxk.InterfaceC20180a mo131265c(int i, @Nullable Object obj) {
        return m131261n().m131278d(this.f105464a.obtainMessage(i, obj), this);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: d */
    public void mo131266d(@Nullable Object obj) {
        this.f105464a.removeCallbacksAndMessages(obj);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: e */
    public sxk.InterfaceC20180a mo131267e(int i, int i2, int i3) {
        return m131261n().m131278d(this.f105464a.obtainMessage(i, i2, i3), this);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: f */
    public sxk.InterfaceC20180a mo131268f(int i, int i2, int i3, @Nullable Object obj) {
        return m131261n().m131278d(this.f105464a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: g */
    public Looper mo131269g() {
        return this.f105464a.getLooper();
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: h */
    public boolean mo131270h(sxk.InterfaceC20180a interfaceC20180a) {
        return ((C17272b) interfaceC20180a).m131277c(this.f105464a);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: i */
    public boolean mo131271i(Runnable runnable) {
        return this.f105464a.post(runnable);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: j */
    public boolean mo131272j(int i) {
        return this.f105464a.sendEmptyMessage(i);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: k */
    public boolean mo131273k(int i, long j) {
        return this.f105464a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p153l.sxk
    /* JADX INFO: renamed from: l */
    public void mo131274l(int i) {
        this.f105464a.removeMessages(i);
    }
}

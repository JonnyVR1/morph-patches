package com.tantanapp.beatles.block;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import p149l.gel;
import p149l.o33;
import p149l.q33;
import p149l.sy0;
import p149l.vsf0;
import p149l.xei0;
import p149l.yei0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BlockBaseStrategy implements sy0.InterfaceC20069a {

    /* JADX INFO: renamed from: v */
    public static int f55849v = 300;

    /* JADX INFO: renamed from: w */
    public static int f55850w = 1000;

    /* JADX INFO: renamed from: a */
    public HandlerThread f55851a;

    /* JADX INFO: renamed from: b */
    public Handler f55852b;

    /* JADX INFO: renamed from: c */
    public C13547c f55853c;

    /* JADX INFO: renamed from: d */
    public o33 f55854d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f55855e;

    /* JADX INFO: renamed from: g */
    public boolean f55857g;

    /* JADX INFO: renamed from: h */
    public long f55858h;

    /* JADX INFO: renamed from: i */
    public long f55859i;

    /* JADX INFO: renamed from: j */
    public long f55860j;

    /* JADX INFO: renamed from: k */
    public long f55861k;

    /* JADX INFO: renamed from: l */
    public long f55862l;

    /* JADX INFO: renamed from: n */
    public boolean f55864n;

    /* JADX INFO: renamed from: p */
    public MessageHelper f55866p;

    /* JADX INFO: renamed from: u */
    public boolean f55871u;

    /* JADX INFO: renamed from: m */
    public boolean f55863m = false;

    /* JADX INFO: renamed from: o */
    public C13544c f55865o = new C13544c();

    /* JADX INFO: renamed from: q */
    public LimitedQueue<String> f55867q = new LimitedQueue<>(10);

    /* JADX INFO: renamed from: r */
    public LimitedQueue<String> f55868r = new LimitedQueue<>(10);

    /* JADX INFO: renamed from: s */
    public int f55869s = f55849v;

    /* JADX INFO: renamed from: t */
    public int f55870t = f55850w;

    /* JADX INFO: renamed from: f */
    public yei0 f55856f = xei0.m208579a();

    public enum BlockLevel {
        HIGH(1),
        LOW(0),
        ORIGIN(-1);

        int index;

        BlockLevel(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$a */
    public class HandlerC13542a extends Handler {
        public HandlerC13542a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                BlockBaseStrategy.this.mo81063l().m81075b();
                return;
            }
            BlockBaseStrategy blockBaseStrategy = BlockBaseStrategy.this;
            if (i == 0) {
                blockBaseStrategy.mo81063l().mo81074a();
            } else {
                blockBaseStrategy.mo81066o(message);
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$b */
    public abstract class AbstractC13543b {

        /* JADX INFO: renamed from: a */
        @SuppressLint({"SimpleDateFormat"})
        public SimpleDateFormat f55873a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSZ");

        /* JADX INFO: renamed from: b */
        public LinkedList<C13544c> f55874b = new LinkedList<>();

        /* JADX INFO: renamed from: c */
        public LinkedList<C13544c> f55875c = new LinkedList<>();

        /* JADX INFO: renamed from: d */
        public LinkedList<C13544c> f55876d = new LinkedList<>();

        /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MonitorEvent f55878a;

            public a(MonitorEvent monitorEvent) {
                this.f55878a = monitorEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                BlockBaseStrategy.this.m81067p(this.f55878a);
            }
        }

        /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C13544c f55880a;

            public b(C13544c c13544c) {
                this.f55880a = c13544c;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13544c c13544c = this.f55880a;
                BlockBaseStrategy.this.m81067p(AbstractC13543b.this.m81082i(this.f55880a.f55885d, new q33(c13544c.f55884c, vsf0.m199866a(c13544c.f55885d), BlockLevel.HIGH.name(), BlockBaseStrategy.this.f55854d.m162364l(), this.f55880a.f55887f)));
            }
        }

        public AbstractC13543b() {
        }

        /* JADX INFO: renamed from: a */
        public void mo81074a() {
            Iterator<C13544c> it = this.f55874b.iterator();
            while (it.hasNext()) {
                C13544c next = it.next();
                if (!BlockBaseStrategy.this.f55867q.contains(next.f55882a + "") && BlockBaseStrategy.this.f55859i != next.f55882a) {
                    it.remove();
                }
            }
            if (m81083j()) {
                q33 q33Var = new q33(m81079f(), m81080g(), BlockLevel.LOW.name(), BlockBaseStrategy.this.f55854d.m162365m(), m81081h());
                q33Var.m116070a(BlockBaseStrategy.this.f55853c.getEventType());
                BlockBaseStrategy.this.f55856f.m214349a(new a(m81082i(m81078e(), q33Var)));
                this.f55874b.clear();
                if (BlockBaseStrategy.this.f55853c.m81115n()) {
                    return;
                }
                BlockBaseStrategy.this.mo81073v();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m81075b() {
            while (this.f55876d.size() > 0) {
                C13544c c13544cPop = this.f55876d.pop();
                if (BlockBaseStrategy.this.f55868r.contains(c13544cPop.f55882a + "") || BlockBaseStrategy.this.f55859i == c13544cPop.f55882a) {
                    BlockBaseStrategy.this.f55856f.m214349a(new b(c13544cPop));
                }
            }
            if (BlockBaseStrategy.this.f55853c.m81115n()) {
                return;
            }
            BlockBaseStrategy.this.mo81073v();
        }

        /* JADX INFO: renamed from: c */
        public void m81076c() {
            this.f55874b.clear();
            this.f55875c.clear();
        }

        /* JADX INFO: renamed from: d */
        public String m81077d(long j) {
            return this.f55873a.format(new Date(j));
        }

        /* JADX INFO: renamed from: e */
        public StackTraceElement[] m81078e() {
            if (this.f55874b.size() <= 0) {
                return null;
            }
            return this.f55874b.get(0).f55885d;
        }

        /* JADX INFO: renamed from: f */
        public String m81079f() {
            int size = this.f55874b.size();
            return size == 0 ? "" : this.f55874b.get(size - 1).f55884c;
        }

        /* JADX INFO: renamed from: g */
        public String m81080g() {
            int size = this.f55874b.size();
            if (size <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = size - 1; i >= 0; i--) {
                C13544c c13544c = this.f55874b.get(i);
                sb.append("startTime:");
                sb.append(m81077d(c13544c.f55882a));
                sb.append(",endTime:");
                sb.append(m81077d(c13544c.f55883b));
                sb.append(SignParameters.NEW_LINE);
                sb.append(vsf0.m199866a(c13544c.f55885d));
                sb.append("\n\n");
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: h */
        public String m81081h() {
            int size = this.f55874b.size();
            return size == 0 ? "UNKNOWN" : this.f55874b.get(size - 1).f55887f;
        }

        /* JADX INFO: renamed from: i */
        public MonitorEvent m81082i(StackTraceElement[] stackTraceElementArr, q33 q33Var) {
            BlockException blockException = new BlockException("block may happend");
            blockException.setStackTrace(stackTraceElementArr);
            MonitorEvent monitorEvent = new MonitorEvent(BlockBaseStrategy.this.f55853c.getEventType(), BlockBaseStrategy.this.f55853c.mo81107a(), blockException);
            monitorEvent.setCrashThread(Looper.getMainLooper().getThread());
            String strM172735c = q33Var.m172735c();
            if (!TextUtils.isEmpty(strM172735c)) {
                monitorEvent.setExtra("meminfo", strM172735c);
            }
            if (!TextUtils.isEmpty(q33Var.m172736d())) {
                monitorEvent.setExtra("stacktrace", q33Var.m172736d());
            }
            monitorEvent.setTag("blockType", q33Var.m172737e());
            monitorEvent.setTag("blockLevel", q33Var.m172734b());
            if (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) * 100.0f) / Runtime.getRuntime().maxMemory() >= 95.0f) {
                monitorEvent.setTag("isHighMemory", "true");
                return monitorEvent;
            }
            monitorEvent.setTag("isHighMemory", "false");
            return monitorEvent;
        }

        /* JADX INFO: renamed from: j */
        public boolean m81083j() {
            return this.f55874b.size() == BlockBaseStrategy.this.f55854d.m162367o();
        }

        /* JADX INFO: renamed from: k */
        public C13544c m81084k(C13544c c13544c) {
            C13544c c13544cPop = !this.f55875c.isEmpty() ? this.f55875c.pop() : BlockBaseStrategy.this.new C13544c();
            c13544cPop.f55882a = c13544c.f55882a;
            c13544cPop.f55883b = c13544c.f55883b;
            c13544cPop.f55886e = c13544c.f55886e;
            c13544cPop.m81087c(c13544c.f55885d);
            c13544cPop.m81086b(c13544c.f55884c);
            c13544cPop.m81088d(c13544c.f55887f);
            return c13544cPop;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$c */
    public class C13544c {

        /* JADX INFO: renamed from: a */
        public volatile long f55882a;

        /* JADX INFO: renamed from: b */
        public long f55883b;

        /* JADX INFO: renamed from: c */
        public String f55884c;

        /* JADX INFO: renamed from: d */
        public StackTraceElement[] f55885d;

        /* JADX INFO: renamed from: e */
        public BlockLevel f55886e = BlockLevel.ORIGIN;

        /* JADX INFO: renamed from: f */
        public String f55887f;

        public C13544c() {
        }

        /* JADX INFO: renamed from: a */
        public void m81085a() {
            this.f55882a = 0L;
            this.f55884c = null;
            this.f55886e = BlockLevel.ORIGIN;
            this.f55887f = "UNKNOWN";
            this.f55885d = null;
        }

        /* JADX INFO: renamed from: b */
        public void m81086b(String str) {
            this.f55884c = str;
        }

        /* JADX INFO: renamed from: c */
        public void m81087c(StackTraceElement[] stackTraceElementArr) {
            this.f55885d = stackTraceElementArr;
        }

        /* JADX INFO: renamed from: d */
        public void m81088d(String str) {
            this.f55887f = str;
        }

        /* JADX INFO: renamed from: e */
        public void m81089e() {
            this.f55882a = BlockBaseStrategy.this.f55859i;
        }

        /* JADX INFO: renamed from: f */
        public void m81090f() {
            this.f55882a = -1L;
        }

        public String toString() {
            return "startTime:" + this.f55882a + " endTime:" + this.f55883b + " scene:" + this.f55884c + "stacktrace:" + vsf0.m199866a(this.f55885d) + "level:" + this.f55886e;
        }
    }

    public BlockBaseStrategy(C13547c c13547c, o33 o33Var) {
        this.f55853c = c13547c;
        this.f55854d = o33Var;
        this.f55866p = new MessageHelper(o33Var.m162365m());
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: a */
    public void mo81052a(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: b */
    public void mo81053b(boolean z) {
        if (z) {
            this.f55857g = true;
        } else {
            this.f55858h = SystemClock.elapsedRealtime();
        }
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: c */
    public void mo81054c(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: d */
    public void mo81055d(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    public boolean m81056e() {
        if ("default".equals(sy0.m186556c().m186561e())) {
            return false;
        }
        if (sy0.m186556c().m186562g()) {
            this.f55857g = true;
        } else if (!this.f55857g || SystemClock.elapsedRealtime() - this.f55858h >= this.f55854d.m162363k()) {
            this.f55857g = false;
        }
        return this.f55857g;
    }

    /* JADX INFO: renamed from: f */
    public void m81057f(long j) {
        this.f55852b.sendEmptyMessageDelayed(1, j);
    }

    /* JADX INFO: renamed from: g */
    public void m81058g(long j) {
        this.f55852b.sendEmptyMessageDelayed(0, j);
    }

    /* JADX INFO: renamed from: h */
    public final void m81059h() {
        this.f55864n = false;
        this.f55863m = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m81060i() {
        this.f55864n = true;
        this.f55863m = true;
    }

    /* JADX INFO: renamed from: j */
    public void mo81061j() {
        if (this.f55855e) {
            mo81062k();
        } else {
            this.f55861k = 0L;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo81062k() {
        if (this.f55864n) {
            this.f55865o.m81090f();
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f55861k = jUptimeMillis;
            long j = jUptimeMillis - this.f55859i;
            this.f55862l = j;
            if (j > Math.max(this.f55869s, f55849v) && this.f55862l < Math.max(this.f55870t, f55850w)) {
                this.f55867q.add(this.f55859i + "");
            } else if (this.f55862l >= this.f55870t) {
                this.f55868r.add(this.f55859i + "");
            }
            if (this.f55863m) {
                long j2 = this.f55862l;
                long jM81098h = this.f55866p.m81098h();
                MessageHelper messageHelper = this.f55866p;
                if (j2 >= jM81098h) {
                    messageHelper.m81092b(this.f55859i, this.f55862l, SystemClock.currentThreadTimeMillis() - this.f55860j, gel.m125824e());
                } else {
                    messageHelper.m81092b(this.f55859i, this.f55862l, -1L, null);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public abstract AbstractC13543b mo81063l();

    /* JADX INFO: renamed from: m */
    public Handler m81064m(Looper looper) {
        return new HandlerC13542a(looper);
    }

    /* JADX INFO: renamed from: n */
    public MessageHelper.MessageUnit mo81065n() {
        if (this.f55853c.m81114m()) {
            return this.f55866p.m81097g(this.f55859i);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo81066o(Message message);

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityStarted(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: renamed from: p */
    public void m81067p(MonitorEvent monitorEvent) {
        this.f55853c.m186395j(monitorEvent);
    }

    /* JADX INFO: renamed from: q */
    public void m81068q() {
        if (this.f55851a == null) {
            HandlerThread handlerThread = new HandlerThread("block-check-thread");
            this.f55851a = handlerThread;
            handlerThread.start();
            this.f55852b = m81064m(this.f55851a.getLooper());
        }
        sy0.m186556c().m186563h(this);
        this.f55855e = true;
    }

    /* JADX INFO: renamed from: r */
    public void m81069r(int i, long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        this.f55852b.sendMessageAtTime(messageObtain, j);
    }

    /* JADX INFO: renamed from: s */
    public void mo81070s() {
        if (this.f55871u) {
            m81060i();
            mo81062k();
            this.f55871u = false;
        }
        if (!this.f55855e) {
            m81059h();
        } else {
            if (!m81056e()) {
                m81059h();
                return;
            }
            if (this.f55853c.m81114m()) {
                this.f55863m = true;
            }
            mo81072u(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo81071t() {
        if (!this.f55855e) {
            m81059h();
            return;
        }
        if (this.f55853c.m81114m()) {
            this.f55863m = true;
        }
        this.f55871u = true;
        mo81072u(true);
    }

    /* JADX INFO: renamed from: u */
    public void mo81072u(boolean z) {
        this.f55864n = true;
        this.f55859i = SystemClock.uptimeMillis();
        this.f55865o.m81089e();
        if (this.f55863m) {
            this.f55860j = SystemClock.currentThreadTimeMillis();
            long j = this.f55861k;
            if (j != 0) {
                long j2 = this.f55859i - j;
                if (j2 >= this.f55866p.m81098h()) {
                    this.f55866p.m81092b(this.f55859i, j2, -1L, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo81073v() {
        this.f55852b.removeCallbacksAndMessages(null);
        this.f55851a.getLooper().quit();
        this.f55851a = null;
        this.f55855e = false;
        sy0.m186556c().m186564i(this);
    }
}

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
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import p153l.e1g0;
import p153l.e43;
import p153l.g43;
import p153l.wgl;
import p153l.xni0;
import p153l.yni0;
import p153l.zy0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BlockBaseStrategy implements zy0.InterfaceC21927a {

    /* JADX INFO: renamed from: v */
    public static int f56697v = 300;

    /* JADX INFO: renamed from: w */
    public static int f56698w = 1000;

    /* JADX INFO: renamed from: a */
    public HandlerThread f56699a;

    /* JADX INFO: renamed from: b */
    public Handler f56700b;

    /* JADX INFO: renamed from: c */
    public C13710c f56701c;

    /* JADX INFO: renamed from: d */
    public e43 f56702d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f56703e;

    /* JADX INFO: renamed from: g */
    public boolean f56705g;

    /* JADX INFO: renamed from: h */
    public long f56706h;

    /* JADX INFO: renamed from: i */
    public long f56707i;

    /* JADX INFO: renamed from: j */
    public long f56708j;

    /* JADX INFO: renamed from: k */
    public long f56709k;

    /* JADX INFO: renamed from: l */
    public long f56710l;

    /* JADX INFO: renamed from: n */
    public boolean f56712n;

    /* JADX INFO: renamed from: p */
    public MessageHelper f56714p;

    /* JADX INFO: renamed from: u */
    public boolean f56719u;

    /* JADX INFO: renamed from: m */
    public boolean f56711m = false;

    /* JADX INFO: renamed from: o */
    public C13707c f56713o = new C13707c();

    /* JADX INFO: renamed from: q */
    public LimitedQueue<String> f56715q = new LimitedQueue<>(10);

    /* JADX INFO: renamed from: r */
    public LimitedQueue<String> f56716r = new LimitedQueue<>(10);

    /* JADX INFO: renamed from: s */
    public int f56717s = f56697v;

    /* JADX INFO: renamed from: t */
    public int f56718t = f56698w;

    /* JADX INFO: renamed from: f */
    public yni0 f56704f = xni0.m212209a();

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
    public class HandlerC13705a extends Handler {
        public HandlerC13705a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                BlockBaseStrategy.this.mo82246l().m82258b();
                return;
            }
            BlockBaseStrategy blockBaseStrategy = BlockBaseStrategy.this;
            if (i == 0) {
                blockBaseStrategy.mo82246l().mo82257a();
            } else {
                blockBaseStrategy.mo82249o(message);
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$b */
    public abstract class AbstractC13706b {

        /* JADX INFO: renamed from: a */
        @SuppressLint({"SimpleDateFormat"})
        public SimpleDateFormat f56721a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSZ");

        /* JADX INFO: renamed from: b */
        public LinkedList<C13707c> f56722b = new LinkedList<>();

        /* JADX INFO: renamed from: c */
        public LinkedList<C13707c> f56723c = new LinkedList<>();

        /* JADX INFO: renamed from: d */
        public LinkedList<C13707c> f56724d = new LinkedList<>();

        /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MonitorEvent f56726a;

            public a(MonitorEvent monitorEvent) {
                this.f56726a = monitorEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                BlockBaseStrategy.this.m82250p(this.f56726a);
            }
        }

        /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C13707c f56728a;

            public b(C13707c c13707c) {
                this.f56728a = c13707c;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13707c c13707c = this.f56728a;
                BlockBaseStrategy.this.m82250p(AbstractC13706b.this.m82265i(this.f56728a.f56733d, new g43(c13707c.f56732c, e1g0.m118971a(c13707c.f56733d), BlockLevel.HIGH.name(), BlockBaseStrategy.this.f56702d.m119350l(), this.f56728a.f56735f)));
            }
        }

        public AbstractC13706b() {
        }

        /* JADX INFO: renamed from: a */
        public void mo82257a() {
            Iterator<C13707c> it = this.f56722b.iterator();
            while (it.hasNext()) {
                C13707c next = it.next();
                if (!BlockBaseStrategy.this.f56715q.contains(next.f56730a + "") && BlockBaseStrategy.this.f56707i != next.f56730a) {
                    it.remove();
                }
            }
            if (m82266j()) {
                g43 g43Var = new g43(m82262f(), m82263g(), BlockLevel.LOW.name(), BlockBaseStrategy.this.f56702d.m119351m(), m82264h());
                g43Var.m121751a(BlockBaseStrategy.this.f56701c.getEventType());
                BlockBaseStrategy.this.f56704f.m216870a(new a(m82265i(m82261e(), g43Var)));
                this.f56722b.clear();
                if (BlockBaseStrategy.this.f56701c.m82298n()) {
                    return;
                }
                BlockBaseStrategy.this.mo82256v();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m82258b() {
            while (this.f56724d.size() > 0) {
                C13707c c13707cPop = this.f56724d.pop();
                if (BlockBaseStrategy.this.f56716r.contains(c13707cPop.f56730a + "") || BlockBaseStrategy.this.f56707i == c13707cPop.f56730a) {
                    BlockBaseStrategy.this.f56704f.m216870a(new b(c13707cPop));
                }
            }
            if (BlockBaseStrategy.this.f56701c.m82298n()) {
                return;
            }
            BlockBaseStrategy.this.mo82256v();
        }

        /* JADX INFO: renamed from: c */
        public void m82259c() {
            this.f56722b.clear();
            this.f56723c.clear();
        }

        /* JADX INFO: renamed from: d */
        public String m82260d(long j) {
            return this.f56721a.format(new Date(j));
        }

        /* JADX INFO: renamed from: e */
        public StackTraceElement[] m82261e() {
            if (this.f56722b.size() <= 0) {
                return null;
            }
            return this.f56722b.get(0).f56733d;
        }

        /* JADX INFO: renamed from: f */
        public String m82262f() {
            int size = this.f56722b.size();
            return size == 0 ? "" : this.f56722b.get(size - 1).f56732c;
        }

        /* JADX INFO: renamed from: g */
        public String m82263g() {
            int size = this.f56722b.size();
            if (size <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = size - 1; i >= 0; i--) {
                C13707c c13707c = this.f56722b.get(i);
                sb.append("startTime:");
                sb.append(m82260d(c13707c.f56730a));
                sb.append(",endTime:");
                sb.append(m82260d(c13707c.f56731b));
                sb.append(SignParameters.NEW_LINE);
                sb.append(e1g0.m118971a(c13707c.f56733d));
                sb.append("\n\n");
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: h */
        public String m82264h() {
            int size = this.f56722b.size();
            return size == 0 ? "UNKNOWN" : this.f56722b.get(size - 1).f56735f;
        }

        /* JADX INFO: renamed from: i */
        public MonitorEvent m82265i(StackTraceElement[] stackTraceElementArr, g43 g43Var) {
            BlockException blockException = new BlockException("block may happend");
            blockException.setStackTrace(stackTraceElementArr);
            MonitorEvent monitorEvent = new MonitorEvent(BlockBaseStrategy.this.f56701c.getEventType(), BlockBaseStrategy.this.f56701c.mo82290a(), blockException);
            monitorEvent.setCrashThread(Looper.getMainLooper().getThread());
            String strM128853c = g43Var.m128853c();
            if (!TextUtils.isEmpty(strM128853c)) {
                monitorEvent.setExtra("meminfo", strM128853c);
            }
            if (!TextUtils.isEmpty(g43Var.m128854d())) {
                monitorEvent.setExtra("stacktrace", g43Var.m128854d());
            }
            monitorEvent.setTag("blockType", g43Var.m128855e());
            monitorEvent.setTag("blockLevel", g43Var.m128852b());
            if (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) * 100.0f) / Runtime.getRuntime().maxMemory() >= 95.0f) {
                monitorEvent.setTag("isHighMemory", "true");
                return monitorEvent;
            }
            monitorEvent.setTag("isHighMemory", "false");
            return monitorEvent;
        }

        /* JADX INFO: renamed from: j */
        public boolean m82266j() {
            return this.f56722b.size() == BlockBaseStrategy.this.f56702d.m119353o();
        }

        /* JADX INFO: renamed from: k */
        public C13707c m82267k(C13707c c13707c) {
            C13707c c13707cPop = !this.f56723c.isEmpty() ? this.f56723c.pop() : BlockBaseStrategy.this.new C13707c();
            c13707cPop.f56730a = c13707c.f56730a;
            c13707cPop.f56731b = c13707c.f56731b;
            c13707cPop.f56734e = c13707c.f56734e;
            c13707cPop.m82270c(c13707c.f56733d);
            c13707cPop.m82269b(c13707c.f56732c);
            c13707cPop.m82271d(c13707c.f56735f);
            return c13707cPop;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.BlockBaseStrategy$c */
    public class C13707c {

        /* JADX INFO: renamed from: a */
        public volatile long f56730a;

        /* JADX INFO: renamed from: b */
        public long f56731b;

        /* JADX INFO: renamed from: c */
        public String f56732c;

        /* JADX INFO: renamed from: d */
        public StackTraceElement[] f56733d;

        /* JADX INFO: renamed from: e */
        public BlockLevel f56734e = BlockLevel.ORIGIN;

        /* JADX INFO: renamed from: f */
        public String f56735f;

        public C13707c() {
        }

        /* JADX INFO: renamed from: a */
        public void m82268a() {
            this.f56730a = 0L;
            this.f56732c = null;
            this.f56734e = BlockLevel.ORIGIN;
            this.f56735f = "UNKNOWN";
            this.f56733d = null;
        }

        /* JADX INFO: renamed from: b */
        public void m82269b(String str) {
            this.f56732c = str;
        }

        /* JADX INFO: renamed from: c */
        public void m82270c(StackTraceElement[] stackTraceElementArr) {
            this.f56733d = stackTraceElementArr;
        }

        /* JADX INFO: renamed from: d */
        public void m82271d(String str) {
            this.f56735f = str;
        }

        /* JADX INFO: renamed from: e */
        public void m82272e() {
            this.f56730a = BlockBaseStrategy.this.f56707i;
        }

        /* JADX INFO: renamed from: f */
        public void m82273f() {
            this.f56730a = -1L;
        }

        public String toString() {
            return "startTime:" + this.f56730a + " endTime:" + this.f56731b + " scene:" + this.f56732c + "stacktrace:" + e1g0.m118971a(this.f56733d) + "level:" + this.f56734e;
        }
    }

    public BlockBaseStrategy(C13710c c13710c, e43 e43Var) {
        this.f56701c = c13710c;
        this.f56702d = e43Var;
        this.f56714p = new MessageHelper(e43Var.m119351m());
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: a */
    public void mo82235a(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: b */
    public void mo82236b(boolean z) {
        if (z) {
            this.f56705g = true;
        } else {
            this.f56706h = SystemClock.elapsedRealtime();
        }
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: c */
    public void mo82237c(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: d */
    public void mo82238d(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    public boolean m82239e() {
        if ("default".equals(zy0.m222096c().m222101e())) {
            return false;
        }
        if (zy0.m222096c().m222102g()) {
            this.f56705g = true;
        } else if (!this.f56705g || SystemClock.elapsedRealtime() - this.f56706h >= this.f56702d.m119349k()) {
            this.f56705g = false;
        }
        return this.f56705g;
    }

    /* JADX INFO: renamed from: f */
    public void m82240f(long j) {
        this.f56700b.sendEmptyMessageDelayed(1, j);
    }

    /* JADX INFO: renamed from: g */
    public void m82241g(long j) {
        this.f56700b.sendEmptyMessageDelayed(0, j);
    }

    /* JADX INFO: renamed from: h */
    public final void m82242h() {
        this.f56712n = false;
        this.f56711m = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m82243i() {
        this.f56712n = true;
        this.f56711m = true;
    }

    /* JADX INFO: renamed from: j */
    public void mo82244j() {
        if (this.f56703e) {
            mo82245k();
        } else {
            this.f56709k = 0L;
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo82245k() {
        if (this.f56712n) {
            this.f56713o.m82273f();
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f56709k = jUptimeMillis;
            long j = jUptimeMillis - this.f56707i;
            this.f56710l = j;
            if (j > Math.max(this.f56717s, f56697v) && this.f56710l < Math.max(this.f56718t, f56698w)) {
                this.f56715q.add(this.f56707i + "");
            } else if (this.f56710l >= this.f56718t) {
                this.f56716r.add(this.f56707i + "");
            }
            if (this.f56711m) {
                long j2 = this.f56710l;
                long jM82281h = this.f56714p.m82281h();
                MessageHelper messageHelper = this.f56714p;
                if (j2 >= jM82281h) {
                    messageHelper.m82275b(this.f56707i, this.f56710l, SystemClock.currentThreadTimeMillis() - this.f56708j, wgl.m206200e());
                } else {
                    messageHelper.m82275b(this.f56707i, this.f56710l, -1L, null);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public abstract AbstractC13706b mo82246l();

    /* JADX INFO: renamed from: m */
    public Handler m82247m(Looper looper) {
        return new HandlerC13705a(looper);
    }

    /* JADX INFO: renamed from: n */
    public MessageHelper.MessageUnit mo82248n() {
        if (this.f56701c.m82297m()) {
            return this.f56714p.m82280g(this.f56707i);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo82249o(Message message);

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityStarted(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: renamed from: p */
    public void m82250p(MonitorEvent monitorEvent) {
        this.f56701c.m108092j(monitorEvent);
    }

    /* JADX INFO: renamed from: q */
    public void m82251q() {
        if (this.f56699a == null) {
            HandlerThread handlerThread = new HandlerThread("block-check-thread");
            this.f56699a = handlerThread;
            handlerThread.start();
            this.f56700b = m82247m(this.f56699a.getLooper());
        }
        zy0.m222096c().m222103h(this);
        this.f56703e = true;
    }

    /* JADX INFO: renamed from: r */
    public void m82252r(int i, long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        this.f56700b.sendMessageAtTime(messageObtain, j);
    }

    /* JADX INFO: renamed from: s */
    public void mo82253s() {
        if (this.f56719u) {
            m82243i();
            mo82245k();
            this.f56719u = false;
        }
        if (!this.f56703e) {
            m82242h();
        } else {
            if (!m82239e()) {
                m82242h();
                return;
            }
            if (this.f56701c.m82297m()) {
                this.f56711m = true;
            }
            mo82255u(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo82254t() {
        if (!this.f56703e) {
            m82242h();
            return;
        }
        if (this.f56701c.m82297m()) {
            this.f56711m = true;
        }
        this.f56719u = true;
        mo82255u(true);
    }

    /* JADX INFO: renamed from: u */
    public void mo82255u(boolean z) {
        this.f56712n = true;
        this.f56707i = SystemClock.uptimeMillis();
        this.f56713o.m82272e();
        if (this.f56711m) {
            this.f56708j = SystemClock.currentThreadTimeMillis();
            long j = this.f56709k;
            if (j != 0) {
                long j2 = this.f56707i - j;
                if (j2 >= this.f56714p.m82281h()) {
                    this.f56714p.m82275b(this.f56707i, j2, -1L, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo82256v() {
        this.f56700b.removeCallbacksAndMessages(null);
        this.f56699a.getLooper().quit();
        this.f56699a = null;
        this.f56703e = false;
        zy0.m222096c().m222104i(this);
    }
}

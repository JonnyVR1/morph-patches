package com.tantanapp.beatles.block;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import p149l.nt2;
import p149l.o33;
import p149l.q33;
import p149l.sy0;

/* JADX INFO: renamed from: com.tantanapp.beatles.block.b */
/* JADX INFO: loaded from: classes13.dex */
public class C13546b extends BlockBaseStrategy {

    /* JADX INFO: renamed from: A */
    public volatile long f55904A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f55905B;

    /* JADX INFO: renamed from: C */
    public volatile boolean f55906C;

    /* JADX INFO: renamed from: x */
    public a f55907x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f55908y;

    /* JADX INFO: renamed from: z */
    public volatile long f55909z;

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.b$a */
    public class a extends BlockBaseStrategy.AbstractC13543b {

        /* JADX INFO: renamed from: com.tantanapp.beatles.block.b$a$a, reason: collision with other inner class name */
        public class RunnableC22703a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MonitorEvent f55911a;

            public RunnableC22703a(MonitorEvent monitorEvent) {
                this.f55911a = monitorEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13546b.this.m81067p(this.f55911a);
            }
        }

        public a() {
            super();
        }

        @Override // com.tantanapp.beatles.block.BlockBaseStrategy.AbstractC13543b
        /* JADX INFO: renamed from: a */
        public void mo81074a() {
            BlockBaseStrategy.C13544c c13544cPeekLast = this.f55874b.peekLast();
            if (c13544cPeekLast != null) {
                if (C13546b.this.f55868r.contains(c13544cPeekLast.f55882a + "") || C13546b.this.f55859i == c13544cPeekLast.f55882a) {
                    C13546b.this.f55856f.m214349a(new RunnableC22703a(m81082i(m81078e(), new q33(m81079f(), m81080g(), BlockBaseStrategy.BlockLevel.LOW.name(), C13546b.this.f55854d.m162365m(), m81081h()))));
                }
            }
            m81104m();
        }

        /* JADX INFO: renamed from: l */
        public void m81103l(BlockBaseStrategy.C13544c c13544c) {
            this.f55874b.add(m81084k(C13546b.this.f55865o));
            C13546b c13546b = C13546b.this;
            c13546b.m81058g(c13546b.f55854d.m162364l());
        }

        /* JADX INFO: renamed from: m */
        public void m81104m() {
            while (this.f55874b.peek() != null) {
                BlockBaseStrategy.C13544c c13544cPollFirst = this.f55874b.pollFirst();
                c13544cPollFirst.m81085a();
                this.f55875c.add(c13544cPollFirst);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m81105n() {
            BlockBaseStrategy.C13544c c13544cM81084k = m81084k(C13546b.this.f55865o);
            BlockBaseStrategy.C13544c c13544cPeekFirst = this.f55874b.peekFirst();
            if (c13544cPeekFirst != null && c13544cPeekFirst.f55882a != c13544cM81084k.f55882a) {
                m81104m();
            }
            this.f55874b.add(c13544cM81084k);
        }
    }

    public C13546b(C13547c c13547c, o33 o33Var) {
        super(c13547c, o33Var);
        this.f55907x = new a();
        this.f55908y = false;
        this.f55909z = 0L;
        this.f55904A = 0L;
        this.f55905B = true;
        this.f55906C = true;
        this.f55869s = o33Var.m162366n();
        this.f55870t = o33Var.m162364l();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: k */
    public void mo81062k() {
        this.f55908y = false;
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    @NonNull
    /* JADX INFO: renamed from: l */
    public BlockBaseStrategy.AbstractC13543b mo81063l() {
        return this.f55907x;
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: o */
    public void mo81066o(Message message) {
        int i = message.what;
        if (i == 3) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis < this.f55909z) {
                m81069r(3, this.f55909z);
                return;
            }
            this.f55905B = true;
            if (this.f55865o.f55882a == -1 || nt2.m160829t()) {
                return;
            }
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (this.f55865o.f55882a == -1 || jUptimeMillis - this.f55865o.f55882a < this.f55854d.m162364l()) {
                this.f55907x.m81104m();
                return;
            }
            BlockBaseStrategy.C13544c c13544cM81084k = mo81063l().m81084k(this.f55865o);
            c13544cM81084k.f55883b = jUptimeMillis;
            c13544cM81084k.m81086b(sy0.m186556c().m186561e());
            c13544cM81084k.m81087c(stackTrace);
            c13544cM81084k.f55886e = BlockBaseStrategy.BlockLevel.HIGH;
            c13544cM81084k.m81088d(this.f55854d.m162369q());
            this.f55907x.m81103l(c13544cM81084k);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
        } else {
            if (SystemClock.uptimeMillis() < this.f55904A) {
                this.f55908y = false;
                m81069r(4, this.f55904A);
                return;
            }
            this.f55908y = true;
        }
        if (!this.f55908y || nt2.m160829t() || this.f55865o.f55882a == -1) {
            return;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.f55865o.f55882a == -1 || jUptimeMillis2 - this.f55865o.f55882a < 1000) {
            this.f55907x.m81104m();
            return;
        }
        StackTraceElement[] stackTrace2 = Looper.getMainLooper().getThread().getStackTrace();
        BlockBaseStrategy.C13544c c13544cM81084k2 = mo81063l().m81084k(this.f55865o);
        c13544cM81084k2.m81087c(stackTrace2);
        c13544cM81084k2.f55883b = jUptimeMillis2;
        this.f55907x.m81105n();
        if (!this.f55908y || this.f55907x.f55874b.size() >= (this.f55854d.m162364l() - 1000) / this.f55854d.m162366n()) {
            return;
        }
        this.f55852b.sendEmptyMessageDelayed(5, this.f55854d.m162366n());
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: v */
    public void mo81073v() {
        super.mo81073v();
        this.f55907x.m81076c();
    }
}

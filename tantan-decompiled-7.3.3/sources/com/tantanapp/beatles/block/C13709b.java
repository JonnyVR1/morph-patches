package com.tantanapp.beatles.block;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import p153l.du2;
import p153l.e43;
import p153l.g43;
import p153l.zy0;

/* JADX INFO: renamed from: com.tantanapp.beatles.block.b */
/* JADX INFO: loaded from: classes11.dex */
public class C13709b extends BlockBaseStrategy {

    /* JADX INFO: renamed from: A */
    public volatile long f56752A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f56753B;

    /* JADX INFO: renamed from: C */
    public volatile boolean f56754C;

    /* JADX INFO: renamed from: x */
    public a f56755x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f56756y;

    /* JADX INFO: renamed from: z */
    public volatile long f56757z;

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.b$a */
    public class a extends BlockBaseStrategy.AbstractC13706b {

        /* JADX INFO: renamed from: com.tantanapp.beatles.block.b$a$a, reason: collision with other inner class name */
        public class RunnableC22819a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MonitorEvent f56759a;

            public RunnableC22819a(MonitorEvent monitorEvent) {
                this.f56759a = monitorEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                C13709b.this.m82250p(this.f56759a);
            }
        }

        public a() {
            super();
        }

        @Override // com.tantanapp.beatles.block.BlockBaseStrategy.AbstractC13706b
        /* JADX INFO: renamed from: a */
        public void mo82257a() {
            BlockBaseStrategy.C13707c c13707cPeekLast = this.f56722b.peekLast();
            if (c13707cPeekLast != null) {
                if (C13709b.this.f56716r.contains(c13707cPeekLast.f56730a + "") || C13709b.this.f56707i == c13707cPeekLast.f56730a) {
                    C13709b.this.f56704f.m216870a(new RunnableC22819a(m82265i(m82261e(), new g43(m82262f(), m82263g(), BlockBaseStrategy.BlockLevel.LOW.name(), C13709b.this.f56702d.m119351m(), m82264h()))));
                }
            }
            m82287m();
        }

        /* JADX INFO: renamed from: l */
        public void m82286l(BlockBaseStrategy.C13707c c13707c) {
            this.f56722b.add(m82267k(C13709b.this.f56713o));
            C13709b c13709b = C13709b.this;
            c13709b.m82241g(c13709b.f56702d.m119350l());
        }

        /* JADX INFO: renamed from: m */
        public void m82287m() {
            while (this.f56722b.peek() != null) {
                BlockBaseStrategy.C13707c c13707cPollFirst = this.f56722b.pollFirst();
                c13707cPollFirst.m82268a();
                this.f56723c.add(c13707cPollFirst);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m82288n() {
            BlockBaseStrategy.C13707c c13707cM82267k = m82267k(C13709b.this.f56713o);
            BlockBaseStrategy.C13707c c13707cPeekFirst = this.f56722b.peekFirst();
            if (c13707cPeekFirst != null && c13707cPeekFirst.f56730a != c13707cM82267k.f56730a) {
                m82287m();
            }
            this.f56722b.add(c13707cM82267k);
        }
    }

    public C13709b(C13710c c13710c, e43 e43Var) {
        super(c13710c, e43Var);
        this.f56755x = new a();
        this.f56756y = false;
        this.f56757z = 0L;
        this.f56752A = 0L;
        this.f56753B = true;
        this.f56754C = true;
        this.f56717s = e43Var.m119352n();
        this.f56718t = e43Var.m119350l();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: k */
    public void mo82245k() {
        this.f56756y = false;
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    @NonNull
    /* JADX INFO: renamed from: l */
    public BlockBaseStrategy.AbstractC13706b mo82246l() {
        return this.f56755x;
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: o */
    public void mo82249o(Message message) {
        int i = message.what;
        if (i == 3) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis < this.f56757z) {
                m82252r(3, this.f56757z);
                return;
            }
            this.f56753B = true;
            if (this.f56713o.f56730a == -1 || du2.m118060t()) {
                return;
            }
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (this.f56713o.f56730a == -1 || jUptimeMillis - this.f56713o.f56730a < this.f56702d.m119350l()) {
                this.f56755x.m82287m();
                return;
            }
            BlockBaseStrategy.C13707c c13707cM82267k = mo82246l().m82267k(this.f56713o);
            c13707cM82267k.f56731b = jUptimeMillis;
            c13707cM82267k.m82269b(zy0.m222096c().m222101e());
            c13707cM82267k.m82270c(stackTrace);
            c13707cM82267k.f56734e = BlockBaseStrategy.BlockLevel.HIGH;
            c13707cM82267k.m82271d(this.f56702d.m119355q());
            this.f56755x.m82286l(c13707cM82267k);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
        } else {
            if (SystemClock.uptimeMillis() < this.f56752A) {
                this.f56756y = false;
                m82252r(4, this.f56752A);
                return;
            }
            this.f56756y = true;
        }
        if (!this.f56756y || du2.m118060t() || this.f56713o.f56730a == -1) {
            return;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.f56713o.f56730a == -1 || jUptimeMillis2 - this.f56713o.f56730a < 1000) {
            this.f56755x.m82287m();
            return;
        }
        StackTraceElement[] stackTrace2 = Looper.getMainLooper().getThread().getStackTrace();
        BlockBaseStrategy.C13707c c13707cM82267k2 = mo82246l().m82267k(this.f56713o);
        c13707cM82267k2.m82270c(stackTrace2);
        c13707cM82267k2.f56731b = jUptimeMillis2;
        this.f56755x.m82288n();
        if (!this.f56756y || this.f56755x.f56722b.size() >= (this.f56702d.m119350l() - 1000) / this.f56702d.m119352n()) {
            return;
        }
        this.f56700b.sendEmptyMessageDelayed(5, this.f56702d.m119352n());
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: v */
    public void mo82256v() {
        super.mo82256v();
        this.f56755x.m82259c();
    }
}

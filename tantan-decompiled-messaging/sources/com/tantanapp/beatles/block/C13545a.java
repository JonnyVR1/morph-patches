package com.tantanapp.beatles.block;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import p149l.nt2;
import p149l.o33;
import p149l.sy0;
import p149l.vsf0;

/* JADX INFO: renamed from: com.tantanapp.beatles.block.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13545a extends BlockBaseStrategy {

    /* JADX INFO: renamed from: A */
    public volatile boolean f55898A;

    /* JADX INFO: renamed from: B */
    public a f55899B;

    /* JADX INFO: renamed from: x */
    public volatile long f55900x;

    /* JADX INFO: renamed from: y */
    public volatile long f55901y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f55902z;

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.a$a */
    public class a extends BlockBaseStrategy.AbstractC13543b {
        public a() {
            super();
        }

        /* JADX INFO: renamed from: l */
        public void m81102l(BlockBaseStrategy.C13544c c13544c) {
            BlockBaseStrategy.BlockLevel blockLevel = c13544c.f55886e;
            if (blockLevel != BlockBaseStrategy.BlockLevel.LOW) {
                if (blockLevel == BlockBaseStrategy.BlockLevel.HIGH) {
                    BlockBaseStrategy.C13544c c13544cPeekLast = this.f55874b.peekLast();
                    if (c13544cPeekLast != null && c13544cPeekLast.f55882a == c13544c.f55882a) {
                        BlockBaseStrategy.C13544c c13544cRemoveLast = this.f55874b.removeLast();
                        c13544cRemoveLast.m81085a();
                        this.f55875c.add(c13544cRemoveLast);
                    }
                    this.f55876d.add(c13544c);
                    C13545a c13545a = C13545a.this;
                    c13545a.m81057f(c13545a.f55854d.m162364l());
                    return;
                }
                return;
            }
            if (TextUtils.equals(c13544c.f55887f, "PAGE_CREATING") && C13545a.this.f55854d.m162370r()) {
                return;
            }
            this.f55874b.add(c13544c);
            BlockBaseStrategy.C13544c c13544cPeekFirst = this.f55874b.peekFirst();
            if (c13544cPeekFirst != null && c13544c.f55883b - c13544cPeekFirst.f55882a > C13545a.this.f55854d.m162368p()) {
                BlockBaseStrategy.C13544c c13544cPop = this.f55874b.pop();
                c13544cPop.m81085a();
                this.f55875c.add(c13544cPop);
            }
            if (m81083j()) {
                C13545a c13545a2 = C13545a.this;
                c13545a2.m81058g(c13545a2.f55854d.m162364l());
            }
        }
    }

    public C13545a(C13547c c13547c, o33 o33Var) {
        super(c13547c, o33Var);
        this.f55900x = 0L;
        this.f55901y = 0L;
        this.f55902z = true;
        this.f55898A = true;
        this.f55899B = new a();
        this.f55869s = o33Var.m162368p();
        this.f55870t = o33Var.m162364l();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo81052a(Activity activity) {
        super.mo81052a(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo81053b(boolean z) {
        super.mo81053b(z);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo81054c(Activity activity) {
        super.mo81054c(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo81055d(Activity activity) {
        super.mo81055d(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo81061j() {
        super.mo81061j();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: k */
    public void mo81062k() {
        super.mo81062k();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    @NonNull
    /* JADX INFO: renamed from: l */
    public BlockBaseStrategy.AbstractC13543b mo81063l() {
        return this.f55899B;
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ MessageHelper.MessageUnit mo81065n() {
        return super.mo81065n();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: o */
    public void mo81066o(Message message) {
        int i = message.what;
        if (i == 3) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis < this.f55901y) {
                m81069r(3, this.f55901y);
                return;
            }
            this.f55898A = true;
            if (nt2.m160829t() || this.f55865o.f55882a == -1) {
                return;
            }
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (this.f55865o.f55882a == -1 || jUptimeMillis - this.f55865o.f55882a < this.f55854d.m162365m()) {
                return;
            }
            BlockBaseStrategy.C13544c c13544cM81084k = mo81063l().m81084k(this.f55865o);
            c13544cM81084k.f55886e = BlockBaseStrategy.BlockLevel.LOW;
            c13544cM81084k.m81087c(stackTrace);
            this.f55866p.m81091a(this.f55859i, vsf0.m199866a(stackTrace));
            c13544cM81084k.m81086b(sy0.m186556c().m186561e());
            c13544cM81084k.m81088d(this.f55854d.m162369q());
            this.f55899B.m81102l(c13544cM81084k);
            return;
        }
        if (i != 4) {
            return;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (jUptimeMillis2 < this.f55900x) {
            m81069r(4, this.f55900x);
            return;
        }
        this.f55902z = true;
        if (nt2.m160829t() || this.f55865o.f55882a == -1) {
            return;
        }
        StackTraceElement[] stackTrace2 = Looper.getMainLooper().getThread().getStackTrace();
        if (this.f55865o.f55882a == -1 || jUptimeMillis2 - this.f55865o.f55882a < this.f55854d.m162364l()) {
            return;
        }
        BlockBaseStrategy.C13544c c13544cM81084k2 = mo81063l().m81084k(this.f55865o);
        c13544cM81084k2.f55883b = jUptimeMillis2;
        c13544cM81084k2.f55886e = BlockBaseStrategy.BlockLevel.HIGH;
        c13544cM81084k2.m81087c(stackTrace2);
        this.f55866p.m81091a(this.f55859i, vsf0.m199866a(stackTrace2));
        c13544cM81084k2.m81086b(sy0.m186556c().m186561e());
        c13544cM81084k2.m81088d(this.f55854d.m162369q());
        this.f55899B.m81102l(c13544cM81084k2);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    public /* bridge */ /* synthetic */ void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    public /* bridge */ /* synthetic */ void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p149l.sy0.InterfaceC20069a
    public /* bridge */ /* synthetic */ void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ void mo81070s() {
        super.mo81070s();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void mo81071t() {
        super.mo81071t();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: u */
    public void mo81072u(boolean z) {
        super.mo81072u(z);
        this.f55900x = this.f55865o.f55882a + ((long) this.f55854d.m162364l());
        this.f55901y = this.f55865o.f55882a + ((long) this.f55854d.m162365m());
        if (this.f55898A) {
            m81069r(3, this.f55901y);
            this.f55898A = false;
        }
        if (this.f55902z) {
            m81069r(4, this.f55900x);
            this.f55902z = false;
        }
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: v */
    public void mo81073v() {
        super.mo81073v();
        this.f55899B.m81076c();
    }
}

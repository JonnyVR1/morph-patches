package com.tantanapp.beatles.block;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import p153l.du2;
import p153l.e1g0;
import p153l.e43;
import p153l.zy0;

/* JADX INFO: renamed from: com.tantanapp.beatles.block.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13708a extends BlockBaseStrategy {

    /* JADX INFO: renamed from: A */
    public volatile boolean f56746A;

    /* JADX INFO: renamed from: B */
    public a f56747B;

    /* JADX INFO: renamed from: x */
    public volatile long f56748x;

    /* JADX INFO: renamed from: y */
    public volatile long f56749y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f56750z;

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.a$a */
    public class a extends BlockBaseStrategy.AbstractC13706b {
        public a() {
            super();
        }

        /* JADX INFO: renamed from: l */
        public void m82285l(BlockBaseStrategy.C13707c c13707c) {
            BlockBaseStrategy.BlockLevel blockLevel = c13707c.f56734e;
            if (blockLevel != BlockBaseStrategy.BlockLevel.LOW) {
                if (blockLevel == BlockBaseStrategy.BlockLevel.HIGH) {
                    BlockBaseStrategy.C13707c c13707cPeekLast = this.f56722b.peekLast();
                    if (c13707cPeekLast != null && c13707cPeekLast.f56730a == c13707c.f56730a) {
                        BlockBaseStrategy.C13707c c13707cRemoveLast = this.f56722b.removeLast();
                        c13707cRemoveLast.m82268a();
                        this.f56723c.add(c13707cRemoveLast);
                    }
                    this.f56724d.add(c13707c);
                    C13708a c13708a = C13708a.this;
                    c13708a.m82240f(c13708a.f56702d.m119350l());
                    return;
                }
                return;
            }
            if (TextUtils.equals(c13707c.f56735f, "PAGE_CREATING") && C13708a.this.f56702d.m119356r()) {
                return;
            }
            this.f56722b.add(c13707c);
            BlockBaseStrategy.C13707c c13707cPeekFirst = this.f56722b.peekFirst();
            if (c13707cPeekFirst != null && c13707c.f56731b - c13707cPeekFirst.f56730a > C13708a.this.f56702d.m119354p()) {
                BlockBaseStrategy.C13707c c13707cPop = this.f56722b.pop();
                c13707cPop.m82268a();
                this.f56723c.add(c13707cPop);
            }
            if (m82266j()) {
                C13708a c13708a2 = C13708a.this;
                c13708a2.m82241g(c13708a2.f56702d.m119350l());
            }
        }
    }

    public C13708a(C13710c c13710c, e43 e43Var) {
        super(c13710c, e43Var);
        this.f56748x = 0L;
        this.f56749y = 0L;
        this.f56750z = true;
        this.f56746A = true;
        this.f56747B = new a();
        this.f56717s = e43Var.m119354p();
        this.f56718t = e43Var.m119350l();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo82235a(Activity activity) {
        super.mo82235a(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo82236b(boolean z) {
        super.mo82236b(z);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo82237c(Activity activity) {
        super.mo82237c(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo82238d(Activity activity) {
        super.mo82238d(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo82244j() {
        super.mo82244j();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: k */
    public void mo82245k() {
        super.mo82245k();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    @NonNull
    /* JADX INFO: renamed from: l */
    public BlockBaseStrategy.AbstractC13706b mo82246l() {
        return this.f56747B;
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ MessageHelper.MessageUnit mo82248n() {
        return super.mo82248n();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: o */
    public void mo82249o(Message message) {
        int i = message.what;
        if (i == 3) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis < this.f56749y) {
                m82252r(3, this.f56749y);
                return;
            }
            this.f56746A = true;
            if (du2.m118060t() || this.f56713o.f56730a == -1) {
                return;
            }
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (this.f56713o.f56730a == -1 || jUptimeMillis - this.f56713o.f56730a < this.f56702d.m119351m()) {
                return;
            }
            BlockBaseStrategy.C13707c c13707cM82267k = mo82246l().m82267k(this.f56713o);
            c13707cM82267k.f56734e = BlockBaseStrategy.BlockLevel.LOW;
            c13707cM82267k.m82270c(stackTrace);
            this.f56714p.m82274a(this.f56707i, e1g0.m118971a(stackTrace));
            c13707cM82267k.m82269b(zy0.m222096c().m222101e());
            c13707cM82267k.m82271d(this.f56702d.m119355q());
            this.f56747B.m82285l(c13707cM82267k);
            return;
        }
        if (i != 4) {
            return;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (jUptimeMillis2 < this.f56748x) {
            m82252r(4, this.f56748x);
            return;
        }
        this.f56750z = true;
        if (du2.m118060t() || this.f56713o.f56730a == -1) {
            return;
        }
        StackTraceElement[] stackTrace2 = Looper.getMainLooper().getThread().getStackTrace();
        if (this.f56713o.f56730a == -1 || jUptimeMillis2 - this.f56713o.f56730a < this.f56702d.m119350l()) {
            return;
        }
        BlockBaseStrategy.C13707c c13707cM82267k2 = mo82246l().m82267k(this.f56713o);
        c13707cM82267k2.f56731b = jUptimeMillis2;
        c13707cM82267k2.f56734e = BlockBaseStrategy.BlockLevel.HIGH;
        c13707cM82267k2.m82270c(stackTrace2);
        this.f56714p.m82274a(this.f56707i, e1g0.m118971a(stackTrace2));
        c13707cM82267k2.m82269b(zy0.m222096c().m222101e());
        c13707cM82267k2.m82271d(this.f56702d.m119355q());
        this.f56747B.m82285l(c13707cM82267k2);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    public /* bridge */ /* synthetic */ void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    public /* bridge */ /* synthetic */ void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy, p153l.zy0.InterfaceC21927a
    public /* bridge */ /* synthetic */ void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ void mo82253s() {
        super.mo82253s();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void mo82254t() {
        super.mo82254t();
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: u */
    public void mo82255u(boolean z) {
        super.mo82255u(z);
        this.f56748x = this.f56713o.f56730a + ((long) this.f56702d.m119350l());
        this.f56749y = this.f56713o.f56730a + ((long) this.f56702d.m119351m());
        if (this.f56746A) {
            m82252r(3, this.f56749y);
            this.f56746A = false;
        }
        if (this.f56750z) {
            m82252r(4, this.f56748x);
            this.f56750z = false;
        }
    }

    @Override // com.tantanapp.beatles.block.BlockBaseStrategy
    /* JADX INFO: renamed from: v */
    public void mo82256v() {
        super.mo82256v();
        this.f56747B.m82259c();
    }
}

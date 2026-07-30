package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class poy0 implements zsy0 {

    /* JADX INFO: renamed from: a */
    public final zsy0 f150571a;

    /* JADX INFO: renamed from: b */
    public boolean f150572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qoy0 f150573c;

    public poy0(qoy0 qoy0Var, zsy0 zsy0Var) {
        this.f150573c = qoy0Var;
        this.f150571a = zsy0Var;
    }

    @Override // p149l.zsy0
    /* JADX INFO: renamed from: a */
    public final int mo128011a(long j) {
        if (this.f150573c.m175788i()) {
            return -3;
        }
        return this.f150571a.mo128011a(j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    @Override // p149l.zsy0
    /* JADX INFO: renamed from: b */
    public final int mo128012b(f0y0 f0y0Var, ylx0 ylx0Var, int i) {
        qoy0 qoy0Var = this.f150573c;
        if (qoy0Var.m175788i()) {
            return -3;
        }
        if (this.f150572b) {
            ylx0Var.m219210c(4);
            return -4;
        }
        long jZzb = qoy0Var.zzb();
        int iMo128012b = this.f150571a.mo128012b(f0y0Var, ylx0Var, i);
        if (iMo128012b != -5) {
            long j = this.f150573c.f155652e;
            if (j == Long.MIN_VALUE || ((iMo128012b != -4 || ylx0Var.f198947f < j) && !(iMo128012b == -3 && jZzb == Long.MIN_VALUE && !ylx0Var.f198946e))) {
                return iMo128012b;
            }
            ylx0Var.mo160161b();
            ylx0Var.m219210c(4);
            this.f150572b = true;
            return -4;
        }
        mhr0 mhr0Var = f0y0Var.f94022a;
        mhr0Var.getClass();
        int i2 = mhr0Var.f133875B;
        if (i2 != 0) {
            int i3 = this.f150573c.f155652e == Long.MIN_VALUE ? mhr0Var.f133876C : 0;
            ter0 ter0VarM154634b = mhr0Var.m154634b();
            ter0VarM154634b.m188597f(i2);
            ter0VarM154634b.m188598g(i3);
            f0y0Var.f94022a = ter0VarM154634b.m188591D();
        } else if (mhr0Var.f133876C != 0) {
            i2 = 0;
            if (this.f150573c.f155652e == Long.MIN_VALUE) {
            }
            ter0 ter0VarM154634b2 = mhr0Var.m154634b();
            ter0VarM154634b2.m188597f(i2);
            ter0VarM154634b2.m188598g(i3);
            f0y0Var.f94022a = ter0VarM154634b2.m188591D();
        }
        return -5;
    }

    /* JADX INFO: renamed from: c */
    public final void m170644c() {
        this.f150572b = false;
    }

    @Override // p149l.zsy0
    public final void zzd() throws IOException {
        this.f150571a.zzd();
    }

    @Override // p149l.zsy0
    public final boolean zze() {
        return !this.f150573c.m175788i() && this.f150571a.zze();
    }
}

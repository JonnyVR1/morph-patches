package com.tantanapp.beatles.block;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Printer;
import com.google.gson.Gson;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import p153l.c610;
import p153l.du2;
import p153l.e43;
import p153l.fq80;
import p153l.k5f;
import p153l.mod;
import p153l.p8c;
import p153l.wgl;
import p153l.x2f;
import p153l.x3f;

/* JADX INFO: renamed from: com.tantanapp.beatles.block.c */
/* JADX INFO: loaded from: classes11.dex */
public class C13710c extends c610 {

    /* JADX INFO: renamed from: d */
    public e43 f56761d;

    /* JADX INFO: renamed from: e */
    public boolean f56762e;

    /* JADX INFO: renamed from: f */
    public BlockBaseStrategy f56763f;

    /* JADX INFO: renamed from: g */
    public boolean f56764g;

    /* JADX INFO: renamed from: h */
    public boolean f56765h;

    /* JADX INFO: renamed from: i */
    public int f56766i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f56767j;

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.c$a */
    public class a implements k5f {
        public a() {
        }

        @Override // p153l.k5f
        /* JADX INFO: renamed from: a */
        public void mo82303a(MonitorEvent monitorEvent) {
            monitorEvent.setFormat(mod.m159258c().mo107477a());
            monitorEvent.setCacheDir(C13710c.this.mo82291c() + "/" + monitorEvent.getEventId());
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.c$b */
    public class b implements Printer {
        public b() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">>>>> Dispatching")) {
                C13710c.this.f56763f.mo82253s();
            }
            if (str.startsWith("<<<<< Finished")) {
                C13710c.this.f56763f.mo82244j();
            }
        }
    }

    public C13710c() {
        this.f56766i = -1;
        this.f56767j = false;
        this.f56761d = new e43();
    }

    @Override // p153l.f0m
    /* JADX INFO: renamed from: a */
    public String mo82290a() {
        return null;
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: c */
    public String mo82291c() {
        return super.mo82291c() + "/" + getEventType();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: d */
    public x2f mo82292d() {
        return mod.m159258c();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: e */
    public k5f mo82293e() {
        return new a();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: f */
    public String mo82294f() {
        MessageHelper.MessageUnit messageUnitMo82248n = this.f56763f.mo82248n();
        if (messageUnitMo82248n != null) {
            return new Gson().toJson(messageUnitMo82248n);
        }
        return null;
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: g */
    public void mo82295g(Context context, x3f x3fVar) {
        super.mo82295g(context, x3fVar);
        if (this.f56761d.m119348j()) {
            if (this.f56761d.m119347i()) {
                this.f56763f = new C13709b(this, this.f56761d);
            } else {
                this.f56763f = new C13708a(this, this.f56761d);
            }
            if (this.f56761d.m119345g()) {
                m82301q();
            }
            this.f79924c = true;
            if (this.f56761d.m119346h()) {
                int i = Build.VERSION.SDK_INT;
                if ((i == 26 || i == 27) && wgl.m206198c() != null) {
                    this.f56765h = true;
                }
            }
        }
    }

    @Override // p153l.f0m
    public String getEventType() {
        return "block";
    }

    /* JADX INFO: renamed from: l */
    public final int m82296l(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length != 2) {
            return 0;
        }
        try {
            if (p8c.m171236g(str2)) {
                return Integer.valueOf(strArrSplit[1]).intValue();
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m82297m() {
        return this.f56765h;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m82298n() {
        if (this.f56766i == -1) {
            this.f56766i = m82296l(fq80.m126738a(du2.m118045e(), getEventType(), ""));
        }
        this.f56767j = this.f56766i < m82299o();
        return this.f56767j;
    }

    /* JADX INFO: renamed from: o */
    public int m82299o() {
        return 20;
    }

    /* JADX INFO: renamed from: p */
    public final void m82300p() {
        if (this.f56762e) {
            return;
        }
        Looper.getMainLooper().setMessageLogging(new b());
        this.f56762e = true;
    }

    /* JADX INFO: renamed from: q */
    public void m82301q() {
        this.f56764g = true;
        if (m82298n()) {
            this.f56763f.m82251q();
            m82300p();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m82302r() {
        e43 e43Var;
        if (this.f56764g || !m108090h() || (e43Var = this.f56761d) == null || e43Var.m119345g()) {
            return;
        }
        m82301q();
        this.f56763f.mo82254t();
    }

    public C13710c(e43 e43Var) {
        this.f56766i = -1;
        this.f56767j = false;
        this.f56761d = e43Var;
    }
}

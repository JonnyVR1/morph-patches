package com.tantanapp.beatles.block;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Printer;
import com.google.gson.Gson;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import p149l.ai80;
import p149l.g4f;
import p149l.gel;
import p149l.hnd;
import p149l.j7c;
import p149l.nt2;
import p149l.o33;
import p149l.s1f;
import p149l.s2f;
import p149l.sx00;

/* JADX INFO: renamed from: com.tantanapp.beatles.block.c */
/* JADX INFO: loaded from: classes13.dex */
public class C13547c extends sx00 {

    /* JADX INFO: renamed from: d */
    public o33 f55913d;

    /* JADX INFO: renamed from: e */
    public boolean f55914e;

    /* JADX INFO: renamed from: f */
    public BlockBaseStrategy f55915f;

    /* JADX INFO: renamed from: g */
    public boolean f55916g;

    /* JADX INFO: renamed from: h */
    public boolean f55917h;

    /* JADX INFO: renamed from: i */
    public int f55918i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f55919j;

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.c$a */
    public class a implements g4f {
        public a() {
        }

        @Override // p149l.g4f
        /* JADX INFO: renamed from: a */
        public void mo81120a(MonitorEvent monitorEvent) {
            monitorEvent.setFormat(hnd.m131888c().mo104783a());
            monitorEvent.setCacheDir(C13547c.this.mo81108c() + "/" + monitorEvent.getEventId());
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.block.c$b */
    public class b implements Printer {
        public b() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">>>>> Dispatching")) {
                C13547c.this.f55915f.mo81070s();
            }
            if (str.startsWith("<<<<< Finished")) {
                C13547c.this.f55915f.mo81061j();
            }
        }
    }

    public C13547c() {
        this.f55918i = -1;
        this.f55919j = false;
        this.f55913d = new o33();
    }

    @Override // p149l.mxl
    /* JADX INFO: renamed from: a */
    public String mo81107a() {
        return null;
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: c */
    public String mo81108c() {
        return super.mo81108c() + "/" + getEventType();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: d */
    public s1f mo81109d() {
        return hnd.m131888c();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: e */
    public g4f mo81110e() {
        return new a();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: f */
    public String mo81111f() {
        MessageHelper.MessageUnit messageUnitMo81065n = this.f55915f.mo81065n();
        if (messageUnitMo81065n != null) {
            return new Gson().toJson(messageUnitMo81065n);
        }
        return null;
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: g */
    public void mo81112g(Context context, s2f s2fVar) {
        super.mo81112g(context, s2fVar);
        if (this.f55913d.m162362j()) {
            if (this.f55913d.m162361i()) {
                this.f55915f = new C13546b(this, this.f55913d);
            } else {
                this.f55915f = new C13545a(this, this.f55913d);
            }
            if (this.f55913d.m162359g()) {
                m81118q();
            }
            this.f166774c = true;
            if (this.f55913d.m162360h()) {
                int i = Build.VERSION.SDK_INT;
                if ((i == 26 || i == 27) && gel.m125822c() != null) {
                    this.f55917h = true;
                }
            }
        }
    }

    @Override // p149l.mxl
    public String getEventType() {
        return "block";
    }

    /* JADX INFO: renamed from: l */
    public final int m81113l(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length != 2) {
            return 0;
        }
        try {
            if (j7c.m140088g(str2)) {
                return Integer.valueOf(strArrSplit[1]).intValue();
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m81114m() {
        return this.f55917h;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m81115n() {
        if (this.f55918i == -1) {
            this.f55918i = m81113l(ai80.m96792a(nt2.m160814e(), getEventType(), ""));
        }
        this.f55919j = this.f55918i < m81116o();
        return this.f55919j;
    }

    /* JADX INFO: renamed from: o */
    public int m81116o() {
        return 20;
    }

    /* JADX INFO: renamed from: p */
    public final void m81117p() {
        if (this.f55914e) {
            return;
        }
        Looper.getMainLooper().setMessageLogging(new b());
        this.f55914e = true;
    }

    /* JADX INFO: renamed from: q */
    public void m81118q() {
        this.f55916g = true;
        if (m81115n()) {
            this.f55915f.m81068q();
            m81117p();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m81119r() {
        o33 o33Var;
        if (this.f55916g || !m186393h() || (o33Var = this.f55913d) == null || o33Var.m162359g()) {
            return;
        }
        m81118q();
        this.f55915f.mo81071t();
    }

    public C13547c(o33 o33Var) {
        this.f55918i = -1;
        this.f55919j = false;
        this.f55913d = o33Var;
    }
}

package com.tantanapp.beatles.fpsmonitor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p149l.grl;
import p149l.ifi0;
import p149l.n1j;
import p149l.n21;
import p149l.o1j;
import p149l.o3m;
import p149l.q1j;
import p149l.r1j;
import p149l.uei0;

/* JADX INFO: loaded from: classes13.dex */
public class FpsMonitor extends ifi0<r1j> implements ChoreographerFrameCallbackC13554a.a {

    /* JADX INFO: renamed from: h */
    public int f55926h;

    /* JADX INFO: renamed from: i */
    public int f55927i;

    /* JADX INFO: renamed from: j */
    public long f55928j;

    /* JADX INFO: renamed from: k */
    public String f55929k;

    /* JADX INFO: renamed from: l */
    public long f55930l;

    /* JADX INFO: renamed from: m */
    public n1j f55931m;

    /* JADX INFO: renamed from: n */
    public HashMap<String, grl> f55932n;

    public enum DropStatus {
        frozen(2),
        high(1),
        middle(0);

        int index;

        DropStatus(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$a */
    public class RunnableC13549a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ grl f55933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55934b;

        public RunnableC13549a(grl grlVar, String str) {
            this.f55933a = grlVar;
            this.f55934b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f55933a.mo81150a(this.f55934b);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$b */
    public static final class RunnableC13550b implements Runnable {

        /* JADX INFO: renamed from: a */
        public grl f55936a;

        /* JADX INFO: renamed from: b */
        public String f55937b;

        /* JADX INFO: renamed from: c */
        public int f55938c;

        /* JADX INFO: renamed from: d */
        public long f55939d;

        /* JADX INFO: renamed from: e */
        public long f55940e;

        public RunnableC13550b(grl grlVar, long j, long j2, String str, int i) {
            this.f55936a = grlVar;
            this.f55937b = str;
            this.f55938c = i;
            this.f55939d = j;
            this.f55940e = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f55936a.mo81151b(new r1j(this.f55937b, this.f55938c), this.f55937b);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$d */
    public class C13552d {

        /* JADX INFO: renamed from: a */
        public String f55943a;

        /* JADX INFO: renamed from: b */
        public long f55944b;

        /* JADX INFO: renamed from: c */
        public int f55945c;

        /* JADX INFO: renamed from: d */
        public int f55946d;

        /* JADX INFO: renamed from: e */
        public int f55947e;

        /* JADX INFO: renamed from: f */
        public long f55948f;

        /* JADX INFO: renamed from: g */
        public long f55949g;

        /* JADX INFO: renamed from: h */
        public long f55950h;

        /* JADX INFO: renamed from: i */
        public int[] f55951i = new int[DropStatus.values().length];

        /* JADX INFO: renamed from: j */
        public int[] f55952j = new int[DropStatus.values().length];

        public C13552d(String str) {
            this.f55943a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m81153a(int i) {
            if (this.f55947e == 0) {
                this.f55949g = System.currentTimeMillis();
            }
            int i2 = 60 - i;
            this.f55944b += (((long) i2) * FpsMonitor.this.f55928j) / 1000000;
            this.f55945c += i2;
            this.f55947e++;
            this.f55946d += i;
            if (i2 >= FpsMonitor.this.f55931m.m157367c()) {
                int[] iArr = this.f55951i;
                int i3 = DropStatus.frozen.index;
                iArr[i3] = iArr[i3] + 1;
                int[] iArr2 = this.f55952j;
                iArr2[i3] = iArr2[i3] + i2;
                return;
            }
            int iM157368d = FpsMonitor.this.f55931m.m157368d();
            int[] iArr3 = this.f55951i;
            if (i2 >= iM157368d) {
                int i4 = DropStatus.high.index;
                iArr3[i4] = iArr3[i4] + 1;
                int[] iArr4 = this.f55952j;
                iArr4[i4] = iArr4[i4] + i2;
                return;
            }
            int i5 = DropStatus.middle.index;
            iArr3[i5] = iArr3[i5] + 1;
            int[] iArr5 = this.f55952j;
            iArr5[i5] = iArr5[i5] + i2;
        }

        /* JADX INFO: renamed from: b */
        public void m81154b() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f55950h = jCurrentTimeMillis;
                String str = this.f55943a;
                long j = this.f55949g;
                int[] iArr = this.f55951i;
                int i = DropStatus.frozen.index;
                int i2 = iArr[i];
                int[] iArr2 = this.f55952j;
                int i3 = iArr2[i];
                int i4 = DropStatus.high.index;
                int i5 = iArr[i4];
                int i6 = iArr2[i4];
                int i7 = DropStatus.middle.index;
                o1j o1jVar = new o1j(str, j, jCurrentTimeMillis, i2, i3, i5, i6, iArr[i7], iArr2[i7]);
                o1jVar.m116070a(FpsMonitor.this.mo81141j());
                FpsMonitor.this.m135927q(o1jVar);
            } catch (Throwable unused) {
            }
            this.f55948f = System.currentTimeMillis();
            this.f55945c = 0;
            this.f55944b = 0L;
            this.f55946d = 0;
            this.f55947e = 0;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$e */
    public static class C13553e {
        private static FpsMonitor INSTANCE = new FpsMonitor(null);
    }

    public FpsMonitor() {
        this.f55928j = 16666666L;
        this.f55930l = 0L;
        this.f55932n = new HashMap<>();
        this.f55931m = new n1j();
    }

    /* JADX INFO: renamed from: x */
    public static FpsMonitor m81131x() {
        return C13553e.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m81132A() {
        this.f55930l = 0L;
        this.f55926h = 0;
    }

    /* JADX INFO: renamed from: B */
    public void m81133B() {
        if (this.f55931m.mo157365a()) {
            mo81135b("collector");
        }
    }

    @Override // com.tantanapp.beatles.fpsmonitor.ChoreographerFrameCallbackC13554a.a
    /* JADX INFO: renamed from: a */
    public boolean mo81134a() {
        return this.f55932n.size() > 0;
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: b */
    public void mo81135b(String str) {
        if (this.f113025d) {
            grl grlVarRemove = this.f55932n.remove(str);
            if (grlVarRemove != null) {
                n21.m157541b(new RunnableC13549a(grlVarRemove, str));
            }
            if (this.f55932n.size() == 0) {
                ChoreographerFrameCallbackC13554a.m81156e().m81162k();
            }
        }
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: c */
    public long mo81136c() {
        return 0L;
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: d */
    public int mo81137d() {
        return 0;
    }

    @Override // com.tantanapp.beatles.fpsmonitor.ChoreographerFrameCallbackC13554a.a
    public void doFrame(long j) {
        if (this.f55932n.size() == 0) {
            return;
        }
        m81149z(j);
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: e */
    public long mo81138e() {
        return 0L;
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: h */
    public void mo81140h(String str, grl grlVar) {
        if (this.f113025d) {
            if (ChoreographerFrameCallbackC13554a.m81156e().m81159h()) {
                ChoreographerFrameCallbackC13554a.m81156e().m81161j();
            }
            if (this.f55932n.containsKey(str)) {
                return;
            }
            this.f55932n.put(str, grlVar);
        }
    }

    @Override // p149l.ifi0
    @NonNull
    /* JADX INFO: renamed from: j */
    public String mo81141j() {
        return "fps";
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: k */
    public o3m mo81142k() {
        return new q1j(mo81141j());
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: l */
    public uei0 mo81143l() {
        return this.f55931m;
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: m */
    public void mo81144m() {
        if (ChoreographerFrameCallbackC13554a.m81156e().m81158g()) {
            ChoreographerFrameCallbackC13554a.m81156e().m81160i(this);
            this.f113025d = true;
        }
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: p */
    public int mo81145p() {
        return 50;
    }

    @Override // com.tantanapp.beatles.fpsmonitor.ChoreographerFrameCallbackC13554a.a
    public void pause() {
        m81132A();
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: r */
    public void mo81146r() {
        if (m135926o()) {
            mo81140h("collector", new C13551c(this, null));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m81147w(long j, long j2, int i, String str) {
        for (Map.Entry<String, grl> entry : this.f55932n.entrySet()) {
            if (!entry.getKey().equals("collector")) {
                n21.m157541b(new RunnableC13550b(entry.getValue(), this.f55930l, j2, this.f55929k, this.f55927i));
            } else if (!"default".equals(this.f55929k)) {
                n21.m157541b(new RunnableC13550b(entry.getValue(), this.f55930l, j2, this.f55929k, this.f55927i));
            }
        }
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public r1j mo81139f() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final void m81149z(long j) {
        long j2 = this.f55930l;
        if (j2 == 0) {
            this.f55930l = j;
            this.f55926h = 0;
            return;
        }
        this.f55926h++;
        if ((j - j2) / 1000000 >= 1000) {
            float f = (j - j2) / 1000000.0f;
            this.f55929k = ChoreographerFrameCallbackC13554a.m81156e().m81157f();
            if (f >= 2000.0f) {
                int i = (int) ((f - 1000.0f) / 1000.0f);
                for (int i2 = 0; i2 < i; i2++) {
                    m81147w(this.f55930l, j, 0, this.f55929k);
                }
                f -= i * 1000;
            }
            int i3 = (int) ((this.f55926h * 1000) / f);
            this.f55926h = i3;
            this.f55927i = Math.min(60, i3);
            if (!this.f113026e) {
                m81133B();
            }
            m81147w(this.f55930l, j, this.f55927i, this.f55929k);
            this.f55926h = 0;
            this.f55930l = j;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$c */
    public class C13551c implements grl<r1j> {

        /* JADX INFO: renamed from: a */
        public HashMap<String, C13552d> f55941a;

        public C13551c() {
            this.f55941a = new HashMap<>();
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: a */
        public void mo81150a(String str) {
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo81151b(r1j r1jVar, String str) {
            if (FpsMonitor.this.f113026e && r1jVar.f157281a <= FpsMonitor.this.f55931m.m157369e() && !TextUtils.isEmpty(str)) {
                C13552d c13552d = this.f55941a.get(str);
                if (c13552d == null) {
                    c13552d = FpsMonitor.this.new C13552d(str);
                    this.f55941a.put(str, c13552d);
                }
                c13552d.m81153a(r1jVar.f157281a);
                if (c13552d.f55944b >= FpsMonitor.this.f55931m.m157370f()) {
                    this.f55941a.remove(str);
                    c13552d.m81154b();
                    if (FpsMonitor.this.m135926o()) {
                        return;
                    }
                    this.f55941a.clear();
                }
            }
        }

        public /* synthetic */ C13551c(FpsMonitor fpsMonitor, RunnableC13549a runnableC13549a) {
            this();
        }
    }

    public /* synthetic */ FpsMonitor(RunnableC13549a runnableC13549a) {
        this();
    }
}

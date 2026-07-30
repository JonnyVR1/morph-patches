package com.tantanapp.beatles.fpsmonitor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p153l.f6m;
import p153l.i4j;
import p153l.ioi0;
import p153l.j4j;
import p153l.l4j;
import p153l.m4j;
import p153l.u21;
import p153l.uni0;
import p153l.utl;

/* JADX INFO: loaded from: classes11.dex */
public class FpsMonitor extends ioi0<m4j> implements ChoreographerFrameCallbackC13717a.a {

    /* JADX INFO: renamed from: h */
    public int f56774h;

    /* JADX INFO: renamed from: i */
    public int f56775i;

    /* JADX INFO: renamed from: j */
    public long f56776j;

    /* JADX INFO: renamed from: k */
    public String f56777k;

    /* JADX INFO: renamed from: l */
    public long f56778l;

    /* JADX INFO: renamed from: m */
    public i4j f56779m;

    /* JADX INFO: renamed from: n */
    public HashMap<String, utl> f56780n;

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
    public class RunnableC13712a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ utl f56781a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f56782b;

        public RunnableC13712a(utl utlVar, String str) {
            this.f56781a = utlVar;
            this.f56782b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56781a.mo82333a(this.f56782b);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$b */
    public static final class RunnableC13713b implements Runnable {

        /* JADX INFO: renamed from: a */
        public utl f56784a;

        /* JADX INFO: renamed from: b */
        public String f56785b;

        /* JADX INFO: renamed from: c */
        public int f56786c;

        /* JADX INFO: renamed from: d */
        public long f56787d;

        /* JADX INFO: renamed from: e */
        public long f56788e;

        public RunnableC13713b(utl utlVar, long j, long j2, String str, int i) {
            this.f56784a = utlVar;
            this.f56785b = str;
            this.f56786c = i;
            this.f56787d = j;
            this.f56788e = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56784a.mo82334b(new m4j(this.f56785b, this.f56786c), this.f56785b);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$d */
    public class C13715d {

        /* JADX INFO: renamed from: a */
        public String f56791a;

        /* JADX INFO: renamed from: b */
        public long f56792b;

        /* JADX INFO: renamed from: c */
        public int f56793c;

        /* JADX INFO: renamed from: d */
        public int f56794d;

        /* JADX INFO: renamed from: e */
        public int f56795e;

        /* JADX INFO: renamed from: f */
        public long f56796f;

        /* JADX INFO: renamed from: g */
        public long f56797g;

        /* JADX INFO: renamed from: h */
        public long f56798h;

        /* JADX INFO: renamed from: i */
        public int[] f56799i = new int[DropStatus.values().length];

        /* JADX INFO: renamed from: j */
        public int[] f56800j = new int[DropStatus.values().length];

        public C13715d(String str) {
            this.f56791a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m82336a(int i) {
            if (this.f56795e == 0) {
                this.f56797g = System.currentTimeMillis();
            }
            int i2 = 60 - i;
            this.f56792b += (((long) i2) * FpsMonitor.this.f56776j) / 1000000;
            this.f56793c += i2;
            this.f56795e++;
            this.f56794d += i;
            if (i2 >= FpsMonitor.this.f56779m.m138546c()) {
                int[] iArr = this.f56799i;
                int i3 = DropStatus.frozen.index;
                iArr[i3] = iArr[i3] + 1;
                int[] iArr2 = this.f56800j;
                iArr2[i3] = iArr2[i3] + i2;
                return;
            }
            int iM138547d = FpsMonitor.this.f56779m.m138547d();
            int[] iArr3 = this.f56799i;
            if (i2 >= iM138547d) {
                int i4 = DropStatus.high.index;
                iArr3[i4] = iArr3[i4] + 1;
                int[] iArr4 = this.f56800j;
                iArr4[i4] = iArr4[i4] + i2;
                return;
            }
            int i5 = DropStatus.middle.index;
            iArr3[i5] = iArr3[i5] + 1;
            int[] iArr5 = this.f56800j;
            iArr5[i5] = iArr5[i5] + i2;
        }

        /* JADX INFO: renamed from: b */
        public void m82337b() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f56798h = jCurrentTimeMillis;
                String str = this.f56791a;
                long j = this.f56797g;
                int[] iArr = this.f56799i;
                int i = DropStatus.frozen.index;
                int i2 = iArr[i];
                int[] iArr2 = this.f56800j;
                int i3 = iArr2[i];
                int i4 = DropStatus.high.index;
                int i5 = iArr[i4];
                int i6 = iArr2[i4];
                int i7 = DropStatus.middle.index;
                j4j j4jVar = new j4j(str, j, jCurrentTimeMillis, i2, i3, i5, i6, iArr[i7], iArr2[i7]);
                j4jVar.m121751a(FpsMonitor.this.mo82324j());
                FpsMonitor.this.m141317q(j4jVar);
            } catch (Throwable unused) {
            }
            this.f56796f = System.currentTimeMillis();
            this.f56793c = 0;
            this.f56792b = 0L;
            this.f56794d = 0;
            this.f56795e = 0;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$e */
    public static class C13716e {
        private static FpsMonitor INSTANCE = new FpsMonitor(null);
    }

    public FpsMonitor() {
        this.f56776j = 16666666L;
        this.f56778l = 0L;
        this.f56780n = new HashMap<>();
        this.f56779m = new i4j();
    }

    /* JADX INFO: renamed from: x */
    public static FpsMonitor m82314x() {
        return C13716e.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m82315A() {
        this.f56778l = 0L;
        this.f56774h = 0;
    }

    /* JADX INFO: renamed from: B */
    public void m82316B() {
        if (this.f56779m.mo112451a()) {
            mo82318b("collector");
        }
    }

    @Override // com.tantanapp.beatles.fpsmonitor.ChoreographerFrameCallbackC13717a.a
    /* JADX INFO: renamed from: a */
    public boolean mo82317a() {
        return this.f56780n.size() > 0;
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: b */
    public void mo82318b(String str) {
        if (this.f116165d) {
            utl utlVarRemove = this.f56780n.remove(str);
            if (utlVarRemove != null) {
                u21.m194238b(new RunnableC13712a(utlVarRemove, str));
            }
            if (this.f56780n.size() == 0) {
                ChoreographerFrameCallbackC13717a.m82339e().m82345k();
            }
        }
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: c */
    public long mo82319c() {
        return 0L;
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: d */
    public int mo82320d() {
        return 0;
    }

    @Override // com.tantanapp.beatles.fpsmonitor.ChoreographerFrameCallbackC13717a.a
    public void doFrame(long j) {
        if (this.f56780n.size() == 0) {
            return;
        }
        m82332z(j);
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: e */
    public long mo82321e() {
        return 0L;
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: h */
    public void mo82323h(String str, utl utlVar) {
        if (this.f116165d) {
            if (ChoreographerFrameCallbackC13717a.m82339e().m82342h()) {
                ChoreographerFrameCallbackC13717a.m82339e().m82344j();
            }
            if (this.f56780n.containsKey(str)) {
                return;
            }
            this.f56780n.put(str, utlVar);
        }
    }

    @Override // p153l.ioi0
    @NonNull
    /* JADX INFO: renamed from: j */
    public String mo82324j() {
        return "fps";
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: k */
    public f6m mo82325k() {
        return new l4j(mo82324j());
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: l */
    public uni0 mo82326l() {
        return this.f56779m;
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: m */
    public void mo82327m() {
        if (ChoreographerFrameCallbackC13717a.m82339e().m82341g()) {
            ChoreographerFrameCallbackC13717a.m82339e().m82343i(this);
            this.f116165d = true;
        }
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: p */
    public int mo82328p() {
        return 50;
    }

    @Override // com.tantanapp.beatles.fpsmonitor.ChoreographerFrameCallbackC13717a.a
    public void pause() {
        m82315A();
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: r */
    public void mo82329r() {
        if (m141316o()) {
            mo82323h("collector", new C13714c(this, null));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m82330w(long j, long j2, int i, String str) {
        for (Map.Entry<String, utl> entry : this.f56780n.entrySet()) {
            if (!entry.getKey().equals("collector")) {
                u21.m194238b(new RunnableC13713b(entry.getValue(), this.f56778l, j2, this.f56777k, this.f56775i));
            } else if (!"default".equals(this.f56777k)) {
                u21.m194238b(new RunnableC13713b(entry.getValue(), this.f56778l, j2, this.f56777k, this.f56775i));
            }
        }
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public m4j mo82322f() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final void m82332z(long j) {
        long j2 = this.f56778l;
        if (j2 == 0) {
            this.f56778l = j;
            this.f56774h = 0;
            return;
        }
        this.f56774h++;
        if ((j - j2) / 1000000 >= 1000) {
            float f = (j - j2) / 1000000.0f;
            this.f56777k = ChoreographerFrameCallbackC13717a.m82339e().m82340f();
            if (f >= 2000.0f) {
                int i = (int) ((f - 1000.0f) / 1000.0f);
                for (int i2 = 0; i2 < i; i2++) {
                    m82330w(this.f56778l, j, 0, this.f56777k);
                }
                f -= i * 1000;
            }
            int i3 = (int) ((this.f56774h * 1000) / f);
            this.f56774h = i3;
            this.f56775i = Math.min(60, i3);
            if (!this.f116166e) {
                m82316B();
            }
            m82330w(this.f56778l, j, this.f56775i, this.f56777k);
            this.f56774h = 0;
            this.f56778l = j;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.FpsMonitor$c */
    public class C13714c implements utl<m4j> {

        /* JADX INFO: renamed from: a */
        public HashMap<String, C13715d> f56789a;

        public C13714c() {
            this.f56789a = new HashMap<>();
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: a */
        public void mo82333a(String str) {
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo82334b(m4j m4jVar, String str) {
            if (FpsMonitor.this.f116166e && m4jVar.f134804a <= FpsMonitor.this.f56779m.m138548e() && !TextUtils.isEmpty(str)) {
                C13715d c13715d = this.f56789a.get(str);
                if (c13715d == null) {
                    c13715d = FpsMonitor.this.new C13715d(str);
                    this.f56789a.put(str, c13715d);
                }
                c13715d.m82336a(m4jVar.f134804a);
                if (c13715d.f56792b >= FpsMonitor.this.f56779m.m138549f()) {
                    this.f56789a.remove(str);
                    c13715d.m82337b();
                    if (FpsMonitor.this.m141316o()) {
                        return;
                    }
                    this.f56789a.clear();
                }
            }
        }

        public /* synthetic */ C13714c(FpsMonitor fpsMonitor, RunnableC13712a runnableC13712a) {
            this();
        }
    }

    public /* synthetic */ FpsMonitor(RunnableC13712a runnableC13712a) {
        this();
    }
}

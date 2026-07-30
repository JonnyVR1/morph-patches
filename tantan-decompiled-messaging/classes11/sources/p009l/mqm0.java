package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l.du2;
import l.e51;
import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mqm0 {

    /* JADX INFO: renamed from: e */
    public static mqm0 f17043e;

    /* JADX INFO: renamed from: a */
    public List<String> f17044a;

    /* JADX INFO: renamed from: b */
    public List<String> f17045b;

    /* JADX INFO: renamed from: c */
    public C1039b f17046c = null;

    /* JADX INFO: renamed from: d */
    public Runnable f17047d = new RunnableC1038a();

    /* JADX INFO: renamed from: l.mqm0$a */
    public class RunnableC1038a implements Runnable {
        public RunnableC1038a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mqm0 mqm0Var;
            C1039b c1039b;
            C1039b c1039b2 = mqm0.this.f17046c;
            if (c1039b2 != null) {
                synchronized (c1039b2) {
                    mqm0Var = mqm0.this;
                    c1039b = mqm0Var.f17046c;
                    mqm0Var.f17046c = null;
                }
                mqm0Var.m18574i(c1039b);
            }
        }
    }

    /* JADX INFO: renamed from: l.mqm0$b */
    public static class C1039b {

        /* JADX INFO: renamed from: a */
        public ArrayList<String> f17049a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f17050b = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public void m18577a(String str) {
            if (this.f17049a.size() < 1000) {
                this.f17049a.add(str);
                return;
            }
            this.f17050b.add(str);
            if (this.f17050b.size() >= 1000) {
                this.f17050b.remove(0);
            }
        }
    }

    public mqm0() {
        this.f17044a = null;
        this.f17045b = null;
        this.f17044a = new ArrayList();
        this.f17045b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18562a(C1039b c1039b) {
        if (c1039b != null) {
            StringBuilder sb = new StringBuilder("一次语音通话日志\nbegin log =============================\n");
            if (!vwb.J(c1039b.f17049a)) {
                c1039b.f17049a.size();
                Iterator<String> it = c1039b.f17049a.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("\n");
                }
            }
            sb.append("ebd log =============================\n");
            if (!vwb.J(c1039b.f17050b)) {
                c1039b.f17050b.size();
                Iterator<String> it2 = c1039b.f17050b.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append("\n");
                }
            }
            du2.a("voice_call", sb.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m18564g(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i != 3) {
            return;
        }
        zvf0.B("e_voice_call_finished", "", new j760[]{j760.a("other_user_id", str), j760.a("channel", str2)});
    }

    /* JADX INFO: renamed from: h */
    public static mqm0 m18565h() {
        if (f17043e == null) {
            synchronized (mqm0.class) {
                try {
                    if (f17043e == null) {
                        f17043e = new mqm0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17043e;
    }

    /* JADX INFO: renamed from: j */
    public static void m18566j(String str) {
        zvf0.B("e_voice_call_requested", "", new j760[]{j760.a("other_user_id", str)});
    }

    /* JADX INFO: renamed from: k */
    public static void m18567k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        zvf0.u("e_voice_call_click_finish", "p_chat_view", new j760[]{j760.a("other_user_id", str), j760.a("channel", str2)});
    }

    /* JADX INFO: renamed from: l */
    public static void m18568l() {
        String strM22647m = tqm0.m22637p().m22647m();
        String strM22644j = tqm0.m22637p().m22644j();
        if (TextUtils.isEmpty(strM22647m) || TextUtils.isEmpty(strM22644j)) {
            return;
        }
        zvf0.B("e_voice_call_no_audio", "", new j760[]{j760.a("other_user_id", strM22647m), j760.a("channel", strM22644j)});
    }

    /* JADX INFO: renamed from: n */
    public static void m18569n(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i2 != 3) {
            return;
        }
        if (i == 1 || i == 2) {
            zvf0.B("e_voice_call_connected", "", new j760[]{j760.a("other_user_id", str), j760.a("channel", str2)});
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m18570c(String str, String str2) {
        try {
            if (this.f17046c == null) {
                this.f17046c = new C1039b();
            }
            this.f17046c.m18577a(mqi0.f17030f.format(new Date(mqi0.m18550o())) + " detail:[" + mqi0.m18550o() + "]【" + str + "】:" + str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m18571d(String str, String str2) {
        m18570c("PushEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: e */
    public void m18572e(String str, String str2) {
        m18570c("UserEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: f */
    public void m18573f(String str, String str2) {
        m18570c("RtcEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: i */
    public final void m18574i(final C1039b c1039b) {
        e51.y(new Runnable() { // from class: l.lqm0
            @Override // java.lang.Runnable
            public final void run() {
                mqm0.m18562a(c1039b);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m18575m() {
        e51.J(this.f17047d);
        e51.H(CoreModule.b, this.f17047d, 1000L);
    }

    /* JADX INFO: renamed from: o */
    public void m18576o(String str) {
        m18572e("Click entry from", str);
    }
}

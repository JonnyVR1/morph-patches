package com.p000p1.mobile.putong.p004ui.download;

import android.text.TextUtils;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import l.e30;
import l.f30;
import l.ig3;
import l.k850;
import p009l.jll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DownloadTask {

    /* JADX INFO: renamed from: A */
    public f30<DownloadTask, Integer> f8049A;

    /* JADX INFO: renamed from: B */
    public f30<DownloadTask, Boolean> f8050B;

    /* JADX INFO: renamed from: C */
    public f30<DownloadTask, File> f8051C;

    /* JADX INFO: renamed from: D */
    public f30<DownloadTask, Throwable> f8052D;

    /* JADX INFO: renamed from: E */
    public ApiCallBack f8053E;

    /* JADX INFO: renamed from: F */
    public Map<String, String> f8054F;

    /* JADX INFO: renamed from: G */
    public boolean f8055G;

    /* JADX INFO: renamed from: a */
    public k850 f8056a;

    /* JADX INFO: renamed from: b */
    public long f8057b;

    /* JADX INFO: renamed from: c */
    public boolean f8058c;

    /* JADX INFO: renamed from: d */
    public boolean f8059d;

    /* JADX INFO: renamed from: e */
    public int f8060e;

    /* JADX INFO: renamed from: f */
    public long f8061f;

    /* JADX INFO: renamed from: g */
    public long f8062g;

    /* JADX INFO: renamed from: h */
    public long f8063h;

    /* JADX INFO: renamed from: i */
    public String f8064i;

    /* JADX INFO: renamed from: j */
    public int f8065j;

    /* JADX INFO: renamed from: k */
    public Throwable f8066k;

    /* JADX INFO: renamed from: l */
    public String f8067l;

    /* JADX INFO: renamed from: m */
    public long f8068m;

    /* JADX INFO: renamed from: n */
    public long f8069n;

    /* JADX INFO: renamed from: o */
    public long f8070o;

    /* JADX INFO: renamed from: p */
    public String f8071p;

    /* JADX INFO: renamed from: q */
    public int f8072q;

    /* JADX INFO: renamed from: r */
    public String f8073r;

    /* JADX INFO: renamed from: s */
    public String f8074s;

    /* JADX INFO: renamed from: t */
    public String f8075t;

    /* JADX INFO: renamed from: u */
    public int f8076u;

    /* JADX INFO: renamed from: v */
    public int f8077v;

    /* JADX INFO: renamed from: w */
    public State f8078w;

    /* JADX INFO: renamed from: x */
    public e30<DownloadTask> f8079x;

    /* JADX INFO: renamed from: y */
    public f30<DownloadTask, String> f8080y;

    /* JADX INFO: renamed from: z */
    public e30<DownloadTask> f8081z;

    public enum State {
        NORMAL,
        NEED_PAUSE,
        NEED_RESUME,
        PAUSED,
        CANCEL,
        FAIL,
        SUCCESS
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.download.DownloadTask$b */
    public static class C0512b {

        /* JADX INFO: renamed from: a */
        public final k850 f8082a;

        /* JADX INFO: renamed from: g */
        public boolean f8088g;

        /* JADX INFO: renamed from: l */
        public Map<String, String> f8093l;

        /* JADX INFO: renamed from: b */
        public String f8083b = null;

        /* JADX INFO: renamed from: c */
        public String f8084c = null;

        /* JADX INFO: renamed from: d */
        public String f8085d = null;

        /* JADX INFO: renamed from: e */
        public String f8086e = null;

        /* JADX INFO: renamed from: f */
        public File f8087f = null;

        /* JADX INFO: renamed from: h */
        public int f8089h = 8192;

        /* JADX INFO: renamed from: i */
        public int f8090i = 16;

        /* JADX INFO: renamed from: j */
        public int f8091j = 3;

        /* JADX INFO: renamed from: k */
        public boolean f8092k = false;

        /* JADX INFO: renamed from: m */
        public e30<DownloadTask> f8094m = null;

        /* JADX INFO: renamed from: n */
        public f30<DownloadTask, String> f8095n = null;

        /* JADX INFO: renamed from: o */
        public e30<DownloadTask> f8096o = null;

        /* JADX INFO: renamed from: p */
        public f30<DownloadTask, Integer> f8097p = null;

        /* JADX INFO: renamed from: q */
        public f30<DownloadTask, Boolean> f8098q = null;

        /* JADX INFO: renamed from: r */
        public f30<DownloadTask, File> f8099r = null;

        /* JADX INFO: renamed from: s */
        public f30<DownloadTask, Throwable> f8100s = null;

        /* JADX INFO: renamed from: t */
        public ApiCallBack f8101t = null;

        public C0512b(k850 k850Var) {
            this.f8082a = k850Var;
        }

        /* JADX INFO: renamed from: a */
        public DownloadTask m9947a() {
            File file;
            if (TextUtils.isEmpty(this.f8084c)) {
                ig3.a("mNetPath can't be null!");
                return null;
            }
            if (TextUtils.isEmpty(this.f8086e)) {
                File file2 = this.f8087f;
                if (file2 == null) {
                    ig3.a("mLocalPath can't be null!");
                    return null;
                }
                this.f8086e = file2.getAbsolutePath();
            }
            DownloadTask downloadTask = new DownloadTask();
            downloadTask.f8056a = this.f8082a;
            downloadTask.f8073r = this.f8084c;
            downloadTask.f8075t = this.f8086e;
            downloadTask.f8074s = this.f8085d;
            boolean z = this.f8088g;
            downloadTask.f8058c = z;
            downloadTask.f8059d = z;
            downloadTask.f8076u = this.f8089h;
            downloadTask.f8077v = this.f8090i;
            downloadTask.f8054F = this.f8093l;
            downloadTask.f8055G = this.f8092k;
            downloadTask.f8072q = this.f8091j;
            if (this.f8088g && (file = this.f8087f) != null && file.exists()) {
                downloadTask.f8062g = this.f8087f.length();
            }
            downloadTask.f8079x = this.f8094m;
            downloadTask.f8080y = this.f8095n;
            downloadTask.f8081z = this.f8096o;
            downloadTask.f8049A = this.f8097p;
            downloadTask.f8051C = this.f8099r;
            downloadTask.f8052D = this.f8100s;
            downloadTask.f8050B = this.f8098q;
            downloadTask.f8053E = this.f8101t;
            return downloadTask;
        }

        /* JADX INFO: renamed from: b */
        public final String m9948b(String str) {
            try {
                String str2 = this.f8083b;
                return str.replace(str2, URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.c(e);
                return str;
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m9949c(String str) {
            try {
                String file = new URL(str).getFile();
                String strSubstring = file.substring(file.lastIndexOf(47) + 1);
                this.f8083b = strSubstring;
                return strSubstring.toLowerCase().endsWith(".apk");
            } catch (MalformedURLException e) {
                CrashHelper.c(e);
                return false;
            }
        }

        /* JADX INFO: renamed from: d */
        public C0512b m9950d(e30<DownloadTask> e30Var) {
            this.f8096o = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0512b m9951e(f30<DownloadTask, String> f30Var) {
            this.f8095n = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0512b m9952f(f30<DownloadTask, Throwable> f30Var) {
            this.f8100s = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0512b m9953g(f30<DownloadTask, Integer> f30Var) {
            this.f8097p = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0512b m9954h(f30<DownloadTask, Boolean> f30Var) {
            this.f8098q = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0512b m9955i(e30<DownloadTask> e30Var) {
            this.f8094m = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0512b m9956j(f30<DownloadTask, File> f30Var) {
            this.f8099r = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0512b m9957k(ApiCallBack apiCallBack) {
            this.f8101t = apiCallBack;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C0512b m9958l(int i) {
            this.f8089h = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0512b m9959m(Map<String, String> map) {
            this.f8093l = map;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C0512b m9960n(File file) {
            if (TextUtils.isEmpty(this.f8086e)) {
                this.f8087f = file;
                return this;
            }
            ig3.a("localPath and localFile can't be set at the same time!");
            return null;
        }

        /* JADX INFO: renamed from: o */
        public C0512b m9961o(String str) {
            if (this.f8087f == null) {
                this.f8086e = str;
                return this;
            }
            ig3.a("localPath and localFile can't be set at the same time!");
            return null;
        }

        /* JADX INFO: renamed from: p */
        public C0512b m9962p(int i) {
            this.f8091j = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0512b m9963q(String str) {
            if (m9949c(str)) {
                this.f8084c = m9948b(str);
            } else {
                this.f8084c = str;
            }
            this.f8085d = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0512b m9964r(boolean z) {
            this.f8092k = z;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0512b m9965s(int i) {
            this.f8090i = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0512b m9966t(boolean z) {
            this.f8088g = z;
            return this;
        }
    }

    public DownloadTask() {
        this.f8057b = 0L;
        this.f8060e = -1;
        this.f8061f = 0L;
        this.f8062g = 0L;
        this.f8063h = 0L;
        this.f8064i = "";
        this.f8065j = 0;
        this.f8067l = "";
        this.f8068m = 0L;
        this.f8069n = 0L;
        this.f8070o = 0L;
        this.f8071p = "";
        this.f8073r = null;
        this.f8074s = null;
        this.f8075t = null;
        this.f8078w = State.NORMAL;
        this.f8079x = null;
        this.f8080y = null;
        this.f8081z = null;
        this.f8049A = null;
        this.f8050B = null;
        this.f8051C = null;
        this.f8052D = null;
        this.f8055G = false;
    }

    /* JADX INFO: renamed from: A */
    public boolean m9917A() {
        return this.f8078w == State.FAIL;
    }

    /* JADX INFO: renamed from: B */
    public boolean m9918B() {
        return this.f8078w == State.NEED_PAUSE;
    }

    /* JADX INFO: renamed from: C */
    public boolean m9919C() {
        return this.f8078w == State.NEED_RESUME;
    }

    /* JADX INFO: renamed from: D */
    public boolean m9920D() {
        return this.f8078w == State.PAUSED;
    }

    /* JADX INFO: renamed from: E */
    public boolean m9921E() {
        return this.f8055G;
    }

    /* JADX INFO: renamed from: F */
    public boolean m9922F() {
        return this.f8078w == State.SUCCESS;
    }

    /* JADX INFO: renamed from: G */
    public void m9923G() {
        if (this.f8078w != State.CANCEL) {
            this.f8078w = State.NEED_PAUSE;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m9924H() {
        if (this.f8078w == State.PAUSED) {
            this.f8078w = State.NEED_RESUME;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m9925I() {
        this.f8078w = State.CANCEL;
        e30<DownloadTask> e30Var = this.f8081z;
        if (e30Var != null) {
            e30Var.call(this);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m9926J(String str) {
        f30<DownloadTask, String> f30Var = this.f8080y;
        if (f30Var != null) {
            f30Var.call(this, str);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m9927K() {
        this.f8079x = null;
        this.f8080y = null;
        this.f8081z = null;
        this.f8049A = null;
        this.f8050B = null;
        this.f8051C = null;
        this.f8052D = null;
    }

    /* JADX INFO: renamed from: L */
    public void m9928L(Throwable th) {
        this.f8078w = State.FAIL;
        f30<DownloadTask, Throwable> f30Var = this.f8052D;
        if (f30Var != null) {
            f30Var.call(this, th);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m9929M(int i) {
        f30<DownloadTask, Integer> f30Var = this.f8049A;
        if (f30Var != null) {
            f30Var.call(this, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m9930N(Boolean bool) {
        if (this.f8078w != State.CANCEL) {
            if (bool.booleanValue()) {
                this.f8078w = State.PAUSED;
            } else {
                this.f8078w = State.NORMAL;
            }
            f30<DownloadTask, Boolean> f30Var = this.f8050B;
            if (f30Var != null) {
                f30Var.call(this, bool);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m9931O() {
        e30<DownloadTask> e30Var = this.f8079x;
        if (e30Var != null) {
            e30Var.call(this);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m9932P(File file) {
        this.f8078w = State.SUCCESS;
        f30<DownloadTask, File> f30Var = this.f8051C;
        if (f30Var != null) {
            f30Var.call(this, file);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m9933Q() {
        State state;
        while (this.f8072q > 0 && (state = this.f8078w) != State.CANCEL && state != State.PAUSED) {
            jll.m17154c(this);
        }
    }

    /* JADX INFO: renamed from: R */
    public DownloadTask m9934R(boolean z) {
        this.f8055G = z;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m9935S() {
        int iM9945y;
        if (this.f8061f <= 0 || this.f8062g < 0) {
            return;
        }
        if ((this.f8057b == 0 || Math.abs(System.currentTimeMillis() - this.f8057b) > this.f8077v) && this.f8060e != (iM9945y = m9945y())) {
            this.f8057b = System.currentTimeMillis();
            m9929M(iM9945y);
            this.f8060e = iM9945y;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9936p() {
        State state = this.f8078w;
        State state2 = State.CANCEL;
        if (state != state2) {
            this.f8078w = state2;
            m9925I();
            m9927K();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m9937q() throws InterruptedException {
        int iAbs;
        if (!C0513a.m9975u().m9994x(hashCode()) || (iAbs = 200 - Math.abs((int) (System.currentTimeMillis() - this.f8057b))) <= 0) {
            return;
        }
        Thread.sleep(iAbs);
    }

    /* JADX INFO: renamed from: r */
    public ApiCallBack m9938r() {
        return this.f8053E;
    }

    /* JADX INFO: renamed from: s */
    public int m9939s() {
        return this.f8076u;
    }

    /* JADX INFO: renamed from: t */
    public long m9940t() {
        return this.f8068m;
    }

    /* JADX INFO: renamed from: u */
    public Map<String, String> m9941u() {
        return this.f8054F;
    }

    /* JADX INFO: renamed from: v */
    public String m9942v() {
        return this.f8075t;
    }

    /* JADX INFO: renamed from: w */
    public String m9943w() {
        return this.f8073r;
    }

    /* JADX INFO: renamed from: x */
    public String m9944x() {
        return this.f8074s;
    }

    /* JADX INFO: renamed from: y */
    public int m9945y() {
        int iRound;
        long j = this.f8061f;
        if (j <= 0 || (iRound = Math.round(((this.f8062g * 1.0f) * 100.0f) / j)) < 0) {
            return 0;
        }
        if (iRound > 100) {
            return 100;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: z */
    public boolean m9946z() {
        return this.f8078w == State.CANCEL;
    }
}

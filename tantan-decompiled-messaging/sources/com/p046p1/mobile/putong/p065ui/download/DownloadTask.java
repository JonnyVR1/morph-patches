package com.p046p1.mobile.putong.p065ui.download;

import android.text.TextUtils;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import p149l.e30;
import p149l.f30;
import p149l.ig3;
import p149l.jll;
import p149l.k850;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadTask {

    /* JADX INFO: renamed from: A */
    public f30<DownloadTask, Integer> f54443A;

    /* JADX INFO: renamed from: B */
    public f30<DownloadTask, Boolean> f54444B;

    /* JADX INFO: renamed from: C */
    public f30<DownloadTask, File> f54445C;

    /* JADX INFO: renamed from: D */
    public f30<DownloadTask, Throwable> f54446D;

    /* JADX INFO: renamed from: E */
    public ApiCallBack f54447E;

    /* JADX INFO: renamed from: F */
    public Map<String, String> f54448F;

    /* JADX INFO: renamed from: G */
    public boolean f54449G;

    /* JADX INFO: renamed from: a */
    public k850 f54450a;

    /* JADX INFO: renamed from: b */
    public long f54451b;

    /* JADX INFO: renamed from: c */
    public boolean f54452c;

    /* JADX INFO: renamed from: d */
    public boolean f54453d;

    /* JADX INFO: renamed from: e */
    public int f54454e;

    /* JADX INFO: renamed from: f */
    public long f54455f;

    /* JADX INFO: renamed from: g */
    public long f54456g;

    /* JADX INFO: renamed from: h */
    public long f54457h;

    /* JADX INFO: renamed from: i */
    public String f54458i;

    /* JADX INFO: renamed from: j */
    public int f54459j;

    /* JADX INFO: renamed from: k */
    public Throwable f54460k;

    /* JADX INFO: renamed from: l */
    public String f54461l;

    /* JADX INFO: renamed from: m */
    public long f54462m;

    /* JADX INFO: renamed from: n */
    public long f54463n;

    /* JADX INFO: renamed from: o */
    public long f54464o;

    /* JADX INFO: renamed from: p */
    public String f54465p;

    /* JADX INFO: renamed from: q */
    public int f54466q;

    /* JADX INFO: renamed from: r */
    public String f54467r;

    /* JADX INFO: renamed from: s */
    public String f54468s;

    /* JADX INFO: renamed from: t */
    public String f54469t;

    /* JADX INFO: renamed from: u */
    public int f54470u;

    /* JADX INFO: renamed from: v */
    public int f54471v;

    /* JADX INFO: renamed from: w */
    public State f54472w;

    /* JADX INFO: renamed from: x */
    public e30<DownloadTask> f54473x;

    /* JADX INFO: renamed from: y */
    public f30<DownloadTask, String> f54474y;

    /* JADX INFO: renamed from: z */
    public e30<DownloadTask> f54475z;

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
    public static class C13110b {

        /* JADX INFO: renamed from: a */
        public final k850 f54476a;

        /* JADX INFO: renamed from: g */
        public boolean f54482g;

        /* JADX INFO: renamed from: l */
        public Map<String, String> f54487l;

        /* JADX INFO: renamed from: b */
        public String f54477b = null;

        /* JADX INFO: renamed from: c */
        public String f54478c = null;

        /* JADX INFO: renamed from: d */
        public String f54479d = null;

        /* JADX INFO: renamed from: e */
        public String f54480e = null;

        /* JADX INFO: renamed from: f */
        public File f54481f = null;

        /* JADX INFO: renamed from: h */
        public int f54483h = 8192;

        /* JADX INFO: renamed from: i */
        public int f54484i = 16;

        /* JADX INFO: renamed from: j */
        public int f54485j = 3;

        /* JADX INFO: renamed from: k */
        public boolean f54486k = false;

        /* JADX INFO: renamed from: m */
        public e30<DownloadTask> f54488m = null;

        /* JADX INFO: renamed from: n */
        public f30<DownloadTask, String> f54489n = null;

        /* JADX INFO: renamed from: o */
        public e30<DownloadTask> f54490o = null;

        /* JADX INFO: renamed from: p */
        public f30<DownloadTask, Integer> f54491p = null;

        /* JADX INFO: renamed from: q */
        public f30<DownloadTask, Boolean> f54492q = null;

        /* JADX INFO: renamed from: r */
        public f30<DownloadTask, File> f54493r = null;

        /* JADX INFO: renamed from: s */
        public f30<DownloadTask, Throwable> f54494s = null;

        /* JADX INFO: renamed from: t */
        public ApiCallBack f54495t = null;

        public C13110b(k850 k850Var) {
            this.f54476a = k850Var;
        }

        /* JADX INFO: renamed from: a */
        public DownloadTask m79626a() {
            File file;
            if (TextUtils.isEmpty(this.f54478c)) {
                ig3.m135964a("mNetPath can't be null!");
                return null;
            }
            if (TextUtils.isEmpty(this.f54480e)) {
                File file2 = this.f54481f;
                if (file2 == null) {
                    ig3.m135964a("mLocalPath can't be null!");
                    return null;
                }
                this.f54480e = file2.getAbsolutePath();
            }
            DownloadTask downloadTask = new DownloadTask();
            downloadTask.f54450a = this.f54476a;
            downloadTask.f54467r = this.f54478c;
            downloadTask.f54469t = this.f54480e;
            downloadTask.f54468s = this.f54479d;
            boolean z = this.f54482g;
            downloadTask.f54452c = z;
            downloadTask.f54453d = z;
            downloadTask.f54470u = this.f54483h;
            downloadTask.f54471v = this.f54484i;
            downloadTask.f54448F = this.f54487l;
            downloadTask.f54449G = this.f54486k;
            downloadTask.f54466q = this.f54485j;
            if (this.f54482g && (file = this.f54481f) != null && file.exists()) {
                downloadTask.f54456g = this.f54481f.length();
            }
            downloadTask.f54473x = this.f54488m;
            downloadTask.f54474y = this.f54489n;
            downloadTask.f54475z = this.f54490o;
            downloadTask.f54443A = this.f54491p;
            downloadTask.f54445C = this.f54493r;
            downloadTask.f54446D = this.f54494s;
            downloadTask.f54444B = this.f54492q;
            downloadTask.f54447E = this.f54495t;
            return downloadTask;
        }

        /* JADX INFO: renamed from: b */
        public final String m79627b(String str) {
            try {
                String str2 = this.f54477b;
                return str.replace(str2, URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m81296c(e);
                return str;
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m79628c(String str) {
            try {
                String file = new URL(str).getFile();
                String strSubstring = file.substring(file.lastIndexOf(47) + 1);
                this.f54477b = strSubstring;
                return strSubstring.toLowerCase().endsWith(ShareConstants.PATCH_SUFFIX);
            } catch (MalformedURLException e) {
                CrashHelper.m81296c(e);
                return false;
            }
        }

        /* JADX INFO: renamed from: d */
        public C13110b m79629d(e30<DownloadTask> e30Var) {
            this.f54490o = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C13110b m79630e(f30<DownloadTask, String> f30Var) {
            this.f54489n = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C13110b m79631f(f30<DownloadTask, Throwable> f30Var) {
            this.f54494s = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C13110b m79632g(f30<DownloadTask, Integer> f30Var) {
            this.f54491p = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C13110b m79633h(f30<DownloadTask, Boolean> f30Var) {
            this.f54492q = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C13110b m79634i(e30<DownloadTask> e30Var) {
            this.f54488m = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C13110b m79635j(f30<DownloadTask, File> f30Var) {
            this.f54493r = f30Var;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C13110b m79636k(ApiCallBack apiCallBack) {
            this.f54495t = apiCallBack;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C13110b m79637l(int i) {
            this.f54483h = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C13110b m79638m(Map<String, String> map) {
            this.f54487l = map;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C13110b m79639n(File file) {
            if (TextUtils.isEmpty(this.f54480e)) {
                this.f54481f = file;
                return this;
            }
            ig3.m135964a("localPath and localFile can't be set at the same time!");
            return null;
        }

        /* JADX INFO: renamed from: o */
        public C13110b m79640o(String str) {
            if (this.f54481f == null) {
                this.f54480e = str;
                return this;
            }
            ig3.m135964a("localPath and localFile can't be set at the same time!");
            return null;
        }

        /* JADX INFO: renamed from: p */
        public C13110b m79641p(int i) {
            this.f54485j = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C13110b m79642q(String str) {
            if (m79628c(str)) {
                this.f54478c = m79627b(str);
            } else {
                this.f54478c = str;
            }
            this.f54479d = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C13110b m79643r(boolean z) {
            this.f54486k = z;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C13110b m79644s(int i) {
            this.f54484i = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C13110b m79645t(boolean z) {
            this.f54482g = z;
            return this;
        }
    }

    public DownloadTask() {
        this.f54451b = 0L;
        this.f54454e = -1;
        this.f54455f = 0L;
        this.f54456g = 0L;
        this.f54457h = 0L;
        this.f54458i = "";
        this.f54459j = 0;
        this.f54461l = "";
        this.f54462m = 0L;
        this.f54463n = 0L;
        this.f54464o = 0L;
        this.f54465p = "";
        this.f54467r = null;
        this.f54468s = null;
        this.f54469t = null;
        this.f54472w = State.NORMAL;
        this.f54473x = null;
        this.f54474y = null;
        this.f54475z = null;
        this.f54443A = null;
        this.f54444B = null;
        this.f54445C = null;
        this.f54446D = null;
        this.f54449G = false;
    }

    /* JADX INFO: renamed from: A */
    public boolean m79596A() {
        return this.f54472w == State.FAIL;
    }

    /* JADX INFO: renamed from: B */
    public boolean m79597B() {
        return this.f54472w == State.NEED_PAUSE;
    }

    /* JADX INFO: renamed from: C */
    public boolean m79598C() {
        return this.f54472w == State.NEED_RESUME;
    }

    /* JADX INFO: renamed from: D */
    public boolean m79599D() {
        return this.f54472w == State.PAUSED;
    }

    /* JADX INFO: renamed from: E */
    public boolean m79600E() {
        return this.f54449G;
    }

    /* JADX INFO: renamed from: F */
    public boolean m79601F() {
        return this.f54472w == State.SUCCESS;
    }

    /* JADX INFO: renamed from: G */
    public void m79602G() {
        if (this.f54472w != State.CANCEL) {
            this.f54472w = State.NEED_PAUSE;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m79603H() {
        if (this.f54472w == State.PAUSED) {
            this.f54472w = State.NEED_RESUME;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m79604I() {
        this.f54472w = State.CANCEL;
        e30<DownloadTask> e30Var = this.f54475z;
        if (e30Var != null) {
            e30Var.call(this);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m79605J(String str) {
        f30<DownloadTask, String> f30Var = this.f54474y;
        if (f30Var != null) {
            f30Var.call(this, str);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m79606K() {
        this.f54473x = null;
        this.f54474y = null;
        this.f54475z = null;
        this.f54443A = null;
        this.f54444B = null;
        this.f54445C = null;
        this.f54446D = null;
    }

    /* JADX INFO: renamed from: L */
    public void m79607L(Throwable th) {
        this.f54472w = State.FAIL;
        f30<DownloadTask, Throwable> f30Var = this.f54446D;
        if (f30Var != null) {
            f30Var.call(this, th);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m79608M(int i) {
        f30<DownloadTask, Integer> f30Var = this.f54443A;
        if (f30Var != null) {
            f30Var.call(this, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m79609N(Boolean bool) {
        if (this.f54472w != State.CANCEL) {
            if (bool.booleanValue()) {
                this.f54472w = State.PAUSED;
            } else {
                this.f54472w = State.NORMAL;
            }
            f30<DownloadTask, Boolean> f30Var = this.f54444B;
            if (f30Var != null) {
                f30Var.call(this, bool);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m79610O() {
        e30<DownloadTask> e30Var = this.f54473x;
        if (e30Var != null) {
            e30Var.call(this);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m79611P(File file) {
        this.f54472w = State.SUCCESS;
        f30<DownloadTask, File> f30Var = this.f54445C;
        if (f30Var != null) {
            f30Var.call(this, file);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m79612Q() {
        State state;
        while (this.f54466q > 0 && (state = this.f54472w) != State.CANCEL && state != State.PAUSED) {
            jll.m142097c(this);
        }
    }

    /* JADX INFO: renamed from: R */
    public DownloadTask m79613R(boolean z) {
        this.f54449G = z;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m79614S() {
        int iM79624y;
        if (this.f54455f <= 0 || this.f54456g < 0) {
            return;
        }
        if ((this.f54451b == 0 || Math.abs(System.currentTimeMillis() - this.f54451b) > this.f54471v) && this.f54454e != (iM79624y = m79624y())) {
            this.f54451b = System.currentTimeMillis();
            m79608M(iM79624y);
            this.f54454e = iM79624y;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m79615p() {
        State state = this.f54472w;
        State state2 = State.CANCEL;
        if (state != state2) {
            this.f54472w = state2;
            m79604I();
            m79606K();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m79616q() throws InterruptedException {
        int iAbs;
        if (!C13111a.m79654u().m79673x(hashCode()) || (iAbs = 200 - Math.abs((int) (System.currentTimeMillis() - this.f54451b))) <= 0) {
            return;
        }
        Thread.sleep(iAbs);
    }

    /* JADX INFO: renamed from: r */
    public ApiCallBack m79617r() {
        return this.f54447E;
    }

    /* JADX INFO: renamed from: s */
    public int m79618s() {
        return this.f54470u;
    }

    /* JADX INFO: renamed from: t */
    public long m79619t() {
        return this.f54462m;
    }

    /* JADX INFO: renamed from: u */
    public Map<String, String> m79620u() {
        return this.f54448F;
    }

    /* JADX INFO: renamed from: v */
    public String m79621v() {
        return this.f54469t;
    }

    /* JADX INFO: renamed from: w */
    public String m79622w() {
        return this.f54467r;
    }

    /* JADX INFO: renamed from: x */
    public String m79623x() {
        return this.f54468s;
    }

    /* JADX INFO: renamed from: y */
    public int m79624y() {
        int iRound;
        long j = this.f54455f;
        if (j <= 0 || (iRound = Math.round(((this.f54456g * 1.0f) * 100.0f) / j)) < 0) {
            return 0;
        }
        if (iRound > 100) {
            return 100;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: z */
    public boolean m79625z() {
        return this.f54472w == State.CANCEL;
    }
}

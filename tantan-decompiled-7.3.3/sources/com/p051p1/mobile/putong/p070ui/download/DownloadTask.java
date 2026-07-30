package com.p051p1.mobile.putong.p070ui.download;

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
import p153l.rg50;
import p153l.wg3;
import p153l.y20;
import p153l.ynl;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class DownloadTask {

    /* JADX INFO: renamed from: A */
    public z20<DownloadTask, Integer> f55291A;

    /* JADX INFO: renamed from: B */
    public z20<DownloadTask, Boolean> f55292B;

    /* JADX INFO: renamed from: C */
    public z20<DownloadTask, File> f55293C;

    /* JADX INFO: renamed from: D */
    public z20<DownloadTask, Throwable> f55294D;

    /* JADX INFO: renamed from: E */
    public ApiCallBack f55295E;

    /* JADX INFO: renamed from: F */
    public Map<String, String> f55296F;

    /* JADX INFO: renamed from: G */
    public boolean f55297G;

    /* JADX INFO: renamed from: a */
    public rg50 f55298a;

    /* JADX INFO: renamed from: b */
    public long f55299b;

    /* JADX INFO: renamed from: c */
    public boolean f55300c;

    /* JADX INFO: renamed from: d */
    public boolean f55301d;

    /* JADX INFO: renamed from: e */
    public int f55302e;

    /* JADX INFO: renamed from: f */
    public long f55303f;

    /* JADX INFO: renamed from: g */
    public long f55304g;

    /* JADX INFO: renamed from: h */
    public long f55305h;

    /* JADX INFO: renamed from: i */
    public String f55306i;

    /* JADX INFO: renamed from: j */
    public int f55307j;

    /* JADX INFO: renamed from: k */
    public Throwable f55308k;

    /* JADX INFO: renamed from: l */
    public String f55309l;

    /* JADX INFO: renamed from: m */
    public long f55310m;

    /* JADX INFO: renamed from: n */
    public long f55311n;

    /* JADX INFO: renamed from: o */
    public long f55312o;

    /* JADX INFO: renamed from: p */
    public String f55313p;

    /* JADX INFO: renamed from: q */
    public int f55314q;

    /* JADX INFO: renamed from: r */
    public String f55315r;

    /* JADX INFO: renamed from: s */
    public String f55316s;

    /* JADX INFO: renamed from: t */
    public String f55317t;

    /* JADX INFO: renamed from: u */
    public int f55318u;

    /* JADX INFO: renamed from: v */
    public int f55319v;

    /* JADX INFO: renamed from: w */
    public State f55320w;

    /* JADX INFO: renamed from: x */
    public y20<DownloadTask> f55321x;

    /* JADX INFO: renamed from: y */
    public z20<DownloadTask, String> f55322y;

    /* JADX INFO: renamed from: z */
    public y20<DownloadTask> f55323z;

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
    public static class C13273b {

        /* JADX INFO: renamed from: a */
        public final rg50 f55324a;

        /* JADX INFO: renamed from: g */
        public boolean f55330g;

        /* JADX INFO: renamed from: l */
        public Map<String, String> f55335l;

        /* JADX INFO: renamed from: b */
        public String f55325b = null;

        /* JADX INFO: renamed from: c */
        public String f55326c = null;

        /* JADX INFO: renamed from: d */
        public String f55327d = null;

        /* JADX INFO: renamed from: e */
        public String f55328e = null;

        /* JADX INFO: renamed from: f */
        public File f55329f = null;

        /* JADX INFO: renamed from: h */
        public int f55331h = 8192;

        /* JADX INFO: renamed from: i */
        public int f55332i = 16;

        /* JADX INFO: renamed from: j */
        public int f55333j = 3;

        /* JADX INFO: renamed from: k */
        public boolean f55334k = false;

        /* JADX INFO: renamed from: m */
        public y20<DownloadTask> f55336m = null;

        /* JADX INFO: renamed from: n */
        public z20<DownloadTask, String> f55337n = null;

        /* JADX INFO: renamed from: o */
        public y20<DownloadTask> f55338o = null;

        /* JADX INFO: renamed from: p */
        public z20<DownloadTask, Integer> f55339p = null;

        /* JADX INFO: renamed from: q */
        public z20<DownloadTask, Boolean> f55340q = null;

        /* JADX INFO: renamed from: r */
        public z20<DownloadTask, File> f55341r = null;

        /* JADX INFO: renamed from: s */
        public z20<DownloadTask, Throwable> f55342s = null;

        /* JADX INFO: renamed from: t */
        public ApiCallBack f55343t = null;

        public C13273b(rg50 rg50Var) {
            this.f55324a = rg50Var;
        }

        /* JADX INFO: renamed from: a */
        public DownloadTask m80809a() {
            File file;
            if (TextUtils.isEmpty(this.f55326c)) {
                wg3.m206174a("mNetPath can't be null!");
                return null;
            }
            if (TextUtils.isEmpty(this.f55328e)) {
                File file2 = this.f55329f;
                if (file2 == null) {
                    wg3.m206174a("mLocalPath can't be null!");
                    return null;
                }
                this.f55328e = file2.getAbsolutePath();
            }
            DownloadTask downloadTask = new DownloadTask();
            downloadTask.f55298a = this.f55324a;
            downloadTask.f55315r = this.f55326c;
            downloadTask.f55317t = this.f55328e;
            downloadTask.f55316s = this.f55327d;
            boolean z = this.f55330g;
            downloadTask.f55300c = z;
            downloadTask.f55301d = z;
            downloadTask.f55318u = this.f55331h;
            downloadTask.f55319v = this.f55332i;
            downloadTask.f55296F = this.f55335l;
            downloadTask.f55297G = this.f55334k;
            downloadTask.f55314q = this.f55333j;
            if (this.f55330g && (file = this.f55329f) != null && file.exists()) {
                downloadTask.f55304g = this.f55329f.length();
            }
            downloadTask.f55321x = this.f55336m;
            downloadTask.f55322y = this.f55337n;
            downloadTask.f55323z = this.f55338o;
            downloadTask.f55291A = this.f55339p;
            downloadTask.f55293C = this.f55341r;
            downloadTask.f55294D = this.f55342s;
            downloadTask.f55292B = this.f55340q;
            downloadTask.f55295E = this.f55343t;
            return downloadTask;
        }

        /* JADX INFO: renamed from: b */
        public final String m80810b(String str) {
            try {
                String str2 = this.f55325b;
                return str.replace(str2, URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m82479c(e);
                return str;
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m80811c(String str) {
            try {
                String file = new URL(str).getFile();
                String strSubstring = file.substring(file.lastIndexOf(47) + 1);
                this.f55325b = strSubstring;
                return strSubstring.toLowerCase().endsWith(ShareConstants.PATCH_SUFFIX);
            } catch (MalformedURLException e) {
                CrashHelper.m82479c(e);
                return false;
            }
        }

        /* JADX INFO: renamed from: d */
        public C13273b m80812d(y20<DownloadTask> y20Var) {
            this.f55338o = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C13273b m80813e(z20<DownloadTask, String> z20Var) {
            this.f55337n = z20Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C13273b m80814f(z20<DownloadTask, Throwable> z20Var) {
            this.f55342s = z20Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C13273b m80815g(z20<DownloadTask, Integer> z20Var) {
            this.f55339p = z20Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C13273b m80816h(z20<DownloadTask, Boolean> z20Var) {
            this.f55340q = z20Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C13273b m80817i(y20<DownloadTask> y20Var) {
            this.f55336m = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C13273b m80818j(z20<DownloadTask, File> z20Var) {
            this.f55341r = z20Var;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C13273b m80819k(ApiCallBack apiCallBack) {
            this.f55343t = apiCallBack;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C13273b m80820l(int i) {
            this.f55331h = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C13273b m80821m(Map<String, String> map) {
            this.f55335l = map;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C13273b m80822n(File file) {
            if (TextUtils.isEmpty(this.f55328e)) {
                this.f55329f = file;
                return this;
            }
            wg3.m206174a("localPath and localFile can't be set at the same time!");
            return null;
        }

        /* JADX INFO: renamed from: o */
        public C13273b m80823o(String str) {
            if (this.f55329f == null) {
                this.f55328e = str;
                return this;
            }
            wg3.m206174a("localPath and localFile can't be set at the same time!");
            return null;
        }

        /* JADX INFO: renamed from: p */
        public C13273b m80824p(int i) {
            this.f55333j = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C13273b m80825q(String str) {
            if (m80811c(str)) {
                this.f55326c = m80810b(str);
            } else {
                this.f55326c = str;
            }
            this.f55327d = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C13273b m80826r(boolean z) {
            this.f55334k = z;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C13273b m80827s(int i) {
            this.f55332i = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C13273b m80828t(boolean z) {
            this.f55330g = z;
            return this;
        }
    }

    public DownloadTask() {
        this.f55299b = 0L;
        this.f55302e = -1;
        this.f55303f = 0L;
        this.f55304g = 0L;
        this.f55305h = 0L;
        this.f55306i = "";
        this.f55307j = 0;
        this.f55309l = "";
        this.f55310m = 0L;
        this.f55311n = 0L;
        this.f55312o = 0L;
        this.f55313p = "";
        this.f55315r = null;
        this.f55316s = null;
        this.f55317t = null;
        this.f55320w = State.NORMAL;
        this.f55321x = null;
        this.f55322y = null;
        this.f55323z = null;
        this.f55291A = null;
        this.f55292B = null;
        this.f55293C = null;
        this.f55294D = null;
        this.f55297G = false;
    }

    /* JADX INFO: renamed from: A */
    public boolean m80779A() {
        return this.f55320w == State.FAIL;
    }

    /* JADX INFO: renamed from: B */
    public boolean m80780B() {
        return this.f55320w == State.NEED_PAUSE;
    }

    /* JADX INFO: renamed from: C */
    public boolean m80781C() {
        return this.f55320w == State.NEED_RESUME;
    }

    /* JADX INFO: renamed from: D */
    public boolean m80782D() {
        return this.f55320w == State.PAUSED;
    }

    /* JADX INFO: renamed from: E */
    public boolean m80783E() {
        return this.f55297G;
    }

    /* JADX INFO: renamed from: F */
    public boolean m80784F() {
        return this.f55320w == State.SUCCESS;
    }

    /* JADX INFO: renamed from: G */
    public void m80785G() {
        if (this.f55320w != State.CANCEL) {
            this.f55320w = State.NEED_PAUSE;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m80786H() {
        if (this.f55320w == State.PAUSED) {
            this.f55320w = State.NEED_RESUME;
        }
    }

    /* JADX INFO: renamed from: I */
    public void m80787I() {
        this.f55320w = State.CANCEL;
        y20<DownloadTask> y20Var = this.f55323z;
        if (y20Var != null) {
            y20Var.call(this);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m80788J(String str) {
        z20<DownloadTask, String> z20Var = this.f55322y;
        if (z20Var != null) {
            z20Var.call(this, str);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m80789K() {
        this.f55321x = null;
        this.f55322y = null;
        this.f55323z = null;
        this.f55291A = null;
        this.f55292B = null;
        this.f55293C = null;
        this.f55294D = null;
    }

    /* JADX INFO: renamed from: L */
    public void m80790L(Throwable th) {
        this.f55320w = State.FAIL;
        z20<DownloadTask, Throwable> z20Var = this.f55294D;
        if (z20Var != null) {
            z20Var.call(this, th);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m80791M(int i) {
        z20<DownloadTask, Integer> z20Var = this.f55291A;
        if (z20Var != null) {
            z20Var.call(this, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m80792N(Boolean bool) {
        if (this.f55320w != State.CANCEL) {
            if (bool.booleanValue()) {
                this.f55320w = State.PAUSED;
            } else {
                this.f55320w = State.NORMAL;
            }
            z20<DownloadTask, Boolean> z20Var = this.f55292B;
            if (z20Var != null) {
                z20Var.call(this, bool);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m80793O() {
        y20<DownloadTask> y20Var = this.f55321x;
        if (y20Var != null) {
            y20Var.call(this);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m80794P(File file) {
        this.f55320w = State.SUCCESS;
        z20<DownloadTask, File> z20Var = this.f55293C;
        if (z20Var != null) {
            z20Var.call(this, file);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m80795Q() {
        State state;
        while (this.f55314q > 0 && (state = this.f55320w) != State.CANCEL && state != State.PAUSED) {
            ynl.m216876c(this);
        }
    }

    /* JADX INFO: renamed from: R */
    public DownloadTask m80796R(boolean z) {
        this.f55297G = z;
        return this;
    }

    /* JADX INFO: renamed from: S */
    public void m80797S() {
        int iM80807y;
        if (this.f55303f <= 0 || this.f55304g < 0) {
            return;
        }
        if ((this.f55299b == 0 || Math.abs(System.currentTimeMillis() - this.f55299b) > this.f55319v) && this.f55302e != (iM80807y = m80807y())) {
            this.f55299b = System.currentTimeMillis();
            m80791M(iM80807y);
            this.f55302e = iM80807y;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m80798p() {
        State state = this.f55320w;
        State state2 = State.CANCEL;
        if (state != state2) {
            this.f55320w = state2;
            m80787I();
            m80789K();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m80799q() throws InterruptedException {
        int iAbs;
        if (!C13274a.m80837u().m80856x(hashCode()) || (iAbs = 200 - Math.abs((int) (System.currentTimeMillis() - this.f55299b))) <= 0) {
            return;
        }
        Thread.sleep(iAbs);
    }

    /* JADX INFO: renamed from: r */
    public ApiCallBack m80800r() {
        return this.f55295E;
    }

    /* JADX INFO: renamed from: s */
    public int m80801s() {
        return this.f55318u;
    }

    /* JADX INFO: renamed from: t */
    public long m80802t() {
        return this.f55310m;
    }

    /* JADX INFO: renamed from: u */
    public Map<String, String> m80803u() {
        return this.f55296F;
    }

    /* JADX INFO: renamed from: v */
    public String m80804v() {
        return this.f55317t;
    }

    /* JADX INFO: renamed from: w */
    public String m80805w() {
        return this.f55315r;
    }

    /* JADX INFO: renamed from: x */
    public String m80806x() {
        return this.f55316s;
    }

    /* JADX INFO: renamed from: y */
    public int m80807y() {
        int iRound;
        long j = this.f55303f;
        if (j <= 0 || (iRound = Math.round(((this.f55304g * 1.0f) * 100.0f) / j)) < 0) {
            return 0;
        }
        if (iRound > 100) {
            return 100;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: z */
    public boolean m80808z() {
        return this.f55320w == State.CANCEL;
    }
}

package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.cosmos.mdlog.MDLog;
import immomo.com.mklibrary.fep.download.PreOfflineDownloader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vei {

    /* JADX INFO: renamed from: g */
    private static vei f181198g;

    /* JADX INFO: renamed from: a */
    private volatile tei f181199a;

    /* JADX INFO: renamed from: b */
    private lei f181200b;

    /* JADX INFO: renamed from: c */
    private qei f181201c;

    /* JADX INFO: renamed from: d */
    private jei f181202d;

    /* JADX INFO: renamed from: e */
    private final Object f181203e = new Object();

    /* JADX INFO: renamed from: f */
    private volatile boolean f181204f = false;

    /* JADX INFO: renamed from: l.vei$a */
    public class C20622a implements x750 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f181205a;

        public C20622a(String str) {
            this.f181205a = str;
        }

        @Override // p149l.x750
        /* JADX INFO: renamed from: a */
        public void mo198198a(@Nullable sei seiVar) {
            vei.this.m198195l(this.f181205a, seiVar);
        }
    }

    private vei() {
    }

    /* JADX INFO: renamed from: a */
    public static ug2<Object> m198184a(String str, String str2) {
        if (str2 != null) {
            return new C20623b(new Object(), str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m198185b() {
        return mei.m154201g();
    }

    /* JADX INFO: renamed from: e */
    public static vei m198186e() {
        if (f181198g == null) {
            synchronized (vei.class) {
                try {
                    if (f181198g == null) {
                        f181198g = new vei();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f181198g;
    }

    /* JADX INFO: renamed from: i */
    public static void m198187i(String str, JSONObject jSONObject, String str2) {
        try {
            long jOptLong = jSONObject.optJSONObject("data").optLong("newest_version");
            MDLog.m7389d("FepPublishManager", "checkUpdate ok, checkUpdateVersion: " + jOptLong + "    " + jSONObject);
            m198186e().m198193j(str, str2, jOptLong);
        } catch (Exception e) {
            MDLog.m7389d("FepPublishManager", e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public iei m198188c(String str, String str2, long j, String str3) {
        AbstractC17922k4 abstractC17922k4Mo179045b;
        iei ieiVar = new iei(str);
        if (m198185b() && this.f181204f && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Long.valueOf(str2).longValue() > 1000000 && !str.startsWith("https://www.immomo.com/checkurl/?url=") && !str.startsWith("https://passport.immomo.com/authorize?redirect_uri=")) {
            String strM184286f = shw.m184286f(str);
            if (this.f181202d.m141134b(str2) || this.f181202d.m141135c(strM184286f)) {
                MDLog.m7399w("FepPublishManager", "bid or host is in blacklist url: ".concat(str));
            } else {
                tei teiVarM198189d = m198186e().m198189d();
                if (teiVarM198189d != null && (abstractC17922k4Mo179045b = teiVarM198189d.mo179045b(str2, str)) != null) {
                    ieiVar.f112779a = true;
                    ieiVar.f112782d = abstractC17922k4Mo179045b;
                    boolean zM159463f = nhw.m159463f(abstractC17922k4Mo179045b.m144455f(str), j);
                    ieiVar.f112780b = !zM159463f;
                    if (zM159463f || "open_lua_url".equalsIgnoreCase(str3)) {
                        ieiVar.f112781c = abstractC17922k4Mo179045b.m144458j(str);
                    } else {
                        ieiVar.f112781c = abstractC17922k4Mo179045b.m144456h(str);
                    }
                    MDLog.m7389d("FepPublishManager", "FepAppliedResult ==== " + ieiVar.toString());
                    return ieiVar;
                }
            }
        }
        return ieiVar;
    }

    /* JADX INFO: renamed from: d */
    public tei m198189d() {
        tei teiVar;
        synchronized (this.f181203e) {
            try {
                teiVar = m198185b() ? this.f181199a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return teiVar;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public void m198190f() {
        if (this.f181200b == null) {
            this.f181200b = new mei();
        }
        if (m198185b()) {
            MDLog.m7389d("FepPublishManager", "init");
            if (this.f181202d == null) {
                jei jeiVar = new jei();
                this.f181202d = jeiVar;
                jeiVar.m141133a();
            }
            long jM154213s = mei.m154213s();
            if (jM154213s > 0 && this.f181201c == null) {
                qei qeiVar = new qei();
                this.f181201c = qeiVar;
                qeiVar.m174207c(jM154213s);
            }
            synchronized (this.f181203e) {
                try {
                    String strM159461d = nhw.m159461d();
                    if (this.f181199a == null) {
                        this.f181199a = new rei(strM159461d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f181204f = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m198191g() {
        qei qeiVar;
        if (!m198185b() || (qeiVar = this.f181201c) == null) {
            return;
        }
        qeiVar.m174206b(false);
    }

    /* JADX INFO: renamed from: h */
    public void m198192h() {
        qei qeiVar;
        if (!m198185b() || (qeiVar = this.f181201c) == null) {
            return;
        }
        qeiVar.m174206b(true);
    }

    /* JADX INFO: renamed from: j */
    public void m198193j(String str, String str2, long j) {
        if (m198185b() && this.f181199a != null && (this.f181199a instanceof rei) && ((rei) this.f181199a).m179047d(str, str2, j)) {
            MDLog.m7399w("FepPublishManager", "remove config strategy bid = " + str2 + " checkUpdateVersion = " + j);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m198194k(String str) {
        m198195l(str, null);
    }

    /* JADX INFO: renamed from: l */
    public void m198195l(String str, sei seiVar) {
        if ((m198185b() || "launch".equalsIgnoreCase(str)) && this.f181200b != null) {
            MDLog.m7389d("FepPublishManager", "triggerUpdate from " + str);
            this.f181200b.mo149546a(str, seiVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m198196m(String str, cql... cqlVarArr) {
        try {
            PreOfflineDownloader.INSTANCE.m87189c(cqlVarArr).m87191e(new C20622a(str));
        } catch (Throwable unused) {
            m198194k(str);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public void m198197n() {
        qei qeiVar;
        String strM159461d = nhw.m159461d();
        if (m198185b() && !TextUtils.isEmpty(strM159461d)) {
            synchronized (this.f181203e) {
                MDLog.m7389d("FepPublishManager", "updateFepGlobalConfigProvider");
                this.f181199a = new rei(strM159461d);
            }
        }
        if (m198185b() || (qeiVar = this.f181201c) == null) {
            return;
        }
        qeiVar.m174208d();
    }

    /* JADX INFO: renamed from: l.vei$b */
    public class C20623b extends ug2<Object> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f181207b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f181208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20623b(Object obj, String str, String str2) {
            super(obj);
            this.f181207b = str;
            this.f181208c = str2;
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: c */
        public void mo97997c(JSONObject jSONObject) {
            vei.m198187i(this.f181207b, jSONObject, this.f181208c);
        }

        @Override // p149l.ug2
        /* JADX INFO: renamed from: b */
        public void mo97996b(String str) {
        }
    }
}

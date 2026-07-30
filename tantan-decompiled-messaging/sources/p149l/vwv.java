package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.offline.DownloadService;
import com.immomo.mmutil.task.C3804c;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.momitor.exception.MKLogIllegalArgumentException;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class vwv implements lul {

    /* JADX INFO: renamed from: a */
    private Map<String, List<AbstractC20803w5>> f183377a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Map<String, jxv> f183378b = new HashMap();

    /* JADX INFO: renamed from: c */
    private volatile HandlerThread f183379c;

    /* JADX INFO: renamed from: d */
    private volatile HandlerC20751c f183380d;

    /* JADX INFO: renamed from: l.vwv$a */
    public class RunnableC20749a implements Runnable {
        public RunnableC20749a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = vwv.this.f183378b.keySet().iterator();
            while (it.hasNext()) {
                vwv.this.mo151770f(xbr.m207732j((String) it.next(), "appBackground"));
            }
        }
    }

    /* JADX INFO: renamed from: l.vwv$b */
    public class RunnableC20750b implements Runnable {
        public RunnableC20750b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = vwv.this.f183378b.keySet().iterator();
            while (it.hasNext()) {
                vwv.this.mo151770f(xbr.m207732j((String) it.next(), "appForeground"));
            }
            giw.INSTANCE.m126414j(null, true);
        }
    }

    /* JADX INFO: renamed from: l.vwv$c */
    public static class HandlerC20751c extends Handler {

        /* JADX INFO: renamed from: a */
        WeakReference<vwv> f183383a;

        /* JADX INFO: renamed from: l.vwv$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ jxv f183384a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ List f183385b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ AbstractC20803w5 f183386c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ boolean f183387d;

            public a(jxv jxvVar, List list, AbstractC20803w5 abstractC20803w5, boolean z) {
                this.f183384a = jxvVar;
                this.f183385b = list;
                this.f183386c = abstractC20803w5;
                this.f183387d = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f183384a.f120253e = System.currentTimeMillis();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < this.f183385b.size(); i++) {
                        jSONArray.put(i, ((AbstractC20803w5) this.f183385b.get(i)).mo117516a());
                    }
                    gxv gxvVarM128650f = qnw.m175704a("momo-web").m128649e(this.f183384a.f120250b).m128650f(this.f183386c.m201591c());
                    j400 j400Var = xtc0.f194369d;
                    if (j400Var != null && !TextUtils.isEmpty(j400Var.m139609b())) {
                        gxvVarM128650f = qnw.m175704a(xtc0.f194369d.m139609b()).m128649e(this.f183384a.f120250b).m128650f(this.f183386c.m201591c());
                    }
                    if (this.f183386c.mo96874i()) {
                        gxvVarM128650f.m128646b(onw.m165240j(this.f183386c.mo117516a()));
                        if ("ERR_1.1".equals(this.f183386c.m201591c())) {
                            long jM149944e = liw.m149944e();
                            if (jM149944e > 0) {
                                gxvVarM128650f.m128646b(new onw("availMemory", Long.valueOf(jM149944e)));
                            }
                            gxvVarM128650f.m128645a(new onw(DownloadService.KEY_FOREGROUND, Boolean.valueOf(shw.m184302v())));
                        }
                    }
                    gxvVarM128650f.m128645a(onw.m165239i(this.f183384a.f120249a)).m128645a(onw.m165243m(this.f183384a.f120251c)).m128645a(onw.m165233c(this.f183384a.f120252d)).m128645a(onw.m165242l(this.f183384a.f120253e)).m128645a(onw.m165236f(this.f183387d ? 1 : 0)).m128645a(onw.m165237g(this.f183384a.f120256h ? 1 : 0)).m128645a(onw.m165238h(jSONArray)).m128646b(onw.m165241k(this.f183384a.f120254f)).m128646b(new onw("ua", this.f183384a.f120263o)).m128646b(new onw("useDns", Boolean.valueOf(this.f183384a.f120261m))).m128646b(new onw("fep", this.f183384a.f120262n));
                    HandlerC20751c.this.m200457f(gxvVarM128650f);
                    giw.INSTANCE.m126409d(gxvVarM128650f, this.f183386c.m201591c());
                } catch (Exception e) {
                    mxv.m156927b("LogTracker", e.getMessage());
                }
            }
        }

        public HandlerC20751c(Looper looper, vwv vwvVar) {
            super(looper);
            this.f183383a = new WeakReference<>(vwvVar);
        }

        /* JADX INFO: renamed from: b */
        private boolean m200453b(@NonNull lul lulVar, @NonNull AbstractC20803w5 abstractC20803w5) {
            jxv jxvVarMo100110g = lulVar.mo100110g(abstractC20803w5.m201592d());
            if (jxvVarMo100110g == null) {
                return false;
            }
            int iM144364b = k33.m144364b(false, jxvVarMo100110g.f120251c);
            jxvVarMo100110g.f120259k = iM144364b;
            if (iM144364b == 0) {
                return true;
            }
            if (1 == iM144364b) {
                return false;
            }
            return k33.m144365c(false, jxvVarMo100110g.f120251c);
        }

        /* JADX INFO: renamed from: c */
        private void m200454c(AbstractC20803w5 abstractC20803w5, List<AbstractC20803w5> list) {
            vwv vwvVar;
            jxv jxvVarMo100110g;
            WeakReference<vwv> weakReference = this.f183383a;
            if (weakReference == null || weakReference.get() == null || (vwvVar = this.f183383a.get()) == null) {
                return;
            }
            String strM201592d = abstractC20803w5.m201592d();
            if (TextUtils.isEmpty(strM201592d) || (jxvVarMo100110g = vwvVar.mo100110g(strM201592d)) == null || TextUtils.isEmpty(jxvVarMo100110g.f120250b)) {
                return;
            }
            boolean zM154211q = mei.m154211q();
            boolean zM154203i = mei.m154203i();
            if ((zM154211q && abstractC20803w5.mo96874i()) || ((zM154211q && jxvVarMo100110g.f120257i && abstractC20803w5.m201595h()) || (zM154203i && abstractC20803w5.m201595h()))) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
                list.clear();
                if (mxv.m156929d()) {
                    mxv.m156930e("LogTracker", (zM154211q && abstractC20803w5.mo96874i() ? "error log occurred " : "allow upload all ").concat(" , try drag out all logs recorded before"));
                    mxv.m156930e("LogTracker", "-----------------");
                    Iterator<AbstractC20803w5> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        mxv.m156926a("LogTracker", it.next().mo117516a());
                    }
                    mxv.m156930e("LogTracker", "-----------------");
                }
                m200456e(abstractC20803w5, copyOnWriteArrayList, jxvVarMo100110g);
            }
        }

        /* JADX INFO: renamed from: d */
        private void m200455d(@NonNull String str) {
            WeakReference<vwv> weakReference = this.f183383a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            mxv.m156930e("LogTracker", "clear session list when first ignore occurred");
            List<AbstractC20803w5> listM200449r = this.f183383a.get().m200449r(str);
            if (listM200449r != null) {
                listM200449r.clear();
            }
        }

        /* JADX INFO: renamed from: e */
        private void m200456e(AbstractC20803w5 abstractC20803w5, List<AbstractC20803w5> list, jxv jxvVar) {
            boolean z;
            if (jxvVar == null || list == null || list.size() == 0) {
                return;
            }
            if (jxvVar.f120255g) {
                z = false;
            } else {
                z = true;
                jxvVar.f120255g = true;
            }
            C3804c.m18444d(5, new a(jxvVar, list, abstractC20803w5, z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m200457f(gxv gxvVar) {
            j400 j400Var = xtc0.f194369d;
            if (j400Var == null) {
                return;
            }
            Map<String, Object> mapM139611d = j400Var.m139611d();
            if (mapM139611d != null) {
                for (Map.Entry<String, Object> entry : mapM139611d.entrySet()) {
                    gxvVar.m128645a(new onw(entry.getKey(), entry.getValue()));
                }
            }
            Map<String, Object> mapM139610c = xtc0.f194369d.m139610c();
            if (mapM139610c != null) {
                for (Map.Entry<String, Object> entry2 : mapM139610c.entrySet()) {
                    gxvVar.m128646b(new onw(entry2.getKey(), entry2.getValue()));
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            vwv vwvVar;
            WeakReference<vwv> weakReference = this.f183383a;
            if (weakReference == null || weakReference.get() == null || (vwvVar = this.f183383a.get()) == null) {
                return;
            }
            int i = message.what;
            if (100 != i) {
                if (101 == i) {
                    vwvVar.m200445o((String) message.obj);
                    if (mxv.m156929d()) {
                        if (vwvVar.m200450s() == 0) {
                            mxv.m156926a("LogTracker", "clear session ok");
                            return;
                        }
                        mxv.m156930e("LogTracker", "logMap size: " + vwvVar.m200450s());
                        return;
                    }
                    return;
                }
                if (102 != i) {
                    if (103 == i) {
                        we3.m202830b((ve3) message.obj);
                        return;
                    } else if (104 == i) {
                        we3.m202831c((xe3) message.obj);
                        return;
                    } else {
                        if (105 == i) {
                            we3.m202833e();
                            return;
                        }
                        return;
                    }
                }
                String[] strArr = (String[]) message.obj;
                String str = strArr[0];
                String str2 = strArr[1];
                String strM200447q = vwvVar.m200447q(str);
                if (TextUtils.isEmpty(strM200447q)) {
                    mxv.m156930e("LogTracker", "drop offline log");
                    return;
                }
                vwvVar.mo151770f(aip0.m96872j(strM200447q, "ERR_2.5", "offline error&&&" + str2));
                return;
            }
            AbstractC20803w5 abstractC20803w5 = (AbstractC20803w5) message.obj;
            jxv jxvVarMo100110g = vwvVar.mo100110g(abstractC20803w5.m201592d());
            if (jxvVarMo100110g == null) {
                vwvVar.mo100111i(abstractC20803w5.m201592d());
            }
            if (jxvVarMo100110g != null && jxvVarMo100110g.f120258j) {
                mxv.m156930e("LogTracker", "session ignored, will drop new come log");
                return;
            }
            if (jxvVarMo100110g != null && jxvVarMo100110g.f120259k == -1 && m200453b(vwvVar, abstractC20803w5)) {
                mxv.m156930e("LogTracker", "checkInBlackList, will ignore log");
                if (jxvVarMo100110g.f120258j) {
                    return;
                }
                jxvVarMo100110g.f120258j = true;
                m200455d(abstractC20803w5.m201592d());
                return;
            }
            if (!abstractC20803w5.mo117517b() && (jxvVarMo100110g == null || !jxvVarMo100110g.f120257i)) {
                mxv.m156930e("LogTracker", abstractC20803w5.m201593f() + " disabled");
                return;
            }
            try {
                String strM201592d = abstractC20803w5.m201592d();
                if (TextUtils.isEmpty(strM201592d)) {
                    return;
                }
                List<AbstractC20803w5> listM200449r = vwvVar.m200449r(strM201592d);
                if (listM200449r == null) {
                    listM200449r = new ArrayList<>();
                    vwvVar.m200451t(strM201592d, listM200449r);
                }
                listM200449r.add(abstractC20803w5);
                mxv.m156926a("LogTracker", "add " + abstractC20803w5.m201593f() + " --> " + abstractC20803w5.mo117516a());
                m200454c(abstractC20803w5, listM200449r);
            } catch (Exception e) {
                mxv.m156927b("LogTracker", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m200445o(String str) {
        this.f183377a.remove(str);
        this.f183378b.remove(str);
        if (this.f183380d != null) {
            this.f183380d.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m200446p() {
        if (this.f183380d == null) {
            synchronized (this) {
                try {
                    if (this.f183380d == null) {
                        if (this.f183379c == null) {
                            this.f183379c = new HandlerThread("mkLogThread");
                            this.f183379c.start();
                            mxv.m156930e("LogTracker", "create log thread");
                        }
                        this.f183380d = new HandlerC20751c(this.f183379c.getLooper(), this);
                        mxv.m156930e("LogTracker", "create post handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public String m200447q(String str) {
        for (String str2 : this.f183378b.keySet()) {
            jxv jxvVar = this.f183378b.get(str2);
            if (jxvVar != null && b0g0.m99768a(jxvVar.f120250b, str)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    private void m200448u(int i, Object obj, Long l2) {
        m200446p();
        if (this.f183380d != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.obj = obj;
            HandlerC20751c handlerC20751c = this.f183380d;
            if (l2 != null) {
                handlerC20751c.sendMessageDelayed(messageObtain, l2.longValue());
            } else {
                handlerC20751c.sendMessage(messageObtain);
            }
        }
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: a */
    public void mo151767a(String str) {
        m200448u(101, str, null);
    }

    @Override // p149l.pml
    /* JADX INFO: renamed from: b */
    public void mo170339b() {
        mo151768d(new RunnableC20749a());
    }

    @Override // p149l.pml
    /* JADX INFO: renamed from: c */
    public void mo170340c() {
        mo151768d(new RunnableC20750b());
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: d */
    public void mo151768d(Runnable runnable) {
        m200446p();
        if (this.f183380d != null) {
            this.f183380d.post(runnable);
        }
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: e */
    public void mo151769e(ve3 ve3Var) {
        m200448u(103, ve3Var, null);
        m200448u(105, null, 2000L);
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: f */
    public void mo151770f(@NonNull AbstractC20803w5 abstractC20803w5) {
        m200448u(100, abstractC20803w5, null);
        qsf.INSTANCE.m176237f(abstractC20803w5.mo117516a(), abstractC20803w5.m201594g());
    }

    @Override // p149l.b3m
    /* JADX INFO: renamed from: g */
    public jxv mo100110g(String str) {
        return this.f183378b.get(str);
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: h */
    public void mo151771h(xe3 xe3Var) {
        m200448u(104, xe3Var, null);
    }

    @Override // p149l.b3m
    /* JADX INFO: renamed from: i */
    public void mo100111i(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new MKLogIllegalArgumentException("sessionKey is null");
        }
        if (!this.f183378b.containsKey(str)) {
            this.f183378b.put(str, new jxv());
            return;
        }
        mxv.m156927b("LogTracker", "session " + str + " already exist");
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: j */
    public void mo151772j(String str, String str2) {
        if (this.f183380d == null || this.f183379c == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        messageObtain.obj = new String[]{str, str2};
        this.f183380d.sendMessage(messageObtain);
    }

    @Override // p149l.lul
    /* JADX INFO: renamed from: k */
    public void mo151773k(String str, String str2, MKWebView.C14912e c14912e) {
        File fileM220666g = zwm.m220666g(str2);
        if (fileM220666g == null || !fileM220666g.exists() || TextUtils.isEmpty(str) || c14912e == null) {
            return;
        }
        String absolutePath = fileM220666g.getAbsolutePath();
        if (absolutePath.toLowerCase().endsWith(".html") || absolutePath.toLowerCase().endsWith(".js")) {
            m200446p();
            if (this.f183380d != null) {
                this.f183380d.postDelayed(new t750(str, absolutePath, c14912e), 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public List<AbstractC20803w5> m200449r(String str) {
        return this.f183377a.get(str);
    }

    /* JADX INFO: renamed from: s */
    public int m200450s() {
        return this.f183377a.size();
    }

    /* JADX INFO: renamed from: t */
    public void m200451t(String str, List<AbstractC20803w5> list) {
        this.f183377a.put(str, list);
    }
}

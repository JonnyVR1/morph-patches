package com.immomo.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.a9e;
import p149l.byf0;
import p149l.ev0;
import p149l.ii5;
import p149l.na20;
import p149l.omd;
import p149l.q8e;
import p149l.qll;
import p149l.qsi0;
import p149l.t7e;
import p149l.t8e;
import p149l.x7e;

/* JADX INFO: loaded from: classes7.dex */
public class DownloadManager {

    /* JADX INFO: renamed from: m */
    private static DownloadManager f12906m;

    /* JADX INFO: renamed from: n */
    private static Log4Android f12907n = Log4Android.m18417f();

    /* JADX INFO: renamed from: o */
    private static t7e f12908o;

    /* JADX INFO: renamed from: l */
    private BroadcastReceiver f12920l;

    /* JADX INFO: renamed from: a */
    private boolean f12909a = false;

    /* JADX INFO: renamed from: k */
    private int f12919k = 2;

    /* JADX INFO: renamed from: d */
    private List<q8e> f12912d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    private List<q8e> f12910b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private List<q8e> f12911c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    private List<q8e> f12913e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    private List<q8e> f12914f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    private HashMap<String, t8e> f12917i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    private Handler f12918j = new HandlerC3749b(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    private Map<String, InterfaceC3748a> f12915g = new HashMap();

    /* JADX INFO: renamed from: h */
    private Map<String, InterfaceC3748a> f12916h = new HashMap();

    /* JADX INFO: renamed from: com.immomo.downloader.DownloadManager$a */
    public interface InterfaceC3748a {
        /* JADX INFO: renamed from: a */
        void mo18328a(DownloadManager downloadManager, q8e q8eVar, int i);

        /* JADX INFO: renamed from: b */
        void mo18329b(DownloadManager downloadManager, q8e q8eVar);

        /* JADX INFO: renamed from: c */
        void mo18330c(DownloadManager downloadManager, q8e q8eVar);

        /* JADX INFO: renamed from: d */
        void mo18331d(DownloadManager downloadManager, q8e q8eVar);

        /* JADX INFO: renamed from: e */
        void mo18332e(DownloadManager downloadManager, q8e q8eVar);

        /* JADX INFO: renamed from: f */
        void mo18333f(DownloadManager downloadManager, q8e q8eVar);
    }

    /* JADX INFO: renamed from: com.immomo.downloader.DownloadManager$b */
    public class HandlerC3749b extends Handler {

        /* JADX INFO: renamed from: a */
        WeakReference<DownloadManager> f12922a;

        /* JADX INFO: renamed from: com.immomo.downloader.DownloadManager$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                DownloadManager.this.m18297F();
            }
        }

        public HandlerC3749b(DownloadManager downloadManager, Looper looper) {
            super(looper);
            this.f12922a = new WeakReference<>(downloadManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f12922a.get() == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                removeMessages(1);
                C3804c.m18444d(3, new a());
            } else if (i == 2) {
                DownloadManager.this.m18310t(message.arg1, (q8e) message.obj);
            }
        }
    }

    private DownloadManager() {
        m18316E();
    }

    /* JADX INFO: renamed from: A */
    private void m18294A(q8e q8eVar) {
        q8eVar.f153181u = 2;
        m18303h(q8eVar, -1);
        a9e.m95408d().m95413h(q8eVar);
    }

    /* JADX INFO: renamed from: B */
    private void m18295B(q8e q8eVar) {
        q8eVar.f153181u = 1;
        m18303h(q8eVar, -1);
        a9e.m95408d().m95414i(q8eVar);
    }

    /* JADX INFO: renamed from: D */
    private void m18296D() {
        this.f12918j.removeMessages(1);
        this.f12918j.sendEmptyMessageDelayed(1, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m18297F() {
        if (this.f12909a) {
            return;
        }
        this.f12909a = true;
        if (this.f12912d.size() == 0) {
            this.f12909a = false;
            return;
        }
        q8e q8eVarM18311v = m18311v();
        if (q8eVarM18311v == null) {
            return;
        }
        int size = this.f12910b.size();
        int size2 = this.f12911c.size();
        if (q8eVarM18311v.f153169i == 0) {
            int i = this.f12919k;
            if (size > 0) {
                if (size2 >= i - 1) {
                    this.f12909a = false;
                    return;
                } else {
                    this.f12909a = false;
                    return;
                }
            }
            if (size2 >= i) {
                this.f12909a = false;
                return;
            }
        } else if (this.f12910b.size() >= this.f12919k) {
            this.f12909a = false;
            return;
        }
        this.f12912d.remove(q8eVarM18311v);
        if (q8eVarM18311v.f153169i == 0) {
            this.f12911c.add(q8eVarM18311v);
        } else {
            this.f12910b.add(q8eVarM18311v);
        }
        m18298G(q8eVarM18311v);
        m18296D();
        this.f12909a = false;
    }

    /* JADX INFO: renamed from: G */
    private t8e m18298G(q8e q8eVar) {
        t8e t8eVar = new t8e(q8eVar, this.f12918j);
        this.f12917i.put(q8eVar.f153161a, t8eVar);
        t8eVar.m187547z();
        return t8eVar;
    }

    /* JADX INFO: renamed from: g */
    private boolean m18302g(q8e q8eVar, boolean z, List<q8e> list) {
        if (m18324o(q8eVar.f153161a, list, true) == null) {
            return false;
        }
        if (z) {
            qsi0.m176294k("正在下载中");
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private void m18303h(q8e q8eVar, int i) {
        Iterator<String> it = this.f12915g.keySet().iterator();
        while (it.hasNext()) {
            m18305k(q8eVar, this.f12915g.get(it.next()), i);
        }
        m18305k(q8eVar, this.f12916h.get(q8eVar.f153161a), i);
        int i2 = q8eVar.f153181u;
        if (i2 == 5 || i2 == 3 || i2 == 6) {
            this.f12916h.remove(q8eVar.f153161a);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m18304j(q8e q8eVar) {
        m18307q().f168695f.mo165035a(q8eVar);
    }

    /* JADX INFO: renamed from: k */
    private void m18305k(q8e q8eVar, InterfaceC3748a interfaceC3748a, int i) {
        if (interfaceC3748a == null) {
            return;
        }
        switch (q8eVar.f153181u) {
            case 1:
                interfaceC3748a.mo18330c(this, q8eVar);
                break;
            case 2:
                interfaceC3748a.mo18331d(this, q8eVar);
                break;
            case 3:
                interfaceC3748a.mo18329b(this, q8eVar);
                break;
            case 4:
                interfaceC3748a.mo18333f(this, q8eVar);
                break;
            case 5:
                interfaceC3748a.mo18328a(this, q8eVar, i);
                break;
            case 6:
                interfaceC3748a.mo18332e(this, q8eVar);
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    private q8e m18306n(String str, List<q8e> list) {
        for (q8e q8eVar : list) {
            if (q8eVar.f153161a.equalsIgnoreCase(str)) {
                return q8eVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static t7e m18307q() {
        if (f12908o == null) {
            f12908o = new omd();
        }
        return f12908o;
    }

    /* JADX INFO: renamed from: r */
    public static DownloadManager m18308r() {
        synchronized (DownloadManager.class) {
            try {
                if (f12906m == null) {
                    f12906m = new DownloadManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12906m;
    }

    /* JADX INFO: renamed from: s */
    public static Log4Android m18309s() {
        return f12907n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m18310t(int i, q8e q8eVar) {
        if (q8eVar == null) {
            return;
        }
        if (i < 0) {
            m18327y(i, q8eVar);
            return;
        }
        if (i == 1) {
            m18295B(q8eVar);
            return;
        }
        if (i == 2) {
            m18294A(q8eVar);
            return;
        }
        if (i == 3) {
            m18313x(q8eVar);
        } else if (i == 4) {
            m18314z(q8eVar);
        } else {
            if (i != 5) {
                return;
            }
            m18312w(q8eVar);
        }
    }

    /* JADX INFO: renamed from: v */
    private q8e m18311v() {
        if (this.f12912d.size() == 0) {
            return null;
        }
        try {
            return (q8e) Collections.max(this.f12912d);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m18312w(q8e q8eVar) {
        q8eVar.f153181u = 6;
        m18303h(q8eVar, -1);
        a9e.m95408d().m95411b(q8eVar.f153161a);
        m18296D();
    }

    /* JADX INFO: renamed from: x */
    private void m18313x(q8e q8eVar) {
        q8eVar.f153181u = 3;
        m18303h(q8eVar, -1);
        if (q8eVar.f153169i == 0) {
            this.f12911c.remove(q8eVar);
        } else {
            this.f12910b.remove(q8eVar);
        }
        this.f12917i.remove(q8eVar.f153161a);
        this.f12912d.remove(q8eVar);
        this.f12914f.remove(q8eVar);
        this.f12913e.remove(q8eVar);
        a9e.m95408d().m95411b(q8eVar.f153161a);
        q8eVar.m173371C();
        m18296D();
        if (q8eVar.f153169i == 0) {
            qll.m175489b(q8eVar, 0);
            m18326u(q8eVar);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m18314z(q8e q8eVar) {
        q8eVar.f153181u = 4;
        m18303h(q8eVar, -1);
        a9e.m95408d().m95412g(q8eVar);
        m18296D();
    }

    /* JADX INFO: renamed from: C */
    public void m18315C(q8e q8eVar) {
        f12907n.m18418a("downloader execute pause");
        q8e q8eVarM18323m = m18323m(q8eVar.f153161a);
        if (q8eVarM18323m != null) {
            q8eVar = q8eVarM18323m;
        }
        if (this.f12911c.contains(q8eVar) || this.f12910b.contains(q8eVar) || this.f12912d.contains(q8eVar) || this.f12913e.contains(q8eVar)) {
            this.f12912d.remove(q8eVar);
            this.f12910b.remove(q8eVar);
            this.f12911c.remove(q8eVar);
            this.f12913e.remove(q8eVar);
            this.f12914f.add(q8eVar);
        }
        if (this.f12917i.containsKey(q8eVar.f153161a)) {
            this.f12917i.get(q8eVar.f153161a).m187546w(1);
            this.f12917i.remove(q8eVar.f153161a);
        }
        if (q8eVar.f153169i == 0) {
            qll.m175489b(q8eVar, 1);
        }
        m18314z(q8eVar);
    }

    /* JADX INFO: renamed from: E */
    public void m18316E() {
        if (ev0.m118233a() == null) {
            return;
        }
        m18317H();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.immomo.momo.download.notification.btn");
        intentFilter.addAction("com.immomo.momo.download.notification.delete");
        this.f12920l = new BroadcastReceiver() { // from class: com.immomo.downloader.DownloadManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    return;
                }
                String action = intent.getAction();
                if (!"com.immomo.momo.download.notification.btn".equals(action)) {
                    if ("com.immomo.momo.download.notification.delete".equals(action)) {
                        DownloadManager.f12907n.m18418a("user cancel notify cancel task");
                        q8e q8eVarM18323m = DownloadManager.this.m18323m(intent.getStringExtra(com.heytap.mcssdk.mode.Message.TASK_ID));
                        if (q8eVarM18323m == null) {
                            return;
                        }
                        DownloadManager.this.m18321i(q8eVarM18323m, false);
                        return;
                    }
                    return;
                }
                String stringExtra = intent.getStringExtra(com.heytap.mcssdk.mode.Message.TASK_ID);
                DownloadManager.f12907n.m18418a("notification clicked  " + stringExtra);
                q8e q8eVarM18323m2 = DownloadManager.this.m18323m(stringExtra);
                if (q8eVarM18323m2 == null) {
                    return;
                }
                int i = q8eVarM18323m2.f153181u;
                if (i == 2 || i == 1) {
                    DownloadManager.this.m18315C(q8eVarM18323m2);
                } else if ((i == 5 || i == 4) && DownloadManager.this.m18318d(q8eVarM18323m2) != 0) {
                    q8eVarM18323m2.f153181u = i;
                }
            }
        };
        ii5.m136342l(ev0.m118233a(), this.f12920l, intentFilter);
    }

    /* JADX INFO: renamed from: H */
    public void m18317H() {
        if (this.f12920l == null) {
            return;
        }
        try {
            ev0.m118233a().unregisterReceiver(this.f12920l);
        } catch (Exception e) {
            f12907n.m18422e(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m18318d(q8e q8eVar) {
        return m18319e(q8eVar, null);
    }

    /* JADX INFO: renamed from: e */
    public int m18319e(q8e q8eVar, InterfaceC3748a interfaceC3748a) {
        return m18320f(q8eVar, false, interfaceC3748a);
    }

    /* JADX INFO: renamed from: f */
    public int m18320f(q8e q8eVar, boolean z, InterfaceC3748a interfaceC3748a) {
        File fileM207287c;
        String str;
        f12907n.m18418a("downloader execute add");
        if (q8eVar == null || !q8eVar.m173369A()) {
            return 5;
        }
        if ((q8eVar.f153169i == 0 || ((str = q8eVar.f153163c) != null && str.endsWith(ShareConstants.PATCH_SUFFIX))) && (fileM207287c = x7e.m207287c(q8eVar)) != null && fileM207287c.exists() && fileM207287c.length() > 0) {
            m18326u(q8eVar);
            return 4;
        }
        if (m18302g(q8eVar, z, this.f12911c)) {
            return 3;
        }
        if (m18302g(q8eVar, z, this.f12910b)) {
            if (interfaceC3748a != null) {
                this.f12916h.put(q8eVar.f153161a, interfaceC3748a);
            }
            return 3;
        }
        if (m18302g(q8eVar, z, this.f12912d)) {
            if (interfaceC3748a != null) {
                this.f12916h.put(q8eVar.f153161a, interfaceC3748a);
            }
            return 2;
        }
        if (!byf0.m104451b()) {
            if (z) {
                qsi0.m176294k("当前存储设备不可用，请检查");
            }
            return 7;
        }
        if (!byf0.m104450a(20971520L)) {
            if (z) {
                qsi0.m176294k("手机存储空间不足");
            }
            return 7;
        }
        if (!na20.m158575f()) {
            if (!z) {
                return 8;
            }
            qsi0.m176294k("当前网络不可用，请检查");
            return 8;
        }
        if (interfaceC3748a != null) {
            this.f12916h.put(q8eVar.f153161a, interfaceC3748a);
        }
        if (q8eVar.f153169i == 0 && this.f12914f.contains(q8eVar)) {
            qll.m175489b(q8eVar, 2);
        }
        this.f12913e.remove(q8eVar);
        this.f12914f.remove(q8eVar);
        synchronized (this.f12912d) {
            this.f12912d.add(q8eVar);
        }
        q8eVar.f153181u = 0;
        a9e.m95408d().m95414i(q8eVar);
        m18304j(q8eVar);
        m18296D();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m18321i(q8e q8eVar, boolean z) {
        f12907n.m18418a("downloader execute cancel");
        q8eVar.m173371C();
        this.f12912d.remove(q8eVar);
        if (q8eVar.f153169i == 0) {
            this.f12911c.remove(q8eVar);
        } else {
            this.f12910b.remove(q8eVar);
        }
        this.f12914f.remove(q8eVar);
        this.f12913e.remove(q8eVar);
        if (this.f12917i.containsKey(q8eVar.f153161a)) {
            this.f12917i.get(q8eVar.f153161a).m187545l(z);
            this.f12917i.remove(q8eVar.f153161a);
        } else {
            m18312w(q8eVar);
        }
        a9e.m95408d().m95411b(q8eVar.f153161a);
        m18296D();
        f12907n.m18418a("downloader cancel task remainNum:" + this.f12912d.size() + "-" + this.f12910b.size() + "-" + this.f12914f.size());
    }

    /* JADX INFO: renamed from: l */
    public q8e m18322l(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12910b);
        arrayList.addAll(this.f12912d);
        q8e q8eVarM18306n = m18306n(str, arrayList);
        if (q8eVarM18306n != null) {
            return q8eVarM18306n;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public q8e m18323m(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12910b);
        arrayList.addAll(this.f12911c);
        arrayList.addAll(this.f12912d);
        arrayList.addAll(this.f12914f);
        arrayList.addAll(this.f12913e);
        q8e q8eVarM18306n = m18306n(str, arrayList);
        if (q8eVarM18306n != null) {
            return q8eVarM18306n;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public q8e m18324o(String str, List<q8e> list, boolean z) {
        if (!z) {
            return m18306n(str, list);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return m18306n(str, arrayList);
    }

    /* JADX INFO: renamed from: p */
    public Intent m18325p(String str) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            Uri uriForFile = FileProvider.getUriForFile(ev0.m118233a(), m18307q().f168696g, new File(str));
            intent.addFlags(1);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        }
        return intent;
    }

    /* JADX INFO: renamed from: u */
    public void m18326u(q8e q8eVar) {
        try {
            ev0.m118233a().startActivity(m18325p(x7e.m207288d(q8eVar)));
        } catch (Exception e) {
            f12907n.m18422e(e);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m18327y(int i, q8e q8eVar) {
        q8eVar.f153181u = 5;
        m18303h(q8eVar, i);
        if (q8eVar.f153169i == 0) {
            qll.m175489b(q8eVar, i);
        }
        a9e.m95408d().m95412g(q8eVar);
        if (q8eVar.f153169i == 0) {
            this.f12911c.remove(q8eVar);
        } else {
            this.f12910b.remove(q8eVar);
        }
        this.f12912d.remove(q8eVar);
        this.f12913e.add(q8eVar);
        if (this.f12917i.containsKey(q8eVar.f153161a)) {
            this.f12917i.get(q8eVar.f153161a).m187546w(1);
            this.f12917i.remove(q8eVar.f153161a);
        }
        m18296D();
    }
}

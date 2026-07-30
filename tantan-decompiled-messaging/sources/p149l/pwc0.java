package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class pwc0 {

    /* JADX INFO: renamed from: b */
    public static pwc0 f151556b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, qwc0> f151557a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m171711a(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            qwc0.InterfaceC19597a interfaceC19597a = (qwc0.InterfaceC19597a) arrayList.get(i);
            if (interfaceC19597a != null) {
                interfaceC19597a.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m171713c(ArrayList arrayList, File file) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qwc0.InterfaceC19597a interfaceC19597a = (qwc0.InterfaceC19597a) it.next();
            if (interfaceC19597a != null) {
                interfaceC19597a.mo176788a(file);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m171714d(ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            qwc0.InterfaceC19597a interfaceC19597a = (qwc0.InterfaceC19597a) arrayList.get(i);
            if (interfaceC19597a != null) {
                interfaceC19597a.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m171715e(ArrayList arrayList, Integer num) {
        for (int i = 0; i < arrayList.size(); i++) {
            qwc0.InterfaceC19597a interfaceC19597a = (qwc0.InterfaceC19597a) arrayList.get(i);
            if (interfaceC19597a != null) {
                interfaceC19597a.mo176789c(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m171718h(DownloadTask downloadTask) {
    }

    /* JADX INFO: renamed from: q */
    public static pwc0 m171721q() {
        if (f151556b == null) {
            synchronized (pwc0.class) {
                try {
                    if (f151556b == null) {
                        f151556b = new pwc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151556b;
    }

    /* JADX INFO: renamed from: k */
    public final void m171722k(String str) {
        ArrayList<qwc0.InterfaceC19597a> arrayListM176786b;
        qwc0 qwc0Var = this.f151557a.get(str);
        if (qwc0Var == null || (arrayListM176786b = qwc0Var.m176786b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM176786b.clone();
        m171726o(new d30() { // from class: l.owc0
            @Override // p149l.d30
            public final void call() {
                pwc0.m171711a(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m171723l(String str, final String str2) {
        ArrayList<qwc0.InterfaceC19597a> arrayListM176786b;
        qwc0 qwc0Var = this.f151557a.get(str);
        if (qwc0Var == null || (arrayListM176786b = qwc0Var.m176786b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM176786b.clone();
        m171726o(new d30() { // from class: l.mwc0
            @Override // p149l.d30
            public final void call() {
                pwc0.m171714d(arrayList, str2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m171724m(String str, final Integer num) {
        ArrayList<qwc0.InterfaceC19597a> arrayListM176786b;
        qwc0 qwc0Var = this.f151557a.get(str);
        if (qwc0Var == null || (arrayListM176786b = qwc0Var.m176786b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM176786b.clone();
        m171726o(new d30() { // from class: l.nwc0
            @Override // p149l.d30
            public final void call() {
                pwc0.m171715e(arrayList, num);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m171725n(String str, final File file) {
        ArrayList<qwc0.InterfaceC19597a> arrayListM176786b;
        qwc0 qwc0Var = this.f151557a.get(str);
        if (qwc0Var == null || (arrayListM176786b = qwc0Var.m176786b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM176786b.clone();
        m171726o(new d30() { // from class: l.lwc0
            @Override // p149l.d30
            public final void call() {
                pwc0.m171713c(arrayList, file);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m171726o(d30 d30Var) {
        Objects.requireNonNull(d30Var);
        e51.m114742G(new bii0(d30Var));
    }

    /* JADX INFO: renamed from: p */
    public void m171727p(final String str, String str2, String str3, CoreGiftPriority coreGiftPriority, final w7e w7eVar, final AbstractC21309y5 abstractC21309y5, qwc0.InterfaceC19597a interfaceC19597a) {
        boolean z;
        qwc0 qwc0Var;
        final pwc0 pwc0Var;
        final String str4;
        if (m171728r(str2)) {
            qwc0Var = this.f151557a.get(str2);
            z = false;
        } else {
            z = true;
            qwc0Var = null;
        }
        if (qwc0Var == null) {
            qwc0Var = new qwc0();
        }
        if (NullChecker.m81303a(interfaceC19597a)) {
            qwc0Var.m176785a(interfaceC19597a);
        }
        if (z) {
            str4 = str2;
            final StringBuffer stringBuffer = new StringBuffer();
            qwc0Var.m176787c(coreGiftPriority);
            if (abstractC21309y5 != null && abstractC21309y5.mo119229c(str, str4)) {
                m171734x(new Runnable() { // from class: l.fwc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99640a.m171729s(str4, abstractC21309y5, str);
                    }
                });
                return;
            }
            if (abstractC21309y5 != null) {
                abstractC21309y5.mo184129m(str, str4);
            }
            pwc0Var = this;
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str4).m79640o(str3).m79634i(new e30() { // from class: l.gwc0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pwc0.m171718h((DownloadTask) obj);
                }
            }).m79632g(new f30() { // from class: l.hwc0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f109751a.m171730t(str4, (DownloadTask) obj, (Integer) obj2);
                }
            }).m79635j(new f30() { // from class: l.iwc0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f115258a.m171731u(w7eVar, str, str4, stringBuffer, (DownloadTask) obj, (File) obj2);
                }
            }).m79629d(new e30() { // from class: l.jwc0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120074a.m171732v(str4, (DownloadTask) obj);
                }
            }).m79631f(new f30() { // from class: l.kwc0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f124969a.m171733w(str4, stringBuffer, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79626a());
        } else {
            pwc0Var = this;
            str4 = str2;
        }
        pwc0Var.f151557a.put(str4, qwc0Var);
    }

    /* JADX INFO: renamed from: r */
    public boolean m171728r(String str) {
        return this.f151557a.containsKey(str);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m171729s(String str, AbstractC21309y5 abstractC21309y5, String str2) {
        m171725n(str, abstractC21309y5.m212951k(str2, str));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m171730t(String str, DownloadTask downloadTask, Integer num) {
        m171724m(str, num);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m171731u(w7e w7eVar, String str, String str2, StringBuffer stringBuffer, DownloadTask downloadTask, File file) {
        if (eva.m118251f(file)) {
            if (w7eVar != null) {
                file = w7eVar.mo174454a(str, str2, file);
            }
            if (eva.m118251f(file)) {
                m171725n(str2, file);
            } else {
                m171723l(str2, TextUtils.isEmpty(stringBuffer.toString()) ? "progressFile.null" : stringBuffer.toString());
            }
        } else {
            m171723l(str2, TextUtils.isEmpty(stringBuffer.toString()) ? "file.null" : stringBuffer.toString());
        }
        this.f151557a.remove(str2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m171732v(String str, DownloadTask downloadTask) {
        m171722k(str);
        this.f151557a.remove(str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m171733w(String str, StringBuffer stringBuffer, DownloadTask downloadTask, Throwable th) {
        this.f151557a.remove(str);
        stringBuffer.append("downloadFail: " + th.toString());
        m171723l(str, stringBuffer.toString());
    }

    /* JADX INFO: renamed from: x */
    public final void m171734x(@NonNull Runnable runnable) {
        e51.m114748M(runnable);
    }
}

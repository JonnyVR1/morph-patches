package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.CoreGiftPriority;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import l.bii0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pwc0 {

    /* JADX INFO: renamed from: b */
    public static pwc0 f6928b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, qwc0> f6929a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8818a(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            qwc0.InterfaceC3412a interfaceC3412a = (qwc0.InterfaceC3412a) arrayList.get(i);
            if (interfaceC3412a != null) {
                interfaceC3412a.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8820c(ArrayList arrayList, File file) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qwc0.InterfaceC3412a interfaceC3412a = (qwc0.InterfaceC3412a) it.next();
            if (interfaceC3412a != null) {
                interfaceC3412a.mo9040a(file);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8821d(ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            qwc0.InterfaceC3412a interfaceC3412a = (qwc0.InterfaceC3412a) arrayList.get(i);
            if (interfaceC3412a != null) {
                interfaceC3412a.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8822e(ArrayList arrayList, Integer num) {
        for (int i = 0; i < arrayList.size(); i++) {
            qwc0.InterfaceC3412a interfaceC3412a = (qwc0.InterfaceC3412a) arrayList.get(i);
            if (interfaceC3412a != null) {
                interfaceC3412a.mo9041c(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8825h(DownloadTask downloadTask) {
    }

    /* JADX INFO: renamed from: q */
    public static pwc0 m8828q() {
        if (f6928b == null) {
            synchronized (pwc0.class) {
                try {
                    if (f6928b == null) {
                        f6928b = new pwc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6928b;
    }

    /* JADX INFO: renamed from: k */
    public final void m8829k(String str) {
        ArrayList<qwc0.InterfaceC3412a> arrayListM9038b;
        qwc0 qwc0Var = this.f6929a.get(str);
        if (qwc0Var == null || (arrayListM9038b = qwc0Var.m9038b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM9038b.clone();
        m8833o(new d30() { // from class: l.owc0
            public final void call() {
                pwc0.m8818a(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m8830l(String str, final String str2) {
        ArrayList<qwc0.InterfaceC3412a> arrayListM9038b;
        qwc0 qwc0Var = this.f6929a.get(str);
        if (qwc0Var == null || (arrayListM9038b = qwc0Var.m9038b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM9038b.clone();
        m8833o(new d30() { // from class: l.mwc0
            public final void call() {
                pwc0.m8821d(arrayList, str2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m8831m(String str, final Integer num) {
        ArrayList<qwc0.InterfaceC3412a> arrayListM9038b;
        qwc0 qwc0Var = this.f6929a.get(str);
        if (qwc0Var == null || (arrayListM9038b = qwc0Var.m9038b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM9038b.clone();
        m8833o(new d30() { // from class: l.nwc0
            public final void call() {
                pwc0.m8822e(arrayList, num);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m8832n(String str, final File file) {
        ArrayList<qwc0.InterfaceC3412a> arrayListM9038b;
        qwc0 qwc0Var = this.f6929a.get(str);
        if (qwc0Var == null || (arrayListM9038b = qwc0Var.m9038b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM9038b.clone();
        m8833o(new d30() { // from class: l.lwc0
            public final void call() {
                pwc0.m8820c(arrayList, file);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m8833o(d30 d30Var) {
        Objects.requireNonNull(d30Var);
        e51.G(new bii0(d30Var));
    }

    /* JADX INFO: renamed from: p */
    public void m8834p(final String str, String str2, String str3, CoreGiftPriority coreGiftPriority, final w7e w7eVar, final AbstractC3491y5 abstractC3491y5, qwc0.InterfaceC3412a interfaceC3412a) {
        boolean z;
        qwc0 qwc0Var;
        final pwc0 pwc0Var;
        final String str4;
        if (m8835r(str2)) {
            qwc0Var = this.f6929a.get(str2);
            z = false;
        } else {
            z = true;
            qwc0Var = null;
        }
        if (qwc0Var == null) {
            qwc0Var = new qwc0();
        }
        if (NullChecker.a(interfaceC3412a)) {
            qwc0Var.m9037a(interfaceC3412a);
        }
        if (z) {
            str4 = str2;
            final StringBuffer stringBuffer = new StringBuffer();
            qwc0Var.m9039c(coreGiftPriority);
            if (abstractC3491y5 != null && abstractC3491y5.mo6372c(str, str4)) {
                m8841x(new Runnable() { // from class: l.fwc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4517a.m8836s(str4, abstractC3491y5, str);
                    }
                });
                return;
            }
            if (abstractC3491y5 != null) {
                abstractC3491y5.mo9344m(str, str4);
            }
            pwc0Var = this;
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(str4).o(str3).i(new e30() { // from class: l.gwc0
                public final void call(Object obj) {
                    pwc0.m8825h((DownloadTask) obj);
                }
            }).g(new f30() { // from class: l.hwc0
                public final void call(Object obj, Object obj2) {
                    this.f4962a.m8837t(str4, (DownloadTask) obj, (Integer) obj2);
                }
            }).j(new f30() { // from class: l.iwc0
                public final void call(Object obj, Object obj2) {
                    this.f5218a.m8838u(w7eVar, str, str4, stringBuffer, (DownloadTask) obj, (File) obj2);
                }
            }).d(new e30() { // from class: l.jwc0
                public final void call(Object obj) {
                    this.f5387a.m8839v(str4, (DownloadTask) obj);
                }
            }).f(new f30() { // from class: l.kwc0
                public final void call(Object obj, Object obj2) {
                    this.f5716a.m8840w(str4, stringBuffer, (DownloadTask) obj, (Throwable) obj2);
                }
            }).a());
        } else {
            pwc0Var = this;
            str4 = str2;
        }
        pwc0Var.f6929a.put(str4, qwc0Var);
    }

    /* JADX INFO: renamed from: r */
    public boolean m8835r(String str) {
        return this.f6929a.containsKey(str);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8836s(String str, AbstractC3491y5 abstractC3491y5, String str2) {
        m8832n(str, abstractC3491y5.m11151k(str2, str));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8837t(String str, DownloadTask downloadTask, Integer num) {
        m8831m(str, num);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8838u(w7e w7eVar, String str, String str2, StringBuffer stringBuffer, DownloadTask downloadTask, File file) {
        if (eva.m6326f(file)) {
            if (w7eVar != null) {
                file = w7eVar.mo8994a(str, str2, file);
            }
            if (eva.m6326f(file)) {
                m8832n(str2, file);
            } else {
                m8830l(str2, TextUtils.isEmpty(stringBuffer.toString()) ? "progressFile.null" : stringBuffer.toString());
            }
        } else {
            m8830l(str2, TextUtils.isEmpty(stringBuffer.toString()) ? "file.null" : stringBuffer.toString());
        }
        this.f6929a.remove(str2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8839v(String str, DownloadTask downloadTask) {
        m8829k(str);
        this.f6929a.remove(str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8840w(String str, StringBuffer stringBuffer, DownloadTask downloadTask, Throwable th) {
        this.f6929a.remove(str);
        stringBuffer.append("downloadFail: " + th.toString());
        m8830l(str, stringBuffer.toString());
    }

    /* JADX INFO: renamed from: x */
    public final void m8841x(@NonNull Runnable runnable) {
        e51.M(runnable);
    }
}

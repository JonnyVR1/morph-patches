package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class s4d0 {

    /* JADX INFO: renamed from: b */
    public static s4d0 f166227b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, t4d0> f166228a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m184527a(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            t4d0.InterfaceC20233a interfaceC20233a = (t4d0.InterfaceC20233a) arrayList.get(i);
            if (interfaceC20233a != null) {
                interfaceC20233a.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m184529c(ArrayList arrayList, File file) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t4d0.InterfaceC20233a interfaceC20233a = (t4d0.InterfaceC20233a) it.next();
            if (interfaceC20233a != null) {
                interfaceC20233a.mo189255a(file);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m184530d(ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            t4d0.InterfaceC20233a interfaceC20233a = (t4d0.InterfaceC20233a) arrayList.get(i);
            if (interfaceC20233a != null) {
                interfaceC20233a.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m184531e(ArrayList arrayList, Integer num) {
        for (int i = 0; i < arrayList.size(); i++) {
            t4d0.InterfaceC20233a interfaceC20233a = (t4d0.InterfaceC20233a) arrayList.get(i);
            if (interfaceC20233a != null) {
                interfaceC20233a.mo189256c(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m184534h(DownloadTask downloadTask) {
    }

    /* JADX INFO: renamed from: q */
    public static s4d0 m184537q() {
        if (f166227b == null) {
            synchronized (s4d0.class) {
                try {
                    if (f166227b == null) {
                        f166227b = new s4d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f166227b;
    }

    /* JADX INFO: renamed from: k */
    public final void m184538k(String str) {
        ArrayList<t4d0.InterfaceC20233a> arrayListM189253b;
        t4d0 t4d0Var = this.f166228a.get(str);
        if (t4d0Var == null || (arrayListM189253b = t4d0Var.m189253b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM189253b.clone();
        m184542o(new x20() { // from class: l.r4d0
            @Override // p153l.x20
            public final void call() {
                s4d0.m184527a(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m184539l(String str, final String str2) {
        ArrayList<t4d0.InterfaceC20233a> arrayListM189253b;
        t4d0 t4d0Var = this.f166228a.get(str);
        if (t4d0Var == null || (arrayListM189253b = t4d0Var.m189253b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM189253b.clone();
        m184542o(new x20() { // from class: l.p4d0
            @Override // p153l.x20
            public final void call() {
                s4d0.m184530d(arrayList, str2);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m184540m(String str, final Integer num) {
        ArrayList<t4d0.InterfaceC20233a> arrayListM189253b;
        t4d0 t4d0Var = this.f166228a.get(str);
        if (t4d0Var == null || (arrayListM189253b = t4d0Var.m189253b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM189253b.clone();
        m184542o(new x20() { // from class: l.q4d0
            @Override // p153l.x20
            public final void call() {
                s4d0.m184531e(arrayList, num);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m184541n(String str, final File file) {
        ArrayList<t4d0.InterfaceC20233a> arrayListM189253b;
        t4d0 t4d0Var = this.f166228a.get(str);
        if (t4d0Var == null || (arrayListM189253b = t4d0Var.m189253b()) == null) {
            return;
        }
        final ArrayList arrayList = (ArrayList) arrayListM189253b.clone();
        m184542o(new x20() { // from class: l.o4d0
            @Override // p153l.x20
            public final void call() {
                s4d0.m184529c(arrayList, file);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m184542o(x20 x20Var) {
        Objects.requireNonNull(x20Var);
        l51.m152887G(new bri0(x20Var));
    }

    /* JADX INFO: renamed from: p */
    public void m184543p(final String str, String str2, String str3, CoreGiftPriority coreGiftPriority, final k9e k9eVar, final AbstractC20758v5 abstractC20758v5, t4d0.InterfaceC20233a interfaceC20233a) {
        boolean z;
        t4d0 t4d0Var;
        final s4d0 s4d0Var;
        final String str4;
        if (m184544r(str2)) {
            t4d0Var = this.f166228a.get(str2);
            z = false;
        } else {
            z = true;
            t4d0Var = null;
        }
        if (t4d0Var == null) {
            t4d0Var = new t4d0();
        }
        if (NullChecker.m82486a(interfaceC20233a)) {
            t4d0Var.m189252a(interfaceC20233a);
        }
        if (z) {
            str4 = str2;
            final StringBuffer stringBuffer = new StringBuffer();
            t4d0Var.m189254c(coreGiftPriority);
            if (abstractC20758v5 != null && abstractC20758v5.mo199744c(str, str4)) {
                m184550x(new Runnable() { // from class: l.i4d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f112888a.m184545s(str4, abstractC20758v5, str);
                    }
                });
                return;
            }
            if (abstractC20758v5 != null) {
                abstractC20758v5.mo199754m(str, str4);
            }
            s4d0Var = this;
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str4).m80823o(str3).m80817i(new y20() { // from class: l.j4d0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s4d0.m184534h((DownloadTask) obj);
                }
            }).m80815g(new z20() { // from class: l.k4d0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f123882a.m184546t(str4, (DownloadTask) obj, (Integer) obj2);
                }
            }).m80818j(new z20() { // from class: l.l4d0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f129961a.m184547u(k9eVar, str, str4, stringBuffer, (DownloadTask) obj, (File) obj2);
                }
            }).m80812d(new y20() { // from class: l.m4d0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f134783a.m184548v(str4, (DownloadTask) obj);
                }
            }).m80814f(new z20() { // from class: l.n4d0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f140222a.m184549w(str4, stringBuffer, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80809a());
        } else {
            s4d0Var = this;
            str4 = str2;
        }
        s4d0Var.f166228a.put(str4, t4d0Var);
    }

    /* JADX INFO: renamed from: r */
    public boolean m184544r(String str) {
        return this.f166228a.containsKey(str);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m184545s(String str, AbstractC20758v5 abstractC20758v5, String str2) {
        m184541n(str, abstractC20758v5.m199752k(str2, str));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m184546t(String str, DownloadTask downloadTask, Integer num) {
        m184540m(str, num);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m184547u(k9e k9eVar, String str, String str2, StringBuffer stringBuffer, DownloadTask downloadTask, File file) {
        if (qwa.m178455f(file)) {
            if (k9eVar != null) {
                file = k9eVar.mo148865a(str, str2, file);
            }
            if (qwa.m178455f(file)) {
                m184541n(str2, file);
            } else {
                m184539l(str2, TextUtils.isEmpty(stringBuffer.toString()) ? "progressFile.null" : stringBuffer.toString());
            }
        } else {
            m184539l(str2, TextUtils.isEmpty(stringBuffer.toString()) ? "file.null" : stringBuffer.toString());
        }
        this.f166228a.remove(str2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m184548v(String str, DownloadTask downloadTask) {
        m184538k(str);
        this.f166228a.remove(str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m184549w(String str, StringBuffer stringBuffer, DownloadTask downloadTask, Throwable th) {
        this.f166228a.remove(str);
        stringBuffer.append("downloadFail: " + th.toString());
        m184539l(str, stringBuffer.toString());
    }

    /* JADX INFO: renamed from: x */
    public final void m184550x(@NonNull Runnable runnable) {
        l51.m152893M(runnable);
    }
}

package com.vivo.push.util;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.vivo.push.p115a.C14681a;
import com.vivo.push.p116b.C14696n;
import com.vivo.push.p119e.C14757a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.vivo.push.util.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C14793n implements InterfaceC14794o {

    /* JADX INFO: renamed from: a */
    private static final String f61976a = "(" + Process.myPid() + ")";

    /* JADX INFO: renamed from: a */
    private void m86165a(Context context, String str, int i) {
        C14696n c14696n = new C14696n();
        c14696n.m85934b(str);
        c14696n.m85932a(i);
        if (i > 0) {
            mo86177d("LogController", str);
        }
        if (!context.getPackageName().equals("com.vivo.pushservice")) {
            c14696n.m85933a(false);
            C14681a.m85899a(context, c14696n, context.getPackageName());
        } else {
            c14696n.m85933a(true);
            Iterator<String> it = C14757a.m86079a().m86080b().iterator();
            while (it.hasNext()) {
                C14681a.m85899a(context, c14696n, it.next());
            }
        }
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: b */
    public final int mo86173b(String str, String str2, Throwable th) {
        if (!C14795p.m86185a()) {
            return -1;
        }
        return Log.i("VivoPush.".concat(String.valueOf(str)), f61976a + str2, th);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: c */
    public final int mo86175c(String str, String str2) {
        return Log.d("VivoPush.".concat(String.valueOf(str)), f61976a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: d */
    public final int mo86177d(String str, String str2) {
        if (!C14795p.m86185a()) {
            return -1;
        }
        return Log.i("VivoPush.".concat(String.valueOf(str)), f61976a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: e */
    public final int mo86178e(String str, String str2) {
        if (!C14795p.m86185a()) {
            return -1;
        }
        return Log.v("VivoPush.".concat(String.valueOf(str)), f61976a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: c */
    public final void mo86176c(Context context, String str) {
        if (m86166a()) {
            m86165a(context, str, 2);
        }
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: b */
    public final int mo86172b(String str, String str2) {
        return Log.w("VivoPush.".concat(String.valueOf(str)), f61976a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: b */
    public final void mo86174b(Context context, String str) {
        if (m86166a()) {
            m86165a(context, str, 1);
        }
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: a */
    public final int mo86169a(String str, Throwable th) {
        return Log.e("VivoPush.".concat(String.valueOf(str)), Log.getStackTraceString(th));
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: a */
    public final int mo86168a(String str, String str2, Throwable th) {
        return Log.e("VivoPush.".concat(String.valueOf(str)), f61976a + str2, th);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: a */
    public final String mo86170a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: a */
    public final void mo86171a(Context context, String str) {
        if (m86166a()) {
            m86165a(context, str, 0);
        }
    }

    @Override // com.vivo.push.util.InterfaceC14794o
    /* JADX INFO: renamed from: a */
    public final int mo86167a(String str, String str2) {
        return Log.e("VivoPush.".concat(String.valueOf(str)), f61976a + str2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86166a() {
        C14795p.m86185a();
        return C14757a.m86079a().m86081c();
    }
}

package com.vivo.push.util;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.vivo.push.p110a.C14533a;
import com.vivo.push.p111b.C14548n;
import com.vivo.push.p114e.C14609a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.vivo.push.util.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C14645n implements InterfaceC14646o {

    /* JADX INFO: renamed from: a */
    private static final String f61129a = "(" + Process.myPid() + ")";

    /* JADX INFO: renamed from: a */
    private void m84994a(Context context, String str, int i) {
        C14548n c14548n = new C14548n();
        c14548n.m84763b(str);
        c14548n.m84761a(i);
        if (i > 0) {
            mo85006d("LogController", str);
        }
        if (!context.getPackageName().equals("com.vivo.pushservice")) {
            c14548n.m84762a(false);
            C14533a.m84728a(context, c14548n, context.getPackageName());
        } else {
            c14548n.m84762a(true);
            Iterator<String> it = C14609a.m84908a().m84909b().iterator();
            while (it.hasNext()) {
                C14533a.m84728a(context, c14548n, it.next());
            }
        }
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: b */
    public final int mo85002b(String str, String str2, Throwable th) {
        if (!C14647p.m85014a()) {
            return -1;
        }
        return Log.i("VivoPush.".concat(String.valueOf(str)), f61129a + str2, th);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: c */
    public final int mo85004c(String str, String str2) {
        return Log.d("VivoPush.".concat(String.valueOf(str)), f61129a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: d */
    public final int mo85006d(String str, String str2) {
        if (!C14647p.m85014a()) {
            return -1;
        }
        return Log.i("VivoPush.".concat(String.valueOf(str)), f61129a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: e */
    public final int mo85007e(String str, String str2) {
        if (!C14647p.m85014a()) {
            return -1;
        }
        return Log.v("VivoPush.".concat(String.valueOf(str)), f61129a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: c */
    public final void mo85005c(Context context, String str) {
        if (m84995a()) {
            m84994a(context, str, 2);
        }
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: b */
    public final int mo85001b(String str, String str2) {
        return Log.w("VivoPush.".concat(String.valueOf(str)), f61129a + str2);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: b */
    public final void mo85003b(Context context, String str) {
        if (m84995a()) {
            m84994a(context, str, 1);
        }
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: a */
    public final int mo84998a(String str, Throwable th) {
        return Log.e("VivoPush.".concat(String.valueOf(str)), Log.getStackTraceString(th));
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: a */
    public final int mo84997a(String str, String str2, Throwable th) {
        return Log.e("VivoPush.".concat(String.valueOf(str)), f61129a + str2, th);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: a */
    public final String mo84999a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: a */
    public final void mo85000a(Context context, String str) {
        if (m84995a()) {
            m84994a(context, str, 0);
        }
    }

    @Override // com.vivo.push.util.InterfaceC14646o
    /* JADX INFO: renamed from: a */
    public final int mo84996a(String str, String str2) {
        return Log.e("VivoPush.".concat(String.valueOf(str)), f61129a + str2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m84995a() {
        C14647p.m85014a();
        return C14609a.m84908a().m84910c();
    }
}

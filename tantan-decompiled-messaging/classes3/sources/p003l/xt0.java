package p003l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import l.mkd0;
import l.t95;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xt0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8858a(String str, vo0 vo0Var, WeakReference weakReference, bxe bxeVar) {
        dxe.m3767a(str, bxeVar);
        vo0Var.f8360a.addAll(bxeVar.f2538a);
        vo0Var.m8386b();
        if (NullChecker.a(weakReference)) {
            l4m l4mVar = (l4m) weakReference.get();
            if (NullChecker.a(l4mVar)) {
                l4mVar.mo5972f(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8859b(Throwable th) {
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: d */
    public vo0 m8861d(Context context, final String str, final WeakReference<l4m> weakReference) {
        final vo0 vo0Var = new vo0();
        try {
            bxe bxeVarM3768b = dxe.m3768b(str);
            if (bxeVarM3768b == null) {
                C1099c.fromCallable(new Callable() { // from class: l.ut0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f8091a.m8862e(str);
                    }
                }).compose(mkd0.C()).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.vt0
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        xt0.m8858a(str, vo0Var, weakReference, (bxe) obj);
                    }
                }, new e30() { // from class: l.wt0
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        xt0.m8859b((Throwable) obj);
                    }
                }));
                return vo0Var;
            }
            vo0Var.f8360a.addAll(bxeVarM3768b.f2538a);
            vo0Var.m8386b();
            return vo0Var;
        } catch (Exception e) {
            CrashHelper.c(e);
            return vo0Var;
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public bxe m8862e(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ftf0 ftf0Var = new ftf0();
        bxe bxeVar = new bxe();
        FileInputStream fileInputStream = null;
        try {
            if (yt0.m9228b(str)) {
                FileInputStream fileInputStream2 = new FileInputStream(yt0.m9227a(str));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[100];
                        while (true) {
                            int i = fileInputStream2.read(bArr, 0, 100);
                            if (i <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        ftf0Var.m4419j(byteArrayOutputStream.toByteArray());
                        int iM4415f = ftf0Var.m4415f();
                        ftf0Var.m4420k();
                        for (int i2 = 0; i2 < iM4415f; i2++) {
                            ftf0Var.m4411b();
                            Bitmap bitmapM4418i = ftf0Var.m4418i();
                            uo0 uo0Var = new uo0();
                            uo0Var.f8040a = bitmapM4418i;
                            uo0Var.f8041b = new Rect(0, 0, uo0Var.f8040a.getWidth(), uo0Var.f8040a.getHeight());
                            uo0Var.f8042c = ftf0Var.m4414e(i2);
                            bxeVar.m3201a(uo0Var);
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        try {
                            e.toString();
                        } catch (Throwable th) {
                            th = th;
                            t95.b(fileInputStream);
                            t95.b(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        t95.b(fileInputStream);
                        t95.b(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } else {
                byteArrayOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        t95.b(fileInputStream);
        t95.b(byteArrayOutputStream);
        return bxeVar;
    }
}

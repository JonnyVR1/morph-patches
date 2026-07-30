package p153l;

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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class du0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m117943a(String str, ro0 ro0Var, WeakReference weakReference, fye fyeVar) {
        hye.m137717a(str, fyeVar);
        ro0Var.f164141a.addAll(fyeVar.f101368a);
        ro0Var.m182353b();
        if (NullChecker.m82486a(weakReference)) {
            c7m c7mVar = (c7m) weakReference.get();
            if (NullChecker.m82486a(c7mVar)) {
                c7mVar.mo108308f(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m117944b(Throwable th) {
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: d */
    public ro0 m117946d(Context context, final String str, final WeakReference<c7m> weakReference) {
        final ro0 ro0Var = new ro0();
        try {
            fye fyeVarM137718b = hye.m137718b(str);
            if (fyeVarM137718b == null) {
                C22421c.fromCallable(new Callable() { // from class: l.au0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f73459a.m117947e(str);
                    }
                }).compose(psd0.m173592C()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.bu0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        du0.m117943a(str, ro0Var, weakReference, (fye) obj);
                    }
                }, new y20() { // from class: l.cu0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        du0.m117944b((Throwable) obj);
                    }
                }));
                return ro0Var;
            }
            ro0Var.f164141a.addAll(fyeVarM137718b.f101368a);
            ro0Var.m182353b();
            return ro0Var;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return ro0Var;
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public fye m117947e(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        o1g0 o1g0Var = new o1g0();
        fye fyeVar = new fye();
        FileInputStream fileInputStream = null;
        try {
            if (eu0.m122519b(str)) {
                FileInputStream fileInputStream2 = new FileInputStream(eu0.m122518a(str));
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
                        o1g0Var.m165605j(byteArrayOutputStream.toByteArray());
                        int iM165601f = o1g0Var.m165601f();
                        o1g0Var.m165606k();
                        for (int i2 = 0; i2 < iM165601f; i2++) {
                            o1g0Var.m165597b();
                            Bitmap bitmapM165604i = o1g0Var.m165604i();
                            qo0 qo0Var = new qo0();
                            qo0Var.f158677a = bitmapM165604i;
                            qo0Var.f158678b = new Rect(0, 0, qo0Var.f158677a.getWidth(), qo0Var.f158677a.getHeight());
                            qo0Var.f158679c = o1g0Var.m165600e(i2);
                            fyeVar.m128087a(qo0Var);
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        try {
                            e.toString();
                        } catch (Throwable th) {
                            th = th;
                            ua5.m195158b(fileInputStream);
                            ua5.m195158b(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        ua5.m195158b(fileInputStream);
                        ua5.m195158b(byteArrayOutputStream);
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
        ua5.m195158b(fileInputStream);
        ua5.m195158b(byteArrayOutputStream);
        return fyeVar;
    }
}

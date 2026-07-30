package p149l;

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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class xt0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m210950a(String str, vo0 vo0Var, WeakReference weakReference, bxe bxeVar) {
        dxe.m114003a(str, bxeVar);
        vo0Var.f182325a.addAll(bxeVar.f77784a);
        vo0Var.m199090b();
        if (NullChecker.m81303a(weakReference)) {
            l4m l4mVar = (l4m) weakReference.get();
            if (NullChecker.m81303a(l4mVar)) {
                l4mVar.mo148450f(0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m210951b(Throwable th) {
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: d */
    public vo0 m210953d(Context context, final String str, final WeakReference<l4m> weakReference) {
        final vo0 vo0Var = new vo0();
        try {
            bxe bxeVarM114004b = dxe.m114004b(str);
            if (bxeVarM114004b == null) {
                C22306c.fromCallable(new Callable() { // from class: l.ut0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f178217a.m210954e(str);
                    }
                }).compose(mkd0.m154951C()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.vt0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xt0.m210950a(str, vo0Var, weakReference, (bxe) obj);
                    }
                }, new e30() { // from class: l.wt0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xt0.m210951b((Throwable) obj);
                    }
                }));
                return vo0Var;
            }
            vo0Var.f182325a.addAll(bxeVarM114004b.f77784a);
            vo0Var.m199090b();
            return vo0Var;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return vo0Var;
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public bxe m210954e(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ftf0 ftf0Var = new ftf0();
        bxe bxeVar = new bxe();
        FileInputStream fileInputStream = null;
        try {
            if (yt0.m215993b(str)) {
                FileInputStream fileInputStream2 = new FileInputStream(yt0.m215992a(str));
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
                        ftf0Var.m123047j(byteArrayOutputStream.toByteArray());
                        int iM123043f = ftf0Var.m123043f();
                        ftf0Var.m123048k();
                        for (int i2 = 0; i2 < iM123043f; i2++) {
                            ftf0Var.m123039b();
                            Bitmap bitmapM123046i = ftf0Var.m123046i();
                            uo0 uo0Var = new uo0();
                            uo0Var.f177485a = bitmapM123046i;
                            uo0Var.f177486b = new Rect(0, 0, uo0Var.f177485a.getWidth(), uo0Var.f177485a.getHeight());
                            uo0Var.f177487c = ftf0Var.m123042e(i2);
                            bxeVar.m104313a(uo0Var);
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        try {
                            e.toString();
                        } catch (Throwable th) {
                            th = th;
                            t95.m187604b(fileInputStream);
                            t95.m187604b(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        t95.m187604b(fileInputStream);
                        t95.m187604b(byteArrayOutputStream);
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
        t95.m187604b(fileInputStream);
        t95.m187604b(byteArrayOutputStream);
        return bxeVar;
    }
}

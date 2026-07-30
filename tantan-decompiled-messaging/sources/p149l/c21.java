package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.immomo.mwc.sdk.MWCEngine;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class c21 {

    /* JADX INFO: renamed from: l.c21$a */
    public interface InterfaceC16041a {
        /* JADX INFO: renamed from: a */
        void m104890a(Exception exc);
    }

    /* JADX INFO: renamed from: a */
    public static String m104888a(String str) {
        return m104889b(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #2 {all -> 0x0098, blocks: (B:38:0x0094, B:41:0x009c), top: B:46:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #2 {all -> 0x0098, blocks: (B:38:0x0094, B:41:0x009c), top: B:46:0x0092 }] */
    /* JADX INFO: renamed from: b */
    public static String m104889b(String str, @Nullable InterfaceC16041a interfaceC16041a) throws Throwable {
        InputStream inputStream;
        Closeable closeable;
        BufferedInputStream bufferedInputStream;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream resourceAsStream = str.startsWith("assets:///") ? c21.class.getResourceAsStream("/assets/".concat(str.substring(10))) : MWCEngine.m19383n().getResources().getAssets().open(str);
            try {
                BufferedInputStream bufferedInputStream3 = new BufferedInputStream(resourceAsStream);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int i = bufferedInputStream3.read(bArr);
                            if (i == -1) {
                                String str2 = new String(byteArrayOutputStream.toByteArray());
                                ja5.m140688a(bufferedInputStream3, byteArrayOutputStream, resourceAsStream);
                                return str2;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException e) {
                        inputStream = resourceAsStream;
                        e = e;
                        closeable2 = byteArrayOutputStream;
                        bufferedInputStream = bufferedInputStream3;
                        try {
                            if (interfaceC16041a == null) {
                                e.printStackTrace();
                            } else {
                                interfaceC16041a.m104890a(e);
                            }
                            ja5.m140688a(bufferedInputStream, closeable2, inputStream);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            closeable = closeable2;
                            ja5.m140688a(bufferedInputStream2, closeable, inputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = bufferedInputStream3;
                        inputStream = resourceAsStream;
                        th = th;
                        closeable = byteArrayOutputStream;
                        ja5.m140688a(bufferedInputStream2, closeable, inputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    inputStream = resourceAsStream;
                    e = e2;
                    bufferedInputStream = bufferedInputStream3;
                    closeable2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } catch (IOException e3) {
                inputStream = resourceAsStream;
                e = e3;
                bufferedInputStream = null;
                closeable2 = bufferedInputStream;
                if (interfaceC16041a == null) {
                    e.printStackTrace();
                } else {
                    interfaceC16041a.m104890a(e);
                }
                ja5.m140688a(bufferedInputStream, closeable2, inputStream);
                return null;
            } catch (Throwable th4) {
                inputStream = resourceAsStream;
                th = th4;
                closeable = null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStream = null;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            closeable = null;
        }
    }
}
